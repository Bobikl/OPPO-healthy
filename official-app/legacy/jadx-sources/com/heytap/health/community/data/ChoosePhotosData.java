package com.heytap.health.community.data;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.wrf;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/community/data/ChoosePhotosData;", "", "statusCode", "", wrf.DEFAULT_IMAGES_DIR_NAME, "", "Lcom/heytap/health/community/data/ChooseImageJSData;", "(ILjava/util/List;)V", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "getStatusCode", "()I", "setStatusCode", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "community_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ChoosePhotosData {

    @NotNull
    private List<ChooseImageJSData> images;
    private int statusCode;

    public ChoosePhotosData(int i, @NotNull List<ChooseImageJSData> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.statusCode = i;
        this.images = images;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChoosePhotosData copy$default(ChoosePhotosData choosePhotosData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = choosePhotosData.statusCode;
        }
        if ((i2 & 2) != 0) {
            list = choosePhotosData.images;
        }
        return choosePhotosData.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final List<ChooseImageJSData> component2() {
        return this.images;
    }

    @NotNull
    public final ChoosePhotosData copy(int statusCode, @NotNull List<ChooseImageJSData> images) {
        Intrinsics.checkNotNullParameter(images, "images");
        return new ChoosePhotosData(statusCode, images);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChoosePhotosData)) {
            return false;
        }
        ChoosePhotosData choosePhotosData = (ChoosePhotosData) other;
        return this.statusCode == choosePhotosData.statusCode && Intrinsics.areEqual(this.images, choosePhotosData.images);
    }

    @NotNull
    public final List<ChooseImageJSData> getImages() {
        return this.images;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.statusCode) * 31) + this.images.hashCode();
    }

    public final void setImages(@NotNull List<ChooseImageJSData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.images = list;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    @NotNull
    public String toString() {
        return "ChoosePhotosData(statusCode=" + this.statusCode + ", images=" + this.images + ")";
    }
}
