class Solution {
    public String defangIPaddr(String address) {
      String[] arr = address.split("\\.");
     StringBuilder str = new StringBuilder();
     for(int i=0;i<arr.length-1;i++)
     {
         str.append(arr[i]);
         str.append("[.]");
     }
     str.append(arr[arr.length-1]);
        return str.toString();
    }
}