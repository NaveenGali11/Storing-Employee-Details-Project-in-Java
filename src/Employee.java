import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Employee {
    int id;
    String name;
    String address;

    Employee(int i, String n, String a) {
        id = i;
        name = n;
        address = a;
    }

    void Display() {
        System.out.println("Id :- " + id);
        System.out.println("Name :- " + name);
        System.out.println("Address :- " + address);
    }
}

class EmpList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int id;
        String name;
        String address;

        ArrayList<Employee> arl = new ArrayList<>();

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter id :- ");
            id = Integer.parseInt(br.readLine());

            System.out.println("Enter name :- ");
            name = br.readLine();

            System.out.println("Enter Address :- ");
            address = br.readLine();

            Employee emp = new Employee(id, name, address);
            arl.add(emp);
        }
        System.out.println("Enter id to Search :- ");
        id = Integer.parseInt(br.readLine());

        boolean found = false;

        for (int i=0;i<arl.size();i++){
            Employee obj = arl.get(i);

            if (id == obj.id){
                obj.Display();
                found = true;
            }
        }
        if (!found){
            System.out.println("Employee Not Found!");
        }
    }
}
