package dao;

import model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OdontologoDAOH2 implements iDao<Odontologo> {

    private static final Logger logger= Logger.getLogger(OdontologoDAOH2.class);
    /**
     * private Integer matricula;
     *     private String nombre;
     *     private String apellido;
     */
    private static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS VALUES (?,?,?,?)";
    private static final String SQL_SELECT_ALL = "SELECT * FROM ODONTOLOGOS";

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = null;
        try{
            connection= BD.getConnection();
            PreparedStatement psinsert= connection.prepareStatement(SQL_INSERT);
            psinsert.setInt(1,odontologo.getId());
            psinsert.setString(2, odontologo.getNombre());
            psinsert.setString(3, odontologo.getApellido());
            psinsert.setString(3, odontologo.getMatricula());
        } catch (Exception e){
            logger.warn(e.getMessage());
        }
        return odontologo;
    }
}
