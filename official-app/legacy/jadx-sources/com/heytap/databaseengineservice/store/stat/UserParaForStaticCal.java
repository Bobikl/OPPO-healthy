package com.heytap.databaseengineservice.store.stat;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UserParaForStaticCal {
    private int birthday;
    private String gender;
    private int height;
    private int weight;

    public int getBirthday() {
        return this.birthday;
    }

    public String getGender() {
        return this.gender;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setBirthday(int i) {
        this.birthday = i;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWeight(int i) {
        this.weight = i;
    }

    @NonNull
    public String toString() {
        return "UserParaForStaticCal{height=" + this.height + ", weight=" + this.weight + ", gender='" + this.gender + "', birthday=" + this.birthday + '}';
    }
}
