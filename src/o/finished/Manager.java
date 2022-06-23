package o.finished;
public class Manager extends TypeEmploye implements Worker{

    @Override
    public void setRole() {
        this.isManager = true;
    }
}