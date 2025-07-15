package sn.edu.isep.GestionProfesseur.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.edu.isep.GestionProfesseur.controller.EcoleDTO;
import sn.edu.isep.GestionProfesseur.domaine.Ecole;
import sn.edu.isep.GestionProfesseur.repositories.EcoleRepository;

@Service
   public class EcoleService {

        @Autowired
        EcoleRepository ecoleRepository;
        public EcoleDTO getOneEcole(int id, String userAgent) {

            EcoleDTO ecoleDTO = new EcoleDTO();
            Ecole ecole = ecoleRepository.findEcoleFromId(1);
            if (null != ecole) {
                ecoleDTO.setEcole(ecole);
                ecoleDTO.setMessage("Bienvenue client " + userAgent + "\n Ecole " + id + " trouve avec succes !");

            } else {
                ecoleDTO.setMessage("Ecole " + id + " non trouvée !!");

            }
            return ecoleDTO;
        }
    }



