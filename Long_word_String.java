package code_test1;

public class Long_word_String {

	public static void main(String[] args) {
		String s="Today is the happiest day of my life";
		  String[] word=s.split(" ");
		  String rts=" ";
		  for(int i=0;i<word.length;i++){
		     if(word[i].length()>=rts.length()){
		       rts=word[i];
		     }
		  }
		  System.out.println(rts);
		  System.out.println(rts.length());
	}
	}


