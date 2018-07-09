PImage mustache;
PImage friend;
void setup(){
  friend = loadImage("weirdo.jpg");
  size(800,600);
  friend.resize(width,height);
  mustache = loadImage("black-m.png");
  background(friend);
}
void draw(){
  if(mousePressed)
  {
    background(friend);
  image(mustache, mouseX,mouseY);
  }
}