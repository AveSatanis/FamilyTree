import java.io.*;
import java.util.List;

public class FileHeandler implements Writer {
    @Override
    public void Save(List<Human> allFamily, Human Ded, Human Babushka, Human Otec, Human Matb, Human Son, Human Doch) throws IOException {
        ObjectOutputStream objectSave = new ObjectOutputStream(
                new FileOutputStream("Family_tree.out"));
        objectSave.writeObject(allFamily);
        objectSave.writeObject(Ded.children);
        objectSave.writeObject(Babushka.children);
        objectSave.writeObject(Otec.parents);
        objectSave.writeObject(Otec.children);
        objectSave.writeObject(Matb.parents);
        objectSave.writeObject(Matb.children);
        objectSave.writeObject(Son.parents);
        objectSave.writeObject(Doch.parents);
        objectSave.close();
    }

    public void Download() throws IOException, ClassNotFoundException {
        ObjectInputStream objectDownload = new ObjectInputStream(
                new FileInputStream("Family_tree.out"));
        Main allFamilyRestored = (Main) objectDownload.readObject();
        Main DedChildrenRestored = (Main) objectDownload.readObject();
        Main BabushkaChildrenRestored = (Main) objectDownload.readObject();
        Main OtecParentsRestored = (Main) objectDownload.readObject();
        Main OtecChildrenRestored = (Main) objectDownload.readObject();
        Main MatbParentsRestored = (Main) objectDownload.readObject();
        Main MatbChildrenRestored = (Main) objectDownload.readObject();
        Main SonParentsRestored = (Main) objectDownload.readObject();
        Main DochParentsRestored = (Main) objectDownload.readObject();
        objectDownload.close();
    }
}
