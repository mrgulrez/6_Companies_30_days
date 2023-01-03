class Solution {
    public String getHint(String secret, String guess) {
        int bull =0;
        for(int i=0; i< secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i) ) bull++;
        }
        int count =0;
      int[] arr = new int[10];
      for(int i=0; i<guess.length(); i++){
          int n = guess.charAt(i) -'0';
          arr[n]++;
      }
       for(int i=0; i<guess.length(); i++){
          int n = secret.charAt(i) -'0';
          if(arr[n] != 0){
              arr[n]--;
              count++;
          }
      }
      count = count -bull; 
      String  s= bull+"A"+count+"B";

      return s;
    }
}