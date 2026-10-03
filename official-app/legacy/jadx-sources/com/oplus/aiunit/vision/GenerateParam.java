package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.creation.category.livephoto.ImageTags;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.l48, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR'\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/l48;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "filePath", "b", "imgId", "Ljava/util/ArrayList;", "Lcom/heytap/health/watchface/business/creation/category/livephoto/ImageTags;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "imgTagList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class GenerateParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String filePath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String imgId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public final ArrayList<ImageTags> imgTagList;

    public GenerateParam(@NotNull String filePath, @NotNull String imgId, @NotNull ArrayList<ImageTags> imgTagList) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(imgId, "imgId");
        Intrinsics.checkNotNullParameter(imgTagList, "imgTagList");
        this.filePath = filePath;
        this.imgId = imgId;
        this.imgTagList = imgTagList;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImgId() {
        return this.imgId;
    }

    @NotNull
    public final ArrayList<ImageTags> c() {
        return this.imgTagList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateParam)) {
            return false;
        }
        GenerateParam generateParam = (GenerateParam) other;
        return Intrinsics.areEqual(this.filePath, generateParam.filePath) && Intrinsics.areEqual(this.imgId, generateParam.imgId) && Intrinsics.areEqual(this.imgTagList, generateParam.imgTagList);
    }

    public int hashCode() {
        return (((this.filePath.hashCode() * 31) + this.imgId.hashCode()) * 31) + this.imgTagList.hashCode();
    }

    @NotNull
    public String toString() {
        return "GenerateParam(filePath=" + this.filePath + ", imgId=" + this.imgId + ", imgTagList=" + this.imgTagList + ")";
    }
}
