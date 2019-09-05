public class Main {
    public static void main (String[] args){
        System.out.println("Exercise 1");
        exercise1();
        System.out.println("\nExercise 2");
        exercise2();
    }

    //Create a multidimensional array in IntelliJ that prints ten rows numbered 1-10 and five columns numbered 1-5. Display them as a matrix
    public static void exercise1(){
        String[][] myArray = new String[10][5];

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 5; j++){
                myArray[i][j] = "{" + i + "," + j + "}";
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
    }

    //Create an array to display the multiplication tables for the values 1-12. Your multiplication tables should display
    // as shown below. The interesection of a row value and a column value would be the product of the row * column
    public static void exercise2(){
        String[][] myArray = new String[12][12];

        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++){
                myArray[i][j] = ((i+1) * (j+1)) + "\t";
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
    }
}
