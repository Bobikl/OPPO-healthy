package com.heytap.health.health.familymode.response;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class DailyStressData {
    private int maxStress;
    private int minStress;
    private double stressBalance;

    public int getMaxStress() {
        return this.maxStress;
    }

    public int getMinStress() {
        return this.minStress;
    }

    public double getStressBalance() {
        return this.stressBalance;
    }

    public String toString() {
        return "DailyStressData{minStress=" + this.minStress + ", maxStress=" + this.maxStress + ", stressBalance=" + this.stressBalance + '}';
    }
}
