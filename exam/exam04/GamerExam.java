package exam04;

public class GamerExam {
    public static void main(String[] args) {
        Gamer amateur = new Amateur();
        Gamer progamer = new Progamer();

        System.out.println("아마추어");
        amateur.run(60);
        amateur.jump(2);
        amateur.turn(5);
        amateur.show("강민우");

        System.out.println();

        System.out.println("프로게이머");
        progamer.run(80);
        progamer.jump(5);
        progamer.turn(10);
        progamer.show("강민우");
    }
}