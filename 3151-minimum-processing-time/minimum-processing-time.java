class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(processorTime);
        Collections.sort(tasks, Collections.reverseOrder());
        
         int max =-1;
         int totalMax =-1;
        for(int i=0;i<processorTime.size();i++)
        {
            int value = processorTime.get(i);
           
            int value1 = value + tasks.get(i*4);
            int value2 = value + tasks.get(i*4+1);
             int value3 = value + tasks.get(i*4+2); 
             int value4 = value + tasks.get(i*4+3);
            max = Math.max(Math.max(value1,value2),Math.max(value3,value4));
            totalMax= Math.max(max,totalMax);
        }
        return totalMax;
    }
}