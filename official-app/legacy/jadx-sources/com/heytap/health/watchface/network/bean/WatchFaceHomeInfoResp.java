package com.heytap.health.watchface.network.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WatchFaceHomeInfoResp {
    private List<WatchFaceHomeCard> cards;
    private boolean isEnd;
    private long pageKey;
    private String title;

    public List<WatchFaceHomeCard> getCards() {
        return this.cards;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public long getPageKey() {
        return this.pageKey;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCards(List<WatchFaceHomeCard> list) {
        this.cards = list;
    }

    public void setIsEnd(boolean z) {
        this.isEnd = z;
    }

    public void setPageKey(long j2) {
        this.pageKey = j2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "WatchFaceHomeInfoResp{cards=" + this.cards + ", isEnd=" + this.isEnd + ", pageKey=" + this.pageKey + ", title='" + this.title + "'}";
    }
}
