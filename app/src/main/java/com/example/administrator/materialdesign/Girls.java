package com.example.administrator.materialdesign;

/**
 * Created by Administrator on 2017/3/22 0022.
 */

public class Girls {
    private String name;
    private int imgid;
    public Girls(String name, int imgid){
        this.name=name;
        this.imgid=imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
