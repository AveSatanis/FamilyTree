import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
      Gender gender;
     LocalDate birthDate, deathDate;
     List<Human> parents;
     List<Human> children;
     Integer id;


    public Human(String name, Gender gender, LocalDate birthDate, LocalDate deathDate,
                 List<Human> parents, List<Human> children, Integer id) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        parents = new ArrayList<>();
        children = new ArrayList<>();
        this.id = id;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public List<Human> getParents() {
        return parents;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Integer getId() {
        return id;
    }




    @Override
    public String toString() {
        return STR."id: \{id}, name: \{name}, gender: \{gender}, birthDate: \{birthDate}, deathDate: \{deathDate} |";
    }
}
