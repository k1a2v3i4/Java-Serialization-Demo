import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {

    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("employee.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee emp = (Employee) ois.readObject();

            ois.close();
            fis.close();

            System.out.println(emp.id);
            System.out.println(emp.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}