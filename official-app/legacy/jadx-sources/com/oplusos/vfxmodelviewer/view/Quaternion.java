package com.oplusos.vfxmodelviewer.view;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ImageEntity;
import com.oplusos.vfxmodelviewer.utils.Float3;
import com.oplusos.vfxmodelviewer.utils.Mat4;
import com.oplusos.vfxmodelviewer.utils.VectorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 K2\u00020\u0001:\u0001KB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB-\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\u0006\u0010\u001f\u001a\u00020\u0000J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\u0006\u0010$\u001a\u00020\u0000J1\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0016\u0010)\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bJ\u0011\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u000201H\u0086\u0002J\t\u00102\u001a\u000201HÖ\u0001J\u0006\u00103\u001a\u00020\u0000J\u000e\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020\u0000J\u0006\u00106\u001a\u00020\u0000J\u0010\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020\u0006H\u0002J\u000e\u00109\u001a\u00020*2\u0006\u00105\u001a\u00020\u0000J&\u00109\u001a\u00020*2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\b2\u0006\u0010:\u001a\u00020\bJ\u0019\u00109\u001a\u00020*2\u0006\u00100\u001a\u0002012\u0006\u0010;\u001a\u00020\bH\u0086\u0002J\u0006\u0010<\u001a\u00020*J\u0006\u0010=\u001a\u00020*J\u0016\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006J\u0006\u0010A\u001a\u00020*J\u0011\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u0006H\u0086\u0002J\u0011\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\bH\u0086\u0002J\u000e\u0010D\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010E\u001a\u00020FJ\u000e\u0010G\u001a\u00020*2\u0006\u0010;\u001a\u00020\u0006J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0000H\u0086\u0002R\u001a\u0010\r\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R&\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006L"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/Quaternion;", "", ImageEntity.SCALE_TYPE_MATRIX, "Lcom/oplusos/vfxmodelviewer/utils/Mat4;", "(Lcom/oplusos/vfxmodelviewer/utils/Mat4;)V", "axis", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "angle", "", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;F)V", "x", "y", "z", "w", "(FFFF)V", "getW", "()F", "setW", "(F)V", "getX", "setX", "value", "xyz", "getXyz", "()Lcom/oplusos/vfxmodelviewer/utils/Float3;", "setXyz", "(Lcom/oplusos/vfxmodelviewer/utils/Float3;)V", "getY", "setY", "getZ", "setZ", "clone", "component1", "component2", "component3", "component4", "conj", "copy", "equals", "", "other", "fromAxisAngle", "", "fromEuler", "_x", "_y", "_z", ParserTag.TAG_GET, "index", "", "hashCode", "inverse", "multiplyQuaternion", "quat", "normalize", "sanitizeEuler", "euler", "set", "_w", "v", "setConj", "setIdentity", "setLookRotation", "forward", y04.TIME_STYLE_UP_DIR_NAME, "setNormalize", "times", "r", "toAngleAxis", "toArray", "", "toEulerAngles", "toString", "", "unaryMinus", "Companion", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class Quaternion {
    public static final float half_degToRad = 0.0087265f;
    public static final float negativeFlip = -1.0E-4f;
    public static final float positiveFlip = 6.2830853f;
    public static final float two_pi = 6.2831855f;
    public static final float value_eps = 1.1920929E-6f;
    private float w;
    private float x;
    private float y;
    private float z;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static Float3 tempVec3_A = new Float3(0.0f, 0.0f, 0.0f, 7, null);

    public Quaternion() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    public static /* synthetic */ Quaternion copy$default(Quaternion quaternion, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = quaternion.x;
        }
        if ((i & 2) != 0) {
            f2 = quaternion.y;
        }
        if ((i & 4) != 0) {
            f3 = quaternion.z;
        }
        if ((i & 8) != 0) {
            f4 = quaternion.w;
        }
        return quaternion.copy(f, f2, f3, f4);
    }

    private final void sanitizeEuler(Float3 euler) {
        if (euler.getX() < -1.0E-4f) {
            euler.setX(euler.getX() + 6.2831855f);
        } else if (euler.getX() > 6.2830853f) {
            euler.setX(euler.getX() - 6.2831855f);
        }
        if (euler.getY() < -1.0E-4f) {
            euler.setY(euler.getY() + 6.2831855f);
        } else if (euler.getY() > 6.2830853f) {
            euler.setY(euler.getY() - 6.2831855f);
        }
        if (euler.getZ() < -1.0E-4f) {
            euler.setZ(euler.getZ() + 6.2831855f);
        } else if (euler.getZ() > 6.2830853f) {
            euler.setZ(euler.getZ() + 6.2831855f);
        }
    }

    @NotNull
    public final Quaternion clone() {
        return new Quaternion(this.x, this.y, this.z, this.w);
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
    public final Quaternion conj() {
        return new Quaternion(-this.x, -this.y, -this.z, this.w);
    }

    @NotNull
    public final Quaternion copy(float x, float y, float z, float w) {
        return new Quaternion(x, y, z, w);
    }

    public boolean equals(@Nullable Object other) {
        Quaternion quaternion = other instanceof Quaternion ? (Quaternion) other : null;
        if (quaternion == null) {
            return false;
        }
        Math.Companion companion = Math.INSTANCE;
        return companion.approximately(getW(), quaternion.getW()) & companion.approximately(getX(), quaternion.getX()) & companion.approximately(getY(), quaternion.getY()) & companion.approximately(getZ(), quaternion.getZ());
    }

    public final void fromAxisAngle(@NotNull Float3 axis, float angle) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        Float3 float3Normalize = VectorKt.normalize(axis);
        double d = angle * 0.0087265f;
        float fSin = (float) java.lang.Math.sin(d);
        this.w = (float) java.lang.Math.cos(d);
        this.x = float3Normalize.getX() * fSin;
        this.y = float3Normalize.getY() * fSin;
        this.z = float3Normalize.getZ() * fSin;
    }

    public final void fromEuler(float _x, float _y, float _z) {
        double d = _x * 0.0087265f;
        float fSin = (float) java.lang.Math.sin(d);
        float fCos = (float) java.lang.Math.cos(d);
        double d2 = _y * 0.0087265f;
        float fSin2 = (float) java.lang.Math.sin(d2);
        float fCos2 = (float) java.lang.Math.cos(d2);
        double d3 = _z * 0.0087265f;
        float fSin3 = (float) java.lang.Math.sin(d3);
        float fCos3 = (float) java.lang.Math.cos(d3);
        float f = fCos2 * fSin;
        float f2 = fSin2 * fCos;
        this.x = (f * fCos3) + (f2 * fSin3);
        this.y = (f2 * fCos3) - (f * fSin3);
        float f3 = fCos2 * fCos;
        float f4 = fSin2 * fSin;
        this.z = (f3 * fSin3) - (f4 * fCos3);
        this.w = (f3 * fCos3) + (f4 * fSin3);
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
        throw new IllegalArgumentException("index must 0..3");
    }

    public final float getW() {
        return this.w;
    }

    public final float getX() {
        return this.x;
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
        return (((((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.z)) * 31) + Float.hashCode(this.w);
    }

    @NotNull
    public final Quaternion inverse() {
        return conj().times(1.0f / INSTANCE.dot(this, this));
    }

    public final void multiplyQuaternion(@NotNull Quaternion quat) {
        Intrinsics.checkNotNullParameter(quat, "quat");
        float f = this.w;
        float f2 = quat.x;
        float f3 = this.x;
        float f4 = quat.w;
        float f5 = this.y;
        float f6 = quat.z;
        float f7 = this.z;
        float f8 = quat.y;
        this.x = (((f * f2) + (f3 * f4)) + (f5 * f6)) - (f7 * f8);
        this.y = ((f * f8) - (f3 * f6)) + (f5 * f4) + (f7 * f2);
        this.z = (((f * f6) + (f3 * f8)) - (f5 * f2)) + (f7 * f4);
        this.w = (((f * f4) - (f3 * f2)) - (f5 * f8)) - (f7 * f6);
    }

    @NotNull
    public final Quaternion normalize() {
        Quaternion quaternionClone = clone();
        quaternionClone.setNormalize();
        return quaternionClone;
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

    public final void setConj() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
    }

    public final void setIdentity() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.z = 0.0f;
        this.w = 1.0f;
    }

    public final void setLookRotation(@NotNull Float3 forward, @NotNull Float3 up) {
        Intrinsics.checkNotNullParameter(forward, "forward");
        Intrinsics.checkNotNullParameter(up, "up");
        INSTANCE.lookRotation(this, forward, up);
    }

    public final void setNormalize() {
        float f = this.x;
        float f2 = this.y;
        float f3 = (f * f) + (f2 * f2);
        float f4 = this.z;
        float f5 = f3 + (f4 * f4);
        float f6 = this.w;
        float f7 = f5 + (f6 * f6);
        if ((f7 == 1.0f) || f7 <= 0.0f) {
            return;
        }
        float fSqrt = 1.0f / ((float) java.lang.Math.sqrt(f7));
        this.x *= fSqrt;
        this.y *= fSqrt;
        this.z *= fSqrt;
        this.w *= fSqrt;
    }

    public final void setW(float f) {
        this.w = f;
    }

    public final void setX(float f) {
        this.x = f;
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
    public final Quaternion times(float r) {
        return new Quaternion(this.x * r, this.y * r, this.z * r, this.w * r);
    }

    public final float toAngleAxis(@NotNull Float3 axis) {
        Intrinsics.checkNotNullParameter(axis, "axis");
        float fAcos = ((float) java.lang.Math.acos(this.w)) * 2.0f;
        if (Math.INSTANCE.approximately(fAcos, 0.0f)) {
            axis.setX(1.0f);
            axis.setY(0.0f);
            axis.setZ(0.0f);
        } else {
            float fSqrt = 1.0f / ((float) java.lang.Math.sqrt(1.0f - ((float) java.lang.Math.sqrt(this.w))));
            axis.setX(this.x * fSqrt);
            axis.setY(this.y * fSqrt);
            axis.setZ(this.z * fSqrt);
        }
        return fAcos * 57.29578f;
    }

    @NotNull
    public final float[] toArray() {
        return new float[]{this.x, this.y, this.z, this.w};
    }

    public final void toEulerAngles(@NotNull Float3 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float f = ((this.y * this.z) - (this.w * this.x)) * 2.0f;
        if (f >= 0.999f) {
            v.setX(-1.5707964f);
            float f2 = this.x;
            float f3 = this.y;
            float f4 = this.w;
            float f5 = this.z;
            v.setY((float) java.lang.Math.atan2((-2) * ((f2 * f3) - (f4 * f5)), 1 - (2 * ((f3 * f3) + (f5 * f5)))));
            v.setZ(0.0f);
            sanitizeEuler(v);
            v.setX(v.getX() * 57.29578f);
            v.setY(v.getY() * 57.29578f);
            v.setZ(v.getZ() * 57.29578f);
            return;
        }
        if (f <= -0.999f) {
            v.setX(1.5707964f);
            float f6 = 2;
            float f7 = this.x;
            float f8 = this.y;
            float f9 = this.w;
            float f10 = this.z;
            v.setY((float) java.lang.Math.atan2(((f7 * f8) - (f9 * f10)) * f6, 1 - (f6 * ((f8 * f8) + (f10 * f10)))));
            v.setZ(0.0f);
            sanitizeEuler(v);
            v.setX(v.getX() * 57.29578f);
            v.setY(v.getY() * 57.29578f);
            v.setZ(v.getZ() * 57.29578f);
            return;
        }
        v.setX(-((float) java.lang.Math.asin(f)));
        float f11 = 2;
        float f12 = this.x;
        float f13 = this.z * f12;
        float f14 = this.w;
        float f15 = this.y;
        float f16 = (f13 + (f14 * f15)) * f11;
        float f17 = 1;
        v.setY((float) java.lang.Math.atan2(f16, f17 - (((f12 * f12) + (f15 * f15)) * f11)));
        float f18 = this.x;
        float f19 = this.y * f18;
        float f20 = this.w;
        float f21 = this.z;
        v.setZ((float) java.lang.Math.atan2((f19 + (f20 * f21)) * f11, f17 - (f11 * ((f18 * f18) + (f21 * f21)))));
        sanitizeEuler(v);
        v.setX(v.getX() * 57.29578f);
        v.setY(v.getY() * 57.29578f);
        v.setZ(v.getZ() * 57.29578f);
    }

    @NotNull
    public String toString() {
        return "Quaternion(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ", w=" + this.w + ')';
    }

    @NotNull
    public final Quaternion unaryMinus() {
        return new Quaternion(-this.x, -this.y, -this.z, -this.w);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\rJ\u0016\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ&\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0004J\u001e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0004J\u001e\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bJ&\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0004J\u001e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0004J\u001e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bJ&\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0004J&\u0010 \u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/Quaternion$Companion;", "", "()V", "half_degToRad", "", "negativeFlip", "positiveFlip", "tempVec3_A", "Lcom/oplusos/vfxmodelviewer/utils/Float3;", "two_pi", "value_eps", "angle", "a", "Lcom/oplusos/vfxmodelviewer/view/Quaternion;", "b", "copy", "", "from", TypedValues.TransitionType.S_TO, "dot", "lerp", "quat", "t", "lookRotation", "forward", y04.TIME_STYLE_UP_DIR_NAME, "nLerp", "nLookRotation", "nForward", "nUp", "rotateTowards", "maxDegreesDelta", "slerp", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float angle(@NotNull Quaternion a, @NotNull Quaternion b) {
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            return ((float) java.lang.Math.acos(java.lang.Math.min(java.lang.Math.abs(dot(a, b)), 1.0f))) * 2.0f * 57.29578f;
        }

        public final void copy(@NotNull Quaternion from, @NotNull Quaternion to) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            to.setX(from.getX());
            to.setY(from.getY());
            to.setZ(from.getZ());
            to.setW(from.getW());
        }

        public final float dot(@NotNull Quaternion a, @NotNull Quaternion b) {
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            return (a.getX() * b.getX()) + (a.getY() * b.getY()) + (a.getZ() * b.getZ()) + (a.getW() * b.getW());
        }

        public final void lerp(@NotNull Quaternion quat, @NotNull Quaternion from, @NotNull Quaternion to, float t) {
            Intrinsics.checkNotNullParameter(quat, "quat");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            if (t < 0.0f) {
                t = 0.0f;
            } else if (t > 1.0f) {
                t = 1.0f;
            }
            float f = 1.0f - t;
            quat.setX((from.getX() * f) + (to.getX() * t));
            quat.setY((from.getY() * f) + (to.getY() * t));
            quat.setZ((from.getZ() * f) + (to.getZ() * t));
            quat.setW((f * from.getW()) + (t * to.getW()));
        }

        public final void lookRotation(@NotNull Quaternion quat, @NotNull Float3 forward, @NotNull Float3 up) {
            Intrinsics.checkNotNullParameter(quat, "quat");
            Intrinsics.checkNotNullParameter(forward, "forward");
            Intrinsics.checkNotNullParameter(up, "up");
            Math.Companion companion = Math.INSTANCE;
            companion.normalizeVec3(forward);
            companion.normalizeVec3(up);
            nLookRotation(quat, forward, up);
        }

        public final void nLerp(@NotNull Quaternion quat, @NotNull Quaternion from, @NotNull Quaternion to, float t) {
            Intrinsics.checkNotNullParameter(quat, "quat");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            lerp(quat, from, to, t);
            quat.setNormalize();
        }

        public final void nLookRotation(@NotNull Quaternion quat, @NotNull Float3 nForward, @NotNull Float3 nUp) {
            Intrinsics.checkNotNullParameter(quat, "quat");
            Intrinsics.checkNotNullParameter(nForward, "nForward");
            Intrinsics.checkNotNullParameter(nUp, "nUp");
            if (java.lang.Math.abs((nForward.getX() * nUp.getX()) + (nForward.getY() * nUp.getY()) + (nForward.getZ() * nUp.getZ())) > 0.999f) {
                float x = nUp.getX();
                float y = nUp.getY();
                nUp.setX(nUp.getZ());
                nUp.setY(x);
                nUp.setZ(y);
            }
            Math.Companion companion = Math.INSTANCE;
            companion.crossVec3(Quaternion.tempVec3_A, nForward, nUp);
            companion.normalizeVec3(Quaternion.tempVec3_A);
            companion.crossVec3(nUp, Quaternion.tempVec3_A, nForward);
            companion.reverseVec3(nForward);
            Mat4 tempMat = companion.getTempMat();
            companion.rufToMat(tempMat, Quaternion.tempVec3_A, nUp, nForward);
            companion.matrixToQuaternion(tempMat, quat);
            quat.setNormalize();
        }

        public final void rotateTowards(@NotNull Quaternion quat, @NotNull Quaternion from, @NotNull Quaternion to, float maxDegreesDelta) {
            Intrinsics.checkNotNullParameter(quat, "quat");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            float fAngle = angle(from, to);
            if (fAngle == 0.0f) {
                quat.set(to);
            } else {
                slerp(quat, from, to, java.lang.Math.min(1.0f, maxDegreesDelta / fAngle));
            }
        }

        public final void slerp(@NotNull Quaternion quat, @NotNull Quaternion from, @NotNull Quaternion to, float t) {
            Intrinsics.checkNotNullParameter(quat, "quat");
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            float fDot = dot(from, to);
            float fAbs = java.lang.Math.abs(fDot);
            float f = 1.0f;
            if (1.0f - fAbs < 1.1920929E-6f) {
                if (fDot < 0.0f) {
                    from = from.unaryMinus();
                }
                nLerp(quat, from, to, t);
                return;
            }
            float fSqrt = fAbs / ((float) java.lang.Math.sqrt(dot(from, from) * dot(to, to)));
            if (fSqrt < -1.0f) {
                f = -1.0f;
            } else if (fSqrt <= 1.0f) {
                f = fSqrt;
            }
            float fAcos = (float) java.lang.Math.acos(f);
            float fSin = (float) java.lang.Math.sin(fAcos);
            if (fSin < 1.1920929E-6f) {
                nLerp(quat, from, to, t);
                return;
            }
            float f2 = 1;
            float f3 = (f2 - t) * fAcos;
            float f4 = fAcos * t;
            float f5 = f2 / fSin;
            float fSin2 = ((float) java.lang.Math.sin(f3)) * f5;
            float fSin3 = ((float) java.lang.Math.sin(f4)) * f5;
            if (fDot < 0.0f) {
                fSin3 = -fSin3;
            }
            quat.setX((from.getX() * fSin2) + (to.getX() * fSin3));
            quat.setY((from.getY() * fSin2) + (to.getY() * fSin3));
            quat.setZ((from.getZ() * fSin2) + (to.getZ() * fSin3));
            quat.setW((fSin2 * from.getW()) + (fSin3 * to.getW()));
            quat.setNormalize();
        }

        @NotNull
        public final Quaternion nLerp(@NotNull Quaternion from, @NotNull Quaternion to, float t) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            Quaternion quaternion = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            nLerp(quaternion, from, to, t);
            return quaternion;
        }

        @NotNull
        public final Quaternion lerp(@NotNull Quaternion from, @NotNull Quaternion to, float t) {
            Intrinsics.checkNotNullParameter(from, "from");
            Intrinsics.checkNotNullParameter(to, "to");
            Quaternion quaternion = new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            lerp(quaternion, from, to, t);
            return quaternion;
        }
    }

    public Quaternion(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.w = f4;
    }

    @NotNull
    public final Quaternion times(@NotNull Quaternion r) {
        Intrinsics.checkNotNullParameter(r, "r");
        float f = this.w;
        float f2 = r.x;
        float f3 = this.x;
        float f4 = r.w;
        float f5 = (f * f2) + (f3 * f4);
        float f6 = this.y;
        float f7 = r.z;
        float f8 = this.z;
        float f9 = r.y;
        return new Quaternion((f5 + (f6 * f7)) - (f8 * f9), ((f * f9) - (f3 * f7)) + (f6 * f4) + (f8 * f2), (((f * f7) + (f3 * f9)) - (f6 * f2)) + (f8 * f4), (((f * f4) - (f3 * f2)) - (f6 * f9)) - (f8 * f7));
    }

    public /* synthetic */ Quaternion(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 1.0f : f4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Quaternion(@NotNull Mat4 matrix) {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Math.INSTANCE.matrixToQuaternion(matrix, this);
    }

    @NotNull
    public final Float3 times(@NotNull Float3 r) {
        Intrinsics.checkNotNullParameter(r, "r");
        Float3 float3 = new Float3(0.0f, 0.0f, 0.0f, 7, null);
        float f = this.x;
        float f2 = f * 2.0f;
        float f3 = this.y;
        float f4 = f3 * 2.0f;
        float f5 = this.z;
        float f6 = 2.0f * f5;
        float f7 = f * f2;
        float f8 = f3 * f4;
        float f9 = f5 * f6;
        float f10 = f * f4;
        float f11 = f * f6;
        float f12 = f3 * f6;
        float f13 = this.w;
        float f14 = f2 * f13;
        float f15 = f4 * f13;
        float f16 = f13 * f6;
        float3.setX(((1.0f - (f8 + f9)) * r.getX()) + ((f10 - f16) * r.getY()) + ((f11 + f15) * r.getZ()));
        float3.setY(((f10 + f16) * r.getX()) + ((1.0f - (f9 + f7)) * r.getY()) + ((f12 - f14) * r.getZ()));
        float3.setZ(((f11 - f15) * r.getX()) + ((f12 + f14) * r.getY()) + ((1.0f - (f7 + f8)) * r.getZ()));
        return float3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Quaternion(@NotNull Float3 axis, float f) {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        Intrinsics.checkNotNullParameter(axis, "axis");
        fromAxisAngle(axis, f);
    }

    public final void set(@NotNull Quaternion quat) {
        Intrinsics.checkNotNullParameter(quat, "quat");
        this.x = quat.x;
        this.y = quat.y;
        this.z = quat.z;
        this.w = quat.w;
    }

    public final void set(float _x, float _y, float _z, float _w) {
        this.x = _x;
        this.y = _y;
        this.z = _z;
        this.w = _w;
    }
}
