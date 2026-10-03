package com.oplusos.vfxmodelviewer.utils;

import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0086\u0002J\u0019\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\u0002J\u0011\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\u0002J\u0019\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\u0002J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0000H\u0086\u0002J\u0019\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001cH\u0086\u0002J!\u0010\u001f\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0011\u0010!\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0011\u0010\"\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0019\u0010#\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0005H\u0086\u0002J!\u0010#\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010$\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0086\u0002J\u0006\u0010%\u001a\u00020&J\b\u0010'\u001a\u00020(H\u0016J\t\u0010)\u001a\u00020\u0000H\u0086\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006+"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Mat2;", "", "m", "(Lcom/oplusos/vfxmodelviewer/utils/Mat2;)V", "x", "Lcom/oplusos/vfxmodelviewer/utils/Float2;", "y", "(Lcom/oplusos/vfxmodelviewer/utils/Float2;Lcom/oplusos/vfxmodelviewer/utils/Float2;)V", "getX", "()Lcom/oplusos/vfxmodelviewer/utils/Float2;", "setX", "(Lcom/oplusos/vfxmodelviewer/utils/Float2;)V", "getY", "setY", "component1", "component2", "copy", "dec", "div", "v", "", "equals", "", "other", ParserTag.TAG_GET, "column", "Lcom/oplusos/vfxmodelviewer/utils/MatrixColumn;", "row", "", "hashCode", "inc", "invoke", "", "minus", "plus", "set", "times", "toFloatArray", "", "toString", "", "unaryMinus", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Mat2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private Float2 x;

    @NotNull
    private Float2 y;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¨\u0006\t"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Mat2$Companion;", "", "()V", "identity", "Lcom/oplusos/vfxmodelviewer/utils/Mat2;", "of", "a", "", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Mat2 identity() {
            Float2 float2 = null;
            return new Mat2(float2, float2, 3, float2);
        }

        @NotNull
        public final Mat2 of(@NotNull float... a) {
            Intrinsics.checkNotNullParameter(a, "a");
            if (a.length >= 4) {
                return new Mat2(new Float2(a[0], a[2]), new Float2(a[1], a[3]));
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatrixColumn.values().length];
            iArr[MatrixColumn.X.ordinal()] = 1;
            iArr[MatrixColumn.Y.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Mat2() {
        Float2 float2 = null;
        this(float2, float2, 3, float2);
    }

    public static /* synthetic */ Mat2 copy$default(Mat2 mat2, Float2 float2, Float2 float3, int i, Object obj) {
        if ((i & 1) != 0) {
            float2 = mat2.x;
        }
        if ((i & 2) != 0) {
            float3 = mat2.y;
        }
        return mat2.copy(float2, float3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float2 getX() {
        return this.x;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float2 getY() {
        return this.y;
    }

    @NotNull
    public final Mat2 copy(@NotNull Float2 x, @NotNull Float2 y) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        return new Mat2(x, y);
    }

    @NotNull
    public final Mat2 dec() {
        this.x = this.x.dec();
        this.y = this.y.dec();
        return this;
    }

    @NotNull
    public final Mat2 div(float v) {
        Float2 float2 = this.x;
        Float2 float3 = new Float2(float2.getX() / v, float2.getY() / v);
        Float2 float4 = this.y;
        return new Mat2(float3, new Float2(float4.getX() / v, float4.getY() / v));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mat2)) {
            return false;
        }
        Mat2 mat2 = (Mat2) other;
        return Intrinsics.areEqual(this.x, mat2.x) && Intrinsics.areEqual(this.y, mat2.y);
    }

    @NotNull
    public final Float2 get(int column) {
        if (column == 0) {
            return this.x;
        }
        if (column == 1) {
            return this.y;
        }
        throw new IllegalArgumentException("column must be in 0..1");
    }

    @NotNull
    public final Float2 getX() {
        return this.x;
    }

    @NotNull
    public final Float2 getY() {
        return this.y;
    }

    public int hashCode() {
        return (this.x.hashCode() * 31) + this.y.hashCode();
    }

    @NotNull
    public final Mat2 inc() {
        this.x = this.x.inc();
        this.y = this.y.inc();
        return this;
    }

    public final float invoke(int row, int column) {
        return get(column - 1).get(row - 1);
    }

    @NotNull
    public final Mat2 minus(float v) {
        Float2 float2 = this.x;
        Float2 float3 = new Float2(float2.getX() - v, float2.getY() - v);
        Float2 float4 = this.y;
        return new Mat2(float3, new Float2(float4.getX() - v, float4.getY() - v));
    }

    @NotNull
    public final Mat2 plus(float v) {
        Float2 float2 = this.x;
        Float2 float3 = new Float2(float2.getX() + v, float2.getY() + v);
        Float2 float4 = this.y;
        return new Mat2(float3, new Float2(float4.getX() + v, float4.getY() + v));
    }

    public final void set(int column, @NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Float2 float2 = get(column);
        float2.setX(v.getX());
        float2.setY(v.getY());
    }

    public final void setX(@NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "<set-?>");
        this.x = float2;
    }

    public final void setY(@NotNull Float2 float2) {
        Intrinsics.checkNotNullParameter(float2, "<set-?>");
        this.y = float2;
    }

    @NotNull
    public final Mat2 times(float v) {
        Float2 float2 = this.x;
        Float2 float3 = new Float2(float2.getX() * v, float2.getY() * v);
        Float2 float4 = this.y;
        return new Mat2(float3, new Float2(float4.getX() * v, float4.getY() * v));
    }

    @NotNull
    public final float[] toFloatArray() {
        return new float[]{this.x.getX(), this.y.getX(), this.x.getY(), this.y.getY()};
    }

    @NotNull
    public String toString() {
        return StringsKt.trimIndent("\n            |" + this.x.getX() + ' ' + this.y.getX() + "|\n            |" + this.x.getY() + ' ' + this.y.getY() + "|\n            ");
    }

    @NotNull
    public final Mat2 unaryMinus() {
        return new Mat2(this.x.unaryMinus(), this.y.unaryMinus());
    }

    public Mat2(@NotNull Float2 float2, @NotNull Float2 float3) {
        Intrinsics.checkNotNullParameter(float2, "x");
        Intrinsics.checkNotNullParameter(float3, "y");
        this.x = float2;
        this.y = float3;
    }

    public final void invoke(int row, int column, float v) {
        set(column - 1, row - 1, v);
    }

    public final float get(int column, int row) {
        return get(column).get(row);
    }

    public final void set(int column, int row, float v) {
        get(column).set(row, v);
    }

    public /* synthetic */ Mat2(Float2 float2, Float2 float3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Float2(1.0f, vr3.UNSET, 2, null) : float2, (i & 2) != 0 ? new Float2(vr3.UNSET, 1.0f, 1, null) : float3);
    }

    @NotNull
    public final Float2 get(@NotNull MatrixColumn column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int i = WhenMappings.$EnumSwitchMapping$0[column.ordinal()];
        if (i == 1) {
            return this.x;
        }
        if (i == 2) {
            return this.y;
        }
        throw new IllegalArgumentException("column must be X or Y");
    }

    @NotNull
    public final Mat2 times(@NotNull Mat2 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return new Mat2(new Float2((this.x.getX() * m.x.getX()) + (this.y.getX() * m.x.getY()), (this.x.getY() * m.x.getX()) + (this.y.getY() * m.x.getY())), new Float2((this.x.getX() * m.y.getX()) + (this.y.getX() * m.y.getY()), (this.x.getY() * m.y.getX()) + (this.y.getY() * m.y.getY())));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat2(@NotNull Mat2 mat2) {
        this(Float2.copy$default(mat2.x, vr3.UNSET, vr3.UNSET, 3, null), Float2.copy$default(mat2.y, vr3.UNSET, vr3.UNSET, 3, null));
        Intrinsics.checkNotNullParameter(mat2, "m");
    }

    public final float get(@NotNull MatrixColumn column, int row) {
        Intrinsics.checkNotNullParameter(column, "column");
        return get(column).get(row);
    }

    @NotNull
    public final Float2 times(@NotNull Float2 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float2((this.x.getX() * v.getX()) + (this.y.getX() * v.getY()), (this.x.getY() * v.getX()) + (this.y.getY() * v.getY()));
    }
}
