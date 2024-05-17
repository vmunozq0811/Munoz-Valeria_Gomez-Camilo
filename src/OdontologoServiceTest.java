import dao.BD;
import dao.OdontologoDAO;
import dao.OdontologoDAOCollectionImpl;
import model.Odontologo;
import model.Paciente;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import service.OdontologoService;
import service.PacienteService;

import java.util.List;

public class OdontologoServiceTest {
    public static void main(String[] args) {


        OdontologoDAO odontologoDAO = new OdontologoDAOCollectionImpl();
        OdontologoService odontologoService = new OdontologoService();

        Odontologo odontologo1 = new Odontologo(1, "Juan", "Pérez", "MAT123");
        Odontologo odontologo2 = new Odontologo(2, "Ana", "Gómez", "MAT456");

        odontologoDAO.guardar(odontologo1);
        odontologoDAO.guardar(odontologo2);

    }
    @Test
    public void guardarOdontologo(){
        BD.crearTablas();
        OdontologoService odontologoService= new OdontologoService();
        Odontologo odontologo1 = new Odontologo(1, "Juan", "Pérez", "MAT123");
        Odontologo odontologo2 = new Odontologo(2, "Ana", "Gómez", "MAT456");
        Odontologo odontologo= odontologoService.guardarOdontologo(odontologo1);
        Odontologo odontologotest= odontologoService.guardarOdontologo(odontologo2);
        Assertions.assertTrue(odontologo!=null);
        Assertions.assertTrue(odontologotest!=null);
    }
    @Test
    public void buscarOdontologo(){
        BD.crearTablas();
        OdontologoService odontologoService= new OdontologoService();
        Odontologo odontologo= odontologoService.buscarOdontologos();
        Assertions.assertTrue(odontologo!=null);
    }
}
