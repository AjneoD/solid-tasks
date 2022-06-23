package src.o.before;

public class Manager extends TypeEmployee implements Worker{

    @Override
    public void setRole() {
        this.isManager = true;
    }
}