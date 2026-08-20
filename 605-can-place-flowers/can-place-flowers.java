class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int a) {
        
       int n =0;
       if (flowerbed.length == 1 && flowerbed[0] == 0) {
    flowerbed[0] = 1;
    n++;
}
       if( flowerbed[0]==0)
       {
           if(flowerbed.length>1 &&flowerbed[1]==0)
           {
               flowerbed[0]=1;
               n++;
           }
       }
        for(int i=0;i<flowerbed.length;i++)
        {
            if(flowerbed[i]==0)
            {
                if(i>0 && flowerbed[i-1]==0 && i<flowerbed.length-1 &&  flowerbed[i+1]==0 )
                {
                    flowerbed[i]=1;
                    n++;
                }
            }
        }
        if(flowerbed[flowerbed.length-1]==0)
        {
            if(flowerbed.length > 1 &&flowerbed[flowerbed.length-2]==0)
            {flowerbed[flowerbed.length-1]=1;n++;}

        }
        if(n < a) return false;
return true;
    }
}