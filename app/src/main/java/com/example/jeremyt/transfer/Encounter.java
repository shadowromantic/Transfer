package com.example.jeremyt.transfer;

/**
 * Created by rck on 4/17/2015.
 */
enum EncounterType{PUPPY_PLAY,SUBMISSIVE_TRICKS,PUNISHMENT,BONDAGE,DOMINATION,INTRO,OFFICE_GAMES,PONY_PLAY,CLASSROOM_GAMES};

//Jeremy: add new encounterTypes above with commas between.
public class Encounter {
    String description, title;
    boolean used = false;
    EncounterType encounterType;

    public Encounter ( String title, String description, EncounterType encounterType){
        this.title = title;
        this.description = description;
        this.encounterType = encounterType;
    }
}
