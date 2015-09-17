import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] colony;

 public void setup()   
 {     
 	size(500,500);
 	colony = new Bacteria[5];
 	for(int i = 0; i < colony.length; i++)
 	{
 		colony [i] = new Bacteria(250,250);
 	}	
 }
 public void draw()   
 {    
 	background(0);
 	for(int i = 0; i < colony.length; i++)
 	{
 	colony[i].move();
 	colony[i].show();	
 	}
 
 }  
 

 class Bacteria    
 {  
 	int myX;
 	int myY;
 	int myColor;

 	Bacteria(int x, int y)
 	{
 		myX = x;
 		myY = y;
 		myColor = color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));

 	}

 
public void move()
{
 myX = myX + (int)(Math.random()*3)-1;
 myY = myY + (int)(Math.random()*3)-1;

}



public void show()
{
fill(myColor);
ellipse(myX, myY, 10, 10);

}
 





 	//lots of java!   
 }    
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
