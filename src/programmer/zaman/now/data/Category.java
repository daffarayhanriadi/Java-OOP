package programmer.zaman.now.data;

public class Category {

    private String id;

    private boolean expensive;

    // Getter dan Setter
    public String getId() {
        return id;
    }

    // + Validation di Setter
    public void setId(String id) {
        if (id != null) {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
