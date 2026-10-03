package com.heytap.store.product_support.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020 X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000fR\u0014\u0010%\u001a\u00020\u000eX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000fR\u0014\u0010'\u001a\u00020 X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0013\u0010)\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0013\u0010+\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020 X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"¨\u0006/"}, d2 = {"Lcom/heytap/store/product_support/data/LiveInfo;", "", "()V", "account", "", "getAccount", "()Ljava/lang/String;", "accountLogo", "getAccountLogo", "backgroundUrl", "getBackgroundUrl", "introduction", "getIntroduction", "isAdvance", "", "()I", "isBooked", "link", "getLink", "listPicUrl", "getListPicUrl", "nowTime", "getNowTime", "planStartTime", "getPlanStartTime", "posterUrl", "getPosterUrl", "pullType", "getPullType", "pullUrl", "getPullUrl", "roomId", "", "getRoomId", "()J", "serialVersionUID", "getSerialVersionUID", "status", "getStatus", "steamId", "getSteamId", "streamCode", "getStreamCode", "title", "getTitle", "viewNum", "getViewNum", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LiveInfo {

    @Nullable
    private final String account;

    @Nullable
    private final String accountLogo;

    @Nullable
    private final String backgroundUrl;

    @Nullable
    private final String introduction;
    private final int isAdvance;
    private final int isBooked;

    @Nullable
    private final String link;

    @Nullable
    private final String listPicUrl;

    @Nullable
    private final String nowTime;

    @Nullable
    private final String planStartTime;

    @Nullable
    private final String posterUrl;
    private final int pullType;

    @Nullable
    private final String pullUrl;
    private final long roomId;
    private final int serialVersionUID;
    private final int status;
    private final long steamId;

    @Nullable
    private final String streamCode;

    @Nullable
    private final String title;
    private final long viewNum;

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final String getAccountLogo() {
        return this.accountLogo;
    }

    @Nullable
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    @Nullable
    public final String getIntroduction() {
        return this.introduction;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getListPicUrl() {
        return this.listPicUrl;
    }

    @Nullable
    public final String getNowTime() {
        return this.nowTime;
    }

    @Nullable
    public final String getPlanStartTime() {
        return this.planStartTime;
    }

    @Nullable
    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final int getPullType() {
        return this.pullType;
    }

    @Nullable
    public final String getPullUrl() {
        return this.pullUrl;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final int getSerialVersionUID() {
        return this.serialVersionUID;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getSteamId() {
        return this.steamId;
    }

    @Nullable
    public final String getStreamCode() {
        return this.streamCode;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final long getViewNum() {
        return this.viewNum;
    }

    /* JADX INFO: renamed from: isAdvance, reason: from getter */
    public final int getIsAdvance() {
        return this.isAdvance;
    }

    /* JADX INFO: renamed from: isBooked, reason: from getter */
    public final int getIsBooked() {
        return this.isBooked;
    }
}
