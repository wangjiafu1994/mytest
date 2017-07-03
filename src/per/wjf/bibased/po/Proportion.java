package per.wjf.bibased.po;

public class Proportion {
    private Integer id;

    private Float pro;

    private String interval;

    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPro() {
        return pro;
    }

    public void setPro(Float pro) {
        this.pro = pro;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval == null ? null : interval.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}