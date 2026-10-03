package com.heytap.databaseengine.model.exerciseload;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\bF\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003Bµ\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0002\u0010\u0018J\t\u0010A\u001a\u00020\u0005HÂ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010C\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010E\u001a\u00020\tHÆ\u0003J\t\u0010F\u001a\u00020\u000bHÆ\u0003J\t\u0010G\u001a\u00020\u000bHÆ\u0003J\t\u0010H\u001a\u00020\u000bHÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010K\u001a\u00020\tHÂ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010M\u001a\u00020\u000bHÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010=J\u0010\u0010O\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010P\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ¾\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010RJ\t\u0010S\u001a\u00020\u000bHÖ\u0001J\u0013\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\b\u0010X\u001a\u00020\u0005H\u0016J\b\u0010Y\u001a\u00020\tH\u0016J\b\u0010Z\u001a\u00020\u0005H\u0016J\b\u0010[\u001a\u00020\tH\u0016J\t\u0010\\\u001a\u00020\u000bHÖ\u0001J\u000e\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u0005J\u000e\u0010`\u001a\u00020^2\u0006\u0010a\u001a\u00020\tJ\b\u0010b\u001a\u00020\u0005H\u0016J\u0019\u0010c\u001a\u00020^2\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\u001a\u0010\u0015\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R\u001a\u0010\u0014\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010@\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006g"}, d2 = {"Lcom/heytap/databaseengine/model/exerciseload/ExerciseIntensity;", "Lcom/heytap/databaseengine/model/SportHealthData;", "Landroid/os/Parcelable;", "()V", "ssoid", "", "dataClient", "clientModel", "startTimestamp", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "duration", "value", "", "rawExerciseIntensity", "algoExerciseLoad", "algoResult", "flashId", "modifySource", "updateTimestamp", "syncToDevice", "display", "syncStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;JIII)V", "getAlgoExerciseLoad", "()Ljava/lang/Integer;", "setAlgoExerciseLoad", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAlgoResult", "setAlgoResult", "getClientModel", "()Ljava/lang/String;", "setClientModel", "(Ljava/lang/String;)V", "getDataClient", "setDataClient", "getDisplay", "()I", "setDisplay", "(I)V", "getDuration", "setDuration", "getFlashId", "setFlashId", "getModifySource", "setModifySource", "getRawExerciseIntensity", "setRawExerciseIntensity", "getSportMode", "setSportMode", "getSyncStatus", "setSyncStatus", "getSyncToDevice", "setSyncToDevice", "getUpdateTimestamp", "()J", "setUpdateTimestamp", "(J)V", "getValue", "()Ljava/lang/Double;", "setValue", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;JIII)Lcom/heytap/databaseengine/model/exerciseload/ExerciseIntensity;", "describeContents", "equals", "", "other", "", "getDeviceUniqueId", "getEndTimestamp", "getSsoid", "getStartTimestamp", "hashCode", "setSsoid", "", "mSsoid", "setStartTimestamp", "mStartTimestamp", "toString", "writeToParcel", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ExerciseIntensity extends SportHealthData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExerciseIntensity> CREATOR = new a();

    @Nullable
    private Integer algoExerciseLoad;

    @Nullable
    private Integer algoResult;

    @Nullable
    private String clientModel;

    @NotNull
    private String dataClient;
    private int display;
    private int duration;

    @Nullable
    private Integer flashId;

    @Nullable
    private Integer modifySource;

    @Nullable
    private Integer rawExerciseIntensity;

    @Nullable
    private Integer sportMode;

    @NotNull
    private String ssoid;
    private long startTimestamp;
    private int syncStatus;
    private int syncToDevice;
    private long updateTimestamp;

    @Nullable
    private Double value;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExerciseIntensity> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExerciseIntensity createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExerciseIntensity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ExerciseIntensity[] newArray(int i) {
            return new ExerciseIntensity[i];
        }
    }

    public /* synthetic */ ExerciseIntensity(String str, String str2, String str3, long j2, Integer num, int i, Double d, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, long j3, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) == 0 ? str2 : "", (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? 0L : j2, (i5 & 16) != 0 ? null : num, (i5 & 32) != 0 ? 0 : i, (i5 & 64) != 0 ? null : d, (i5 & 128) != 0 ? null : num2, (i5 & 256) != 0 ? null : num3, (i5 & 512) != 0 ? null : num4, (i5 & 1024) != 0 ? null : num5, (i5 & 2048) != 0 ? null : num6, (i5 & 4096) != 0 ? 0L : j3, (i5 & 8192) != 0 ? 0 : i2, (i5 & 16384) != 0 ? 1 : i3, (i5 & 32768) != 0 ? 0 : i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getAlgoResult() {
        return this.algoResult;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getFlashId() {
        return this.flashId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getModifySource() {
        return this.modifySource;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSyncToDevice() {
        return this.syncToDevice;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getClientModel() {
        return this.clientModel;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSportMode() {
        return this.sportMode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getRawExerciseIntensity() {
        return this.rawExerciseIntensity;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getAlgoExerciseLoad() {
        return this.algoExerciseLoad;
    }

    @NotNull
    public final ExerciseIntensity copy(@NotNull String ssoid, @NotNull String dataClient, @Nullable String clientModel, long startTimestamp, @Nullable Integer sportMode, int duration, @Nullable Double value, @Nullable Integer rawExerciseIntensity, @Nullable Integer algoExerciseLoad, @Nullable Integer algoResult, @Nullable Integer flashId, @Nullable Integer modifySource, long updateTimestamp, int syncToDevice, int display, int syncStatus) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new ExerciseIntensity(ssoid, dataClient, clientModel, startTimestamp, sportMode, duration, value, rawExerciseIntensity, algoExerciseLoad, algoResult, flashId, modifySource, updateTimestamp, syncToDevice, display, syncStatus);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseIntensity)) {
            return false;
        }
        ExerciseIntensity exerciseIntensity = (ExerciseIntensity) other;
        return Intrinsics.areEqual(this.ssoid, exerciseIntensity.ssoid) && Intrinsics.areEqual(this.dataClient, exerciseIntensity.dataClient) && Intrinsics.areEqual(this.clientModel, exerciseIntensity.clientModel) && this.startTimestamp == exerciseIntensity.startTimestamp && Intrinsics.areEqual(this.sportMode, exerciseIntensity.sportMode) && this.duration == exerciseIntensity.duration && Intrinsics.areEqual((Object) this.value, (Object) exerciseIntensity.value) && Intrinsics.areEqual(this.rawExerciseIntensity, exerciseIntensity.rawExerciseIntensity) && Intrinsics.areEqual(this.algoExerciseLoad, exerciseIntensity.algoExerciseLoad) && Intrinsics.areEqual(this.algoResult, exerciseIntensity.algoResult) && Intrinsics.areEqual(this.flashId, exerciseIntensity.flashId) && Intrinsics.areEqual(this.modifySource, exerciseIntensity.modifySource) && this.updateTimestamp == exerciseIntensity.updateTimestamp && this.syncToDevice == exerciseIntensity.syncToDevice && this.display == exerciseIntensity.display && this.syncStatus == exerciseIntensity.syncStatus;
    }

    @Nullable
    public final Integer getAlgoExerciseLoad() {
        return this.algoExerciseLoad;
    }

    @Nullable
    public final Integer getAlgoResult() {
        return this.algoResult;
    }

    @Nullable
    public final String getClientModel() {
        return this.clientModel;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getDeviceUniqueId() {
        return this.dataClient;
    }

    public final int getDisplay() {
        return this.display;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getEndTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public final Integer getFlashId() {
        return this.flashId;
    }

    @Nullable
    public final Integer getModifySource() {
        return this.modifySource;
    }

    @Nullable
    public final Integer getRawExerciseIntensity() {
        return this.rawExerciseIntensity;
    }

    @Nullable
    public final Integer getSportMode() {
        return this.sportMode;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String getSsoid() {
        return this.ssoid;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    public long getStartTimestamp() {
        return this.startTimestamp;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final int getSyncToDevice() {
        return this.syncToDevice;
    }

    public final long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    @Nullable
    public final Double getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = ((this.ssoid.hashCode() * 31) + this.dataClient.hashCode()) * 31;
        String str = this.clientModel;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.startTimestamp)) * 31;
        Integer num = this.sportMode;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.duration)) * 31;
        Double d = this.value;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.rawExerciseIntensity;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.algoExerciseLoad;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.algoResult;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.flashId;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.modifySource;
        return ((((((((iHashCode8 + (num6 != null ? num6.hashCode() : 0)) * 31) + Long.hashCode(this.updateTimestamp)) * 31) + Integer.hashCode(this.syncToDevice)) * 31) + Integer.hashCode(this.display)) * 31) + Integer.hashCode(this.syncStatus);
    }

    public final void setAlgoExerciseLoad(@Nullable Integer num) {
        this.algoExerciseLoad = num;
    }

    public final void setAlgoResult(@Nullable Integer num) {
        this.algoResult = num;
    }

    public final void setClientModel(@Nullable String str) {
        this.clientModel = str;
    }

    public final void setDataClient(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public final void setDisplay(int i) {
        this.display = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setFlashId(@Nullable Integer num) {
        this.flashId = num;
    }

    public final void setModifySource(@Nullable Integer num) {
        this.modifySource = num;
    }

    public final void setRawExerciseIntensity(@Nullable Integer num) {
        this.rawExerciseIntensity = num;
    }

    public final void setSportMode(@Nullable Integer num) {
        this.sportMode = num;
    }

    public final void setSsoid(@NotNull String mSsoid) {
        Intrinsics.checkNotNullParameter(mSsoid, "mSsoid");
        this.ssoid = mSsoid;
    }

    public final void setStartTimestamp(long mStartTimestamp) {
        this.startTimestamp = mStartTimestamp;
    }

    public final void setSyncStatus(int i) {
        this.syncStatus = i;
    }

    public final void setSyncToDevice(int i) {
        this.syncToDevice = i;
    }

    public final void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    public final void setValue(@Nullable Double d) {
        this.value = d;
    }

    @Override // com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "ExerciseIntensity(ssoid='" + this.ssoid + "', dataClient='" + this.dataClient + "', clientModel=" + this.clientModel + ", startTimestamp=" + this.startTimestamp + ", sportMode=" + this.sportMode + ", duration=" + this.duration + ", value=" + this.value + ", rawExerciseIntensity=" + this.rawExerciseIntensity + ", algoExerciseLoad=" + this.algoExerciseLoad + ", algoResult=" + this.algoResult + ", flashId=" + this.flashId + ", modifySource=" + this.modifySource + ", updateTimestamp=" + this.updateTimestamp + ", syncToDevice=" + this.syncToDevice + ", display=" + this.display + ", syncStatus=" + this.syncStatus + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.ssoid);
        parcel.writeString(this.dataClient);
        parcel.writeString(this.clientModel);
        parcel.writeLong(this.startTimestamp);
        Integer num = this.sportMode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeInt(this.duration);
        Double d = this.value;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        Integer num2 = this.rawExerciseIntensity;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.algoExerciseLoad;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.algoResult;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.flashId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.modifySource;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeLong(this.updateTimestamp);
        parcel.writeInt(this.syncToDevice);
        parcel.writeInt(this.display);
        parcel.writeInt(this.syncStatus);
    }

    public ExerciseIntensity(@NotNull String ssoid, @NotNull String dataClient, @Nullable String str, long j2, @Nullable Integer num, int i, @Nullable Double d, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, long j3, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.ssoid = ssoid;
        this.dataClient = dataClient;
        this.clientModel = str;
        this.startTimestamp = j2;
        this.sportMode = num;
        this.duration = i;
        this.value = d;
        this.rawExerciseIntensity = num2;
        this.algoExerciseLoad = num3;
        this.algoResult = num4;
        this.flashId = num5;
        this.modifySource = num6;
        this.updateTimestamp = j3;
        this.syncToDevice = i2;
        this.display = i3;
        this.syncStatus = i4;
    }

    public ExerciseIntensity() {
        this("", "", null, 0L, 0, 0, null, null, null, null, null, null, 0L, 0, 1, 0);
    }
}
