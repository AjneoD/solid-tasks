package src.o.before;

public class Execute extends TypeEmployee implements Worker{
    @Override
    public void setRole() {
        this.isManager = true;
        this.isExecutive = true;
    }
}