class Solution {
public int numberOfSubstrings(String s) {
char []ch= s.toCharArray();
int len=ch.length;
int left=0;
int count=0;
int []alpha= new int[3];
int required=0;
for(int i=0;i<len;i++){
char curr= ch[i];
alpha[curr-'a']++;
while(alpha[0]>0 && alpha[1]>0 && alpha[2]>0){
count+=len-i;
char le=ch[left];
alpha[le-'a']--;
left++;
}

    }
    return count;
    
}
}