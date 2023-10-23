import org.Piotrowski.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testCastStringArrayToIntArray(){
        String [] stringArray_1 = {"1","0","2","1","0","1","3","2","1","2","1"};
        String [] stringArray_2 = {"1","0","2","1","0","3","1","0","1","2"};
        String [] stringArray_3 = {"4","2","0","3","2","5"};
        String [] stringArray_4 = {"1","0","2","1","0","3","1","2"};
        String [] stringArray_5 = {"3","2","0","3","2","0","4","2"};
        String [] stringArray_6 = {"6", "4", "2", "0", "3", "2", "0", "3", "1", "4", "5", "3", "2", "7", "5", "3", "0", "1", "2", "1", "3", "4", "6", "8", "1", "3"};
        String [] stringArray_7 = {"6", "2", "1", "1", "8", "0", "5", "5", "0", "1", "8", "9", "6", "9", "4", "8", "0", "0"};

        int [] intArray_1 = {1,0,2,1,0,1,3,2,1,2,1};
        int [] intArray_2 = {1,0,2,1,0,3,1,0,1,2};
        int [] intArray_3 = {4,2,0,3,2,5};
        int [] intArray_4 = {1,0,2 ,1,0,3,1,2};
        int [] intArray_5 = {3,2,0,3,2,0,4,2};
        int [] intArray_6 = {6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3};
        int [] intArray_7 = {6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0};

        Assertions.assertArrayEquals(intArray_1, Main.castStringArrayToIntArray(stringArray_1));
        Assertions.assertArrayEquals(intArray_2, Main.castStringArrayToIntArray(stringArray_2));
        Assertions.assertArrayEquals(intArray_3, Main.castStringArrayToIntArray(stringArray_3));
        Assertions.assertArrayEquals(intArray_4, Main.castStringArrayToIntArray(stringArray_4));
        Assertions.assertArrayEquals(intArray_5, Main.castStringArrayToIntArray(stringArray_5));
        Assertions.assertArrayEquals(intArray_6, Main.castStringArrayToIntArray(stringArray_6));
        Assertions.assertArrayEquals(intArray_7, Main.castStringArrayToIntArray(stringArray_7));
    }

    @Test
    public void testStart(){
        int [] inArray_1 = {1,0,2,1,0,1,3,2,1,2,1};
        int [] inArray_2 = {1,0,2,1,0,3,1,0,1,2};
        int [] inArray_3 = {4,2,0,3,2,5};
        int [] inArray_4 = {1,0,2,1,0,3,1,2};
        int [] inArray_5 = {3,2,0,3,2,0,4,2};
        int [] inArray_6 = {6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3};
        int [] inArray_7 = {6, 2, 1, 1, 8, 0, 5, 5, 0, 1, 8, 9, 6, 9, 4, 8, 0, 0};
        int [] inArray_8 = {0, 0, 0, 0, 0, 0, 0};
        int [] inArray_9 = {9, 9, 9, 9, 9, 9, 9, 9};

        Assertions.assertEquals(6, Main.start(inArray_1));
        Assertions.assertEquals(8, Main.start(inArray_2));
        Assertions.assertEquals(9, Main.start(inArray_3));
        Assertions.assertEquals(5, Main.start(inArray_4));
        Assertions.assertEquals(8, Main.start(inArray_5));
        Assertions.assertEquals(83, Main.start(inArray_6));
        Assertions.assertEquals(50, Main.start(inArray_7));
        Assertions.assertEquals(0, Main.start(inArray_8));
        Assertions.assertEquals(0, Main.start(inArray_9));
    }
}
