import java.util.ArrayList;

public class ProblemSecond {
    public ProblemSecond(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    private ArrayList<Integer> list1 =new ArrayList<>();
   private ArrayList<Integer> list2 =new ArrayList<>();

    int[] first = { 1, 4, 9, 16 };
    int[] second = { 9, 7, 4, 9, 11 };

    public ProblemSecond(Integer[] first, Integer[] second) {
    }

    public ArrayList<Integer> combine_Classes(ArrayList<?>list1, ArrayList<?> list2){
        int c1 = 0, c2 = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        while(c1 < list1.size() || c2 < list2.size()) {
            if(c1 < list1.size())
                res.add((Integer) list1.get(c1++));
            if(c2 < list2.size())
                res.add((Integer) list2.get(c2++));
        }
        return res;
    }
}
