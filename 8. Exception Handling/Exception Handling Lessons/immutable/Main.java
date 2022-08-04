public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ryan", "Canadian"); // Mutable or Immutable?
        Person person2 = new Person("John", "America");											// Immutable because no setters
        System.out.println(person);
        System.out.println(person2);
        
    }
}
