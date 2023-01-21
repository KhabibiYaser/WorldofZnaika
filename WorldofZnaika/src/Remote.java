public class Remote implements Pultable {

    private String material = "Состоит из магнита и лунного камня";

    @Override
    public String toString() {
        return "remote{" +
                "futlar= Черный продолговатый футляр" +
                ", material='" + material + '\'' +
                '}';
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void changegrav(boolean Znaika, boolean On) {
        if (Znaika == true && On == true) {         // Отключить гравитацию
            People.burglar.gravitation = 0;
            Location.Cabina.level = 0;
        } else if (Znaika == true && On == false) { //  Вернуть обратное состояние
            People.burglar.gravitation = 9.8f;
            Location.Cabina.level = 9.8f;
        } else {
            System.out.println("Доступ к пульту запрещен");  // Грабителю нельзя пользоваться пультом
        }
    }


    public boolean equals(Object obj) {
        Remote a = (Remote) obj;
        return material.equals(a.material);
    }


    @Override
    public int hashCode() {
        double a = Math.abs(21 * 120938103 * Math.random());
        return (int)a;
    }
}