// service/OdontologoService.java
package service;

import dao.OdontologoDAO;
import dao.OdontologoDAOCollectionImpl;
import dao.OdontologoDAOH2;
import model.Odontologo;
import java.util.List;

public class OdontologoService {
    private OdontologoDAO odontologoDAOH2;
    private OdontologoDAO odontologoDAOCollectionImpl;

    public OdontologoService() {
        odontologoDAOH2 = (OdontologoDAO) new OdontologoDAOH2();
        odontologoDAOCollectionImpl= new OdontologoDAOCollectionImpl();
    }


    public Odontologo guardar(Odontologo odontologo) {
        return odontologoDAOH2.guardar(odontologo);
    }

    public List<Odontologo> listarTodos() {
        OdontologoDAO odontologoDAO = null;
        return odontologoDAO.listarTodos();
    }
}
