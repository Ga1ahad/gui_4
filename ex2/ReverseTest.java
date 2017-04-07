/**
 *
 *  @author Nguyen Adam S15264
 *
 */

package ex2;


public class ReverseTest {

  public static void main(String[] args) {

        Reversible[] revers = new Reversible[] {
            new ReversibleString("Cat"),
            new ReversibleDouble(2),
            new ReversibleDouble(3),
            new ReversibleString("Dog"),
            new ReversibleString("Alice has a cat and a dog"),
            new ReversibleDouble(10),
        };

        System.out.println("Normal:");
        for (Reversible r : revers) {
          System.out.println(r);
        }

        for (Reversible r : revers) {
          r.reverse();
        }

        System.out.println("Reversed:");
        for (Reversible r : revers) {
          System.out.println(r);
        }

        System.out.println("Restored and changed:");
        for (Reversible r : revers) {
        	r.reverse();
        	if (r instanceof ReversibleString) {
        		System.out.println("Text " + r);
        	} else {
        	   	System.out.println(Double.parseDouble(r.toString()) + 10);
        	}
        }
      }
    }