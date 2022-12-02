import javax.swing.*;
public class circle
{
public static void main(String[]args)
 {
String radius;
int r;
float circum;
float area;
radius=JOptionPane.showInputDialog("Input the Radius");
r=Integer.parseInt(radius);
area=(float)(3.14*r*r);
circum=(float)(2*3.14*r);
JOptionPane.showMessageDialog(null,"The area of the circle is "+circum+
"\nAnd the circumference of the circle is "+area,
"Here is the computed area and circumference of the circle",JOptionPane.INFORMATION_MESSAGE);
System.exit(0);
 }
}
