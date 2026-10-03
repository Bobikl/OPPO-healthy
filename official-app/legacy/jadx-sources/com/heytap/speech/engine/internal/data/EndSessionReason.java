package com.heytap.speech.engine.internal.data;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006'"}, d2 = {"Lcom/heytap/speech/engine/internal/data/EndSessionReason;", "", "errId", "", "errMsg", "", "errDetail", EngineConstant.REASON, "skillId", "taskId", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getErrDetail", "()Ljava/lang/String;", "setErrDetail", "(Ljava/lang/String;)V", "getErrId", "()I", "setErrId", "(I)V", "getErrMsg", "setErrMsg", "getReason", "setReason", "getSkillId", "setSkillId", "getTaskId", "setTaskId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class EndSessionReason {

    @Nullable
    private String errDetail;
    private int errId;

    @Nullable
    private String errMsg;

    @Nullable
    private String reason;

    @Nullable
    private String skillId;

    @Nullable
    private String taskId;

    public EndSessionReason() {
        this(0, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ EndSessionReason copy$default(EndSessionReason endSessionReason, int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = endSessionReason.errId;
        }
        if ((i2 & 2) != 0) {
            str = endSessionReason.errMsg;
        }
        String str6 = str;
        if ((i2 & 4) != 0) {
            str2 = endSessionReason.errDetail;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = endSessionReason.reason;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            str4 = endSessionReason.skillId;
        }
        String str9 = str4;
        if ((i2 & 32) != 0) {
            str5 = endSessionReason.taskId;
        }
        return endSessionReason.copy(i, str6, str7, str8, str9, str5);
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
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSkillId() {
        return this.skillId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    @NotNull
    public final EndSessionReason copy(int errId, @Nullable String errMsg, @Nullable String errDetail, @Nullable String reason, @Nullable String skillId, @Nullable String taskId) {
        return new EndSessionReason(errId, errMsg, errDetail, reason, skillId, taskId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndSessionReason)) {
            return false;
        }
        EndSessionReason endSessionReason = (EndSessionReason) other;
        return this.errId == endSessionReason.errId && Intrinsics.areEqual(this.errMsg, endSessionReason.errMsg) && Intrinsics.areEqual(this.errDetail, endSessionReason.errDetail) && Intrinsics.areEqual(this.reason, endSessionReason.reason) && Intrinsics.areEqual(this.skillId, endSessionReason.skillId) && Intrinsics.areEqual(this.taskId, endSessionReason.taskId);
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
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final String getSkillId() {
        return this.skillId;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errId) * 31;
        String str = this.errMsg;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errDetail;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reason;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.skillId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.taskId;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
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

    public final void setReason(@Nullable String str) {
        this.reason = str;
    }

    public final void setSkillId(@Nullable String str) {
        this.skillId = str;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }

    @NotNull
    public String toString() {
        return "EndSessionReason(errId=" + this.errId + ", errMsg=" + ((Object) this.errMsg) + ", errDetail=" + ((Object) this.errDetail) + ", reason=" + ((Object) this.reason) + ", skillId=" + ((Object) this.skillId) + ", taskId=" + ((Object) this.taskId) + ')';
    }

    public EndSessionReason(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.errId = i;
        this.errMsg = str;
        this.errDetail = str2;
        this.reason = str3;
        this.skillId = str4;
        this.taskId = str5;
    }

    public /* synthetic */ EndSessionReason(int i, String str, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) == 0 ? str5 : null);
    }
}
