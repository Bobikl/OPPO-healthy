package com.oplusos.vfxmodelviewer.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.y04;
import com.oplusos.vfxmodelviewer.utils.Float2;
import com.oplusos.vfxmodelviewer.utils.Float3;
import com.oplusos.vfxmodelviewer.utils.Float4;
import com.oplusos.vfxmodelviewer.utils.Mat4;
import com.oplusos.vfxmodelviewer.utils.VectorKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/Math;", "", "()V", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Math {
    public static final float degToRad = 0.017453f;
    public static final float flt_epsilion = 1.1920929E-7f;
    public static final float radToDeg = 57.29578f;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final int[] next_ijk = {1, 2, 0};

    @NotNull
    private static Mat4 tempMat = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);

    @NotNull
    private static Mat4 tempMat2 = new Mat4((Float4) null, (Float4) null, (Float4) null, (Float4) null, 15, (DefaultConstructorMarker) null);

    @NotNull
    private static final Float3 upVec3 = new Float3(0.0f, 1.0f, 0.0f);

    @NotNull
    private static final Float3 forwardVec3 = new Float3(0.0f, 0.0f, 1.0f);

    @NotNull
    private static final Float3 backVec3 = new Float3(0.0f, 0.0f, -1.0f);

    @NotNull
    private static final Float3 rightVec3 = new Float3(1.0f, 0.0f, 0.0f);

    @NotNull
    private static final Float3 oneVec3 = new Float3(1.0f, 1.0f, 1.0f);

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b&\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bJ\u0016\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\b2\u0006\u0010(\u001a\u00020\bJ&\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0004J\u001e\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004J&\u00104\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0004J\u0016\u00105\u001a\u00020\b2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000207J\u001e\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bJ\u001e\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u00020\b2\u0006\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bJ\u0016\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\bJ\u0016\u0010B\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010C\u001a\u00020DJ&\u0010E\u001a\u00020*2\u0006\u0010F\u001a\u0002072\u0006\u0010#\u001a\u0002072\u0006\u0010$\u001a\u0002072\u0006\u0010G\u001a\u00020\bJ\u001e\u0010E\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010H\u001a\u00020\b2\u0006\u0010G\u001a\u00020\bJ\u000e\u0010I\u001a\u00020\b2\u0006\u0010!\u001a\u00020\bJ\u000e\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u000207J\u000e\u0010J\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u0004J\u0016\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bJ\u001e\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bJ\u0016\u0010N\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010C\u001a\u00020DJ\u001e\u0010O\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00162\u0006\u00106\u001a\u00020@J\u001e\u0010O\u001a\u00020*2\u0006\u00101\u001a\u00020@2\u0006\u0010+\u001a\u00020\u00162\u0006\u00106\u001a\u00020@J\u001e\u0010P\u001a\u00020*2\u0006\u00101\u001a\u00020\u00162\u0006\u0010Q\u001a\u00020\u00162\u0006\u0010R\u001a\u00020\u0016J\u0016\u0010S\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010C\u001a\u00020DJ\u0016\u0010T\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0016J\u0016\u0010U\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0016J\u0016\u0010V\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0016J\u0016\u0010W\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00162\u0006\u0010X\u001a\u00020.J\u000e\u0010Y\u001a\u00020*2\u0006\u0010F\u001a\u00020\u0004J\u0016\u0010Y\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004J\u000e\u0010Z\u001a\u00020*2\u0006\u0010F\u001a\u00020\u0004J\u0016\u0010Z\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u0010F\u001a\u00020\u0004J&\u0010[\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010F\u001a\u00020@J\u001e\u0010]\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010F\u001a\u00020@J&\u0010^\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u00042\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u0004J&\u0010b\u001a\u00020*2\u0006\u00101\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\u00042\u0006\u0010`\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u0004J,\u0010c\u001a\u00020*2\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u0010K\u001a\u00020\b2\b\b\u0002\u0010L\u001a\u00020\b2\b\b\u0002\u0010M\u001a\u00020\bJ6\u0010d\u001a\u00020*2\u0006\u00101\u001a\u00020@2\b\b\u0002\u0010K\u001a\u00020\b2\b\b\u0002\u0010L\u001a\u00020\b2\b\b\u0002\u0010M\u001a\u00020\b2\b\b\u0002\u0010e\u001a\u00020\bJ\u000e\u0010f\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u0004J\u0016\u0010f\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bJ\u001e\u0010f\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bJ&\u0010g\u001a\u00020*2\u0006\u00101\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bJ\u0016\u0010h\u001a\u00020*2\u0006\u00101\u001a\u00020\u00162\u0006\u0010i\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u000e\u0010\u0012\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0006¨\u0006j"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/Math$Companion;", "", "()V", "backVec3", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "getBackVec3", "()Lcom/oplusos/vfxmodelviewer/utils/Float3;", "degToRad", "", "flt_epsilion", "forwardVec3", "getForwardVec3", "next_ijk", "", "getNext_ijk", "()[I", "oneVec3", "getOneVec3", "radToDeg", "rightVec3", "getRightVec3", "tempMat", "Lcom/oplusos/vfxmodelviewer/utils/Mat4;", "getTempMat", "()Lcom/oplusos/vfxmodelviewer/utils/Mat4;", "setTempMat", "(Lcom/oplusos/vfxmodelviewer/utils/Mat4;)V", "tempMat2", "getTempMat2", "setTempMat2", "upVec3", "getUpVec3", "LogC_to_linear", "f", "angle", "from", TypedValues.TransitionType.S_TO, "approximately", "", "f0", "f1", "composeMatrix", "", "mat", "translation", "rotation", "Lcom/oplusos/vfxmodelviewer/view/Quaternion;", "scale", "crossVec3", "result", "a", "b", "decomposeMatrix", "distance", "v", "Lcom/oplusos/vfxmodelviewer/utils/Float2;", "v1", "easeInOutCubic", "_start", "_end", "_value", "easeOutCubic", "float4DivFloat", "vec4", "Lcom/oplusos/vfxmodelviewer/utils/Float4;", "dev", "floatArrayToMat4", "array", "", "lerp", "vec", "t", "f2", "linear_to_LogC", "magnitude", "x", "y", "z", "mat3ToFloatArray", "mat4MulFloat4", "mat4MulMat4", "mat1", "mat2", "mat4ToFloatArray", "matToForward", "matToRight", "matToUp", "matrixToQuaternion", "quat", "normalizeVec3", "reverseVec3", "rotateByAxis", "axisNorm", "rotateByYAxis", "rufToAngle", y04.TIME_STYLE_RIGHT_DIR_NAME, y04.TIME_STYLE_UP_DIR_NAME, "forward", "rufToMat", "setFloat3", "setFloat4", "w", "sqrMagnitude", "translationMat4", "transposeMat4", LogFieldKey.MESSAGE_KEY, "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void setFloat3$default(Companion companion, Float3 float3, float f, float f2, float f3, int i, Object obj) {
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            if ((i & 4) != 0) {
                f2 = 0.0f;
            }
            if ((i & 8) != 0) {
                f3 = 0.0f;
            }
            companion.setFloat3(float3, f, f2, f3);
        }

        public final float LogC_to_linear(float f) {
            return (((float) StrictMath.pow(10.0f, (f - 0.386036f) * 4.0956583f)) - 0.047996f) * 0.17999999f;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0035 A[PHI: r2
  0x0035: PHI (r2v12 float) = (r2v6 float), (r2v7 float) binds: [B:3:0x0033, B:6:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        public final float angle(@NotNull Float3 from, @NotNull Float3 to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            Float3 float3Normalize = VectorKt.normalize(from);
            Float3 float3Normalize2 = VectorKt.normalize(to);
            float x = (float3Normalize.getX() * float3Normalize2.getX()) + (float3Normalize.getY() * float3Normalize2.getY()) + (float3Normalize.getZ() * float3Normalize2.getZ());
            float f = -1.0f;
            if (x < -1.0f) {
                x = f;
            } else {
                f = 1.0f;
                if (x > 1.0f) {
                    x = f;
                }
            }
            return ((float) java.lang.Math.acos(x)) * 57.29578f;
        }

        public final boolean approximately(float f0, float f1) {
            return java.lang.Math.abs(f0 - f1) < 1.1920929E-7f;
        }

        public final void composeMatrix(@NotNull Mat4 mat, @NotNull Float3 translation, @NotNull Quaternion rotation, @NotNull Float3 scale) {
            Intrinsics.checkNotNullParameter(mat, "mat");
            Intrinsics.checkNotNullParameter(translation, "translation");
            Intrinsics.checkNotNullParameter(rotation, "rotation");
            Intrinsics.checkNotNullParameter(scale, "scale");
            float x = translation.getX();
            float y = translation.getY();
            float z = translation.getZ();
            float x2 = rotation.getX();
            float y2 = rotation.getY();
            float z2 = rotation.getZ();
            float w = rotation.getW();
            float x3 = scale.getX();
            float y3 = scale.getY();
            float z3 = scale.getZ();
            float f = y2 * 2.0f;
            float f2 = f * y2;
            float f3 = z2 * 2.0f;
            float f4 = f3 * z2;
            mat.getX().setX(((1.0f - f2) - f4) * x3);
            float f5 = 2.0f * x2;
            float f6 = y2 * f5;
            float f7 = f3 * w;
            mat.getX().setY((f6 + f7) * x3);
            float f8 = f5 * z2;
            float f9 = f * w;
            mat.getX().setZ(x3 * (f8 - f9));
            mat.getX().setW(0.0f);
            mat.getY().setX((f6 - f7) * y3);
            float f10 = 1.0f - (x2 * f5);
            mat.getY().setY((f10 - f4) * y3);
            float f11 = f * z2;
            float f12 = f5 * w;
            mat.getY().setZ((f11 + f12) * y3);
            mat.getY().setW(0.0f);
            mat.getZ().setX((f8 + f9) * z3);
            mat.getZ().setY((f11 - f12) * z3);
            mat.getZ().setZ((f10 - f2) * z3);
            mat.getZ().setW(0.0f);
            mat.getW().setX(x);
            mat.getW().setY(y);
            mat.getW().setZ(z);
            mat.getW().setW(1.0f);
        }

        public final void crossVec3(@NotNull Float3 result, @NotNull Float3 a, @NotNull Float3 b) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            result.setX((a.getY() * b.getZ()) - (a.getZ() * b.getY()));
            result.setY((a.getZ() * b.getX()) - (a.getX() * b.getZ()));
            result.setZ((a.getX() * b.getY()) - (a.getY() * b.getX()));
        }

        public final void decomposeMatrix(@NotNull Mat4 mat, @NotNull Float3 translation, @NotNull Quaternion rotation, @NotNull Float3 scale) {
            Intrinsics.checkNotNullParameter(mat, "mat");
            Intrinsics.checkNotNullParameter(translation, "translation");
            Intrinsics.checkNotNullParameter(rotation, "rotation");
            Intrinsics.checkNotNullParameter(scale, "scale");
            translation.setX(mat.getW().getX());
            translation.setY(mat.getW().getY());
            translation.setZ(mat.getW().getZ());
            float x = mat.getX().getX();
            float y = mat.getX().getY();
            float z = mat.getX().getZ();
            float x2 = mat.getY().getX();
            float y2 = mat.getY().getY();
            float z2 = mat.getY().getZ();
            float x3 = mat.getZ().getX();
            float y3 = mat.getZ().getY();
            float z3 = mat.getZ().getZ();
            float f = (((y2 * z3) - (z2 * y3)) * x) + (((z2 * x3) - (x2 * z3)) * y) + (((x2 * y3) - (y2 * x3)) * z);
            scale.setX(magnitude(x, y, z));
            scale.setY(magnitude(x2, y2, z2));
            scale.setZ(magnitude(x3, y3, z3));
            if (f < 0.0f) {
                scale.setX(-scale.getX());
                scale.setY(-scale.getY());
                scale.setZ(-scale.getZ());
            }
            Mat4 mat4 = new Mat4(mat);
            if (java.lang.Math.abs(f) <= 1.1920929E-7f) {
                rotation.setIdentity();
                return;
            }
            float4DivFloat(mat4.getX(), scale.getX());
            float4DivFloat(mat4.getY(), scale.getY());
            float4DivFloat(mat4.getZ(), scale.getZ());
            matrixToQuaternion(mat4, rotation);
        }

        public final float distance(@NotNull Float2 v, @NotNull Float2 v1) {
            Intrinsics.checkNotNullParameter(v, "v");
            Intrinsics.checkNotNullParameter(v1, "v1");
            return magnitude(v.getX() - v1.getX(), v.getY() - v1.getY());
        }

        public final float easeInOutCubic(float _start, float _end, float _value) {
            float f;
            float f2 = _value / 0.5f;
            float f3 = _end - _start;
            if (f2 < 1.0f) {
                f = (f3 / 2.0f) * f2 * f2 * f2;
            } else {
                float f4 = f2 - 2.0f;
                f = (f3 / 2.0f) * ((f4 * f4 * f4) + 2.0f);
            }
            return f + _start;
        }

        public final float easeOutCubic(float _start, float _end, float _value) {
            float f = _value - 1.0f;
            return ((_end - _start) * ((f * f * f) + 1.0f)) + _start;
        }

        public final void float4DivFloat(@NotNull Float4 vec4, float dev) {
            Intrinsics.checkNotNullParameter(vec4, "vec4");
            vec4.setX(vec4.getX() / dev);
            vec4.setY(vec4.getY() / dev);
            vec4.setZ(vec4.getZ() / dev);
            vec4.setW(vec4.getW() / dev);
        }

        public final void floatArrayToMat4(@NotNull Mat4 mat, @NotNull float[] array) {
            Intrinsics.checkNotNullParameter(mat, "mat");
            Intrinsics.checkNotNullParameter(array, "array");
            if (!(array.length >= 16)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Float4 x = mat.getX();
            Float4 float4 = new Float4(array[0], array[1], array[2], array[3]);
            x.setX(float4.getX());
            x.setY(float4.getY());
            x.setZ(float4.getZ());
            x.setW(float4.getW());
            Float4 y = mat.getY();
            Float4 float5 = new Float4(array[4], array[5], array[6], array[7]);
            y.setX(float5.getX());
            y.setY(float5.getY());
            y.setZ(float5.getZ());
            y.setW(float5.getW());
            Float4 z = mat.getZ();
            Intrinsics.areEqual(new Float4(z.getX(), z.getY(), z.getZ(), z.getW()), new Float4(array[8], array[9], array[10], array[11]));
            Float4 w = mat.getW();
            Intrinsics.areEqual(new Float4(w.getX(), w.getY(), w.getZ(), w.getW()), new Float4(array[12], array[13], array[14], array[15]));
        }

        @NotNull
        public final Float3 getBackVec3() {
            return Math.backVec3;
        }

        @NotNull
        public final Float3 getForwardVec3() {
            return Math.forwardVec3;
        }

        @NotNull
        public final int[] getNext_ijk() {
            return Math.next_ijk;
        }

        @NotNull
        public final Float3 getOneVec3() {
            return Math.oneVec3;
        }

        @NotNull
        public final Float3 getRightVec3() {
            return Math.rightVec3;
        }

        @NotNull
        public final Mat4 getTempMat() {
            return Math.tempMat;
        }

        @NotNull
        public final Mat4 getTempMat2() {
            return Math.tempMat2;
        }

        @NotNull
        public final Float3 getUpVec3() {
            return Math.upVec3;
        }

        public final float lerp(float f, float f2, float t) {
            return ((1.0f - t) * f) + (f2 * t);
        }

        public final float linear_to_LogC(float f) {
            return (((float) java.lang.Math.log10((f * 5.555556f) + 0.047996f)) * 0.244161f) + 0.386036f;
        }

        public final float magnitude(float x, float y, float z) {
            return (float) java.lang.Math.sqrt((x * x) + (y * y) + (z * z));
        }

        public final void mat3ToFloatArray(@NotNull Mat4 mat, @NotNull float[] array) {
            Intrinsics.checkNotNullParameter(mat, "mat");
            Intrinsics.checkNotNullParameter(array, "array");
            array[0] = mat.getX().getX();
            array[1] = mat.getX().getY();
            array[2] = mat.getX().getZ();
            array[3] = mat.getY().getX();
            array[4] = mat.getY().getY();
            array[5] = mat.getY().getZ();
            array[6] = mat.getZ().getX();
            array[7] = mat.getZ().getY();
            array[8] = mat.getZ().getZ();
        }

        public final void mat4MulFloat4(@NotNull Float4 result, @NotNull Mat4 mat, @NotNull Float4 v) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(mat, "mat");
            Intrinsics.checkNotNullParameter(v, "v");
            transposeMat4(getTempMat2(), mat);
            Float4 x = getTempMat2().getX();
            result.setX((x.getX() * v.getX()) + (x.getY() * v.getY()) + (x.getZ() * v.getZ()) + (x.getW() * v.getW()));
            Float4 y = getTempMat2().getY();
            result.setY((y.getX() * v.getX()) + (y.getY() * v.getY()) + (y.getZ() * v.getZ()) + (y.getW() * v.getW()));
            Float4 z = getTempMat2().getZ();
            result.setZ((z.getX() * v.getX()) + (z.getY() * v.getY()) + (z.getZ() * v.getZ()) + (z.getW() * v.getW()));
            Float4 w = getTempMat2().getW();
            result.setW((w.getX() * v.getX()) + (w.getY() * v.getY()) + (w.getZ() * v.getZ()) + (w.getW() * v.getW()));
        }

        public final void mat4MulMat4(@NotNull Mat4 result, @NotNull Mat4 mat1, @NotNull Mat4 mat2) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(mat1, "mat1");
            Intrinsics.checkNotNullParameter(mat2, "mat2");
            transposeMat4(getTempMat(), mat1);
            Float4 x = result.getX();
            Float4 x2 = getTempMat().getX();
            Float4 x3 = mat2.getX();
            x.setX((x2.getX() * x3.getX()) + (x2.getY() * x3.getY()) + (x2.getZ() * x3.getZ()) + (x2.getW() * x3.getW()));
            Float4 x4 = result.getX();
            Float4 y = getTempMat().getY();
            Float4 x5 = mat2.getX();
            x4.setY((y.getX() * x5.getX()) + (y.getY() * x5.getY()) + (y.getZ() * x5.getZ()) + (y.getW() * x5.getW()));
            Float4 x6 = result.getX();
            Float4 z = getTempMat().getZ();
            Float4 x7 = mat2.getX();
            x6.setZ((z.getX() * x7.getX()) + (z.getY() * x7.getY()) + (z.getZ() * x7.getZ()) + (z.getW() * x7.getW()));
            Float4 x8 = result.getX();
            Float4 w = getTempMat().getW();
            Float4 x9 = mat2.getX();
            x8.setW((w.getX() * x9.getX()) + (w.getY() * x9.getY()) + (w.getZ() * x9.getZ()) + (w.getW() * x9.getW()));
            Float4 y2 = result.getY();
            Float4 x10 = getTempMat().getX();
            Float4 y3 = mat2.getY();
            y2.setX((x10.getX() * y3.getX()) + (x10.getY() * y3.getY()) + (x10.getZ() * y3.getZ()) + (x10.getW() * y3.getW()));
            Float4 y4 = result.getY();
            Float4 y5 = getTempMat().getY();
            Float4 y6 = mat2.getY();
            y4.setY((y5.getX() * y6.getX()) + (y5.getY() * y6.getY()) + (y5.getZ() * y6.getZ()) + (y5.getW() * y6.getW()));
            Float4 y7 = result.getY();
            Float4 z2 = getTempMat().getZ();
            Float4 y8 = mat2.getY();
            y7.setZ((z2.getX() * y8.getX()) + (z2.getY() * y8.getY()) + (z2.getZ() * y8.getZ()) + (z2.getW() * y8.getW()));
            Float4 y9 = result.getY();
            Float4 w2 = getTempMat().getW();
            Float4 y10 = mat2.getY();
            y9.setW((w2.getX() * y10.getX()) + (w2.getY() * y10.getY()) + (w2.getZ() * y10.getZ()) + (w2.getW() * y10.getW()));
            Float4 z3 = result.getZ();
            Float4 x11 = getTempMat().getX();
            Float4 z4 = mat2.getZ();
            z3.setX((x11.getX() * z4.getX()) + (x11.getY() * z4.getY()) + (x11.getZ() * z4.getZ()) + (x11.getW() * z4.getW()));
            Float4 z5 = result.getZ();
            Float4 y11 = getTempMat().getY();
            Float4 z6 = mat2.getZ();
            z5.setY((y11.getX() * z6.getX()) + (y11.getY() * z6.getY()) + (y11.getZ() * z6.getZ()) + (y11.getW() * z6.getW()));
            Float4 z7 = result.getZ();
            Float4 z8 = getTempMat().getZ();
            Float4 z9 = mat2.getZ();
            z7.setZ((z8.getX() * z9.getX()) + (z8.getY() * z9.getY()) + (z8.getZ() * z9.getZ()) + (z8.getW() * z9.getW()));
            Float4 z10 = result.getZ();
            Float4 w3 = getTempMat().getW();
            Float4 z11 = mat2.getZ();
            z10.setW((w3.getX() * z11.getX()) + (w3.getY() * z11.getY()) + (w3.getZ() * z11.getZ()) + (w3.getW() * z11.getW()));
            Float4 w4 = result.getW();
            Float4 x12 = getTempMat().getX();
            Float4 w5 = mat2.getW();
            w4.setX((x12.getX() * w5.getX()) + (x12.getY() * w5.getY()) + (x12.getZ() * w5.getZ()) + (x12.getW() * w5.getW()));
            Float4 w6 = result.getW();
            Float4 y12 = getTempMat().getY();
            Float4 w7 = mat2.getW();
            w6.setY((y12.getX() * w7.getX()) + (y12.getY() * w7.getY()) + (y12.getZ() * w7.getZ()) + (y12.getW() * w7.getW()));
            Float4 w8 = result.getW();
            Float4 z12 = getTempMat().getZ();
            Float4 w9 = mat2.getW();
            w8.setZ((z12.getX() * w9.getX()) + (z12.getY() * w9.getY()) + (z12.getZ() * w9.getZ()) + (z12.getW() * w9.getW()));
            Float4 w10 = result.getW();
            Float4 w11 = getTempMat().getW();
            Float4 w12 = mat2.getW();
            w10.setW((w11.getX() * w12.getX()) + (w11.getY() * w12.getY()) + (w11.getZ() * w12.getZ()) + (w11.getW() * w12.getW()));
        }

        public final void mat4ToFloatArray(@NotNull Mat4 mat, @NotNull float[] array) {
            Intrinsics.checkNotNullParameter(mat, "mat");
            Intrinsics.checkNotNullParameter(array, "array");
            array[0] = mat.getX().getX();
            array[1] = mat.getX().getY();
            array[2] = mat.getX().getZ();
            array[3] = mat.getX().getW();
            array[4] = mat.getY().getX();
            array[5] = mat.getY().getY();
            array[6] = mat.getY().getZ();
            array[7] = mat.getY().getW();
            array[8] = mat.getZ().getX();
            array[9] = mat.getZ().getY();
            array[10] = mat.getZ().getZ();
            array[11] = mat.getZ().getW();
            array[12] = mat.getW().getX();
            array[13] = mat.getW().getY();
            array[14] = mat.getW().getZ();
            array[15] = mat.getW().getW();
        }

        public final void matToForward(@NotNull Float3 result, @NotNull Mat4 mat) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(mat, "mat");
            setFloat3(result, mat.getZ().getX(), mat.getZ().getY(), mat.getZ().getZ());
        }

        public final void matToRight(@NotNull Float3 result, @NotNull Mat4 mat) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(mat, "mat");
            setFloat3(result, mat.getX().getX(), mat.getX().getY(), mat.getX().getZ());
        }

        public final void matToUp(@NotNull Float3 result, @NotNull Mat4 mat) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(mat, "mat");
            setFloat3(result, mat.getY().getX(), mat.getY().getY(), mat.getY().getZ());
        }

        public final void matrixToQuaternion(@NotNull Mat4 mat, @NotNull Quaternion quat) {
            Intrinsics.checkNotNullParameter(mat, "mat");
            Intrinsics.checkNotNullParameter(quat, "quat");
            float x = mat.getX().getX() + mat.getY().getY() + mat.getZ().getZ();
            if (x > 0.0f) {
                float fSqrt = (float) java.lang.Math.sqrt(x + 1.0f);
                quat.setW(fSqrt * 0.5f);
                float f = 0.5f / fSqrt;
                quat.setX((mat.getY().getZ() - mat.getZ().getY()) * f);
                quat.setY((mat.getZ().getX() - mat.getX().getZ()) * f);
                quat.setZ((mat.getX().getY() - mat.getY().getX()) * f);
                return;
            }
            int i = mat.getY().getY() > mat.getX().getX() ? 1 : 0;
            if (mat.getZ().getZ() > mat.get(i).get(i)) {
                i = 2;
            }
            int i2 = getNext_ijk()[i];
            int i3 = getNext_ijk()[i2];
            float fSqrt2 = (float) java.lang.Math.sqrt((mat.get(i).get(i) - (mat.get(i2).get(i2) + mat.get(i3).get(i3))) + 1.0f);
            quat.set(i, fSqrt2 * 0.5f);
            if (!(fSqrt2 == 0.0f)) {
                fSqrt2 = 0.5f / fSqrt2;
            }
            quat.setW((mat.get(i2).get(i3) - mat.get(i3).get(i2)) * fSqrt2);
            quat.set(i2, (mat.get(i).get(i2) + mat.get(i2).get(i)) * fSqrt2);
            quat.set(i3, (mat.get(i).get(i3) + mat.get(i3).get(i)) * fSqrt2);
        }

        public final void normalizeVec3(@NotNull Float3 vec) {
            Intrinsics.checkNotNullParameter(vec, "vec");
            float fSqrt = 1.0f / ((float) java.lang.Math.sqrt(((vec.getX() * vec.getX()) + (vec.getY() * vec.getY())) + (vec.getZ() * vec.getZ())));
            vec.setX(vec.getX() * fSqrt);
            vec.setY(vec.getY() * fSqrt);
            vec.setZ(vec.getZ() * fSqrt);
        }

        public final void reverseVec3(@NotNull Float3 result, @NotNull Float3 vec) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(vec, "vec");
            result.setX(-vec.getX());
            result.setY(-vec.getY());
            result.setZ(-vec.getZ());
        }

        public final void rotateByAxis(@NotNull Float3 result, float angle, @NotNull Float3 axisNorm, @NotNull Float4 vec) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(axisNorm, "axisNorm");
            Intrinsics.checkNotNullParameter(vec, "vec");
            double d = angle * 0.017453f;
            float fCos = (float) java.lang.Math.cos(d);
            float fSin = (float) java.lang.Math.sin(d);
            float f = 1.0f - fCos;
            getTempMat().getX().setX((axisNorm.getX() * axisNorm.getX() * f) + fCos);
            getTempMat().getX().setY((axisNorm.getX() * axisNorm.getY() * f) + (axisNorm.getZ() * fSin));
            getTempMat().getX().setZ(((axisNorm.getX() * axisNorm.getZ()) * f) - (axisNorm.getY() * fSin));
            getTempMat().getX().setW(0.0f);
            getTempMat().getY().setX(((axisNorm.getX() * axisNorm.getY()) * f) - (axisNorm.getZ() * fSin));
            getTempMat().getY().setY((axisNorm.getY() * axisNorm.getY() * f) + fCos);
            getTempMat().getY().setZ((axisNorm.getZ() * axisNorm.getY() * f) + (axisNorm.getX() * fSin));
            getTempMat().getY().setW(0.0f);
            getTempMat().getZ().setX((axisNorm.getX() * axisNorm.getZ() * f) + (axisNorm.getY() * fSin));
            getTempMat().getZ().setY(((axisNorm.getY() * axisNorm.getZ()) * f) - (axisNorm.getX() * fSin));
            getTempMat().getZ().setZ((axisNorm.getZ() * axisNorm.getZ() * f) + fCos);
            getTempMat().getZ().setW(0.0f);
            setFloat4(getTempMat().getW(), 0.0f, 0.0f, 0.0f, 1.0f);
            mat4MulFloat4(result, getTempMat(), vec);
        }

        public final void rotateByYAxis(@NotNull Float3 result, float angle, @NotNull Float4 vec) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(vec, "vec");
            double d = angle * 0.017453f;
            float fCos = (float) java.lang.Math.cos(d);
            float fSin = (float) java.lang.Math.sin(d);
            setFloat4(getTempMat().getX(), fCos, 0.0f, -fSin, 0.0f);
            setFloat4(getTempMat().getY(), 0.0f, (1.0f - fCos) + fCos, 0.0f, 0.0f);
            setFloat4(getTempMat().getZ(), fSin, 0.0f, fCos, 0.0f);
            setFloat4(getTempMat().getW(), 0.0f, 0.0f, 0.0f, 1.0f);
            mat4MulFloat4(result, getTempMat(), vec);
        }

        public final void rufToAngle(@NotNull Float3 result, @NotNull Float3 right, @NotNull Float3 up, @NotNull Float3 forward) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(up, "up");
            Intrinsics.checkNotNullParameter(forward, "forward");
            normalizeVec3(right);
            normalizeVec3(up);
            normalizeVec3(forward);
            if (forward.getY() <= -1.0f) {
                result.setX(-90.0f);
                result.setY(0.0f);
                result.setZ(((float) java.lang.Math.atan2(right.getZ(), up.getZ())) * 57.295776f);
                return;
            }
            if (forward.getY() >= 1.0f) {
                result.setX(90.0f);
                result.setY(0.0f);
                result.setZ(((float) java.lang.Math.atan2(-right.getZ(), -up.getZ())) * 57.295776f);
                return;
            }
            result.setX((-((float) java.lang.Math.asin(forward.getY()))) * 57.295776f);
            result.setY((-((float) java.lang.Math.atan2(forward.getX(), forward.getZ()))) * 57.295776f);
            result.setZ(((float) java.lang.Math.atan2(right.getY(), up.getY())) * 57.295776f);
        }

        public final void rufToMat(@NotNull Mat4 result, @NotNull Float3 right, @NotNull Float3 up, @NotNull Float3 forward) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(right, "right");
            Intrinsics.checkNotNullParameter(up, "up");
            Intrinsics.checkNotNullParameter(forward, "forward");
            Float4 x = result.getX();
            x.setX(right.getX());
            x.setY(right.getY());
            x.setZ(right.getZ());
            result.getX().setW(0.0f);
            Float4 y = result.getY();
            y.setX(up.getX());
            y.setY(up.getY());
            y.setZ(up.getZ());
            result.getY().setW(0.0f);
            Float4 z = result.getZ();
            z.setX(forward.getX());
            z.setY(forward.getY());
            z.setZ(forward.getZ());
            result.getZ().setW(0.0f);
            setFloat4(result.getW(), 0.0f, 0.0f, 0.0f, 1.0f);
        }

        public final void setFloat3(@NotNull Float3 result, float x, float y, float z) {
            Intrinsics.checkNotNullParameter(result, "result");
            result.setX(x);
            result.setY(y);
            result.setZ(z);
        }

        public final void setFloat4(@NotNull Float4 result, float x, float y, float z, float w) {
            Intrinsics.checkNotNullParameter(result, "result");
            result.setX(x);
            result.setY(y);
            result.setZ(z);
            result.setW(w);
        }

        public final void setTempMat(@NotNull Mat4 mat4) {
            Intrinsics.checkNotNullParameter(mat4, "<set-?>");
            Math.tempMat = mat4;
        }

        public final void setTempMat2(@NotNull Mat4 mat4) {
            Intrinsics.checkNotNullParameter(mat4, "<set-?>");
            Math.tempMat2 = mat4;
        }

        public final float sqrMagnitude(float x, float y) {
            return (x * x) + (y * y);
        }

        public final void translationMat4(@NotNull Mat4 result, float x, float y, float z) {
            Intrinsics.checkNotNullParameter(result, "result");
            setFloat4(result.getX(), 1.0f, 0.0f, 0.0f, 0.0f);
            setFloat4(result.getY(), 0.0f, 1.0f, 0.0f, 0.0f);
            setFloat4(result.getZ(), 0.0f, 0.0f, 1.0f, 0.0f);
            setFloat4(result.getW(), x, y, z, 1.0f);
        }

        public final void transposeMat4(@NotNull Mat4 result, @NotNull Mat4 m) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(m, "m");
            setFloat4(result.getX(), m.getX().getX(), m.getY().getX(), m.getZ().getX(), m.getW().getX());
            setFloat4(result.getY(), m.getX().getY(), m.getY().getY(), m.getZ().getY(), m.getW().getY());
            setFloat4(result.getZ(), m.getX().getZ(), m.getY().getZ(), m.getZ().getZ(), m.getW().getZ());
            setFloat4(result.getW(), m.getX().getW(), m.getY().getW(), m.getZ().getW(), m.getW().getW());
        }

        public final void lerp(@NotNull Float2 vec, @NotNull Float2 from, @NotNull Float2 to, float t) {
            Intrinsics.checkNotNullParameter(vec, "vec");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            float f = 1.0f - t;
            vec.setX((from.getX() * f) + (to.getX() * t));
            vec.setY((from.getY() * f) + (to.getY() * t));
        }

        public final float magnitude(@NotNull Float3 vec) {
            Intrinsics.checkNotNullParameter(vec, "vec");
            return (float) java.lang.Math.sqrt((vec.getX() * vec.getX()) + (vec.getY() * vec.getY()) + (vec.getZ() * vec.getZ()));
        }

        public final float sqrMagnitude(float x, float y, float z) {
            return (x * x) + (y * y) + (z * z);
        }

        public final float sqrMagnitude(@NotNull Float3 vec) {
            Intrinsics.checkNotNullParameter(vec, "vec");
            return (vec.getX() * vec.getX()) + (vec.getY() * vec.getY()) + (vec.getZ() * vec.getZ());
        }

        public final float magnitude(@NotNull Float2 vec) {
            Intrinsics.checkNotNullParameter(vec, "vec");
            return (float) java.lang.Math.sqrt((vec.getX() * vec.getX()) + (vec.getY() * vec.getY()));
        }

        public final void reverseVec3(@NotNull Float3 vec) {
            Intrinsics.checkNotNullParameter(vec, "vec");
            vec.setX(-vec.getX());
            vec.setY(-vec.getY());
            vec.setZ(-vec.getZ());
        }

        public final void normalizeVec3(@NotNull Float3 result, @NotNull Float3 vec) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(vec, "vec");
            float fSqrt = 1.0f / ((float) java.lang.Math.sqrt(((vec.getX() * vec.getX()) + (vec.getY() * vec.getY())) + (vec.getZ() * vec.getZ())));
            result.setX(vec.getX() * fSqrt);
            result.setY(vec.getY() * fSqrt);
            result.setZ(fSqrt * vec.getZ());
        }

        public final float magnitude(float x, float y) {
            return (float) java.lang.Math.sqrt((x * x) + (y * y));
        }

        public final void mat4MulFloat4(@NotNull Float3 result, @NotNull Mat4 mat, @NotNull Float4 v) {
            Intrinsics.checkNotNullParameter(result, "result");
            Intrinsics.checkNotNullParameter(mat, "mat");
            Intrinsics.checkNotNullParameter(v, "v");
            transposeMat4(getTempMat2(), mat);
            Float4 x = getTempMat2().getX();
            result.setX((x.getX() * v.getX()) + (x.getY() * v.getY()) + (x.getZ() * v.getZ()) + (x.getW() * v.getW()));
            Float4 y = getTempMat2().getY();
            result.setY((y.getX() * v.getX()) + (y.getY() * v.getY()) + (y.getZ() * v.getZ()) + (y.getW() * v.getW()));
            Float4 z = getTempMat2().getZ();
            result.setZ((z.getX() * v.getX()) + (z.getY() * v.getY()) + (z.getZ() * v.getZ()) + (z.getW() * v.getW()));
        }
    }
}
