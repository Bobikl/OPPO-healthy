package com.heytap.store.db.entity.main;

/* JADX INFO: loaded from: classes4.dex */
public class AnnounceBanners {
    private Long announceId;
    private Long beginAt;
    private Long endAt;
    private Long id;
    private Integer isLogin;
    private String link;
    private Integer seq;
    private String url;

    public AnnounceBanners(Long l2, Long l3, String str, String str2, Integer num, Long l4, Long l5, Integer num2) {
        this.id = l2;
        this.announceId = l3;
        this.url = str;
        this.link = str2;
        this.seq = num;
        this.beginAt = l4;
        this.endAt = l5;
        this.isLogin = num2;
    }

    public Long getAnnounceId() {
        return this.announceId;
    }

    public Long getBeginAt() {
        return this.beginAt;
    }

    public Long getEndAt() {
        return this.endAt;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getIsLogin() {
        return this.isLogin;
    }

    public String getLink() {
        return this.link;
    }

    public Integer getSeq() {
        return this.seq;
    }

    public String getUrl() {
        return this.url;
    }

    public void setAnnounceId(Long l2) {
        this.announceId = l2;
    }

    public void setBeginAt(Long l2) {
        this.beginAt = l2;
    }

    public void setEndAt(Long l2) {
        this.endAt = l2;
    }

    public void setId(Long l2) {
        this.id = l2;
    }

    public void setIsLogin(Integer num) {
        this.isLogin = num;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setSeq(Integer num) {
        this.seq = num;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public AnnounceBanners() {
    }
}
