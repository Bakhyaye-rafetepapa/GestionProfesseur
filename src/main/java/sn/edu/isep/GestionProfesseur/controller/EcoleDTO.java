package sn.edu.isep.GestionProfesseur.controller;

import sn.edu.isep.GestionProfesseur.domaine.Ecole;

public class EcoleDTO {
    Ecole ecole;
    String message;


    public Ecole getEcole() {
        return ecole;
    }

    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}

