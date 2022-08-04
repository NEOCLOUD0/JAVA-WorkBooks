public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000); //Mutable or Immutable?
        car.setMake("Honda"); 				//Mutable because it has setters
        Car car2 = car;
        car2.setPrice(8000);
        
        System.out.println(car);
        System.out.println(car2);
    }
}
