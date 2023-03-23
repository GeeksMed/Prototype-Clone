package padroesprojeto.criacao;

public class Planet implements Cloneable{
    private String name;
    private String sector;

    public Planet(String name, String sector){
        super();
        this.name = name;
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}
