package o.finished;

public class Execute extends TypeEmploye implements Worker{
    @Override
    public void setRole() {
        this.isManager = true;
        this.isExecutive = true;
    }
}