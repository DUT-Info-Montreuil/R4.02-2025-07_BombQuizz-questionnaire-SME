package org.univ_paris8.iut.montreuil.qdev.tp2025.gr07.jeuQuizz.entities.dto;

import java.util.List;

public class QuestionnaireDTO {

    public static int cpt=0;
    private int id;
    List<QuestionDTO> questions;

    public QuestionnaireDTO(List<QuestionDTO> questions) {
        this.id = ++cpt;
        this.questions = questions;
    }




}
