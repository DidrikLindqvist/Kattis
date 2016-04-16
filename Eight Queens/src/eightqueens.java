import java.util.Random;
import java.util.Scanner;

public class eightqueens {
   
   String[][] board;
   int sizeOfBoard = 8;
   boolean failed;
   public static void main(String[] args) {
      new eightqueens();
      
   }
   
   eightqueens()
   {
	  String [] arr = new String[] { "(0, 4, 7, 5, 2, 6, 1, 3)", "(0, 5, 7, 2, 6, 3, 1, 4)",
			  "(0, 6, 3, 5, 7, 1, 4, 2)",
			  "(0, 6, 4, 7, 1, 3, 5, 2)",
			  "(1, 3, 5, 7, 2, 0, 6, 4)",
			  "(1, 4, 6, 0, 2, 7, 5, 3)",
			  "(1, 4, 6, 3, 0, 7, 5, 2)",
			  "(1, 5, 0, 6, 3, 7, 2, 4)",
			  "(1, 5, 7, 2, 0, 3, 6, 4)",
			  "(1, 6, 2, 5, 7, 4, 0, 3)",
			  "(1, 6, 4, 7, 0, 3, 5, 2)",
			  "(1, 7, 5, 0, 2, 4, 6, 3)",
			  "(2, 0, 6, 4, 7, 1, 3, 5)",
			  "(2, 4, 1, 7, 0, 6, 3, 5)",
			  "(2, 4, 1, 7, 5, 3, 6, 0)",
			  "(2, 4, 6, 0, 3, 1, 7, 5)",
			  "(2, 4, 7, 3, 0, 6, 1, 5)",
			  "(2, 5, 1, 4, 7, 0, 6, 3)",
			  "(2, 5, 1, 6, 0, 3, 7, 4)",
			  "(2, 5, 1, 6, 4, 0, 7, 3)",
			  "(2, 5, 3, 0, 7, 4, 6, 1)",
			  "(2, 5, 3, 1, 7, 4, 6, 0)",
			  "(2, 5, 7, 0, 3, 6, 4, 1)",
			  "(2, 5, 7, 0, 4, 6, 1, 3)",
			  "(2, 5, 7, 1, 3, 0, 6, 4)",
			  "(2, 6, 1, 7, 4, 0, 3, 5)",
			  "(2, 6, 1, 7, 5, 3, 0, 4)",
			  "(2, 7, 3, 6, 0, 5, 1, 4)",
			  "(3, 0, 4, 7, 1, 6, 2, 5)",
			  "(3, 0, 4, 7, 5, 2, 6, 1)",
			  "(3, 1, 4, 7, 5, 0, 2, 6)",
			  "(3, 1, 6, 2, 5, 7, 0, 4)",
			  "(3, 1, 6, 2, 5, 7, 4, 0)",
			  "(3, 1, 6, 4, 0, 7, 5, 2)",
			  "(3, 1, 7, 4, 6, 0, 2, 5)",
			  "(3, 1, 7, 5, 0, 2, 4, 6)",
			  "(3, 5, 0, 4, 1, 7, 2, 6)",
			  "(3, 5, 7, 1, 6, 0, 2, 4)",
			  "(3, 5, 7, 2, 0, 6, 4, 1)",
			  "(3, 6, 0, 7, 4, 1, 5, 2)",
			  "(3, 6, 2, 7, 1, 4, 0, 5)",
			  "(3, 6, 4, 1, 5, 0, 2, 7)",
			  "(3, 6, 4, 2, 0, 5, 7, 1)",
			  "(3, 7, 0, 2, 5, 1, 6, 4)",
			  "(3, 7, 0, 4, 6, 1, 5, 2)",
			  "(3, 7, 4, 2, 0, 6, 1, 5)",
			  "(4, 0, 3, 5, 7, 1, 6, 2)",
			  "(4, 0, 7, 3, 1, 6, 2, 5)",
			  "(4, 0, 7, 5, 2, 6, 1, 3)",
			  "(4, 1, 3, 5, 7, 2, 0, 6)",
			  "(4, 1, 3, 6, 2, 7, 5, 0)",
			  "(4, 1, 5, 0, 6, 3, 7, 2)",
			  "(4, 1, 7, 0, 3, 6, 2, 5)",
			  "(4, 2, 0, 5, 7, 1, 3, 6)",
			  "(4, 2, 0, 6, 1, 7, 5, 3)",
			  "(4, 2, 7, 3, 6, 0, 5, 1)",
			  "(4, 6, 0, 2, 7, 5, 3, 1)",
			  "(4, 6, 0, 3, 1, 7, 5, 2)",
			  "(4, 6, 1, 3, 7, 0, 2, 5)",
			  "(4, 6, 1, 5, 2, 0, 3, 7)",
			  "(4, 6, 1, 5, 2, 0, 7, 3)",
			  "(4, 6, 3, 0, 2, 7, 5, 1)",
			  "(4, 7, 3, 0, 2, 5, 1, 6)",
			  "(4, 7, 3, 0, 6, 1, 5, 2)",
			  "(5, 0, 4, 1, 7, 2, 6, 3)",
			  "(5, 1, 6, 0, 2, 4, 7, 3)",
			  "(5, 1, 6, 0, 3, 7, 4, 2)",
			  "(5, 2, 0, 6, 4, 7, 1, 3)",
			  "(5, 2, 0, 7, 3, 1, 6, 4)",
			  "(5, 2, 0, 7, 4, 1, 3, 6)",
			  "(5, 2, 4, 6, 0, 3, 1, 7)",
			  "(5, 2, 4, 7, 0, 3, 1, 6)",
			  "(5, 2, 6, 1, 3, 7, 0, 4)",
			  "(5, 2, 6, 1, 7, 4, 0, 3)",
			  "(5, 2, 6, 3, 0, 7, 1, 4)",
			  "(5, 3, 0, 4, 7, 1, 6, 2)",
			  "(5, 3, 1, 7, 4, 6, 0, 2)",
			  "(5, 3, 6, 0, 2, 4, 1, 7)",
			  "(5, 3, 6, 0, 7, 1, 4, 2)",
			  "(5, 7, 1, 3, 0, 6, 4, 2)",
			  "(6, 0, 2, 7, 5, 3, 1, 4)",
			  "(6, 1, 3, 0, 7, 4, 2, 5)",
			  "(6, 1, 5, 2, 0, 3, 7, 4)",
			  "(6, 2, 0, 5, 7, 4, 1, 3)",
			  "(6, 2, 7, 1, 4, 0, 5, 3)",
			  "(6, 3, 1, 4, 7, 0, 2, 5)",
			  "(6, 3, 1, 7, 5, 0, 2, 4)",
			  "(6, 4, 2, 0, 5, 7, 1, 3)",
			  "(7, 1, 3, 0, 6, 4, 2, 5)",
			  "(7, 1, 4, 2, 0, 6, 3, 5)",
			  "(7, 2, 0, 5, 1, 4, 6, 3)",
			  "(7, 3, 0, 2, 5, 1, 6, 4)",
			  
	  };
      board = new String[sizeOfBoard][sizeOfBoard];
      String[][] badBoard = new String[100][100];
      Random rand = new Random();
      String[] badBoradNumb = new String[1000];
      
      for(int i= 0 ; i < 1000 ; i++)
      {
    	  StringBuilder sb = new StringBuilder();
    	  sb.append("(");
    	  sb.append(rand.nextInt(8));
    	  sb.append(", ");
    	  sb.append(rand.nextInt(8));
    	  sb.append(", ");
    	  sb.append(rand.nextInt(8));
    	  sb.append(", ");
    	  sb.append(rand.nextInt(8));
    	  sb.append(", ");
    	  sb.append(rand.nextInt(8));
    	  sb.append(", ");
    	  sb.append(rand.nextInt(8));
    	  sb.append(", ");
    	  sb.append(rand.nextInt(8));
    	  sb.append(", ");
    	  sb.append(rand.nextInt(8));
    	  sb.append(")");
    	  
    	  badBoradNumb[i] = sb.toString();
    	//System.out.println(rand.nextInt(8));

      }
      for(int i = 0; i < badBoradNumb.length ; i++)
	  {
          parseBoardInfo(badBoradNumb[i]);
          
      //    System.out.println(badBoradNumb[i]);
          //setGamePlan();
      //    printGamePlan();
          failed = false;
          scanGamePlan();
	  }

   }
   
   
   void parseBoardInfo(String name)
   {
	   int one = Character.getNumericValue(name.charAt(1));
	   int two =  Character.getNumericValue(name.charAt(4));
	   int three =  Character.getNumericValue(name.charAt(7));
	   int four =  Character.getNumericValue(name.charAt(10));
	   int five =  Character.getNumericValue(name.charAt(13));
	   int six =  Character.getNumericValue(name.charAt(16));
	   int seven =  Character.getNumericValue(name.charAt(19));
	   int eight =  Character.getNumericValue(name.charAt(22));
       String line = "........";
       for(int i = 0 ; i < sizeOfBoard; i++)
       {
    	   board[i] = line.split("");
       }
       board[0][one] = "*";
       board[1][two] = "*";
       board[2][three] = "*";
       board[3][four] = "*";
       board[4][five] = "*";
       board[5][six] = "*";
       board[6][seven] = "*";
       board[7][eight] = "*";
       
	   
   }
   void setGamePlan()
   {
      Scanner scan = new Scanner(System.in);
      for(int i = 0; i < sizeOfBoard ; i++)
      {  
         String line = scan.nextLine();
         board[i] = line.split("");
      }  
      scan.close();
   }
   
   void printGamePlan()
   {
      System.out.print("\n");
      System.out.print("\n");
      for(int i = 0; i < sizeOfBoard ; i ++)
      {
         for(int j = 0; j < sizeOfBoard ; j++)
         {
            System.out.print(board[i][j]+" ");
         }
         System.out.print("\n");
      }
   }
   
   void scanGamePlan()
   {
      for(int i = 0; i < sizeOfBoard; i++ )
      {
         for(int j = 0; j < sizeOfBoard; j++)
         {
            
            if(board[i][j].startsWith("*"))
            {
               //System.out.println("checking "+i+j);
               if(checkDiagonaly(i,j)&&checkHorizontal(i,j)&&checkVertical(i,j))
               {   
               }
            }
         }
      }
      if(failed == false)
    	  System.out.println("valid");
      
   }
   
   boolean checkHorizontal(int k, int l)
   {
      for(int i = 0; i < sizeOfBoard ; i++)
      {
         if(i == l)
         { 
         }else
         {
        	 checkSpot(k,i);
         }
      }
      return true;
   }
   

   boolean checkVertical( int k, int l )
   {
      for(int i = 0; i < sizeOfBoard ; i++)
      {
         if(i == k)
         {
         }else
         {
        	checkSpot(i,l);
         }
      }
      return true;
      
   }
   boolean checkDiagonaly(int k , int l)
   {
      
      for(int i = 1; i <= sizeOfBoard ; i++)
      {
         checkSpot(k+i,l+i);        
      }

      for(int i = 1; i <= sizeOfBoard ; i++)
      {
         checkSpot(k-i,l+i);
      }
      
      for(int i = 1; i <= sizeOfBoard ; i++)
      {
         checkSpot(k-i,l-i);
      }
      
      for(int i = 1; i <= sizeOfBoard ; i++)
      {
         checkSpot(k+i,l-i);
      }
      return true;
   }
   
   boolean checkSpot(int i, int j)
   {
      if(i < sizeOfBoard && i >= 0 && j < sizeOfBoard && j >= 0 )
      {
         if(board[i][j].startsWith("*"))
         {
           // 
        	if(failed == false)
        	{
        	//	System.out.println("failed on : "+i+ " " +j);
        	//	System.out.println("invalid");
        	}
        		
        	failed = true;
          //  System.exit(0);
            return false;
         }
            
      }
         
      return true;
   }

}
