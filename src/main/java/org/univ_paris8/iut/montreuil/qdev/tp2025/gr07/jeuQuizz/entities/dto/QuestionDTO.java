package org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entities.dto;

public class QuestionDTO {

    private int num;
    private String langue;
    private String libelle;
    private String reponse;
    private int difficulte;
    private String explication;
    private String ref;

    public QuestionDTO(int num,String libelle, String reponse, int difficulte, String explication, String ref) {
        this.num = num;
        this.langue = libelle;
        this.reponse = reponse;
        this.difficulte = difficulte;
        this.explication = explication;
        this.ref = ref;
    }


}
