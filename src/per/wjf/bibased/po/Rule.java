package per.wjf.bibased.po;

public class Rule {
    private Integer id;

    private Integer fomula;

    private String descraption;

    private Boolean isapplication;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFomula() {
        return fomula;
    }

    public void setFomula(Integer fomula) {
        this.fomula = fomula;
    }

    public String getDescraption() {
        return descraption;
    }

    public void setDescraption(String descraption) {
        this.descraption = descraption == null ? null : descraption.trim();
    }

    public Boolean getIsapplication() {
        return isapplication;
    }

    public void setIsapplication(Boolean isapplication) {
        this.isapplication = isapplication;
    }
}