package morse;

public class Morse {


    /*
            z.B. konvertiert ".----" zu 6
     */
    public int decode(String morseCode) {
        if (morseCode.equals("-----")) {
            return 0;
        } else if (morseCode.equals(".----")) {
            return 1;
        } else if (morseCode.equals("..---")) {
            return 2;
        } else if (morseCode.equals("...--")) {
            return 3;
        } else if (morseCode.equals("....-")) {
            return 4;
        } else if (morseCode.equals(".....")) {
            return 5;
        } else if (morseCode.equals("-....")) {
            return 6;
        } else if (morseCode.equals("--...")) {
            return 7;
        } else if (morseCode.equals("---..")) {
            return 8;
        } else if (morseCode.equals("----.")) {
            return 9;
        }
        return -1;
    }

}
