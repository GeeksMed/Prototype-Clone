package padroesprojeto.criacao;

public class Clone implements Cloneable{
    private int serialNumber;
    private String type;
    private String shootSkills;
    private Planet planet;

    public Clone(int serialNumber, String type, String shootSkills, Planet planet){
        this.serialNumber = serialNumber;
        this.type = type;
        this.shootSkills = shootSkills;
        this.planet = planet;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShootSkills() {
        return shootSkills;
    }

    public void setShootSkills(String shootSkills) {
        this.shootSkills = shootSkills;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    @Override
    public Clone clone() throws CloneNotSupportedException{
        Clone cloneClone = (Clone) super.clone();
        cloneClone.planet = (Planet) cloneClone.planet.clone();
        return cloneClone;
    }

    @Override
    public String toString(){
        return "Clone{"+
                "serialNumber="+serialNumber+
                ", type='"+type+'\''+
                ", shootSkills='"+shootSkills+'\''+
                ", planet="+planet+
                "}";

    }
}
