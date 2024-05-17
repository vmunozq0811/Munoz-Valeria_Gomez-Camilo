// dao/OdontologoDAOCollectionImpl.java
package dao;

import model.Odontologo;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOCollectionImpl implements OdontologoDAO {
    private List<Odontologo> odontologos = new ArrayList<>();

    @Override
    public void guardarOdontologo(Odontologo odontologo) {
        odontologos.add(odontologo);
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        return odontologos;
    }
}
