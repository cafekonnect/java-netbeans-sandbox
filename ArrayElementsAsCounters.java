
package array.elements.as.counters;
import java.util.Random;
/**
 *
 * @author CHRIS
 */
public class ArrayElementsAsCounters {
    public static void main(String[] args) {
        // TODO code application logic here
        Random dice=new Random();
        int freq[]=new int[7];
        for (int counter = 0; counter < 1000; counter++) {
            ++freq[1+dice.nextInt(6)];
        }
        System.out.println("Face\tFrequency");
        for (int face = 0; face < freq.length; face++) {
            System.out.println(face +"\t" + freq[face]);
            
        }
    }
    
}
