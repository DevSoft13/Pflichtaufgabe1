import java.util.Arrays;
public class MeinArray {
	
	
	/*
	 * istGleich methode bekommt 2 float arrays als Parameter, die beide arrays werden vergleichen ob sie gleich sind, gleiche zahl
	 * in gleiche index(reihenfolge) und wenn sie gleich sind liefert die methode True zurück ansonsten liert er false zurück
	 */
	public boolean istGleich(float[] a1, float[] a2)
	{
		int index=0;
		if(a1.length == a2.length)
		{
			int num = a1.length;
	while(index<num)
	{
		if(a1[index] != a2[index])
		{
			
			return false;
		}
		index++;
	}
		}
		else
		{
			System.out.println("Arrays sind unterschiedlich lang!");
			return false;
		}
	
	return true;
		
	}
	
	/*
	 * suchElem methode bekommt als Paramter eine double Zahl und eine double Array die aufsteigend sortiert ist. Die Methode sucht nach diesem double Zahl(elem)
	 * in dem double Array, falls die Zahl(elem) in Parameter bekommenden Array drin ist, dann liefert die methode den Index von diesem
	 * Zahl(Element) zurück ansonsten liefert die methode -1 zurück
	 */
	
	
	public int suchElem(double elem, double[] arr)
	{
		for(int n = 0; n<arr.length; n++)
		{
			if(elem==arr[n])
			{
				System.out.println(n);
				return n;
			}
		}
		
		System.out.println("-1");
		return -1;
		
	}
	
	/*
	 * die methode einfuegeSortiert bekommt als Paramter ein int Array und eine Int Zahl. Wenn der Zahl schon in dem Array drin ist
	 * dann liefert die methode den Array unverändert zurück. Wenn die Zahl nicht im Array drin ist, dann die methode schreibt diesem Zahl
	 * im Array rein, und liefert die Array aufsteigend sortiert zurück.
	 */
	
	public int []einfuegeSortiert(int arr[], int elem)
	{
		
	
		boolean contain=false;
		
		for(int n=0; n<arr.length;n++)
		{
			if(elem==arr[n])
			{
				for(int s=0; s<arr.length;s++)
				{
					System.out.println(arr[s]);
					
				}
				
				contain=true;
				return arr;
				
			}
			
		}
		
	if(contain==false)
	{
		int []array;
		
		array= new int [arr.length+1];
		
		array[arr.length]=elem;
		for(int d=0; d<arr.length;d++)
		{
			array[d]=arr[d];
		
			
		}
		int temp;
		boolean fixed=false;
		while(fixed==false)
		{
			fixed=true;
			for(int i=0; i<array.length-1;i++)
			{
				if(array[i] > array[i+1])
				{
					temp = array[i+1];
					array[i+1]=array[i];
					array[i]=temp;
					fixed=false;
				}
			}
		}
		for(int b=0; b<array.length;b++)
		{
			System.out.println(array[b]);
			
		}
		return array;
	}
		

		return arr;
		
	}
		        
	

	

}
