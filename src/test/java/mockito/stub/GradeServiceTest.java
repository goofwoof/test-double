package mockito.stub;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    @Mock
    GradeSystem mockGradeSystem;

    @InjectMocks
    GradeService gradeService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        gradeService = new GradeService(mockGradeSystem);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(mockGradeSystem.gradesFor(0)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));
        assertEquals( 90.0, gradeService.calculateAverageGrades(0));
    }
}
