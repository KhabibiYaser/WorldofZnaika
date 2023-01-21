public abstract class World {


    public String getLocation(){return Location.World.toString();}
    public float getGravitation(){
        return Location.World.level;
    }
    public int getPeople() {
        return Location.World.people;
    }




}
