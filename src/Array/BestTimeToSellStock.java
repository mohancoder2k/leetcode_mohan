package Array;


import java.util.Collections;
import java.util.HashSet;

public class BestTimeToSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
       HashSet<Integer> diffset = new HashSet();
       
       for(int i=0;i<prices.length-1;i++)
       {
    	  for(int j=i+1;j<prices.length;j++) {
    		  int diff = prices[j]-prices[i];
    		  if(diff>0) {
    			  diffset.add(diff);
    		  }
    	  }
       }
       for(int diff:diffset) {
    	   System.out.println(diff);
       }
       int max = Collections.max(diffset);
       System.out.println(max);
    }
}
