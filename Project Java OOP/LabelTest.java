//Booking Frame**

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class LabelTest extends JFrame {

    private ImageIcon icon, img;
    private Container c;
    private JLabel userLabel, passLabel;
    private JLabel imgLabel;
    private JButton btn1,btn2, btn3;
    private Cursor cur;

    LabelTest()
    {
        initComponents();

    }

    public void initComponents()
    {       

            c = this.getContentPane();
            c.setLayout(null);
         
        
            userLabel = new JLabel();
            Font f = new Font ("Times New Roman",Font.BOLD,28);
            userLabel.setText("AIRLINE  RESERVATION  SYSTEM");
            userLabel.setBounds(100,20,700,200);
            userLabel.setFont(f);
            userLabel.setForeground(Color.WHITE); 
            c.add(userLabel);    

            cur = new Cursor(Cursor.HAND_CURSOR);

            
            passLabel =  new JLabel();
            f = new Font ("Times New Roman",Font.BOLD,18);
            passLabel.setText("@Atia Travels");
            passLabel.setBounds(50,10,700,50);
            passLabel.setFont(f);
            passLabel.setForeground(Color.WHITE);
            c.add(passLabel);

            btn1 = new JButton();
            f = new Font ("Times New Roman",Font.BOLD,18);
            btn1.setText ("1.BOOKING");
            btn1.setBounds(200,200,200,50);
            btn1.setFont(f);
            btn1.setCursor(cur);
            c.add(btn1);
           

            btn2 = new JButton();
            f = new Font ("Times New Roman",Font.BOLD,18);
            btn2.setText ("2.HOME");
            btn2.setBounds(200,280,200,50);
            btn2.setFont(f);
            btn2.setCursor(cur);
            c.add(btn2);

           
            btn3 = new JButton();
            f = new Font ("Times New Roman",Font.BOLD,18);
            btn3.setText ("3.EXIT");
            btn3.setBounds(200,370,200,50);
            btn3.setFont(f);
            btn3.setCursor(cur);
            c.add(btn3);


           

             img = new ImageIcon(getClass().getResource("image/wingg.jpg"));
             imgLabel = new JLabel(img);
             imgLabel.setBounds(00,00,685,460);
             c.add(imgLabel);


            icon = new ImageIcon(getClass().getResource("image/plane.png"));
            this.setIconImage(icon.getImage());  
            
            

          
        
            btn1.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e)
                {
        
        
                    
          dispose() ;    

        AirlineTest frame = new AirlineTest();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(00,00,1520,850);
        frame.getContentPane().requestFocusInWindow();
        frame.setTitle("Booking Details");

                    
                                        
        
            }
        
        
            
            });

           

            btn2.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e)
                {
        
                    Createfile2 xCreatefile2= new Createfile2();
                    Createfile1 xCreatefile1= new Createfile1();
                    ArrayList <Customer> cus = xCreatefile2.getArrayList();
                    ArrayList <Ticket> tkt = xCreatefile1.getArrayList();

                    Record record= new Record(cus,tkt);
                    
        DefaultTableCellRenderer renderer= new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER );
        record.table.getColumnModel().getColumn(0).setCellRenderer(renderer );
        record.table.getColumnModel().getColumn(1).setCellRenderer(renderer );
        record.table.getColumnModel().getColumn(2).setCellRenderer(renderer );
        record.table.getColumnModel().getColumn(3).setCellRenderer(renderer );
        record.table.getColumnModel().getColumn(4).setCellRenderer(renderer );
        record.table.getColumnModel().getColumn(5).setCellRenderer(renderer );
        record.table.getColumnModel().getColumn(6).setCellRenderer(renderer );
        
        DefaultTableModel model= (DefaultTableModel) record.table.getModel();
        
       
        for(int i=0;i<cus.size();i++)
       
        {
            Object[] data={cus.get(i).getFname()+ " " + cus.get(i).getLname(), cus.get(i).getContactNo() , cus.get(i).getDob(), cus.get(i).getAge(),  tkt.get(i).getFrom(), tkt.get(i).getTo(), tkt.get(i). getDate() };

            model.addRow(data);
            
            //System.out.println(cus.get(i).getContactNo());


        }


       // Object[] data={"Niha"+ " " + "Zafar", "012345" , "02/02/2002", "adult",  "Bangkok", "BD", "12/02/2023" };

            //model.addRow(data);
         
        
                 
        
                    //Record frame = new Record(cus,tkt);
                    record.setVisible(true);
                    //record.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    record.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    //record.setBounds(200,10,900,800);
                    record.setBounds(00,00,1520,850);
                    record.setTitle("Booking Records");
    
                    
                           
            
                    
        
                }
        
        
            
            });




            btn3.addActionListener(new ActionListener(){

                public void actionPerformed(ActionEvent e)
                {
        
        
                    int bt3= JOptionPane.showConfirmDialog(null, "Want to Exit?" , "Exit ", JOptionPane.YES_NO_OPTION);
    
                    if(bt3==JOptionPane.YES_OPTION)
                    {
                           
                    
              
          dispose();          
          LabelTest frame = new LabelTest();
          
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
        
                }
        
            }
            
            });





    }




   
    public static void main(String[] args) {

        LabelTest frame = new LabelTest();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,10,700,500);

        frame.setTitle("Airline Reservation");
        frame.setResizable(false);

    }


}
