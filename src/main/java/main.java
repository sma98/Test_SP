import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {


        public static void main(String[] args) {
thirdProblem thirdProblem =new thirdProblem();
                System.out.println(thirdProblem.fibbonacci());
            //  int<Integer>list=new ArrayList<>();
            ArrayList<Integer> first =new ArrayList<>();
            first.add(1);
            first.add(3);
            first.add(5);
            first.add(9);


            ArrayList<Integer> second =new ArrayList<>();
            second.add(2);
            second.add(4);
            second.add(6);
            second.add(8);
            second.add(10);
            second.add(12);

            ProblemSecond problemSecond=new ProblemSecond(first,second);
            System.out.println(problemSecond.combine_Classes(first,second));
            List<Integer> numbers = Arrays.asList(7, 58, 87, 2, 16, 34, 54, 0, 90);
            problemFourth problemFourth =new problemFourth();
            System.out.println(problemFourth.findLargestNumber(numbers));


        }






}
