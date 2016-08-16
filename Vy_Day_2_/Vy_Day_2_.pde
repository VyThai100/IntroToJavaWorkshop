void setup () 
{
  size(500, 500);
  background (0, 255, 170);
} 
void draw ()
{

  ellipse(mouseX, mouseY, 29, 29);
  ellipse (40, 40, 28, 28);
  ellipse (60, 22, 29, 29);
  if (mousePressed)
  {
    fill(random(255),random(255),random(255));
  } else {
    fill(238, 85, 119);
  }
}

