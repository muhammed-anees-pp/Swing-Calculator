import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {
    public Calculator (){
        JFrame jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(200,200);

        //Display
        JLabel displayLabel=new JLabel("123");
        displayLabel.setBounds(30,50,540,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        //Button
        JButton sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        jf.add(sevenButton);

        JButton eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        jf.add(eightButton);

        JButton nineButton=new JButton("9");
        nineButton.setBounds(230,130,80,80);
        jf.add(nineButton);

        JButton fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        jf.add(fourButton);

        JButton fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        jf.add(fiveButton);

        JButton sixButton=new JButton("6");
        sixButton.setBounds(230,230,80,80);
        jf.add(sixButton);

        JButton oneButton=new JButton("1");
        oneButton.setBounds(30,330,80,80);
        jf.add(oneButton);

        JButton twoButton=new JButton("2");
        twoButton.setBounds(130,330,80,80);
        jf.add(twoButton);

        JButton threeButton=new JButton("3");
        threeButton.setBounds(230,330,80,80);
        jf.add(threeButton);

        JButton dotButton=new JButton(".");
        dotButton.setBounds(30,430,80,80);
        jf.add(dotButton);

        JButton zeroButton=new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        jf.add(zeroButton);

        JButton equalButton=new JButton("=");
        equalButton.setBounds(230,430,80,80);
        jf.add(equalButton);

        JButton divButton=new JButton("/");
        divButton.setBounds(330,130,80,80);
        jf.add(divButton);

        JButton multButton=new JButton("x");
        multButton.setBounds(330,230,80,80);
        jf.add(multButton);

        JButton subtractButton=new JButton("-");
        subtractButton.setBounds(330,330,80,80);
        jf.add(subtractButton);

        JButton addButton=new JButton("+");
        addButton.setBounds(330,430,80,80);
        jf.add(addButton);




        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
