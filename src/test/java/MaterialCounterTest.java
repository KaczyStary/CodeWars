import org.Piotrowski.MaterialCounter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaterialCounterTest {
    public static MaterialCounter materialCounter = new MaterialCounter();

    @Test
    public void testMaterial(){
        int [] inArray_1 = {1,0,2,1,0,1,3,2,1,2,1}; //6
        int [] inArray_2 = {1,0,2,1,0,3,1,0,1,2}; //8
        int [] inArray_3 = {4,2,0,3,2,5}; //9
        int [] inArray_4 = {1,0,2,1,0,3,1,2}; //5
        int [] inArray_5 = {3,2,0,3,2,0,4,2}; //8
        int [] inArray_6 = {6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3}; //83
        int [] inArray_7 = {6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0}; //50

        Assertions.assertEquals(6, materialCounter.material(inArray_1));
        Assertions.assertEquals(8, materialCounter.material(inArray_2));
        Assertions.assertEquals(9, materialCounter.material(inArray_3));
        Assertions.assertEquals(5, materialCounter.material(inArray_4));
        Assertions.assertEquals(8, materialCounter.material(inArray_5));
        Assertions.assertEquals(83, materialCounter.material(inArray_6));
        Assertions.assertEquals(50, materialCounter.material(inArray_7));
    }

}
