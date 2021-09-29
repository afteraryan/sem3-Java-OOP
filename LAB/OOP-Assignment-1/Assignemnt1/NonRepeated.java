class NonRepeated
{
	public static char NonRepeating1(String arr, int n)
	{
		char[] ch = arr.toCharArray();
        for (int i = 0; i < n; i++)
		{
			int j; 
			for (j = 0; j < n; j++)
				if (i != j && ch[i] == ch[j])
					break;
			if (j == n)
				return ch[i];
		}
        ch[0] = '-';
	return ch[0];
	}

    public static void main(String args[])
    {
            int n = args[0].length();   
            System.out.print(NonRepeating1(args[0] ,n));
    }
}