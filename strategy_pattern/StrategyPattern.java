package strategy_pattern;

// 로봇은 공격과 이동을 할수있다.
// 공격과 이동수단이 바뀔수도있는 경우를 대비해 공격을 담당하는 interface, 움직임을 담당하는 interface를 만들어
// 구체적인 수단은 interface를 구현하여 클래스로 만들고
// 로봇의 공격과 움직임의 변화에 유연하게 대처하고 기존의 코드는 변경하지않게 만드는것이 스트래티지 패턴이다.
public class StrategyPattern {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("ATOM");

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.setAttackStrategy(new PunchStrategy());
        taekwonV.setMovingStrategy(new WalkingStrategy());
        taekwonV.attack();
        taekwonV.move();
        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.setAttackStrategy(new MissileStrategy());
        atom.setMovingStrategy(new FlyingStrategy());
        atom.attack();
        atom.move();
        System.out.println();
    }
}
