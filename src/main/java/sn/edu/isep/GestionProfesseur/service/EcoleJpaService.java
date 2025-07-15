package sn.edu.isep.GestionProfesseur.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.edu.isep.GestionProfesseur.controller.EcoleDTO;
import sn.edu.isep.GestionProfesseur.domaine.Ecole;
import sn.edu.isep.GestionProfesseur.repositories.EcoleJpaRepository;

import java.util.Optional;

@Service
    public class EcoleJpaService {
        @Autowired

        EcoleJpaRepository ecoleJpaRepository;

        public EcoleDTO getOneEcole(Integer id) {
            EcoleDTO ecoleDTO = new EcoleDTO();
            Optional<Ecole> ecole = ecoleJpaRepository.findById(id);
            if(ecole.isPresent()) {
                ecoleDTO.setEcole(ecole.get());
                ecoleDTO.setMessage("ecole"+id+"trouvée avec succées");

            }
            else{
                ecoleDTO.setMessage("ecole"+id+"non trouvé");
            }
            return ecoleDTO;
        }

    }


