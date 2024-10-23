package Arrays;

public class gasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
           int totalcost =0;
           int totalgas =0;
           int currengas = 0;
           int startindex= 0 ;
           for(int i=0;i<gas.length;i++){
               totalgas +=gas[i];
               totalcost +=cost[i];
               currengas+=gas[i]-cost[i];
               if(currengas<0){
                   startindex = i+1;
                   currengas=0;
               }
           }
           return  totalgas >= totalcost ? startindex : -1;
    }
    public static void main(String[] args) {
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
