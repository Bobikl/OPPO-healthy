package com.heytap.health.watchface.business.creation.category.livephoto;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u000204J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J'\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020%2\b\u0010;\u001a\u0004\u0018\u00010<HÖ\u0003J\t\u0010=\u001a\u00020+HÖ\u0001J\u0006\u0010>\u001a\u00020%J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0019R$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\r¨\u0006@"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/livephoto/GenerateTask;", "Ljava/io/Serializable;", "imgId", "", "imageTags", "Lcom/heytap/health/watchface/business/creation/category/livephoto/ImageTags;", "filePath", "(Ljava/lang/String;Lcom/heytap/health/watchface/business/creation/category/livephoto/ImageTags;Ljava/lang/String;)V", "addTimeStamp", "", "getAddTimeStamp", "()J", "setAddTimeStamp", "(J)V", "commitTimeStamp", "getCommitTimeStamp", "setCommitTimeStamp", "getFilePath", "()Ljava/lang/String;", "getImageTags", "()Lcom/heytap/health/watchface/business/creation/category/livephoto/ImageTags;", "getImgId", "livePhotoCover", "getLivePhotoCover", "setLivePhotoCover", "(Ljava/lang/String;)V", "livePhotoVideoUrl", "getLivePhotoVideoUrl", "setLivePhotoVideoUrl", "value", "", "process", "getProcess", "()F", "setProcess", "(F)V", "select", "", "getSelect", "()Z", "setSelect", "(Z)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "taskId", "getTaskId", "setTaskId", "beAdded", "", "beUnAdded", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "isExceptionTask", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GenerateTask implements Serializable {
    private transient long addTimeStamp;
    private long commitTimeStamp;

    @NotNull
    private final String filePath;

    @NotNull
    private final ImageTags imageTags;

    @NotNull
    private final String imgId;

    @Nullable
    private String livePhotoCover;

    @Nullable
    private String livePhotoVideoUrl;
    private transient float process;
    private transient boolean select;
    private int status;
    private long taskId;

    public GenerateTask(@NotNull String imgId, @NotNull ImageTags imageTags, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(imgId, "imgId");
        Intrinsics.checkNotNullParameter(imageTags, "imageTags");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.imgId = imgId;
        this.imageTags = imageTags;
        this.filePath = filePath;
        this.status = 1;
        this.addTimeStamp = Long.MAX_VALUE;
    }

    public static /* synthetic */ GenerateTask copy$default(GenerateTask generateTask, String str, ImageTags imageTags, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = generateTask.imgId;
        }
        if ((i & 2) != 0) {
            imageTags = generateTask.imageTags;
        }
        if ((i & 4) != 0) {
            str2 = generateTask.filePath;
        }
        return generateTask.copy(str, imageTags, str2);
    }

    public final void beAdded() {
        setProcess(0.0f);
        this.select = true;
        this.taskId = 0L;
        this.addTimeStamp = System.currentTimeMillis();
    }

    public final void beUnAdded() {
        setProcess(0.0f);
        this.select = false;
        this.taskId = 0L;
        this.addTimeStamp = Long.MAX_VALUE;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImgId() {
        return this.imgId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ImageTags getImageTags() {
        return this.imageTags;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final GenerateTask copy(@NotNull String imgId, @NotNull ImageTags imageTags, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(imgId, "imgId");
        Intrinsics.checkNotNullParameter(imageTags, "imageTags");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new GenerateTask(imgId, imageTags, filePath);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateTask)) {
            return false;
        }
        GenerateTask generateTask = (GenerateTask) other;
        return Intrinsics.areEqual(this.imgId, generateTask.imgId) && Intrinsics.areEqual(this.imageTags, generateTask.imageTags) && Intrinsics.areEqual(this.filePath, generateTask.filePath);
    }

    public final long getAddTimeStamp() {
        return this.addTimeStamp;
    }

    public final long getCommitTimeStamp() {
        return this.commitTimeStamp;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final ImageTags getImageTags() {
        return this.imageTags;
    }

    @NotNull
    public final String getImgId() {
        return this.imgId;
    }

    @Nullable
    public final String getLivePhotoCover() {
        return this.livePhotoCover;
    }

    @Nullable
    public final String getLivePhotoVideoUrl() {
        return this.livePhotoVideoUrl;
    }

    public final float getProcess() {
        return this.process;
    }

    public final boolean getSelect() {
        return this.select;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return (((this.imgId.hashCode() * 31) + this.imageTags.hashCode()) * 31) + this.filePath.hashCode();
    }

    public final boolean isExceptionTask() {
        int i = this.status;
        return i == 5 || i == 6 || i == 7 || i < 0;
    }

    public final void setAddTimeStamp(long j2) {
        this.addTimeStamp = j2;
    }

    public final void setCommitTimeStamp(long j2) {
        this.commitTimeStamp = j2;
    }

    public final void setLivePhotoCover(@Nullable String str) {
        this.livePhotoCover = str;
    }

    public final void setLivePhotoVideoUrl(@Nullable String str) {
        this.livePhotoVideoUrl = str;
    }

    public final void setProcess(float f) {
        if (f == 0.0f) {
            this.process = f;
        }
        if (f > this.process) {
            this.process = Math.min(f, 100.0f);
        }
        if (f >= 100.0f) {
            this.process = 100.0f;
        }
    }

    public final void setSelect(boolean z) {
        this.select = z;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTaskId(long j2) {
        this.taskId = j2;
    }

    @NotNull
    public String toString() {
        return "GenerateTask(imgId=" + this.imgId + ", imageTags=" + this.imageTags + ", filePath=" + this.filePath + ")";
    }
}
