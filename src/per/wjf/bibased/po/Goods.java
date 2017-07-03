package per.wjf.bibased.po;

import java.util.Date;

public class Goods {
    private Integer id;

    private String goodsname;

    private String goodsintro;

    private Integer goodsprice;

    private Integer goodsnum;

    private String pic;

    private String type;

    private Integer integral;

    private Boolean isoffset;

    private Boolean isexchange;

    private Date createtime;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getGoodsintro() {
        return goodsintro;
    }

    public void setGoodsintro(String goodsintro) {
        this.goodsintro = goodsintro == null ? null : goodsintro.trim();
    }

    public Integer getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Integer goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Boolean getIsoffset() {
        return isoffset;
    }

    public void setIsoffset(Boolean isoffset) {
        this.isoffset = isoffset;
    }

    public Boolean getIsexchange() {
        return isexchange;
    }

    public void setIsexchange(Boolean isexchange) {
        this.isexchange = isexchange;
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