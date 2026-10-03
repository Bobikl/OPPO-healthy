package com.heytap.sporthealth.fit.dtrain.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Parcelize
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\bO\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010D\u001a\u00020\bHÆ\u0003J\t\u0010E\u001a\u00020\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\bHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jß\u0001\u0010U\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010V\u001a\u00020\bHÖ\u0001J\u0013\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010ZHÖ\u0003J\u0006\u0010[\u001a\u00020\bJ\t\u0010\\\u001a\u00020\bHÖ\u0001J\t\u0010]\u001a\u00020\u0003HÖ\u0001J\u0019\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0019\"\u0004\b3\u0010\u001bR\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u001d\"\u0004\b7\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\u001bR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001f¨\u0006c"}, d2 = {"Lcom/heytap/sporthealth/fit/dtrain/bean/TrainData;", "Landroid/os/Parcelable;", "name", "", RunningPostureVideoActivity.VIDEO_PATH, "videoPath", "imageUrl", "videoSize", "", "videoState", "videoProgress", "imageUrlRecord", "imageUrlShare", "imageUrlThumb", "trainDuration", "difficultyLevel", "calorie", "courseId", "trainType", "userId", "schemeType", "schemeName", "fitActionRecords", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCalorie", "()I", "setCalorie", "(I)V", "getCourseId", "()Ljava/lang/String;", "setCourseId", "(Ljava/lang/String;)V", "getDifficultyLevel", "setDifficultyLevel", "getFitActionRecords", "setFitActionRecords", "getImageUrl", "setImageUrl", "getImageUrlRecord", "setImageUrlRecord", "getImageUrlShare", "setImageUrlShare", "getImageUrlThumb", "setImageUrlThumb", "getName", "setName", "getSchemeName", "setSchemeName", "getSchemeType", "setSchemeType", "getTrainDuration", "setTrainDuration", "getTrainType", "setTrainType", "getUserId", "setUserId", "getVideoPath", "setVideoPath", "getVideoProgress", "setVideoProgress", "getVideoSize", "setVideoSize", "getVideoState", "setVideoState", "getVideoUrl", "setVideoUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "getVideoSizeByte", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "fitness_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TrainData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrainData> CREATOR = new a();
    private int calorie;

    @Nullable
    private String courseId;
    private int difficultyLevel;

    @Nullable
    private String fitActionRecords;

    @Nullable
    private String imageUrl;

    @Nullable
    private String imageUrlRecord;

    @Nullable
    private String imageUrlShare;

    @Nullable
    private String imageUrlThumb;

    @Nullable
    private String name;

    @Nullable
    private String schemeName;

    @Nullable
    private String schemeType;
    private int trainDuration;
    private int trainType;

    @Nullable
    private String userId;

    @Nullable
    private String videoPath;
    private int videoProgress;
    private int videoSize;
    private int videoState;

    @Nullable
    private String videoUrl;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrainData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrainData createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrainData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TrainData[] newArray(int i) {
            return new TrainData[i];
        }
    }

    public TrainData() {
        this(null, null, null, null, 0, 0, 0, null, null, null, 0, 0, 0, null, 0, null, null, null, null, 524287, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getImageUrlThumb() {
        return this.imageUrlThumb;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getTrainDuration() {
        return this.trainDuration;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getCalorie() {
        return this.calorie;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getTrainType() {
        return this.trainType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSchemeType() {
        return this.schemeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getSchemeName() {
        return this.schemeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getFitActionRecords() {
        return this.fitActionRecords;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVideoPath() {
        return this.videoPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getVideoSize() {
        return this.videoSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getVideoState() {
        return this.videoState;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getVideoProgress() {
        return this.videoProgress;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getImageUrlRecord() {
        return this.imageUrlRecord;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getImageUrlShare() {
        return this.imageUrlShare;
    }

    @NotNull
    public final TrainData copy(@Nullable String name, @Nullable String videoUrl, @Nullable String videoPath, @Nullable String imageUrl, int videoSize, int videoState, int videoProgress, @Nullable String imageUrlRecord, @Nullable String imageUrlShare, @Nullable String imageUrlThumb, int trainDuration, int difficultyLevel, int calorie, @Nullable String courseId, int trainType, @Nullable String userId, @Nullable String schemeType, @Nullable String schemeName, @Nullable String fitActionRecords) {
        return new TrainData(name, videoUrl, videoPath, imageUrl, videoSize, videoState, videoProgress, imageUrlRecord, imageUrlShare, imageUrlThumb, trainDuration, difficultyLevel, calorie, courseId, trainType, userId, schemeType, schemeName, fitActionRecords);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainData)) {
            return false;
        }
        TrainData trainData = (TrainData) other;
        return Intrinsics.areEqual(this.name, trainData.name) && Intrinsics.areEqual(this.videoUrl, trainData.videoUrl) && Intrinsics.areEqual(this.videoPath, trainData.videoPath) && Intrinsics.areEqual(this.imageUrl, trainData.imageUrl) && this.videoSize == trainData.videoSize && this.videoState == trainData.videoState && this.videoProgress == trainData.videoProgress && Intrinsics.areEqual(this.imageUrlRecord, trainData.imageUrlRecord) && Intrinsics.areEqual(this.imageUrlShare, trainData.imageUrlShare) && Intrinsics.areEqual(this.imageUrlThumb, trainData.imageUrlThumb) && this.trainDuration == trainData.trainDuration && this.difficultyLevel == trainData.difficultyLevel && this.calorie == trainData.calorie && Intrinsics.areEqual(this.courseId, trainData.courseId) && this.trainType == trainData.trainType && Intrinsics.areEqual(this.userId, trainData.userId) && Intrinsics.areEqual(this.schemeType, trainData.schemeType) && Intrinsics.areEqual(this.schemeName, trainData.schemeName) && Intrinsics.areEqual(this.fitActionRecords, trainData.fitActionRecords);
    }

    public final int getCalorie() {
        return this.calorie;
    }

    @Nullable
    public final String getCourseId() {
        return this.courseId;
    }

    public final int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    @Nullable
    public final String getFitActionRecords() {
        return this.fitActionRecords;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getImageUrlRecord() {
        return this.imageUrlRecord;
    }

    @Nullable
    public final String getImageUrlShare() {
        return this.imageUrlShare;
    }

    @Nullable
    public final String getImageUrlThumb() {
        return this.imageUrlThumb;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSchemeName() {
        return this.schemeName;
    }

    @Nullable
    public final String getSchemeType() {
        return this.schemeType;
    }

    public final int getTrainDuration() {
        return this.trainDuration;
    }

    public final int getTrainType() {
        return this.trainType;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getVideoPath() {
        return this.videoPath;
    }

    public final int getVideoProgress() {
        return this.videoProgress;
    }

    public final int getVideoSize() {
        return this.videoSize;
    }

    public final int getVideoSizeByte() {
        return this.videoSize * 1000;
    }

    public final int getVideoState() {
        return this.videoState;
    }

    @Nullable
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.videoUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.videoPath;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.imageUrl;
        int iHashCode4 = (((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.videoSize)) * 31) + Integer.hashCode(this.videoState)) * 31) + Integer.hashCode(this.videoProgress)) * 31;
        String str5 = this.imageUrlRecord;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.imageUrlShare;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.imageUrlThumb;
        int iHashCode7 = (((((((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.trainDuration)) * 31) + Integer.hashCode(this.difficultyLevel)) * 31) + Integer.hashCode(this.calorie)) * 31;
        String str8 = this.courseId;
        int iHashCode8 = (((iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.trainType)) * 31;
        String str9 = this.userId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.schemeType;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.schemeName;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.fitActionRecords;
        return iHashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    public final void setCalorie(int i) {
        this.calorie = i;
    }

    public final void setCourseId(@Nullable String str) {
        this.courseId = str;
    }

    public final void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public final void setFitActionRecords(@Nullable String str) {
        this.fitActionRecords = str;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setImageUrlRecord(@Nullable String str) {
        this.imageUrlRecord = str;
    }

    public final void setImageUrlShare(@Nullable String str) {
        this.imageUrlShare = str;
    }

    public final void setImageUrlThumb(@Nullable String str) {
        this.imageUrlThumb = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSchemeName(@Nullable String str) {
        this.schemeName = str;
    }

    public final void setSchemeType(@Nullable String str) {
        this.schemeType = str;
    }

    public final void setTrainDuration(int i) {
        this.trainDuration = i;
    }

    public final void setTrainType(int i) {
        this.trainType = i;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    public final void setVideoPath(@Nullable String str) {
        this.videoPath = str;
    }

    public final void setVideoProgress(int i) {
        this.videoProgress = i;
    }

    public final void setVideoSize(int i) {
        this.videoSize = i;
    }

    public final void setVideoState(int i) {
        this.videoState = i;
    }

    public final void setVideoUrl(@Nullable String str) {
        this.videoUrl = str;
    }

    @NotNull
    public String toString() {
        return "TrainData(name=" + this.name + ", videoUrl=" + this.videoUrl + ", videoPath=" + this.videoPath + ", imageUrl=" + this.imageUrl + ", videoSize=" + this.videoSize + ", videoState=" + this.videoState + ", videoProgress=" + this.videoProgress + ", imageUrlRecord=" + this.imageUrlRecord + ", imageUrlShare=" + this.imageUrlShare + ", imageUrlThumb=" + this.imageUrlThumb + ", trainDuration=" + this.trainDuration + ", difficultyLevel=" + this.difficultyLevel + ", calorie=" + this.calorie + ", courseId=" + this.courseId + ", trainType=" + this.trainType + ", userId=" + this.userId + ", schemeType=" + this.schemeType + ", schemeName=" + this.schemeName + ", fitActionRecords=" + this.fitActionRecords + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.videoPath);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.videoSize);
        parcel.writeInt(this.videoState);
        parcel.writeInt(this.videoProgress);
        parcel.writeString(this.imageUrlRecord);
        parcel.writeString(this.imageUrlShare);
        parcel.writeString(this.imageUrlThumb);
        parcel.writeInt(this.trainDuration);
        parcel.writeInt(this.difficultyLevel);
        parcel.writeInt(this.calorie);
        parcel.writeString(this.courseId);
        parcel.writeInt(this.trainType);
        parcel.writeString(this.userId);
        parcel.writeString(this.schemeType);
        parcel.writeString(this.schemeName);
        parcel.writeString(this.fitActionRecords);
    }

    public TrainData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, @Nullable String str5, @Nullable String str6, @Nullable String str7, int i4, int i5, int i6, @Nullable String str8, int i7, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12) {
        this.name = str;
        this.videoUrl = str2;
        this.videoPath = str3;
        this.imageUrl = str4;
        this.videoSize = i;
        this.videoState = i2;
        this.videoProgress = i3;
        this.imageUrlRecord = str5;
        this.imageUrlShare = str6;
        this.imageUrlThumb = str7;
        this.trainDuration = i4;
        this.difficultyLevel = i5;
        this.calorie = i6;
        this.courseId = str8;
        this.trainType = i7;
        this.userId = str9;
        this.schemeType = str10;
        this.schemeName = str11;
        this.fitActionRecords = str12;
    }

    public /* synthetic */ TrainData(String str, String str2, String str3, String str4, int i, int i2, int i3, String str5, String str6, String str7, int i4, int i5, int i6, String str8, int i7, String str9, String str10, String str11, String str12, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : str4, (i8 & 16) != 0 ? 0 : i, (i8 & 32) != 0 ? 0 : i2, (i8 & 64) != 0 ? 0 : i3, (i8 & 128) != 0 ? null : str5, (i8 & 256) != 0 ? null : str6, (i8 & 512) != 0 ? null : str7, (i8 & 1024) != 0 ? 0 : i4, (i8 & 2048) != 0 ? 0 : i5, (i8 & 4096) != 0 ? 0 : i6, (i8 & 8192) != 0 ? null : str8, (i8 & 16384) != 0 ? 0 : i7, (i8 & 32768) != 0 ? null : str9, (i8 & 65536) != 0 ? null : str10, (i8 & 131072) != 0 ? null : str11, (i8 & 262144) != 0 ? null : str12);
    }
}
