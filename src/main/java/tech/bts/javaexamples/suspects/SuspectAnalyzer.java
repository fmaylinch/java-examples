package tech.bts.javaexamples.suspects;

/**
 * In this exercise, we want to develop a very simple AI software to catch criminals.
 *
 * This AI system will be called Criminal Hunt Artificial Intelligence (C.H.A.I.). 🕵️
 *
 * To develop this software, create a new Maven project and define a class called Suspect, that will have some data of a criminal:
 *
 * name
 * age
 * height (cm)
 * weight (kg)
 * hair color
 * eye color
 * male (boolean)
 *
 * Then, define a class SuspectAnalyser with a method match that takes 2 suspects and returns true if it guesses that the 2 suspects are the same.
 *
 * To tell if the 2 suspects are the same, the match method does the following:
 *
 * - If gender (male) doesn't match, then we are sure the suspects are not the same.
 *
 * - For the other fields, we will count some points to guess if the suspects are the same:
 * if the name is the same, add 1 point (better if you consider "peter" and "Peter" to be the same)
 * if the difference of ages is 1 or less, add 1 point
 * if the difference of heights is 2 or less, add 1 point
 * if the difference of weights is 5 or less, add 1 point
 * if hair color is the same, add 1 point
 * if eye color is the same, add 1 point
 *
 * After adding all points, if you have 5 or more, then the suspects are the same
 *
 * If point count is 4 but name, age, height and weight is the same, then the suspects are the same (no matter the hair and eye color, which can be easily changed)
 *
 *
 * Develop this SuspectAnalyser class and some tests. Think of different suspect combinations:
 *
 * Equal suspects -> match
 * Very similar suspects -> match
 * Quite similar suspect -> can be match or not, create both scenarios
 * Completely different suspects -> no match
 * Case where the suspect just changed hair and eye color -> match
 */
public class SuspectAnalyzer {

    public boolean match(Suspect s1, Suspect s2) {

        if (s1.isMale() != s2.isMale()) {
            return false;
        }

        int points = 0;

        if (s1.getName().equalsIgnoreCase(s2.getName())) {
            points++;
        }

        if (Math.abs(s1.getAge() - s2.getAge()) <= 1) {
            points++;
        }

        if (Math.abs(s1.getHeight() - s2.getHeight()) <= 2) {
            points++;
        }

        if (Math.abs(s1.getWeight() - s2.getWeight()) <= 5) {
            points++;
        }

        if (s1.getEyeColor().equalsIgnoreCase(s2.getEyeColor())) {
            points++;
        }

        if (s1.getHairColor().equalsIgnoreCase(s2.getHairColor())) {
            points++;
        }

        if (points >= 5) {
            return true;
        } else if (points == 4
                && s1.getName().equalsIgnoreCase(s2.getName())
                && s1.getAge() == s2.getAge()
                && s1.getWeight() == s2.getWeight()
                && s1.getHeight() == s2.getHeight()) {
            return true;
        } else {
            return false;
        }
    }
}