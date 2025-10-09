public class Hello {
    public static void main(String[] args){
        int topScore = 95;
        if (topScore<100){
            System.out.println("You got the top score");
        }
        int secondTopScore = 90;
        if ((topScore<100)&&(secondTopScore<topScore)){
            System.out.println("Greater that second top score and lessthan 100");
        }
        if ((topScore > 95) || (secondTopScore<95)){
            System.out.println("Either of the conditions are true");
        }

        int someValue = 10;
        if(someValue==10)
        System.out.println("Then it is true");

        boolean isCar = false;
        if(!isCar) {
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic= makeOfCar == "Volkswagen" ? false : true;

        if (isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic)? "This car is domestic": "This car is not domestic";

        System.out.println(s);

        

        int ageOfClient = 9;
        String ageText = ageOfClient >= 18 ? "Over Eighteen" : "Still a kid";
        System.out.println("Our Client is " + ageText);

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = myFirstValue + mySecondValue * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);

        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("The Remainder is = " + theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true: false;
        System.out.println("There is no Remainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got a remainder value");
        }
   
    }
    
}
