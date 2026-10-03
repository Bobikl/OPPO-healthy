package com.heytap.connect_dns;

import androidx.autofill.HintConstants;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0004J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u0080\u0001\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\b2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\nJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b#\u0010\u0004R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b$\u0010\u0004R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b%\u0010\u0004R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b&\u0010\u0004R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b'\u0010\u0004R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b(\u0010\u0004R!\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010\rR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b+\u0010\u0004R\u0019\u0010\u0015\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010\n¨\u00060"}, d2 = {"Lcom/heytap/connect_dns/UrlInfo;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "", "component5", "()I", "", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "scheme", HintConstants.AUTOFILL_HINT_USERNAME, HintConstants.AUTOFILL_HINT_PASSWORD, "host", "port", "pathSegments", SearchIntents.EXTRA_QUERY, "fragment", "url", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/heytap/connect_dns/UrlInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHost", "getQuery", "getFragment", "getScheme", "getUrl", "getPassword", "Ljava/util/List;", "getPathSegments", "getUsername", "I", "getPort", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UrlInfo {

    @Nullable
    private final String fragment;

    @Nullable
    private final String host;

    @Nullable
    private final String password;

    @Nullable
    private final List<String> pathSegments;
    private final int port;

    @Nullable
    private final String query;

    @Nullable
    private final String scheme;

    @Nullable
    private final String url;

    @Nullable
    private final String username;

    public UrlInfo() {
        this(null, null, null, null, 0, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPort() {
        return this.port;
    }

    @Nullable
    public final List<String> component6() {
        return this.pathSegments;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getFragment() {
        return this.fragment;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final UrlInfo copy(@Nullable String scheme, @Nullable String username, @Nullable String password, @Nullable String host, int port, @Nullable List<String> pathSegments, @Nullable String query, @Nullable String fragment, @Nullable String url) {
        return new UrlInfo(scheme, username, password, host, port, pathSegments, query, fragment, url);
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

    @Nullable
    public final String getFragment() {
        return this.fragment;
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    @Nullable
    public final String getPassword() {
        return this.password;
    }

    @Nullable
    public final List<String> getPathSegments() {
        return this.pathSegments;
    }

    public final int getPort() {
        return this.port;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    @Nullable
    public final String getScheme() {
        return this.scheme;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.scheme;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.username;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.password;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.host;
        int iHashCode4 = (((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.port)) * 31;
        List<String> list = this.pathSegments;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.query;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.fragment;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.url;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UrlInfo(scheme=" + ((Object) this.scheme) + ", username=" + ((Object) this.username) + ", password=" + ((Object) this.password) + ", host=" + ((Object) this.host) + ", port=" + this.port + ", pathSegments=" + this.pathSegments + ", query=" + ((Object) this.query) + ", fragment=" + ((Object) this.fragment) + ", url=" + ((Object) this.url) + ')';
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
