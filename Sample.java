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

    String studentFirstName = "Hemanth";
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

}

}