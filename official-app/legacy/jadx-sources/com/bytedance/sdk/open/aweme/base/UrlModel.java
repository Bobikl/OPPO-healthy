package com.bytedance.sdk.open.aweme.base;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class UrlModel implements Serializable {

    @SerializedName("url_list")
    public List<String> urlList;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        List<String> list = this.urlList;
        if (list != null) {
            return list.equals(urlModel.urlList);
        }
        return urlModel.urlList == null;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int hashCode() {
        List<String> list = this.urlList;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }
}
