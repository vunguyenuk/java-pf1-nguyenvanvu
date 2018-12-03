package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialization {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Dung bui");
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
        System.out.println(student.getAge());
    }
}
