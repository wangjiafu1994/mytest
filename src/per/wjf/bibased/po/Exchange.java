package per.wjf.bibased.po;

import java.util.Date;

public class Exchange {
    private Integer id;

    private Integer userid;

    private Integer totalintegral;

    private String status;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTotalintegral() {
        return totalintegral;
    }

    public void setTotalintegral(Integer totalintegral) {
        this.totalintegral = totalintegral;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}