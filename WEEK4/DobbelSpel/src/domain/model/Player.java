package domain.model;

public class Player {

    private static final int WORPEN = 2;
    private int score;
    private int[] rolls;
    private String name;

    public Player() {
        this.rolls = new int[8];
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        int res = 0;
        for (int i = 0; i < rolls.length; i++) {
            res += rolls[i];
        }
        return res;
    }

    public int[] getRolls() {
        return this.rolls;
    }

    public void addRoll(int roll) {
        for (int i = 0; i < this.rolls.length; i++) {
            if (rolls[i] == 0) {
                rolls[i] = roll;
                break;
            }
        }
    }

    public void werp() {

        for (int i = 0; i < this.WORPEN; i++) {
            addRoll(Dobbelsteen.werp());
        }

    }
}