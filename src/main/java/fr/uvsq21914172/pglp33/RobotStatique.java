package fr.uvsq21914172.pglp33;

public class RobotStatique {
  protected Position position;
  protected Direction direction;

  public RobotStatique(Direction direction, int x, int y) {
    this.direction = direction;
    this.position = new Position(x, y);
  }

  public Position getPosition() {
    return position;
  }

  public void setPosition(Position position) {
    this.position = position;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

}
