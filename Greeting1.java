public class Greeting1 {

    public String greet(String name){
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {

        Greeting g = new Greeting();
        String message = g.greet("Rakshitha");

        System.out.println(message);
    }
}
