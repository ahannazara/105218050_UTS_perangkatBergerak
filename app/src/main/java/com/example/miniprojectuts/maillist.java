package com.example.miniprojectuts;

public class maillist {


    private int id;
    private String name;
    private String Texted;
    private String tanggal;
    private String bulan;
    private String tahun;
    private String imageurl;
    private String subjek;

    public maillist(int id, String name, String texted, String tanggal, String bulan, String tahun, String imageurl, String subjek) {
        this.id = id;
        this.name = name;
        Texted = texted;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
        this.imageurl = imageurl;
        this.subjek = subjek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTexted() {
        return Texted;
    }

    public void setTexted(String texted) {
        Texted = texted;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getBulan() {
        return bulan;
    }

    public void setBulan(String bulan) {
        this.bulan = bulan;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getSubjek() {
        return subjek;
    }

    public void setSubjek(String subjek) {
        this.subjek = subjek;
    }

    @Override
    public String toString() {
        return "maillist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Texted='" + Texted + '\'' +
                ", tanggal='" + tanggal + '\'' +
                ", bulan='" + bulan + '\'' +
                ", tahun='" + tahun + '\'' +
                ", imageurl='" + imageurl + '\'' +
                ", subjek='" + subjek + '\'' +
                '}';
    }
}



