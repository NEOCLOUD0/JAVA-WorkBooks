public class Die {
	
    private int number;

    // constructor to assign a random number from 1 through 6
    public Die() {
        number = (int) (Math.random() * 6 + 1);
    }

    // roll the die, assigning it a new number
    public void roll() {
        number = (int) (Math.random() * 6 + 1);
    }

    // return die number 
    public int getNumber() {
        return number;
    }
}