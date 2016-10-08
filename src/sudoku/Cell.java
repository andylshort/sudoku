package sudoku;

public class Cell {

  private int row, col;

  
  /*
   * Constructor
   */
  public Cell(int row, int col) {
    this.row = row;
    this.col = col;
  }
  

  /*
   * Accessors
   */
  public int getRow() {
    return row;
  }

  public int getColumn() {
    return col;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + row;
    result = prime * result + col;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null) {
      return false;
    }

    if (getClass() != obj.getClass()) {
      return false;
    }

    Cell other = (Cell) obj;
    if (row != other.row || col != other.col) {
      return false;
    }

    return true;
  }

}