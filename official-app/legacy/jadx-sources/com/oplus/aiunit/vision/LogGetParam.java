package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.devicelog.feedback.FeedbackOption;
import com.oplus.utrace.hlog.HLogFilesCollector;
import io.protostuff.MapSchema;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.b6b, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u000b\u0010\u0014R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R#\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020&8\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b\u0018\u0010(¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/b6b;", "Lcom/oplus/aiunit/vision/cqf;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "a", "Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "b", "()Lcom/heytap/health/devicelog/feedback/FeedbackOption;", "fbOption", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/health/devicelog/feedback/a;", "Landroidx/lifecycle/MutableLiveData;", "c", "()Landroidx/lifecycle/MutableLiveData;", "feedbackStage", "", "deviceLogGetProgress", "d", MapSchema.FIELD_NAME_ENTRY, "fileUploadProgress", "", "Ljava/util/Set;", b2n.f, "()Ljava/util/Set;", "reqFileNames", "", "Ljava/io/File;", "f", "Ljava/util/List;", "()Ljava/util/List;", HLogFilesCollector.KEY_FILES, "", "Ljava/util/Map;", "()Ljava/util/Map;", "fileKeys", "<init>", "(Lcom/heytap/health/devicelog/feedback/FeedbackOption;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;Ljava/util/Set;Ljava/util/List;Ljava/util/Map;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LogGetParam implements cqf {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final FeedbackOption fbOption;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public final MutableLiveData<com.heytap.health.devicelog.feedback.a> feedbackStage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final MutableLiveData<Float> deviceLogGetProgress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final MutableLiveData<Float> fileUploadProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final Set<String> reqFileNames;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<File> logFiles;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    public final Map<String, String> fileKeys;

    public LogGetParam(@NotNull FeedbackOption fbOption, @Nullable MutableLiveData<com.heytap.health.devicelog.feedback.a> mutableLiveData, @Nullable MutableLiveData<Float> mutableLiveData2, @Nullable MutableLiveData<Float> mutableLiveData3, @NotNull Set<String> reqFileNames, @NotNull List<File> logFiles, @NotNull Map<String, String> fileKeys) {
        Intrinsics.checkNotNullParameter(fbOption, "fbOption");
        Intrinsics.checkNotNullParameter(reqFileNames, "reqFileNames");
        Intrinsics.checkNotNullParameter(logFiles, "logFiles");
        Intrinsics.checkNotNullParameter(fileKeys, "fileKeys");
        this.fbOption = fbOption;
        this.feedbackStage = mutableLiveData;
        this.deviceLogGetProgress = mutableLiveData2;
        this.fileUploadProgress = mutableLiveData3;
        this.reqFileNames = reqFileNames;
        this.logFiles = logFiles;
        this.fileKeys = fileKeys;
    }

    @Nullable
    public final MutableLiveData<Float> a() {
        return this.deviceLogGetProgress;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final FeedbackOption getFbOption() {
        return this.fbOption;
    }

    @Nullable
    public final MutableLiveData<com.heytap.health.devicelog.feedback.a> c() {
        return this.feedbackStage;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.fileKeys;
    }

    @Nullable
    public final MutableLiveData<Float> e() {
        return this.fileUploadProgress;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogGetParam)) {
            return false;
        }
        LogGetParam logGetParam = (LogGetParam) other;
        return Intrinsics.areEqual(this.fbOption, logGetParam.fbOption) && Intrinsics.areEqual(this.feedbackStage, logGetParam.feedbackStage) && Intrinsics.areEqual(this.deviceLogGetProgress, logGetParam.deviceLogGetProgress) && Intrinsics.areEqual(this.fileUploadProgress, logGetParam.fileUploadProgress) && Intrinsics.areEqual(this.reqFileNames, logGetParam.reqFileNames) && Intrinsics.areEqual(this.logFiles, logGetParam.logFiles) && Intrinsics.areEqual(this.fileKeys, logGetParam.fileKeys);
    }

    @NotNull
    public final List<File> f() {
        return this.logFiles;
    }

    @NotNull
    public final Set<String> g() {
        return this.reqFileNames;
    }

    public int hashCode() {
        int iHashCode = this.fbOption.hashCode() * 31;
        MutableLiveData<com.heytap.health.devicelog.feedback.a> mutableLiveData = this.feedbackStage;
        int iHashCode2 = (iHashCode + (mutableLiveData == null ? 0 : mutableLiveData.hashCode())) * 31;
        MutableLiveData<Float> mutableLiveData2 = this.deviceLogGetProgress;
        int iHashCode3 = (iHashCode2 + (mutableLiveData2 == null ? 0 : mutableLiveData2.hashCode())) * 31;
        MutableLiveData<Float> mutableLiveData3 = this.fileUploadProgress;
        return ((((((iHashCode3 + (mutableLiveData3 != null ? mutableLiveData3.hashCode() : 0)) * 31) + this.reqFileNames.hashCode()) * 31) + this.logFiles.hashCode()) * 31) + this.fileKeys.hashCode();
    }

    @NotNull
    public String toString() {
        return "LogGetParam(fbOption=" + this.fbOption + ", feedbackStage=" + this.feedbackStage + ", deviceLogGetProgress=" + this.deviceLogGetProgress + ", fileUploadProgress=" + this.fileUploadProgress + ", reqFileNames=" + this.reqFileNames + ", logFiles=" + this.logFiles + ", fileKeys=" + this.fileKeys + ")";
    }

    public /* synthetic */ LogGetParam(FeedbackOption feedbackOption, MutableLiveData mutableLiveData, MutableLiveData mutableLiveData2, MutableLiveData mutableLiveData3, Set set, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(feedbackOption, (i & 2) != 0 ? null : mutableLiveData, (i & 4) != 0 ? null : mutableLiveData2, (i & 8) == 0 ? mutableLiveData3 : null, (i & 16) != 0 ? new LinkedHashSet() : set, (i & 32) != 0 ? new ArrayList() : list, (i & 64) != 0 ? new LinkedHashMap() : map);
    }
}
