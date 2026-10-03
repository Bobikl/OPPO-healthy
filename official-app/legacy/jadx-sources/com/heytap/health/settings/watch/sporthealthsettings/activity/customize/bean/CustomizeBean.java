package com.heytap.health.settings.watch.sporthealthsettings.activity.customize.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public class CustomizeBean implements Serializable {
    int index;
    List<CustomizeDataBean> mCustomizeDataBeans = new ArrayList();
    List<CustomizeDataBean> mNormalSelectData = new ArrayList();

    public CustomizeBean(int i) {
        this.index = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomizeBean customizeBean = (CustomizeBean) obj;
        return this.index == customizeBean.index && Objects.equals(this.mCustomizeDataBeans, customizeBean.mCustomizeDataBeans);
    }

    public List<CustomizeDataBean> getCustomizeDataBeans() {
        return this.mCustomizeDataBeans;
    }

    public int getIndex() {
        return this.index;
    }

    public List<CustomizeDataBean> getNormalSelectData() {
        return this.mNormalSelectData;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.index), this.mCustomizeDataBeans);
    }

    public void setCustomizeDataBeans(List<CustomizeDataBean> list) {
        this.mCustomizeDataBeans = list;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setNormalSelectData(List<CustomizeDataBean> list) {
        this.mNormalSelectData = list;
    }

    public String toString() {
        return "CustomizeBean{index=" + this.index + ", mCustomizeDataBeans=" + this.mCustomizeDataBeans + ", mNormalSelectData=" + this.mNormalSelectData + '}';
    }
}
