package dao;

import model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements iDao<Odontologo> {

    private static final Logger logger= Logger.getLogger(OdontologoDAOH2.class);
    private static final String SQL_INSERT = "INSERT INTO ODONTOLOGOS VALUES (?,?,?,?)";
    private static final String SQL_SELECT_ALL = "SELECT * FROM ODONTOLOGOS";

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection connection = null;
        logger.info("Insertando odontologo");
        try{
            connection= BD.getConnection();
            PreparedStatement psinsert= connection.prepareStatement(SQL_INSERT);
            psinsert.setInt(1,odontologo.getId());
            psinsert.setString(2, odontologo.getNombre());
            psinsert.setString(3, odontologo.getApellido());
            psinsert.setString(3, odontologo.getMatricula());
            logger.info("Insertado con exito");
        } catch (Exception e){
            logger.warn(e.getMessage());
        }

        return odontologo;
    }

    @Override
    public Odontologo buscarPorId(Integer id) {
        return null;
    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public void actualizar(Odontologo odontologo) {

    }

    @Override
    public List<Odontologo> buscarTodos() {
        Connection connection = null;
        List<Odontologo> listaOdontologos = new ArrayList<>();
        logger.info("Buscando odontologos...");
        try{
            connection= BD.getConnection();
            Statement statement= connection.createStatement();
            PreparedStatement psSelectAll= connection.prepareStatement(SQL_SELECT_ALL);
            ResultSet resultSet = psSelectAll.executeQuery();
            while(resultSet.next()){
                Odontologo odontologo = new Odontologo(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
                listaOdontologos.add(odontologo);
            }
            resultSet.close();
            statement.close();
        }catch(Exception e){
            logger.warn(e.getMessage());
        }
        return listaOdontologos;
    }
}
