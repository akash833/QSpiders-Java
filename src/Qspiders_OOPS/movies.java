package Qspiders_OOPS;

public class movies {
    String name;
    String actor;
    int YOR;
    String language;

    public movies(String name, String actor, int YOR, String language) {
        this.name = name;
        this.actor = actor;
        this.YOR = YOR;
        this.language = language;
    }

//    movies(String a,String b,int c,String d){
//        name=a;
//        actor=b;
//        YOR=c;
//        language=d;
//    }

    public static void main(String[] args) {
        movies m1=new movies("PK","Amir Khan",2016,"Hindi");
        movies m2=new movies("Avengers","Tony Stark",2020,"English");
        movies m3=new movies("Pushpa","Allu Arjun",2022,"Tamil");

        System.out.println(m1.name+" "+m1.name+" "+m1.YOR+" "+m1.language);
        System.out.println(m2.name+" "+m2.name+" "+m2.YOR+" "+m2.language);
        System.out.println(m3.name+" "+m3.name+" "+m3.YOR+" "+m3.language);
    }
}
