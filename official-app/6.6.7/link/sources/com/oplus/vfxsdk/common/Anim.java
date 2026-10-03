package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0001\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0001HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JF\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/oplus/vfxsdk/common/Anim;", "", "uniformName", "", "type", "bezier", "", "", "value", "duration", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Float;Ljava/lang/Object;J)V", "getBezier", "()[Ljava/lang/Float;", "[Ljava/lang/Float;", "getDuration", "()J", "getType", "()Ljava/lang/String;", "getUniformName", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Float;Ljava/lang/Object;J)Lcom/oplus/vfxsdk/common/Anim;", "equals", "", "other", "hashCode", "", "toString", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Anim {

    @NotNull
    private final Float[] bezier;
    private final long duration;

    @NotNull
    private final String type;

    @NotNull
    private final String uniformName;

    @NotNull
    private final Object value;

    public Anim(@NotNull String str, @NotNull String str2, @NotNull Float[] fArr, @NotNull Object obj, long j) {
        Intrinsics.checkNotNullParameter(str, "uniformName");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(fArr, "bezier");
        Intrinsics.checkNotNullParameter(obj, "value");
        this.uniformName = str;
        this.type = str2;
        this.bezier = fArr;
        this.value = obj;
        this.duration = j;
    }

    public static /* synthetic */ Anim copy$default(Anim anim, String str, String str2, Float[] fArr, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = anim.uniformName;
        }
        if ((i & 2) != 0) {
            str2 = anim.type;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            fArr = anim.bezier;
        }
        Float[] fArr2 = fArr;
        if ((i & 8) != 0) {
            obj = anim.value;
        }
        Object obj3 = obj;
        if ((i & 16) != 0) {
            j = anim.duration;
        }
        return anim.copy(str, str3, fArr2, obj3, j);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUniformName() {
        return this.uniformName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float[] getBezier() {
        return this.bezier;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final Anim copy(@NotNull String uniformName, @NotNull String type, @NotNull Float[] bezier, @NotNull Object value, long duration) {
        Intrinsics.checkNotNullParameter(uniformName, "uniformName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bezier, "bezier");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Anim(uniformName, type, bezier, value, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Anim)) {
            return false;
        }
        Anim anim = (Anim) other;
        return Intrinsics.areEqual(this.uniformName, anim.uniformName) && Intrinsics.areEqual(this.type, anim.type) && Intrinsics.areEqual(this.bezier, anim.bezier) && Intrinsics.areEqual(this.value, anim.value) && this.duration == anim.duration;
    }

    @NotNull
    public final Float[] getBezier() {
        return this.bezier;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getUniformName() {
        return this.uniformName;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((this.uniformName.hashCode() * 31) + this.type.hashCode()) * 31) + Arrays.hashCode(this.bezier)) * 31) + this.value.hashCode()) * 31) + Long.hashCode(this.duration);
    }

    @NotNull
    public String toString() {
        return "Anim(uniformName=" + this.uniformName + ", type=" + this.type + ", bezier=" + Arrays.toString(this.bezier) + ", value=" + this.value + ", duration=" + this.duration + ")";
    }
}
