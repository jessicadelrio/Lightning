int startX = 300; 
int startY = 0;
int endX = 250; 
int endY = 10;


void setup()
{ 
	size(600,600);
	strokeWeight(5);
	background(0,0,40);


}
void draw()
{

	

}
void mousePressed()
{	int randcolor1 = (int)(Math.random()*401);
	int randcolor2 = floor(random(1,400));
	int randcolor3 = floor(random(1,400));
	int randinteger1 = (int)(Math.random()*50);
	int randinteger2 = (int)(Math.random()*90);
	
	stroke(randcolor1,randcolor2,randcolor3);
	line(startX,startY,endX,endY);

	startX = endX;
	startY = endY;
	endX = startX + randinteger1;
	endY = startY + randinteger2;
	if(endY > 650){
	startX = 360;
	startY = 0;
	endX = 150;
	endY = 20;
	}
	
	


}

