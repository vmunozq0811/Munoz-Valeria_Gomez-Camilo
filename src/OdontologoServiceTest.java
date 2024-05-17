import dao.BD;
import model.Odontologo;
import model.Paciente;
import service.OdontologoService;
import service.PacienteService;

public class OdontologoServiceTest {
    OdontologoDAO odontologoDAO = new OdontologoDAOCollectionImpl();
    OdontologoService odontologoService = new OdontologoService(odontologoDAO);

    // Crear y guardar algunos odontólogos
    Odontologo odontologo1 = new Odontologo("Juan", "Pérez", "MAT123");
    Odontologo odontologo2 = new Odontologo("Ana", "Gómez", "MAT456");

        odontologoService.guardarOdontologo(odontologo1);
        odontologoService.guardarOdontologo(odontologo2);
}