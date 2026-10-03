package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.l9l, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/l9l;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "faceKey", "b", "title", "c", "getTitleEn", "titleEn", "d", "getTitleHk", "titleHk", MapSchema.FIELD_NAME_ENTRY, "watchFace", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WatchDialUnique {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("faceKey")
    @NotNull
    private final String faceKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("titleEn")
    @NotNull
    private final String titleEn;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("titleHk")
    @NotNull
    private final String titleHk;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("watchFace")
    @NotNull
    private final String watchFace;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFaceKey() {
        return this.faceKey;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getWatchFace() {
        return this.watchFace;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchDialUnique)) {
            return false;
        }
        WatchDialUnique watchDialUnique = (WatchDialUnique) other;
        return Intrinsics.areEqual(this.faceKey, watchDialUnique.faceKey) && Intrinsics.areEqual(this.title, watchDialUnique.title) && Intrinsics.areEqual(this.titleEn, watchDialUnique.titleEn) && Intrinsics.areEqual(this.titleHk, watchDialUnique.titleHk) && Intrinsics.areEqual(this.watchFace, watchDialUnique.watchFace);
    }

    public int hashCode() {
        return (((((((this.faceKey.hashCode() * 31) + this.title.hashCode()) * 31) + this.titleEn.hashCode()) * 31) + this.titleHk.hashCode()) * 31) + this.watchFace.hashCode();
    }

    @NotNull
    public String toString() {
        return "WatchDialUnique(faceKey=" + this.faceKey + ", title=" + this.title + ", titleEn=" + this.titleEn + ", titleHk=" + this.titleHk + ", watchFace=" + this.watchFace + ")";
    }
}
