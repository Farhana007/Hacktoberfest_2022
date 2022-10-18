import java.util.*;

public class GridWaysTargetDestination {
  
    
      // grid ways to reach a target or destination

      public static int gridWays(int i , int j , int n , int m ) {
        // base case
        if ( i == n-1 && j == m-1){
          return 1;
        }else if (  i == n || j == n) {
            return 0;
        }
        int w1 = gridWays( i+1 , j, n, m);
        int w2 = gridWays( i, j+1, n, m);
        return w1+w2;
      }
     

      // Sudoku solving code

      public static boolean iSsafe ( int sudoku [][] ,  int row, int col , int digit){
        // colum 
        for(int i = 0; i<= 8; i++){
          if (sudoku[i][col] == digit ){
            return false;
          }
        }

        // row 

        for (int j = 0; j<= 8 ; j++){
          if(sudoku [row][j] == digit){
            return false;
          }
        }
        // grid 
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        // 3x3 grid 
        for(int i = sr; i< sr+3; i++){
          for(int j = sc ; j<sc+3; j ++ ){
            if (sudoku[i][j] == digit){
              return false;
            }
          }
        }
        return true;
      }



public static void main (String args[]){
    

    //  grid ways print
    int n = 3; 
    int m = 3;
     System.out.println(gridWays(0,0 ,n,m));





}
}
