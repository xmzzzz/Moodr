package com.cmput301w17t08.moodr;

import java.util.ArrayList;

/**
 *
 * When offline the app will place any new added/edited/deleted moods onto an array stored within
 * the device storage. When the device goes back online, this list is compared with the list
 * on elasticsearch and changes are made accordingly.
 *
 */

public class OfflineMode {

    /**
     * 1 is Add
     * 2 is Edit
     * 3 is Delete
     */
    private ArrayList<Integer> allActions;
    private ArrayList<Mood> correspondingMood;


    public OfflineMode() {
        allActions = new ArrayList<Integer>();
        correspondingMood = new ArrayList<Mood>();
    }

    public ArrayList<Integer> getAllActions() {
        return allActions;
    }

    public void setAllActions(ArrayList<Integer> allActions) {
        this.allActions = allActions;
    }

    public ArrayList<Mood> getCorrespondingMood() {
        return correspondingMood;
    }

    public void setCorrespondingMood(ArrayList<Mood> correspondingMood) {
        this.correspondingMood = correspondingMood;
    }

    public void addAction(Integer i, Mood mood) {
        allActions.add(i);
        correspondingMood.add(mood);
    }

    public void popFirstAction() {
        allActions.remove(0);
        correspondingMood.remove(0);
    }

    public void reset() {
        allActions.clear();
        correspondingMood.clear();
    }
}