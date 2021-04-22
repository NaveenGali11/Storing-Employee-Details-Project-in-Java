import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Employee {
    int id;
    String name;
    String address;

    Employee(int i,String n,String a){
        id = i;
        name = n;
        address = a;
    }

    void Display(){
        System.out.println("Id :- "+id);
        System.out.println("Name :- "+name);
        System.out.println("Address :- "+address);
    }
}
class EmpList{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int id;
        String name;
        String address;

        ArrayList<Employee> arl = new ArrayList<>();

    }
}
