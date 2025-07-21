import javax.swing.*;
public class swing_forms extends JFrame{
    JFrame f;
    swing_forms()
    {
        JButton b=new JButton("SUBMIT"); 
        JLabel LL= new JLabel("Personal Details");
        JLabel f = new JLabel("First Name");
        JLabel l = new JLabel("Last Name");
        JLabel add = new JLabel("Address");
        JTextField t= new JTextField();
        JTextField ln= new JTextField();
        JTextField addr = new JTextField();
        add.setBounds(10,105,95,95);
        LL.setBounds(435,25,105,85);
        t.setBounds(80,95,75,15);
        ln.setBounds(80,118,75,15);
        l.setBounds(10,95,85,55);
        b.setBounds(350,400,90, 50);
        f.setBounds(10,35,105,135);
        addr.setBounds(75,140,90,95);
        add(LL); 
        add(b); 
        add(t);  
        add(f);
        add(l);
        add(ln);
        add(add);
        add(addr);
        setSize(900,1000); 
        setTitle("Personal Details");
        setLayout(null);
        setVisible(true); 
    }     
  
public static void main(String[] args)
{
    swing_forms obj = new swing_forms();  
}  
}