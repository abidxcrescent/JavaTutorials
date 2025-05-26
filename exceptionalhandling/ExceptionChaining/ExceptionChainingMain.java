package exceptionalhandling.ExceptionChaining;

import java.sql.SQLException;

public record ExceptionChainingMain() {
    public static void main(String[] args) {

        try {
            createExceptionChaining();
        } catch (CustomDataBaseException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }

    }

    /*
        CustomDataBaseException has to be thrown because it is a
        wrapper around SQLException and its coming from a catch block.
     */
    static void createExceptionChaining() throws CustomDataBaseException {

        try {
            // simulate code that will throw
            // SQLException.
            throw new SQLException("SQL Exception");
        } catch (SQLException e) {

            // this line throws a CustomDataBaseException and also includes object of
            // SQLException e.
            throw new CustomDataBaseException("Custom Database exception",e);
        }

    }
}
