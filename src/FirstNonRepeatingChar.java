import java.util.Currency;

public class FirstNonRepeatingChar {
	
	
	
	public static void main(String[] argsf) {
		
		
		int[] my_array = {5,1, 2, 5, 5,5, 6, 6, 2,7, 2};
		 
        for (int i = 0; i < my_array.length-1; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+my_array[j]);
                }
            }
        }
  
			
			
			

	}

}