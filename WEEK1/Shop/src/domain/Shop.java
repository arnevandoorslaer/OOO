package domain;
import java.util.*;

public class Shop {
     private Map<Integer,Product> producten;

     public Shop(){
         producten = new HashMap<>();
     }

     public void addProduct(Product p){
         if(producten.containsKey(p.getId())){
             throw new IllegalArgumentException("id bestaat al");
         }
         producten.put(p.getId(),p);
     }

     public Product getProduct(int id){
         if(!producten.containsKey(id)){
             throw new IllegalArgumentException("geen product met dit id");
         }
         return producten.get(id);
     }

    public String toString() {
         String res = "";
        Iterator it = producten.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            res += pair.getKey() + " - " + pair.getValue() + "\n";
            it.remove(); // avoids a ConcurrentModificationException
        }
        return res;
    }

     public int getHighestKey(){
         if(producten.isEmpty()){
             return -1;
         }
         return Collections.max(producten.keySet());
     }


}
