package com.dwtech;

public class IRUtil {

    public static int getFrequencyCount(String term, String doc) {
        String lowerTerm = term.toLowerCase();
        String lowerDoc = doc.toLowerCase();

        int frequencyCount = 0;
        int index = doc.indexOf(term);

        while (index >= 0) {
            frequencyCount += 1;
            doc = doc.substring(index + term.length(), doc.length());
            index = doc.indexOf(term);
        }

        return frequencyCount;
    }

    public static double termFrequency(String term, String doc){

        int frequencyCount = getFrequencyCount(term,doc);
        double totalTermCount = doc.split(" ").length;

        return frequencyCount/totalTermCount;
    }

}
