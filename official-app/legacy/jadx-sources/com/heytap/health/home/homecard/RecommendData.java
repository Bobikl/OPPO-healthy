package com.heytap.health.home.homecard;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class RecommendData {
    public String content;
    public String img;

    @NonNull
    public String toString() {
        return "RecommendData:(content:" + this.content + ",link:" + this.img + ")";
    }
}
