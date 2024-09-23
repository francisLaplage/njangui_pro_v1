package njanguipro.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import njanguipro.com.entitie.Membre;

@Repository
public interface MembreRepository  extends JpaRepository<Membre, Integer>{

}
