package sn.edu.isep.GestionProfesseur.controller;


import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
    public class ProfesseurController {

        //on passe par les PathVariable
        @GetMapping(value = "/home/nom/{nom}/age/{age}/{matiere}")
        public String getHome(Model model,
                              @PathVariable String nom,
                              @PathVariable int age,
                              @PathVariable String matiere){
            String message = "Bienvenue " + nom + ", âgé de " + age + " ans, enseignant en " + matiere + ", dans la classe des experts Spring !";
            model.addAttribute("message", message);
            model.addAttribute("nom", nom);
            model.addAttribute("age", age);
            model.addAttribute("matiere", matiere);


            return "home";
        }

        //on passe par les RequestParam
        @RequestMapping(value = "/infos")
        public String getInfos(Model model,
                               @RequestParam("nom") String name,
                               @RequestParam("age") String years,
                               @RequestParam("matiere") String subject){
            String title = "Infos de l'école – Directeur : " + name + ", Âge : " + years + ", Matière : " + subject;

            String content = "Numeros utiles: 33 800 00 00 ";
            model.addAttribute("titre", title);
            model.addAttribute("content", content);



            return "infos";
        }
    }


