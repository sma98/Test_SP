import java.util.ArrayList;
import java.util.List;

public class ProblemFirst {
  public   ArrayList<Integer>list =new ArrayList<>();

    public ArrayList<Integer> getList() {
        return list;
    }

    public ArrayList<Integer> setList(List<Integer> list) {

        list.add(1);
        list.add(2);
        list.add(3);
        return (ArrayList<Integer>) list;
    }
    public Integer forLoop(List<Integer>list){
new ArrayList<Integer>();
int count=list.size();
        Integer sum = null;
   for(int i=0;i<count;i++) {
       sum = sum+list.get(count);
   }
        return sum;
    }

    public ProblemFirst(ArrayList<Integer> list) {
        this.list = list;
    }

    public Integer whileLoop(ArrayList<Integer>list){
    int count=list.size();
    int i=0;
    Integer sum = null;
        while (i<count){
           sum=sum+ list.get(count) ;
        }
        return  null;
}
public Integer reccursion(int arr[], int i,
                          int length){

        if (i == length) {
            return 0;
        }

        return arr[i]
                + reccursion(arr, i + 1,length);

    }
}


