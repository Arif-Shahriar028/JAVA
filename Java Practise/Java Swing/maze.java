import java.util.Random;

class maze{
	public static void main(String[] args)
	{
		int[][] a = new int[31][31];
		int i, j, k, flag, count = 0, cn = 0;
	    for(i=0; i<31; i++)
	    {
		    for(j=0; j<31; j++)
		      	a[i][j] = 1;
	    } 
		i= 1; j = 1;
		
		/*
		* 0 == up
		* 1 == right 
		* 2 == down
		* 3 == left
		*/
		
		while(count != 50)   // 50 moves
		{
			flag = 0;
			
			Random rn = new Random();
			cn = 0;
			while(flag != 1)  // loop for a valid move
			{
				k = rn.nextInt(4);
				
				if(k == 0)   // up move
			    {
				    if(a[i-1][j-1]==1 && a[i-1][j+1] == 1 && a[i-1][j] == 1) // up corner check
				    {
					    if(i-1 != 0)  // up wall check
					    {
					     	a[i-1][j] = 0;
					        i = i-1;  // position change
						    flag = 1;
							count ++;
					    }
			        }
		        }
				else if(k==1)  // right move
				{
					if(a[i+1][j+1]==1 && a[i-1][j+1] == 1 && a[i][j+1] ==1) // right corner check
				    {
					    if(j+1 != 30)  // right wall check
					    {
					     	a[i][j+1] = 0;
					        j = j+1;  // position change
						    flag = 1;
							count ++;
					    }
			        }
				}
				else if(k==2)  // down move
				{
					if(a[i+1][j-1]==1 && a[i+1][j+1] == 1 && a[i+1][j] == 1) // down corner check
				    {
					    if(i+1 != 30)  // down wall check
					    {
					     	a[i+1][j] = 0;
					        i = i+1;  // position change
						    flag = 1;
							count ++;
					    }
			        }
				}
				else if(k==3)  // left move
				{
					if(a[i+1][j-1]==1 && a[i-1][j-1] == 1 && a[i][j-1] == 1) // left corner check
				    {
					    if(j-1 != 0)  // left wall check
					    {
					     	a[i][j-1] = 0;
					        j = j-1;  // position change
						    flag = 1;
							count ++;
					    }
			        }
				}
			}	
			if(count == 50)
			{
				a[i][j] = 9;
				a[1][1] = 0;
			}
				
		}
		
		
		for(i=0; i<30; i++)
		{
			for(j=0; j<30; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	