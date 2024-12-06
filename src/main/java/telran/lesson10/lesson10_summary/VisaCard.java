package telran.lesson10.lesson10_summary;

public class VisaCard extends Card {

    private int visaId;

    public VisaCard(int visaId) {
        this.visaId = visaId;
    }

    public int getVisaId() {
        return visaId;
    }

    public int getCardId() {
        return visaId;
    }

    @Override
    public String toString() {
        return "VisaCard{" +
                "visaId=" + visaId +
                '}';
    }
}
