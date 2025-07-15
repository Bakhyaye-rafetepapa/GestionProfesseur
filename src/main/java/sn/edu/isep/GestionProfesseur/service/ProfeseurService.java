package sn.edu.isep.GestionProfesseur.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import sn.edu.isep.GestionProfesseur.domaine.Professeur;
import sn.edu.isep.GestionProfesseur.repositories.ProfesseurRepository;

@Service
    public class ProfeseurService {

        @Autowired
        ProfesseurRepository professeurRepository;

        public Page<Professeur> getProfesseurs(int page, int size) {
            PageRequest pageable = PageRequest.of(page, size, Sort.by("nom").ascending());
            return professeurRepository.findAll(pageable);
        }

    }


