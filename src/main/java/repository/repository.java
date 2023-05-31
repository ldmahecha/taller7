package repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class repository<U> {

    public abstract List<U> ListAl10bj() throws SQLException;

    public abstract Object byIdbj(Integer id) throws SQLException;

    public abstract Integer save0bj(Object user) throws SQLException;

    public void deleteObj(int i) {
    }

    public abstract void delete0bj(Integer id) throws SQLException;

    public abstract U create0bj(ResultSet rs) throws SQLException;

    public abstract List<U> listAllObj() throws SQLException;

    public abstract U byIdObj(Integer id) throws SQLException;

    public abstract Integer saveObj(U user) throws SQLException;

    public abstract void deleteObj(Integer id) throws SQLException;

    public abstract U createObj(ResultSet rs) throws SQLException;

    public interface Repository<T> {

        List<User> ListAl10bj() throws SQLException;

        User byIdbj(Integer id) throws SQLException;

        Integer save0bj(User user) throws SQLException;

        void delete0bj(Integer id) throws SQLException;

        User create0bj(ResultSet rs) throws SQLException;

        List<T> listAllObj() throws SQLException;

        T byIdObj(Integer id) throws SQLException;

        Integer saveObj(T t) throws SQLException;

        void deleteObj(Integer id) throws SQLException;

        T createObj(ResultSet rs) throws SQLException;

        void save0bjCuserInsert(String s);

        class User {
        }
    }
}

