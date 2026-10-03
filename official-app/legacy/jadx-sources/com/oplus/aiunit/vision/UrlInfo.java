package com.oplus.aiunit.vision;

import androidx.autofill.HintConstants;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.actions.SearchIntents;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.mmk, reason: from toString */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0019\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0011\u0010\fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017R\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010!\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b#\u0010\fR\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\f¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/mmk;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "scheme", "b", "getUsername", HintConstants.AUTOFILL_HINT_USERNAME, "getPassword", HintConstants.AUTOFILL_HINT_PASSWORD, "d", "host", MapSchema.FIELD_NAME_ENTRY, "I", "()I", "port", "", "f", "Ljava/util/List;", "getPathSegments", "()Ljava/util/List;", "pathSegments", b2n.f, "getQuery", SearchIntents.EXTRA_QUERY, b2n.g, "getFragment", "fragment", "i", "getUrl", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final /* data */ class UrlInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final String scheme;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final String username;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String password;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final String host;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final int port;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<String> pathSegments;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public final String query;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final String fragment;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final String url;

    public UrlInfo() {
        this(null, null, null, null, 0, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrlInfo)) {
            return false;
        }
        UrlInfo urlInfo = (UrlInfo) other;
        return Intrinsics.areEqual(this.scheme, urlInfo.scheme) && Intrinsics.areEqual(this.username, urlInfo.username) && Intrinsics.areEqual(this.password, urlInfo.password) && Intrinsics.areEqual(this.host, urlInfo.host) && this.port == urlInfo.port && Intrinsics.areEqual(this.pathSegments, urlInfo.pathSegments) && Intrinsics.areEqual(this.query, urlInfo.query) && Intrinsics.areEqual(this.fragment, urlInfo.fragment) && Intrinsics.areEqual(this.url, urlInfo.url);
    }

    public int hashCode() {
        String str = this.scheme;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.username;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.password;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.host;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.port) * 31;
        List<String> list = this.pathSegments;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.query;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.fragment;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.url;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UrlInfo(scheme=" + this.scheme + ", username=" + this.username + ", password=" + this.password + ", host=" + this.host + ", port=" + this.port + ", pathSegments=" + this.pathSegments + ", query=" + this.query + ", fragment=" + this.fragment + ", url=" + this.url + ")";
    }

    public UrlInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, @Nullable List<String> list, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.query = str5;
        this.fragment = str6;
        this.url = str7;
    }

    public /* synthetic */ UrlInfo(String str, String str2, String str3, String str4, int i, List list, String str5, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : str7);
    }
}
