package main.java.com.example.templatemethod;

public class DIYConstructMethod extends ConstructMethod{
    @Override
    protected void setGoal(String building) {
        System.out.println(building + "을 목표로 설정합니다.");
    }

    @Override
    protected String setMaterial(String building) {
        System.out.println(building + "을 손으로 만듭니다.");
        return "손으로 만드는 " + building;
    }

    @Override
    protected String design(String building) {
        System.out.println(building + "을(를) 종이와 펜으로 설계합니다.");
        return "조잡한 " + building;
    }

    @Override
    protected void build(String building) {
        System.out.println("건축이 완료되었습니다!");
        System.out.println("결과물 : " + building);
    }
}
