import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Createfile1 {
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ArrayList<Ticket> arr;


    public void writeFile(Ticket ticket) {
 
        readFile();
        arr.add(ticket);
        try {
            
            output= new ObjectOutputStream(Files.newOutputStream(Paths.get("tktInfo.bin")));
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
            input= new ObjectInputStream(Files.newInputStream(Paths.get("tktInfo.bin")));
       
             arr  =(ArrayList<Ticket>)input.readObject();
             
       // System.out.println("From  : "+ ticket.getFrom()+ " To : " + ticket.getTo() + " Date : " + ticket.getDate() + " Time : " + ticket.getTime() +  " Cabin : " + ticket.getCabin()+ " To : " + ticket.getSeatNo());
        
        } catch(IOException e) {

        } catch(ClassNotFoundException e) {

        }
        try {
            if(input!=null) input.close();
        } catch(IOException e) {

        }
        
    }

    public ArrayList<Ticket> getArrayList() {
        readFile();
        return arr;
    }




}