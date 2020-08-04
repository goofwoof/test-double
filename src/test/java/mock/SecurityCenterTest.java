package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */
    SecurityCenter sc;
    @BeforeEach
    public void setUp() {
        DoorPanel dp = new MockDoorPanel();
         sc = new SecurityCenter(dp);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        sc.switchOn();
    }
}
