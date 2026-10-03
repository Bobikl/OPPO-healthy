package com.heytap.speech.engine.internal.data;

import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/internal/data/Error;", "", "errId", "", "errMsg", "", "errDetail", SpeechConstant.KEY_RECORD_ID, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrDetail", "()Ljava/lang/String;", "setErrDetail", "(Ljava/lang/String;)V", "getErrId", "()I", "setErrId", "(I)V", "getErrMsg", "setErrMsg", "getRecordId", "setRecordId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Error {

    @Nullable
    private String errDetail;
    private int errId;

    @Nullable
    private String errMsg;

    @Nullable
    private String recordId;

    public Error() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ Error copy$default(Error error, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = error.errId;
        }
        if ((i2 & 2) != 0) {
            str = error.errMsg;
        }
        if ((i2 & 4) != 0) {
            str2 = error.errDetail;
        }
        if ((i2 & 8) != 0) {
            str3 = error.recordId;
        }
        return error.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrId() {
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

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    @NotNull
    public final Error copy(int errId, @Nullable String errMsg, @Nullable String errDetail, @Nullable String recordId) {
        return new Error(errId, errMsg, errDetail, recordId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        Error error = (Error) other;
        return this.errId == error.errId && Intrinsics.areEqual(this.errMsg, error.errMsg) && Intrinsics.areEqual(this.errDetail, error.errDetail) && Intrinsics.areEqual(this.recordId, error.recordId);
    }

    @Nullable
    public final String getErrDetail() {
        return this.errDetail;
    }

    public final int getErrId() {
        return this.errId;
    }

    @Nullable
    public final String getErrMsg() {
        return this.errMsg;
    }

    @Nullable
    public final String getRecordId() {
        return this.recordId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errId) * 31;
        String str = this.errMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errDetail;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.recordId;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setErrDetail(@Nullable String str) {
        this.errDetail = str;
    }

    public final void setErrId(int i) {
        this.errId = i;
    }

    public final void setErrMsg(@Nullable String str) {
        this.errMsg = str;
    }

    public final void setRecordId(@Nullable String str) {
        this.recordId = str;
    }

    @NotNull
    public String toString() {
        return "Error(errId=" + this.errId + ", errMsg=" + ((Object) this.errMsg) + ", errDetail=" + ((Object) this.errDetail) + ", recordId=" + ((Object) this.recordId) + ')';
    }

    public Error(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.errId = i;
        this.errMsg = str;
        this.errDetail = str2;
        this.recordId = str3;
    }

    public /* synthetic */ Error(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3);
    }
}
