/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario_runner;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author SHEKHAR
 */
public class GameStartMenu implements ActionListener {
    private JPanel jp = new JPanel();
    private JButton start = new JButton("Start");
    private JButton quit = new JButton("Quit");
    
   /*  public static void start(){
     Gameplay g = new Gameplay();
     g.setVisible(true);
    }*/
    
    public void Display(){
    JFrame jf = new JFrame();
    jf.setSize(500,500);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setResizable(false);
    jf.setVisible(true);
    jp.setSize(500,500);
    jp.setVisible(true);
    jp.setBackground(Color.BLACK);
    jp.setLayout(null);
    jf.add(jp);
    }
    
    public void GameStartMenu(){
        
        Display();
    start.setSize(100,35);
    start.setLocation(200,170);
    start.setVisible(true);
    start.addActionListener(this);
    jp.add(start);
    
    quit.setSize(100,35);
    quit.setLocation(200, 250);
    quit.setVisible(true);
    quit.addActionListener(this);
    jp.add(quit);
    
  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==start){
    Gameplay g = new Gameplay();
      
    } 
    if(e.getSource()==quit){
    System.exit(0);
    }
   
    }
}
