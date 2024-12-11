package assignments.ex1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *My ID is 2116114744
 * This JUnit class represents a very partial test class for Ex1.
 */
public class Ex1Test {
        @Test
        void computeNumberTest() {
         String s2 = "1011b2";
         int v = Ex1.number2Int(s2);
         assertEquals(v,11);
         String s10 = "1011bA";
         v = Ex1.number2Int(s10);
         s2 = Ex1.int2Number(v,2);
         int v2 = Ex1.number2Int(s2);
         assertEquals(v,v2);
         assertTrue(Ex1.equals(s10,s2));
       }

       @Test
       void isBasisNumberTest() {
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};// array of strings that should return true
        for(int i=0;i<good.length;i=i+1) {
            boolean ok = Ex1.isNumber(good[i]);
            assertTrue(ok);
            }
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};// array of strings that should return false
        for(int i=0;i<not_good.length;i=i+1) {
            boolean not_ok = Ex1.isNumber(not_good[i]);
            assertFalse(not_ok);
            }
        }
        @Test
        void isNumberTest() {
            //all the input that their output is true
            assertTrue(Ex1.isNumber("135bA"));
            assertTrue(Ex1.isNumber("135"));
            assertTrue(Ex1.isNumber("100111b2"));
            assertTrue(Ex1.isNumber("12345b6"));
            assertTrue(Ex1.isNumber("012b5"));
            assertTrue(Ex1.isNumber("123bG"));
            assertTrue(Ex1.isNumber("EFbG"));
            assertTrue(Ex1.isNumber("0b2"));
            //all the input that their output is false
            assertFalse(Ex1.isNumber("b2"));
            assertFalse(Ex1.isNumber("0b1"));
            assertFalse(Ex1.isNumber("123b"));
            assertFalse(Ex1.isNumber("1234b11"));
            assertFalse(Ex1.isNumber("3b3"));
            assertFalse(Ex1.isNumber("-3b5"));
            assertFalse(Ex1.isNumber("3 b4"));
            assertFalse(Ex1.isNumber("1234 5"));
            assertFalse(Ex1.isNumber("123 4"));
            assertFalse(Ex1.isNumber("GbG"));
            assertFalse(Ex1.isNumber("1b10"));
            assertFalse(Ex1.isNumber("1bH"));
            assertFalse(Ex1.isNumber(""));
            assertFalse(Ex1.isNumber(null));
        }
        @Test
        void int2NumberTest() {
            assertEquals("1011b2",Ex1.int2Number(11,2));
            assertEquals("12000b3",Ex1.int2Number(135,3));
            assertEquals("3133b4",Ex1.int2Number(223,4));
            assertEquals("132b5",Ex1.int2Number(42,5));
            assertEquals("2201b6",Ex1.int2Number(505,6));
            assertEquals("202b7",Ex1.int2Number(100,7));
            assertEquals("116b8",Ex1.int2Number(78,8));
            assertEquals("1205b9",Ex1.int2Number(896,9));
            assertEquals("135",Ex1.int2Number(135,10));
            assertEquals("745bB",Ex1.int2Number(896,11));
            assertEquals("44bC",Ex1.int2Number(52,12));
            assertEquals("291bD",Ex1.int2Number(456,13));
            assertEquals("10bE",Ex1.int2Number(14,14));
            assertEquals("EbF",Ex1.int2Number(14,15));
            assertEquals("",Ex1.int2Number(15,1));
            assertEquals("",Ex1.int2Number(0,0));
            assertEquals("0bG",Ex1.int2Number(0,16));
            assertEquals("",Ex1.int2Number(-3,16));
            assertEquals("7FFFFFFFbG", Ex1.int2Number(Integer.MAX_VALUE, 16));
            assertEquals("", Ex1.int2Number(Integer.MIN_VALUE, 2)); // ערך שלילי

        }
        @Test
        void maxIndexTest() {
            String[] arr1 = {"111b2", "11", "23AbG", "9b10"};//Classic example
            assertEquals(2, Ex1.maxIndex(arr1));
            String[] arr2 = {"1453b10"};//Example with one element in an array
            assertEquals(0, Ex1.maxIndex(arr2));
            String[] arr3 = {"1011b2", "14bA", "123b17"};//Example with valid and invalid inputs
            assertEquals(1, Ex1.maxIndex(arr3));
            String[] arr4 = {"1011b2", "14bA", "123bH"};//Example with valid and invalid inputs
            assertEquals(1, Ex1.maxIndex(arr4));
            String[] arr5={null,"123bH"};//Example with null and invalid inputs
            assertEquals(0, Ex1.maxIndex(arr5));
        }
        @Test
        void number2IntTest(){
            assertEquals(-1,Ex1.number2Int("1011b1"));
            assertEquals(-1,Ex1.number2Int(""));
            assertEquals(-1,Ex1.number2Int("10b"));
            assertEquals(-1,Ex1.number2Int("1011 b2"));
            assertEquals(11,Ex1.number2Int("1011b2"));
            assertEquals(7,Ex1.number2Int("21b3"));
            assertEquals(225,Ex1.number2Int("3201b4"));
            assertEquals(24,Ex1.number2Int("44b5"));
            assertEquals(1225,Ex1.number2Int("5401b6"));
            assertEquals(48,Ex1.number2Int("66b7"));
            assertEquals(57,Ex1.number2Int("71b8"));
            assertEquals(700,Ex1.number2Int("857b9"));
            assertEquals(-1,Ex1.number2Int("85700b10"));
            assertEquals(85700,Ex1.number2Int("85700bA"));
            assertEquals(85700,Ex1.number2Int("85700bA"));
            assertEquals(85700,Ex1.number2Int("85700"));
            assertEquals(181,Ex1.number2Int("155bB"));
            assertEquals(53,Ex1.number2Int("45bC"));
            assertEquals(14082,Ex1.number2Int("6543bD"));
            assertEquals(75,Ex1.number2Int("55bE"));
            assertEquals(0,Ex1.number2Int("0bF"));
            assertEquals(84,Ex1.number2Int("54bG"));
        }
        @Test
        void equalsTest()
        {
            //all the input that their output is true
            assertTrue(Ex1.equals("101b2","5"));
            assertTrue(Ex1.equals("101b3","13b7"));
            assertTrue(Ex1.equals("1A9bB","F0bG"));
            //all the input that their output is false
            assertFalse(Ex1.equals("132b3","66b7"));
            assertFalse(Ex1.equals("122b3","6611b7"));
            assertFalse(Ex1.equals("132bG","6611b7"));
            assertFalse(Ex1.equals("13HbG","66191b7"));//assume that the function return false if one or more of either numbers is invalid
            assertFalse(Ex1.equals("13bH","6611b7"));
            assertTrue(Ex1.equals("1b2", "1"));

        }
 }