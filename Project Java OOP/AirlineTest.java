//Details Frame**

import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class AirlineTest extends JFrame {

    private Container c;
    private ImageIcon icon, imgb; 
    private JLabel capLabel, headLabel, comLabel, downLabel, fromLabel, toLabel, departLabel, returnLabel,  cabinLabel, seatLabel ;
    private JLabel imgbLabel;
    private JTextField tf1, tf2, tf3;
    private JButton bt1;
    private Cursor cr ;
    private JComboBox<String> cb1,cb2, cb3;
    private Font f;


    private String [] time = {"13:00                    C4321", "21:00                     C9801", "01:00                   C6590"};    
    private String [] cabin = {"First class", "Business Class", "Economy Class"};
    private String [] seat = {"WA1", "IB2"};
    
    AirlineTest()
    {
        initComponents();

    }

    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);

        

        capLabel = new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,25);
        capLabel.setText("BOOKING DETAILS");
        capLabel.setBounds(980,00,700,100);
        capLabel.setFont(f); 
        c.add(capLabel);  

        

        headLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,18);
        headLabel.setText("@Atia Travels");
        headLabel.setBounds(50,10,700,50);
        headLabel.setFont(f);
        c.add(headLabel);


        comLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,30);
        comLabel.setText("Welcome To Atiya Travels!");
        comLabel.setBounds(200,200,700,50);
        comLabel.setFont(f);
        c.add(comLabel);

        
        downLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        downLabel.setText("Find The Easiest Way To Reach Your Destination!");
        downLabel.setBounds(200,600,700,50);
        downLabel.setFont(f);
        c.add(downLabel);

       

        fromLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        fromLabel.setText("From       :");
        fromLabel.setBounds(870,80,700,50);
        fromLabel.setFont(f);
        c.add(fromLabel);


        tf1 = new JTextField("  From....");
        tf1.setForeground(Color.GRAY);

        tf1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf1.setText("");
                tf1.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        tf1.setBounds(1000,90,250,40);
        c.add(tf1);

      
        
        toLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        toLabel.setText("To           :");
        toLabel.setBounds(870,150,700,50);
        toLabel.setFont(f);
        c.add(toLabel);

        

        tf2 = new JTextField("  To....");
        tf2.setForeground(Color.GRAY);

      
       
        tf2 = new JTextField("To");
        tf2.setForeground(Color.GRAY);

        tf2.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf2.setText("");
                tf2.setForeground(Color.BLACK);

            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        tf2.setBounds(1000,150,250,40);

        c.add(tf2);


        

        
        departLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        departLabel.setText("Depart Date :");
        departLabel.setBounds(860,210,700,50);
        departLabel.setFont(f);
        c.add(departLabel);

        tf3 = new JTextField(" dd / mm / yyyy");
        tf3.setForeground(Color.GRAY);

        tf3.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf3.setText("");
                tf3.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        tf3.setBounds(1000,210,250,40);
        c.add(tf3);



        returnLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        returnLabel.setText("Depart Time :");
        returnLabel.setBounds(860,275,700,50);
        returnLabel.setFont(f);
        c.add(returnLabel);

       
        cb1 = new JComboBox<String>(time);
        cb1.setBounds(1000, 275, 250, 40);
        this.add(cb1);


       

        cabinLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        cabinLabel.setText("Cabin       :");
        cabinLabel.setBounds(870,345,700,50);
        cabinLabel.setFont(f);
        c.add(cabinLabel);

        cb2 = new JComboBox<String>(cabin);
        cb2.setBounds(1000, 345, 250, 40);
        this.add(cb2);

        seatLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        seatLabel.setText("Seat No   :");
        seatLabel.setBounds(870,410,700,50);
        seatLabel.setFont(f);
        c.add(seatLabel);

        cb3 = new JComboBox<String>(seat);
        cb3.setBounds(1000, 410, 250, 40);
        this.add(cb3);


        cr = new Cursor(Cursor.HAND_CURSOR);

        bt1 = new JButton();
        f = new Font ("Times New Roman",Font.BOLD,20);
        bt1.setText ("Book a Flight");
        bt1.setBounds(1000,520,200,50);
        bt1.setFont(f);
        bt1.setCursor(cr);
        c.add(bt1);

        
        imgb = new ImageIcon(getClass().getResource("image/booking.jpg"));
        imgbLabel = new JLabel(imgb);
        imgbLabel.setBounds(00,00,800,800);
        c.add(imgbLabel);


        icon = new ImageIcon(getClass().getResource("image/airp.png"));
        this.setIconImage(icon.getImage());

        

        bt1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
                String inputFrom= tf1.getText();
                String inputTo= tf2.getText();
                String inputDate= tf3.getText();
                String selectedTime= cb1.getSelectedItem().toString();
                String selectedCabin= cb2.getSelectedItem().toString();
                String selectedSeatNo= cb3.getSelectedItem().toString();
                
                //System.out.println(inputFrom + inputTo + inputDate + selectedTime + selectedCabin + selectedSeatNo );

                //System.out.println(selectedTime);

                Ticket ticket= new Ticket(inputFrom, inputTo, inputDate, selectedTime, selectedCabin, selectedSeatNo );
                Createfile1 xCreatefile1= new Createfile1();
                xCreatefile1.writeFile(ticket);

                dispose();
                PassengerTest frame = new PassengerTest();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(00,00,1520,850);
        
                frame.setTitle("Passenger Information");
                
    
            }
    
    
        
        });




  
    }

    public static void main(String[] args) {

        AirlineTest frame = new AirlineTest();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setBounds(200,10,900,800);
        frame.setBounds(00,00,1520,850);
        frame.getContentPane().requestFocusInWindow();
        frame.setTitle("Booking Details");

        
    }

}
