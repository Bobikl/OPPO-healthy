package com.oplusos.vfxmodelviewer.utils;

import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u001d\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010(\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010)\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010)\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020/H\u0086\u0002J\u0019\u0010-\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0086\u0002J\u0011\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u000202H\u0086\u0002J\u0019\u0010-\u001a\u00020\u00002\u0006\u00100\u001a\u0002022\u0006\u00101\u001a\u000202H\u0086\u0002J\t\u00103\u001a\u000202HÖ\u0001J\t\u00104\u001a\u00020\u0000H\u0086\u0002J\u0011\u00105\u001a\u00020\u00032\u0006\u0010.\u001a\u000202H\u0086\nJ\u0011\u00106\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u00106\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0011\u00107\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u00107\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ!\u00108\u001a\u0002092\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u00108\u001a\u0002092\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u00108\u001a\u0002092\u0006\u0010.\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u00108\u001a\u0002092\u0006\u00100\u001a\u0002022\u0006\u00101\u001a\u0002022\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010:\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010:\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\t\u0010;\u001a\u00020<HÖ\u0001J \u0010=\u001a\u00020\u00002\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030?H\u0086\bø\u0001\u0000J\t\u0010@\u001a\u00020\u0000H\u0086\u0002R&\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R&\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u0004R&\u0010\u0011\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0005R&\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0004R&\u0010\u0018\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0005R&\u0010\u001b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u0004R&\u0010 \u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0005R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Float2;", "", "v", "", "(F)V", "(Lcom/oplusos/vfxmodelviewer/utils/Float2;)V", "x", "y", "(FF)V", "value", b2n.f, "getG", "()F", "setG", "r", "getR", "setR", "rg", "getRg", "()Lcom/oplusos/vfxmodelviewer/utils/Float2;", "setRg", "s", "getS", "setS", "st", "getSt", "setSt", "t", "getT", "setT", "getX", "setX", "xy", "getXy", "setXy", "getY", "setY", "component1", "component2", "copy", "dec", "div", "equals", "", "other", ParserTag.TAG_GET, "index", "Lcom/oplusos/vfxmodelviewer/utils/VectorComponent;", "index1", "index2", "", "hashCode", "inc", "invoke", "minus", "plus", "set", "", "times", "toString", "", "transform", "block", "Lkotlin/Function1;", "unaryMinus", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Float2 {
    private float x;
    private float y;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VectorComponent.values().length];
            iArr[VectorComponent.X.ordinal()] = 1;
            iArr[VectorComponent.R.ordinal()] = 2;
            iArr[VectorComponent.S.ordinal()] = 3;
            iArr[VectorComponent.Y.ordinal()] = 4;
            iArr[VectorComponent.G.ordinal()] = 5;
            iArr[VectorComponent.T.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Float2() {
        float f = 0.0f;
        this(f, f, 3, null);
    }

    public static /* synthetic */ Float2 copy$default(Float2 float2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = float2.x;
        }
        if ((i & 2) != 0) {
            f2 = float2.y;
        }
        return float2.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @NotNull
    public final Float2 copy(float x, float y) {
        return new Float2(x, y);
    }

    @NotNull
    public final Float2 dec() {
        this.x -= 1.0f;
        this.y -= 1.0f;
        return this;
    }

    @NotNull
    public final Float2 div(float v) {
        return new Float2(getX() / v, getY() / v);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Float2)) {
            return false;
        }
        Float2 float2 = (Float2) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.x), (Object) Float.valueOf(float2.x)) && Intrinsics.areEqual((Object) Float.valueOf(this.y), (Object) Float.valueOf(float2.y));
    }

    public final float get(@NotNull VectorComponent index) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return this.x;
            case 4:
            case 5:
            case 6:
                return this.y;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    public final float getG() {
        return getY();
    }

    public final float getR() {
        return getX();
    }

    @NotNull
    public final Float2 getRg() {
        return new Float2(getX(), getY());
    }

    public final float getS() {
        return getX();
    }

    @NotNull
    public final Float2 getSt() {
        return new Float2(getX(), getY());
    }

    public final float getT() {
        return getY();
    }

    public final float getX() {
        return this.x;
    }

    @NotNull
    public final Float2 getXy() {
        return new Float2(getX(), getY());
    }

    public final float getY() {
        return this.y;
    }

    public int hashCode() {
        return (Float.hashCode(this.x) * 31) + Float.hashCode(this.y);
    }

    @NotNull
    public final Float2 inc() {
        this.x += 1.0f;
        this.y += 1.0f;
        return this;
    }

    public final float invoke(int index) {
        return get(index - 1);
    }

    @NotNull
    public final Float2 minus(float v) {
        return new Float2(getX() - v, getY() - v);
    }

    @NotNull
    public final Float2 plus(float v) {
        return new Float2(getX() + v, getY() + v);
    }

    public final void set(int index, float v) {
        if (index == 0) {
            this.x = v;
        } else {
            if (index != 1) {
                throw new IllegalArgumentException("index must be in 0..1");
            }
            this.y = v;
        }
    }

    public final void setG(float f) {
        setY(f);
    }

    public final void setR(float f) {
        setX(f);
    }

    public final void setRg(@NotNull Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setS(float f) {
        setX(f);
    }

    public final void setSt(@NotNull Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setT(float f) {
        setY(f);
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final void setXy(@NotNull Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setY(float f) {
        this.y = f;
    }

    @NotNull
    public final Float2 times(float v) {
        return new Float2(getX() * v, getY() * v);
    }

    @NotNull
    public String toString() {
        return "Float2(x=" + this.x + ", y=" + this.y + ')';
    }

    @NotNull
    public final Float2 transform(@NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        setX(block.invoke(Float.valueOf(getX())).floatValue());
        setY(block.invoke(Float.valueOf(getY())).floatValue());
        return this;
    }

    @NotNull
    public final Float2 unaryMinus() {
        return new Float2(-this.x, -this.y);
    }

    public Float2(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    @NotNull
    public final Float2 div(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(getX() / v.getX(), getY() / v.getY());
    }

    @NotNull
    public final Float2 minus(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(getX() - v.getX(), getY() - v.getY());
    }

    @NotNull
    public final Float2 plus(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(getX() + v.getX(), getY() + v.getY());
    }

    @NotNull
    public final Float2 times(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2(getX() * v.getX(), getY() * v.getY());
    }

    public /* synthetic */ Float2(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public Float2(float f) {
        this(f, f);
    }

    public final void set(int index1, int index2, float v) {
        set(index1, v);
        set(index2, v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float2(@NotNull Float2 v) {
        this(v.x, v.y);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @NotNull
    public final Float2 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Float2(get(index1), get(index2));
    }

    public final float get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        throw new IllegalArgumentException("index must be in 0..1");
    }

    public final void set(@NotNull VectorComponent index, float v) {
        Intrinsics.checkNotNullParameter(index, "index");
        switch (WhenMappings.$EnumSwitchMapping$0[index.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.x = v;
                return;
            case 4:
            case 5:
            case 6:
                this.y = v;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, R, G, S or T");
        }
    }

    @NotNull
    public final Float2 get(int index1, int index2) {
        return new Float2(get(index1), get(index2));
    }

    public final void set(@NotNull VectorComponent index1, @NotNull VectorComponent index2, float v) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        set(index1, v);
        set(index2, v);
    }
}
