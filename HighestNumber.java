public class HighestNumber {

    public int findHighest(int a, int b, int c){

        if(a >= b && a >= c)
            return a;
        else if(b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {

        HighestNumber obj = new HighestNumber();

        int highest = obj.findHighest(10,25,15);

        System.out.println("Highest number is: " + highest);
    }
}
