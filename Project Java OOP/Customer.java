import java.io.Serializable;

public class Customer implements Serializable{


    private String title;
    private String fname;
    private String lname;
    private String dob;
    private String age;
    private String email;
    private String contactNo;


    public Customer(String title, String fname, String lname, String dob, String age, String email, String contactNo)

    {
          
        this.title =title;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.age = age;
        this.email = email;
        this.contactNo = contactNo;



    }


    public String getTitle()
    {
        return title;
    }
    


    public String getFname()
    {
        return fname;
    }
    

    public String getLname()
    {
        return lname;
    }
    

    public String getDob()
    {
        return dob;
    }
    


    public String getAge()
    {
        return age;
    }
    

    public String getEmail()
    {
        return email;
    }
    


    public String getContactNo()
    {
        return contactNo;
    }
    




    
}
