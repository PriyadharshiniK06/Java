import java.awt.*;
class AWT {
    AWT(){
        Frame f = new Frame();
        Label l= new Label("This is a AWT example");
        TextField t = new TextField();
        Label fn = new Label("First Name:");
        Label ln = new Label("Last Name: ");
        Label Hob = new Label("My hobby is : ");
        Label col = new Label("My favorite colour is : ");
        Button b = new Button("Submit");
        l.setBounds(100,10,75,80);
        b.setBounds(100,300,80,75);
        t.setBounds(160,85,75,20);
        fn.setBounds(90,75,190,49);
        ln.setBounds(90,95,190,65);
        Hob.setBounds(90,125,195,86);
        col.setBounds(90,155,197,137);
        f.add(b);
        f.add(l);
        f.add(t);
        f.add(fn);
        f.add(ln);
        f.add(Hob);
        f.add(col);
        f.setSize(290,350);
        f.setTitle("this is an sample awt program");
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[]args)
    {
        AWT objecAwt = new AWT();
    }
}
