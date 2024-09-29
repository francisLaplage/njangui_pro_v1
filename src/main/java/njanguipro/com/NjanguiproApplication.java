package njanguipro.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.transaction.Transactional;
import njanguipro.com.controler.MembreControler;
import njanguipro.com.entitie.Membre;
import njanguipro.com.repository.MembreRepository;

@Transactional
@SpringBootApplication
public class NjanguiproApplication implements CommandLineRunner{
	
	@Autowired
	MembreRepository membreRepository;
	@Autowired
	MembreControler controler;

	public static void main(String[] args) {
		SpringApplication.run(NjanguiproApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.controler.createMembre(new Membre(0,"Simpson","Bart","rue de Picpus 112, 75012 Paris","0492418121","bart.jpg", null, null, null, 0,"sbart@phoenix.com","2024@phoenix","membre"));
		this.controler.createMembre(new Membre(0,"Simpson","Lisa","rue de Picpus 112, 75012 Paris","0492418122","lisa.jpg", null, null, null, 0,"slisa@phoenix.com","2024@phoenix","membre"));
		this.controler.createMembre(new Membre(0,"Simpson","Omer","rue de Picpus 112, 75012 Paris","0492418123","omer.jpg","Simpson","Louise", null, 0,"somer@phoenix.com","2024@phoenix","membre"));
	}
}
