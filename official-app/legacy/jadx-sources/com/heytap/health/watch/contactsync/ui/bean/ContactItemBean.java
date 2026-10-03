package com.heytap.health.watch.contactsync.ui.bean;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class ContactItemBean implements Serializable {
    long _id;
    boolean isPreSelect;
    boolean isSelect;
    int itemType;
    String name;

    public ContactItemBean(int i) {
        this.itemType = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this._id == ((ContactItemBean) obj)._id;
    }

    public int getItemType() {
        return this.itemType;
    }

    public String getName() {
        return this.name;
    }

    public long get_id() {
        return this._id;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this._id));
    }

    public boolean isPreSelect() {
        return this.isPreSelect;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setItemType(int i) {
        this.itemType = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPreSelect(boolean z) {
        this.isPreSelect = z;
    }

    public void setSelect(boolean z) {
        this.isSelect = z;
    }

    public void set_id(long j2) {
        this._id = j2;
    }
}
