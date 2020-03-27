package fr.uvsq21914172.pglp33;

public enum Direction {
  EAST {
    /**
     * Fonction permettant de determiner la position aprés un pas dans la direction courante.
     * 
     * @param pos position initiale.
     * @return position aprés le pas.
     */
    public Position avancer(Position pos) {
      Position newpos = new Position(pos);
      newpos.setX(newpos.getX() + 1);
      return newpos;
    }

    /**
     * Fonction permettant de déterminer la nouvelle direction aprés rotation.
     * 
     * @param direction direction relative de la rotation.
     * @return retourne la nouvelle direction.
     */
    public Direction tourner(RelativeDirection direction) {
      switch (direction) {
        case RIGHT:
          return SOUTH;
        case LEFT:
          return NORTH;
        default:
          return EAST;
      }
    }
  },
  WEST {
    /**
     * Fonction permettant de determiner la position aprés un pas dans la direction courante.
     * 
     * @param pos position initiale.
     * @return position aprés le pas.
     */
    public Position avancer(Position pos) {
      Position newpos = new Position(pos);
      newpos.setX(newpos.getX() - 1);
      return newpos;
    }

    /**
     * Fonction permettant de déterminer la nouvelle direction aprés rotation.
     * 
     * @param direction direction relative de la rotation.
     * @return retourne la nouvelle direction.
     */
    public Direction tourner(RelativeDirection direction) {
      switch (direction) {
        case RIGHT:
          return NORTH;
        case LEFT:
          return SOUTH;
        default:
          return WEST;
      }
    }
  },
  SOUTH {
    /**
     * Fonction permettant de determiner la position aprés un pas dans la direction courante.
     * 
     * @param pos position initiale.
     * @return position aprés le pas.
     */
    public Position avancer(Position pos) {
      Position newpos = new Position(pos);
      newpos.setY(newpos.getY() - 1);
      return newpos;
    }

    /**
     * Fonction permettant de déterminer la nouvelle direction aprés rotation.
     * 
     * @param direction direction relative de la rotation.
     * @return retourne la nouvelle direction.
     */
    public Direction tourner(RelativeDirection direction) {
      switch (direction) {
        case RIGHT:
          return WEST;
        case LEFT:
          return EAST;
        default:
          return SOUTH;
      }
    }
  },
  NORTH {
    /**
     * Fonction permettant de determiner la position aprés un pas dans la direction courante.
     * 
     * @param pos position initiale.
     * @return position aprés le pas.
     */
    public Position avancer(Position pos) {
      Position newpos = new Position(pos);
      newpos.setY(newpos.getY() + 1);
      return newpos;
    }

    /**
     * Fonction permettant de déterminer la nouvelle direction aprés rotation.
     * 
     * @param direction direction relative de la rotation.
     * @return retourne la nouvelle direction.
     */
    public Direction tourner(RelativeDirection direction) {
      switch (direction) {
        case RIGHT:
          return EAST;
        case LEFT:
          return WEST;
        default:
          return NORTH;
      }
    }
  };

  /**
   * Fonction permettant de determiner la position aprés un pas dans la direction courante.
   * 
   * @param pos position initiale.
   * @return position aprés le pas.
   */
  public abstract Position avancer(Position pos);

  /**
   * Fonction permettant de déterminer la nouvelle direction aprés rotation.
   * 
   * @param direction direction relative de la rotation.
   * @return retourne la nouvelle direction.
   */
  public abstract Direction tourner(RelativeDirection direction);
}
