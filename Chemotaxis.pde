Bacteria [] colony;

 void setup()   
 {     
 	size(500,500);
 	colony = new Bacteria[5];
 	for(int i = 0; i < colony.length; i++)
 	{
 		colony [i] = new Bacteria(250,250);
 	}	
 }
 void draw()   
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

 
void move()
{
 myX = myX + (int)(Math.random()*3)-1;
 myY = myY + (int)(Math.random()*3)-1;

}



void show()
{
fill(myColor);
ellipse(myX, myY, 10, 10);

}
 





 	//lots of java!   
 }    