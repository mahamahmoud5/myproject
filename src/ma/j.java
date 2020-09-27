/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author DELL
 */
public class j extends JFrame implements ActionListener{ 
    static double a,b,result=0;
   static char ch;
	static int operator=0;
  String s0, s1, s2; 
    char op; 
    double number, answer;
    int calculation;
    double firstNum = 0; 
double secondNum = 0;
 char amalgar;
char of;
 
 JLabel label = new JLabel();
    JPanel p2=new JPanel();
      JTextField f=new JTextField();
      JButton b1=new JButton(" 1 ");
      JButton b2=new JButton(" 2 ");
      JButton b3=new JButton(" 3 ");
      JButton b4=new JButton(" 4 ");
      JButton b5=new JButton(" 5 ");
      JButton b6=new JButton(" 6 ");
      JButton b7=new JButton(" 7 ");
      JButton b8=new JButton(" 8 ");
      JButton b9=new JButton(" 9 ");
      JButton b10=new JButton(" 0 ");
      JButton b11=new JButton(" + ");
      JButton b12=new JButton(" - ");
       JButton b17=new JButton(" * ");
      JButton b18=new JButton(" / ");
      JButton b13=new JButton(" sin ");
      JButton b14=new JButton(" cos ");
      JButton b15=new JButton(" tan ");
      JButton b16=new JButton(" = ");
       JButton b19=new JButton(" As ");
      JButton b20=new JButton(" Del ");
      JButton b21=new JButton(" Off ");
       JButton b22=new JButton(" 1/ ");
      JButton b23=new JButton(" ^2 ");
      JButton b24=new JButton(" . ");
      JButton b25=new JButton(" % ");
        JButton b26=new JButton(" log ");
      public j(){
          this.setTitle("calculator");
          this.setSize(380, 520);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setVisible(true);
          this.setResizable(false);
          this.setLocation(100, 10);
         
          p2.setBackground(Color.BLACK);
         this.setLayout(new GridLayout());
          p2.setLayout(null);
         f.setBounds(20, 30, 330, 50);
         p2.add(f);
          this.add(p2);
         b11.setBackground(Color.GRAY);
        b11.setForeground(Color.darkGray);
         b17.setBackground(Color.GRAY);
        b17.setForeground(Color.darkGray);
         b18.setBackground(Color.GRAY);
        b18.setForeground(Color.darkGray);
        b12.setBackground(Color.GRAY);
        b12.setForeground(Color.darkGray);
        b21.setBackground(Color.red);
        b3.setBounds(140, 350, 50, 50);
        b2.setBounds(80, 350, 50, 50);
        b1.setBounds(20, 350, 50, 50); 
        b4.setBounds(140, 290, 50, 50);
        b5.setBounds(80, 290, 50, 50);
        b6.setBounds(20, 290, 50, 50);
        b7.setBounds(20, 230, 50, 50); 
        b8.setBounds(80, 230, 50, 50);
        b9.setBounds(140, 230, 50, 50);
        b10.setBounds(20, 410, 100, 50); 
        b11.setBounds(220, 350,60,50); 
        b12.setBounds(290, 350, 60, 50);
        b13.setBounds(20, 100,70, 50 );
        b14.setBounds(100, 100, 70, 50);
        b15.setBounds(180, 100, 70, 50);   
        b16.setBounds(240, 410, 110, 50);
        b17.setBounds(220, 290, 60, 50);
        b18.setBounds(290, 290, 60, 50);
        b19.setBounds(280, 160, 70, 50);
        b20.setBounds(280, 220, 70, 50);
        b21.setBounds(260, 100, 90, 50);
        b22.setBounds(20, 160, 70, 50);
        b23.setBounds(100, 160, 70, 50);
        b24.setBounds(130, 410, 100, 50);
        b25.setBounds(190, 160, 70, 50);
        b26.setBounds(200, 220, 70, 60);
       p2.add(b1);p2.add(b2);p2.add(b5);p2.add(b3);p2.add(b4);
         p2.add(b6);p2.add(b7);p2.add(b8);p2.add(b9);p2.add(b10);
        p2.add(b11);p2.add(b12);p2.add(b13);p2.add(b14);p2.add(b15);
         p2.add(b16);p2.add(b17);
        p2.add(b18);p2.add(b19);p2.add(b20);p2.add(b21);p2.add(b22);
         p2.add(b23);p2.add(b24);p2.add(b25);p2.add(b26);
                b1.addActionListener(this);
		b2.addActionListener( this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
                b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
                b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
                b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
                b23.addActionListener(this);
		b24.addActionListener(this);
		b25.addActionListener(this);
		b26.addActionListener(this);
  
  
  
    } 
    @Override
      public void actionPerformed(ActionEvent e)
	{ Object source = e.getSource();
        
		if(e.getSource()==b1)
			f.setText(f.getText().concat("1"));
		
		if(e.getSource()==b2)
			f.setText(f.getText().concat("2"));
		
		if(e.getSource()==b3)
			f.setText(f.getText().concat("3"));
		
		if(e.getSource()==b4)
			f.setText(f.getText().concat("4"));
		
		if(e.getSource()==b5)
			f.setText(f.getText().concat("5"));
		
		if(e.getSource()==b6)
			f.setText(f.getText().concat("6"));
		
		if(e.getSource()==b7)
			f.setText(f.getText().concat("7"));
		
		if(e.getSource()==b8)
			f.setText(f.getText().concat("8"));
		
		if(e.getSource()==b9)
			f.setText(f.getText().concat("9"));
		
		if(e.getSource()==b10)
			f.setText(f.getText().concat("0"));
                
                         
                         
    if(e.getSource()==b24)
               f.setText(f.getText() + ".");
    
   
if(e.getSource()==b25)
                f.setText(f.getText() + "%");

 if (source == b11) {
            String str = f.getText();
            number = Double.parseDouble(f.getText());
            f.setText("");
            label.setText(str + "+");
            calculation = 1;
        }  if (source == b12) {
            String str = f.getText();
            number = Double.parseDouble(f.getText());
           f.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == b17) {
            String str = f.getText();
            number = Double.parseDouble(f.getText());
            f.setText("");
            label.setText(str + "*");
            calculation = 3;
        } else if (source == b18) {
            String str = f.getText();
            number = Double.parseDouble(f.getText());
            f.setText("");
            label.setText(str + "/");
            calculation = 4;
      
        } else if (source == b22) {
            number = Double.parseDouble(f.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                f.setText(string.replace(".0", ""));
            } else {
                f.setText(string);
            }
        } else if (source == b16) {
           //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(f.getText());
                   
                    if (Double.toString(answer).endsWith(".0")) {
                        f.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        f.setText(Double.toString(  answer));
                        
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(f.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        f.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        f.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(f.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        f.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        f.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(f.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        f.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        f.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;}}
       
if(e.getSource()==b13){
    double num = Double.parseDouble(f.getText());
double radians=Math.toRadians(num);
double val=Math.sin(radians);
f.setText("sin(" +num +") = " + val );}

   else if(e.getSource()==b14)  {
   double num = Double.parseDouble(f.getText());
double radians=Math.toRadians(num);
double val=Math.cos(radians);
f.setText("");
f.setText("cos(" +num+ ") = " + val);
        }
   else if(e.getSource()==b15){
     double num = Double.parseDouble(f.getText());
double radians=Math.toRadians(num);
double val=Math.tan(radians);
f.setText("tan(" +num+  ") = " + val);
            }
if(e.getSource()==b26){
          double num = Double.parseDouble(f.getText());
double rad=Math.toDegrees(num);
double val=Math.log(num);
f.setText("log(" +num+ ") = " + val );
}
         if(e.getSource()==b23){
              // f.setText(f.getText() + "^2");
     double num = Double.parseDouble(f.getText());
double val=Math.pow(num, 2);
f.setText( num+"^2="+val);}
   

		if(e.getSource()==b22){
                 //   double a=1/(Double.parseDouble(f.getText()));
               // f.setText("");
               // f.setText("1/"+a);}
			//f.setText(f.getText().concat("1/"));
                 double num=  Double.parseDouble(f.getText());f.setText("");
                   double val=1/num; 
f.setText("1/"+val);
                }
if(e.getSource()==b19)
			f.setText("");
		
		if(e.getSource()==b20)
		{
			String s=f.getText();
			f.setText("");
			for(int i=0;i<s.length()-1;i++)
			f.setText(f.getText()+s.charAt(i));
        
       
        
        

  
                }
}}












