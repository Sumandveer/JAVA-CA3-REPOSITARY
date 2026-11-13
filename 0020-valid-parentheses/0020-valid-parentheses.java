class Solution {
    public boolean isValid(String s) {
        char[] a=new char[s.length()];
        int top=0;

        for(int i=0; i<s.length(); i++) {
            char c=s.charAt(i);

            if(c=='(' || c=='{' || c=='[') {
                a[top]=c;
                top++;
            }
            else {
                if(top==0) return false;

                top--;
                char b=a[top];

                if(c==')' && b!='(') return false;
                if(c=='}' && b!='{') return false;
                if(c==']' && b!='[') return false;
            }
        }

        return top==0;
    }
}