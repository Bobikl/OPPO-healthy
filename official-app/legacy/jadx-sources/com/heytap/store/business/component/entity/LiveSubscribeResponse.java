package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\""}, d2 = {"Lcom/heytap/store/business/component/entity/LiveSubscribeResponse;", "", "code", "", "msg", "", "data", "Lcom/heytap/store/business/component/entity/LiveSubscribeBean;", "errorMessage", "(ILjava/lang/String;Lcom/heytap/store/business/component/entity/LiveSubscribeBean;Ljava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getData", "()Lcom/heytap/store/business/component/entity/LiveSubscribeBean;", "setData", "(Lcom/heytap/store/business/component/entity/LiveSubscribeBean;)V", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "getMsg", "setMsg", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LiveSubscribeResponse {
    private int code;

    @Nullable
    private LiveSubscribeBean data;

    @NotNull
    private String errorMessage;

    @NotNull
    private String msg;

    public LiveSubscribeResponse(int i, @NotNull String msg, @Nullable LiveSubscribeBean liveSubscribeBean, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.code = i;
        this.msg = msg;
        this.data = liveSubscribeBean;
        this.errorMessage = errorMessage;
    }

    public static /* synthetic */ LiveSubscribeResponse copy$default(LiveSubscribeResponse liveSubscribeResponse, int i, String str, LiveSubscribeBean liveSubscribeBean, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = liveSubscribeResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = liveSubscribeResponse.msg;
        }
        if ((i2 & 4) != 0) {
            liveSubscribeBean = liveSubscribeResponse.data;
        }
        if ((i2 & 8) != 0) {
            str2 = liveSubscribeResponse.errorMessage;
        }
        return liveSubscribeResponse.copy(i, str, liveSubscribeBean, str2);
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
    public final LiveSubscribeBean getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final LiveSubscribeResponse copy(int code, @NotNull String msg, @Nullable LiveSubscribeBean data, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return new LiveSubscribeResponse(code, msg, data, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveSubscribeResponse)) {
            return false;
        }
        LiveSubscribeResponse liveSubscribeResponse = (LiveSubscribeResponse) other;
        return this.code == liveSubscribeResponse.code && Intrinsics.areEqual(this.msg, liveSubscribeResponse.msg) && Intrinsics.areEqual(this.data, liveSubscribeResponse.data) && Intrinsics.areEqual(this.errorMessage, liveSubscribeResponse.errorMessage);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final LiveSubscribeBean getData() {
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
        LiveSubscribeBean liveSubscribeBean = this.data;
        return ((iHashCode + (liveSubscribeBean == null ? 0 : liveSubscribeBean.hashCode())) * 31) + this.errorMessage.hashCode();
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@Nullable LiveSubscribeBean liveSubscribeBean) {
        this.data = liveSubscribeBean;
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
        return "LiveSubscribeResponse(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ", errorMessage=" + this.errorMessage + ')';
    }

    public /* synthetic */ LiveSubscribeResponse(int i, String str, LiveSubscribeBean liveSubscribeBean, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, liveSubscribeBean, (i2 & 8) != 0 ? "" : str2);
    }
}
