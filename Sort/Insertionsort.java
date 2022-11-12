package Sort;
public class Insertionsort{
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i) {
			int temp = arr[i];
			int j = i - 1;

			
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
	  public static void main(String[] args)
	{
		int arr[] = { 12, 11, 13, 5, 6 };

		Insertionsort ob = new Insertionsort();
		ob.sort(arr);
        System.out.print("sorted array : ");
		printArray(arr);
	}
}
