package per.wjf.bibased.po;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer userid;

    private Integer sumprice;

    private String isorder;

    private Integer havaintegral;

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

    public Integer getSumprice() {
        return sumprice;
    }

    public void setSumprice(Integer sumprice) {
        this.sumprice = sumprice;
    }

    public String getIsorder() {
        return isorder;
    }

    public void setIsorder(String isorder) {
        this.isorder = isorder == null ? null : isorder.trim();
    }

    public Integer getHavaintegral() {
        return havaintegral;
    }

    public void setHavaintegral(Integer havaintegral) {
        this.havaintegral = havaintegral;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}