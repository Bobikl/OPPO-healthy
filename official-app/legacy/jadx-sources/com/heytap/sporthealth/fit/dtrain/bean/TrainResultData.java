package com.heytap.sporthealth.fit.dtrain.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Parcelize
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\bT\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e¢\u0006\u0002\u0010\u001fJ\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u000bHÆ\u0003J\t\u0010Z\u001a\u00020\u000bHÆ\u0003J\t\u0010[\u001a\u00020\u000bHÆ\u0003J\t\u0010\\\u001a\u00020\u000bHÆ\u0003J\t\u0010]\u001a\u00020\u000bHÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u000bHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u000bHÆ\u0003J\t\u0010e\u001a\u00020\u000bHÆ\u0003J\t\u0010f\u001a\u00020\u000bHÆ\u0003J\t\u0010g\u001a\u00020\u001eHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010j\u001a\u00020\bHÆ\u0003J\t\u0010k\u001a\u00020\bHÆ\u0003J\t\u0010l\u001a\u00020\u000bHÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0089\u0002\u0010o\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u001eHÆ\u0001J\t\u0010p\u001a\u00020\u000bHÖ\u0001J\u0013\u0010q\u001a\u00020\u001e2\b\u0010r\u001a\u0004\u0018\u00010sHÖ\u0003J\t\u0010t\u001a\u00020\u000bHÖ\u0001J\t\u0010u\u001a\u00020\u0003HÖ\u0001J\u0019\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020y2\u0006\u0010z\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0012\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001a\u0010\u001a\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u001a\u0010\u0017\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010!\"\u0004\b/\u0010#R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010\u001b\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010!\"\u0004\b5\u0010#R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010%\"\u0004\b9\u0010'R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010%\"\u0004\b;\u0010'R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010%\"\u0004\b=\u0010'R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010%\"\u0004\bC\u0010'R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010%\"\u0004\bE\u0010'R\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010!\"\u0004\bG\u0010#R\u001a\u0010\u000f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010!\"\u0004\bI\u0010#R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010K\"\u0004\bO\u0010MR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010!\"\u0004\bQ\u0010#R\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010!\"\u0004\bS\u0010#R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010!\"\u0004\bU\u0010#R\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010!\"\u0004\bW\u0010#¨\u0006{"}, d2 = {"Lcom/heytap/sporthealth/fit/dtrain/bean/TrainResultData;", "Landroid/os/Parcelable;", "imageUrlRecord", "", "imageUrlShare", "imageUrlThumb", SpeechConstant.KEY_RECORD_ID, "trainStartTime", "", "trainFinishTime", "trainType", "", "courseName", "courseId", "trainedDuration", "theoryDuration", "theoryCalorie", "trainedCalorie", "avgHeartRate", "lstHeartRates", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "lstActions", "difficultyLevel", "deviceType", "runExtra", "dataSource", "fitSourceType", "videoProgress", "effective", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;Ljava/lang/String;IIIIILjava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIIZ)V", "getAvgHeartRate", "()I", "setAvgHeartRate", "(I)V", "getCourseId", "()Ljava/lang/String;", "setCourseId", "(Ljava/lang/String;)V", "getCourseName", "setCourseName", "getDataSource", "setDataSource", "getDeviceType", "setDeviceType", "getDifficultyLevel", "setDifficultyLevel", "getEffective", "()Z", "setEffective", "(Z)V", "getFitSourceType", "setFitSourceType", "getImageUrlRecord", "setImageUrlRecord", "getImageUrlShare", "setImageUrlShare", "getImageUrlThumb", "setImageUrlThumb", "getLstActions", "setLstActions", "getLstHeartRates", "()Ljava/util/List;", "setLstHeartRates", "(Ljava/util/List;)V", "getRecordId", "setRecordId", "getRunExtra", "setRunExtra", "getTheoryCalorie", "setTheoryCalorie", "getTheoryDuration", "setTheoryDuration", "getTrainFinishTime", "()J", "setTrainFinishTime", "(J)V", "getTrainStartTime", "setTrainStartTime", "getTrainType", "setTrainType", "getTrainedCalorie", "setTrainedCalorie", "getTrainedDuration", "setTrainedDuration", "getVideoProgress", "setVideoProgress", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "fitness_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TrainResultData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TrainResultData> CREATOR = new a();
    private int avgHeartRate;

    @Nullable
    private String courseId;

    @Nullable
    private String courseName;
    private int dataSource;

    @Nullable
    private String deviceType;
    private int difficultyLevel;
    private transient boolean effective;
    private int fitSourceType;

    @Nullable
    private String imageUrlRecord;

    @Nullable
    private String imageUrlShare;

    @Nullable
    private String imageUrlThumb;

    @Nullable
    private String lstActions;

    @Nullable
    private List<? extends TimeStampedData> lstHeartRates;

    @Nullable
    private String recordId;

    @Nullable
    private String runExtra;
    private int theoryCalorie;
    private int theoryDuration;
    private long trainFinishTime;
    private long trainStartTime;
    private int trainType;
    private int trainedCalorie;
    private int trainedDuration;
    private transient int videoProgress;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrainResultData> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TrainResultData createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            long j2 = parcel.readLong();
            long j3 = parcel.readLong();
            int i = parcel.readInt();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i7 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i7);
                int i8 = 0;
                while (i8 != i7) {
                    arrayList2.add(parcel.readParcelable(TrainResultData.class.getClassLoader()));
                    i8++;
                    i7 = i7;
                }
                arrayList = arrayList2;
            }
            return new TrainResultData(string, string2, string3, string4, j2, j3, i, string5, string6, i2, i3, i4, i5, i6, arrayList, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TrainResultData[] newArray(int i) {
            return new TrainResultData[i];
        }
    }

    public TrainResultData() {
        this(null, null, null, null, 0L, 0L, 0, null, null, 0, 0, 0, 0, 0, null, null, 0, null, null, 0, 0, 0, false, 8388607, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrlRecord() {
        return this.imageUrlRecord;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTrainedDuration() {
        return this.trainedDuration;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getTheoryDuration() {
        return this.theoryDuration;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getTheoryCalorie() {
        return this.theoryCalorie;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getTrainedCalorie() {
        return this.trainedCalorie;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    @Nullable
    public final List<TimeStampedData> component15() {
        return this.lstHeartRates;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getLstActions() {
        return this.lstActions;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getRunExtra() {
        return this.runExtra;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrlShare() {
        return this.imageUrlShare;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getFitSourceType() {
        return this.fitSourceType;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getVideoProgress() {
        return this.videoProgress;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getEffective() {
        return this.effective;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrlThumb() {
        return this.imageUrlThumb;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getTrainStartTime() {
        return this.trainStartTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTrainFinishTime() {
        return this.trainFinishTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTrainType() {
        return this.trainType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCourseName() {
        return this.courseName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    @NotNull
    public final TrainResultData copy(@Nullable String imageUrlRecord, @Nullable String imageUrlShare, @Nullable String imageUrlThumb, @Nullable String recordId, long trainStartTime, long trainFinishTime, int trainType, @Nullable String courseName, @Nullable String courseId, int trainedDuration, int theoryDuration, int theoryCalorie, int trainedCalorie, int avgHeartRate, @Nullable List<? extends TimeStampedData> lstHeartRates, @Nullable String lstActions, int difficultyLevel, @Nullable String deviceType, @Nullable String runExtra, int dataSource, int fitSourceType, int videoProgress, boolean effective) {
        return new TrainResultData(imageUrlRecord, imageUrlShare, imageUrlThumb, recordId, trainStartTime, trainFinishTime, trainType, courseName, courseId, trainedDuration, theoryDuration, theoryCalorie, trainedCalorie, avgHeartRate, lstHeartRates, lstActions, difficultyLevel, deviceType, runExtra, dataSource, fitSourceType, videoProgress, effective);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainResultData)) {
            return false;
        }
        TrainResultData trainResultData = (TrainResultData) other;
        return Intrinsics.areEqual(this.imageUrlRecord, trainResultData.imageUrlRecord) && Intrinsics.areEqual(this.imageUrlShare, trainResultData.imageUrlShare) && Intrinsics.areEqual(this.imageUrlThumb, trainResultData.imageUrlThumb) && Intrinsics.areEqual(this.recordId, trainResultData.recordId) && this.trainStartTime == trainResultData.trainStartTime && this.trainFinishTime == trainResultData.trainFinishTime && this.trainType == trainResultData.trainType && Intrinsics.areEqual(this.courseName, trainResultData.courseName) && Intrinsics.areEqual(this.courseId, trainResultData.courseId) && this.trainedDuration == trainResultData.trainedDuration && this.theoryDuration == trainResultData.theoryDuration && this.theoryCalorie == trainResultData.theoryCalorie && this.trainedCalorie == trainResultData.trainedCalorie && this.avgHeartRate == trainResultData.avgHeartRate && Intrinsics.areEqual(this.lstHeartRates, trainResultData.lstHeartRates) && Intrinsics.areEqual(this.lstActions, trainResultData.lstActions) && this.difficultyLevel == trainResultData.difficultyLevel && Intrinsics.areEqual(this.deviceType, trainResultData.deviceType) && Intrinsics.areEqual(this.runExtra, trainResultData.runExtra) && this.dataSource == trainResultData.dataSource && this.fitSourceType == trainResultData.fitSourceType && this.videoProgress == trainResultData.videoProgress && this.effective == trainResultData.effective;
    }

    public final int getAvgHeartRate() {
        return this.avgHeartRate;
    }

    @Nullable
    public final String getCourseId() {
        return this.courseId;
    }

    @Nullable
    public final String getCourseName() {
        return this.courseName;
    }

    public final int getDataSource() {
        return this.dataSource;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public final boolean getEffective() {
        return this.effective;
    }

    public final int getFitSourceType() {
        return this.fitSourceType;
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
    public final String getLstActions() {
        return this.lstActions;
    }

    @Nullable
    public final List<TimeStampedData> getLstHeartRates() {
        return this.lstHeartRates;
    }

    @Nullable
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    public final String getRunExtra() {
        return this.runExtra;
    }

    public final int getTheoryCalorie() {
        return this.theoryCalorie;
    }

    public final int getTheoryDuration() {
        return this.theoryDuration;
    }

    public final long getTrainFinishTime() {
        return this.trainFinishTime;
    }

    public final long getTrainStartTime() {
        return this.trainStartTime;
    }

    public final int getTrainType() {
        return this.trainType;
    }

    public final int getTrainedCalorie() {
        return this.trainedCalorie;
    }

    public final int getTrainedDuration() {
        return this.trainedDuration;
    }

    public final int getVideoProgress() {
        return this.videoProgress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public int hashCode() {
        String str = this.imageUrlRecord;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrlShare;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrlThumb;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recordId;
        int iHashCode4 = (((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Long.hashCode(this.trainStartTime)) * 31) + Long.hashCode(this.trainFinishTime)) * 31) + Integer.hashCode(this.trainType)) * 31;
        String str5 = this.courseName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.courseId;
        int iHashCode6 = (((((((((((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.trainedDuration)) * 31) + Integer.hashCode(this.theoryDuration)) * 31) + Integer.hashCode(this.theoryCalorie)) * 31) + Integer.hashCode(this.trainedCalorie)) * 31) + Integer.hashCode(this.avgHeartRate)) * 31;
        List<? extends TimeStampedData> list = this.lstHeartRates;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.lstActions;
        int iHashCode8 = (((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Integer.hashCode(this.difficultyLevel)) * 31;
        String str8 = this.deviceType;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.runExtra;
        int iHashCode10 = (((((((iHashCode9 + (str9 != null ? str9.hashCode() : 0)) * 31) + Integer.hashCode(this.dataSource)) * 31) + Integer.hashCode(this.fitSourceType)) * 31) + Integer.hashCode(this.videoProgress)) * 31;
        boolean z = this.effective;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        return iHashCode10 + r4;
    }

    public final void setAvgHeartRate(int i) {
        this.avgHeartRate = i;
    }

    public final void setCourseId(@Nullable String str) {
        this.courseId = str;
    }

    public final void setCourseName(@Nullable String str) {
        this.courseName = str;
    }

    public final void setDataSource(int i) {
        this.dataSource = i;
    }

    public final void setDeviceType(@Nullable String str) {
        this.deviceType = str;
    }

    public final void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public final void setEffective(boolean z) {
        this.effective = z;
    }

    public final void setFitSourceType(int i) {
        this.fitSourceType = i;
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

    public final void setLstActions(@Nullable String str) {
        this.lstActions = str;
    }

    public final void setLstHeartRates(@Nullable List<? extends TimeStampedData> list) {
        this.lstHeartRates = list;
    }

    public final void setRecordId(@Nullable String str) {
        this.recordId = str;
    }

    public final void setRunExtra(@Nullable String str) {
        this.runExtra = str;
    }

    public final void setTheoryCalorie(int i) {
        this.theoryCalorie = i;
    }

    public final void setTheoryDuration(int i) {
        this.theoryDuration = i;
    }

    public final void setTrainFinishTime(long j2) {
        this.trainFinishTime = j2;
    }

    public final void setTrainStartTime(long j2) {
        this.trainStartTime = j2;
    }

    public final void setTrainType(int i) {
        this.trainType = i;
    }

    public final void setTrainedCalorie(int i) {
        this.trainedCalorie = i;
    }

    public final void setTrainedDuration(int i) {
        this.trainedDuration = i;
    }

    public final void setVideoProgress(int i) {
        this.videoProgress = i;
    }

    @NotNull
    public String toString() {
        return "TrainResultData(imageUrlRecord=" + this.imageUrlRecord + ", imageUrlShare=" + this.imageUrlShare + ", imageUrlThumb=" + this.imageUrlThumb + ", recordId=" + this.recordId + ", trainStartTime=" + this.trainStartTime + ", trainFinishTime=" + this.trainFinishTime + ", trainType=" + this.trainType + ", courseName=" + this.courseName + ", courseId=" + this.courseId + ", trainedDuration=" + this.trainedDuration + ", theoryDuration=" + this.theoryDuration + ", theoryCalorie=" + this.theoryCalorie + ", trainedCalorie=" + this.trainedCalorie + ", avgHeartRate=" + this.avgHeartRate + ", lstHeartRates=" + this.lstHeartRates + ", lstActions=" + this.lstActions + ", difficultyLevel=" + this.difficultyLevel + ", deviceType=" + this.deviceType + ", runExtra=" + this.runExtra + ", dataSource=" + this.dataSource + ", fitSourceType=" + this.fitSourceType + ", videoProgress=" + this.videoProgress + ", effective=" + this.effective + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.imageUrlRecord);
        parcel.writeString(this.imageUrlShare);
        parcel.writeString(this.imageUrlThumb);
        parcel.writeString(this.recordId);
        parcel.writeLong(this.trainStartTime);
        parcel.writeLong(this.trainFinishTime);
        parcel.writeInt(this.trainType);
        parcel.writeString(this.courseName);
        parcel.writeString(this.courseId);
        parcel.writeInt(this.trainedDuration);
        parcel.writeInt(this.theoryDuration);
        parcel.writeInt(this.theoryCalorie);
        parcel.writeInt(this.trainedCalorie);
        parcel.writeInt(this.avgHeartRate);
        List<? extends TimeStampedData> list = this.lstHeartRates;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<? extends TimeStampedData> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), flags);
            }
        }
        parcel.writeString(this.lstActions);
        parcel.writeInt(this.difficultyLevel);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.runExtra);
        parcel.writeInt(this.dataSource);
        parcel.writeInt(this.fitSourceType);
        parcel.writeInt(this.videoProgress);
        parcel.writeInt(this.effective ? 1 : 0);
    }

    public TrainResultData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j2, long j3, int i, @Nullable String str5, @Nullable String str6, int i2, int i3, int i4, int i5, int i6, @Nullable List<? extends TimeStampedData> list, @Nullable String str7, int i7, @Nullable String str8, @Nullable String str9, int i8, int i9, int i10, boolean z) {
        this.imageUrlRecord = str;
        this.imageUrlShare = str2;
        this.imageUrlThumb = str3;
        this.recordId = str4;
        this.trainStartTime = j2;
        this.trainFinishTime = j3;
        this.trainType = i;
        this.courseName = str5;
        this.courseId = str6;
        this.trainedDuration = i2;
        this.theoryDuration = i3;
        this.theoryCalorie = i4;
        this.trainedCalorie = i5;
        this.avgHeartRate = i6;
        this.lstHeartRates = list;
        this.lstActions = str7;
        this.difficultyLevel = i7;
        this.deviceType = str8;
        this.runExtra = str9;
        this.dataSource = i8;
        this.fitSourceType = i9;
        this.videoProgress = i10;
        this.effective = z;
    }

    public /* synthetic */ TrainResultData(String str, String str2, String str3, String str4, long j2, long j3, int i, String str5, String str6, int i2, int i3, int i4, int i5, int i6, List list, String str7, int i7, String str8, String str9, int i8, int i9, int i10, boolean z, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? 0L : j2, (i11 & 32) == 0 ? j3 : 0L, (i11 & 64) != 0 ? 0 : i, (i11 & 128) != 0 ? null : str5, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? 0 : i2, (i11 & 1024) != 0 ? 0 : i3, (i11 & 2048) != 0 ? 0 : i4, (i11 & 4096) != 0 ? 0 : i5, (i11 & 8192) != 0 ? 0 : i6, (i11 & 16384) != 0 ? null : list, (i11 & 32768) != 0 ? null : str7, (i11 & 65536) != 0 ? 0 : i7, (i11 & 131072) != 0 ? null : str8, (i11 & 262144) != 0 ? "" : str9, (i11 & 524288) != 0 ? 0 : i8, (i11 & 1048576) != 0 ? 0 : i9, (i11 & 2097152) != 0 ? 0 : i10, (i11 & 4194304) != 0 ? false : z);
    }
}
