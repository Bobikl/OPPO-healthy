package com.heytap.store.liveservice.widget;

import com.heytap.log.consts.LogSenderConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/liveservice/widget/LottieConfig;", "", LogSenderConst.FILENAME, "", "imagePath", "(Ljava/lang/String;Ljava/lang/String;)V", "getFileName", "()Ljava/lang/String;", "getImagePath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "livevideo-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class LottieConfig {

    @NotNull
    private final String fileName;

    @Nullable
    private final String imagePath;

    public LottieConfig(@NotNull String fileName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.fileName = fileName;
        this.imagePath = str;
    }

    public static /* synthetic */ LottieConfig copy$default(LottieConfig lottieConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lottieConfig.fileName;
        }
        if ((i & 2) != 0) {
            str2 = lottieConfig.imagePath;
        }
        return lottieConfig.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImagePath() {
        return this.imagePath;
    }

    @NotNull
    public final LottieConfig copy(@NotNull String fileName, @Nullable String imagePath) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new LottieConfig(fileName, imagePath);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LottieConfig)) {
            return false;
        }
        LottieConfig lottieConfig = (LottieConfig) other;
        return Intrinsics.areEqual(this.fileName, lottieConfig.fileName) && Intrinsics.areEqual(this.imagePath, lottieConfig.imagePath);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getImagePath() {
        return this.imagePath;
    }

    public int hashCode() {
        int iHashCode = this.fileName.hashCode() * 31;
        String str = this.imagePath;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "LottieConfig(fileName=" + this.fileName + ", imagePath=" + this.imagePath + ")";
    }
}
