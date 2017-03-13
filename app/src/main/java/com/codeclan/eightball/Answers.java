package com.codeclan.eightball;

import java.util.ArrayList;
import java.util.Random;


/**
 * Created by user on 13/03/2017.
 */

public class Answers implements Answerable {

    private ArrayList<String> answers;

    public Answers() {
        answers = new ArrayList<String>();
        this.setupAnswers();
    }

    public Answers(ArrayList<String> answersList){
        answers = answersList;
        // answers = new ArrayList<String>(answers);  // equivalent
    }

    public ArrayList<String> getAnswers() {
        return new ArrayList<String>(answers);      // returns a new copy of the ArrayList for client to manipulate (e.g.e delete all),
                                                    // preserving the answers ArrayList in this class.
    }

    public int getLength() {
        return answers.size();
    }
    public void setupAnswers(){
        this.answers.add("Yes");
        this.answers.add("Have you considered this carefully enough");
    }


    public void add(String newAnswer) {
        this.answers.add(newAnswer);
    }

    public String getAnswerAtIndex(int index) {
        return answers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int  n = rand.nextInt(this.getLength());   // randomly returns 0,1 for length 2, which is correct for indexing purposes
        return getAnswerAtIndex(n);
    }
}
