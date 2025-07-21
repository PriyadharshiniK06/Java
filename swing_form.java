import javax.swing.*;
public class swing_form
{   
public static void main(String[]args)
    {

        JFrame f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(90,85,75,95);
        f.add(b);
        f.setSize(460,580);
        f.setLayout(null);
        f.setVisible(true);

    }    


}