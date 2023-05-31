package repository;


import java.sql.SQLException;
public class TestUserRepositoryImpl {



        public static void main(String[] args) throws SQLException {
            repository<User> repository = new UserRepositoryImpl();

            System.out.println("==================== saveObj Insert ==============");
            User userInsert = new User();
            userInsert.setUser_firstname("Daniela");
            userInsert.setUser_firstname("Mahecha");
            userInsert.setUser_email("danimahecha2413@gmail.com");
            userInsert.setUser_password("Daniela123");
            repository.saveObj(userInsert);
            userInsert.setUser_firstname("johan");
            userInsert.setUser_firstname("lara");
            userInsert.setUser_email("danimahecha13Qgmail.com");
            userInsert.setUser_password("E1234d@");
            repository.saveObj(userInsert);

            System.out.println("============ listAllObj ========");
            repository.listAllObj().forEach(System.out::println);
            System.out.println();

            System.out.println("======== byIdObj ========");
            System.out.println(repository.byIdObj(1));
            System.out.println();

            System.out.println("===== saveObj ========");
            User userUpdate = new User();
            userUpdate.setUser_id(2);
            userUpdate.setUser_firstname("");
            userUpdate.setUser_firstname("Sergio");
            userUpdate.setUser_email("sermach13@gmail.com");
            userUpdate.setUser_password("Sergio1865@");
            repository.saveObj((userInsert));
            repository.listAllObj().forEach(System.out::println);
            System.out.println();

            System.out.println("========== deleteObj ========");
            repository.deleteObj(2);
            ((UserRepositoryImpl<User>) repository).listAllObj().forEach(System.out::println);
        }

    private static class User {
        public void setUser_firstname(String daniela) {
        }

        public void setUser_email(String mail) {
        }

        public void setUser_password(String daniela123) {
        }

        public void setUser_id(int i) {
        }
    }
}

