Bacteria [] colony;


 void setup()   
 {     

 	size(500,500);
 	colony = new Bacteria[130];
 	for(int i = 0; i < colony.length; i++)
 	{
 		colony [i] = new Bacteria((int)(Math.random()*500),(int)(Math.random()*500));
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
     void move()

    {

    myX = myX + (int)(Math.random()*7)-3;
    myY = myY + (int)(Math.random()*7)-3;

    }



void show()
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
	mySize += 1 ;

}
if(mousePressed && mouseButton == RIGHT)
{
  cirX = mouseX;
  cirY = mouseY;
}
 fill(0,150,150); 
 ellipse(cirX, cirY, 15, 15);
if(mySize > 50)
{
	mySize = 5;
}
if(get(myX,myY) == color(0,150,150))
{
	mySize +=2;
}
}

   




 	//lots of java!   
 }    