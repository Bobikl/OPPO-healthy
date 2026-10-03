package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.transfer.TransferType;
import io.protostuff.MapSchema;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.r9k, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\bD\u0010EJ·\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001d\u001a\u00020\rHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b6\u0010\"R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b'\u0010<R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b+\u00105R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b%\u00107\u001a\u0004\b:\u00109R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b=\u00109R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010 \u001a\u0004\b/\u0010\"R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b?\u0010B\u001a\u0004\bA\u0010C¨\u0006F"}, d2 = {"Lcom/oplus/aiunit/vision/r9k;", "", "", "isLoading", "", "progress", "Ljava/io/File;", "exportedFile", "", "Lcom/heytap/databaseengine/model/OneTimeSport;", "importedRecords", "Lcom/oplus/aiunit/vision/u5a;", "importDetail", "", "importConfirmEventId", "saveSuccess", "", "saveMessage", "", "error", "errorEventId", "sportData", "importFileName", "importFileSize", "exportComplete", "Lcom/heytap/sports/transfer/TransferType;", "selectedExportType", "a", "toString", "hashCode", "other", "equals", "Z", LogFieldKey.PROCESS_NAME_KEY, "()Z", "b", UserInfo.SEX_FEMALE, LogFieldKey.LEVEL_KEY, "()F", "c", "Ljava/io/File;", "f", "()Ljava/io/File;", "d", "Ljava/util/List;", MapSchema.FIELD_NAME_KEY, "()Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/u5a;", b2n.g, "()Lcom/oplus/aiunit/vision/u5a;", "I", b2n.f, "()I", LogFieldKey.MESSAGE_KEY, "Ljava/lang/String;", "getSaveMessage", "()Ljava/lang/String;", "i", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "j", "Lcom/heytap/databaseengine/model/OneTimeSport;", "o", "()Lcom/heytap/databaseengine/model/OneTimeSport;", "n", "Lcom/heytap/sports/transfer/TransferType;", "()Lcom/heytap/sports/transfer/TransferType;", "<init>", "(ZFLjava/io/File;Ljava/util/List;Lcom/oplus/aiunit/vision/u5a;IZLjava/lang/String;Ljava/lang/Throwable;ILcom/heytap/databaseengine/model/OneTimeSport;Ljava/lang/String;Ljava/lang/String;ZLcom/heytap/sports/transfer/TransferType;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TransferUiState {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final boolean isLoading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final float progress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final File exportedFile;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final List<OneTimeSport> importedRecords;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final ImportResultDetail importDetail;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final int importConfirmEventId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final boolean saveSuccess;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    public final String saveMessage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    public final Throwable error;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public final int errorEventId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public final OneTimeSport sportData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String importFileName;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @Nullable
    public final String importFileSize;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean exportComplete;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @Nullable
    public final TransferType selectedExportType;

    public TransferUiState() {
        this(false, 0.0f, null, null, null, 0, false, null, null, 0, null, null, null, false, null, 32767, null);
    }

    @NotNull
    public final TransferUiState a(boolean isLoading, float progress, @Nullable File exportedFile, @Nullable List<? extends OneTimeSport> importedRecords, @Nullable ImportResultDetail importDetail, int importConfirmEventId, boolean saveSuccess, @Nullable String saveMessage, @Nullable Throwable error, int errorEventId, @Nullable OneTimeSport sportData, @Nullable String importFileName, @Nullable String importFileSize, boolean exportComplete, @Nullable TransferType selectedExportType) {
        return new TransferUiState(isLoading, progress, exportedFile, importedRecords, importDetail, importConfirmEventId, saveSuccess, saveMessage, error, errorEventId, sportData, importFileName, importFileSize, exportComplete, selectedExportType);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getErrorEventId() {
        return this.errorEventId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getExportComplete() {
        return this.exportComplete;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransferUiState)) {
            return false;
        }
        TransferUiState transferUiState = (TransferUiState) other;
        return this.isLoading == transferUiState.isLoading && Float.compare(this.progress, transferUiState.progress) == 0 && Intrinsics.areEqual(this.exportedFile, transferUiState.exportedFile) && Intrinsics.areEqual(this.importedRecords, transferUiState.importedRecords) && Intrinsics.areEqual(this.importDetail, transferUiState.importDetail) && this.importConfirmEventId == transferUiState.importConfirmEventId && this.saveSuccess == transferUiState.saveSuccess && Intrinsics.areEqual(this.saveMessage, transferUiState.saveMessage) && Intrinsics.areEqual(this.error, transferUiState.error) && this.errorEventId == transferUiState.errorEventId && Intrinsics.areEqual(this.sportData, transferUiState.sportData) && Intrinsics.areEqual(this.importFileName, transferUiState.importFileName) && Intrinsics.areEqual(this.importFileSize, transferUiState.importFileSize) && this.exportComplete == transferUiState.exportComplete && this.selectedExportType == transferUiState.selectedExportType;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final File getExportedFile() {
        return this.exportedFile;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getImportConfirmEventId() {
        return this.importConfirmEventId;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final ImportResultDetail getImportDetail() {
        return this.importDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v42 */
    public int hashCode() {
        boolean z = this.isLoading;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((r0 * 31) + Float.hashCode(this.progress)) * 31;
        File file = this.exportedFile;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        List<OneTimeSport> list = this.importedRecords;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ImportResultDetail importResultDetail = this.importDetail;
        int iHashCode4 = (((iHashCode3 + (importResultDetail == null ? 0 : importResultDetail.hashCode())) * 31) + Integer.hashCode(this.importConfirmEventId)) * 31;
        boolean z2 = this.saveSuccess;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i = (iHashCode4 + r2) * 31;
        String str = this.saveMessage;
        int iHashCode5 = (i + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.error;
        int iHashCode6 = (((iHashCode5 + (th == null ? 0 : th.hashCode())) * 31) + Integer.hashCode(this.errorEventId)) * 31;
        OneTimeSport oneTimeSport = this.sportData;
        int iHashCode7 = (iHashCode6 + (oneTimeSport == null ? 0 : oneTimeSport.hashCode())) * 31;
        String str2 = this.importFileName;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.importFileSize;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z3 = this.exportComplete;
        int i2 = (iHashCode9 + (z3 ? 1 : z3)) * 31;
        TransferType transferType = this.selectedExportType;
        return i2 + (transferType != null ? transferType.hashCode() : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getImportFileName() {
        return this.importFileName;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getImportFileSize() {
        return this.importFileSize;
    }

    @Nullable
    public final List<OneTimeSport> k() {
        return this.importedRecords;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getSaveSuccess() {
        return this.saveSuccess;
    }

    @Nullable
    /* JADX INFO: renamed from: n, reason: from getter */
    public final TransferType getSelectedExportType() {
        return this.selectedExportType;
    }

    @Nullable
    /* JADX INFO: renamed from: o, reason: from getter */
    public final OneTimeSport getSportData() {
        return this.sportData;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @NotNull
    public String toString() {
        return "TransferUiState(isLoading=" + this.isLoading + ", progress=" + this.progress + ", exportedFile=" + this.exportedFile + ", importedRecords=" + this.importedRecords + ", importDetail=" + this.importDetail + ", importConfirmEventId=" + this.importConfirmEventId + ", saveSuccess=" + this.saveSuccess + ", saveMessage=" + this.saveMessage + ", error=" + this.error + ", errorEventId=" + this.errorEventId + ", sportData=" + this.sportData + ", importFileName=" + this.importFileName + ", importFileSize=" + this.importFileSize + ", exportComplete=" + this.exportComplete + ", selectedExportType=" + this.selectedExportType + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransferUiState(boolean z, float f, @Nullable File file, @Nullable List<? extends OneTimeSport> list, @Nullable ImportResultDetail importResultDetail, int i, boolean z2, @Nullable String str, @Nullable Throwable th, int i2, @Nullable OneTimeSport oneTimeSport, @Nullable String str2, @Nullable String str3, boolean z3, @Nullable TransferType transferType) {
        this.isLoading = z;
        this.progress = f;
        this.exportedFile = file;
        this.importedRecords = list;
        this.importDetail = importResultDetail;
        this.importConfirmEventId = i;
        this.saveSuccess = z2;
        this.saveMessage = str;
        this.error = th;
        this.errorEventId = i2;
        this.sportData = oneTimeSport;
        this.importFileName = str2;
        this.importFileSize = str3;
        this.exportComplete = z3;
        this.selectedExportType = transferType;
    }

    public /* synthetic */ TransferUiState(boolean z, float f, File file, List list, ImportResultDetail importResultDetail, int i, boolean z2, String str, Throwable th, int i2, OneTimeSport oneTimeSport, String str2, String str3, boolean z3, TransferType transferType, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0.0f : f, (i3 & 4) != 0 ? null : file, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : importResultDetail, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? null : str, (i3 & 256) != 0 ? null : th, (i3 & 512) != 0 ? 0 : i2, (i3 & 1024) != 0 ? null : oneTimeSport, (i3 & 2048) != 0 ? null : str2, (i3 & 4096) != 0 ? null : str3, (i3 & 8192) != 0 ? false : z3, (i3 & 16384) == 0 ? transferType : null);
    }
}
