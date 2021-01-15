package ListasRadix;

import java.util.ArrayList;
import java.util.List;

public class Lradix {


    public static void radix(List<Integer> Lista ) {
     int x,i,j;
     for(x=Integer.SIZE-1;x>=0;x--){
      List<Integer> auxiliar = new ArrayList<Integer>();
      for(int s=0; s<Lista.size();s++){
      auxiliar.add(0);
      }
      j=0;
      for(i=0; i<Lista.size();i++){
          boolean mover=Lista.get(i)<<x>=0;
          
           if(x==0 ? !mover:mover){
              auxiliar.set(j,Lista.get(i));
               j++;
            }
           else{
               Lista.set(i-j,Lista.get(i));
           }
        }   
        for(i=j;i<auxiliar.size();i++){
          auxiliar.set(i,Lista.get(i-j));
      }
      Lista=auxiliar;
      }
        System.out.println("Lista ordenado");
         for( j=0;j<Lista.size();j++){
          System.out.print(Lista.get(j)+" ");
      }
	
	
	
    }
	
}
