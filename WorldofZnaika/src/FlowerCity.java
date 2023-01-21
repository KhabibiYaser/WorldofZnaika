public class FlowerCity extends World{

    public String getLocation(){return Location.Flowercity.toString();}
    public float getGravitation(){
        return Location.Flowercity.level;
    }
    public int getPeople() {
        return Location.Flowercity.people;
    }

}
