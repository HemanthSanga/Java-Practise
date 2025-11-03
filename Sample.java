import java.util.ArrayList;

public class Sample {
   public static void main(String[] args){
    int wholeNumber;
    wholeNumber = 3;
    String carColour = "Blue";
    char firstNameInitial = 'D';
    float givenValue = 66.11f;
    double decimalValue = 23.56;
    int a = 10, b = 15, c = 22;
    int x,y,z;
    x=y=z=3;

    System.out.println(wholeNumber);
    System.out.println(carColour);
    System.out.println(firstNameInitial);
    System.out.println(givenValue);
    System.out.println(decimalValue);

    System.out.println("Displaying Practise file");
    System.out.println("Output second line");
    System.out.println(3);
    System.out.println("Multiplication Product of 2 and 3 is:" + (2*3));// value to be entered
    System.out.printf(carColour+firstNameInitial);
    System.out.println((a+b+c));
    System.out.println(x+y+z);

    String studentFirstName = "Hemanth";// Different datatypes with examples
    String studentSecondName = "Sanga";
    int studentID = 390;
    char studentGrade = 'A';
    String studentToken = "390H";
    int studentFee = 180000;
    char currency = '€';
    float studentpercentage = 58.6f;
    boolean studentIsPunctual = true;
    boolean studentIsSick = false;
    
    System.out.println("Name of the Student: " + studentFirstName+" "+studentSecondName);
    System.out.println("Student's ID: " + studentID);
    System.out.println("Student's Grade: " + studentGrade);
    System.out.println("Student's Fee in Euros: "+ studentFee + currency);
    System.out.println("Student's Token: " + studentToken);
    System.out.println("Student's Percentage: " + studentpercentage);
    System.out.println("The student is Punctual: " + studentIsPunctual);
    System.out.println("The student is sick: " + studentIsSick);

    var student = new ArrayList<String>(); //var Keyword with Array example
        student.add("Uniform");
        student.add("Shoes");
        student.add("College bag");
        student.add("Stationary");
        student.add("Bicycle");
        student.add("Library ID");
        student.add("Sports");
    System.out.println(student);

    
    /*Type Casting */
    int d = 4;
    long l = d;
    double k = d; //Wide casting

    System.out.println("Given int value is: " + d);
    System.out.println("The long value of int is: " + l);
    System.out.println("The double value of int is: " + k);


    double kk = 89.3d;
    int ik = (int) kk; //Narrow casting

    System.out.println("Given double value is: " + kk);
    System.out.println("The int value og given double is: " + ik);

    int maxScore = 600;
    int userScore = 405;

    double scorePercentage = (double) userScore/maxScore*100d;
    /*Turning the int value to a floating-point value*/

    System.out.println("The Percentage value of user score is: " + scorePercentage);

    /*Average of different ages calculator */

    int ages[] = {12, 15, 14, 10, 13, 16, 15, 14};
    int avg,sum = 0;

    for(int age:ages){   /*for(i=0, i<ages.length, i++) */
        sum += age;      /*The loop continues from age[0] index value of 12 to age[7] */
    }
    avg = sum/ages.length;
    System.out.println("The average age is: " + avg);

}

}