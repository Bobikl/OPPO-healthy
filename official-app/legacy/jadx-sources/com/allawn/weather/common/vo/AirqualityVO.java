package com.allawn.weather.common.vo;

/* JADX INFO: loaded from: classes12.dex */
public class AirqualityVO extends DataVO implements Cloneable {
    private int co;
    private int index;
    private int no2;
    private int o3;
    private int pm10;
    private int pm25;
    private int so2;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getCo() {
        return this.co;
    }

    public int getIndex() {
        return this.index;
    }

    public int getNo2() {
        return this.no2;
    }

    public int getO3() {
        return this.o3;
    }

    public int getPm10() {
        return this.pm10;
    }

    public int getPm25() {
        return this.pm25;
    }

    public int getSo2() {
        return this.so2;
    }

    public void setCo(int i) {
        this.co = i;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setNo2(int i) {
        this.no2 = i;
    }

    public void setO3(int i) {
        this.o3 = i;
    }

    public void setPm10(int i) {
        this.pm10 = i;
    }

    public void setPm25(int i) {
        this.pm25 = i;
    }

    public void setSo2(int i) {
        this.so2 = i;
    }

    @Override // com.allawn.weather.common.vo.DataVO
    public String toString() {
        return "AirqualityVO{index=" + this.index + ", pm25=" + this.pm25 + ", pm10=" + this.pm10 + ", o3=" + this.o3 + ", co=" + this.co + ", no2=" + this.no2 + ", so2=" + this.so2 + '}';
    }
}
