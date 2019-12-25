package homework4.garage_2.parts;

public abstract class Part {
    protected String id;


Part(String id){

    this.id = id;
}

public abstract void getData();
}
