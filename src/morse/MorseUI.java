package morse;

public class MorseUI {


    public static void main(String[] args) {
        Morse decoder = new Morse();
        System.out.println(decoder.decode("...--"));

        MorseBetter betterDecoder = new MorseBetter();
        System.out.println(betterDecoder.decode("...--"));
    }
}
