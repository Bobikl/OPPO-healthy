package com.heytap.health.watch.thirdparty.bugfix.research.api;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0014JD\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/heytap/health/watch/thirdparty/bugfix/research/api/ResearchBaseResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "code", "", "data", "message", "", "serverTime", "", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Long;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getServerTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Long;)Lcom/heytap/health/watch/thirdparty/bugfix/research/api/ResearchBaseResponse;", "equals", "", "other", "hashCode", "toString", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ResearchBaseResponse<T> {

    @Nullable
    private final Integer code;

    @Nullable
    private final T data;

    @Nullable
    private final String message;

    @Nullable
    private final Long serverTime;

    public ResearchBaseResponse(@Nullable Integer num, @Nullable T t, @Nullable String str, @Nullable Long l2) {
        this.code = num;
        this.data = t;
        this.message = str;
        this.serverTime = l2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResearchBaseResponse copy$default(ResearchBaseResponse researchBaseResponse, Integer num, Object obj, String str, Long l2, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = researchBaseResponse.code;
        }
        if ((i & 2) != 0) {
            obj = researchBaseResponse.data;
        }
        if ((i & 4) != 0) {
            str = researchBaseResponse.message;
        }
        if ((i & 8) != 0) {
            l2 = researchBaseResponse.serverTime;
        }
        return researchBaseResponse.copy(num, obj, str, l2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final T component2() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getServerTime() {
        return this.serverTime;
    }

    @NotNull
    public final ResearchBaseResponse<T> copy(@Nullable Integer code, @Nullable T data, @Nullable String message, @Nullable Long serverTime) {
        return new ResearchBaseResponse<>(code, data, message, serverTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResearchBaseResponse)) {
            return false;
        }
        ResearchBaseResponse researchBaseResponse = (ResearchBaseResponse) other;
        return Intrinsics.areEqual(this.code, researchBaseResponse.code) && Intrinsics.areEqual(this.data, researchBaseResponse.data) && Intrinsics.areEqual(this.message, researchBaseResponse.message) && Intrinsics.areEqual(this.serverTime, researchBaseResponse.serverTime);
    }

    @Nullable
    public final Integer getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        Integer num = this.code;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        T t = this.data;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        String str = this.message;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.serverTime;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ResearchBaseResponse(code=" + this.code + ", data=" + this.data + ", message=" + this.message + ", serverTime=" + this.serverTime + ")";
    }
}
