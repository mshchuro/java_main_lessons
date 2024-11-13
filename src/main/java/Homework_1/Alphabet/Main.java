package Homework_1.Alphabet;

public class Main {
    public static void main(String[] args) {

        EngAlphabet englishAlphabet = new EngAlphabet();
        englishAlphabet.setName("English Alphabet");
        englishAlphabet.setOwnNumber(26);

        RuAlphabet russianAlphabet = new RuAlphabet();
        russianAlphabet.setName("Russian Alphabet");
        russianAlphabet.setOwnNumber(33);

        GreekAlphabet greekAlphabet = new GreekAlphabet();
        greekAlphabet.setName("Greek Alphabet");
        greekAlphabet.setOwnNumber(24);

        englishAlphabet.printAlphabet();
        russianAlphabet.printAlphabet();
        greekAlphabet.printAlphabet();

        Alphabet[] alphabets = {englishAlphabet, russianAlphabet, greekAlphabet};
        printAllInfo(alphabets);
    }

        public static void printAllInfo (Alphabet[]alphabets){
            for (Alphabet alphabet : alphabets) {
                alphabet.printAlphabet();
            }
        }
}

