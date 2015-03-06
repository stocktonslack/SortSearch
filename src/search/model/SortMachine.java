package search.model;

public class SortMachine
{
	private long startTime;
	private long endTime;
	private long sortTime;

	public long getSortTime()
	{
		return sortTime;
	}

	/**
	 * Sorts the objects by comparing the first number to see if it is
	 * 
	 * @param toBeSorted
	 * @return
	 */
	public int[] selectionSort(int[] toBeSorted)
	{
		int minimum;
		int minimumPosition;
		startTime = System.currentTimeMillis();
		for (int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			for (int next = position + 1; next < toBeSorted.length; next++)
			{
				if (toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}

			}
			if (minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();

		sortTime = endTime - startTime;

		return toBeSorted;
	}

	public double[] selectioSort(double[] toBeSorted)
	{
		int minimumPosition;
		double min;
		startTime = System.currentTimeMillis();
		for (int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			min = toBeSorted[position];
			for (int next = position + 1; next < toBeSorted.length; next++)
			{
				if (toBeSorted[next] < min)
				{
					min = toBeSorted[next];
					minimumPosition = next;
				}
			}
			if (minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}
		}
		endTime = System.currentTimeMillis();

		sortTime = endTime - startTime;

		return toBeSorted;
	}

	
	
	public Yoyo [] selectionSort(Yoyo [] sortTheYoyos)
	{
		int maximumPosition;
		Yoyo max;
		startTime = System.currentTimeMillis();
		for(int position = 0; position < sortTheYoyos.length; position++)
		{
			maximumPosition = position;
			max = sortTheYoyos[position];
			for(int next = position + 1; next < sortTheYoyos.length; next++)
			{
				if(sortTheYoyos[next].compareTo(max) > 0)
				{
					max = sortTheYoyos[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(sortTheYoyos, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return sortTheYoyos;
	}

	private void swap(Yoyo[] array, int position, int change)
	{
		Yoyo temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}

	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}

	private void swap(double[] array, int position, int change)
	{
		double temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}

	public String sortingTime(long sortTime)
	{
		String timeToSort = "";

		timeToSort += "Days: " + sortTime / (1000 * 60 * 60 * 24) + "\n";
		timeToSort += "Hours: " + sortTime / (1000 * 60 * 60) + "\n";
		timeToSort += "Minutes: " + sortTime / (1000 * 60) + "\n";
		timeToSort += "Seconds: " + sortTime / (1000) + "\n";
		timeToSort += "Milliseconds: " + sortTime + "\n";

		return timeToSort;
	}
}
