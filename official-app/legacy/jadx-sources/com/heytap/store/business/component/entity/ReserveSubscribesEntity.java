package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/business/component/entity/ReserveSubscribesEntity;", "", "code", "", "msg", "", "data", "errorMessage", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getErrorMessage", "setErrorMessage", "getMsg", "setMsg", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ReserveSubscribesEntity {
    private int code;

    @Nullable
    private String data;

    @NotNull
    private String errorMessage;

    @NotNull
    private String msg;

    public ReserveSubscribesEntity(int i, @NotNull String msg, @Nullable String str, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.code = i;
        this.msg = msg;
        this.data = str;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ ReserveSubscribesEntity copy$default(ReserveSubscribesEntity reserveSubscribesEntity, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reserveSubscribesEntity.code;
        }
        if ((i2 & 2) != 0) {
            str = reserveSubscribesEntity.msg;
        }
        if ((i2 & 4) != 0) {
            str2 = reserveSubscribesEntity.data;
        }
        if ((i2 & 8) != 0) {
            str3 = reserveSubscribesEntity.errorMessage;
        }
        return reserveSubscribesEntity.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final ReserveSubscribesEntity copy(int code, @NotNull String msg, @Nullable String data, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new ReserveSubscribesEntity(code, msg, data, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReserveSubscribesEntity)) {
            return false;
        }
        ReserveSubscribesEntity reserveSubscribesEntity = (ReserveSubscribesEntity) other;
        return this.code == reserveSubscribesEntity.code && Intrinsics.areEqual(this.msg, reserveSubscribesEntity.msg) && Intrinsics.areEqual(this.data, reserveSubscribesEntity.data) && Intrinsics.areEqual(this.errorMessage, reserveSubscribesEntity.errorMessage);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31;
        String str = this.data;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.errorMessage.hashCode();
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorMessage = str;
    }

    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg = str;
    }

    @NotNull
    public String toString() {
        return "ReserveSubscribesEntity(code=" + this.code + ", msg=" + this.msg + ", data=" + ((Object) this.data) + ", errorMessage=" + this.errorMessage + ')';
    }

    public /* synthetic */ ReserveSubscribesEntity(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
