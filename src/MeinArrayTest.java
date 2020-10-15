import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MeinArrayTest {
	
	
	
	 	private static MeinArray meinArray;
	    private static float[] fArray1, fArray2;
	    private static double[] dArray;
	    private static int[] iArray;


	  
	    @BeforeEach
	    public void createArray() {
	        meinArray = new MeinArray();
	        fArray1 = new float[]{1.0f, 1.3f, 1.5f, 2.6f, 2.9f, 5.7f};
	        fArray2 = new float[]{1.0f, 1.3f, 1.5f, 2.6f, 2.9f, 5.7f};
	        dArray = new double[]{1.0, 2.5, -3.0, 4.0,4.2,5.0};
	        iArray = new int[]{3, 1, 4, 2, 6, 1, 10, 11, 8, 12, 20};
	    }
	

	/*
	 * hier teste ich 2  gleiche arrays und ich erwarte eine True zurück.
	 */
	@Test
	public void testIstGleich() {
			
				assertSame(true,meinArray.istGleich(fArray1, fArray2) );
				
	}
		
	/*
	 * hier teste ich 2 nicht gleiche arrays und ich erwarte eine false zurück.
	 * erste Array Index 0 ist nicht gleich zu zweite Array index 0, der Rest ist gleich
	 * trotzdem erwarte ich eine false
	 */
	@Test
	public void testNichtGleichErste(){
			fArray1[0]= 2.0f;
			
			assertSame(false,meinArray.istGleich(fArray1, fArray2) );
	}
		
		
		
	/*
	 * hier teste ich 2 nicht gleiche arrays und ich erwarte eine false zurück.
	 * letzte Array Index ist nicht gleich zu zweite Array letzte index , der Rest ist gleich
	 * trotzdem erwarte ich eine false
	 */
	@Test
	public void testNichtGleichLetzte(){
		fArray1[fArray1.length-1]= 2.0f;
	
		assertSame(false,meinArray.istGleich(fArray1, fArray2) );
	}
	
	
	/*
	 * hier teste ich 2  Arrays die nicht die gleiche laenge haben  und ich erwarte eine false zurück.
	*/
	@Test
	public void testIstGleich_nichtGleicheLaenge()
	{
		fArray1 = new float[]{1.0f, 1.3f, 1.5f, 2.6f, 2.9f, 5.7f,8.8f};
	
		assertSame(false,meinArray.istGleich(fArray1, fArray2) );
	}
	
	
	/*
	 * hier suche ich 1.0 in Arrayliste, 1.0 ist drin und befindet sich auf index 0. Ich warte index 0 zurück
	 */
	@Test
	public void testSuchElemNormalfall(){
	
		int index = meinArray.suchElem(1.0, dArray);
		
		assertEquals(0,index);
	}
	
	/*
	 * ich suche element -3.0 in dArray, er ist auf index 2 und ich warte 2 zurück. Ich teste negative zahl
	 */
	@Test
	public void testSuchElemNegativ()
	{
	
	
		
		assertEquals(2,meinArray.suchElem(-3.0, dArray));
	}
	
	/*
	 * ich suche nach ein elemt(zahl) der nicht in Array drinn ist und ich erwarte -1 zurück
	 */
	@Test
	public void testSuchElem_NichtDrinn()
	{
	
		assertEquals(-1,meinArray.suchElem(10, dArray));
	}
	
	/*
	 * ich suche nach ein minus elemt(minus zahl) der nicht in Array drinn ist und ich erwarte -1 zurück
	 */
	@Test
	public void testSuchElemMinus_NichtDrinn()
	{
		
		assertEquals(-1,meinArray.suchElem(-20.0, dArray));
	}
	
	/*
	 * ich teste eine Zahl die im Array vorhanden ist, somit erwarte das Array unveraendert und nicht sortiert zurück
	 */
	@Test
	public void testEinfuege_ElemVorhanden()
	{

		int arrexpected[]= {3, 1, 4, 2, 6, 1, 10, 11, 8, 12, 20};

		assertArrayEquals(arrexpected, (meinArray.einfuegeSortiert(iArray, 3)));

		
	}
	
	
	/*
	 * ich teste eine Zahl die im Array nicht vorhanden ist, somit erwarte das Array mit dem neuen Zahl drinn sortiert zurück
	 */
	@Test
	public void testEinfuege_ElemNichtVorhanden()
	{

		int arrexpected[]= {1,1,2,3,4,5,6,8,10,11,12,20};

		assertArrayEquals(arrexpected, (meinArray.einfuegeSortiert(iArray, 5)));

		
	}
	
	/*
	 * ich teste eine kleine minux Zahl die im Array nicht vorhanden ist, somit erwarte das Array mit dem neuen Zahl drinn sortiert zurück
	 */
	@Test
	public void testEinfuege_MinusElemNichtVorhanden()
	{

		int arrexpected[]= {-5,1,1,2,3,4,6,8,10,11,12,20};

		assertArrayEquals(arrexpected, (meinArray.einfuegeSortiert(iArray, -5)));

		
	}
	
	/*
	 * ich teste eine grosse Zahl die im Array nicht vorhanden ist, somit erwarte das Array mit dem neuen Zahl drinn sortiert zurück
	 */
	@Test
	public void testEinfuege_GrossElemNichtVorhanden()
	{

		int arrexpected[]= {1,1,2,3,4,6,8,10,11,12,20,1000};

		assertArrayEquals(arrexpected, (meinArray.einfuegeSortiert(iArray, 1000)));

		
	}
	

}
