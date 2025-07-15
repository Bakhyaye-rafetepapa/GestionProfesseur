package sn.edu.isep.GestionProfesseur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isep.GestionProfesseur.domaine.Professeur;

public interface ProfesseurRepository  extends JpaRepository<Professeur, Integer> {
}
