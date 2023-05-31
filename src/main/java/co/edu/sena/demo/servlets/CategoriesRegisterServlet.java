package co.edu.sena.demo.servlets;
import co.edu.sena.demo.modelo.Category;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.repository;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@WebServlet("registerCategory")
public class CategoriesRegisterServlet extends HttpServlet {
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //  collect all form data
            String category_name = request.getParameter("category_name");
            //  fill it up in a User Bean
            Category category = new Category();
            category.setCategory_name(category_name);

            // call repository layer and save the user object to DB
            repository<Category> repository = new repository<Category>() {
                @Override
                public List<Category> ListAl10bj() throws SQLException {
                    return null;
                }

                @Override
                public Object byIdbj(Integer id) throws SQLException {
                    return null;
                }

                @Override
                public Integer save0bj(Object user) throws SQLException {
                    return null;
                }

                @Override
                public void delete0bj(Integer id) throws SQLException {

                }

                @Override
                public Category create0bj(ResultSet rs) throws SQLException {
                    return null;
                }

                @Override
                public List<Category> listAllObj() throws SQLException {
                    return null;
                }

                @Override
                public Category byIdObj(Integer id) throws SQLException {
                    return null;
                }

                @Override
                public Integer saveObj(Category user) throws SQLException {
                    return null;
                }

                @Override
                public void deleteObj(Integer id) throws SQLException {

                }

                @Override
                public Category createObj(ResultSet rs) throws SQLException {
                    return null;
                }
            };
            int rows = 0;
            try {
                repository.saveObj(category);
            } catch (SQLException e) {
                e.printStackTrace();
            }


            //todo prepare message for user about success
            //String message = null

            if(rows==0){
                System.out.println("Ocurrio un error");
            }else{
                System.out.println("Registro exitoso");
            }

            // todo write the message back to the page in client browser
        }

    private class CategoryRepositoryImpl {
    }
}


