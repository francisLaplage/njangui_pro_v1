package njanguipro.com.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import njanguipro.com.entitie.Membre;
import njanguipro.com.repository.MembreRepository;

@CrossOrigin(origins = {"http://phoenixawsbucket.s3-website.eu-west-3.amazonaws.com/","http://localhost:4200/"})
@Transactional
@RestController
@RequestMapping("/api")
public class MembreControler {
	
	@Autowired
	private MembreRepository membreRepository;
	
	@GetMapping("/membres")
	public ResponseEntity<List<Membre>> getAllMembre() {
		List<Membre> listeMemebre = this.membreRepository.findAll();
			return ResponseEntity.ok(listeMemebre);
	}
	@GetMapping("/membres/{id}")
	public Optional<Membre> getMembreByID(@PathVariable int id){
		System.out.println("id =  " + id);
		return this.membreRepository.findById(id);	
	}
	@PostMapping("/membres/add")
	public ResponseEntity<Membre> createMembre(@RequestBody Membre membre){
		Membre mem = this.membreRepository.save(membre);
			return ResponseEntity.ok(mem);
	}
	@DeleteMapping("/membres/del")
	public void deleteMembre(@RequestBody Membre membre) {
		this.membreRepository.delete(membre);	
	}
	@PutMapping("/membres/update")
	public ResponseEntity<Membre> updateMembre(@RequestBody Membre membre){
		Membre mem = this.membreRepository.save(membre);
			return ResponseEntity.ok(mem);
	}
}
