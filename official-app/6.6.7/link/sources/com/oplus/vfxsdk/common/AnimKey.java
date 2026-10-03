package com.oplus.vfxsdk.common;

import androidx.annotation.Keep;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/oplus/vfxsdk/common/AnimKey;", "", ClickApiEntity.TIME, "", "value", "type", "", "bezier", "", "(FFLjava/lang/String;[Ljava/lang/Float;)V", "getBezier", "()[Ljava/lang/Float;", "[Ljava/lang/Float;", "getTime", "()F", "getType", "()Ljava/lang/String;", "getValue", "setValue", "(F)V", "component1", "component2", "component3", "component4", "copy", "(FFLjava/lang/String;[Ljava/lang/Float;)Lcom/oplus/vfxsdk/common/AnimKey;", "equals", "", "other", "hashCode", "", "toString", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnimKey {

    @NotNull
    private final Float[] bezier;
    private final float time;

    @NotNull
    private final String type;
    private float value;

    public AnimKey(float f, float f2, @NotNull String str, @NotNull Float[] fArr) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(fArr, "bezier");
        this.time = f;
        this.value = f2;
        this.type = str;
        this.bezier = fArr;
    }

    public static /* synthetic */ AnimKey copy$default(AnimKey animKey, float f, float f2, String str, Float[] fArr, int i, Object obj) {
        if ((i & 1) != 0) {
            f = animKey.time;
        }
        if ((i & 2) != 0) {
            f2 = animKey.value;
        }
        if ((i & 4) != 0) {
            str = animKey.type;
        }
        if ((i & 8) != 0) {
            fArr = animKey.bezier;
        }
        return animKey.copy(f, f2, str, fArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float[] getBezier() {
        return this.bezier;
    }

    @NotNull
    public final AnimKey copy(float time, float value, @NotNull String type, @NotNull Float[] bezier) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(bezier, "bezier");
        return new AnimKey(time, value, type, bezier);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimKey)) {
            return false;
        }
        AnimKey animKey = (AnimKey) other;
        return Float.compare(this.time, animKey.time) == 0 && Float.compare(this.value, animKey.value) == 0 && Intrinsics.areEqual(this.type, animKey.type) && Intrinsics.areEqual(this.bezier, animKey.bezier);
    }

    @NotNull
    public final Float[] getBezier() {
        return this.bezier;
    }

    public final float getTime() {
        return this.time;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.time) * 31) + Float.hashCode(this.value)) * 31) + this.type.hashCode()) * 31) + Arrays.hashCode(this.bezier);
    }

    public final void setValue(float f) {
        this.value = f;
    }

    @NotNull
    public String toString() {
        return "AnimKey(time=" + this.time + ", value=" + this.value + ", type=" + this.type + ", bezier=" + Arrays.toString(this.bezier) + ")";
    }
}
