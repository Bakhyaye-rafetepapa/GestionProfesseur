package sn.edu.isep.GestionProfesseur.domaine;

public class Professeur {
        private Integer id;
        private String prenom;
        private String nom;
        private String adresse;
        private int age;
        private String matiere;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }



        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getAdresse() {
            return adresse;
        }

        public void setAdresse(String adresse) {
            this.adresse = adresse;
        }

        @Override
        public String toString() {
            return "je suis l'ensegnant: "
                    + id + " repondant au nom de:"
                    + prenom
                    + " " + nom
                    + " habitant: " + adresse
                    + "matiere" + matiere;
        }
    }


