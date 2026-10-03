package com.heytap.health.sleep.disturb.bean;

import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class RankItem {
    private int duration;
    private Drawable icon;
    private String name;
    private int percent;

    public int getDuration() {
        return this.duration;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public int getPercent() {
        return this.percent;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setIcon(Drawable drawable) {
        this.icon = drawable;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPercent(int i) {
        this.percent = i;
    }

    @NonNull
    public String toString() {
        return "RankItem{icon=" + this.icon + ", name='" + this.name + "', duration=" + this.duration + ", percent=" + this.percent + '}';
    }
}
