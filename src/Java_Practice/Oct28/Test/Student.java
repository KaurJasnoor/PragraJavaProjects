package Java_Practice.Oct28.Test;

public class Student<Type1, Type2> {  // Example of Generic Type
    Type1 id;
    Type2 name;

    public Student(Type1 id, Type2 name) {
        this.id = id;
        this.name = name;
    }

    public Type1 getId() {
        return id;
    }

    public void setId(Type1 id) {
        this.id = id;
    }

    public Type2 getName() {
        return name;
    }

    public void setName(Type2 name) {
        this.name = name;
    }
}
