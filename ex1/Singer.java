
package ex1;





public abstract class Singer {
    protected String surname;
    private static int id = 1;
    private int singerId;
    
		Singer(String surname) {
			this.surname = surname;
			this.singerId = id;
			id++;
        
        }
	public String getSurname() {
		return surname;
	}
    abstract String sing();
    
	   public String toString() {
			return "("+singerId+") "+surname+": "+sing();
		   
	   }
	public static Singer loudest(Singer[] sp) {
		int upperCase = 0;
		int max=0;
		Singer loudest = null;
		for (Singer s : sp ){
		for (int k = 0; k < s.sing().length(); k++) {
		    if (Character.isUpperCase(s.sing().charAt(k))) upperCase++;
		}
		
		      if (upperCase >= max){
		    	  max = upperCase;
		    	  loudest = s;
		      }
		   
			upperCase = 0;
		}
		return loudest;
	
	}
	
	}

