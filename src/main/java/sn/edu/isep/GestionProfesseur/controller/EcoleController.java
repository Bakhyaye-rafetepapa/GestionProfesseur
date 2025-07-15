package sn.edu.isep.GestionProfesseur.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.edu.isep.GestionProfesseur.service.EcoleJpaService;

@RequestMapping("/api/v1")
@RestController
public class EcoleController {
        @Autowired
        private EcoleJpaService ecoleJpaService;
        @GetMapping("/ecole/{id}")
        public ResponseEntity<EcoleDTO> getOneEcole(@PathVariable Integer id) {
            EcoleDTO ecoleDTO = ecoleJpaService.getOneEcole(id);
            return ecoleDTO.getEcole()!=null?ResponseEntity.status(HttpStatus.OK).body(ecoleDTO) : ResponseEntity.status(404).body(ecoleDTO);

        }

    }


