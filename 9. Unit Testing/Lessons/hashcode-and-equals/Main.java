import java.util.HashMap;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2016);
        System.out.println("Nissan: " + nissan.hashCode());
        
        Car dodge = new Car("Dodge", 2018);
        System.out.println("Dodge: " + nissan.hashCode());
        
        Car toyota = new Car("Toyota", 2016);
        System.out.println("Toyota: " + nissan.hashCode());
        
        Car nissan2 = new Car(nissan);
        System.out.println("Nissan: " + nissan2.hashCode());

        HashMap<Car, Double> prices = new HashMap<Car, Double>();
        prices.put(nissan, 5000.0);
        prices.put(dodge, 6000.0);
        prices.put(toyota, 7000.0);
        
        nissan.equals(nissan2);
        System.out.println(prices.get(nissan2));
    }
}
