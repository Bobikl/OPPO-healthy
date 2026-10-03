package com.oplusos.vfxmodelviewer.utils;

import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ViewEntity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 M2\u00020\u0001:\u0001MB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u000f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0000¢\u0006\u0002\u0010\tB-\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J1\u00103\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000bHÆ\u0001J\t\u00104\u001a\u00020\u0000H\u0086\u0002J\u0011\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0011\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020=H\u0086\u0002J\u0019\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0086\u0002J\u0011\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020?H\u0086\u0002J\u0019\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020?2\u0006\u0010>\u001a\u00020?H\u0086\u0002J\t\u0010@\u001a\u00020?HÖ\u0001J\t\u0010A\u001a\u00020\u0000H\u0086\u0002J\u0019\u0010B\u001a\u0002072\u0006\u0010>\u001a\u00020?2\u0006\u0010<\u001a\u00020?H\u0086\u0002J!\u0010B\u001a\u00020C2\u0006\u0010>\u001a\u00020?2\u0006\u0010<\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0086\u0002J\u0011\u0010D\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0011\u0010E\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0019\u0010F\u001a\u00020C2\u0006\u0010<\u001a\u00020?2\u0006\u00106\u001a\u00020\u000bH\u0086\u0002J!\u0010F\u001a\u00020C2\u0006\u0010<\u001a\u00020?2\u0006\u0010>\u001a\u00020?2\u0006\u00106\u001a\u000207H\u0086\u0002J\u0011\u0010G\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0086\u0002J\u0011\u0010G\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010G\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0086\u0002J\u0006\u0010H\u001a\u00020IJ\b\u0010J\u001a\u00020KH\u0016J\t\u0010L\u001a\u00020\u0000H\u0086\u0002R&\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012R\u0012\u0010\u001b\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0012\u0010\u001d\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0012R&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00038Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u0012\u0010!\u001a\u00020\"8Æ\u0002¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010\u000e\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(¨\u0006N"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Mat4;", "", "right", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "up", "forward", "position", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;Lcom/oplusos/vfxmodelviewer/utils/Float3;Lcom/oplusos/vfxmodelviewer/utils/Float3;Lcom/oplusos/vfxmodelviewer/utils/Float3;)V", "m", "(Lcom/oplusos/vfxmodelviewer/utils/Mat4;)V", "x", "Lcom/oplusos/vfxmodelviewer/utils/Float4;", "y", "z", "w", "(Lcom/oplusos/vfxmodelviewer/utils/Float4;Lcom/oplusos/vfxmodelviewer/utils/Float4;Lcom/oplusos/vfxmodelviewer/utils/Float4;Lcom/oplusos/vfxmodelviewer/utils/Float4;)V", "value", "getForward", "()Lcom/oplusos/vfxmodelviewer/utils/Float3;", "setForward", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;)V", "getPosition", "setPosition", "getRight", "setRight", ViewEntity.ROTATION, "getRotation", "scale", "getScale", "translation", "getTranslation", "getUp", "setUp", "upperLeft", "Lcom/oplusos/vfxmodelviewer/utils/Mat3;", "getUpperLeft", "()Lcom/oplusos/vfxmodelviewer/utils/Mat3;", "getW", "()Lcom/oplusos/vfxmodelviewer/utils/Float4;", "setW", "(Lcom/oplusos/vfxmodelviewer/utils/Float4;)V", "getX", "setX", "getY", "setY", "getZ", "setZ", "component1", "component2", "component3", "component4", "copy", "dec", "div", "v", "", "equals", "", "other", ParserTag.TAG_GET, "column", "Lcom/oplusos/vfxmodelviewer/utils/MatrixColumn;", "row", "", "hashCode", "inc", "invoke", "", "minus", "plus", "set", "times", "toFloatArray", "", "toString", "", "unaryMinus", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Mat4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private Float4 w;

    @NotNull
    private Float4 x;

    @NotNull
    private Float4 y;

    @NotNull
    private Float4 z;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u00020\u0007\"\u00020\b¨\u0006\t"}, d2 = {"Lcom/oplusos/vfxmodelviewer/utils/Mat4$Companion;", "", "()V", "identity", "Lcom/oplusos/vfxmodelviewer/utils/Mat4;", "of", "a", "", "", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Mat4 identity() {
            return new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
        }

        @NotNull
        public final Mat4 of(@NotNull float... a) {
            Intrinsics.checkNotNullParameter(a, "a");
            if (a.length >= 16) {
                return new Mat4(new Float4(a[0], a[4], a[8], a[12]), new Float4(a[1], a[5], a[9], a[13]), new Float4(a[2], a[6], a[10], a[14]), new Float4(a[3], a[7], a[11], a[15]));
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
            iArr[MatrixColumn.W.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Mat4() {
        this((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Mat4 copy$default(Mat4 mat4, Float4 float4, Float4 float5, Float4 float6, Float4 float7, int i, Object obj) {
        if ((i & 1) != 0) {
            float4 = mat4.x;
        }
        if ((i & 2) != 0) {
            float5 = mat4.y;
        }
        if ((i & 4) != 0) {
            float6 = mat4.z;
        }
        if ((i & 8) != 0) {
            float7 = mat4.w;
        }
        return mat4.copy(float4, float5, float6, float7);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Float4 getX() {
        return this.x;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float4 getY() {
        return this.y;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float4 getZ() {
        return this.z;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float4 getW() {
        return this.w;
    }

    @NotNull
    public final Mat4 copy(@NotNull Float4 x, @NotNull Float4 y, @NotNull Float4 z, @NotNull Float4 w) {
        Intrinsics.checkNotNullParameter(x, "x");
        Intrinsics.checkNotNullParameter(y, "y");
        Intrinsics.checkNotNullParameter(z, "z");
        Intrinsics.checkNotNullParameter(w, "w");
        return new Mat4(x, y, z, w);
    }

    @NotNull
    public final Mat4 dec() {
        this.x = this.x.dec();
        this.y = this.y.dec();
        this.z = this.z.dec();
        this.w = this.w.dec();
        return this;
    }

    @NotNull
    public final Mat4 div(float v) {
        Float4 float4 = this.x;
        Float4 float5 = new Float4(float4.getX() / v, float4.getY() / v, float4.getZ() / v, float4.getW() / v);
        Float4 float6 = this.y;
        Float4 float7 = new Float4(float6.getX() / v, float6.getY() / v, float6.getZ() / v, float6.getW() / v);
        Float4 float8 = this.z;
        Float4 float9 = new Float4(float8.getX() / v, float8.getY() / v, float8.getZ() / v, float8.getW() / v);
        Float4 float10 = this.w;
        return new Mat4(float5, float7, float9, new Float4(float10.getX() / v, float10.getY() / v, float10.getZ() / v, float10.getW() / v));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mat4)) {
            return false;
        }
        Mat4 mat4 = (Mat4) other;
        return Intrinsics.areEqual(this.x, mat4.x) && Intrinsics.areEqual(this.y, mat4.y) && Intrinsics.areEqual(this.z, mat4.z) && Intrinsics.areEqual(this.w, mat4.w);
    }

    @NotNull
    public final Float4 get(int column) {
        if (column == 0) {
            return this.x;
        }
        if (column == 1) {
            return this.y;
        }
        if (column == 2) {
            return this.z;
        }
        if (column == 3) {
            return this.w;
        }
        throw new IllegalArgumentException("column must be in 0..3");
    }

    @NotNull
    public final Float3 getForward() {
        Float4 z = getZ();
        return new Float3(z.getX(), z.getY(), z.getZ());
    }

    @NotNull
    public final Float3 getPosition() {
        Float4 w = getW();
        return new Float3(w.getX(), w.getY(), w.getZ());
    }

    @NotNull
    public final Float3 getRight() {
        Float4 x = getX();
        return new Float3(x.getX(), x.getY(), x.getZ());
    }

    @NotNull
    public final Float3 getRotation() {
        Float4 x = getX();
        Float3 float3Normalize = VectorKt.normalize(new Float3(x.getX(), x.getY(), x.getZ()));
        Float4 y = getY();
        Float3 float3Normalize2 = VectorKt.normalize(new Float3(y.getX(), y.getY(), y.getZ()));
        Float4 z = getZ();
        Float3 float3Normalize3 = VectorKt.normalize(new Float3(z.getX(), z.getY(), z.getZ()));
        if (float3Normalize3.getY() <= -1.0f) {
            return new Float3(-90.0f, vr3.UNSET, ((float) Math.atan2(float3Normalize.getZ(), float3Normalize2.getZ())) * 57.295776f);
        }
        if (float3Normalize3.getY() >= 1.0f) {
            return new Float3(90.0f, vr3.UNSET, ((float) Math.atan2(-float3Normalize.getZ(), -float3Normalize2.getZ())) * 57.295776f);
        }
        return new Float3((-((float) Math.asin(float3Normalize3.getY()))) * 57.295776f, (-((float) Math.atan2(float3Normalize3.getX(), float3Normalize3.getZ()))) * 57.295776f, ((float) Math.atan2(float3Normalize.getY(), float3Normalize2.getY())) * 57.295776f);
    }

    @NotNull
    public final Float3 getScale() {
        Float4 x = getX();
        Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        float fSqrt = (float) Math.sqrt((float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ()));
        Float4 y = getY();
        Float3 float4 = new Float3(y.getX(), y.getY(), y.getZ());
        float fSqrt2 = (float) Math.sqrt((float4.getX() * float4.getX()) + (float4.getY() * float4.getY()) + (float4.getZ() * float4.getZ()));
        Float4 z = getZ();
        Float3 float5 = new Float3(z.getX(), z.getY(), z.getZ());
        return new Float3(fSqrt, fSqrt2, (float) Math.sqrt((float5.getX() * float5.getX()) + (float5.getY() * float5.getY()) + (float5.getZ() * float5.getZ())));
    }

    @NotNull
    public final Float3 getTranslation() {
        Float4 w = getW();
        return new Float3(w.getX(), w.getY(), w.getZ());
    }

    @NotNull
    public final Float3 getUp() {
        Float4 y = getY();
        return new Float3(y.getX(), y.getY(), y.getZ());
    }

    @NotNull
    public final Mat3 getUpperLeft() {
        Float4 x = getX();
        Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        Float4 y = getY();
        Float3 float4 = new Float3(y.getX(), y.getY(), y.getZ());
        Float4 z = getZ();
        return new Mat3(float3, float4, new Float3(z.getX(), z.getY(), z.getZ()));
    }

    @NotNull
    public final Float4 getW() {
        return this.w;
    }

    @NotNull
    public final Float4 getX() {
        return this.x;
    }

    @NotNull
    public final Float4 getY() {
        return this.y;
    }

    @NotNull
    public final Float4 getZ() {
        return this.z;
    }

    public int hashCode() {
        return (((((this.x.hashCode() * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.w.hashCode();
    }

    @NotNull
    public final Mat4 inc() {
        this.x = this.x.inc();
        this.y = this.y.inc();
        this.z = this.z.inc();
        this.w = this.w.inc();
        return this;
    }

    public final float invoke(int row, int column) {
        return get(column - 1).get(row - 1);
    }

    @NotNull
    public final Mat4 minus(float v) {
        Float4 float4 = this.x;
        Float4 float5 = new Float4(float4.getX() - v, float4.getY() - v, float4.getZ() - v, float4.getW() - v);
        Float4 float6 = this.y;
        Float4 float7 = new Float4(float6.getX() - v, float6.getY() - v, float6.getZ() - v, float6.getW() - v);
        Float4 float8 = this.z;
        Float4 float9 = new Float4(float8.getX() - v, float8.getY() - v, float8.getZ() - v, float8.getW() - v);
        Float4 float10 = this.w;
        return new Mat4(float5, float7, float9, new Float4(float10.getX() - v, float10.getY() - v, float10.getZ() - v, float10.getW() - v));
    }

    @NotNull
    public final Mat4 plus(float v) {
        Float4 float4 = this.x;
        Float4 float5 = new Float4(float4.getX() + v, float4.getY() + v, float4.getZ() + v, float4.getW() + v);
        Float4 float6 = this.y;
        Float4 float7 = new Float4(float6.getX() + v, float6.getY() + v, float6.getZ() + v, float6.getW() + v);
        Float4 float8 = this.z;
        Float4 float9 = new Float4(float8.getX() + v, float8.getY() + v, float8.getZ() + v, float8.getW() + v);
        Float4 float10 = this.w;
        return new Mat4(float5, float7, float9, new Float4(float10.getX() + v, float10.getY() + v, float10.getZ() + v, float10.getW() + v));
    }

    public final void set(int column, @NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        Float4 float4 = get(column);
        float4.setX(v.getX());
        float4.setY(v.getY());
        float4.setZ(v.getZ());
        float4.setW(v.getW());
    }

    public final void setForward(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "value");
        Float4 z = getZ();
        z.setX(float3.getX());
        z.setY(float3.getY());
        z.setZ(float3.getZ());
    }

    public final void setPosition(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "value");
        Float4 w = getW();
        w.setX(float3.getX());
        w.setY(float3.getY());
        w.setZ(float3.getZ());
    }

    public final void setRight(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "value");
        Float4 x = getX();
        x.setX(float3.getX());
        x.setY(float3.getY());
        x.setZ(float3.getZ());
    }

    public final void setUp(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "value");
        Float4 y = getY();
        y.setX(float3.getX());
        y.setY(float3.getY());
        y.setZ(float3.getZ());
    }

    public final void setW(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "<set-?>");
        this.w = float4;
    }

    public final void setX(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "<set-?>");
        this.x = float4;
    }

    public final void setY(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "<set-?>");
        this.y = float4;
    }

    public final void setZ(@NotNull Float4 float4) {
        Intrinsics.checkNotNullParameter(float4, "<set-?>");
        this.z = float4;
    }

    @NotNull
    public final Mat4 times(float v) {
        Float4 float4 = this.x;
        Float4 float5 = new Float4(float4.getX() * v, float4.getY() * v, float4.getZ() * v, float4.getW() * v);
        Float4 float6 = this.y;
        Float4 float7 = new Float4(float6.getX() * v, float6.getY() * v, float6.getZ() * v, float6.getW() * v);
        Float4 float8 = this.z;
        Float4 float9 = new Float4(float8.getX() * v, float8.getY() * v, float8.getZ() * v, float8.getW() * v);
        Float4 float10 = this.w;
        return new Mat4(float5, float7, float9, new Float4(float10.getX() * v, float10.getY() * v, float10.getZ() * v, float10.getW() * v));
    }

    @NotNull
    public final float[] toFloatArray() {
        return new float[]{this.x.getX(), this.y.getX(), this.z.getX(), this.w.getX(), this.x.getY(), this.y.getY(), this.z.getY(), this.w.getY(), this.x.getZ(), this.y.getZ(), this.z.getZ(), this.w.getZ(), this.x.getW(), this.y.getW(), this.z.getW(), this.w.getW()};
    }

    @NotNull
    public String toString() {
        return StringsKt.trimIndent("\n            |" + this.x.getX() + ' ' + this.y.getX() + ' ' + this.z.getX() + ' ' + this.w.getX() + "|\n            |" + this.x.getY() + ' ' + this.y.getY() + ' ' + this.z.getY() + ' ' + this.w.getY() + "|\n            |" + this.x.getZ() + ' ' + this.y.getZ() + ' ' + this.z.getZ() + ' ' + this.w.getZ() + "|\n            |" + this.x.getW() + ' ' + this.y.getW() + ' ' + this.z.getW() + ' ' + this.w.getW() + "|\n            ");
    }

    @NotNull
    public final Mat4 unaryMinus() {
        return new Mat4(this.x.unaryMinus(), this.y.unaryMinus(), this.z.unaryMinus(), this.w.unaryMinus());
    }

    public Mat4(@NotNull Float4 float4, @NotNull Float4 float5, @NotNull Float4 float6, @NotNull Float4 float7) {
        Intrinsics.checkNotNullParameter(float4, "x");
        Intrinsics.checkNotNullParameter(float5, "y");
        Intrinsics.checkNotNullParameter(float6, "z");
        Intrinsics.checkNotNullParameter(float7, "w");
        this.x = float4;
        this.y = float5;
        this.z = float6;
        this.w = float7;
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

    public /* synthetic */ Mat4(Float4 float4, Float4 float5, Float4 float6, Float4 float7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Float4(1.0f, vr3.UNSET, vr3.UNSET, vr3.UNSET, 14, null) : float4, (i & 2) != 0 ? new Float4(vr3.UNSET, 1.0f, vr3.UNSET, vr3.UNSET, 13, null) : float5, (i & 4) != 0 ? new Float4(vr3.UNSET, vr3.UNSET, 1.0f, vr3.UNSET, 11, null) : float6, (i & 8) != 0 ? new Float4(vr3.UNSET, vr3.UNSET, vr3.UNSET, 1.0f, 7, null) : float7);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final Float4 get(@NotNull MatrixColumn column) throws NoWhenBranchMatchedException {
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
        if (i == 4) {
            return this.w;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final Mat4 times(@NotNull Mat4 m) {
        Intrinsics.checkNotNullParameter(m, "m");
        return new Mat4(new Float4((this.x.getX() * m.x.getX()) + (this.y.getX() * m.x.getY()) + (this.z.getX() * m.x.getZ()) + (this.w.getX() * m.x.getW()), (this.x.getY() * m.x.getX()) + (this.y.getY() * m.x.getY()) + (this.z.getY() * m.x.getZ()) + (this.w.getY() * m.x.getW()), (this.x.getZ() * m.x.getX()) + (this.y.getZ() * m.x.getY()) + (this.z.getZ() * m.x.getZ()) + (this.w.getZ() * m.x.getW()), (this.x.getW() * m.x.getX()) + (this.y.getW() * m.x.getY()) + (this.z.getW() * m.x.getZ()) + (this.w.getW() * m.x.getW())), new Float4((this.x.getX() * m.y.getX()) + (this.y.getX() * m.y.getY()) + (this.z.getX() * m.y.getZ()) + (this.w.getX() * m.y.getW()), (this.x.getY() * m.y.getX()) + (this.y.getY() * m.y.getY()) + (this.z.getY() * m.y.getZ()) + (this.w.getY() * m.y.getW()), (this.x.getZ() * m.y.getX()) + (this.y.getZ() * m.y.getY()) + (this.z.getZ() * m.y.getZ()) + (this.w.getZ() * m.y.getW()), (this.x.getW() * m.y.getX()) + (this.y.getW() * m.y.getY()) + (this.z.getW() * m.y.getZ()) + (this.w.getW() * m.y.getW())), new Float4((this.x.getX() * m.z.getX()) + (this.y.getX() * m.z.getY()) + (this.z.getX() * m.z.getZ()) + (this.w.getX() * m.z.getW()), (this.x.getY() * m.z.getX()) + (this.y.getY() * m.z.getY()) + (this.z.getY() * m.z.getZ()) + (this.w.getY() * m.z.getW()), (this.x.getZ() * m.z.getX()) + (this.y.getZ() * m.z.getY()) + (this.z.getZ() * m.z.getZ()) + (this.w.getZ() * m.z.getW()), (this.x.getW() * m.z.getX()) + (this.y.getW() * m.z.getY()) + (this.z.getW() * m.z.getZ()) + (this.w.getW() * m.z.getW())), new Float4((this.x.getX() * m.w.getX()) + (this.y.getX() * m.w.getY()) + (this.z.getX() * m.w.getZ()) + (this.w.getX() * m.w.getW()), (this.x.getY() * m.w.getX()) + (this.y.getY() * m.w.getY()) + (this.z.getY() * m.w.getZ()) + (this.w.getY() * m.w.getW()), (this.x.getZ() * m.w.getX()) + (this.y.getZ() * m.w.getY()) + (this.z.getZ() * m.w.getZ()) + (this.w.getZ() * m.w.getW()), (this.x.getW() * m.w.getX()) + (this.y.getW() * m.w.getY()) + (this.z.getW() * m.w.getZ()) + (this.w.getW() * m.w.getW())));
    }

    public /* synthetic */ Mat4(Float3 float3, Float3 float4, Float3 float5, Float3 float6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(float3, float4, float5, (i & 8) != 0 ? new Float3(vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null) : float6);
    }

    public final float get(@NotNull MatrixColumn column, int row) {
        Intrinsics.checkNotNullParameter(column, "column");
        return get(column).get(row);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat4(@NotNull Float3 float3, @NotNull Float3 float4, @NotNull Float3 float5, @NotNull Float3 float6) {
        this(new Float4(float3, vr3.UNSET, 2, (DefaultConstructorMarker) null), new Float4(float4, vr3.UNSET, 2, (DefaultConstructorMarker) null), new Float4(float5, vr3.UNSET, 2, (DefaultConstructorMarker) null), new Float4(float6, 1.0f));
        Intrinsics.checkNotNullParameter(float3, "right");
        Intrinsics.checkNotNullParameter(float4, "up");
        Intrinsics.checkNotNullParameter(float5, "forward");
        Intrinsics.checkNotNullParameter(float6, "position");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Mat4(@NotNull Mat4 mat4) {
        this(Float4.copy$default(mat4.x, vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null), Float4.copy$default(mat4.y, vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null), Float4.copy$default(mat4.z, vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null), Float4.copy$default(mat4.w, vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 15, null));
        Intrinsics.checkNotNullParameter(mat4, "m");
    }

    @NotNull
    public final Float4 times(@NotNull Float4 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        return new Float4((this.x.getX() * v.getX()) + (this.y.getX() * v.getY()) + (this.z.getX() * v.getZ()) + (this.w.getX() * v.getW()), (this.x.getY() * v.getX()) + (this.y.getY() * v.getY()) + (this.z.getY() * v.getZ()) + (this.w.getY() * v.getW()), (this.x.getZ() * v.getX()) + (this.y.getZ() * v.getY()) + (this.z.getZ() * v.getZ()) + (this.w.getZ() * v.getW()), (this.x.getW() * v.getX()) + (this.y.getW() * v.getY()) + (this.z.getW() * v.getZ()) + (this.w.getW() * v.getW()));
    }
}
