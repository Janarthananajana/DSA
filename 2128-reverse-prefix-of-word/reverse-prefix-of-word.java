class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1)  return word;
        int index = word.indexOf(ch);
        StringBuilder str = new StringBuilder();
        str.append(word.substring(0,index+1));
        str.reverse();
        str.append(word.substring(index+1));
        return str.toString();
    }
}