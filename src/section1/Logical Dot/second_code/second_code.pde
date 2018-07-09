PImage rainbow;
PImage unicorn;
void setup(){
rainbow = loadImage("rain-b.jpg");
size(800,600);
rainbow.resize(width,height);
unicorn = loadImage("bluecorn.png");
unicorn.resize(300,250);
}
void draw(){
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}