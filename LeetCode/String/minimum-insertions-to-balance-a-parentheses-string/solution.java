class Solution{
    public int minInsertions(String s){
        int insert=0;
        int open=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                open++;
                i++;
            }else{
                if(i+1<s.length() && s.charAt(i+1)==')'){
                    if(open>0) open--;
                    else insert++;
                    i+=2;
                }else{
                    insert++;
                    if(open>0) open--;
                    else insert++;
                    i++;
                }
            }
        }
        insert+=open*2;
        return insert;
    }
}