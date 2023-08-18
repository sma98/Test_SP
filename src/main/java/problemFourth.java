import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class problemFourth {
    public problemFourth() {
    }

    public String findLargestNumber(List<Integer> nums)
    {
        Collections.sort(nums, (a, b) -> (String.valueOf(b) + a).compareTo(String.valueOf(a) + b));
        return nums.stream().map(Object::toString).collect(Collectors.joining(""));
    }

}

