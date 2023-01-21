enum People {

    Znaika(Location.Flowercity.toString(),9.8f),
    burglar(Location.Flowercity.toString(),9.8f);

    String position_;
    float gravitation;
    People(String position_ , float gravitation){
            this.position_ = position_;
            this.gravitation = gravitation;

    }


}

