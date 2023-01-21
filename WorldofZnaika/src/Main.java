public class Main {



    public static void main(String[] args) {

        // Как перемещаются персонажи -> шагами (step) , выбираете число , например 2
        //            0            1        2
        //       [FLowerCity , Pavilion , Cabina]

        // Если вы были в FlowerCity то переместитесь в Кабину

        // выбираете число , например 5 , возьмется остаток от 3 это 2 , и вы будете в Кабине

        // Персонажи по дефолту находятся в FlowerCity


        // Как определить кого из персонажей переместить , кто будет использовать пульт ?
        // Очень просто , я решил , что Знайка будет принимать true , а грабитель false в объект от класса human
        // так мы будем их отличать





        FlowerCity Fl = new FlowerCity();
        Pavilion Pav = new Pavilion();
        Cabina Cab = new Cabina();

        Human znaika = new Human("Знайка", 20,true);
        Human burglar = new Human("Грабитель",100,false);
        Remote remote = new Remote(); //пульт

        System.out.println(znaika.getPostion() + " Стартовая Позиция Знайки");
        System.out.println(burglar.getPostion()+ " Стартовая Позиция Грабителя");

        System.out.println("Знайка решает уйти из FLowerCity");
        znaika.changeDir(true,2);
        System.out.println("Знайка прибывает в " + znaika.getPostion());


        System.out.println( "Позиция знайки "+ znaika.getPostion() + " количество людей в команте - "+ Cab.getPeople() );

        System.out.println("Знайка понимает что никого нет , уходит обратно");
        znaika.changeDir(true,0); // Знайка переместился в FlowerCity , дефолтная позиция

        System.out.println(znaika.getPostion());
        System.out.println( "Позиция знайки "+ znaika.getPostion());


        System.out.println("<<Грабитель решает войти в кабину>>");
        burglar.changeDir(false,2);
        System.out.println( "Позиция Грабителя - "+ burglar.getPostion() + " количество людей в команте - "+ Cab.getPeople() );



        System.out.println("<<Знайка решает войти в кабину>>");
        znaika.changeDir(true,2);
        System.out.println("Позиция знайки "+ znaika.getPostion() + " количество людей в команте - "+ Cab.getPeople() );

        System.out.println("Ужас , кто-то чужой пробрался в комнату  ! Знайка отключает гравитацию в комнате");

        remote.changegrav(true,true); // Пульт гравитации отключается , то есть знайка его задействовал

        System.out.println("Наш грабитель подлетел и скорее всего умер  от удара об стену !!!!");

        // Чтобы подтвердить невесомость Грабителя , давайте узнаем его ускорение свободного падения :
        System.out.println( "грабитель летает - "+ burglar.getGrav(false));

        // Чтобы подтвердить невесомость Знайки , давайте узнаем его ускорение свободного падения :
        System.out.println( "у знайки есть иммунитет к действию пульта , знайка на земле - "+ znaika.getGrav(true));














    }



}