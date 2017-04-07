/**
 *
 *  @author Nguyen Adam S15264
 *
 */

package ex1;


public class Main {
  public static void main(String[] args)
  {
    Singer s1 = new Singer("Carrey"){
         String sing(){
             return "oooooooooooo";
         }
    };

    Singer s2 = new Singer("Houston"){
    	 String sing(){
             return "a4iBBiii";         }
    };

    Singer s3 = new Singer("Madonna"){
    	 String sing(){
             return "aAa";
         }
    
    };

    Singer sp[] = {s1, s2, s3};

    for (Singer s : sp)
      System.out.println(s);


    System.out.println("\n" + Singer.loudest(sp));
  }
}
