package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\u0010HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010#J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\u0094\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\fHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 ¨\u0006;"}, d2 = {"Lcom/oplus/vfxsdk/common/Uniform;", "", "name", "", "type", "value", "x", "", "y", "z", "w", "width", "", "height", "format", "flip", "", "wrapMode", "mediaType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;FFFFIIIZLjava/lang/Integer;Ljava/lang/String;)V", "getFlip", "()Z", "getFormat", "()I", "getHeight", "getMediaType", "()Ljava/lang/String;", "getName", "getType", "getValue", "()Ljava/lang/Object;", "getW", "()F", "getWidth", "getWrapMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getX", "getY", "getZ", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;FFFFIIIZLjava/lang/Integer;Ljava/lang/String;)Lcom/oplus/vfxsdk/common/Uniform;", "equals", "other", "hashCode", "toString", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Uniform {
    private final boolean flip;
    private final int format;
    private final int height;

    @NotNull
    private final String mediaType;

    @NotNull
    private final String name;

    @NotNull
    private final String type;

    @Nullable
    private final Object value;
    private final float w;
    private final int width;

    @Nullable
    private final Integer wrapMode;
    private final float x;
    private final float y;
    private final float z;

    public Uniform(@NotNull String str, @NotNull String str2, @Nullable Object obj, float f, float f2, float f3, float f4, int i, int i2, int i3, boolean z, @Nullable Integer num, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, "mediaType");
        this.name = str;
        this.type = str2;
        this.value = obj;
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
        this.width = i;
        this.height = i2;
        this.format = i3;
        this.flip = z;
        this.wrapMode = num;
        this.mediaType = str3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getFlip() {
        return this.flip;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getWrapMode() {
        return this.wrapMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final Uniform copy(@NotNull String name, @NotNull String type, @Nullable Object value, float x, float y, float z, float w, int width, int height, int format, boolean flip, @Nullable Integer wrapMode, @NotNull String mediaType) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new Uniform(name, type, value, x, y, z, w, width, height, format, flip, wrapMode, mediaType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uniform)) {
            return false;
        }
        Uniform uniform = (Uniform) other;
        return Intrinsics.areEqual(this.name, uniform.name) && Intrinsics.areEqual(this.type, uniform.type) && Intrinsics.areEqual(this.value, uniform.value) && Float.compare(this.x, uniform.x) == 0 && Float.compare(this.y, uniform.y) == 0 && Float.compare(this.z, uniform.z) == 0 && Float.compare(this.w, uniform.w) == 0 && this.width == uniform.width && this.height == uniform.height && this.format == uniform.format && this.flip == uniform.flip && Intrinsics.areEqual(this.wrapMode, uniform.wrapMode) && Intrinsics.areEqual(this.mediaType, uniform.mediaType);
    }

    public final boolean getFlip() {
        return this.flip;
    }

    public final int getFormat() {
        return this.format;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getMediaType() {
        return this.mediaType;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final Object getValue() {
        return this.value;
    }

    public final float getW() {
        return this.w;
    }

    public final int getWidth() {
        return this.width;
    }

    @Nullable
    public final Integer getWrapMode() {
        return this.wrapMode;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24 */
    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.type.hashCode()) * 31;
        Object obj = this.value;
        int iHashCode2 = (((((((((((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + Float.hashCode(this.x)) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z)) * 31) + Float.hashCode(this.w)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.format)) * 31;
        boolean z = this.flip;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        Integer num = this.wrapMode;
        return ((i + (num != null ? num.hashCode() : 0)) * 31) + this.mediaType.hashCode();
    }

    @NotNull
    public String toString() {
        return "Uniform(name=" + this.name + ", type=" + this.type + ", value=" + this.value + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", w=" + this.w + ", width=" + this.width + ", height=" + this.height + ", format=" + this.format + ", flip=" + this.flip + ", wrapMode=" + this.wrapMode + ", mediaType=" + this.mediaType + ")";
    }

    public /* synthetic */ Uniform(String str, String str2, Object obj, float f, float f2, float f3, float f4, int i, int i2, int i3, boolean z, Integer num, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, obj, f, f2, f3, f4, (i4 & 128) != 0 ? 100 : i, (i4 & 256) != 0 ? 100 : i2, (i4 & 512) != 0 ? 0 : i3, (i4 & 1024) != 0 ? true : z, (i4 & 2048) != 0 ? 10497 : num, (i4 & 4096) != 0 ? "" : str3);
    }
}
