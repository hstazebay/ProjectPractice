package ArrayPractice;

public class PracticeArrayTask2 {
    public static void main(String[] args) {
        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};

     // print out all the users who regsitered with their gmail

     //  max:  4

        for (int i = 0; i <= 3; i++) {
            String email = emails[i];
            if (email.endsWith("@gmail.com")) {
                System.out.println(email);
            }
        }


    }




}

