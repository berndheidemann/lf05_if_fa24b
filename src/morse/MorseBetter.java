package morse;

import java.util.HashMap;

public class MorseBetter {


    /*
            z.B. konvertiert ".----" zu 6
     */
    public int decode(String morseCode) {
        HashMap<String, Integer> morseAlphabet = new HashMap();
        morseAlphabet.put("-----", 0);
        morseAlphabet.put(".----", 1);
        morseAlphabet.put("..---", 2);
        morseAlphabet.put("...--", 3);
        morseAlphabet.put("....-", 4);
        morseAlphabet.put(".....", 5);
        morseAlphabet.put("-....", 6);
        morseAlphabet.put("--...", 7);
        morseAlphabet.put("---..", 8);
        morseAlphabet.put("----.", 9);
        return morseAlphabet.get(morseCode);
    }
}
