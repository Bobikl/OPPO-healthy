package com.heytap.health.watch.records.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.heytap.accessory.file.model.Constant;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0001GBi\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\bC\u0010DB\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\bC\u0010EJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003Jk\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001f\u001a\u00020\u0015HÆ\u0001J\t\u0010!\u001a\u00020\fHÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\u0013\u0010%\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003R$\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010&\u001a\u0004\b0\u0010(\"\u0004\b1\u0010*R$\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010&\u001a\u0004\b2\u0010(\"\u0004\b3\u0010*R\"\u0010\u001b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010+\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010+\u001a\u0004\b6\u0010-\"\u0004\b7\u0010/R\"\u0010\u001d\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00108\u001a\u0004\b\u001d\u00109\"\u0004\b:\u0010;R$\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b<\u0010(\"\u0004\b=\u0010*R\"\u0010\u001f\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006H"}, d2 = {"Lcom/heytap/health/watch/records/bean/RecordFileTaskInfo;", "Landroid/os/Parcelable;", "", "isNormalState", "isComplete", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "taskId", "errorCode", LogSenderConst.FILENAME, "fileMd5", Constant.FILE_SIZE, "progress", "isReceiveTask", "nodeId", "fileId", "copy", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getTaskId", "()Ljava/lang/String;", "setTaskId", "(Ljava/lang/String;)V", "I", "getErrorCode", "()I", "setErrorCode", "(I)V", "getFileName", "setFileName", "getFileMd5", "setFileMd5", "getFileSize", "setFileSize", "getProgress", ClickApiEntity.SET_PROGRESS, "Z", "()Z", "setReceiveTask", "(Z)V", "getNodeId", "setNodeId", "J", "getFileId", "()J", "setFileId", "(J)V", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIZLjava/lang/String;J)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RecordFileTaskInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int ERROR_CODE_NORMAL = 0;
    public static final int PROCESS_COMPLETE = 100;
    private int errorCode;
    private long fileId;

    @Nullable
    private String fileMd5;

    @Nullable
    private String fileName;
    private int fileSize;
    private boolean isReceiveTask;

    @Nullable
    private String nodeId;
    private int progress;

    @Nullable
    private String taskId;

    /* JADX INFO: renamed from: com.heytap.health.watch.records.bean.RecordFileTaskInfo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/watch/records/bean/RecordFileTaskInfo$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/watch/records/bean/RecordFileTaskInfo;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/health/watch/records/bean/RecordFileTaskInfo;", "ERROR_CODE_NORMAL", "I", "PROCESS_COMPLETE", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<RecordFileTaskInfo> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecordFileTaskInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecordFileTaskInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RecordFileTaskInfo[] newArray(int size) {
            return new RecordFileTaskInfo[size];
        }
    }

    public RecordFileTaskInfo() {
        this(null, 0, null, null, 0, 0, false, null, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileMd5() {
        return this.fileMd5;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsReceiveTask() {
        return this.isReceiveTask;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getFileId() {
        return this.fileId;
    }

    @NotNull
    public final RecordFileTaskInfo copy(@Nullable String taskId, int errorCode, @Nullable String fileName, @Nullable String fileMd5, int fileSize, int progress, boolean isReceiveTask, @Nullable String nodeId, long fileId) {
        return new RecordFileTaskInfo(taskId, errorCode, fileName, fileMd5, fileSize, progress, isReceiveTask, nodeId, fileId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordFileTaskInfo)) {
            return false;
        }
        RecordFileTaskInfo recordFileTaskInfo = (RecordFileTaskInfo) other;
        return Intrinsics.areEqual(this.taskId, recordFileTaskInfo.taskId) && this.errorCode == recordFileTaskInfo.errorCode && Intrinsics.areEqual(this.fileName, recordFileTaskInfo.fileName) && Intrinsics.areEqual(this.fileMd5, recordFileTaskInfo.fileMd5) && this.fileSize == recordFileTaskInfo.fileSize && this.progress == recordFileTaskInfo.progress && this.isReceiveTask == recordFileTaskInfo.isReceiveTask && Intrinsics.areEqual(this.nodeId, recordFileTaskInfo.nodeId) && this.fileId == recordFileTaskInfo.fileId;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final long getFileId() {
        return this.fileId;
    }

    @Nullable
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final String getNodeId() {
        return this.nodeId;
    }

    public final int getProgress() {
        return this.progress;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    public int hashCode() {
        String str = this.taskId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.errorCode)) * 31;
        String str2 = this.fileName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileMd5;
        int iHashCode3 = (((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.fileSize)) * 31) + Integer.hashCode(this.progress)) * 31;
        boolean z = this.isReceiveTask;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode3 + r2) * 31;
        String str4 = this.nodeId;
        return ((i + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.hashCode(this.fileId);
    }

    public final boolean isComplete() {
        return this.progress == 100 && isNormalState();
    }

    public final boolean isNormalState() {
        return this.errorCode == 0;
    }

    public final boolean isReceiveTask() {
        return this.isReceiveTask;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setFileId(long j2) {
        this.fileId = j2;
    }

    public final void setFileMd5(@Nullable String str) {
        this.fileMd5 = str;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFileSize(int i) {
        this.fileSize = i;
    }

    public final void setNodeId(@Nullable String str) {
        this.nodeId = str;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setReceiveTask(boolean z) {
        this.isReceiveTask = z;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }

    @NotNull
    public String toString() {
        return "RecordFileTaskInfo(taskId=" + this.taskId + ", errorCode=" + this.errorCode + ", fileName=" + this.fileName + ", fileMd5=" + this.fileMd5 + ", fileSize=" + this.fileSize + ", progress=" + this.progress + ", isReceiveTask=" + this.isReceiveTask + ", nodeId=" + this.nodeId + ", fileId=" + this.fileId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.taskId);
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.fileName);
        parcel.writeString(this.fileMd5);
        parcel.writeInt(this.fileSize);
        parcel.writeInt(this.progress);
        parcel.writeByte(this.isReceiveTask ? (byte) 1 : (byte) 0);
        parcel.writeString(this.nodeId);
        parcel.writeLong(this.fileId);
    }

    public RecordFileTaskInfo(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, int i2, int i3, boolean z, @Nullable String str4, long j2) {
        this.taskId = str;
        this.errorCode = i;
        this.fileName = str2;
        this.fileMd5 = str3;
        this.fileSize = i2;
        this.progress = i3;
        this.isReceiveTask = z;
        this.nodeId = str4;
        this.fileId = j2;
    }

    public /* synthetic */ RecordFileTaskInfo(String str, int i, String str2, String str3, int i2, int i3, boolean z, String str4, long j2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? null : str3, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? 0L : j2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecordFileTaskInfo(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readByte() != 0, parcel.readString(), parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
