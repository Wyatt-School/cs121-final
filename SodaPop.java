/**
 * A class that will write a range of numbers from start to end
 * (not including end), and replace any of the numbers with multiples
 * of a certain number with words.
 * 
 * @author wradkiewicz
 */
public class SodaPop {public static void main(String[] args) {
        for (int i = 5; i < 50; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print("Lemon ");
            } else if (i % 3 == 0) {
                System.out.print("Soda ");
            } else if (i % 4 == 0) {
                System.out.print("Pop ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
