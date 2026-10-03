package com.oplus.mydevices.sdk.device;

import androidx.annotation.Keep;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/oplus/mydevices/sdk/device/ProviderExtra;", "", ParserTag.TAG_URI, "", "authority", "method", "extra", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthority", "()Ljava/lang/String;", "getExtra", "getMethod", "getUri", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ProviderExtra {

    @Nullable
    private final String authority;

    @Nullable
    private final String extra;

    @NotNull
    private final String method;

    @Nullable
    private final String uri;

    public ProviderExtra(@Nullable String str, @Nullable String str2, @NotNull String method, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.uri = str;
        this.authority = str2;
        this.method = method;
        this.extra = str3;
    }

    public static /* synthetic */ ProviderExtra copy$default(ProviderExtra providerExtra, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = providerExtra.uri;
        }
        if ((i & 2) != 0) {
            str2 = providerExtra.authority;
        }
        if ((i & 4) != 0) {
            str3 = providerExtra.method;
        }
        if ((i & 8) != 0) {
            str4 = providerExtra.extra;
        }
        return providerExtra.copy(str, str2, str3, str4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthority() {
        return this.authority;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final ProviderExtra copy(@Nullable String uri, @Nullable String authority, @NotNull String method, @Nullable String extra) {
        Intrinsics.checkNotNullParameter(method, "method");
        return new ProviderExtra(uri, authority, method, extra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProviderExtra)) {
            return false;
        }
        ProviderExtra providerExtra = (ProviderExtra) other;
        return Intrinsics.areEqual(this.uri, providerExtra.uri) && Intrinsics.areEqual(this.authority, providerExtra.authority) && Intrinsics.areEqual(this.method, providerExtra.method) && Intrinsics.areEqual(this.extra, providerExtra.extra);
    }

    @Nullable
    public final String getAuthority() {
        return this.authority;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.authority;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.method;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.extra;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProviderExtra(uri=" + this.uri + ", authority=" + this.authority + ", method=" + this.method + ", extra=" + this.extra + ")";
    }
}
