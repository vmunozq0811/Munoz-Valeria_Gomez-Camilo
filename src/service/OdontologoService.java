// service/OdontologoService.java
package service;

import dao.OdontologoDAO;
import model.Odontologo;

import java.util.List;

public class OdontologoService {
    private final OdontologoDAO odontologoDAO;

    public OdontologoService(OdontologoDAO odontologoDAO) {
        this.odontologoDAO = odontologoDAO;
    }

    public void guardarOdontologo(Odontologo odontologo) {
        odontologoDAO.guardarOdontologo(odontologo);
    }

    public List<Odontologo> listarOdontologos() {
        return odontologoDAO.listarOdontologos();
    }
}
