package com.heytap.health.settings.watch.schoolmode.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class AppItemBean implements Cloneable {
    public static final int TYPE_DIVIDING_LINE = 2;
    public static final int TYPE_HEADER = 1;
    public static final int TYPE_NORMAL = 0;
    private String appName;
    private boolean canModify;
    private boolean display;
    private boolean enable;
    private String icon;
    private boolean isHighPower;
    private String letter;
    private String packageName;
    private int type;

    public AppItemBean() {
        this.canModify = true;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getLetter() {
        return this.letter;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getType() {
        return this.type;
    }

    public boolean isCanModify() {
        return this.canModify;
    }

    public boolean isDisplay() {
        return this.display;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isHighPower() {
        return this.isHighPower;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setCanModify(boolean z) {
        this.canModify = z;
    }

    public void setDisplay(boolean z) {
        this.display = z;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setHighPower(boolean z) {
        this.isHighPower = z;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setLetter(String str) {
        this.letter = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "AppManageItem{appName='" + this.appName + "', icon='" + this.icon + "', packageName='" + this.packageName + "', isHighPower=" + this.isHighPower + ", enable=" + this.enable + ", canModify=" + this.canModify + ", letter='" + this.letter + "', type=" + this.type + ", display=" + this.display + '}';
    }

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AppItemBean m4647clone() {
        try {
            return (AppItemBean) super.clone();
        } catch (CloneNotSupportedException unused) {
            return this;
        }
    }

    public AppItemBean(String str, String str2, boolean z) {
        this.canModify = true;
        this.appName = str;
        this.packageName = str2;
        this.enable = z;
    }

    public AppItemBean(String str, boolean z, boolean z2) {
        this.packageName = str;
        this.enable = z;
        this.canModify = z2;
    }
}
