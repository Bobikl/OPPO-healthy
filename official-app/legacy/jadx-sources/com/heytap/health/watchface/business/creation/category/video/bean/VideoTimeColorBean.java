package com.heytap.health.watchface.business.creation.category.video.bean;

import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListBean;
import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListItem;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoTimeColorBean;", "Lcom/heytap/health/watchface/business/creation/base/custom/WatchFaceCustomStyleListBean;", "Lcom/heytap/health/watchface/business/creation/base/custom/WatchFaceCustomStyleListItem;", "()V", "color", "", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class VideoTimeColorBean extends WatchFaceCustomStyleListBean<WatchFaceCustomStyleListItem> {

    @NotNull
    private String color = "";

    @NotNull
    public final String getColor() {
        return this.color;
    }

    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }
}
