package employeeApp;

public class Healthplan {
    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id,String name,Plan plan){
        this.id=id;
        this.name=name;
        this.plan=plan;
    }
    public Plan getPlan() {
        return plan;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Healthplan [id=" + id + ", name=" + name + ", plan=" + plan + "]";
    }
}
