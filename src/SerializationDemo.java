import java.io.*;

// Step 1: Implement Serializable (marker interface, no methods to override)
class Employee implements Serializable {
    private static final long serialVersionUID = 1L; // best practice, explained below

    String name;
    int id;
    transient String password; // 'transient' = do NOT serialize this field

    Employee(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", password=" + password + "}";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Suresh", 501, "secret123");

        // ---- SERIALIZE: write object to a file ----
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new FileOutputStream("employee.ser"))) {
            out.writeObject(emp);
            System.out.println("Serialized: " + emp);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ---- DESERIALIZE: read object back from the file ----
        try (ObjectInputStream in =
                     new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee restored = (Employee) in.readObject();
            System.out.println("Deserialized: " + restored);
            // password will print as 'null' because it was marked transient
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
