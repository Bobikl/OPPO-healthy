package com.oplus.mydevices.sdk.constants;

import androidx.annotation.Keep;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/oplus/mydevices/sdk/constants/BaseResponse;", ExifInterface.GPS_DIRECTION_TRUE, "", "code", "", "msg", "", "data", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Object;)Lcom/oplus/mydevices/sdk/constants/BaseResponse;", "equals", "", "other", "hashCode", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BaseResponse<T> {
    private final int code;

    @Nullable
    private final T data;

    @Nullable
    private final String msg;

    public BaseResponse(int i, @Nullable String str, @Nullable T t) {
        this.code = i;
        this.msg = str;
        this.data = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResponse copy$default(BaseResponse baseResponse, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = baseResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = baseResponse.msg;
        }
        if ((i2 & 4) != 0) {
            obj = baseResponse.data;
        }
        return baseResponse.copy(i, str, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    public final T component3() {
        return this.data;
    }

    @NotNull
    public final BaseResponse<T> copy(int code, @Nullable String msg, @Nullable T data) {
        return new BaseResponse<>(code, msg, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseResponse)) {
            return false;
        }
        BaseResponse baseResponse = (BaseResponse) other;
        return this.code == baseResponse.code && Intrinsics.areEqual(this.msg, baseResponse.msg) && Intrinsics.areEqual(this.data, baseResponse.data);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final T getData() {
        return this.data;
    }

    @Nullable
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int i = this.code * 31;
        String str = this.msg;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        T t = this.data;
        return iHashCode + (t != null ? t.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BaseResponse(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ")";
    }

    public /* synthetic */ BaseResponse(int i, String str, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : obj);
    }
}
