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
 	colony = new Bacteria[100];
 	for(int i = 0; i < colony.length; i++)
 	{
 		colony [i] = new Bacteria((int)(Math.random()*500),(int)(Math.random()*500));
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
 	int mySize;
 	int cirX;
 	int cirY;

 	Bacteria(int x, int y)
 	{
 		myX = x;
 		myY = y;
 		myColor = color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
        mySize = 10;
        cirX = -10;
        cirY = -10;
    }
     public void move()

    {

    myX = myX + (int)(Math.random()*7)-3;
    myY = myY + (int)(Math.random()*7)-3;

    }



public void show()
{
noFill();
//fill(myColor);
stroke(myColor);
ellipse(myX, myY, mySize, mySize);
if(myX > 500)
{
	myX = 250;
}
if(myX < 0)
{
	myX = 250;
}
if(myY > 500)   
{
   myY = 250;
}
if(myY < 0)
{ 
   myY = 250;
}
if(mousePressed && mouseButton == LEFT)
{
	mySize += 1;
}
if(mousePressed && mouseButton == RIGHT)
{
  cirX = mouseX;
  cirY = mouseY;
}
 fill(0,150,150); 
 ellipse(cirX, cirY, 20, 20);
if(mySize > 50)
{
	mySize = 5;
}
if(get(myX,myY) != color(0))
{
	mySize +=1;
}
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
