package tech.bts.javaexamples.suspects;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuspectAnalyzerTest {

    @Test
    public void no_match_if_different_sex() {

        Suspect s1 = new Suspect.Builder()
                .name("Alex").eyeColor("brown").hairColor("black")
                .age(30).height(180).weight(80)
                .male(true)
                .build();

        Suspect s2 = new Suspect.Builder()
                .name("Alex").eyeColor("brown").hairColor("black")
                .age(30).height(180).weight(80)
                .male(false)
                .build();

        SuspectAnalyzer analyzer = new SuspectAnalyzer();
        boolean result = analyzer.match(s1, s2);

        // These are equivalent
        assertFalse(result);
        assertEquals(false, result);
    }

    @Test
    public void match_if_same_values() {

        Suspect s1 = new Suspect.Builder()
                .name("Alex").eyeColor("brown").hairColor("black")
                .age(30).height(180).weight(80)
                .male(true)
                .build();

        Suspect s2 = new Suspect.Builder()
                .name("Alex").eyeColor("brown").hairColor("black")
                .age(30).height(180).weight(80)
                .male(true)
                .build();

        SuspectAnalyzer analyzer = new SuspectAnalyzer();
        boolean result = analyzer.match(s1, s2);

        // These are equivalent
        assertTrue(result);
        assertEquals(true, result);
    }

    @Test
    public void match_if_same_important_values_are_the_same() {

        Suspect s1 = new Suspect.Builder()
                .name("Alex").eyeColor("blue").hairColor("blonde")
                .age(30).height(180).weight(80)
                .male(true)
                .build();

        Suspect s2 = new Suspect.Builder()
                .name("Alex").eyeColor("brown").hairColor("black")
                .age(30).height(180).weight(80)
                .male(true)
                .build();

        SuspectAnalyzer analyzer = new SuspectAnalyzer();
        assertTrue(analyzer.match(s1, s2));
    }

}