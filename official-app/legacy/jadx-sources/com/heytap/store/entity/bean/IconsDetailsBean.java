package com.heytap.store.entity.bean;

import android.graphics.Bitmap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class IconsDetailsBean {
    private Long beginAt;
    private String bgUrl;
    private String bgUrlOrColor;
    private String clickUrl;
    private Integer drawableId;
    private Long endAt;
    private Long id;
    private boolean isLogin;
    private String jsonClickUrl;
    private String jsonUrl;
    private List<IconsLabelsBean> labelDetailss;
    private String link;
    private Bitmap mBitmap;
    private String moduleCode;
    private String remark;
    private Integer seq;
    private Integer showName;
    private String textColor;
    private String title;
    private String url;

    public Long getBeginAt() {
        return this.beginAt;
    }

    public String getBgUrl() {
        return this.bgUrl;
    }

    public String getBgUrlOrColor() {
        return this.bgUrlOrColor;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public Integer getDrawableId() {
        return this.drawableId;
    }

    public Long getEndAt() {
        return this.endAt;
    }

    public Long getId() {
        return this.id;
    }

    public boolean getIsLogin() {
        return this.isLogin;
    }

    public String getJsonClickUrl() {
        return this.jsonClickUrl;
    }

    public String getJsonUrl() {
        return this.jsonUrl;
    }

    public List<IconsLabelsBean> getLabelDetailss() {
        return this.labelDetailss;
    }

    public String getLink() {
        return this.link;
    }

    public String getModuleCode() {
        return this.moduleCode;
    }

    public String getRemark() {
        return this.remark;
    }

    public Integer getSeq() {
        return this.seq;
    }

    public Integer getShowName() {
        return this.showName;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setBeginAt(Long l2) {
        this.beginAt = l2;
    }

    public void setBgUrl(String str) {
        this.bgUrl = str;
    }

    public void setBgUrlOrColor(String str) {
        this.bgUrlOrColor = str;
    }

    public void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public void setClickUrl(String str) {
        this.clickUrl = str;
    }

    public void setDrawableId(Integer num) {
        this.drawableId = num;
    }

    public void setEndAt(Long l2) {
        this.endAt = l2;
    }

    public void setId(Long l2) {
        this.id = l2;
    }

    public void setIsLogin(boolean z) {
        this.isLogin = z;
    }

    public void setJsonClickUrl(String str) {
        this.jsonClickUrl = str;
    }

    public void setJsonUrl(String str) {
        this.jsonUrl = str;
    }

    public void setLabelDetailss(List<IconsLabelsBean> list) {
        this.labelDetailss = list;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setModuleCode(String str) {
        this.moduleCode = str;
    }

    public void setRemark(String str) {
        this.remark = str;
    }

    public void setSeq(Integer num) {
        this.seq = num;
    }

    public void setShowName(Integer num) {
        this.showName = num;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
