package per.wjf.bibased.po;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String address;

    private String postcode;

    private Integer totalintegral;

    private Integer nowintegral;

    private Integer invalidintegral;

    private Integer money;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public Integer getTotalintegral() {
        return totalintegral;
    }

    public void setTotalintegral(Integer totalintegral) {
        this.totalintegral = totalintegral;
    }

    public Integer getNowintegral() {
        return nowintegral;
    }

    public void setNowintegral(Integer nowintegral) {
        this.nowintegral = nowintegral;
    }

    public Integer getInvalidintegral() {
        return invalidintegral;
    }

    public void setInvalidintegral(Integer invalidintegral) {
        this.invalidintegral = invalidintegral;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}