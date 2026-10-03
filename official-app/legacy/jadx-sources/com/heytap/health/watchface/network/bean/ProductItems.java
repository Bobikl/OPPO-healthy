package com.heytap.health.watchface.network.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ProductItems {
    private List<WatchFaceHomeCard.Item> items;

    public List<WatchFaceHomeCard.Item> getItems() {
        return this.items;
    }

    public void setItems(List<WatchFaceHomeCard.Item> list) {
        this.items = list;
    }
}
