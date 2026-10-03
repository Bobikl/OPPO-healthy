package com.oplusos.vfxmodelviewer.utils;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\bB#\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J'\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010?\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020FH\u0086\u0002J\u0019\u0010D\u001a\u00020\u00052\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020FH\u0086\u0002J!\u0010D\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010I\u001a\u00020FH\u0086\u0002J\u0011\u0010D\u001a\u00020\u00032\u0006\u0010E\u001a\u00020JH\u0086\u0002J\u0019\u0010D\u001a\u00020\u00052\u0006\u0010G\u001a\u00020J2\u0006\u0010H\u001a\u00020JH\u0086\u0002J!\u0010D\u001a\u00020\u00002\u0006\u0010G\u001a\u00020J2\u0006\u0010H\u001a\u00020J2\u0006\u0010I\u001a\u00020JH\u0086\u0002J\t\u0010K\u001a\u00020JHÖ\u0001J\t\u0010L\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010M\u001a\u00020\u00032\u0006\u0010E\u001a\u00020JH\u0086\nJ\u0011\u0010N\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010N\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010N\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0011\u0010O\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010O\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010O\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ)\u0010P\u001a\u00020Q2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010I\u001a\u00020F2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010P\u001a\u00020Q2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010P\u001a\u00020Q2\u0006\u0010E\u001a\u00020F2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010P\u001a\u00020Q2\u0006\u0010E\u001a\u00020J2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010P\u001a\u00020Q2\u0006\u0010G\u001a\u00020J2\u0006\u0010H\u001a\u00020J2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J)\u0010P\u001a\u00020Q2\u0006\u0010G\u001a\u00020J2\u0006\u0010H\u001a\u00020J2\u0006\u0010I\u001a\u00020J2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010R\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010R\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010R\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\t\u0010S\u001a\u00020THÖ\u0001J \u0010U\u001a\u00020\u00002\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030WH\u0086\bø\u0001\u0000J\t\u0010X\u001a\u00020\u0000H\u0086\u0002R&\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R&\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0004R&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0004R&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0004R&\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR&\u0010\u001f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010\bR&\u0010#\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0004R&\u0010&\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR&\u0010)\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010\bR&\u0010,\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0004R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u000f\"\u0004\b0\u0010\u0004R&\u00101\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u0010\u001eR&\u00104\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010!\"\u0004\b6\u0010\bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u000f\"\u0004\b:\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Y"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Float3;", "", "v", "", "(F)V", "Lcom/oplusos/vfxmodelviewer/utils/Float2;", "z", "(Lcom/oplusos/vfxmodelviewer/utils/Float2;F)V", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;)V", "x", "y", "(FFF)V", "value", "b", "getB", "()F", "setB", b2n.f, "getG", "setG", LogFieldKey.PROCESS_NAME_KEY, "getP", "setP", "r", "getR", "setR", "rg", "getRg", "()Lcom/oplusos/vfxmodelviewer/utils/Float2;", "setRg", "(Lcom/oplusos/vfxmodelviewer/utils/Float2;)V", "rgb", "getRgb", "()Lcom/oplusos/vfxmodelviewer/utils/Float3;", "setRgb", "s", "getS", "setS", "st", "getSt", "setSt", "stp", "getStp", "setStp", "t", "getT", "setT", "getX", "setX", "xy", "getXy", "setXy", "xyz", "getXyz", "setXyz", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "copy", "dec", "div", "equals", "", "other", ParserTag.TAG_GET, "index", "Lcom/oplusos/vfxmodelviewer/utils/VectorComponent;", "index1", "index2", "index3", "", "hashCode", "inc", "invoke", "minus", "plus", "set", "", "times", "toString", "", "transform", "block", "Lkotlin/Function1;", "unaryMinus", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Float3 {
    private float x;
    private float y;
    private float z;

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
            iArr[VectorComponent.Z.ordinal()] = 7;
            iArr[VectorComponent.B.ordinal()] = 8;
            iArr[VectorComponent.P.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Float3() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public static /* synthetic */ Float3 copy$default(Float3 float3, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = float3.x;
        }
        if ((i & 2) != 0) {
            f2 = float3.y;
        }
        if ((i & 4) != 0) {
            f3 = float3.z;
        }
        return float3.copy(f, f2, f3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getY() {
        return this.y;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getZ() {
        return this.z;
    }

    @NotNull
    public final Float3 copy(float x, float y, float z) {
        return new Float3(x, y, z);
    }

    @NotNull
    public final Float3 dec() {
        this.x -= 1.0f;
        this.y -= 1.0f;
        this.z -= 1.0f;
        return this;
    }

    @NotNull
    public final Float3 div(float v) {
        return new Float3(getX() / v, getY() / v, getZ() / v);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Float3)) {
            return false;
        }
        Float3 float3 = (Float3) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.x), (Object) Float.valueOf(float3.x)) && Intrinsics.areEqual((Object) Float.valueOf(this.y), (Object) Float.valueOf(float3.y)) && Intrinsics.areEqual((Object) Float.valueOf(this.z), (Object) Float.valueOf(float3.z));
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
            case 7:
            case 8:
            case 9:
                return this.z;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    public final float getB() {
        return getZ();
    }

    public final float getG() {
        return getY();
    }

    public final float getP() {
        return getZ();
    }

    public final float getR() {
        return getX();
    }

    @NotNull
    public final Float2 getRg() {
        return new Float2(getX(), getY());
    }

    @NotNull
    public final Float3 getRgb() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getS() {
        return getX();
    }

    @NotNull
    public final Float2 getSt() {
        return new Float2(getX(), getY());
    }

    @NotNull
    public final Float3 getStp() {
        return new Float3(getX(), getY(), getZ());
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

    @NotNull
    public final Float3 getXyz() {
        return new Float3(getX(), getY(), getZ());
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z);
    }

    @NotNull
    public final Float3 inc() {
        this.x += 1.0f;
        this.y += 1.0f;
        this.z += 1.0f;
        return this;
    }

    public final float invoke(int index) {
        return get(index - 1);
    }

    @NotNull
    public final Float3 minus(float v) {
        return new Float3(getX() - v, getY() - v, getZ() - v);
    }

    @NotNull
    public final Float3 plus(float v) {
        return new Float3(getX() + v, getY() + v, getZ() + v);
    }

    public final void set(int index, float v) {
        if (index == 0) {
            this.x = v;
        } else if (index == 1) {
            this.y = v;
        } else {
            if (index != 2) {
                throw new IllegalArgumentException("index must be in 0..2");
            }
            this.z = v;
        }
    }

    public final void setB(float f) {
        setZ(f);
    }

    public final void setG(float f) {
        setY(f);
    }

    public final void setP(float f) {
        setZ(f);
    }

    public final void setR(float f) {
        setX(f);
    }

    public final void setRg(@NotNull Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setRgb(@NotNull Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setS(float f) {
        setX(f);
    }

    public final void setSt(@NotNull Float2 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
    }

    public final void setStp(@NotNull Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
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

    public final void setXyz(@NotNull Float3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
    }

    public final void setY(float f) {
        this.y = f;
    }

    public final void setZ(float f) {
        this.z = f;
    }

    @NotNull
    public final Float3 times(float v) {
        return new Float3(getX() * v, getY() * v, getZ() * v);
    }

    @NotNull
    public String toString() {
        return "Float3(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ')';
    }

    @NotNull
    public final Float3 transform(@NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        setX(block.invoke(Float.valueOf(getX())).floatValue());
        setY(block.invoke(Float.valueOf(getY())).floatValue());
        setZ(block.invoke(Float.valueOf(getZ())).floatValue());
        return this;
    }

    @NotNull
    public final Float3 unaryMinus() {
        return new Float3(-this.x, -this.y, -this.z);
    }

    public Float3(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    @NotNull
    public final Float3 div(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() / v.getX(), getY() / v.getY(), getZ());
    }

    @NotNull
    public final Float3 minus(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() - v.getX(), getY() - v.getY(), getZ());
    }

    @NotNull
    public final Float3 plus(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() + v.getX(), getY() + v.getY(), getZ());
    }

    @NotNull
    public final Float3 times(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() * v.getX(), getY() * v.getY(), getZ());
    }

    public /* synthetic */ Float3(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3);
    }

    @NotNull
    public final Float3 div(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() / v.getX(), getY() / v.getY(), getZ() / v.getZ());
    }

    @NotNull
    public final Float3 minus(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ());
    }

    @NotNull
    public final Float3 plus(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ());
    }

    @NotNull
    public final Float3 times(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3(getX() * v.getX(), getY() * v.getY(), getZ() * v.getZ());
    }

    public Float3(float f) {
        this(f, f, f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float3(@NotNull Float2 v, float f) {
        this(v.getX(), v.getY(), f);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final void set(int index1, int index2, float v) {
        set(index1, v);
        set(index2, v);
    }

    public /* synthetic */ Float3(Float2 float2, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(float2, (i & 2) != 0 ? 0.0f : f);
    }

    @NotNull
    public final Float2 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Float2(get(index1), get(index2));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float3(@NotNull Float3 v) {
        this(v.x, v.y, v.z);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @NotNull
    public final Float3 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2, @NotNull VectorComponent index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new Float3(get(index1), get(index2), get(index3));
    }

    public final void set(int index1, int index2, int index3, float v) {
        set(index1, v);
        set(index2, v);
        set(index3, v);
    }

    public final float get(int index) {
        if (index == 0) {
            return this.x;
        }
        if (index == 1) {
            return this.y;
        }
        if (index == 2) {
            return this.z;
        }
        throw new IllegalArgumentException("index must be in 0..2");
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
            case 7:
            case 8:
            case 9:
                this.z = v;
                return;
            default:
                throw new IllegalArgumentException("index must be X, Y, Z, R, G, B, S, T or P");
        }
    }

    @NotNull
    public final Float2 get(int index1, int index2) {
        return new Float2(get(index1), get(index2));
    }

    @NotNull
    public final Float3 get(int index1, int index2, int index3) {
        return new Float3(get(index1), get(index2), get(index3));
    }

    public final void set(@NotNull VectorComponent index1, @NotNull VectorComponent index2, float v) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        set(index1, v);
        set(index2, v);
    }

    public final void set(@NotNull VectorComponent index1, @NotNull VectorComponent index2, @NotNull VectorComponent index3, float v) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        set(index1, v);
        set(index2, v);
        set(index3, v);
    }
}
