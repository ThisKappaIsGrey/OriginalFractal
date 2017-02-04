int len = 500;
int siz = 500;
int count = 0;
PImage img;
public void setup()
{
	size(500, 500);
  background(0);
  img = loadImage("Kappa.png");
}
public void draw()
{
 sierpinski(0, 500, 500);

}

public void sierpinski(int x, int y, int len)
{
if(len <= 20){
	image(img,x, y, height/len, width/len);
}else{
  fill((float)(Math.random() * 255), (float)(Math.random() * 255), (float)(Math.random() * 255));
	sierpinski(x, y, len/2);
	sierpinski(x+len/2, y, len/2);
	sierpinski(x+len/4, y - len/2, len/2);
}
}
