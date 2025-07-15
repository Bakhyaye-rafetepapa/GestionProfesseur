package sn.edu.isep.GestionProfesseur.config;


import jakarta.persistence.criteria.CriteriaBuilder;
import sn.edu.isep.GestionProfesseur.domaine.Professeur;






import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sn.edu.isep.GestionProfesseur.domaine.Professeur;

        @Configuration
        public class Myconfig {

            @Value("${professeur1.id}")
            private Integer id1;
            @Value("${professeur1.prenom}")
            private String prenom1;
            @Value("${professeur1.nom}")
            private String nom1;
            @Value("${professeur1.adresse}")
            private String adresse1;
            @Value("${professeur1.age}")
            private int age1;
            @Value("${professeur1.matiere}")
            private String matiere1;

            @Value("${professeur2.id}")
            private Integer id2;
            @Value("${professeur2.prenom}")
            private String prenom2;
            @Value("${professeur2.nom}")
            private String nom2;
            @Value("${professeur2.adresse}")
            private String adresse2;
            @Value("${professeur2.age}")
            private int age2;
            @Value("${professeur2.matiere}")
            private String matiere2;

            @Value("${professeur3.id}")
            private Integer id3;
            @Value("${professeur3.prenom}")
            private String prenom3;
            @Value("${professeur3.nom}")
            private String nom3;
            @Value("${professeur3.adresse}")
            private String adresse3;
            @Value("${professeur3.age}")
            private int age3;
            @Value("${professeur3.matiere}")
            private String matiere3;


            @Bean(name = "Isep")
            public Professeur professeur (){
                Professeur professeur = new Professeur();
                professeur.setId(1);
                professeur.setPrenom(prenom1);
                professeur.setNom(nom1);
                professeur.setAdresse(adresse1);
                professeur.setAge(age1);
                professeur.setMatiere(matiere1);
                return professeur;
            }


            @Bean(name = "prof2")
            public Professeur unAutreEtudiant(){
                Professeur professeur = new Professeur();
                professeur.setId(2);
                professeur.setPrenom(prenom2);
                professeur.setNom(nom2);
                professeur.setAdresse(adresse2);
                professeur.setAge(age2);
                professeur.setMatiere(matiere2);
                return professeur;
            }

            @Bean
            // @Primary
            public Professeur unProfesseurDbe(){
                Professeur professeur = new Professeur();
                professeur.setId(3);
                professeur.setPrenom(prenom3);
                professeur.setNom(nom3);
                professeur.setAdresse(adresse3);
                professeur.setAge(age3);
                professeur.setMatiere(matiere3);
                return professeur;
            }
        }


