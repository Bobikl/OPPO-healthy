package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010-\u001a\u00020\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u00020\u00168FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u00020\u00168FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u00020\u00168FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001c\u0010'\u001a\u00020\u00168FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u001a\u0010*\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000e¨\u0006."}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreItemDetail;", "", "()V", "labelDetailsInfo", "Lcom/heytap/store/business/component/entity/OStoreLabelDetailsInfo;", "getLabelDetailsInfo", "()Lcom/heytap/store/business/component/entity/OStoreLabelDetailsInfo;", "setLabelDetailsInfo", "(Lcom/heytap/store/business/component/entity/OStoreLabelDetailsInfo;)V", "localNetPosition", "", "getLocalNetPosition", "()I", "setLocalNetPosition", "(I)V", "localRealData", "", "getLocalRealData", "()Z", "setLocalRealData", "(Z)V", "pic", "", "getPic", "()Ljava/lang/String;", "setPic", "(Ljava/lang/String;)V", "picJson", "getPicJson", "setPicJson", "picSize", "getPicSize", "()Ljava/lang/Integer;", "setPicSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "title", "getTitle", "setTitle", "titleDec", "getTitleDec", "setTitleDec", "type", "getType", "setType", "clone", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreItemDetail {

    @Nullable
    private OStoreLabelDetailsInfo labelDetailsInfo;
    private int localNetPosition;

    @Nullable
    private Integer picSize;
    private int type;

    @NotNull
    private String pic = "";

    @NotNull
    private String picJson = "";

    @NotNull
    private String title = "";

    @NotNull
    private String titleDec = "";
    private boolean localRealData = true;

    @NotNull
    public final OStoreItemDetail clone() {
        OStoreItemDetail oStoreItemDetail = new OStoreItemDetail();
        oStoreItemDetail.setPic(getPic());
        oStoreItemDetail.setLabelDetailsInfo(getLabelDetailsInfo());
        oStoreItemDetail.setTitle(getTitle());
        oStoreItemDetail.setPicJson(getPicJson());
        return oStoreItemDetail;
    }

    @Nullable
    public final OStoreLabelDetailsInfo getLabelDetailsInfo() {
        return this.labelDetailsInfo;
    }

    public final int getLocalNetPosition() {
        return this.localNetPosition;
    }

    public final boolean getLocalRealData() {
        return this.localRealData;
    }

    @NotNull
    public final String getPic() {
        String str = this.pic;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPicJson() {
        String str = this.picJson;
        return str == null ? "" : str;
    }

    @Nullable
    public final Integer getPicSize() {
        return this.picSize;
    }

    @NotNull
    public final String getTitle() {
        String str = this.title;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getTitleDec() {
        String str = this.titleDec;
        return str == null ? "" : str;
    }

    public final int getType() {
        return this.type;
    }

    public final void setLabelDetailsInfo(@Nullable OStoreLabelDetailsInfo oStoreLabelDetailsInfo) {
        this.labelDetailsInfo = oStoreLabelDetailsInfo;
    }

    public final void setLocalNetPosition(int i) {
        this.localNetPosition = i;
    }

    public final void setLocalRealData(boolean z) {
        this.localRealData = z;
    }

    public final void setPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pic = str;
    }

    public final void setPicJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picJson = str;
    }

    public final void setPicSize(@Nullable Integer num) {
        this.picSize = num;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setTitleDec(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.titleDec = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
