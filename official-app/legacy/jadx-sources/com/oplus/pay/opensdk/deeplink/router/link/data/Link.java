package com.oplus.pay.opensdk.deeplink.router.link.data;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, d2 = {"Lcom/oplus/pay/opensdk/deeplink/router/link/data/Link;", "", "defaultLinkDetail", "", "defaultLinkType", "", "downloadUrl", "linkDetail", "Lcom/oplus/pay/opensdk/deeplink/router/link/data/LinkDataAccount$LinkDetail;", "linkType", "trackId", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getDefaultLinkDetail", "()Ljava/util/List;", "getDefaultLinkType", "()Ljava/lang/String;", "getDownloadUrl", "getLinkDetail", "getLinkType", "getTrackId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Link {

    @NotNull
    private final List<Object> defaultLinkDetail;

    @NotNull
    private final String defaultLinkType;

    @NotNull
    private final String downloadUrl;

    @NotNull
    private final List<LinkDataAccount.LinkDetail> linkDetail;

    @NotNull
    private final String linkType;

    @NotNull
    private final String trackId;

    public Link(@NotNull List<? extends Object> defaultLinkDetail, @NotNull String defaultLinkType, @NotNull String downloadUrl, @NotNull List<LinkDataAccount.LinkDetail> linkDetail, @NotNull String linkType, @NotNull String trackId) {
        Intrinsics.checkNotNullParameter(defaultLinkDetail, "defaultLinkDetail");
        Intrinsics.checkNotNullParameter(defaultLinkType, "defaultLinkType");
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        Intrinsics.checkNotNullParameter(linkDetail, "linkDetail");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        this.defaultLinkDetail = defaultLinkDetail;
        this.defaultLinkType = defaultLinkType;
        this.downloadUrl = downloadUrl;
        this.linkDetail = linkDetail;
        this.linkType = linkType;
        this.trackId = trackId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Link copy$default(Link link, List list, String str, String str2, List list2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = link.defaultLinkDetail;
        }
        if ((i & 2) != 0) {
            str = link.defaultLinkType;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = link.downloadUrl;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            list2 = link.linkDetail;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str3 = link.linkType;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = link.trackId;
        }
        return link.copy(list, str5, str6, list3, str7, str4);
    }

    @NotNull
    public final List<Object> component1() {
        return this.defaultLinkDetail;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultLinkType() {
        return this.defaultLinkType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @NotNull
    public final List<LinkDataAccount.LinkDetail> component4() {
        return this.linkDetail;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLinkType() {
        return this.linkType;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }

    @NotNull
    public final Link copy(@NotNull List<? extends Object> defaultLinkDetail, @NotNull String defaultLinkType, @NotNull String downloadUrl, @NotNull List<LinkDataAccount.LinkDetail> linkDetail, @NotNull String linkType, @NotNull String trackId) {
        Intrinsics.checkNotNullParameter(defaultLinkDetail, "defaultLinkDetail");
        Intrinsics.checkNotNullParameter(defaultLinkType, "defaultLinkType");
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        Intrinsics.checkNotNullParameter(linkDetail, "linkDetail");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Intrinsics.checkNotNullParameter(trackId, "trackId");
        return new Link(defaultLinkDetail, defaultLinkType, downloadUrl, linkDetail, linkType, trackId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Link)) {
            return false;
        }
        Link link = (Link) other;
        return Intrinsics.areEqual(this.defaultLinkDetail, link.defaultLinkDetail) && Intrinsics.areEqual(this.defaultLinkType, link.defaultLinkType) && Intrinsics.areEqual(this.downloadUrl, link.downloadUrl) && Intrinsics.areEqual(this.linkDetail, link.linkDetail) && Intrinsics.areEqual(this.linkType, link.linkType) && Intrinsics.areEqual(this.trackId, link.trackId);
    }

    @NotNull
    public final List<Object> getDefaultLinkDetail() {
        return this.defaultLinkDetail;
    }

    @NotNull
    public final String getDefaultLinkType() {
        return this.defaultLinkType;
    }

    @NotNull
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @NotNull
    public final List<LinkDataAccount.LinkDetail> getLinkDetail() {
        return this.linkDetail;
    }

    @NotNull
    public final String getLinkType() {
        return this.linkType;
    }

    @NotNull
    public final String getTrackId() {
        return this.trackId;
    }

    public int hashCode() {
        return (((((((((this.defaultLinkDetail.hashCode() * 31) + this.defaultLinkType.hashCode()) * 31) + this.downloadUrl.hashCode()) * 31) + this.linkDetail.hashCode()) * 31) + this.linkType.hashCode()) * 31) + this.trackId.hashCode();
    }

    @NotNull
    public String toString() {
        return "Link(defaultLinkDetail=" + this.defaultLinkDetail + ", defaultLinkType=" + this.defaultLinkType + ", downloadUrl=" + this.downloadUrl + ", linkDetail=" + this.linkDetail + ", linkType=" + this.linkType + ", trackId=" + this.trackId + ')';
    }
}
