package main.java.com.example.templatemethod;

public class ProfessionalConstructMethod extends ConstructMethod{
    @Override
    protected void setGoal(String building) {
        System.out.println(building + "을 목표로 설정합니다.");
    }

    @Override
    protected String setMaterial(String building) {
        System.out.println(building + "을 전문적으로 건설합니다.");
        return "잘 지어진 " + building;
    }

    @Override
    protected String design(String building) {
        System.out.println(building + "을(를) 전문 설계도구로 설계합니다.");
        return "치밀한 " + building;
    }

    @Override
    protected void build(String building) {
        System.out.println("건축이 완료되었습니다!");
        System.out.println("결과물 : " + building);
    }
}
