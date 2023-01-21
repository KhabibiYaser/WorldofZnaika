public class Human implements Cdir{

    public float weight;
    public boolean immunity; // Знайка -> true ; Burglar -> False
    public boolean cd_immunity; // Определеляем кого будем перемещать : Знайка -> true ; Burglar -> False
    private final int Arms = 2;
    private final int Legs = 2;
    public String name;

    public Human(String name, float weight, boolean Znaika) {
        this.weight = weight;
        this.immunity = Znaika;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getPostion(){
        if (immunity == true) {
            return People.Znaika.position_;
        } else {
            return People.burglar.position_;
        }
    }


    @Override
    public void changeDir(boolean znaika, int step) {

        String[] loc = new String[]{Location.Flowercity.toString(), Location.Pavilion.toString(), Location.Cabina.toString()};

        step = dircount(step);
        this.cd_immunity = znaika;

        if (cd_immunity == true) {

            if (Location.Pavilion.toString() == People.Znaika.position_) {
                Location.Pavilion.people -= 1;
                if (Location.Pavilion.people < 0) {
                    Location.Pavilion.people = 0;
                }

            } else if (Location.Cabina.toString() == People.Znaika.position_) {
                Location.Cabina.people -= 1;
                if (Location.Pavilion.people < 0) {
                    Location.Pavilion.people = 0;
                }
            }

            People.Znaika.position_ = loc[step];
            amountPeople(cd_immunity, People.Znaika.position_);
            System.out.println("--вы поменяли позицию Знайки--");


        } else {

            if (Location.Pavilion.toString() == People.burglar.position_) {

                Location.Pavilion.people -= 1;
                if (Location.Pavilion.people < 0) {
                    Location.Pavilion.people = 0;
                }
            } else if (Location.Cabina.toString() == People.burglar.position_) {

                Location.Cabina.people -= 1;
                if (Location.Pavilion.people < 0) {
                    Location.Pavilion.people = 0;
                }
            }

            People.burglar.position_ = loc[step];
            amountPeople(cd_immunity, People.burglar.position_);
            System.out.println("--вы поменяли позицию Грабителя--");
        }
    }

    @Override
    public void amountPeople(boolean znaikaa, String loc) {
        if ((znaikaa == true) && (loc == People.Znaika.position_) && (People.Znaika.position_ == Location.Cabina.toString())) {
            Location.Cabina.people += 1;
        } else if ((znaikaa == true) && (loc == People.Znaika.position_) && (People.Znaika.position_ == Location.Pavilion.toString())) {
            Location.Pavilion.people += 1;
        } else if ((znaikaa == false) && (loc == People.burglar.position_) && (People.burglar.position_ == Location.Pavilion.toString())) {
            Location.Pavilion.people += 1;
        } else if ((znaikaa == false) && (loc == People.burglar.position_) && (People.burglar.position_ == Location.Cabina.toString())) {
            Location.Cabina.people += 1;
        }

    }

    @Override
    public int dircount(int steps) {
        int num = steps;
        int l;
        String[] loc = new String[]{"FlowerCity", "Pavilion", "Cabina"};
        if ( 0 < num & num < 3) {
            return num;
        } else if (num >= 3) {
            l = num % 3;
            return l;
        } else {
            return 0;
        }
    }


    public float getGrav(boolean Znaika) {
        if (Znaika == true) {
            return People.Znaika.gravitation;
        } else {
            return People.burglar.gravitation;
        }
    }
}
