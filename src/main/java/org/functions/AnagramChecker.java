package org.functions;

import java.util.Arrays;

public class AnagramChecker {

    private boolean areAnagram(char[] firstWord, char[] secondWord) {
        int first = firstWord.length;
        int second = secondWord.length;

        if (first!= second)
            return false;

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        for (int i=0; i<first; i++)
            if (firstWord[i] != secondWord[i])
                return false;

        return true;
    }

}