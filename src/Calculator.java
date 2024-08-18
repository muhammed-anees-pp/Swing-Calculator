import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{

    boolean isOperatorClicked=false;
    String oldValue,operator;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton,eightButton,nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton;
    JButton zeroButton,dotButton,equalButton,clearButton,deleteButton,fakeButton;
    JButton divButton,multButton,subtractButton,addButton;

    public Calculator (){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(450,670);
        jf.setLocation(100,100);

        //Display
        displayLabel=new JLabel();
        displayLabel.setBounds(30,50,380,60);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        //Button
        sevenButton=new JButton("7");
        sevenButton.setBounds(30,230,80,80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);

        eightButton=new JButton("8");
        eightButton.setBounds(130,230,80,80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(230,230,80,80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30,330,80,80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130,330,80,80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(230,330,80,80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30,430,80,80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130,430,80,80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(230,430,80,80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);

        fakeButton=new JButton("");
        fakeButton.setBounds(30,530,80,80);
        jf.add(fakeButton);
        
        zeroButton=new JButton("0");
        zeroButton.setBounds(130,530,80,80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        dotButton=new JButton(".");
        dotButton.setBounds(230,530,80,80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.addActionListener(this);
        jf.add(dotButton);

        clearButton=new JButton("C");
        clearButton.setBounds(30,130,80,80);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
        clearButton.addActionListener(this);
        jf.add(clearButton);

        divButton=new JButton("/");
        divButton.setBounds(130,130,80,80);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divButton.addActionListener(this);
        jf.add(divButton);

        multButton=new JButton("X");
        multButton.setBounds(230,130,80,80);
        multButton.setFont(new Font("Arial", Font.PLAIN, 40));
        multButton.addActionListener(this);
        jf.add(multButton);

        //Have to set the functionality of these key
        deleteButton=new JButton("D");
        deleteButton.setBounds(330,130,80,80);
        deleteButton.setFont(new Font("Arial", Font.PLAIN, 40));
        deleteButton.addActionListener(this);
        jf.add(deleteButton);

        subtractButton=new JButton("-");
        subtractButton.setBounds(330,230,80,80);
        subtractButton.setFont(new Font("Arial", Font.PLAIN, 40));
        subtractButton.addActionListener(this);
        jf.add(subtractButton);

        addButton=new JButton("+");
        addButton.setBounds(330,330,80,80);
        addButton.setFont(new Font("Arial", Font.PLAIN, 40));
        addButton.addActionListener(this);
        jf.add(addButton);

        equalButton=new JButton("=");
        equalButton.setBounds(330,430,80,180);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equalButton.addActionListener(this);
        jf.add(equalButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"7");
            }            
        }
        else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
        }
        else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
        }
        else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
        }
        else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"5");
            }
        }
        else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
        }
        else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
        }
        else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
        }
        else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
        }
        else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }
            else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
        } 
        else if(e.getSource()==dotButton){
            displayLabel.setText(displayLabel.getText()+".");
        }
        else if(e.getSource()==equalButton){
            String newValue=displayLabel.getText();
            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);
            float result=0;

            switch (operator) {
                case "+":
                    result=oldValueF+newValueF;
                    break;
                case "-":
                    result=oldValueF-newValueF;
                    break;
                case "x":
                    result=oldValueF*newValueF;
                    break;
                case "/":
                    if(newValueF!=0){
                    result=oldValueF/newValueF;
                    }
                    else{
                        displayLabel.setText("Error");
                        return;
                    }
                    break;
            }
            displayLabel.setText(result+"");
        }
        else if(e.getSource()==divButton){
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            operator = "/";
        }
        else if(e.getSource()==multButton){
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            operator = "x";
        }
        else if(e.getSource()==subtractButton){
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            operator = "-";
        }
        else if(e.getSource()==addButton){
            isOperatorClicked=true;
            oldValue=displayLabel.getText();
            operator = "+";
        }
        else if(e.getSource()==clearButton){
            displayLabel.setText("");
        }
    }
}
