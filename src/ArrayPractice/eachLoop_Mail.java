package ArrayPracticeZero;

public class eachLoop_Mail {


        /*each loop: loop that's already been iterated

            for(DataType  variableName : ArrayName ){

    }
*variable name represents each of the data in the array

*DataType MUST be matched with Array's data type

            *number of execution times of the loop depends on the size of the Array

*iteration is always started from index 0 of the Array

*When do we use it:  first we MUST have a data structure whenver we dont need to provide the index numbers
*/


    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for (String EachEmail : emails) {//10 times it work

            if (!EachEmail.endsWith("@gmail.com")) {
                System.out.println(EachEmail);
            }
        }

    }
}








