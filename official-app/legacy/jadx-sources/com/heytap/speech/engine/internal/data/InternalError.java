package com.heytap.speech.engine.internal.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/internal/data/InternalError;", "", "errId", "", "errMsg", "errDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrDetail", "()Ljava/lang/String;", "setErrDetail", "(Ljava/lang/String;)V", "getErrId", "setErrId", "getErrMsg", "setErrMsg", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class InternalError {

    @Nullable
    private String errDetail;

    @NotNull
    private String errId;

    @Nullable
    private String errMsg;

    public InternalError() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ InternalError copy$default(InternalError internalError, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = internalError.errId;
        }
        if ((i & 2) != 0) {
            str2 = internalError.errMsg;
        }
        if ((i & 4) != 0) {
            str3 = internalError.errDetail;
        }
        return internalError.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrId() {
        return this.errId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrMsg() {
        return this.errMsg;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrDetail() {
        return this.errDetail;
    }

    @NotNull
    public final InternalError copy(@NotNull String errId, @Nullable String errMsg, @Nullable String errDetail) {
        Intrinsics.checkNotNullParameter(errId, "errId");
        return new InternalError(errId, errMsg, errDetail);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalError)) {
            return false;
        }
        InternalError internalError = (InternalError) other;
        return Intrinsics.areEqual(this.errId, internalError.errId) && Intrinsics.areEqual(this.errMsg, internalError.errMsg) && Intrinsics.areEqual(this.errDetail, internalError.errDetail);
    }

    @Nullable
    public final String getErrDetail() {
        return this.errDetail;
    }

    @NotNull
    public final String getErrId() {
        return this.errId;
    }

    @Nullable
    public final String getErrMsg() {
        return this.errMsg;
    }

    public int hashCode() {
        int iHashCode = this.errId.hashCode() * 31;
        String str = this.errMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errDetail;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setErrDetail(@Nullable String str) {
        this.errDetail = str;
    }

    public final void setErrId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errId = str;
    }

    public final void setErrMsg(@Nullable String str) {
        this.errMsg = str;
    }

    @NotNull
    public String toString() {
        return "InternalError(errId=" + this.errId + ", errMsg=" + ((Object) this.errMsg) + ", errDetail=" + ((Object) this.errDetail) + ')';
    }

    public InternalError(@NotNull String errId, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(errId, "errId");
        this.errId = errId;
        this.errMsg = str;
        this.errDetail = str2;
    }

    public /* synthetic */ InternalError(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
