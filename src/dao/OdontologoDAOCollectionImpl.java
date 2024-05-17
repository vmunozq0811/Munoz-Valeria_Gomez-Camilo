// dao/OdontologoDAOCollectionImpl.java
package dao;

import model.Odontologo;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOCollectionImpl implements OdontologoDAO {
    private List<Odontologo> odontologos = new ArrayList<>();

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
        return odontologo;
    }

    @Override
    public List<Odontologo> listarTodos() {
        return new ArrayList<>(odontologos);
    }
}
