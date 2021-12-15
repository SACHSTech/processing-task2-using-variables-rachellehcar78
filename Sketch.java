import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   ***/
  public void settings() {
	// put your size call here
    size(500, 800);
  }

  /**   
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(94, 218, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff    
    // Petal #1
    stroke(87);
    fill(255, 122, 235);
    ellipse((float)(width/2.5), (float)(height/3.2), (float)(width/5), (float)(height/8));
    
    // Petal #2
    stroke(87);
    fill(255, 122, 235);
    ellipse((float)(width/2.5), (float)(height/2.666), (float)(width/5),(float)(height/8));
    
    // Petal #3
    stroke(87);
    fill(255, 122, 235);
    ellipse((float)(width/2), (float)(height/2.461538), (float)(width/5), (float)(height/8));
    
    // Petal #4
    stroke(87);
    fill(255, 122, 235);
    ellipse((float)(width/1.639), (float)(height/2.666), (float)(width/5), (float)(height/8));
    
    // Petal #5
    stroke(87);
    fill(255, 122, 235);
    ellipse((float)(width/1.639), (float)(height/3.2), (float)(width/5), (float)(height/8));
    
    // Petal #6
    stroke(87);
    fill(255, 122, 235);
    ellipse((float)(width/1.8181), (float)(height/4), (float)(width/5), (float)(height/8));
    
    // Petal #7
    stroke(87);
    fill(255, 122, 235);
    ellipse((float)(width/2.222), (float)(height/4), (float)(width/5), (float)(height/8));
    
	  // Middle Part
    stroke(87);
    fill(255, 238, 56);
    ellipse((float)(width/2), (float)(height/3.076923), (float)(width/10), (float)(height/16));
    
    // Stem
    stroke(87);
    fill(21, 191, 30);
    rect((float)(width/2.0408163265), (float)(height/2.1333), (float)(width/50), (float)(height/2.666));
  }
}