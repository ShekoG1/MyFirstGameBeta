/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario_runner;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;


/**
 *
 * @author SHEKHAR
 */
public class controls extends Rectangle{
     //declarations
     Color color;
     
    controls(int x, int y, int width, int height, Color color){
   this.x = x;
   this.y = y;
   this.width=width;
   this.height=height;
   this.color=color;
    }
    
    public void keyPressed(KeyEvent e){
    if(e.getKeyCode() == KeyEvent.VK_UP){
    this.y=y-50;
    }
     if(e.getKeyCode() == KeyEvent.VK_DOWN){
    this.y=y+50;
    }
      if(e.getKeyCode() == KeyEvent.VK_LEFT){
    this.x=x-50;
    }
     if(e.getKeyCode() == KeyEvent.VK_RIGHT){
    this.x=x+50;
    }
    }
    
    public void draw(Graphics g){
    g.setColor(this.color);
    g.fillRect(this.x, this.y, this.width, this.height);
    }
}

