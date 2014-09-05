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

public class Lightning extends PApplet {

int startX = 0; 
int startY = 150;
int endX = 0; 
int endY = 150;


public void setup()
{ 
	size(600,600);
	strokeWeight(5);
	background(0,0,40);


}
public void draw()
{
	int randcolor1 = (int)(Math.random()*401);
	int randcolor2 = floor(random(1,400));
	int randcolor3 = floor(random(1,400));
	int randinteger1 = (int)(Math.random()*11)+1;
	int randinteger2 = (int)(Math.random()*18)-9;
	stroke(randcolor1,randcolor2,randcolor3);

	while(endX < 300){
	endX = startX + randinteger1;
	println(endX);
	endY = startY + randinteger2;

	line(startX,startY,endX,endY);

	
	}startX = endX;
	startY = endY;
	

}
public void mousePressed()
{	
	startX = 0;
	startY = 150;
	endX = 0; 
	endY = 150;


}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
