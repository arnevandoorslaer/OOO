package domain;

public class RandomAdapter implements CodeerGedrag{
    RandomCypher c = new RandomCypher();
    public String Codeer(String zin){
        return String.copyValueOf(c.encypher(zin.toLowerCase().toCharArray()));
    }
    public String Decodeer(String zin){
        return String.copyValueOf(c.decypher(zin.toLowerCase().toCharArray()));
    }
}
