package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.a87, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/a87;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "content", "b", "getContentEn", "contentEn", "c", "getContentHk", "contentHk", "d", "lottieFile", MapSchema.FIELD_NAME_ENTRY, "res", "f", "title", b2n.f, "getTitleEn", "titleEn", b2n.g, "getTitleHk", "titleHk", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Feature {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("content")
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("contentEn")
    @NotNull
    private final String contentEn;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("contentHk")
    @NotNull
    private final String contentHk;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("lottieFile")
    @NotNull
    private final String lottieFile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("res")
    @NotNull
    private final String res;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @NotNull
    private final String title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("titleEn")
    @NotNull
    private final String titleEn;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("titleHk")
    @NotNull
    private final String titleHk;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLottieFile() {
        return this.lottieFile;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRes() {
        return this.res;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) other;
        return Intrinsics.areEqual(this.content, feature.content) && Intrinsics.areEqual(this.contentEn, feature.contentEn) && Intrinsics.areEqual(this.contentHk, feature.contentHk) && Intrinsics.areEqual(this.lottieFile, feature.lottieFile) && Intrinsics.areEqual(this.res, feature.res) && Intrinsics.areEqual(this.title, feature.title) && Intrinsics.areEqual(this.titleEn, feature.titleEn) && Intrinsics.areEqual(this.titleHk, feature.titleHk);
    }

    public int hashCode() {
        return (((((((((((((this.content.hashCode() * 31) + this.contentEn.hashCode()) * 31) + this.contentHk.hashCode()) * 31) + this.lottieFile.hashCode()) * 31) + this.res.hashCode()) * 31) + this.title.hashCode()) * 31) + this.titleEn.hashCode()) * 31) + this.titleHk.hashCode();
    }

    @NotNull
    public String toString() {
        return "Feature(content=" + this.content + ", contentEn=" + this.contentEn + ", contentHk=" + this.contentHk + ", lottieFile=" + this.lottieFile + ", res=" + this.res + ", title=" + this.title + ", titleEn=" + this.titleEn + ", titleHk=" + this.titleHk + ")";
    }
}
