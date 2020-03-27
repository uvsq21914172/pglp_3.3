package fr.uvsq21914172.pglp33;

import java.util.ArrayList;
import java.util.List;

public class Robot extends RobotStatique {

  private static List<Robot> robots = new ArrayList<Robot>();

  public Robot(Direction direction, int x, int y) {
    super(direction, x, y);
    robots.add(this);
  }

  /**
   * Fonction faisant avancer tout les robots.
   */
  public static void avancerTous() {
    for (Robot r : robots) {
      r.avancer();
    }
  }

  /**
   * Fonction faisant avancer le personnage.
   */
  public void avancer() {
    position = direction.avancer(position);
  }

  /**
   * Fonction faisant tourner le personnage a gauche a droite.
   * 
   * @param direction direction relative de la rotation.
   */
  public void tourner(RelativeDirection direction) {
    this.direction = this.direction.tourner(direction);
  }
}
