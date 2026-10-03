package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/oplus/vfxsdk/common/UniformValue;", "", "name", "", "type", "values", "", ClickApiEntity.DELAY, "", "duration", "", "bezier", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;IJ[Ljava/lang/Float;)V", "getBezier", "()[Ljava/lang/Float;", "[Ljava/lang/Float;", "getDelay", "()I", "getDuration", "()J", "getName", "()Ljava/lang/String;", "getType", "getValues", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;IJ[Ljava/lang/Float;)Lcom/oplus/vfxsdk/common/UniformValue;", "equals", "", "other", "hashCode", "toString", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class UniformValue {

    @NotNull
    private final Float[] bezier;
    private final int delay;
    private final long duration;

    @NotNull
    private final String name;

    @NotNull
    private final String type;

    @NotNull
    private Object[] values;

    public UniformValue(@NotNull String str, @NotNull String str2, @NotNull Object[] objArr, int i, long j, @NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(objArr, "values");
        Intrinsics.checkNotNullParameter(fArr, "bezier");
        this.name = str;
        this.type = str2;
        this.values = objArr;
        this.delay = i;
        this.duration = j;
        this.bezier = fArr;
    }

    public static /* synthetic */ UniformValue copy$default(UniformValue uniformValue, String str, String str2, Object[] objArr, int i, long j, Float[] fArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = uniformValue.name;
        }
        if ((i2 & 2) != 0) {
            str2 = uniformValue.type;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            objArr = uniformValue.values;
        }
        Object[] objArr2 = objArr;
        if ((i2 & 8) != 0) {
            i = uniformValue.delay;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            j = uniformValue.duration;
        }
        long j2 = j;
        if ((i2 & 32) != 0) {
            fArr = uniformValue.bezier;
        }
        return uniformValue.copy(str, str3, objArr2, i3, j2, fArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object[] getValues() {
        return this.values;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDelay() {
        return this.delay;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Float[] getBezier() {
        return this.bezier;
    }

    @NotNull
    public final UniformValue copy(@NotNull String name, @NotNull String type, @NotNull Object[] values, int delay, long duration, @NotNull Float[] bezier) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(bezier, "bezier");
        return new UniformValue(name, type, values, delay, duration, bezier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniformValue)) {
            return false;
        }
        UniformValue uniformValue = (UniformValue) other;
        return Intrinsics.areEqual(this.name, uniformValue.name) && Intrinsics.areEqual(this.type, uniformValue.type) && Intrinsics.areEqual(this.values, uniformValue.values) && this.delay == uniformValue.delay && this.duration == uniformValue.duration && Intrinsics.areEqual(this.bezier, uniformValue.bezier);
    }

    @NotNull
    public final Float[] getBezier() {
        return this.bezier;
    }

    public final int getDelay() {
        return this.delay;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final Object[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.type.hashCode()) * 31) + Arrays.hashCode(this.values)) * 31) + Integer.hashCode(this.delay)) * 31) + Long.hashCode(this.duration)) * 31) + Arrays.hashCode(this.bezier);
    }

    public final void setValues(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.values = objArr;
    }

    @NotNull
    public String toString() {
        return "UniformValue(name=" + this.name + ", type=" + this.type + ", values=" + Arrays.toString(this.values) + ", delay=" + this.delay + ", duration=" + this.duration + ", bezier=" + Arrays.toString(this.bezier) + ")";
    }

    public /* synthetic */ UniformValue(String str, String str2, Object[] objArr, int i, long j, Float[] fArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, objArr, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? 400L : j, (i2 & 32) != 0 ? new Float[]{Float.valueOf(0.3f), Float.valueOf(vr3.UNSET), Float.valueOf(0.1f), Float.valueOf(1.0f)} : fArr);
    }
}
