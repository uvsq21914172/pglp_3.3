package fr.uvsq21914172.pglp33;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.uvsq21914172.pglp33.Direction;
import fr.uvsq21914172.pglp33.Robot;

public class RobotTest {

  @Test
  public void testRobotAvancerNord() {
    Robot e = new Robot(Direction.NORTH, 10, 10);
    e.avancer();
    assertEquals(10, e.getPosition().getX());
    assertEquals(11, e.getPosition().getY());
  }

  @Test
  public void testRobotAvancerSud() {
    Robot e = new Robot(Direction.SOUTH, 10, 10);
    e.avancer();
    assertEquals(10, e.getPosition().getX());
    assertEquals(9, e.getPosition().getY());
  }

  @Test
  public void testRobotAvancerEst() {
    Robot e = new Robot(Direction.EAST, 10, 10);
    e.avancer();
    assertEquals(11, e.getPosition().getX());
    assertEquals(10, e.getPosition().getY());
  }

  @Test
  public void testRobotAvancerOuest() {
    Robot e = new Robot(Direction.WEST, 10, 10);
    e.avancer();
    assertEquals(9, e.getPosition().getX());
    assertEquals(10, e.getPosition().getY());
  }

  @Test
  public void testRobotAvancerTous() {
    Robot e = new Robot(Direction.WEST, 10, 10);
    Robot f = new Robot(Direction.EAST, 10, 10);
    Robot g = new Robot(Direction.NORTH, 10, 10);
    Robot.avancerTous();
    assertEquals(9, e.getPosition().getX());
    assertEquals(10, e.getPosition().getY());
    assertEquals(11, f.getPosition().getX());
    assertEquals(10, f.getPosition().getY());
    assertEquals(10, g.getPosition().getX());
    assertEquals(11, g.getPosition().getY());
  }

}
