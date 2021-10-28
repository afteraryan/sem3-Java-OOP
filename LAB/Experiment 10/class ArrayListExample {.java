import java.io.*;
import java.util.*;

class ArrayListExample {
	public static void main(String[] args)
	{
		int n = 5;


		ArrayList<Integer> arrayli  = new ArrayList<Integer>(n);

		for (int i = 1; i <= n; i++)
        arrayli.add(i);

		System.out.println(arrayli);

		for (int i = 0; i < arrayli.size(); i++)
			System.out.print(arrayli.get(i) + "\t");
	}
}
