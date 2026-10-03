package com.heytap.health.sleep.ai.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 1)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ4\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/sleep/ai/data/Response;", ExifInterface.GPS_DIRECTION_TRUE, "", "errorCode", "", "message", "", "body", "(ILjava/lang/String;Ljava/lang/Object;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorCode", "()I", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Object;)Lcom/heytap/health/sleep/ai/data/Response;", "equals", "", "other", "hashCode", "toString", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Response<T> {
    public static final int $stable = 0;

    @Nullable
    private final T body;
    private final int errorCode;

    @NotNull
    private final String message;

    public Response(int i, @NotNull String message, @Nullable T t) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.errorCode = i;
        this.message = message;
        this.body = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = response.errorCode;
        }
        if ((i2 & 2) != 0) {
            str = response.message;
        }
        if ((i2 & 4) != 0) {
            obj = response.body;
        }
        return response.copy(i, str, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final T component3() {
        return this.body;
    }

    @NotNull
    public final Response<T> copy(int errorCode, @NotNull String message, @Nullable T body) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new Response<>(errorCode, message, body);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return this.errorCode == response.errorCode && Intrinsics.areEqual(this.message, response.message) && Intrinsics.areEqual(this.body, response.body);
    }

    @Nullable
    public final T getBody() {
        return this.body;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.errorCode) * 31) + this.message.hashCode()) * 31;
        T t = this.body;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        return "Response(errorCode=" + this.errorCode + ", message=" + this.message + ", body=" + this.body + ")";
    }
}
