package com.zm.pojo;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/9/15.
 */
@Entity
@Table(name = "exam")
public class ExamEntity {
    private int id;
    private String name;
    private String keceng;
    private Integer fensu;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "keceng")
    public String getKeceng() {
        return keceng;
    }

    public void setKeceng(String keceng) {
        this.keceng = keceng;
    }

    @Basic
    @Column(name = "fensu")
    public Integer getFensu() {
        return fensu;
    }

    public void setFensu(Integer fensu) {
        this.fensu = fensu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExamEntity that = (ExamEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (keceng != null ? !keceng.equals(that.keceng) : that.keceng != null) return false;
        if (fensu != null ? !fensu.equals(that.fensu) : that.fensu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (keceng != null ? keceng.hashCode() : 0);
        result = 31 * result + (fensu != null ? fensu.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ExamEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", keceng='" + keceng + '\'' +
                ", fensu=" + fensu +
                '}';
    }
}
