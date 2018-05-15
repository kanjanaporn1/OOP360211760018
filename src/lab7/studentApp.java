package lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class studentApp {

    public static void main(String[] args) throws IOException {
        Student s1 =new Student();
        s1.setName("Mit");
        s1.setAge(22);
        s1.setGender("Male");
        s1.setHeight(180);
        System.out.println( s1.toString());

        Student s2 =new Student("Safe",90,"Female",190);
        System.out.println(s2.toString());

        //input data from user
        Student s3 = new Student();
        s3 = inputData (s3); //s
        s3 = inputDataBuffer(s3);
        System.out.println(s3.toString());

    }//main

    private static  Student inputDataBuffer (Student s) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your information: ");
        System.out.println("Name: ");
        s.setName(reader.readLine());
        System.out.println(":Age: ");
        s.setAge(Integer.parseInt(reader.readLine()));
        System.out.println("Gender: ");
        s.setHeight(Double.parseDouble(reader.readLine())) ;

        return  s;

    }

    private static Student inputData(Student s3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please rnter your information");
        System.out.println("Name: ");
        s3.setName(sc.nextLine());
        System.out.println("Age");
        s3.setAge(sc.nextInt());
        System.out.println("Gender:");
        s3.setGender(sc.nextLine());
        System.out.println("Heih:");
        s3.setHeight(sc.nextDouble());

        return s3;
    }

}
