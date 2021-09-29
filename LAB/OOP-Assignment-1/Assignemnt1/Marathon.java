public class Marathon 
{
    public static void main(String[] args) {
		String[] Runners = { 
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", 
				"Alex", "Emma", "John", "James", "Jane", "Emily", 
				"Daniel", "Neda", "Aaron", "Kate" 
            };
		int [] times = {341, 273, 278, 329, 445, 402, 
                        388, 275, 243, 334, 412, 393, 
				        299, 343, 317, 265
		        };
		int WinnerTime = times[0];
        String WinnerName = Runners[0];

        int secondplace = times[0];
        String secondname = Runners[0];

        for (int i = 0; i < times.length; i++)
        {
            if (times[i]<WinnerTime) 
            {
                WinnerTime = times[i];
                WinnerName = Runners[i]; 
            }
        }

        for (int i = 0; i<times.length; i++)
        {
            if (times[i] > WinnerTime)
                if (times[i] < secondplace) 
                {
                    secondplace = times[i];
                    secondname = Runners[i]; 
                }
        }
        	for (int i = 0; i < Runners.length; i++)
			System.out.println(Runners[i] + ": " +  times[i]);
            System.out.printf("\nFirst Runner is: %s | %d", WinnerName, WinnerTime);
            System.out.printf("\nSecond Runner is: %s | %d\n", secondname, secondplace);
        }
	
}

