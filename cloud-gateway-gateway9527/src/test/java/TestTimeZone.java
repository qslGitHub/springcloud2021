import org.junit.Test;

import java.time.ZonedDateTime;

/**
 * @Author sileiqiang
 * @create 2021/7/13 9:21 下午
 */
public class TestTimeZone {

    @Test
    public static void main(String[] args) {
        ZonedDateTime zbj=ZonedDateTime.now();
        System.out.println(zbj);
    }
}
