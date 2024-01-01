//Home frame*


import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTable;



            public class Record extends JFrame {


                private Container c;
                private JLabel capLabel,headLabel;
                public JTable table;

               

               // private String [] cols = {"Passenger Name", "Contact No", "DOB", "Age", "From", "To", "Depart Date"};
               // private String [][] rows = {

                                         // {"Hasan Raj", "Sylhet", "Dhaka", "29/01/2022"} ,

                                         // {"Niha Zafar", "Sylhet", "Dhaka", "10/02/2022"} ,



               // };

                private JScrollPane scroll;
                private ImageIcon icon;


            Record(ArrayList <Customer> cus, ArrayList <Ticket> tkt)
                {
                    initComponents(cus,tkt);




                }

                




                public void initComponents(ArrayList <Customer> cus, ArrayList <Ticket> tkt)
                {
                    c = this.getContentPane();
                    c.setLayout(null);

                    c.setBackground(Color.WHITE);

            capLabel = new JLabel();
            Font f = new Font ("Times New Roman",Font.BOLD,30);
            capLabel.setText("Flight   Booking     Records");
            capLabel.setBounds(620,30,500,100);
            capLabel.setFont(f); 
            c.add(capLabel);  


            headLabel =  new JLabel();
            f = new Font ("Times New Roman",Font.BOLD,18);
            headLabel.setText("@Atia Travels");
            headLabel.setBounds(50,10,700,50);
            headLabel.setFont(f);
            c.add(headLabel);
    


            table = new JTable();
            table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
    
                },
                new String [] {
                    "Passenger Name", "Contact No", "Date of Birth", "Age", "From", "To", "Date"
                }
            ) {
                boolean[] canEdit = new boolean [] {
                    false, false, false, false, false, false, false
                };
    
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
    
    
    
    
           
            
            scroll = new JScrollPane(table);
            scroll.setBounds(350,180,800,400);
            c.add(scroll);


            icon = new ImageIcon(getClass().getResource("image/icons.png"));
            this.setIconImage(icon.getImage());

                
            }


            // public static void main(String[] args) {

            //     Record frame = new Record();
            //     frame.setVisible(true);
            //     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //     frame.setBounds(200,10,900,800);
                
            //     frame.setTitle("Booking Records");

                
            // }









}