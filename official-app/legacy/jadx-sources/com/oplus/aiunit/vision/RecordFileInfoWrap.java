package com.oplus.aiunit.vision;

import com.heytap.health.watch.records.bean.BtnStatus;
import com.heytap.health.watch.records.bean.TaskStatus;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ehf, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0019\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0007\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0012\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010'\u001a\u0004\b\u001a\u0010(\"\u0004\b)\u0010*R\"\u00100\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010,\u001a\u0004\b\n\u0010-\"\u0004\b.\u0010/R$\u00103\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010'\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\"\u00105\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010'\u001a\u0004\b \u0010(\"\u0004\b4\u0010*¨\u00068"}, d2 = {"Lcom/oplus/aiunit/vision/ehf;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/dhf;", "a", "Lcom/oplus/aiunit/vision/dhf;", "f", "()Lcom/oplus/aiunit/vision/dhf;", "setRecordFileInfo", "(Lcom/oplus/aiunit/vision/dhf;)V", "recordFileInfo", "Lcom/heytap/health/watch/records/bean/TaskStatus;", "b", "Lcom/heytap/health/watch/records/bean/TaskStatus;", "getStatus", "()Lcom/heytap/health/watch/records/bean/TaskStatus;", LogFieldKey.MESSAGE_KEY, "(Lcom/heytap/health/watch/records/bean/TaskStatus;)V", "status", "Lcom/heytap/health/watch/records/bean/BtnStatus;", "c", "Lcom/heytap/health/watch/records/bean/BtnStatus;", "()Lcom/heytap/health/watch/records/bean/BtnStatus;", "i", "(Lcom/heytap/health/watch/records/bean/BtnStatus;)V", "btnStatus", "d", "I", MapSchema.FIELD_NAME_ENTRY, "()I", LogFieldKey.LEVEL_KEY, "(I)V", "process", "Ljava/lang/String;", "()Ljava/lang/String;", "j", "(Ljava/lang/String;)V", "btnStr", "Z", "()Z", b2n.g, "(Z)V", "btnEnable", b2n.f, "n", "taskId", MapSchema.FIELD_NAME_KEY, "exceptionTips", "<init>", "(Lcom/oplus/aiunit/vision/dhf;Lcom/heytap/health/watch/records/bean/TaskStatus;Lcom/heytap/health/watch/records/bean/BtnStatus;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RecordFileInfoWrap {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public RecordFileDbBean recordFileInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public TaskStatus status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public BtnStatus btnStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public int process;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String btnStr;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public boolean btnEnable;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public String taskId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public String exceptionTips;

    public RecordFileInfoWrap(@NotNull RecordFileDbBean recordFileInfo, @NotNull TaskStatus status, @NotNull BtnStatus btnStatus, int i, @Nullable String str, boolean z, @Nullable String str2, @NotNull String exceptionTips) {
        Intrinsics.checkNotNullParameter(recordFileInfo, "recordFileInfo");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(btnStatus, "btnStatus");
        Intrinsics.checkNotNullParameter(exceptionTips, "exceptionTips");
        this.recordFileInfo = recordFileInfo;
        this.status = status;
        this.btnStatus = btnStatus;
        this.process = i;
        this.btnStr = str;
        this.btnEnable = z;
        this.taskId = str2;
        this.exceptionTips = exceptionTips;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getBtnEnable() {
        return this.btnEnable;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final BtnStatus getBtnStatus() {
        return this.btnStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBtnStr() {
        return this.btnStr;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExceptionTips() {
        return this.exceptionTips;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getProcess() {
        return this.process;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordFileInfoWrap)) {
            return false;
        }
        RecordFileInfoWrap recordFileInfoWrap = (RecordFileInfoWrap) other;
        return Intrinsics.areEqual(this.recordFileInfo, recordFileInfoWrap.recordFileInfo) && this.status == recordFileInfoWrap.status && this.btnStatus == recordFileInfoWrap.btnStatus && this.process == recordFileInfoWrap.process && Intrinsics.areEqual(this.btnStr, recordFileInfoWrap.btnStr) && this.btnEnable == recordFileInfoWrap.btnEnable && Intrinsics.areEqual(this.taskId, recordFileInfoWrap.taskId) && Intrinsics.areEqual(this.exceptionTips, recordFileInfoWrap.exceptionTips);
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final RecordFileDbBean getRecordFileInfo() {
        return this.recordFileInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    public final void h(boolean z) {
        this.btnEnable = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    public int hashCode() {
        int iHashCode = ((((((this.recordFileInfo.hashCode() * 31) + this.status.hashCode()) * 31) + this.btnStatus.hashCode()) * 31) + Integer.hashCode(this.process)) * 31;
        String str = this.btnStr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.btnEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        String str2 = this.taskId;
        return ((i + (str2 != null ? str2.hashCode() : 0)) * 31) + this.exceptionTips.hashCode();
    }

    public final void i(@NotNull BtnStatus btnStatus) {
        Intrinsics.checkNotNullParameter(btnStatus, "<set-?>");
        this.btnStatus = btnStatus;
    }

    public final void j(@Nullable String str) {
        this.btnStr = str;
    }

    public final void k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.exceptionTips = str;
    }

    public final void l(int i) {
        this.process = i;
    }

    public final void m(@NotNull TaskStatus taskStatus) {
        Intrinsics.checkNotNullParameter(taskStatus, "<set-?>");
        this.status = taskStatus;
    }

    public final void n(@Nullable String str) {
        this.taskId = str;
    }

    @NotNull
    public String toString() {
        return "RecordFileInfoWrap(recordFileInfo=" + this.recordFileInfo + ", status=" + this.status + ", btnStatus=" + this.btnStatus + ", process=" + this.process + ", btnStr=" + this.btnStr + ", btnEnable=" + this.btnEnable + ", taskId=" + this.taskId + ", exceptionTips=" + this.exceptionTips + ")";
    }

    public /* synthetic */ RecordFileInfoWrap(RecordFileDbBean recordFileDbBean, TaskStatus taskStatus, BtnStatus btnStatus, int i, String str, boolean z, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(recordFileDbBean, (i2 & 2) != 0 ? TaskStatus.INIT : taskStatus, (i2 & 4) != 0 ? BtnStatus.NORMAL : btnStatus, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str, (i2 & 32) == 0 ? z : false, (i2 & 64) == 0 ? str2 : null, (i2 & 128) != 0 ? "" : str3);
    }
}
