package src1.tareas;

import libs.Input;

public class Buggy1 {

	public static void main(String[] args) {
	    long i = get_negative_int();
	    Input.print(i + " is a negative integer\n");
	}

	public static long get_negative_int()
	{
	    long n;
	    do
	    {
	        Input.print("n is ");
	        n = Input.get_long();
	    }
	    while (n >= 0);
	    return n;
	}
}
