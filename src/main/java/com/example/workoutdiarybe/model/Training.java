package com.example.workoutdiarybe.model;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Training {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private List<String> exercieses;//diventerà lista di oggetti esercizio
    private int durata;//base no recorded data, calcolata sulla media del tempo delle sessioni svolte
    private String level;//livello raggiunto dall'utente per quell'allenamento(forse in percentuale) o numerico o ...
    private int target;//obbiettivo da raggiungere nell'allenamento
    
    public Training() {
    }

    public Training(Long id, String name, List<String> exercieses, int durata, String level, int target) {
        this.id = id;
        this.name = name;
        this.exercieses = exercieses;
        this.durata = durata;
        this.level = level;
        this.target = target;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getExercieses() {
        return exercieses;
    }

    public void setExercieses(List<String> exercieses) {
        this.exercieses = exercieses;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    

    

}
