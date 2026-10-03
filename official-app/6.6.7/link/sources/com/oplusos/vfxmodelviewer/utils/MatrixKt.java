package com.oplusos.vfxmodelviewer.utils;

import com.oplus.aiunit.vision.vr3;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ViewEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a \u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006\u001a\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a6\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e\u001a&\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000e\u001a\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0006\u001a\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000e\u001a\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0006\u001a\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0006\u001a\u000e\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010 \u001a\u00020!2\u0006\u0010\u0002\u001a\u00020!\u001a\u000e\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\""}, d2 = {"inverse", "Lcom/oplusos/vfxmodelviewer/utils/Mat3;", "m", "Lcom/oplusos/vfxmodelviewer/utils/Mat4;", "lookAt", "eye", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", ParserTag.TAG_TARGET, "up", "lookTowards", "forward", "normal", "ortho", "l", "", "r", "b", "t", "n", "f", "perspective", "fov", "ratio", "near", "far", ViewEntity.ROTATION, "d", "axis", "angle", "scale", "s", "translation", "transpose", "Lcom/oplusos/vfxmodelviewer/utils/Mat2;", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class MatrixKt {
    @NotNull
    public static final Mat3 inverse(@NotNull Mat3 mat3) {
        Intrinsics.checkNotNullParameter(mat3, "m");
        float x = mat3.getX().getX();
        float y = mat3.getX().getY();
        float z = mat3.getX().getZ();
        float x2 = mat3.getY().getX();
        float y2 = mat3.getY().getY();
        float z2 = mat3.getY().getZ();
        float x3 = mat3.getZ().getX();
        float y3 = mat3.getZ().getY();
        float z3 = mat3.getZ().getZ();
        float f = (y2 * z3) - (z2 * y3);
        float f2 = (z2 * x3) - (x2 * z3);
        float f3 = (x2 * y3) - (y2 * x3);
        float f4 = (x * f) + (y * f2) + (z * f3);
        return Mat3.INSTANCE.of(f / f4, f2 / f4, f3 / f4, ((z * y3) - (y * z3)) / f4, ((z3 * x) - (z * x3)) / f4, ((x3 * y) - (y3 * x)) / f4, ((y * z2) - (z * y2)) / f4, ((z * x2) - (z2 * x)) / f4, ((x * y2) - (y * x2)) / f4);
    }

    @NotNull
    public static final Mat4 lookAt(@NotNull Float3 float3, @NotNull Float3 float4, @NotNull Float3 float5) {
        Intrinsics.checkNotNullParameter(float3, "eye");
        Intrinsics.checkNotNullParameter(float4, ParserTag.TAG_TARGET);
        Intrinsics.checkNotNullParameter(float5, "up");
        return lookTowards(float3, new Float3(float4.getX() - float3.getX(), float4.getY() - float3.getY(), float4.getZ() - float3.getZ()), float5);
    }

    public static /* synthetic */ Mat4 lookAt$default(Float3 float3, Float3 float4, Float3 float5, int i, Object obj) {
        if ((i & 4) != 0) {
            float5 = new Float3(vr3.UNSET, vr3.UNSET, 1.0f, 3, null);
        }
        return lookAt(float3, float4, float5);
    }

    @NotNull
    public static final Mat4 lookTowards(@NotNull Float3 float3, @NotNull Float3 float4, @NotNull Float3 float5) {
        Intrinsics.checkNotNullParameter(float3, "eye");
        Intrinsics.checkNotNullParameter(float4, "forward");
        Intrinsics.checkNotNullParameter(float5, "up");
        Float3 float3Normalize = VectorKt.normalize(float4);
        Float3 float3Normalize2 = VectorKt.normalize(new Float3((float3Normalize.getY() * float5.getZ()) - (float3Normalize.getZ() * float5.getY()), (float3Normalize.getZ() * float5.getX()) - (float3Normalize.getX() * float5.getZ()), (float3Normalize.getX() * float5.getY()) - (float3Normalize.getY() * float5.getX())));
        return new Mat4(new Float4(float3Normalize2, vr3.UNSET, 2, (DefaultConstructorMarker) null), new Float4(VectorKt.normalize(new Float3((float3Normalize2.getY() * float3Normalize.getZ()) - (float3Normalize2.getZ() * float3Normalize.getY()), (float3Normalize2.getZ() * float3Normalize.getX()) - (float3Normalize2.getX() * float3Normalize.getZ()), (float3Normalize2.getX() * float3Normalize.getY()) - (float3Normalize2.getY() * float3Normalize.getX()))), vr3.UNSET, 2, (DefaultConstructorMarker) null), new Float4(float3Normalize, vr3.UNSET, 2, (DefaultConstructorMarker) null), new Float4(float3, 1.0f));
    }

    public static /* synthetic */ Mat4 lookTowards$default(Float3 float3, Float3 float4, Float3 float5, int i, Object obj) {
        if ((i & 4) != 0) {
            float5 = new Float3(vr3.UNSET, vr3.UNSET, 1.0f, 3, null);
        }
        return lookTowards(float3, float4, float5);
    }

    @NotNull
    public static final Mat4 normal(@NotNull Mat4 mat4) {
        Intrinsics.checkNotNullParameter(mat4, "m");
        Float4 x = mat4.getX();
        Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        float x2 = (float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ());
        Float4 y = mat4.getY();
        Float3 float4 = new Float3(y.getX(), y.getY(), y.getZ());
        float x3 = (float4.getX() * float4.getX()) + (float4.getY() * float4.getY()) + (float4.getZ() * float4.getZ());
        Float4 z = mat4.getZ();
        Float3 float5 = new Float3(z.getX(), z.getY(), z.getZ());
        Float3 float6 = new Float3(x2, x3, (float5.getX() * float5.getX()) + (float5.getY() * float5.getY()) + (float5.getZ() * float5.getZ()));
        return scale(new Float3(1.0f / float6.getX(), 1.0f / float6.getY(), 1.0f / float6.getZ())).times(mat4);
    }

    @NotNull
    public static final Mat4 ortho(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4 - f3;
        float f8 = f6 - f5;
        return new Mat4(new Float4(2.0f / (f2 - 1.0f), vr3.UNSET, vr3.UNSET, vr3.UNSET, 14, null), new Float4(vr3.UNSET, 2.0f / f7, vr3.UNSET, vr3.UNSET, 13, null), new Float4(vr3.UNSET, vr3.UNSET, (-2.0f) / f8, vr3.UNSET, 11, null), new Float4((-(f2 + f)) / (f2 - f), (-(f4 + f3)) / f7, (-(f6 + f5)) / f8, 1.0f));
    }

    @NotNull
    public static final Mat4 perspective(float f, float f2, float f3, float f4) {
        float fTan = 1.0f / ((float) Math.tan((0.017453292f * f) * 0.5f));
        float f5 = f4 - f3;
        return new Mat4(new Float4(fTan / f2, vr3.UNSET, vr3.UNSET, vr3.UNSET, 14, null), new Float4(vr3.UNSET, fTan, vr3.UNSET, vr3.UNSET, 13, null), new Float4(vr3.UNSET, vr3.UNSET, (f4 + f3) / f5, 1.0f, 3, null), new Float4(vr3.UNSET, vr3.UNSET, -(((2.0f * f4) * f3) / f5), vr3.UNSET, 11, null));
    }

    @NotNull
    public static final Mat4 rotation(@NotNull Mat4 mat4) {
        Intrinsics.checkNotNullParameter(mat4, "m");
        Float4 x = mat4.getX();
        Float3 float3Normalize = VectorKt.normalize(new Float3(x.getX(), x.getY(), x.getZ()));
        Float4 y = mat4.getY();
        Float3 float3Normalize2 = VectorKt.normalize(new Float3(y.getX(), y.getY(), y.getZ()));
        Float4 z = mat4.getZ();
        return new Mat4(float3Normalize, float3Normalize2, VectorKt.normalize(new Float3(z.getX(), z.getY(), z.getZ())), (Float3) null, 8, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final Mat4 scale(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "s");
        return new Mat4(new Float4(float3.getX(), vr3.UNSET, vr3.UNSET, vr3.UNSET, 14, null), new Float4(vr3.UNSET, float3.getY(), vr3.UNSET, vr3.UNSET, 13, null), new Float4(vr3.UNSET, vr3.UNSET, float3.getZ(), vr3.UNSET, 11, null), (Float4) null, 8, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final Mat4 translation(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "t");
        return new Mat4((Float4) null, (Float4) null, (Float4) null, new Float4(float3, 1.0f), 7, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final Mat2 transpose(@NotNull Mat2 mat2) {
        Intrinsics.checkNotNullParameter(mat2, "m");
        return new Mat2(new Float2(mat2.getX().getX(), mat2.getY().getX()), new Float2(mat2.getX().getY(), mat2.getY().getY()));
    }

    @NotNull
    public static final Mat4 scale(@NotNull Mat4 mat4) {
        Intrinsics.checkNotNullParameter(mat4, "m");
        Float4 x = mat4.getX();
        Float3 float3 = new Float3(x.getX(), x.getY(), x.getZ());
        float fSqrt = (float) Math.sqrt((float3.getX() * float3.getX()) + (float3.getY() * float3.getY()) + (float3.getZ() * float3.getZ()));
        Float4 y = mat4.getY();
        Float3 float4 = new Float3(y.getX(), y.getY(), y.getZ());
        float fSqrt2 = (float) Math.sqrt((float4.getX() * float4.getX()) + (float4.getY() * float4.getY()) + (float4.getZ() * float4.getZ()));
        Float4 z = mat4.getZ();
        Float3 float5 = new Float3(z.getX(), z.getY(), z.getZ());
        return scale(new Float3(fSqrt, fSqrt2, (float) Math.sqrt((float5.getX() * float5.getX()) + (float5.getY() * float5.getY()) + (float5.getZ() * float5.getZ()))));
    }

    @NotNull
    public static final Mat4 translation(@NotNull Mat4 mat4) {
        Intrinsics.checkNotNullParameter(mat4, "m");
        Float4 w = mat4.getW();
        return translation(new Float3(w.getX(), w.getY(), w.getZ()));
    }

    @NotNull
    public static final Mat3 transpose(@NotNull Mat3 mat3) {
        Intrinsics.checkNotNullParameter(mat3, "m");
        return new Mat3(new Float3(mat3.getX().getX(), mat3.getY().getX(), mat3.getZ().getX()), new Float3(mat3.getX().getY(), mat3.getY().getY(), mat3.getZ().getY()), new Float3(mat3.getX().getZ(), mat3.getY().getZ(), mat3.getZ().getZ()));
    }

    @NotNull
    public static final Mat4 transpose(@NotNull Mat4 mat4) {
        Intrinsics.checkNotNullParameter(mat4, "m");
        return new Mat4(new Float4(mat4.getX().getX(), mat4.getY().getX(), mat4.getZ().getX(), mat4.getW().getX()), new Float4(mat4.getX().getY(), mat4.getY().getY(), mat4.getZ().getY(), mat4.getW().getY()), new Float4(mat4.getX().getZ(), mat4.getY().getZ(), mat4.getZ().getZ(), mat4.getW().getZ()), new Float4(mat4.getX().getW(), mat4.getY().getW(), mat4.getZ().getW(), mat4.getW().getW()));
    }

    @NotNull
    public static final Mat4 inverse(@NotNull Mat4 mat4) {
        Intrinsics.checkNotNullParameter(mat4, "m");
        Mat4 mat5 = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);
        float z = mat4.getZ().getZ() * mat4.getW().getW();
        float z2 = mat4.getW().getZ() * mat4.getZ().getW();
        float z3 = mat4.getY().getZ() * mat4.getW().getW();
        float z4 = mat4.getW().getZ() * mat4.getY().getW();
        float z5 = mat4.getY().getZ() * mat4.getZ().getW();
        float z6 = mat4.getZ().getZ() * mat4.getY().getW();
        float z7 = mat4.getX().getZ() * mat4.getW().getW();
        float z8 = mat4.getW().getZ() * mat4.getX().getW();
        float z9 = mat4.getX().getZ() * mat4.getZ().getW();
        float z10 = mat4.getZ().getZ() * mat4.getX().getW();
        float z11 = mat4.getX().getZ() * mat4.getY().getW();
        float z12 = mat4.getY().getZ() * mat4.getX().getW();
        mat5.getX().setX((mat4.getY().getY() * z) + (mat4.getZ().getY() * z4) + (mat4.getW().getY() * z5));
        Float4 x = mat5.getX();
        x.setX(x.getX() - (((mat4.getY().getY() * z2) + (mat4.getZ().getY() * z3)) + (mat4.getW().getY() * z6)));
        mat5.getX().setY((mat4.getX().getY() * z2) + (mat4.getZ().getY() * z7) + (mat4.getW().getY() * z10));
        Float4 x2 = mat5.getX();
        x2.setY(x2.getY() - (((mat4.getX().getY() * z) + (mat4.getZ().getY() * z8)) + (mat4.getW().getY() * z9)));
        mat5.getX().setZ((mat4.getX().getY() * z3) + (mat4.getY().getY() * z8) + (mat4.getW().getY() * z11));
        Float4 x3 = mat5.getX();
        x3.setZ(x3.getZ() - (((mat4.getX().getY() * z4) + (mat4.getY().getY() * z7)) + (mat4.getW().getY() * z12)));
        mat5.getX().setW((mat4.getX().getY() * z6) + (mat4.getY().getY() * z9) + (mat4.getZ().getY() * z12));
        Float4 x4 = mat5.getX();
        x4.setW(x4.getW() - (((mat4.getX().getY() * z5) + (mat4.getY().getY() * z10)) + (mat4.getZ().getY() * z11)));
        mat5.getY().setX((mat4.getY().getX() * z2) + (mat4.getZ().getX() * z3) + (mat4.getW().getX() * z6));
        Float4 y = mat5.getY();
        y.setX(y.getX() - (((mat4.getY().getX() * z) + (mat4.getZ().getX() * z4)) + (mat4.getW().getX() * z5)));
        mat5.getY().setY((z * mat4.getX().getX()) + (mat4.getZ().getX() * z8) + (mat4.getW().getX() * z9));
        Float4 y2 = mat5.getY();
        y2.setY(y2.getY() - (((z2 * mat4.getX().getX()) + (mat4.getZ().getX() * z7)) + (mat4.getW().getX() * z10)));
        mat5.getY().setZ((z4 * mat4.getX().getX()) + (z7 * mat4.getY().getX()) + (mat4.getW().getX() * z12));
        Float4 y3 = mat5.getY();
        y3.setZ(y3.getZ() - (((z3 * mat4.getX().getX()) + (z8 * mat4.getY().getX())) + (mat4.getW().getX() * z11)));
        mat5.getY().setW((z5 * mat4.getX().getX()) + (z10 * mat4.getY().getX()) + (z11 * mat4.getZ().getX()));
        Float4 y4 = mat5.getY();
        y4.setW(y4.getW() - (((z6 * mat4.getX().getX()) + (z9 * mat4.getY().getX())) + (z12 * mat4.getZ().getX())));
        float x5 = mat4.getZ().getX() * mat4.getW().getY();
        float x6 = mat4.getW().getX() * mat4.getZ().getY();
        float x7 = mat4.getY().getX() * mat4.getW().getY();
        float x8 = mat4.getW().getX() * mat4.getY().getY();
        float x9 = mat4.getY().getX() * mat4.getZ().getY();
        float x10 = mat4.getZ().getX() * mat4.getY().getY();
        float x11 = mat4.getX().getX() * mat4.getW().getY();
        float x12 = mat4.getW().getX() * mat4.getX().getY();
        float x13 = mat4.getX().getX() * mat4.getZ().getY();
        float x14 = mat4.getZ().getX() * mat4.getX().getY();
        float x15 = mat4.getX().getX() * mat4.getY().getY();
        float x16 = mat4.getY().getX() * mat4.getX().getY();
        mat5.getZ().setX((mat4.getY().getW() * x5) + (mat4.getZ().getW() * x8) + (mat4.getW().getW() * x9));
        Float4 z13 = mat5.getZ();
        z13.setX(z13.getX() - (((mat4.getY().getW() * x6) + (mat4.getZ().getW() * x7)) + (mat4.getW().getW() * x10)));
        mat5.getZ().setY((mat4.getX().getW() * x6) + (mat4.getZ().getW() * x11) + (mat4.getW().getW() * x14));
        Float4 z14 = mat5.getZ();
        z14.setY(z14.getY() - (((mat4.getX().getW() * x5) + (mat4.getZ().getW() * x12)) + (mat4.getW().getW() * x13)));
        mat5.getZ().setZ((mat4.getX().getW() * x7) + (mat4.getY().getW() * x12) + (mat4.getW().getW() * x15));
        Float4 z15 = mat5.getZ();
        z15.setZ(z15.getZ() - (((mat4.getX().getW() * x8) + (mat4.getY().getW() * x11)) + (mat4.getW().getW() * x16)));
        mat5.getZ().setW((mat4.getX().getW() * x10) + (mat4.getY().getW() * x13) + (mat4.getZ().getW() * x16));
        Float4 z16 = mat5.getZ();
        z16.setW(z16.getW() - (((mat4.getX().getW() * x9) + (mat4.getY().getW() * x14)) + (mat4.getZ().getW() * x15)));
        mat5.getW().setX((mat4.getZ().getZ() * x7) + (mat4.getW().getZ() * x10) + (mat4.getY().getZ() * x6));
        Float4 w = mat5.getW();
        w.setX(w.getX() - (((mat4.getW().getZ() * x9) + (mat4.getY().getZ() * x5)) + (mat4.getZ().getZ() * x8)));
        mat5.getW().setY((mat4.getW().getZ() * x13) + (x5 * mat4.getX().getZ()) + (mat4.getZ().getZ() * x12));
        Float4 w2 = mat5.getW();
        w2.setY(w2.getY() - (((mat4.getZ().getZ() * x11) + (mat4.getW().getZ() * x14)) + (x6 * mat4.getX().getZ())));
        mat5.getW().setZ((x11 * mat4.getY().getZ()) + (mat4.getW().getZ() * x16) + (x8 * mat4.getX().getZ()));
        Float4 w3 = mat5.getW();
        w3.setZ(w3.getZ() - (((mat4.getW().getZ() * x15) + (x7 * mat4.getX().getZ())) + (x12 * mat4.getY().getZ())));
        mat5.getW().setW((x15 * mat4.getZ().getZ()) + (x9 * mat4.getX().getZ()) + (x14 * mat4.getY().getZ()));
        Float4 w4 = mat5.getW();
        w4.setW(w4.getW() - (((x13 * mat4.getY().getZ()) + (x16 * mat4.getZ().getZ())) + (x10 * mat4.getX().getZ())));
        return mat5.div((mat4.getX().getX() * mat5.getX().getX()) + (mat4.getY().getX() * mat5.getX().getY()) + (mat4.getZ().getX() * mat5.getX().getZ()) + (mat4.getW().getX() * mat5.getX().getW()));
    }

    @NotNull
    public static final Mat4 rotation(@NotNull Float3 float3, float f) {
        Intrinsics.checkNotNullParameter(float3, "axis");
        float x = float3.getX();
        float y = float3.getY();
        float z = float3.getZ();
        double d = f * 0.017453292f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = 1.0f - fCos;
        float f3 = x * y * f2;
        float f4 = z * fSin;
        float f5 = x * z * f2;
        float f6 = y * fSin;
        float f7 = y * z * f2;
        float f8 = x * fSin;
        return Mat4.INSTANCE.of((x * x * f2) + fCos, f3 - f4, f5 + f6, vr3.UNSET, f3 + f4, (y * y * f2) + fCos, f7 - f8, vr3.UNSET, f5 - f6, f7 + f8, (z * z * f2) + fCos, vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 1.0f);
    }

    @NotNull
    public static final Mat4 rotation(@NotNull Float3 float3) {
        Intrinsics.checkNotNullParameter(float3, "d");
        Float3 float3Copy$default = Float3.copy$default(float3, vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null);
        float3Copy$default.setX(float3Copy$default.getX() * 0.017453292f);
        float3Copy$default.setY(float3Copy$default.getY() * 0.017453292f);
        float3Copy$default.setZ(float3Copy$default.getZ() * 0.017453292f);
        Float3 float3Copy$default2 = Float3.copy$default(float3Copy$default, vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null);
        float3Copy$default2.setX((float) Math.cos(float3Copy$default2.getX()));
        float3Copy$default2.setY((float) Math.cos(float3Copy$default2.getY()));
        float3Copy$default2.setZ((float) Math.cos(float3Copy$default2.getZ()));
        Float3 float3Copy$default3 = Float3.copy$default(float3Copy$default, vr3.UNSET, vr3.UNSET, vr3.UNSET, 7, null);
        float3Copy$default3.setX((float) Math.sin(float3Copy$default3.getX()));
        float3Copy$default3.setY((float) Math.sin(float3Copy$default3.getY()));
        float3Copy$default3.setZ((float) Math.sin(float3Copy$default3.getZ()));
        return Mat4.INSTANCE.of(float3Copy$default2.getY() * float3Copy$default2.getZ(), ((-float3Copy$default2.getX()) * float3Copy$default3.getZ()) + (float3Copy$default3.getX() * float3Copy$default3.getY() * float3Copy$default2.getZ()), (float3Copy$default3.getX() * float3Copy$default3.getZ()) + (float3Copy$default2.getX() * float3Copy$default3.getY() * float3Copy$default2.getZ()), vr3.UNSET, float3Copy$default2.getY() * float3Copy$default3.getZ(), (float3Copy$default2.getX() * float3Copy$default2.getZ()) + (float3Copy$default3.getX() * float3Copy$default3.getY() * float3Copy$default3.getZ()), ((-float3Copy$default3.getX()) * float3Copy$default2.getZ()) + (float3Copy$default2.getX() * float3Copy$default3.getY() * float3Copy$default3.getZ()), vr3.UNSET, -float3Copy$default3.getY(), float3Copy$default3.getX() * float3Copy$default2.getY(), float3Copy$default2.getX() * float3Copy$default2.getY(), vr3.UNSET, vr3.UNSET, vr3.UNSET, vr3.UNSET, 1.0f);
    }
}
