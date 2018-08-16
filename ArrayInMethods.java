
package array.in.methods;

/**
 *
 * @author CHRIS
 */
public class ArrayInMethods {

    public static void main(String[] args) {
        // TODO code application logic here
        int apples[]={2,3,4,5,6};
        change(apples);
        for (int y : apples) {
            System.out.println(y);
        }
    }
    public static void change(int x[]){
        for (int counter = 0; counter < x.length; counter++) {
            x[counter]+=5;
            
        }
    }
    
}
