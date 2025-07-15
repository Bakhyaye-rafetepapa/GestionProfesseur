package sn.edu.isep.GestionProfesseur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isep.GestionProfesseur.domaine.Ecole;

import java.util.Optional;

public interface EcoleJpaRepository extends JpaRepository<Ecole, Long> {

    Optional<Ecole> findById(long id);

}
