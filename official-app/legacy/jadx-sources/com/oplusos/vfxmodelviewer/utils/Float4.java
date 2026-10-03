package com.oplusos.vfxmodelviewer.utils;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\nB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u000bB-\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J1\u0010U\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010V\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010W\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020]H\u0086\u0002J\u0019\u0010[\u001a\u00020\u00052\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]H\u0086\u0002J!\u0010[\u001a\u00020\t2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]H\u0086\u0002J)\u0010[\u001a\u00020\u00002\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010a\u001a\u00020]H\u0086\u0002J\u0011\u0010[\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020bH\u0086\u0002J\u0019\u0010[\u001a\u00020\u00052\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020bH\u0086\u0002J!\u0010[\u001a\u00020\t2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020bH\u0086\u0002J)\u0010[\u001a\u00020\u00002\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020b2\u0006\u0010a\u001a\u00020bH\u0086\u0002J\t\u0010c\u001a\u00020bHÖ\u0001J\t\u0010d\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010e\u001a\u00020\u00032\u0006\u0010\\\u001a\u00020bH\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010g\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ1\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010a\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J)\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010`\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010h\u001a\u00020i2\u0006\u0010\\\u001a\u00020]2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0019\u0010h\u001a\u00020i2\u0006\u0010\\\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J!\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J)\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J1\u0010h\u001a\u00020i2\u0006\u0010^\u001a\u00020b2\u0006\u0010_\u001a\u00020b2\u0006\u0010`\u001a\u00020b2\u0006\u0010a\u001a\u00020b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\u0002J\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0005H\u0086\nJ\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\tH\u0086\nJ\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\nJ\u0011\u0010j\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\nJ\t\u0010k\u001a\u00020lHÖ\u0001J \u0010m\u001a\u00020\u00002\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030oH\u0086\bø\u0001\u0000J\t\u0010p\u001a\u00020\u0000H\u0086\u0002R&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0004R&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0004R&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0004R&\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0004R&\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u001f\u0010\u0004R&\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0004R&\u0010#\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010(\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R&\u0010-\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u0010\u000bR&\u00101\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010\u0012\"\u0004\b3\u0010\u0004R&\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R&\u00107\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b8\u0010*\"\u0004\b9\u0010,R&\u0010:\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010/\"\u0004\b<\u0010\u000bR&\u0010=\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b>\u0010\u0012\"\u0004\b?\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0012\"\u0004\bA\u0010\u0004R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0012\"\u0004\bC\u0010\u0004R&\u0010D\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010%\"\u0004\bF\u0010'R&\u0010G\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t8Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bH\u0010*\"\u0004\bI\u0010,R&\u0010J\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00008Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010/\"\u0004\bL\u0010\u000bR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0012\"\u0004\bN\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0012\"\u0004\bP\u0010\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006q"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Float4;", "", "v", "", "(F)V", "Lcom/oplusos/vfxmodelviewer/utils/Float2;", "z", "w", "(Lcom/oplusos/vfxmodelviewer/utils/Float2;FF)V", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;F)V", "(Lcom/oplusos/vfxmodelviewer/utils/Float4;)V", "x", "y", "(FFFF)V", "value", "a", "getA", "()F", "setA", "b", "getB", "setB", b2n.f, "getG", "setG", LogFieldKey.PROCESS_NAME_KEY, "getP", "setP", "q", "getQ", "setQ", "r", "getR", "setR", "rg", "getRg", "()Lcom/oplusos/vfxmodelviewer/utils/Float2;", "setRg", "(Lcom/oplusos/vfxmodelviewer/utils/Float2;)V", "rgb", "getRgb", "()Lcom/oplusos/vfxmodelviewer/utils/Float3;", "setRgb", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;)V", "rgba", "getRgba", "()Lcom/oplusos/vfxmodelviewer/utils/Float4;", "setRgba", "s", "getS", "setS", "st", "getSt", "setSt", "stp", "getStp", "setStp", "stpq", "getStpq", "setStpq", "t", "getT", "setT", "getW", "setW", "getX", "setX", "xy", "getXy", "setXy", "xyz", "getXyz", "setXyz", "xyzw", "getXyzw", "setXyzw", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "component4", "copy", "dec", "div", "equals", "", "other", ParserTag.TAG_GET, "index", "Lcom/oplusos/vfxmodelviewer/utils/VectorComponent;", "index1", "index2", "index3", "index4", "", "hashCode", "inc", "invoke", "minus", "plus", "set", "", "times", "toString", "", "transform", "block", "Lkotlin/Function1;", "unaryMinus", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Float4 {
    private float w;
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
            iArr[VectorComponent.W.ordinal()] = 10;
            iArr[VectorComponent.A.ordinal()] = 11;
            iArr[VectorComponent.Q.ordinal()] = 12;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Float4() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ Float4 copy$default(Float4 float4, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = float4.x;
        }
        if ((i & 2) != 0) {
            f2 = float4.y;
        }
        if ((i & 4) != 0) {
            f3 = float4.z;
        }
        if ((i & 8) != 0) {
            f4 = float4.w;
        }
        return float4.copy(f, f2, f3, f4);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getW() {
        return this.w;
    }

    @NotNull
    public final Float4 copy(float x, float y, float z, float w) {
        return new Float4(x, y, z, w);
    }

    @NotNull
    public final Float4 dec() {
        this.x -= 1.0f;
        this.y -= 1.0f;
        this.z -= 1.0f;
        this.w -= 1.0f;
        return this;
    }

    @NotNull
    public final Float4 div(float v) {
        return new Float4(getX() / v, getY() / v, getZ() / v, getW() / v);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Float4)) {
            return false;
        }
        Float4 float4 = (Float4) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.x), (Object) Float.valueOf(float4.x)) && Intrinsics.areEqual((Object) Float.valueOf(this.y), (Object) Float.valueOf(float4.y)) && Intrinsics.areEqual((Object) Float.valueOf(this.z), (Object) Float.valueOf(float4.z)) && Intrinsics.areEqual((Object) Float.valueOf(this.w), (Object) Float.valueOf(float4.w));
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
            case 10:
            case 11:
            case 12:
                return this.w;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final float getA() {
        return getW();
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

    public final float getQ() {
        return getW();
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

    @NotNull
    public final Float4 getRgba() {
        return new Float4(getX(), getY(), getZ(), getW());
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

    @NotNull
    public final Float4 getStpq() {
        return new Float4(getX(), getY(), getZ(), getW());
    }

    public final float getT() {
        return getY();
    }

    public final float getW() {
        return this.w;
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

    @NotNull
    public final Float4 getXyzw() {
        return new Float4(getX(), getY(), getZ(), getW());
    }

    public final float getY() {
        return this.y;
    }

    public final float getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z)) * 31) + Float.hashCode(this.w);
    }

    @NotNull
    public final Float4 inc() {
        this.x += 1.0f;
        this.y += 1.0f;
        this.z += 1.0f;
        this.w += 1.0f;
        return this;
    }

    public final float invoke(int index) {
        return get(index - 1);
    }

    @NotNull
    public final Float4 minus(float v) {
        return new Float4(getX() - v, getY() - v, getZ() - v, getW() - v);
    }

    @NotNull
    public final Float4 plus(float v) {
        return new Float4(getX() + v, getY() + v, getZ() + v, getW() + v);
    }

    public final void set(int index, float v) {
        if (index == 0) {
            this.x = v;
            return;
        }
        if (index == 1) {
            this.y = v;
        } else if (index == 2) {
            this.z = v;
        } else {
            if (index != 3) {
                throw new IllegalArgumentException("index must be in 0..3");
            }
            this.w = v;
        }
    }

    public final void setA(float f) {
        setW(f);
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

    public final void setQ(float f) {
        setW(f);
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

    public final void setRgba(@NotNull Float4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
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

    public final void setStpq(@NotNull Float4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setT(float f) {
        setY(f);
    }

    public final void setW(float f) {
        this.w = f;
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

    public final void setXyzw(@NotNull Float4 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        setX(value.getX());
        setY(value.getY());
        setZ(value.getZ());
        setW(value.getW());
    }

    public final void setY(float f) {
        this.y = f;
    }

    public final void setZ(float f) {
        this.z = f;
    }

    @NotNull
    public final Float4 times(float v) {
        return new Float4(getX() * v, getY() * v, getZ() * v, getW() * v);
    }

    @NotNull
    public String toString() {
        return "Float4(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", w=" + this.w + ')';
    }

    @NotNull
    public final Float4 transform(@NotNull Function1<? super Float, Float> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        setX(block.invoke(Float.valueOf(getX())).floatValue());
        setY(block.invoke(Float.valueOf(getY())).floatValue());
        setZ(block.invoke(Float.valueOf(getZ())).floatValue());
        setW(block.invoke(Float.valueOf(getW())).floatValue());
        return this;
    }

    @NotNull
    public final Float4 unaryMinus() {
        return new Float4(-this.x, -this.y, -this.z, -this.w);
    }

    public Float4(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
    }

    @NotNull
    public final Float4 div(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() / v.getX(), getY() / v.getY(), getZ(), getW());
    }

    @NotNull
    public final Float4 minus(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() - v.getX(), getY() - v.getY(), getZ(), getW());
    }

    @NotNull
    public final Float4 plus(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() + v.getX(), getY() + v.getY(), getZ(), getW());
    }

    @NotNull
    public final Float4 times(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() * v.getX(), getY() * v.getY(), getZ(), getW());
    }

    @NotNull
    public final Float4 div(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() / v.getX(), getY() / v.getY(), getZ() / v.getZ(), getW());
    }

    @NotNull
    public final Float4 minus(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ(), getW());
    }

    @NotNull
    public final Float4 plus(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ(), getW());
    }

    @NotNull
    public final Float4 times(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() * v.getX(), getY() * v.getY(), getZ() * v.getZ(), getW());
    }

    @NotNull
    public final Float4 div(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() / v.getX(), getY() / v.getY(), getZ() / v.getZ(), getW() / v.getW());
    }

    @NotNull
    public final Float4 minus(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() - v.getX(), getY() - v.getY(), getZ() - v.getZ(), getW() - v.getW());
    }

    @NotNull
    public final Float4 plus(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() + v.getX(), getY() + v.getY(), getZ() + v.getZ(), getW() + v.getW());
    }

    @NotNull
    public final Float4 times(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4(getX() * v.getX(), getY() * v.getY(), getZ() * v.getZ(), getW() * v.getW());
    }

    @NotNull
    public final Float2 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        return new Float2(get(index1), get(index2));
    }

    public final void set(int index1, int index2, float v) {
        set(index1, v);
        set(index2, v);
    }

    public /* synthetic */ Float4(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    @NotNull
    public final Float3 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2, @NotNull VectorComponent index3) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        return new Float3(get(index1), get(index2), get(index3));
    }

    public Float4(float f) {
        this(f, f, f, f);
    }

    @NotNull
    public final Float4 get(@NotNull VectorComponent index1, @NotNull VectorComponent index2, @NotNull VectorComponent index3, @NotNull VectorComponent index4) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        return new Float4(get(index1), get(index2), get(index3), get(index4));
    }

    public final void set(int index1, int index2, int index3, float v) {
        set(index1, v);
        set(index2, v);
        set(index3, v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float4(@NotNull Float2 v, float f, float f2) {
        this(v.getX(), v.getY(), f, f2);
        Intrinsics.checkNotNullParameter(v, "v");
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
        if (index == 3) {
            return this.w;
        }
        throw new IllegalArgumentException("index must be in 0..3");
    }

    public /* synthetic */ Float4(Float2 float2, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(float2, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float4(@NotNull Float3 v, float f) {
        this(v.getX(), v.getY(), v.getZ(), f);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    public final void set(int index1, int index2, int index3, int index4, float v) {
        set(index1, v);
        set(index2, v);
        set(index3, v);
        set(index4, v);
    }

    public /* synthetic */ Float4(Float3 float3, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(float3, (i & 2) != 0 ? 0.0f : f);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Float4(@NotNull Float4 v) {
        this(v.x, v.y, v.z, v.w);
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @NotNull
    public final Float2 get(int index1, int index2) {
        return new Float2(get(index1), get(index2));
    }

    @NotNull
    public final Float3 get(int index1, int index2, int index3) {
        return new Float3(get(index1), get(index2), get(index3));
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
            case 10:
            case 11:
            case 12:
                this.w = v;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public final Float4 get(int index1, int index2, int index3, int index4) {
        return new Float4(get(index1), get(index2), get(index3), get(index4));
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

    public final void set(@NotNull VectorComponent index1, @NotNull VectorComponent index2, @NotNull VectorComponent index3, @NotNull VectorComponent index4, float v) {
        Intrinsics.checkNotNullParameter(index1, "index1");
        Intrinsics.checkNotNullParameter(index2, "index2");
        Intrinsics.checkNotNullParameter(index3, "index3");
        Intrinsics.checkNotNullParameter(index4, "index4");
        set(index1, v);
        set(index2, v);
        set(index3, v);
        set(index4, v);
    }
}
