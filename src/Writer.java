import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Writer {

    void Save(List<Human> allFamily, Human Ded, Human Babushka, Human Otec, Human Matb, Human Son, Human Doch) throws IOException;

    void Download() throws IOException, ClassNotFoundException;
}
