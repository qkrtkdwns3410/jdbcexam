package jdbcexam;

import jdbcexam.dao.RoleDao;
import jdbcexam.dto.Role;

public class jdbcexam {
    public static void main(String[] args) {
        RoleDao dao = new RoleDao();
        Role role = dao.getRole(100);
        System.out.println(role);
    }
}
