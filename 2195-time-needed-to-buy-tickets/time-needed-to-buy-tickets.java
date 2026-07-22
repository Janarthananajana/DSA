class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       int tt =0;
        int index =0;
        while(tickets[k]!=0)
        {
            if(index==tickets.length) index= index%tickets.length;
            if(tickets[index]>0)
            {
                tickets[index]--;
                tt++;
            }
            index++;
        }
        return tt;
    }
}