package com.oplus.aiunit.vision;

import androidx.core.provider.FontsContractCompat;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.accessory.file.model.Constant;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wearable.soundrecord.bean.SoundRecord$RecordInfo;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.dhf, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {FontsContractCompat.Columns.FILE_ID, "unique_flag"})
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b$\b\u0007\u0018\u0000 32\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b1\u00102J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\t\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0018\u0010\u000eR\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u001b\u0010\u000eR\"\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f\"\u0004\b \u0010!R\"\u0010%\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b$\u0010\u0015R\"\u0010'\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b#\u0010\f\"\u0004\b&\u0010\u000eR\"\u0010.\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00100\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010\f\"\u0004\b/\u0010\u000e¨\u00064"}, d2 = {"Lcom/oplus/aiunit/vision/dhf;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", b2n.f, "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "uniqueFlag", "", "b", "J", "()J", MapSchema.FIELD_NAME_KEY, "(J)V", "fileId", "c", LogFieldKey.LEVEL_KEY, "fileMd5", "d", LogFieldKey.MESSAGE_KEY, LogSenderConst.FILENAME, MapSchema.FIELD_NAME_ENTRY, "I", "()I", "n", "(I)V", Constant.FILE_SIZE, "f", "o", "modifyTime", LogFieldKey.PROCESS_NAME_KEY, "path", b2n.g, "Z", "i", "()Z", "j", "(Z)V", "isDownloaded", "r", ParserTag.TAG_URI, "<init>", "()V", "Companion", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class RecordFileDbBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @ColumnInfo(defaultValue = "", name = FontsContractCompat.Columns.FILE_ID)
    public long fileId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int fileSize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long modifyTime;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isDownloaded;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String uri;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @ColumnInfo(defaultValue = "", name = "unique_flag")
    @NotNull
    public String uniqueFlag = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String fileMd5 = "";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public String fileName = "";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public String path = "";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.dhf$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0002H\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/dhf$a;", "", "", LogSenderConst.FILENAME, "", "fileId", "", Constant.FILE_SIZE, "modifyTime", "fileMd5", "Lcom/oplus/aiunit/vision/dhf;", "b", "Lcom/heytap/wearable/soundrecord/bean/SoundRecord$RecordInfo;", "recordInfo", "a", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final RecordFileDbBean a(@NotNull SoundRecord$RecordInfo recordInfo) {
            Intrinsics.checkNotNullParameter(recordInfo, "recordInfo");
            RecordFileDbBean recordFileDbBean = new RecordFileDbBean();
            String fileName = recordInfo.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "recordInfo.fileName");
            recordFileDbBean.m(fileName);
            recordFileDbBean.k(recordInfo.getFileId());
            recordFileDbBean.n(recordInfo.getFileSize());
            recordFileDbBean.o(recordInfo.getTimeStamp());
            String fileMd5 = recordInfo.getFileMd5();
            Intrinsics.checkNotNullExpressionValue(fileMd5, "recordInfo.fileMd5");
            recordFileDbBean.l(fileMd5);
            return recordFileDbBean;
        }

        @JvmStatic
        @NotNull
        public final RecordFileDbBean b(@NotNull String fileName, long fileId, int fileSize, long modifyTime, @NotNull String fileMd5) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
            RecordFileDbBean recordFileDbBean = new RecordFileDbBean();
            recordFileDbBean.m(fileName);
            recordFileDbBean.k(fileId);
            recordFileDbBean.n(fileSize);
            recordFileDbBean.o(modifyTime);
            recordFileDbBean.l(fileMd5);
            return recordFileDbBean;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getFileId() {
        return this.fileId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFileMd5() {
        return this.fileMd5;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getFileSize() {
        return this.fileSize;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getModifyTime() {
        return this.modifyTime;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RecordFileDbBean.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watch.records.bean.RecordFileDbBean");
        RecordFileDbBean recordFileDbBean = (RecordFileDbBean) other;
        return Intrinsics.areEqual(this.uniqueFlag, recordFileDbBean.uniqueFlag) && this.fileId == recordFileDbBean.fileId;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUniqueFlag() {
        return this.uniqueFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (this.uniqueFlag.hashCode() * 31) + Long.hashCode(this.fileId);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsDownloaded() {
        return this.isDownloaded;
    }

    public final void j(boolean z) {
        this.isDownloaded = z;
    }

    public final void k(long j2) {
        this.fileId = j2;
    }

    public final void l(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileMd5 = str;
    }

    public final void m(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fileName = str;
    }

    public final void n(int i) {
        this.fileSize = i;
    }

    public final void o(long j2) {
        this.modifyTime = j2;
    }

    public final void p(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.path = str;
    }

    public final void q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uniqueFlag = str;
    }

    public final void r(@Nullable String str) {
        this.uri = str;
    }

    @NotNull
    public String toString() {
        return "RecordFileDbBean(uniqueFlag='" + this.uniqueFlag + "', fileId='" + this.fileId + "', fileName='" + this.fileName + "', fileSize=" + this.fileSize + ", path='" + this.path + "', fileMd5='" + this.fileMd5 + "')";
    }
}
