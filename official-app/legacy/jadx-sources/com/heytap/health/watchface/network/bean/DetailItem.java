package com.heytap.health.watchface.network.bean;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class DetailItem implements Serializable {
    private List<WatchFaceHomeCard> cards;
    private WatchFaceHomeCard.Item item;
    private List<WatchFaceHomeCard.CategoryItem> tags;

    public List<WatchFaceHomeCard> getCards() {
        return this.cards;
    }

    public WatchFaceHomeCard.Item getItem() {
        return this.item;
    }

    public List<WatchFaceHomeCard.CategoryItem> getTags() {
        return this.tags;
    }

    public void setCards(List<WatchFaceHomeCard> list) {
        this.cards = list;
    }

    public void setItem(WatchFaceHomeCard.Item item) {
        this.item = item;
    }

    public void setTags(List<WatchFaceHomeCard.CategoryItem> list) {
        this.tags = list;
    }
}
