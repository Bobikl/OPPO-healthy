package com.heytap.health.watchface.business.legacy.main.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WatchPrepareRequestBean {
    private String mModel;
    private List<ResourceRequestBean> mResourceRequestBeans;
    private String mSku;

    public WatchPrepareRequestBean(List<ResourceRequestBean> list, String str, String str2) {
        this.mResourceRequestBeans = list;
        this.mModel = str;
        this.mSku = str2;
    }

    public String getModel() {
        return this.mModel;
    }

    public List<ResourceRequestBean> getResourceRequestBeans() {
        return this.mResourceRequestBeans;
    }

    public String getSku() {
        return this.mSku;
    }

    public String toString() {
        return "WatchPrepareRequestBean{mResourceRequestBeans=" + this.mResourceRequestBeans + ", mModel='" + this.mModel + "', mSku='" + this.mSku + "'}";
    }
}
