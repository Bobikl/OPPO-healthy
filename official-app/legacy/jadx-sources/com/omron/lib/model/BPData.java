package com.omron.lib.model;

/* JADX INFO: loaded from: classes5.dex */
public class BPData {
    private static final String TAG = "BPData";
    private int afibFlg;
    private int afibMode;
    private int arrhythmiaFlg;
    private int bmFlg;
    private int cwsFlg;
    private int diastolic;
    private long measureTime;
    private int measureUser;
    private int pulse;
    private int systolic;

    public static String getTag() {
        return TAG;
    }

    public int getAfibFlg() {
        return this.afibFlg;
    }

    public int getAfibMode() {
        return this.afibMode;
    }

    public int getArrhythmiaFlg() {
        return this.arrhythmiaFlg;
    }

    public int getBmFlg() {
        return this.bmFlg;
    }

    public int getCwsFlg() {
        return this.cwsFlg;
    }

    public int getDiastolic() {
        return this.diastolic;
    }

    public long getMeasureTime() {
        return this.measureTime;
    }

    public int getMeasureUser() {
        return this.measureUser;
    }

    public int getPulse() {
        return this.pulse;
    }

    public int getSystolic() {
        return this.systolic;
    }

    public void setAfibFlg(int i) {
        this.afibFlg = i;
    }

    public void setAfibMode(int i) {
        this.afibMode = i;
    }

    public void setArrhythmiaFlg(int i) {
        this.arrhythmiaFlg = i;
    }

    public void setBmFlg(int i) {
        this.bmFlg = i;
    }

    public void setCwsFlg(int i) {
        this.cwsFlg = i;
    }

    public void setDiastolic(int i) {
        this.diastolic = i;
    }

    public void setMeasureTime(long j2) {
        this.measureTime = j2;
    }

    public void setMeasureUser(int i) {
        this.measureUser = i;
    }

    public void setPulse(int i) {
        this.pulse = i;
    }

    public void setSystolic(int i) {
        this.systolic = i;
    }
}
