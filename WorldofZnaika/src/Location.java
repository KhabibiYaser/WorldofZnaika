public enum Location {

        World(9.8f,2),
        Flowercity(9.8f,2),
        Pavilion(9.8f,0),
        Cabina(9.8f,0);

        float level;
        int people;
        Location(float level,int people){
            this.level = level;
            this.people = people;
        }


}
