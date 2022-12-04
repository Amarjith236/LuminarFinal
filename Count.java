
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String string = "Luminar Technolab";    
	        int count = 0;       
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }    
	        System.out.println("Total number of characters: " + count);    
	    }    

}
