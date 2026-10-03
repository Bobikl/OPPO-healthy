package com.heytap.health.operations.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\bH\b\u0087\b\u0018\u00002\u00020\u0001B½\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u000fHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010&J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010O\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\t\u0010P\u001a\u00020\u0017HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0006HÆ\u0003J\t\u0010S\u001a\u00020\u0006HÆ\u0003J\t\u0010T\u001a\u00020\u0006HÆ\u0003J\t\u0010U\u001a\u00020\u0006HÆ\u0003J\t\u0010V\u001a\u00020\u0006HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÆ\u0001\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017HÆ\u0001¢\u0006\u0002\u0010ZJ\u0013\u0010[\u001a\u00020\u00172\b\u0010\\\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010]\u001a\u00020\u0006HÖ\u0001J\t\u0010^\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b,\u0010&\"\u0004\b-\u0010(R\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010 \"\u0004\b/\u0010\"R\u001e\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010 \"\u0004\b3\u0010\"R\u001e\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u001a\"\u0004\b5\u0010\u001cR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010 \"\u0004\b?\u0010\"R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u001a\"\u0004\bE\u0010\u001cR\u001e\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u001a\"\u0004\bG\u0010\u001c¨\u0006_"}, d2 = {"Lcom/heytap/health/operations/bean/KeepTrainBean;", "", "courseCode", "", "name", "calorie", "", "trainDuration", "difficultyLevel", "trainType", "courseSource", "courseIcon", "fee", "finishNumber", "lastTrainTime", "", "courseTitle", "courseTag", "collectSize", "courseIndex", "ownerCourseData", "Lcom/heytap/health/operations/bean/RunningCourseDetailBean;", "fromAerobicsBsu", "", "(Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Lcom/heytap/health/operations/bean/RunningCourseDetailBean;Z)V", "getCalorie", "()I", "setCalorie", "(I)V", "getCollectSize", "setCollectSize", "getCourseCode", "()Ljava/lang/String;", "setCourseCode", "(Ljava/lang/String;)V", "getCourseIcon", "setCourseIcon", "getCourseIndex", "()Ljava/lang/Integer;", "setCourseIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCourseSource", "setCourseSource", "getCourseTag", "setCourseTag", "getCourseTitle", "setCourseTitle", "getDifficultyLevel", "setDifficultyLevel", "getFee", "setFee", "getFinishNumber", "setFinishNumber", "getFromAerobicsBsu", "()Z", "setFromAerobicsBsu", "(Z)V", "getLastTrainTime", "()J", "setLastTrainTime", "(J)V", "getName", "setName", "getOwnerCourseData", "()Lcom/heytap/health/operations/bean/RunningCourseDetailBean;", "setOwnerCourseData", "(Lcom/heytap/health/operations/bean/RunningCourseDetailBean;)V", "getTrainDuration", "setTrainDuration", "getTrainType", "setTrainType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;Lcom/heytap/health/operations/bean/RunningCourseDetailBean;Z)Lcom/heytap/health/operations/bean/KeepTrainBean;", "equals", "other", "hashCode", "toString", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class KeepTrainBean {

    @SerializedName("calorie")
    private int calorie;
    private int collectSize;

    @SerializedName("courseCode")
    @Nullable
    private String courseCode;

    @SerializedName("courseIcon")
    @Nullable
    private String courseIcon;

    @Nullable
    private Integer courseIndex;

    @SerializedName("courseSource")
    private int courseSource;

    @Nullable
    private Integer courseTag;

    @NotNull
    private String courseTitle;

    @SerializedName("difficultyLevel")
    private int difficultyLevel;

    @SerializedName("fee")
    @Nullable
    private String fee;

    @SerializedName("finishNumber")
    private int finishNumber;
    private boolean fromAerobicsBsu;

    @SerializedName("lastTrainTime")
    private long lastTrainTime;

    @SerializedName("name")
    @Nullable
    private String name;

    @Nullable
    private RunningCourseDetailBean ownerCourseData;

    @SerializedName("trainDuration")
    private int trainDuration;

    @SerializedName("trainType")
    private int trainType;

    public KeepTrainBean() {
        this(null, null, 0, 0, 0, 0, 0, null, null, 0, 0L, null, null, 0, null, null, false, 131071, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCourseCode() {
        return this.courseCode;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getFinishNumber() {
        return this.finishNumber;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getLastTrainTime() {
        return this.lastTrainTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCourseTitle() {
        return this.courseTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getCourseTag() {
        return this.courseTag;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getCollectSize() {
        return this.collectSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getCourseIndex() {
        return this.courseIndex;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final RunningCourseDetailBean getOwnerCourseData() {
        return this.ownerCourseData;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getFromAerobicsBsu() {
        return this.fromAerobicsBsu;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCalorie() {
        return this.calorie;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTrainDuration() {
        return this.trainDuration;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getTrainType() {
        return this.trainType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCourseSource() {
        return this.courseSource;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCourseIcon() {
        return this.courseIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFee() {
        return this.fee;
    }

    @NotNull
    public final KeepTrainBean copy(@Nullable String courseCode, @Nullable String name, int calorie, int trainDuration, int difficultyLevel, int trainType, int courseSource, @Nullable String courseIcon, @Nullable String fee, int finishNumber, long lastTrainTime, @NotNull String courseTitle, @Nullable Integer courseTag, int collectSize, @Nullable Integer courseIndex, @Nullable RunningCourseDetailBean ownerCourseData, boolean fromAerobicsBsu) {
        Intrinsics.checkNotNullParameter(courseTitle, "courseTitle");
        return new KeepTrainBean(courseCode, name, calorie, trainDuration, difficultyLevel, trainType, courseSource, courseIcon, fee, finishNumber, lastTrainTime, courseTitle, courseTag, collectSize, courseIndex, ownerCourseData, fromAerobicsBsu);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeepTrainBean)) {
            return false;
        }
        KeepTrainBean keepTrainBean = (KeepTrainBean) other;
        return Intrinsics.areEqual(this.courseCode, keepTrainBean.courseCode) && Intrinsics.areEqual(this.name, keepTrainBean.name) && this.calorie == keepTrainBean.calorie && this.trainDuration == keepTrainBean.trainDuration && this.difficultyLevel == keepTrainBean.difficultyLevel && this.trainType == keepTrainBean.trainType && this.courseSource == keepTrainBean.courseSource && Intrinsics.areEqual(this.courseIcon, keepTrainBean.courseIcon) && Intrinsics.areEqual(this.fee, keepTrainBean.fee) && this.finishNumber == keepTrainBean.finishNumber && this.lastTrainTime == keepTrainBean.lastTrainTime && Intrinsics.areEqual(this.courseTitle, keepTrainBean.courseTitle) && Intrinsics.areEqual(this.courseTag, keepTrainBean.courseTag) && this.collectSize == keepTrainBean.collectSize && Intrinsics.areEqual(this.courseIndex, keepTrainBean.courseIndex) && Intrinsics.areEqual(this.ownerCourseData, keepTrainBean.ownerCourseData) && this.fromAerobicsBsu == keepTrainBean.fromAerobicsBsu;
    }

    public final int getCalorie() {
        return this.calorie;
    }

    public final int getCollectSize() {
        return this.collectSize;
    }

    @Nullable
    public final String getCourseCode() {
        return this.courseCode;
    }

    @Nullable
    public final String getCourseIcon() {
        return this.courseIcon;
    }

    @Nullable
    public final Integer getCourseIndex() {
        return this.courseIndex;
    }

    public final int getCourseSource() {
        return this.courseSource;
    }

    @Nullable
    public final Integer getCourseTag() {
        return this.courseTag;
    }

    @NotNull
    public final String getCourseTitle() {
        return this.courseTitle;
    }

    public final int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    @Nullable
    public final String getFee() {
        return this.fee;
    }

    public final int getFinishNumber() {
        return this.finishNumber;
    }

    public final boolean getFromAerobicsBsu() {
        return this.fromAerobicsBsu;
    }

    public final long getLastTrainTime() {
        return this.lastTrainTime;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final RunningCourseDetailBean getOwnerCourseData() {
        return this.ownerCourseData;
    }

    public final int getTrainDuration() {
        return this.trainDuration;
    }

    public final int getTrainType() {
        return this.trainType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public int hashCode() {
        String str = this.courseCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (((((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.calorie)) * 31) + Integer.hashCode(this.trainDuration)) * 31) + Integer.hashCode(this.difficultyLevel)) * 31) + Integer.hashCode(this.trainType)) * 31) + Integer.hashCode(this.courseSource)) * 31;
        String str3 = this.courseIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fee;
        int iHashCode4 = (((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.finishNumber)) * 31) + Long.hashCode(this.lastTrainTime)) * 31) + this.courseTitle.hashCode()) * 31;
        Integer num = this.courseTag;
        int iHashCode5 = (((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.collectSize)) * 31;
        Integer num2 = this.courseIndex;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        RunningCourseDetailBean runningCourseDetailBean = this.ownerCourseData;
        int iHashCode7 = (iHashCode6 + (runningCourseDetailBean != null ? runningCourseDetailBean.hashCode() : 0)) * 31;
        boolean z = this.fromAerobicsBsu;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        return iHashCode7 + r4;
    }

    public final void setCalorie(int i) {
        this.calorie = i;
    }

    public final void setCollectSize(int i) {
        this.collectSize = i;
    }

    public final void setCourseCode(@Nullable String str) {
        this.courseCode = str;
    }

    public final void setCourseIcon(@Nullable String str) {
        this.courseIcon = str;
    }

    public final void setCourseIndex(@Nullable Integer num) {
        this.courseIndex = num;
    }

    public final void setCourseSource(int i) {
        this.courseSource = i;
    }

    public final void setCourseTag(@Nullable Integer num) {
        this.courseTag = num;
    }

    public final void setCourseTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.courseTitle = str;
    }

    public final void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public final void setFee(@Nullable String str) {
        this.fee = str;
    }

    public final void setFinishNumber(int i) {
        this.finishNumber = i;
    }

    public final void setFromAerobicsBsu(boolean z) {
        this.fromAerobicsBsu = z;
    }

    public final void setLastTrainTime(long j2) {
        this.lastTrainTime = j2;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setOwnerCourseData(@Nullable RunningCourseDetailBean runningCourseDetailBean) {
        this.ownerCourseData = runningCourseDetailBean;
    }

    public final void setTrainDuration(int i) {
        this.trainDuration = i;
    }

    public final void setTrainType(int i) {
        this.trainType = i;
    }

    @NotNull
    public String toString() {
        return "KeepTrainBean(courseCode=" + this.courseCode + ", name=" + this.name + ", calorie=" + this.calorie + ", trainDuration=" + this.trainDuration + ", difficultyLevel=" + this.difficultyLevel + ", trainType=" + this.trainType + ", courseSource=" + this.courseSource + ", courseIcon=" + this.courseIcon + ", fee=" + this.fee + ", finishNumber=" + this.finishNumber + ", lastTrainTime=" + this.lastTrainTime + ", courseTitle=" + this.courseTitle + ", courseTag=" + this.courseTag + ", collectSize=" + this.collectSize + ", courseIndex=" + this.courseIndex + ", ownerCourseData=" + this.ownerCourseData + ", fromAerobicsBsu=" + this.fromAerobicsBsu + ")";
    }

    public KeepTrainBean(@Nullable String str, @Nullable String str2, int i, int i2, int i3, int i4, int i5, @Nullable String str3, @Nullable String str4, int i6, long j2, @NotNull String courseTitle, @Nullable Integer num, int i7, @Nullable Integer num2, @Nullable RunningCourseDetailBean runningCourseDetailBean, boolean z) {
        Intrinsics.checkNotNullParameter(courseTitle, "courseTitle");
        this.courseCode = str;
        this.name = str2;
        this.calorie = i;
        this.trainDuration = i2;
        this.difficultyLevel = i3;
        this.trainType = i4;
        this.courseSource = i5;
        this.courseIcon = str3;
        this.fee = str4;
        this.finishNumber = i6;
        this.lastTrainTime = j2;
        this.courseTitle = courseTitle;
        this.courseTag = num;
        this.collectSize = i7;
        this.courseIndex = num2;
        this.ownerCourseData = runningCourseDetailBean;
        this.fromAerobicsBsu = z;
    }

    public /* synthetic */ KeepTrainBean(String str, String str2, int i, int i2, int i3, int i4, int i5, String str3, String str4, int i6, long j2, String str5, Integer num, int i7, Integer num2, RunningCourseDetailBean runningCourseDetailBean, boolean z, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? 0 : i, (i8 & 8) != 0 ? 0 : i2, (i8 & 16) != 0 ? 0 : i3, (i8 & 32) != 0 ? 0 : i4, (i8 & 64) != 0 ? 0 : i5, (i8 & 128) != 0 ? null : str3, (i8 & 256) != 0 ? null : str4, (i8 & 512) != 0 ? 0 : i6, (i8 & 1024) != 0 ? 0L : j2, (i8 & 2048) != 0 ? "" : str5, (i8 & 4096) != 0 ? null : num, (i8 & 8192) != 0 ? 0 : i7, (i8 & 16384) != 0 ? null : num2, (i8 & 32768) != 0 ? null : runningCourseDetailBean, (i8 & 65536) != 0 ? false : z);
    }
}
