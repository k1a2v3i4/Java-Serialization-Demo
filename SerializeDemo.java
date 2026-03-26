import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) {

        try {
            Employee emp = new Employee(101, "Kavitha");

            FileOutputStream fos = new FileOutputStream("employee.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(emp);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}