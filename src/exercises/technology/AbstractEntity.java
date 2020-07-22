package exercises.technology;

public abstract class AbstractEntity {
    private static int nextId = 1;
    private int id= 0;

    public AbstractEntity(){
        id = nextId;
        nextId++;
    }

    public int getId(){
        return this.id;
    }
}
