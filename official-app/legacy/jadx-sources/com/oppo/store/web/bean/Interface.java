package com.oppo.store.web.bean;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012JV\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/oppo/store/web/bean/Interface;", "", "tag", "", "path", "method", "params", "", "timeout", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)V", "getMethod", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "getPath", "getTag", "getTimeout", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)Lcom/oppo/store/web/bean/Interface;", "equals", "", "other", "hashCode", "toString", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Interface {

    @Nullable
    private final String method;

    @Nullable
    private final Map<String, String> params;

    @Nullable
    private final String path;

    @Nullable
    private final String tag;

    @Nullable
    private final Integer timeout;

    public Interface(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable Integer num) {
        this.tag = str;
        this.path = str2;
        this.method = str3;
        this.params = map;
        this.timeout = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Interface copy$default(Interface r3, String str, String str2, String str3, Map map, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = r3.tag;
        }
        if ((i & 2) != 0) {
            str2 = r3.path;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = r3.method;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            map = r3.params;
        }
        Map map2 = map;
        if ((i & 16) != 0) {
            num = r3.timeout;
        }
        return r3.copy(str, str4, str5, map2, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final Map<String, String> component4() {
        return this.params;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTimeout() {
        return this.timeout;
    }

    @NotNull
    public final Interface copy(@Nullable String tag, @Nullable String path, @Nullable String method, @Nullable Map<String, String> params, @Nullable Integer timeout) {
        return new Interface(tag, path, method, params, timeout);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Interface)) {
            return false;
        }
        Interface r5 = (Interface) other;
        return Intrinsics.areEqual(this.tag, r5.tag) && Intrinsics.areEqual(this.path, r5.path) && Intrinsics.areEqual(this.method, r5.method) && Intrinsics.areEqual(this.params, r5.params) && Intrinsics.areEqual(this.timeout, r5.timeout);
    }

    @Nullable
    public final String getMethod() {
        return this.method;
    }

    @Nullable
    public final Map<String, String> getParams() {
        return this.params;
    }

    @Nullable
    public final String getPath() {
        return this.path;
    }

    @Nullable
    public final String getTag() {
        return this.tag;
    }

    @Nullable
    public final Integer getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        String str = this.tag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.path;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.method;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.params;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.timeout;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Interface(tag=" + this.tag + ", path=" + this.path + ", method=" + this.method + ", params=" + this.params + ", timeout=" + this.timeout + ')';
    }
}
