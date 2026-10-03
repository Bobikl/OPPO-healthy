package com.heytap.health.healthecg.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class ECGUser {
    private int age;
    private String clientDataId;

    @SerializedName("diseases_his")
    private Object diseasesHis;
    private int height;
    private String name;
    private String openId;
    private int sex;
    private Object symptom;
    private String uid;
    private int weight;

    public int getAge() {
        return this.age;
    }

    public String getClientDataId() {
        return this.clientDataId;
    }

    public Object getDiseasesHis() {
        return this.diseasesHis;
    }

    public int getHeight() {
        return this.height;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenId() {
        return this.openId;
    }

    public int getSex() {
        return this.sex;
    }

    public Object getSymptom() {
        return this.symptom;
    }

    public String getUid() {
        return this.uid;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setAge(int i) {
        this.age = i;
    }

    public void setClientDataId(String str) {
        this.clientDataId = str;
    }

    public void setDiseasesHis(Object obj) {
        this.diseasesHis = obj;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpenId(String str) {
        this.openId = str;
    }

    public void setSex(int i) {
        this.sex = i;
    }

    public void setSymptom(Object obj) {
        this.symptom = obj;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setWeight(int i) {
        this.weight = i;
    }
}
