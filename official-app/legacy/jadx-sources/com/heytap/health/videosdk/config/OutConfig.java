package com.heytap.health.videosdk.config;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/videosdk/config/OutConfig;", "", Fields.WIDTH_FIELD, "", Fields.HEIGHT_FIELD, "cropWidth", "cropHeight", "fps", "", "(IIIID)V", "getCropHeight", "()I", "getCropWidth", "getFps", "()D", "getHeight", "getWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class OutConfig {
    private final int cropHeight;
    private final int cropWidth;
    private final double fps;
    private final int height;
    private final int width;

    public OutConfig(int i, int i2, int i3, int i4, double d) {
        this.width = i;
        this.height = i2;
        this.cropWidth = i3;
        this.cropHeight = i4;
        this.fps = d;
    }

    public static /* synthetic */ OutConfig copy$default(OutConfig outConfig, int i, int i2, int i3, int i4, double d, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = outConfig.width;
        }
        if ((i5 & 2) != 0) {
            i2 = outConfig.height;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = outConfig.cropWidth;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = outConfig.cropHeight;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            d = outConfig.fps;
        }
        return outConfig.copy(i, i6, i7, i8, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCropWidth() {
        return this.cropWidth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCropHeight() {
        return this.cropHeight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getFps() {
        return this.fps;
    }

    @NotNull
    public final OutConfig copy(int width, int height, int cropWidth, int cropHeight, double fps) {
        return new OutConfig(width, height, cropWidth, cropHeight, fps);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutConfig)) {
            return false;
        }
        OutConfig outConfig = (OutConfig) other;
        return this.width == outConfig.width && this.height == outConfig.height && this.cropWidth == outConfig.cropWidth && this.cropHeight == outConfig.cropHeight && Intrinsics.areEqual((Object) Double.valueOf(this.fps), (Object) Double.valueOf(outConfig.fps));
    }

    public final int getCropHeight() {
        return this.cropHeight;
    }

    public final int getCropWidth() {
        return this.cropWidth;
    }

    public final double getFps() {
        return this.fps;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.cropWidth)) * 31) + Integer.hashCode(this.cropHeight)) * 31) + Double.hashCode(this.fps);
    }

    @NotNull
    public String toString() {
        return "OutConfig(width=" + this.width + ", height=" + this.height + ", cropWidth=" + this.cropWidth + ", cropHeight=" + this.cropHeight + ", fps=" + this.fps + ')';
    }

    public /* synthetic */ OutConfig(int i, int i2, int i3, int i4, double d, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, d);
    }
}
