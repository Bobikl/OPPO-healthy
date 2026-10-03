package com.heytap.store.homemodule.data;

import androidx.annotation.Nullable;
import com.heytap.store.base.core.data.IBean;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class NewProductBean implements IBean {
    private String backgroudUrl;
    private List<MediaInfoBean> mediaInnfoBeanList;
    private Integer mediaType;

    @Nullable
    private SubscribeBean subscribeBean;

    public String getBackgroudUrl() {
        return this.backgroudUrl;
    }

    public List<MediaInfoBean> getMediaInnfoBeanList() {
        return this.mediaInnfoBeanList;
    }

    public Integer getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public SubscribeBean getSubscribeBean() {
        return this.subscribeBean;
    }

    public void setBackgroudUrl(String str) {
        this.backgroudUrl = str;
    }

    public void setMediaInnfoBeanList(List<MediaInfoBean> list) {
        this.mediaInnfoBeanList = list;
    }

    public void setMediaType(Integer num) {
        this.mediaType = num;
    }

    public void setSubscribeBean(SubscribeBean subscribeBean) {
        this.subscribeBean = subscribeBean;
    }

    public String toString() {
        return "NewProductBean{mediaType=" + this.mediaType + ", backgroudUrl='" + this.backgroudUrl + "', mediaInnfoBeanList=" + this.mediaInnfoBeanList + ", subscribeBean=" + this.subscribeBean + '}';
    }
}
