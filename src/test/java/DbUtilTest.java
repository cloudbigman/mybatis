import com.xzit.springboot.entity.Role;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class DbUtilTest {
    @Test
    public void dbUitl() throws Exception {
       Connection conn = DbUitls.getConnection();
       System.out.println("conn=" + conn);
       DbUitls.close(null,conn);
    }

    @Test
    public void findRoles() throws Exception {
       RoleDao roleDao = new RoleDao();
       List<Role> roles = roleDao.selectAllRoles();
       for(Role role:roles){
           System.out.println(role);
       }
    }
}
