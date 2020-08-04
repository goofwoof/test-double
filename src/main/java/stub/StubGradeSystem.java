package stub;

import java.util.Arrays;
import java.util.List;

public class StubGradeSystem extends GradeSystem {
    @Override
    public List<Double> gradesFor(long studentId) {
        return Arrays.asList(10.0, 10.0, 10.0);
    }

}
