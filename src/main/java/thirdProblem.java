import java.util.ArrayList;

public class thirdProblem {
    public Integer fibbonacci() {
        int n = 100, first = 0, second = 1;

        int sum = 0;
        for (int i = 1; i <= n; ++i) {

            int nextTerm = first + second;
            first = second;
            second = nextTerm;
            sum = nextTerm;
        }
        return sum;
    }
}
