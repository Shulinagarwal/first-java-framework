package zjframes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {
  public static void main(String[] args) {
    ImageIcon image=new ImageIcon("C:\\java\\zjframes\\dude1.png");
    Border border=BorderFactory.createLineBorder(Color.green,3);

    JLabel label=new JLabel();
    label.setText("bro,do you even code?");//set text of label
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);//set text LEFT,RIGHT,CENTER of imageicon
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(new Color(0x00ff00));//set color of text
    label.setFont(new Font("MV Boli",Font.PLAIN,20));//set font of text
    label.setIconTextGap(2);//set gap of text to image
    label.setBackground(Color.black);
    label.setOpaque(true);
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
    label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
    //label.setBounds(100, 100, 300, 300);//set x,y position within frame as well as dimensions
    
    JFrame frame=new JFrame();//creates the frame
    frame.setTitle("jframe title goes here");//set title of frame
    //frame.setSize(450,420);//set the x dimensions , y-dimensions
    frame.setVisible(true);//make frame visible
    frame.add(label);
    
   frame.pack();//set the size of frame with what you have written in it
    //we have to add label before pack

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of application 
    //frame.setResizable(false);//prevemt frome being resized

    //frame.setLayout(null);
    // initially set at manager

    //frame.getContentPane().setBackground(Color.BLACK);//change color of background 
    frame.getContentPane().setBackground(new Color(255,255,255));//custom colors
    // new Myframe();
   

  }  
}
