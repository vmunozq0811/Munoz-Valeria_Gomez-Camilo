import dao.BD;
import dao.OdontologoDAO;
import dao.OdontologoDAOCollectionImpl;
import model.Odontologo;
import model.Paciente;
import service.OdontologoService;
import service.PacienteService;

public class OdontologoServiceTest {
    public static void main(String[] args) {


        OdontologoDAO odontologoDAO = new OdontologoDAOCollectionImpl();
        OdontologoService odontologoService = new OdontologoService();

        Odontologo odontologo1 = new Odontologo(1, "Juan", "Pérez", "MAT123");
        Odontologo odontologo2 = new Odontologo(2, "Ana", "Gómez", "MAT456");

        odontologoDAO.guardar(odontologo1);
        odontologoDAO.guardar(odontologo2);


    }
}
