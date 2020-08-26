package main.java.com.ZhenyaShvyrkov.javacore.chapter06.structural.decorator;

public class NewSkillDecorator extends Decorator {
    NewSkillDecorator(Worker worker){
        super(worker);
    }
    public void work(){
        super.work();
        addNewSkill();
    }
    private void addNewSkill(){
        System.out.println("but after i work as manager in a small company");
    }
}
