package com.heytap.store.homemodule.data;

import com.heytap.store.base.core.data.IBean;

/* JADX INFO: loaded from: classes5.dex */
public class MediaInfoBean implements IBean {
    private String pic;
    private Integer ratio;
    private String skipLink;
    private Integer type;
    private String video;

    public String getPic() {
        return this.pic;
    }

    public Integer getRatio() {
        return this.ratio;
    }

    public String getSkipLink() {
        return this.skipLink;
    }

    public Integer getType() {
        return this.type;
    }

    public String getVideo() {
        return this.video;
    }

    public void setPic(String str) {
        this.pic = str;
    }

    public void setRatio(Integer num) {
        this.ratio = num;
    }

    public void setSkipLink(String str) {
        this.skipLink = str;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setVideo(String str) {
        this.video = str;
    }

    public String toString() {
        return "MediaInfoBean{type=" + this.type + ", ratio=" + this.ratio + ", video='" + this.video + "', pic='" + this.pic + "', skipLink='" + this.skipLink + "'}";
    }
}
