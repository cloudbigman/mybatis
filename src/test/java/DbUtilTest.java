import org.junit.Test;

import java.sql.Connection;

public class DbUtilTest {
    @Test
    public void dbUitl() throws Exception {
       Connection conn = DbUitls.getConnection();
       System.out.println("conn=" + conn);
       DbUitls.close(null,conn);
    }
}
