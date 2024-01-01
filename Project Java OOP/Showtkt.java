//Ticket frame**


import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;



public class Showtkt extends JFrame {

    private Container c;
    private ImageIcon icon, imgp, imgpb,imgpbb, imgpbbp;

    private JLabel capLabel, headLabel, downLabel, firstLabel,  secondLabel, trdLabel, frtLabel,  fifthLabel,  sixthLabel,   nameLabel, sevenLabel,   eightLabel,  nineLabel,   tenLabel,   fromLabel,  toLabel,    dateLabel,  timeLabel, seatLabel,   classLabel, imgpbLabel, imgpLabel, imgpbbLabel,imgpbbpLabel;
    
   
   
    
    private Font f;
   

    Showtkt(Customer customer, Ticket ticket)
    {
        initComponents(customer, ticket);

    }

    public void initComponents(Customer customer, Ticket ticket)
    {
        System.out.println(customer.getFname());
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        capLabel = new JLabel();
         //Font f = new Font ("Times New Roman",Font.BOLD,30);
          f = new Font ("Copperplate Gothic Bold",Font.BOLD,30);
         capLabel.setText("US  BANGLA  AIRLINES");
         capLabel.setForeground(Color.WHITE);
         capLabel.setBounds(300,02,700,100);
         capLabel.setFont(f); 
         c.add(capLabel);  

        

         headLabel =  new JLabel();
         f = new Font ("Copperplate Gothic Bold",Font.BOLD,18);
         headLabel.setText("Boarding Pass");
         headLabel.setForeground(Color.WHITE);
         headLabel.setBounds(50,05,700,50);
         headLabel.setFont(f);
         c.add(headLabel);

         downLabel =  new JLabel();
         f = new Font ("Copperplate Gothic Bold",Font.BOLD,18);
         downLabel.setText("Have  a  Safe  Journey");
         downLabel.setForeground(Color.WHITE);
         downLabel.setBounds(50,410,700,50);
         downLabel.setFont(f);
         c.add(downLabel);


         firstLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,20);
         firstLabel.setText("Passenger Name:");
         firstLabel.setBounds(200,100,700,50);
         firstLabel.setFont(f);
         c.add( firstLabel);

         
         nameLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,28);
         nameLabel.setText(customer.getFname() + " " + customer.getLname());
         nameLabel.setBounds(200,135,700,50);
         nameLabel.setFont(f);
         c.add( nameLabel);


         secondLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,20);
         secondLabel.setText("From:");
         secondLabel.setBounds(200,200,700,50);
         secondLabel.setFont(f);
         c.add( secondLabel);

         fromLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,28);
         fromLabel.setText(ticket.getFrom());
         fromLabel.setBounds(200,235,700,50);
         fromLabel.setFont(f);
         c.add( fromLabel);


         trdLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,20);
         trdLabel.setText("To:");
         trdLabel.setBounds(200,300,700,50);
         trdLabel.setFont(f);
         c.add( trdLabel);


         toLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,28);
         toLabel.setText(ticket.getTo());
         toLabel.setBounds(200,335,700,50);
         toLabel.setFont(f);
         c.add( toLabel);





         frtLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,20);
         frtLabel.setText("Depart Date:");
         frtLabel.setBounds(580,100,700,50);
         frtLabel.setFont(f);
         c.add( frtLabel);


         dateLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,28);
         dateLabel.setText(ticket.getDate());
         dateLabel.setBounds(580,135,700,50);
         dateLabel.setFont(f);
         c.add( dateLabel);


        
         fifthLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,20);
         fifthLabel.setText("Depart Time:");
         fifthLabel.setBounds(580,190,700,50);
         fifthLabel.setFont(f);
         c.add(fifthLabel);


         timeLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,28);
         timeLabel.setText(ticket.getTime());
         timeLabel.setBounds(580,225,700,50);
         timeLabel.setFont(f);
         c.add( timeLabel);



         sixthLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,20);
         sixthLabel.setText("Flight No:");
         sixthLabel.setBounds(790,190,700,50);
         sixthLabel.setFont(f);
         c.add(sixthLabel);
    

         sevenLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,20);
         sevenLabel.setText("Seat No:");
         sevenLabel.setBounds(580,300,700,50);
         sevenLabel.setFont(f);
         c.add(sevenLabel);

         seatLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,28);
         seatLabel.setText(ticket.getSeatNo());
         seatLabel.setBounds(580,330,700,50);
         seatLabel.setFont(f);
         c.add(  seatLabel);

    
         eightLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,20);
         eightLabel.setText("Class:");
         eightLabel.setBounds(780,300,700,50);
         eightLabel.setFont(f);
         c.add(eightLabel);

         classLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,28);
         classLabel.setText(ticket.getCabin());
         classLabel.setBounds(780,330,700,50);
         classLabel.setFont(f);
         c.add(classLabel);


         nineLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,20);
         nineLabel.setText("Gate No:");
         nineLabel.setBounds(900,100,700,50);
         nineLabel.setFont(f);
         c.add(nineLabel);
    
         tenLabel =  new JLabel();
         f = new Font ("Times New Roman",Font.BOLD,25);
         tenLabel.setText("5");
         tenLabel.setBounds(1000,100,700,50);
         tenLabel.setFont(f);
         c.add(tenLabel);



        icon = new ImageIcon(getClass().getResource("image/icons.png"));
         this.setIconImage(icon.getImage());

 
        imgp = new ImageIcon(getClass().getResource("image/bar code 2.jpg"));
        imgpLabel = new JLabel(imgp);
        imgpLabel.setBounds(70,150,50,200);
        c.add(imgpLabel);

         imgpbbp = new ImageIcon(getClass().getResource("image/goldenplane.png"));
         imgpbbpLabel = new JLabel(imgpbbp);
         imgpbbpLabel.setBounds(900,00,200,100);
         c.add(imgpbbpLabel);


         imgpb = new ImageIcon(getClass().getResource("image/blue.png"));
         imgpbLabel = new JLabel(imgpb);
         imgpbLabel.setBounds(00,00,1100,100);
         c.add(imgpbLabel);

    
         imgpbb = new ImageIcon(getClass().getResource("image/blue.png"));
         imgpbbLabel = new JLabel(imgpbb);
         imgpbbLabel.setBounds(00,410,1100,90);
         c.add(imgpbbLabel);

         


    }

    
    // public static void main(String[] args) {

    //    Showtkt frame = new  Showtkt();
    //      frame.setVisible(true);
    //      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //      frame.setBounds(200,10,1100,500);  
    //      frame.setTitle("Boarding Pass");
    //      frame.setResizable(false);
         
    //  }


}

