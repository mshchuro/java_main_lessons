package Homework_1.Alphabet;

public class EngAlphabet extends Alphabet {

    private char[] EngAlphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private int ownNumber;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void printAlphabet() {
        super.printAlphabet();
        for (char letter : EngAlphabet) {
            System.out.print(letter + " ");
        }
    }
}
