
import java.util.List;
import pro.modelo.entidad.*;

public interface PersonaDao {
    public boolean agregarPer(Persona pesona);
    public List<Persona> listarpersona();
    public boolean eliminarcliente(int id);
}
