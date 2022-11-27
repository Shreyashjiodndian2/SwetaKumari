
// Convert millimeter into inches, meters, and kilometers as per user's choice
import java.awt.Graphics;
import java.awt.*;
import java.applet.*;

public class First extends Applet {
    TextField t1;
    Label l1;
    Button b1;
    Choice c1;
    String s1;
    Float n1;

    public void init() {
        t1 = new TextField(10);
        l1 = new Label("Enter millimeter");
        b1 = new Button("Convert");
        c1 = new Choice();
        c1.add("Inches");
        c1.add("Meters");
        c1.add("Kilometers");
        add(l1);
        add(t1);
        add(c1);
        add(b1);
        c1.addItemListener(l -> {
            s1 = c1.getSelectedItem();
            repaint();
        });
        b1.addActionListener(l -> {
            n1 = Float.parseFloat(t1.getText());
            repaint();
        });
        t1.addActionListener(l -> {
            n1 = Float.parseFloat(t1.getText());
            repaint();
        });
    }

    public void paint(Graphics g) {
        s1 = t1.getText();
        n1 = Float.parseFloat(s1);
        if (c1.getSelectedItem().equals("Inches")) {
            g.drawString("Inches: " + n1 / 25.4, 20, 100);
        } else if (c1.getSelectedItem().equals("Meters")) {
            g.drawString("Meters: " + n1 / 1000.0, 20, 100);
        } else if (c1.getSelectedItem().equals("Kilometers")) {
            g.drawString("Kilometers: " + n1 / 1000000.0, 20, 100);
        }
    }

    // public void paint(Graphics g) {
    // int a = 0, b = 0, c = 0;
    // String str1, str2, str;

    // g.drawString("Enter the length in millimeter", 10, 50);

    // try {
    // str1 = t1.getText();
    // a = Integer.parseInt(str1);
    // } catch (NumberFormatException e) {
    // g.drawString("Invalid input", 10, 100);
    // } catch (Exception e) {
    // g.drawString("Exception", 10, 100);
    // }
    // b = a / 1000;
    // c = a % 1000;
    // str = "The length in meter is " + b + " meter and " + c + " millimeter";
    // g.drawString(str, 10, 100);

    // // c = a;

    // // str = String.valueOf(c);

    // // g.drawString("Sum is", 10, 15);
    // // g.drawString(str, 100, 75);
    // }
}