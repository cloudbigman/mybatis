import com.xzit.springboot.entity.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoleDao {
    public List<Role> selectAllRoles() throws Exception{
        //将执行的sql
        String sql = " SELECT role_id, role_name, use_state, role_type, description "+
                     " FROM role";
        //JDBC操作数据库的步骤：（1）加载驱动程序；（2）获取连接对象Connection
        //(3)创建命令对象
        Connection conn = DbUitls.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        //(4)执行并获得结果集
        ResultSet resultSet = pstmt.executeQuery();
        //(5)遍历结果集，将数据库中的数据转换成Java中的对象,然后存储在List集合中
        List<Role> roles = new ArrayList<Role>();
        //关系映射为一个Java对象，需要程序员手工完成
        while(resultSet.next()){
            String role_name = resultSet.getString("role_name");
            int role_id = resultSet.getInt("role_id");
            int use_state = resultSet.getInt("use_state");
            int role_type = resultSet.getInt("role_type");
            String description = resultSet.getString("description");
            Role role= new Role(role_id,role_name,use_state,role_type,description);
            roles.add(role);
        }
        //（6）关闭连接对象，释放资源
        DbUitls.close(resultSet,pstmt,conn);
        return roles;
    }

}
