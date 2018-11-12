package interfacegraf;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ice
 */
public class InterfaceGraf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame frame1 = new JFrame("Hello World");
        JLabel label1 = new JLabel("1");
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");      
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        frame1.getContentPane().add(panel1);
        panel1.add(label1);
        
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                Object[] opcao = {"NAOM","NUM"};
                JOptionPane.showOptionDialog(frame1,"AUIERSAHI","hftq3n32ng",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcao,opcao[1]);
            }

        });
        
        panel1.add(b1, BorderLayout.NORTH);
        panel1.add(b2, BorderLayout.SOUTH);
        panel1.add(b3, BorderLayout.EAST);
        panel1.add(b4, BorderLayout.WEST);
        panel1.add(b5, BorderLayout.CENTER);
        
        
        

        frame1.pack();
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}
