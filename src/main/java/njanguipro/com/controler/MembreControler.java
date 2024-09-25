package njanguipro.com.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import njanguipro.com.entitie.Membre;
import njanguipro.com.repository.MembreRepository;

@RestController
public class MembreControler {
	
	@Autowired
	private MembreRepository membreRepository;
	
	@GetMapping("/membres")
	public ResponseEntity<List<Membre>> getAllMembre() {
		List<Membre> listeMemebre = this.membreRepository.findAll();
		return ResponseEntity.ok(listeMemebre);
	}

}
