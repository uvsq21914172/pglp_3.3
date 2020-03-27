package fr.uvsq21914172.pglp33;

public class Position {
  private int xpos;
  private int ypos;

  public Position(int x, int y) {
    this.xpos = x;
    this.ypos = y;
  }

  public Position(Position pos) {
    this.xpos = pos.xpos;
    this.ypos = pos.ypos;
  }

  public int getX() {
    return xpos;
  }

  public void setX(int x) {
    this.xpos = x;
  }

  public int getY() {
    return ypos;
  }

  public void setY(int y) {
    this.ypos = y;
  }
}
