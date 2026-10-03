package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.odl, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u000bR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/odl;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "lottieFile", "b", "res", "c", "title", "d", "getTitleEn", "titleEn", MapSchema.FIELD_NAME_ENTRY, "getTitleHk", "titleHk", "", "Lcom/oplus/aiunit/vision/l9l;", "f", "Ljava/util/List;", "()Ljava/util/List;", "watchDialUniqueList", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WatchFaceRecom {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("lottieFile")
    @NotNull
    private final String lottieFile;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("res")
    @NotNull
    private final String res;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("titleEn")
    @NotNull
    private final String titleEn;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("titleHk")
    @NotNull
    private final String titleHk;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("watchDialUniqueList")
    @NotNull
    private final List<WatchDialUnique> watchDialUniqueList;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLottieFile() {
        return this.lottieFile;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRes() {
        return this.res;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final List<WatchDialUnique> d() {
        return this.watchDialUniqueList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchFaceRecom)) {
            return false;
        }
        WatchFaceRecom watchFaceRecom = (WatchFaceRecom) other;
        return Intrinsics.areEqual(this.lottieFile, watchFaceRecom.lottieFile) && Intrinsics.areEqual(this.res, watchFaceRecom.res) && Intrinsics.areEqual(this.title, watchFaceRecom.title) && Intrinsics.areEqual(this.titleEn, watchFaceRecom.titleEn) && Intrinsics.areEqual(this.titleHk, watchFaceRecom.titleHk) && Intrinsics.areEqual(this.watchDialUniqueList, watchFaceRecom.watchDialUniqueList);
    }

    public int hashCode() {
        return (((((((((this.lottieFile.hashCode() * 31) + this.res.hashCode()) * 31) + this.title.hashCode()) * 31) + this.titleEn.hashCode()) * 31) + this.titleHk.hashCode()) * 31) + this.watchDialUniqueList.hashCode();
    }

    @NotNull
    public String toString() {
        return "WatchFaceRecom(lottieFile=" + this.lottieFile + ", res=" + this.res + ", title=" + this.title + ", titleEn=" + this.titleEn + ", titleHk=" + this.titleHk + ", watchDialUniqueList=" + this.watchDialUniqueList + ")";
    }
}
