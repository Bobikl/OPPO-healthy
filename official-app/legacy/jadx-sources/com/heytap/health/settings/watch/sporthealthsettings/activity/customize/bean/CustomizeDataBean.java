package com.heytap.health.settings.watch.sporthealthsettings.activity.customize.bean;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public class CustomizeDataBean implements Serializable {
    public static final int TYPE_TIP = -1;
    boolean isAdd;
    String name;
    int type;

    public CustomizeDataBean(String str, int i) {
        this(str, i, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.type == ((CustomizeDataBean) obj).type;
    }

    public String getName() {
        return this.name;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.type));
    }

    public boolean isAdd() {
        return this.isAdd;
    }

    public boolean isTipType() {
        return getType() == -1;
    }

    public void setAdd(boolean z) {
        this.isAdd = z;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "CustomizeDataBean{name='" + this.name + "', type=" + this.type + '}';
    }

    public CustomizeDataBean(String str, int i, boolean z) {
        this.name = str;
        this.type = i;
        this.isAdd = z;
    }
}
