package com.heytap.health.operations.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\rHÆ\u0003J\u0089\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0005HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010\u001e¨\u0006C"}, d2 = {"Lcom/heytap/health/operations/bean/RunningCourseDetailBean;", "Ljava/io/Serializable;", "courseImage", "", "duration", "", "calorie", "courseCode", "introduce", "difficultyLevel", "name", RunningPostureVideoActivity.VIDEO_PATH, "videoSize", "", "target", DBWristTemperatureStat.ACTIONS, "", "Lcom/heytap/health/operations/bean/StageBean;", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;FILjava/util/List;)V", "getActions", "()Ljava/util/List;", "setActions", "(Ljava/util/List;)V", "getCalorie", "()I", "setCalorie", "(I)V", "getCourseCode", "()Ljava/lang/String;", "setCourseCode", "(Ljava/lang/String;)V", "getCourseImage", "setCourseImage", "getDifficultyLevel", "setDifficultyLevel", "getDuration", "setDuration", "getIntroduce", "setIntroduce", "getName", "setName", "getTarget", "setTarget", "getVideoSize", "()F", "setVideoSize", "(F)V", "getVideoUrl", "setVideoUrl", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RunningCourseDetailBean implements Serializable {

    @Nullable
    private List<? extends StageBean> actions;
    private int calorie;

    @Nullable
    private String courseCode;

    @Nullable
    private String courseImage;
    private int difficultyLevel;
    private int duration;

    @Nullable
    private String introduce;

    @Nullable
    private String name;
    private int target;
    private float videoSize;

    @Nullable
    private String videoUrl;

    public RunningCourseDetailBean() {
        this(null, 0, 0, null, null, 0, null, null, 0.0f, 0, null, 2047, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCourseImage() {
        return this.courseImage;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    @Nullable
    public final List<StageBean> component11() {
        return this.actions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCalorie() {
        return this.calorie;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCourseCode() {
        return this.courseCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getVideoSize() {
        return this.videoSize;
    }

    @NotNull
    public final RunningCourseDetailBean copy(@Nullable String courseImage, int duration, int calorie, @Nullable String courseCode, @Nullable String introduce, int difficultyLevel, @Nullable String name, @Nullable String videoUrl, float videoSize, int target, @Nullable List<? extends StageBean> actions) {
        return new RunningCourseDetailBean(courseImage, duration, calorie, courseCode, introduce, difficultyLevel, name, videoUrl, videoSize, target, actions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningCourseDetailBean)) {
            return false;
        }
        RunningCourseDetailBean runningCourseDetailBean = (RunningCourseDetailBean) other;
        return Intrinsics.areEqual(this.courseImage, runningCourseDetailBean.courseImage) && this.duration == runningCourseDetailBean.duration && this.calorie == runningCourseDetailBean.calorie && Intrinsics.areEqual(this.courseCode, runningCourseDetailBean.courseCode) && Intrinsics.areEqual(this.introduce, runningCourseDetailBean.introduce) && this.difficultyLevel == runningCourseDetailBean.difficultyLevel && Intrinsics.areEqual(this.name, runningCourseDetailBean.name) && Intrinsics.areEqual(this.videoUrl, runningCourseDetailBean.videoUrl) && Float.compare(this.videoSize, runningCourseDetailBean.videoSize) == 0 && this.target == runningCourseDetailBean.target && Intrinsics.areEqual(this.actions, runningCourseDetailBean.actions);
    }

    @Nullable
    public final List<StageBean> getActions() {
        return this.actions;
    }

    public final int getCalorie() {
        return this.calorie;
    }

    @Nullable
    public final String getCourseCode() {
        return this.courseCode;
    }

    @Nullable
    public final String getCourseImage() {
        return this.courseImage;
    }

    public final int getDifficultyLevel() {
        return this.difficultyLevel;
    }

    public final int getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getIntroduce() {
        return this.introduce;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getTarget() {
        return this.target;
    }

    public final float getVideoSize() {
        return this.videoSize;
    }

    @Nullable
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        String str = this.courseImage;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.calorie)) * 31;
        String str2 = this.courseCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.introduce;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.difficultyLevel)) * 31;
        String str4 = this.name;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.videoUrl;
        int iHashCode5 = (((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Float.hashCode(this.videoSize)) * 31) + Integer.hashCode(this.target)) * 31;
        List<? extends StageBean> list = this.actions;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final void setActions(@Nullable List<? extends StageBean> list) {
        this.actions = list;
    }

    public final void setCalorie(int i) {
        this.calorie = i;
    }

    public final void setCourseCode(@Nullable String str) {
        this.courseCode = str;
    }

    public final void setCourseImage(@Nullable String str) {
        this.courseImage = str;
    }

    public final void setDifficultyLevel(int i) {
        this.difficultyLevel = i;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final void setIntroduce(@Nullable String str) {
        this.introduce = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTarget(int i) {
        this.target = i;
    }

    public final void setVideoSize(float f) {
        this.videoSize = f;
    }

    public final void setVideoUrl(@Nullable String str) {
        this.videoUrl = str;
    }

    @NotNull
    public String toString() {
        return "RunningCourseDetailBean(courseImage=" + this.courseImage + ", duration=" + this.duration + ", calorie=" + this.calorie + ", courseCode=" + this.courseCode + ", introduce=" + this.introduce + ", difficultyLevel=" + this.difficultyLevel + ", name=" + this.name + ", videoUrl=" + this.videoUrl + ", videoSize=" + this.videoSize + ", target=" + this.target + ", actions=" + this.actions + ")";
    }

    public RunningCourseDetailBean(@Nullable String str, int i, int i2, @Nullable String str2, @Nullable String str3, int i3, @Nullable String str4, @Nullable String str5, float f, int i4, @Nullable List<? extends StageBean> list) {
        this.courseImage = str;
        this.duration = i;
        this.calorie = i2;
        this.courseCode = str2;
        this.introduce = str3;
        this.difficultyLevel = i3;
        this.name = str4;
        this.videoUrl = str5;
        this.videoSize = f;
        this.target = i4;
        this.actions = list;
    }

    public /* synthetic */ RunningCourseDetailBean(String str, int i, int i2, String str2, String str3, int i3, String str4, String str5, float f, int i4, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? null : str2, (i5 & 16) != 0 ? null : str3, (i5 & 32) != 0 ? 0 : i3, (i5 & 64) != 0 ? null : str4, (i5 & 128) != 0 ? null : str5, (i5 & 256) != 0 ? 0.0f : f, (i5 & 512) != 0 ? 0 : i4, (i5 & 1024) != 0 ? null : list);
    }
}
