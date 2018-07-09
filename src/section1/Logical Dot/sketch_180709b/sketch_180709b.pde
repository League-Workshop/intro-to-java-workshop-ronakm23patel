void setup() {
  size(800, 800);
}
void draw() {
  ellipse(mouseX, mouseY, 100, 100);
  fill(#B703FF);
  if (mousePressed) {
    fill(#B200FA);
  } else {
    fill(#FF7403);
  }
}