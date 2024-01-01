
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Createfile2 {
    private  ObjectOutputStream output;
    private  ObjectInputStream input;
    private ArrayList<Customer> arr;
    


    public void writeFile(Customer customer) {
        readFile();
        arr.add(customer);
        try {
            output= new ObjectOutputStream(Files.newOutputStream(Paths.get("cusotmerInfo.bin")));
            
          //  System.out.println("size  now " + arr.size());
            output.writeObject(arr);

        } catch(NoSuchElementException e) {

        } catch(IOException e) {

        }

        closeFile();
    }

    private void closeFile() {
        try {
            if(output!=null) output.close();
            
        } catch(IOException e) {

        }
    }

    public void readFile() {
        arr= new ArrayList<>();
        try {
            input= new ObjectInputStream(Files.newInputStream(Paths.get("cusotmerInfo.bin")));
         arr= (ArrayList<Customer>) input.readObject();

         System.out.println("size  now " + arr.size());

         
            
        
        //System.out.println("First Name : "+ customer.getFname()+ " Last Name : " + customer.getLname() + " DOB : " + customer.getDob() + " Age : " + customer.getAge() + " Email : " + customer.getEmail() + " Contact No : " + customer.getContactNo());
        
        } catch(IOException e) {

        } catch(ClassNotFoundException e) {


        }
        try{
            if(input!=null) input.close();
        }catch(IOException e) {

        }
        
 
    }

    public ArrayList<Customer> getArrayList() {
        readFile();
        return arr;
    }



}