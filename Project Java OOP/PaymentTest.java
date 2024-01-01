//Payment frame**

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;


public class PaymentTest extends JFrame {

    private Container c;
    private JLabel capLabel, headLabel,  ecoLabel,  busLabel,  firstLabel;
    private ImageIcon icon;
    private JButton bt1,bt2;
    private Cursor cr;
    private JComboBox<String> cb1,cb2,cb3;
    private Font f;
    private String [] first = {"Bkash", "Nagad", "Credit Card"};
    private String [] business = {"Bkash", "Nagad", "Credit Card"};
    private String [] economy = {"Bkash", "Nagad", "Credit Card"};
   
    

    PaymentTest()
    {
        initComponents();

    }

    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);


        capLabel = new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,25);
        capLabel.setText("MAKE    YOUR   PAYMENT");
        capLabel.setBounds(500,30,700,100);
        capLabel.setFont(f); 
        c.add(capLabel);  

        

        headLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,18);
        headLabel.setText("@Atia Travels");
        headLabel.setBounds(50,10,700,50);
        headLabel.setFont(f);
        c.add(headLabel);


        firstLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        firstLabel.setText("First Class :");
        firstLabel.setBounds(500,120,700,50);
        firstLabel.setFont(f);
        c.add( firstLabel);



        cb1 = new JComboBox<String>(first);
        cb1.setBounds(500, 200, 250, 40);
        this.add(cb1);


        
    
       
        busLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        busLabel.setText("Business Class:");
        busLabel.setBounds(500,280,700,50);
       busLabel.setFont(f);
        c.add(busLabel);



        cb2 = new JComboBox<String>(business);
        cb2.setBounds(500, 370, 250, 40);
        this.add(cb2);



        ecoLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        ecoLabel.setText("Economy Class :");
        ecoLabel.setBounds(500,450,700,50);
        ecoLabel.setFont(f);
        c.add(ecoLabel);



        cb3 = new JComboBox<String>(economy);
        cb3.setBounds(500, 530, 250, 40);
        this.add(cb3);




        cr = new Cursor(Cursor.HAND_CURSOR);


        bt1 = new JButton();
        f = new Font ("Times New Roman",Font.BOLD,20);
        bt1.setText ("Pay");
        bt1.setBounds(1100,550,200,50);
        bt1.setFont(f);
        bt1.setCursor(cr);
        c.add(bt1);

        bt2 = new JButton();
        f = new Font ("Times New Roman",Font.BOLD,20);
        bt2.setText ("Go Back");
        bt2.setBounds(1100,620,200,50);
        bt2.setFont(f);
        bt2.setCursor(cr);
        c.add(bt2);






        bt1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
    
    
                
                
                
                        JOptionPane.showMessageDialog(null, "Thanks! Your ticket is on the way" , "Ticket info", JOptionPane.INFORMATION_MESSAGE);

                        Createfile1 xCreatefile1= new Createfile1();
                        Createfile2 xCreatefile2= new Createfile2();

                        Customer customer= new Customer("", "","", "", "", "", "");
                        Ticket ticket= new Ticket("", "" , "", "" , "", "");

                        ArrayList<Ticket> t= xCreatefile1.getArrayList();
                        ArrayList<Customer> c= xCreatefile2.getArrayList();

                        for(Customer x: c) customer= x;
                        for(Ticket x:t) ticket= x;


                        

                        dispose();
                        Showtkt frame = new  Showtkt(customer,ticket);
                        frame.setVisible(true);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.setBounds(200,10,1100,500);
                       
                        frame.setTitle("Air Ticket");
                        frame.setResizable(false);
    
            }
    
    
        
        });



        bt2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {

                dispose();
                LabelTest frame = new LabelTest();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(200,10,700,500);
        
                frame.setTitle("Airline Reservation");
                frame.setResizable(false);






            }
    
    
        
        });








         icon = new ImageIcon(getClass().getResource("image/icons.png"));
         this.setIconImage(icon.getImage());



    }

    
    public static void main(String[] args) {

        PaymentTest frame = new  PaymentTest();
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         //frame.setBounds(200,10,900,800);
         frame.setBounds(00,00,1520,850);
         frame.setTitle("Passenger Information");
 
         
     }



}
