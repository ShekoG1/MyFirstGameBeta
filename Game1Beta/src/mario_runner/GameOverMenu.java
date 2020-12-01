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
public class GameOverMenu extends GameStartMenu implements ActionListener {
    private JPanel jp = new JPanel();
    private JButton restart = new JButton("Restart");
    private JButton quit = new JButton("Quit");
    private JLabel points = new JLabel();
    
    public void Display(){
        
    JFrame jf = new JFrame();
    jf.setSize(500,500);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setVisible(true);
    jf.setResizable(false);
    jp.setSize(500,500);
    jp.setVisible(true);
    jp.setBackground(Color.BLACK);
    jp.setLayout(null);
    jf.add(jp);
    }
    
    public void GameOverMenuMenu(){
    Gameplay g = new Gameplay();
        
        Display();
    restart.setSize(100,35);
    restart.setLocation(200, 250);
    restart.setVisible(true);
    restart.addActionListener(this);
    jp.add(restart);
    
    quit.setSize(100,35);
    quit.setLocation(200, 210);
    quit.setVisible(true);
    quit.addActionListener(this);
    jp.add(quit);
    
    points.setSize(100,35);
    points.setLocation(100, 210);
    points.setVisible(true);
    points.setForeground(Color.WHITE);
    points.setText("Points: "+Integer.toString(g.points));
    jp.add(points);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==restart){
      Gameplay g = new Gameplay();
    }
    if(e.getSource()==quit){
    System.exit(0);
    }
    }
    
}
