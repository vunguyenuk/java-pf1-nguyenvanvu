package IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vu Nguyen");
        student.setAge(28);

        try{
            FileOutputStream fos = new FileOutputStream("src/IO/TestObjectIO");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(student);
            System.out.println("Write file is success");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
