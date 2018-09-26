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


}
