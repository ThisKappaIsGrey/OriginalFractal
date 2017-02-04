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

public class OriginalFractal extends PApplet {

int len = 500;
int siz = 500;
int count = 0;
PImage img;
public void setup()
{
	
  background(0);
  img = loadImage("data/Kappa.png");
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
  public void settings() { 	size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
