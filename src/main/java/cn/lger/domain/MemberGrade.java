package cn.lger.domain;

import javax.persistence.*;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-12-06.
 */
@Entity
public class MemberGrade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //等级名
    @Column(name = "grade_name")
    private String gradeName;
    //折扣
    private Float discount;
    //备注信息
    private String comment = "";

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Float getDiscount() {
        return discount;
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "MemberGrade{" +
                "id=" + id +
                ", gradeName='" + gradeName + '\'' +
                ", discount=" + discount +
                ", comment='" + comment + '\'' +
                '}';
    }
}
