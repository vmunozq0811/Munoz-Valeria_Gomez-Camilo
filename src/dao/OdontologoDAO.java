// dao/OdontologoDAO.java
package dao;

import model.Odontologo;
import java.util.List;

public interface OdontologoDAO {
    Odontologo guardar(Odontologo odontologo);
    List<Odontologo> listarTodos();
}
