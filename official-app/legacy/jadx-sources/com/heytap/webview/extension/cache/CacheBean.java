package com.heytap.webview.extension.cache;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/webview/extension/cache/CacheBean;", "", ParserTag.TAG_URI, "", "configId", "uriMD5", "versionId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfigId", "()Ljava/lang/String;", "setConfigId", "(Ljava/lang/String;)V", "getUri", "setUri", "getUriMD5", "setUriMD5", "getVersionId", "setVersionId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CacheBean {

    @NotNull
    private String configId;

    @NotNull
    private String uri;

    @NotNull
    private String uriMD5;

    @NotNull
    private String versionId;

    public CacheBean() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CacheBean copy$default(CacheBean cacheBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cacheBean.uri;
        }
        if ((i & 2) != 0) {
            str2 = cacheBean.configId;
        }
        if ((i & 4) != 0) {
            str3 = cacheBean.uriMD5;
        }
        if ((i & 8) != 0) {
            str4 = cacheBean.versionId;
        }
        return cacheBean.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUriMD5() {
        return this.uriMD5;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersionId() {
        return this.versionId;
    }

    @NotNull
    public final CacheBean copy(@NotNull String uri, @NotNull String configId, @NotNull String uriMD5, @NotNull String versionId) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(uriMD5, "uriMD5");
        Intrinsics.checkNotNullParameter(versionId, "versionId");
        return new CacheBean(uri, configId, uriMD5, versionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheBean)) {
            return false;
        }
        CacheBean cacheBean = (CacheBean) other;
        return Intrinsics.areEqual(this.uri, cacheBean.uri) && Intrinsics.areEqual(this.configId, cacheBean.configId) && Intrinsics.areEqual(this.uriMD5, cacheBean.uriMD5) && Intrinsics.areEqual(this.versionId, cacheBean.versionId);
    }

    @NotNull
    public final String getConfigId() {
        return this.configId;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    @NotNull
    public final String getUriMD5() {
        return this.uriMD5;
    }

    @NotNull
    public final String getVersionId() {
        return this.versionId;
    }

    public int hashCode() {
        return (((((this.uri.hashCode() * 31) + this.configId.hashCode()) * 31) + this.uriMD5.hashCode()) * 31) + this.versionId.hashCode();
    }

    public final void setConfigId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.configId = str;
    }

    public final void setUri(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uri = str;
    }

    public final void setUriMD5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uriMD5 = str;
    }

    public final void setVersionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.versionId = str;
    }

    @NotNull
    public String toString() {
        return "CacheBean(uri=" + this.uri + ", configId=" + this.configId + ", uriMD5=" + this.uriMD5 + ", versionId=" + this.versionId + ')';
    }

    public CacheBean(@NotNull String uri, @NotNull String configId, @NotNull String uriMD5, @NotNull String versionId) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(uriMD5, "uriMD5");
        Intrinsics.checkNotNullParameter(versionId, "versionId");
        this.uri = uri;
        this.configId = configId;
        this.uriMD5 = uriMD5;
        this.versionId = versionId;
    }

    public /* synthetic */ CacheBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
