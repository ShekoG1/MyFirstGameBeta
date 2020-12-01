/*
TO DO:
- set random points for points to spawn
- Fix colour save settings
 */
package mario_runner;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author SHEKHAR
 */
public class Gameplay extends JFrame{
   // Timer timer = new Timer(100,this);
    JPanel jp;
   Image image;
   Graphics graphics;
   controls player;
   controls enemy;
   controls point;
   // bounds
   controls bounds1;
   controls bounds2;
   controls bounds3;
   controls bounds4;
   // controls points
   int points = 0;
   Color col = Color.GREEN;
   JButton jb = new JButton();
   
      Gameplay(){
        
        setVisible(false);
    setBackground(Color.BLACK);
        player = new controls(300,400,50,50,Color.blue);
        enemy = new controls(300,300,50,50,Color.red);
        point =new controls(300,200,50,50,Color.YELLOW);
        // bounds
        bounds1 =new controls(0,0,50,700,col);
         bounds2 =new controls(0,0,850,50,col);
          bounds3 =new controls(800,50,50,700,col);
           bounds4 =new controls(0,650,800,50,col);
    //Frame settings
    this.setSize(850,700);
    this.setResizable(false);
   //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.setVisible(true);
    this.addKeyListener(new useControls());
    }
    
    @Override
   public void paint(Graphics g){
    image = createImage(this.getWidth(),this.getHeight());
    graphics = image.getGraphics();
    g.drawImage(image,0,0,this);
    
    player.draw(g);
    enemy.draw(g);
    point.draw(g);
    bounds1.draw(g);
    bounds2.draw(g);
    bounds3.draw(g);
    bounds4.draw(g);
    }
   
    public void checkCollision(){
        // declarations
        int playerX = player.x;
       int playerY = player.y;
        
    if(player.intersects(enemy)){
        GameOver();
    }
    if(player.intersects(point)){
        point.setLocation(600,600);
        points++;
    }
    //checks collision with bounds 1 - 4
    //1
    if(player.intersects(bounds1)){
        playerX = player.x+750;
        playerY = player.y;
        player.setLocation(playerX,playerY);
    }
     //2
    if(player.intersects(bounds2)){
        playerX = player.x;
        playerY = player.y+600;
        player.setLocation(playerX,playerY);
    }
     //3
    if(player.intersects(bounds3)){
        playerX = player.x-750;
        playerY = player.y;
        player.setLocation(playerX,playerY);
    }
      //4
    if(player.intersects(bounds4)){
        playerX = player.x;
        playerY = player.y-600;
        player.setLocation(playerX,playerY);
    }
    }

    public void GameOver(){
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        GameOverMenu gom = new GameOverMenu();
        gom.GameOverMenuMenu();
    }
    
  class useControls extends KeyAdapter{
  
      @Override
      public void keyPressed(KeyEvent e){
      player.keyPressed(e);
      checkCollision();
        repaint();
      }
      
  }
    }
class settings extends Gameplay{
JRadioButton ToggleCol;

public void toggleCol(){
ToggleCol = new JRadioButton("ToggleCol");
ToggleCol.setSize(40,20);

}
}

