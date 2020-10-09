void setup() {
	size(500, 500);
}
double x = 125;
double y = 375;
void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!

x = x - 0.1;
y = y / 1.5;

  background(255);
  stroke(x,y,x);
  x = x + 5;
  fill(y,x,255);
ellipse(x,x,x,x);
ellipse(y,x,x,x);
ellipse(y,y,x,x);
ellipse(x,y,x,x);

 
}