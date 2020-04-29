package Creational.AbstractFactoryPattern;

//AbstractProduct
public class CreditCard {
    protected int cardNumLength;
    protected int cscNumber;

    public int getCardNumLength() {
        return cardNumLength;
    }
    public int getCscNumber() {
        return cscNumber;
    }

    public void setCardNumLength(int cardNumLength) {
        this.cardNumLength = cardNumLength;
    }
    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
