// service/OdontologoService.java
package service;

import dao.OdontologoDAO;
import dao.OdontologoDAOCollectionImpl;
import dao.OdontologoDAOH2;
import dao.iDao;
import model.Odontologo;
import model.Paciente;

import java.util.List;

public class OdontologoService {
    private OdontologoDAOH2 odontologoDAOH2;
    private OdontologoDAO odontologoDAOCollectionImpl;
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoDAOH2 = new OdontologoDAOH2();
        odontologoDAOCollectionImpl= new OdontologoDAOCollectionImpl();
    }


    public Odontologo guardar(Odontologo odontologo) {
        return odontologoDAOH2.guardar(odontologo);
    }

    public List<Odontologo> listarTodos() {
        OdontologoDAO odontologoDAO = null;
        return odontologoDAO.listarTodos();
    }
    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoDAOH2.guardar(odontologo);
    }
    public Odontologo buscarOdontologos(){
        return (Odontologo) odontologoDAOH2.buscarTodos();
    }
}
