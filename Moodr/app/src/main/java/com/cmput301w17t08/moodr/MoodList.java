package com.cmput301w17t08.moodr;

import java.util.ArrayList;

/**
 *
 * The superclass of the MoodLists. This class holds the necessary functions to add and delete
 * moods on the list.
 */
public class MoodList {

    private ArrayList<Mood> listOfMoods = new ArrayList<Mood>();

    public void add(Mood mood){
        if(listOfMoods.contains(mood)){
            throw new IllegalArgumentException();
        }
        else {
            listOfMoods.add(mood);
        }
    }

    public void delete(Mood mood){
        listOfMoods.remove(mood);
    }

    public Mood getMood(int index){
        return listOfMoods.get(index);
    }

    public void setListOfMoods (ArrayList<Mood> listOfMoods){
        this.listOfMoods = listOfMoods;
    }

    public ArrayList<Mood> getListOfMoods(){
        return this.listOfMoods;
    }
}
