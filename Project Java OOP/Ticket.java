import java.io.Serializable;

public class Ticket implements Serializable{

    private String from;
    private String to;
    private String date;
    private String time;
    private String cabin;
    private String seatNo;


    public Ticket(String from, String to, String date, String time,  String cabin, String seatNo)

    {
          
        this.from = from;
        this.to = to;
        this.date = date;
        this.time = time;
        this.cabin = cabin;
        this.seatNo = seatNo;



    }


    public String getFrom()
    {
        return from;
    }
    


    public String getTo()
    {
        return to;
    }
    

    public String getDate()
    {
        return date;
    }
    

    public String getTime()
    {
        return time;
    }
    


    public String getCabin()
    {
        return cabin;
    }
    


    public String getSeatNo()
    {
        return seatNo;
    }
    



    
}
