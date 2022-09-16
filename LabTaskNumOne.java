// If you find some bugs, just contact me in telegram (https://t.me/VolodymyrGarasimovich) or write me to my email vovagarasimovich@gmail.com

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LabTaskNumOne implements ActionListener {

    Font myFont = new Font("Dialog", Font.BOLD, 52); // set up my font
    JButton[] functionBtns = new JButton[10];
    JButton[] numberBtns = new JButton[10];
    JButton addBtn, subBtn, mulBtn, divBtn,decBtn, clrBtn, delBtn, negBtn, eqlBtn, brkBtn;

    double num1 = 0, num2 = 0, result = 0;
    int counter = 0;
    char operator;
    JTextField textField;// process display
    JPanel panel;//button holder
    LabTaskNumOne() {

        addBtn = new JButton("+");
        functionBtns[0] = addBtn;
        subBtn = new JButton("-");
        functionBtns[1] = subBtn;
        mulBtn = new JButton("*");
        functionBtns[2] = mulBtn;
        divBtn = new JButton("/");
        functionBtns[3] = divBtn;
        decBtn = new JButton(".");
        functionBtns[4] = decBtn;
        clrBtn = new JButton("C");
        functionBtns[5] = clrBtn;
        delBtn = new JButton("<-");
        functionBtns[6] = delBtn;
        negBtn = new JButton("-()");
        functionBtns[7] = negBtn;
        eqlBtn = new JButton("=");
        functionBtns[8] = eqlBtn;
        brkBtn = new JButton("()");
        functionBtns[9] = brkBtn;


        for(JButton i:functionBtns){
            i.setFont(myFont);
            i.addActionListener(this);
            i.setFocusable(false);
            i.setForeground(new Color(0x6F6F72));
            i.setBackground(new Color (42, 41, 49));
            i.setBorder(null);
        }
        functionBtns[8].setBackground(new Color(0xE55F13));

        for(int i=0; i<10; i++){
            numberBtns[i] = new JButton(String.valueOf(i));
            numberBtns[i].setFont(myFont);
            numberBtns[i].setForeground(new Color(0x6F6F72));
            numberBtns[i].setBackground(new Color (42, 41, 49));
            numberBtns[i].addActionListener(this);
            numberBtns[i].setFocusable(false);
            numberBtns[i].setBorder(null);
        }

        textField = new JTextField();// process display
        textField.setBounds(0, 0, 500, 163);
        textField.setEditable(false);
        textField.setFont(myFont);
        textField.setBorder(BorderFactory.createMatteBorder(15, 10, 20, 10, new Color(27, 25, 31)));
        textField.setBackground(new Color(27, 25, 31));
        textField.setForeground(new Color(0x6F6F72));

        panel = new JPanel();//button holder
        panel.setLayout(new GridLayout(5, 4,10,10));
        panel.setBorder(BorderFactory.createMatteBorder(15, 8, 15, 8, new Color(27, 25, 31)));
        panel.setBackground(new Color(27, 25, 31));
        panel.setBounds(0,163,500, 500 );

        panel.add(functionBtns[5]);//first panel row
        panel.add(functionBtns[6]);
        panel.add(functionBtns[9]);
        panel.add(functionBtns[3]);
        panel.add(numberBtns[7]);//second panel row
        panel.add(numberBtns[8]);
        panel.add(numberBtns[9]);
        panel.add(functionBtns[2]);
        panel.add(numberBtns[4]);//third panel row
        panel.add(numberBtns[5]);
        panel.add(numberBtns[6]);
        panel.add(functionBtns[1]);
        panel.add(numberBtns[1]);//fourth panel row
        panel.add(numberBtns[2]);
        panel.add(numberBtns[3]);
        panel.add(functionBtns[0]);
        panel.add(functionBtns[7]);//fifth panel row
        panel.add(numberBtns[0]);
        panel.add(functionBtns[4]);
        panel.add(functionBtns[8]);

        JFrame frame = new JFrame("Calculator"); // window creation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(500, 700);
        frame.setBackground(new Color(27, 25, 31));
        frame.add(textField);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new LabTaskNumOne();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0; i<10; i++){
            if(e.getSource() == numberBtns[i]){
                if(textField.getText().equals("0")){
                    textField.setText("");
                }
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == decBtn){//decimal action
            textField.setText(textField.getText().concat("."));
        }
        if(e.getSource() == addBtn){//add action
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if(e.getSource() == subBtn){// subtraction action
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if(e.getSource() == mulBtn){// multiplying action
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if(e.getSource() == divBtn){// division action
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if(e.getSource() == eqlBtn){// equal action
            num2 = Double.parseDouble(textField.getText());
            switch (operator){
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case '/':
                    result=num1/num2;
                    break;
            }
            if(result%1==0){
                long alternateResult = (long) result;
                textField.setText(String.valueOf(alternateResult));
            }else {
                textField.setText(String.valueOf(result));
            }
            num1 = result;
        }
        if(e.getSource() == clrBtn){// division action
            textField.setText("0");
        }
        if(e.getSource() == delBtn){// division action
            textField.setText(textField.getText().substring(0, textField.getText().length()-1));
            if (textField.getText().equals("")){
                textField.setText("0");
            }
        }
        if(e.getSource() == negBtn){// division action
            double negNum = Double.parseDouble(textField.getText());
            negNum*=(-1);
            int alternateNegNum = (int) negNum;
            if(negNum%1==0){
                textField.setText(String.valueOf(alternateNegNum));
            }else {
                textField.setText(String.valueOf(negNum));
            }
        }
    }
}
