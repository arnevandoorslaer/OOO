package domain.model;

public class Spel {

    private Player[] players;
    private int[] scores;

    public Spel(int aantal){
        //voeg alle players toe
        players = new Player[aantal];
        for(int i=0; i<players.length; i++) {
            players[i] = new Player();
        }
        //maak lege array met score
        scores = new int[aantal];
    }

    public void werp(int playernummer){
        scores[playernummer] =
                players[playernummer].werp();

    }

    public int[] getWinner(){
        int highest = -1;
        int playernummer = -1;

        for(int i = 0;i<players.length;i++){
            if(getPlayerScore(i) > highest){
                highest = getPlayerScore(i);
                playernummer = i;
            }
        }
        int[] res = new int[2];
        res[0] = playernummer;
        res[1] = highest;
        return res;
    }

    public int getPlayerScore(int playernummer){
        return players[playernummer].getScore();
    }
}
