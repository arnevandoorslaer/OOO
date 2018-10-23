package domain.model;

import java.util.Random;

public class Dobbelsteen {

    public int werp() {
        return new Random().nextInt(6)+1;
    }

}
