package com.codeclan.eightball;
import org.junit.*;                     // gives access

import java.util.ArrayList;

import static org.junit.Assert.*;       // get assertEquals() method, use without path


/**
 * Created by user on 13/03/2017.
 */

public class AnswersTest {

    ArrayList<String> testAnswers;

    @Before
    public void before(){
        testAnswers = new ArrayList<String>();
        testAnswers.add("Yes");
        testAnswers.add("That would be an ecumenical matter");
    }

    @Test
    public void getAnswersTest() {
        Answers answers = new Answers();
        assertNotNull(answers.getAnswers());
    }

    @Test
    public void testSetUpAnswers(){
        Answers answers = new Answers();
        assertEquals(2, answers.getLength());
    }

    @Test
    public void createAnswersWithListTest() {
        Answers answers = new Answers(testAnswers);
        assertEquals(2, answers.getLength());
    }

    @Test
    public void addTest() {
        Answers answers = new Answers();
        int originalNumberOfAnswers = answers.getLength();
        answers.add("no No NO NOO NOOOOOOOOO!");

        assertEquals(originalNumberOfAnswers + 1, answers.getLength());
    }

    @Test
    public void getAnswerAtIndexTest(){
        Answers answers = new Answers(testAnswers);
        String result = answers.getAnswerAtIndex(0);
        assertEquals("Yes", result);
    }

    @Test
    public void getAnswerTest() {
        Answers answers = new Answers(testAnswers);

        String answer = answers.getAnswer();

        System.out.println("getAnswerTest. Answer: " + answer);
        assertNotNull(answer);
    }
}
