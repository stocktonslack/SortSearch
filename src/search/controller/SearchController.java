package search.controller;

public class SearchController
{
	private int[] integers;
	private double[] reals;
	private String[] words;

	public void SearchController()
	{

	}

	public void start()
	{
		fillTheArrays();
	}

	private void fillTheArrays()
	{
		fillTheIntArray();
		fillTheDoubleArray();
		fillTheStringArray();
	}

	private void fillTheIntArray()
	{
		integers = new int [30];
		for(int start =0; start < integers.length; start++)
		{
			integers[start] = (int) (Math.random() * 36000);
		}
	}
	

	private void fillTheDoubleArray()
	{
		
	}

	private void fillTheStringArray()
	{
		
	}

}
