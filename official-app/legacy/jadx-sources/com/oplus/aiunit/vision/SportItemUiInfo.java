package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.bei, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b7\u00108Jº\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b%\u0010-R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b.\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b/\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010\u001c\u001a\u0004\b+\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b'\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b0\u00104\u001a\u0004\b2\u00105R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b6\u00105R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b3\u0010\u001e¨\u00069"}, d2 = {"Lcom/oplus/aiunit/vision/bei;", "", "", SpeechConstant.KEY_RECORD_ID, "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "sportName", "imageId", "", "startTime", "deviceImageId", "sportValue", "itemName", "sportDuration", "highLevelValue", "highLevelImage", SportSummaryBean.CALORIES, "", "showBestIcon", "isRepeatRecord", "runItemName", "sourceDesc", "a", "(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)Lcom/oplus/aiunit/vision/bei;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "b", "I", "n", "()I", "c", "o", "d", b2n.f, MapSchema.FIELD_NAME_ENTRY, "J", "q", "()J", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", LogFieldKey.PROCESS_NAME_KEY, b2n.g, LogFieldKey.MESSAGE_KEY, "j", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "Z", "()Z", "r", "<init>", "(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportItemUiInfo {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String recordId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int sportMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final String sportName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int imageId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer deviceImageId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final String sportValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    public final String itemName;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final String sportDuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String highLevelValue;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    public final Integer highLevelImage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String calories;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    public final boolean showBestIcon;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isRepeatRecord;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @NotNull
    public final String runItemName;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @Nullable
    public final String sourceDesc;

    public SportItemUiInfo(@NotNull String recordId, int i, @NotNull String sportName, int i2, long j2, @Nullable Integer num, @NotNull String sportValue, @NotNull String itemName, @NotNull String sportDuration, @Nullable String str, @Nullable Integer num2, @Nullable String str2, boolean z, boolean z2, @NotNull String runItemName, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(sportValue, "sportValue");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(sportDuration, "sportDuration");
        Intrinsics.checkNotNullParameter(runItemName, "runItemName");
        this.recordId = recordId;
        this.sportMode = i;
        this.sportName = sportName;
        this.imageId = i2;
        this.startTime = j2;
        this.deviceImageId = num;
        this.sportValue = sportValue;
        this.itemName = itemName;
        this.sportDuration = sportDuration;
        this.highLevelValue = str;
        this.highLevelImage = num2;
        this.calories = str2;
        this.showBestIcon = z;
        this.isRepeatRecord = z2;
        this.runItemName = runItemName;
        this.sourceDesc = str3;
    }

    @NotNull
    public final SportItemUiInfo a(@NotNull String recordId, int sportMode, @NotNull String sportName, int imageId, long startTime, @Nullable Integer deviceImageId, @NotNull String sportValue, @NotNull String itemName, @NotNull String sportDuration, @Nullable String highLevelValue, @Nullable Integer highLevelImage, @Nullable String calories, boolean showBestIcon, boolean isRepeatRecord, @NotNull String runItemName, @Nullable String sourceDesc) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        Intrinsics.checkNotNullParameter(sportName, "sportName");
        Intrinsics.checkNotNullParameter(sportValue, "sportValue");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(sportDuration, "sportDuration");
        Intrinsics.checkNotNullParameter(runItemName, "runItemName");
        return new SportItemUiInfo(recordId, sportMode, sportName, imageId, startTime, deviceImageId, sportValue, itemName, sportDuration, highLevelValue, highLevelImage, calories, showBestIcon, isRepeatRecord, runItemName, sourceDesc);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCalories() {
        return this.calories;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getDeviceImageId() {
        return this.deviceImageId;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getHighLevelImage() {
        return this.highLevelImage;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportItemUiInfo)) {
            return false;
        }
        SportItemUiInfo sportItemUiInfo = (SportItemUiInfo) other;
        return Intrinsics.areEqual(this.recordId, sportItemUiInfo.recordId) && this.sportMode == sportItemUiInfo.sportMode && Intrinsics.areEqual(this.sportName, sportItemUiInfo.sportName) && this.imageId == sportItemUiInfo.imageId && this.startTime == sportItemUiInfo.startTime && Intrinsics.areEqual(this.deviceImageId, sportItemUiInfo.deviceImageId) && Intrinsics.areEqual(this.sportValue, sportItemUiInfo.sportValue) && Intrinsics.areEqual(this.itemName, sportItemUiInfo.itemName) && Intrinsics.areEqual(this.sportDuration, sportItemUiInfo.sportDuration) && Intrinsics.areEqual(this.highLevelValue, sportItemUiInfo.highLevelValue) && Intrinsics.areEqual(this.highLevelImage, sportItemUiInfo.highLevelImage) && Intrinsics.areEqual(this.calories, sportItemUiInfo.calories) && this.showBestIcon == sportItemUiInfo.showBestIcon && this.isRepeatRecord == sportItemUiInfo.isRepeatRecord && Intrinsics.areEqual(this.runItemName, sportItemUiInfo.runItemName) && Intrinsics.areEqual(this.sourceDesc, sportItemUiInfo.sourceDesc);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getHighLevelValue() {
        return this.highLevelValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getImageId() {
        return this.imageId;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = ((((((((this.recordId.hashCode() * 31) + Integer.hashCode(this.sportMode)) * 31) + this.sportName.hashCode()) * 31) + Integer.hashCode(this.imageId)) * 31) + Long.hashCode(this.startTime)) * 31;
        Integer num = this.deviceImageId;
        int iHashCode2 = (((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.sportValue.hashCode()) * 31) + this.itemName.hashCode()) * 31) + this.sportDuration.hashCode()) * 31;
        String str = this.highLevelValue;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.highLevelImage;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.calories;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.showBestIcon;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode5 + r1) * 31;
        boolean z2 = this.isRepeatRecord;
        int iHashCode6 = (((i + (z2 ? 1 : z2)) * 31) + this.runItemName.hashCode()) * 31;
        String str3 = this.sourceDesc;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getRunItemName() {
        return this.runItemName;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getShowBestIcon() {
        return this.showBestIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSourceDesc() {
        return this.sourceDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSportDuration() {
        return this.sportDuration;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    @NotNull
    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getSportValue() {
        return this.sportValue;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsRepeatRecord() {
        return this.isRepeatRecord;
    }

    @NotNull
    public String toString() {
        return "SportItemUiInfo(recordId=" + this.recordId + ", sportMode=" + this.sportMode + ", sportName=" + this.sportName + ", imageId=" + this.imageId + ", startTime=" + this.startTime + ", deviceImageId=" + this.deviceImageId + ", sportValue=" + this.sportValue + ", itemName=" + this.itemName + ", sportDuration=" + this.sportDuration + ", highLevelValue=" + this.highLevelValue + ", highLevelImage=" + this.highLevelImage + ", calories=" + this.calories + ", showBestIcon=" + this.showBestIcon + ", isRepeatRecord=" + this.isRepeatRecord + ", runItemName=" + this.runItemName + ", sourceDesc=" + this.sourceDesc + ")";
    }
}
