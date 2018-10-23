package domain.model;

import java.util.Random;

public class Dobbelsteen {

    public Dobbelsteen(){

    }
    public static int werp() {
        return new Random().nextInt(6)+1;
    }

}