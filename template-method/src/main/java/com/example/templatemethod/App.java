package main.java.com.example.templatemethod;

public class App {
    public static void main(String[] args) {
        var character = new Character(new DIYConstructMethod());
        character.construct("은행");
        character.construct("학교");
        character.changeMethod(new ProfessionalConstructMethod());
        character.construct("학교");
        character.construct("은행");
    }
}
