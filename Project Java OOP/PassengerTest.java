//Passenger Info Frame**


import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;
import java.awt.Color;



public class PassengerTest extends JFrame{

    private Container c;
    private JLabel capLabel, headLabel, imgpLabel ;
    private JLabel titleLabel, fnameLabel, lnameLabel, dobLabel, passengerLabel,  emailLabel,  phnLabel;
    private ImageIcon icon, imgp;
    private JTextField  tf2, tf3, tf4, tf6, tf7;
    private JButton bt1;
    private Cursor cr;
    private JComboBox<String> cb1, cb2;
    private Font f;
    private String [] passenger = {"Mr", "Ms", "Mrs"};
    private String [] age = {"Adult", "Child", "Infant"};

    PassengerTest()
    {
        initComponents();

    }

    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);

        

        capLabel = new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,25);
        capLabel.setText("PASSENGER INFORMATION");
        capLabel.setBounds(900,30,700,100);
        capLabel.setFont(f); 
        c.add(capLabel);  

        

        headLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,18);
        headLabel.setText("@Atia Travels");
        headLabel.setBounds(50,10,700,50);
        headLabel.setFont(f);
        c.add(headLabel);





        titleLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        titleLabel.setText("Title              :");
        titleLabel.setBounds(850,120,700,50);
        titleLabel.setFont(f);
        c.add(titleLabel);



        cb1 = new JComboBox<String>(passenger);
        cb1.setBounds(1000, 120, 250, 40);
        this.add(cb1);

       
        
      
        
        fnameLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        fnameLabel.setText("First Name    :");
        fnameLabel.setBounds(850,180,700,50);
        fnameLabel.setFont(f);
        c.add(fnameLabel);



        tf2 = new JTextField(" Enter  First  Name....");
        
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

        tf2.setBounds(1000,180,250,40);
        c.add(tf2);
        


        
        lnameLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        lnameLabel.setText("Last Name    :");
        lnameLabel.setBounds(850,240,700,50);
        lnameLabel.setFont(f);
        c.add(lnameLabel);



        tf3 = new JTextField(" Enter  Last  Name....");
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

        tf3.setBounds(1000,240,250,40);
        c.add(tf3);


        dobLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        dobLabel.setText("Date Of Birth :");
        dobLabel.setBounds(850,300,700,50);
        dobLabel.setFont(f);
        c.add(dobLabel);

        tf4 = new JTextField(" dd/mm/yyyy....");
        tf4.setForeground(Color.GRAY);

        tf4.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf4.setText("");
                tf4.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        tf4.setBounds(1000,300,250,40);
        c.add(tf4);


        
        passengerLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        passengerLabel.setText("Passenger       :");
        passengerLabel.setBounds(850,360,700,50);
        passengerLabel.setFont(f);
        c.add(passengerLabel);

        cb2 = new JComboBox<String>(age);
        cb2.setBounds(1000, 360, 250, 40);
        this.add(cb2);






        emailLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        emailLabel.setText("Email            :");
        emailLabel.setBounds(850,420,700,50);
        emailLabel.setFont(f);
        c.add(emailLabel);

        tf6 = new JTextField(" Enter Email....");
        tf6.setForeground(Color.GRAY);

        tf6.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf6.setText("");
                tf6.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        tf6.setBounds(1000,420,250,40);
        c.add(tf6);

        phnLabel =  new JLabel();
        f = new Font ("Times New Roman",Font.BOLD,20);
        phnLabel.setText("Contact No    :");
        phnLabel.setBounds(850,480,700,50);
        phnLabel.setFont(f);
        c.add(phnLabel);


        tf7 = new JTextField(" Enter Contact No....");
        tf7.setForeground(Color.GRAY);

        tf7.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                tf7.setText("");
                tf7.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });

        tf7.setBounds(1000,480,250,40);
        c.add(tf7);


        cr = new Cursor(Cursor.HAND_CURSOR);


        bt1 = new JButton();
        f = new Font ("Times New Roman",Font.BOLD,20);
        bt1.setText ("Let's Fly");
        bt1.setBounds(990,580,200,50);
        bt1.setFont(f);
        bt1.setCursor(cr);
        c.add(bt1);


        
        icon = new ImageIcon(getClass().getResource("image/icon.png"));
        this.setIconImage(icon.getImage());


         
        imgp = new ImageIcon(getClass().getResource("image/passener.png"));
        imgpLabel = new JLabel(imgp);
        imgpLabel.setBounds(00,00,800,800);
        c.add(imgpLabel);



        bt1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e)
            {
      
               

                String selectedTitle= cb1.getSelectedItem().toString();
                String inputFname= tf2.getText();
                String inputLname= tf3.getText();
                String inputDob= tf4.getText();
                String selectedAge= cb2.getSelectedItem().toString();
                String inputEmail= tf6.getText();
                String inputContactNo= tf7.getText();



               Customer customer= new Customer(selectedTitle, inputFname, inputLname, inputDob, selectedAge, inputEmail, inputContactNo);

                Createfile2 xCreatefile2= new Createfile2();
                xCreatefile2.writeFile(customer);

               // System.out.println(inputContactNo);
                

                
                dispose();

                PaymentTest frame = new  PaymentTest();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               frame.setBounds(00,00,1520,850);
        
                frame.setTitle("Passenger Information");
        
                       
        
                
    
            }
    
    
        
        });



       

    }

        public static void main(String[] args) {

            PassengerTest frame = new PassengerTest();
             frame.setVisible(true);
             frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             //frame.setBounds(200,10,900,800);
             frame.setBounds(00,00,1520,850);
             frame.setTitle("Passenger Information");
     
             
         }
     

    
}
