public class Main {

    int x = 10; // instance variable in Main class.
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static int sum(int k){ // recursion method.
        if(k>0){
            return k + sum(k-1);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
      //  boolean gameOver = true;
        int score = 6000;
      //  int levelCompleted = 5;
      //  int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000");
        }
        else if(score < 5000) {
            System.out.println("It has not yet reached 5000");
        }
        else {
            System.out.println("Value has crossed");
        }

        int result = sum(10);  // Java recursion
        System.out.println("The sum is:" + result);

        Main myObj = new Main();
        System.out.println(myObj.x);        

    }

}


class Second {
    public static void main(String[] args){
        Main myObj2 = new Main();
        System.out.println(myObj2.x); // accessing variable x from Main class to Secong class.
    }
}


class Person {
       public static void main(String[] args){
        Main myObj3 = new Main();
        System.out.println("Name: " + myObj3.fname + " " + myObj3.lname); // accessing String variables from Main class to Person class.
        System.out.println("Age: " + myObj3.age); // accessing variable age from Main class to Person class.
    }
}

