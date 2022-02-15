public class printPyramid {
   public static void main(String[]args) {
    
    for (int i=1; i<6; i++)
        {
 
            //printing spaces
            for (int j=6-i; j>1; j--)
            {
              
                System.out.print(" ");
            }

            //printing stars
            for (int j=1; j<=2*i-1; j++ )
            {
                
                System.out.print("*");
            }

            // next row
            System.out.println();
        }
    }

   }

