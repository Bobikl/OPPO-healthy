package com.oplusos.vfxmodelviewer.utils;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.smartenginehelper.ParserTag;
import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__IndentKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000¢\u0006\u0002\u0010\u0003B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001eH\u0086\u0002J\u0019\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0086\u0002J\u0011\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020 H\u0086\u0002J\u0019\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 H\u0086\u0002J\t\u0010!\u001a\u00020 HÖ\u0001J\t\u0010\"\u001a\u00020\u0000H\u0086\u0002J\u0019\u0010#\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020 H\u0086\u0002J!\u0010#\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0011\u0010%\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0011\u0010&\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0019\u0010'\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J!\u0010'\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0011\u0010(\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J\u0011\u0010(\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010(\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\u0002J\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020,H\u0016J\t\u0010-\u001a\u00020\u0000H\u0086\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006/"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Mat3;", "", LogFieldKey.MESSAGE_KEY, "(Lcom/oplusos/vfxmodelviewer/utils/Mat3;)V", "x", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "y", "z", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;Lcom/oplusos/vfxmodelviewer/utils/Float3;Lcom/oplusos/vfxmodelviewer/utils/Float3;)V", "getX", "()Lcom/oplusos/vfxmodelviewer/utils/Float3;", "setX", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;)V", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "copy", "dec", "div", "v", "", "equals", "", "other", ParserTag.TAG_GET, "column", "Lcom/oplusos/vfxmodelviewer/utils/MatrixColumn;", "row", "", "hashCode", "inc", "invoke", "", "minus", "plus", "set", "times", "toFloatArray", "", "toString", "", "unaryMinus", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Mat3 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private Float3 x;

    @NotNull
    private Float3 y;

    @NotNull
    private Float3 z;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¨\u0006\t"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Mat3$Companion;", "", "()V", ServiceNodeBundleKeys.IDENTITY, "Lcom/oplusos/vfxmodelviewer/utils/Mat3;", "of", "a", "", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Mat3 identity() {
            return new Mat3(null, null, null, 7, null);
        }

        @NotNull
        public final Mat3 of(@NotNull float... a) {
            Intrinsics.checkNotNullParameter(a, "a");
            if (a.length >= 9) {
                return new Mat3(new Float3(a[0], a[3], a[6]), new Float3(a[1], a[4], a[7]), new Float3(a[2], a[5], a[8]));
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
            iArr[MatrixColumn.Z.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Mat3() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Mat3 copy$default(Mat3 mat3, Float3 float3, Float3 float4, Float3 float5, int i, Object obj) {
        if ((i & 1) != 0) {
            float3 = mat3.x;
        }
        if ((i & 2) != 0) {
            float4 = mat3.y;
        }
        if ((i & 4) != 0) {
            float5 = mat3.z;
        }
        return mat3.copy(float3, float4, float5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float3 getX() {
        return this.x;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float3 getY() {
        return this.y;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float3 getZ() {
        return this.z;
    }

    @NotNull
    public final Mat3 copy(@NotNull Float3 x, @NotNull Float3 y, @NotNull Float3 z) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        Intrinsics.checkNotNullParameter(z, "z");
        return new Mat3(x, y, z);
    }

    @NotNull
    public final Mat3 dec() {
        this.x = this.x.dec();
        this.y = this.y.dec();
        this.z = this.z.dec();
        return this;
    }

    @NotNull
    public final Mat3 div(float v) {
        Float3 float3 = this.x;
        Float3 float4 = new Float3(float3.getX() / v, float3.getY() / v, float3.getZ() / v);
        Float3 float5 = this.y;
        Float3 float6 = new Float3(float5.getX() / v, float5.getY() / v, float5.getZ() / v);
        Float3 float7 = this.z;
        return new Mat3(float4, float6, new Float3(float7.getX() / v, float7.getY() / v, float7.getZ() / v));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mat3)) {
            return false;
        }
        Mat3 mat3 = (Mat3) other;
        return Intrinsics.areEqual(this.x, mat3.x) && Intrinsics.areEqual(this.y, mat3.y) && Intrinsics.areEqual(this.z, mat3.z);
    }

    @NotNull
    public final Float3 get(int column) {
        if (column == 0) {
            return this.x;
        }
        if (column == 1) {
            return this.y;
        }
        if (column == 2) {
            return this.z;
        }
        throw new IllegalArgumentException("column must be in 0..2");
    }

    @NotNull
    public final Float3 getX() {
        return this.x;
    }

    @NotNull
    public final Float3 getY() {
        return this.y;
    }

    @NotNull
    public final Float3 getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((this.x.hashCode() * 31) + this.y.hashCode()) * 31) + this.z.hashCode();
    }

    @NotNull
    public final Mat3 inc() {
        this.x = this.x.inc();
        this.y = this.y.inc();
        this.z = this.z.inc();
        return this;
    }

    public final float invoke(int row, int column) {
        return get(column - 1).get(row - 1);
    }

    @NotNull
    public final Mat3 minus(float v) {
        Float3 float3 = this.x;
        Float3 float4 = new Float3(float3.getX() - v, float3.getY() - v, float3.getZ() - v);
        Float3 float5 = this.y;
        Float3 float6 = new Float3(float5.getX() - v, float5.getY() - v, float5.getZ() - v);
        Float3 float7 = this.z;
        return new Mat3(float4, float6, new Float3(float7.getX() - v, float7.getY() - v, float7.getZ() - v));
    }

    @NotNull
    public final Mat3 plus(float v) {
        Float3 float3 = this.x;
        Float3 float4 = new Float3(float3.getX() + v, float3.getY() + v, float3.getZ() + v);
        Float3 float5 = this.y;
        Float3 float6 = new Float3(float5.getX() + v, float5.getY() + v, float5.getZ() + v);
        Float3 float7 = this.z;
        return new Mat3(float4, float6, new Float3(float7.getX() + v, float7.getY() + v, float7.getZ() + v));
    }

    public final void set(int column, @NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Float3 float3 = get(column);
        float3.setX(v.getX());
        float3.setY(v.getY());
        float3.setZ(v.getZ());
    }

    public final void setX(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.x = float3;
    }

    public final void setY(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.y = float3;
    }

    public final void setZ(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "<set-?>");
        this.z = float3;
    }

    @NotNull
    public final Mat3 times(float v) {
        Float3 float3 = this.x;
        Float3 float4 = new Float3(float3.getX() * v, float3.getY() * v, float3.getZ() * v);
        Float3 float5 = this.y;
        Float3 float6 = new Float3(float5.getX() * v, float5.getY() * v, float5.getZ() * v);
        Float3 float7 = this.z;
        return new Mat3(float4, float6, new Float3(float7.getX() * v, float7.getY() * v, float7.getZ() * v));
    }

    @NotNull
    public final float[] toFloatArray() {
        return new float[]{this.x.getX(), this.y.getX(), this.z.getX(), this.x.getY(), this.y.getY(), this.z.getY(), this.x.getZ(), this.y.getZ(), this.z.getZ()};
    }

    @NotNull
    public String toString() {
        return StringsKt__IndentKt.trimIndent("\n            |" + this.x.getX() + StringUtil.SPACE + this.y.getX() + StringUtil.SPACE + this.z.getX() + "|\n            |" + this.x.getY() + StringUtil.SPACE + this.y.getY() + StringUtil.SPACE + this.z.getY() + "|\n            |" + this.x.getZ() + StringUtil.SPACE + this.y.getZ() + StringUtil.SPACE + this.z.getZ() + "|\n            ");
    }

    @NotNull
    public final Mat3 unaryMinus() {
        return new Mat3(this.x.unaryMinus(), this.y.unaryMinus(), this.z.unaryMinus());
    }

    public Mat3(@NotNull Float3 x, @NotNull Float3 y, @NotNull Float3 z) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        Intrinsics.checkNotNullParameter(z, "z");
        this.x = x;
        this.y = y;
        this.z = z;
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

    public /* synthetic */ Mat3(Float3 float3, Float3 float4, Float3 float5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Float3(1.0f, 0.0f, 0.0f, 6, null) : float3, (i & 2) != 0 ? new Float3(0.0f, 1.0f, 0.0f, 5, null) : float4, (i & 4) != 0 ? new Float3(0.0f, 0.0f, 1.0f, 3, null) : float5);
    }

    @NotNull
    public final Float3 get(@NotNull MatrixColumn column) {
        Intrinsics.checkNotNullParameter(column, "column");
        int i = WhenMappings.$EnumSwitchMapping$0[column.ordinal()];
        if (i == 1) {
            return this.x;
        }
        if (i == 2) {
            return this.y;
        }
        if (i == 3) {
            return this.z;
        }
        throw new IllegalArgumentException("column must be X, Y or Z");
    }

    @NotNull
    public final Mat3 times(@NotNull Mat3 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return new Mat3(new Float3((this.x.getX() * m.x.getX()) + (this.y.getX() * m.x.getY()) + (this.z.getX() * m.x.getZ()), (this.x.getY() * m.x.getX()) + (this.y.getY() * m.x.getY()) + (this.z.getY() * m.x.getZ()), (this.x.getZ() * m.x.getX()) + (this.y.getZ() * m.x.getY()) + (this.z.getZ() * m.x.getZ())), new Float3((this.x.getX() * m.y.getX()) + (this.y.getX() * m.y.getY()) + (this.z.getX() * m.y.getZ()), (this.x.getY() * m.y.getX()) + (this.y.getY() * m.y.getY()) + (this.z.getY() * m.y.getZ()), (this.x.getZ() * m.y.getX()) + (this.y.getZ() * m.y.getY()) + (this.z.getZ() * m.y.getZ())), new Float3((this.x.getX() * m.z.getX()) + (this.y.getX() * m.z.getY()) + (this.z.getX() * m.z.getZ()), (this.x.getY() * m.z.getX()) + (this.y.getY() * m.z.getY()) + (this.z.getY() * m.z.getZ()), (this.x.getZ() * m.z.getX()) + (this.y.getZ() * m.z.getY()) + (this.z.getZ() * m.z.getZ())));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat3(@NotNull Mat3 m) {
        this(Float3.copy$default(m.x, 0.0f, 0.0f, 0.0f, 7, null), Float3.copy$default(m.y, 0.0f, 0.0f, 0.0f, 7, null), Float3.copy$default(m.z, 0.0f, 0.0f, 0.0f, 7, null));
        Intrinsics.checkNotNullParameter(m, "m");
    }

    public final float get(@NotNull MatrixColumn column, int row) {
        Intrinsics.checkNotNullParameter(column, "column");
        return get(column).get(row);
    }

    @NotNull
    public final Float3 times(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float3((this.x.getX() * v.getX()) + (this.y.getX() * v.getY()) + (this.z.getX() * v.getZ()), (this.x.getY() * v.getX()) + (this.y.getY() * v.getY()) + (this.z.getY() * v.getZ()), (this.x.getZ() * v.getX()) + (this.y.getZ() * v.getY()) + (this.z.getZ() * v.getZ()));
    }
}
