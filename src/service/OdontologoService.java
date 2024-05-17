// service/OdontologoService.java
package service;

import dao.OdontologoDAO;
import dao.OdontologoDAOCollectionImpl;
import dao.OdontologoDAOH2;
import model.Odontologo;
import java.util.List;
import org.apache.log4j.Logger;

public class OdontologoService {
    private static final Logger logger = Logger.getLogger(OdontologoService.class);

    private OdontologoDAOH2 odontologoDAOH2;
    private OdontologoDAO odontologoDAOCollectionImpl;

    public OdontologoService() {
        odontologoDAOH2 =  new OdontologoDAOH2();
        odontologoDAOCollectionImpl= new OdontologoDAOCollectionImpl();
    }

    public OdontologoService(OdontologoDAO odontologoDAO) {
        this.odontologoDAOH2 = odontologoDAOH2;
    }

    public Odontologo guardar(Odontologo odontologo) {
        return odontologoDAOH2.guardar(odontologo);
    }

    public List<Odontologo> listarTodos() {
        List<Odontologo> odontologos = odontologoDAOH2.buscarTodos();
        for (Odontologo odontologo : odontologos) {
            logger.info(odontologo);
        }
        return odontologoDAOH2.buscarTodos();
    }
}
