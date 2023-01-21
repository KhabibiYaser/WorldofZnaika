public class Cabina extends World {

    private String material = "transparent_plastic";

    public String getLocation(){return Location.Cabina.toString();}
    public float getGravitation(){
        return Location.Cabina.level;
    }
    public int getPeople() {return Location.Cabina.people;}


    public String getMaterial() {
        return material;
    }
}
