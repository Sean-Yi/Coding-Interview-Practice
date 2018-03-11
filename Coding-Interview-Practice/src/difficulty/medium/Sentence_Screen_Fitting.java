package difficulty.medium;

public class Sentence_Screen_Fitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sentence_Screen_Fitting s = new Sentence_Screen_Fitting();
		s.wordsTyping(new String[]{"I","had","apple","pie"}, 4, 5);
		
	}
	//Time Limit Exceeded 
    public int wordsTyping(String[] sentence, int rows, int cols) {
        
        int p = 0;
        int len = sentence.length;
        int resCount = 0;
        
        for(int i = 0; i < rows; i++){
            int space = cols;
            while(space >= sentence[p].length()){
                space -= sentence[p].length()+1;
                p++;
                if(p == len) {
                    resCount++; 
                    p = 0;
                }
            }
        }
        
        return resCount;
    } 

}
