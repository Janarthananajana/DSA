class Solution {
    public int finalValueAfterOperations(String[] str) {
       int X= 0;
      for(String s:str)
      {
          switch (s)
          {
              case "X++":
                  X=X+1;
                  break;
              case "X--":
                  X=X-1;
                  break;
              case "--X":
                  X=X-1;
                  break;
              case "++X":
                  X=X+1;
                  break;
          }
      }
       return X;
   

    
    }
}