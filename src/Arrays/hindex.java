
package Arrays;
import java.util.Arrays;
public class hindex {
    public static int hfind(int[] citations){
      int max_h = citations.length;
      int[] freq = new int[max_h+1];
      for(int i =0;i<max_h;i++){
         if(citations[i]<max_h){
             freq[citations[i]]++;
         }else{
             freq[max_h]++;
         }
      }


      int sum = 0;

      for(int j=freq.length-1;j>=0;j--){
          sum +=freq[j];

          if(sum >= max_h){
              return j ;
          }else{
              max_h--;
          }
      }
      return 0;

    }
    public static void main(String[] args) {
        int[] citations = {3,1,0,5,6};
        System.out.println(hfind(citations));
    }
}
