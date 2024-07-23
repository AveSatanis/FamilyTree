import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
    List<Human> familyMembers;

    public FamilyTree() {
        familyMembers = new ArrayList<>();
    }

    public int size(){
        return  familyMembers.size();
    }

    public void addFamilyMember(Human human){
        familyMembers.add(human);
    }

    public void printFamily(List<Human> FamilyTree){
        System.out.println(FamilyTree);
    }

    public void printFamilyMember(Human human){
        System.out.println(human);
    }
}

