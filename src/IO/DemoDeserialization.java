package IO;

import java.io.*;

public class DemoDeserialization {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vu Nguyen");
        student.setAge(28);
        try{
            FileInputStream fis = new FileInputStream("src/IO/TestObjectIO");
            ObjectInputStream ois = new ObjectInputStream(fis);
            student = (Student) ois.readObject();

        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(student.getName());
    }
}
