package com.oplus.pay.opensdk.deeplink.router.link.data;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/oplus/pay/opensdk/deeplink/router/link/data/LinkDataAccount;", "", "()V", "downloadUrl", "", "getDownloadUrl", "()Ljava/lang/String;", "setDownloadUrl", "(Ljava/lang/String;)V", "linkDetail", "", "Lcom/oplus/pay/opensdk/deeplink/router/link/data/LinkDataAccount$LinkDetail;", "getLinkDetail", "()Ljava/util/List;", "setLinkDetail", "(Ljava/util/List;)V", "trackId", "getTrackId", "setTrackId", "toString", "LinkDetail", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LinkDataAccount {

    @Nullable
    private String downloadUrl;

    @Nullable
    private List<LinkDetail> linkDetail;

    @Nullable
    private String trackId;

    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/oplus/pay/opensdk/deeplink/router/link/data/LinkDataAccount$LinkDetail;", "", "linkType", "", "appVersion", "packageName", "linkUrl", "osVersion", "enter_from", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppVersion", "()Ljava/lang/String;", "setAppVersion", "(Ljava/lang/String;)V", "getEnter_from", "setEnter_from", "getLinkType", "setLinkType", "getLinkUrl", "setLinkUrl", "getOsVersion", "setOsVersion", "getPackageName", "setPackageName", "toString", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LinkDetail {

        @Nullable
        private String appVersion;

        @Nullable
        private String enter_from;

        @Nullable
        private String linkType;

        @Nullable
        private String linkUrl;

        @Nullable
        private String osVersion;

        @Nullable
        private String packageName;

        public LinkDetail() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Nullable
        public final String getAppVersion() {
            return this.appVersion;
        }

        @Nullable
        public final String getEnter_from() {
            return this.enter_from;
        }

        @Nullable
        public final String getLinkType() {
            return this.linkType;
        }

        @Nullable
        public final String getLinkUrl() {
            return this.linkUrl;
        }

        @Nullable
        public final String getOsVersion() {
            return this.osVersion;
        }

        @Nullable
        public final String getPackageName() {
            return this.packageName;
        }

        public final void setAppVersion(@Nullable String str) {
            this.appVersion = str;
        }

        public final void setEnter_from(@Nullable String str) {
            this.enter_from = str;
        }

        public final void setLinkType(@Nullable String str) {
            this.linkType = str;
        }

        public final void setLinkUrl(@Nullable String str) {
            this.linkUrl = str;
        }

        public final void setOsVersion(@Nullable String str) {
            this.osVersion = str;
        }

        public final void setPackageName(@Nullable String str) {
            this.packageName = str;
        }

        @NotNull
        public String toString() {
            return "LinkDetail{linkType='" + this.linkType + "', appVersion='" + this.appVersion + "', packageName='" + this.packageName + "', linkUrl='" + this.linkUrl + "', osVersion='" + this.osVersion + "', enter_from='" + this.enter_from + "'}";
        }

        public LinkDetail(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
            this.linkType = str;
            this.appVersion = str2;
            this.packageName = str3;
            this.linkUrl = str4;
            this.osVersion = str5;
            this.enter_from = str6;
        }

        public /* synthetic */ LinkDetail(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    public final List<LinkDetail> getLinkDetail() {
        return this.linkDetail;
    }

    @Nullable
    public final String getTrackId() {
        return this.trackId;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setLinkDetail(@Nullable List<LinkDetail> list) {
        this.linkDetail = list;
    }

    public final void setTrackId(@Nullable String str) {
        this.trackId = str;
    }

    @NotNull
    public String toString() {
        return "LinkDataPay{trackId='" + this.trackId + "', downloadUrl='" + this.downloadUrl + "', linkDetail=" + this.linkDetail + '}';
    }
}
