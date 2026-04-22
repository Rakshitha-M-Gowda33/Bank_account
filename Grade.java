public class Grade {

    static char func(double avg){
        if(avg>=90) return 'A';
        else if(avg>=80) return 'B';
        else if(avg>=70) return 'C';
        else if(avg>=60) return 'D';
        else if(avg>=50) return 'E';
        else return 'F';
    }

    public static void main(String[] args){

        double marks = 85;   // default marks

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + func(marks));
    }
}
