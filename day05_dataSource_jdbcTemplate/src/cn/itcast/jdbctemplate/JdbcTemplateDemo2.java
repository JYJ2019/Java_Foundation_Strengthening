package cn.itcast.jdbctemplate;

import cn.itcast.domain.Emp;
import cn.itcast.utils.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description：Junit单元测试，可以让方法独立执行
 * @Author 金宇佳
 * @Date 2020/12/31 11:16
 * @Version 1.0
 */
public class JdbcTemplateDemo2 {
    //1. 获取JDBCTemplate对象
    JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
    /**
     * 1. 修改1号数据的 salary 为 10000
     */
    @Test
    public void test1() {
        //2. 定义sql
        String sql = "UPDATE emp SET salary = ? WHERE id = ?";
        //3. 执行sql
        int count = template.update(sql,10000, 1001);
        System.out.println(count);
    }

    /**
     * 2. 添加一条记录
     */
    @Test
    public void test2() {
        String sql = "INSERT INTO emp(id,ename,dept_id) VALUES (?, ?, ?)";
        int count = template.update(sql, 1015, "郭靖", 10);
        System.out.println(count);
    }

    /**
     * 3.删除刚才添加的记录
     */
    @Test
    public void test3() {
        String sql = "DELETE FROM emp WHERE id = ?";
        int count = template.update(sql, 1015);
        System.out.println(count);
    }

    /**
     * 4.查询id为1001的记录，将其封装为Map集合
     * 注意：这个方法查询的结果集长度只能是1
     */
    @Test
    public void test4() {
        String sql = "SELECT * FROM emp WHERE id = ?";
        // String sql = "SELECT * FROM emp WHERE id = ? OR id = ?";//IncorrectResultSizeDataAccessException
        Map<String, Object> map = template.queryForMap(sql, 1001);
        // Map<String, Object> map = template.queryForMap(sql, 1001, 1002);
        System.out.println(map);
    }

    /**
     * 5. 查询所有记录，将其封装为List
     */
    @Test
    public void test5() {
        String sql = "SELECT * FROM emp";
        List<Map<String, Object>> maps = template.queryForList(sql);
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }

    /**
     * 6. 查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test6() {
        String sql = "SELECT * FROM emp";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");

                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                return emp;
            }
        });

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 6. 查询所有记录，将其封装为Emp对象的List集合
     */
    @Test
    public void test6_2() {
        String sql = "SELECT * FROM emp";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        for (Emp emp : list) {
            System.out.println(emp);
        }
    }

    /**
     * 7. 查询总记录数
     */
    @Test
    public void test7() {
        String sql = "SELECT COUNT(id) FROM emp";
        Long total = template.queryForObject(sql, long.class);
        System.out.println(total);
    }
}
