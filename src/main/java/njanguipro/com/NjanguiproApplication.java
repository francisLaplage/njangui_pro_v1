package njanguipro.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;
import njanguipro.com.entitie.Membre;
import njanguipro.com.repository.MembreRepository;

@Transactional
@SpringBootApplication
public class NjanguiproApplication implements CommandLineRunner{
	
	@Autowired
	MembreRepository membreRepository;

	public static void main(String[] args) {
		SpringApplication.run(NjanguiproApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.membreRepository.save(new Membre(0,"Simpson","Bart"));
		this.membreRepository.save(new Membre(0,"Simpson","Bart"));
		this.membreRepository.save(new Membre(0,"Simpson","Bart"));
		
	}
}
