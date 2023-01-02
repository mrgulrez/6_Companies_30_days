class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String x:tokens) {
            if(x.equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(a+b);
            }
             else if(x.equals("*")){
                int a = s.pop();
                int b = s.pop();
                s.push(a*b);
            }
             else if(x.equals("-")){
                int a = s.pop();
                int b = s.pop();
                s.push(b-a);
            }
             else if(x.equals("/")){
                int a = s.pop();
                int b = s.pop();
                s.push(b/a);
            }
            else s.push(Integer.parseInt(x));
        }
        return s.pop();
    }
}