class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result=new StringBuilder();
        for(char curr:address.toCharArray()){
            if(curr=='.'){
                result.append("[.]");
            }else{
                result.append(curr);
            }
        }
        return result.toString();
    }
}