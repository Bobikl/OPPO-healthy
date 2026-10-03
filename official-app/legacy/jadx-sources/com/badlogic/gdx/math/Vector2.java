package com.badlogic.gdx.math;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.aiunit.vision.onb;
import com.oplus.aiunit.vision.ouk;
import com.oplus.aiunit.vision.rzc;
import com.oplus.aiunit.vision.sfa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class Vector2 implements Serializable, ouk<Vector2> {
    public static final Vector2 X = new Vector2(1.0f, 0.0f);
    public static final Vector2 Y = new Vector2(0.0f, 1.0f);
    public static final Vector2 Zero = new Vector2(0.0f, 0.0f);
    private static final long serialVersionUID = 913902788239530931L;
    public float x;
    public float y;

    public Vector2() {
    }

    public static float dot(float f, float f2, float f3, float f4) {
        return (f * f3) + (f2 * f4);
    }

    public static float dst2(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (f5 * f5) + (f6 * f6);
    }

    public static float len(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public static float len2(float f, float f2) {
        return (f * f) + (f2 * f2);
    }

    @Deprecated
    public float angle() {
        float fAtan2 = ((float) Math.atan2(this.y, this.x)) * 57.295776f;
        return fAtan2 < 0.0f ? fAtan2 + 360.0f : fAtan2;
    }

    public float angleDeg() {
        float fAtan2 = ((float) Math.atan2(this.y, this.x)) * 57.295776f;
        return fAtan2 < 0.0f ? fAtan2 + 360.0f : fAtan2;
    }

    public float angleRad() {
        return (float) Math.atan2(this.y, this.x);
    }

    public float crs(Vector2 vector2) {
        return (this.x * vector2.y) - (this.y * vector2.x);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vector2 vector2 = (Vector2) obj;
        return rzc.a(this.x) == rzc.a(vector2.x) && rzc.a(this.y) == rzc.a(vector2.y);
    }

    public Vector2 fromString(String str) {
        int iIndexOf = str.indexOf(44, 1);
        if (iIndexOf != -1 && str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')') {
            try {
                return set(Float.parseFloat(str.substring(1, iIndexOf)), Float.parseFloat(str.substring(iIndexOf + 1, str.length() - 1)));
            } catch (NumberFormatException unused) {
            }
        }
        throw new GdxRuntimeException("Malformed Vector2: " + str);
    }

    public int hashCode() {
        return ((rzc.a(this.x) + 31) * 31) + rzc.a(this.y);
    }

    public boolean idt(Vector2 vector2) {
        return this.x == vector2.x && this.y == vector2.y;
    }

    public boolean isUnit() {
        return isUnit(1.0E-9f);
    }

    public boolean isZero() {
        return this.x == 0.0f && this.y == 0.0f;
    }

    public Vector2 mul(Matrix3 matrix3) {
        float f = this.x;
        float[] fArr = matrix3.val;
        float f2 = fArr[0] * f;
        float f3 = this.y;
        float f4 = f2 + (fArr[3] * f3) + fArr[6];
        float f5 = (f * fArr[1]) + (f3 * fArr[4]) + fArr[7];
        this.x = f4;
        this.y = f5;
        return this;
    }

    @Deprecated
    public Vector2 rotate(float f) {
        return rotateRad(f * 0.017453292f);
    }

    public Vector2 rotate90(int i) {
        float f = this.x;
        if (i >= 0) {
            this.x = -this.y;
            this.y = f;
        } else {
            this.x = this.y;
            this.y = -f;
        }
        return this;
    }

    @Deprecated
    public Vector2 rotateAround(Vector2 vector2, float f) {
        return sub(vector2).rotateDeg(f).add(vector2);
    }

    public Vector2 rotateAroundDeg(Vector2 vector2, float f) {
        return sub(vector2).rotateDeg(f).add(vector2);
    }

    public Vector2 rotateAroundRad(Vector2 vector2, float f) {
        return sub(vector2).rotateRad(f).add(vector2);
    }

    public Vector2 rotateDeg(float f) {
        return rotateRad(f * 0.017453292f);
    }

    public Vector2 rotateRad(float f) {
        double d = f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = this.x;
        float f3 = this.y;
        this.x = (f2 * fCos) - (f3 * fSin);
        this.y = (f2 * fSin) + (f3 * fCos);
        return this;
    }

    @Deprecated
    public Vector2 setAngle(float f) {
        return setAngleRad(f * 0.017453292f);
    }

    public Vector2 setAngleDeg(float f) {
        return setAngleRad(f * 0.017453292f);
    }

    public Vector2 setAngleRad(float f) {
        set(len(), 0.0f);
        rotateRad(f);
        return this;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    public Vector2(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    public static float dst(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    public Vector2 add(Vector2 vector2) {
        this.x += vector2.x;
        this.y += vector2.y;
        return this;
    }

    @Deprecated
    public float angle(Vector2 vector2) {
        return ((float) Math.atan2(crs(vector2), dot(vector2))) * 57.295776f;
    }

    public float angleDeg(Vector2 vector2) {
        float fAtan2 = ((float) Math.atan2(vector2.crs(this), vector2.dot(this))) * 57.295776f;
        return fAtan2 < 0.0f ? fAtan2 + 360.0f : fAtan2;
    }

    public float angleRad(Vector2 vector2) {
        return (float) Math.atan2(vector2.crs(this), vector2.dot(this));
    }

    /* JADX INFO: renamed from: clamp, reason: merged with bridge method [inline-methods] */
    public Vector2 m4499clamp(float f, float f2) {
        float fLen2 = len2();
        if (fLen2 == 0.0f) {
            return this;
        }
        float f3 = f2 * f2;
        if (fLen2 > f3) {
            return m4504scl((float) Math.sqrt(f3 / fLen2));
        }
        float f4 = f * f;
        return fLen2 < f4 ? m4504scl((float) Math.sqrt(f4 / fLen2)) : this;
    }

    /* JADX INFO: renamed from: cpy, reason: merged with bridge method [inline-methods] */
    public Vector2 m4500cpy() {
        return new Vector2(this);
    }

    public float crs(float f, float f2) {
        return (this.x * f2) - (this.y * f);
    }

    public boolean epsilonEquals(Vector2 vector2, float f) {
        return vector2 != null && Math.abs(vector2.x - this.x) <= f && Math.abs(vector2.y - this.y) <= f;
    }

    public boolean hasOppositeDirection(Vector2 vector2) {
        return dot(vector2) < 0.0f;
    }

    public boolean hasSameDirection(Vector2 vector2) {
        return dot(vector2) > 0.0f;
    }

    public Vector2 interpolate(Vector2 vector2, float f, sfa sfaVar) {
        return lerp(vector2, sfaVar.a(f));
    }

    public boolean isUnit(float f) {
        return Math.abs(len2() - 1.0f) < f;
    }

    public boolean isZero(float f) {
        return len2() < f;
    }

    public float len() {
        float f = this.x;
        float f2 = this.y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public float len2() {
        float f = this.x;
        float f2 = this.y;
        return (f * f) + (f2 * f2);
    }

    public Vector2 lerp(Vector2 vector2, float f) {
        float f2 = 1.0f - f;
        this.x = (this.x * f2) + (vector2.x * f);
        this.y = (this.y * f2) + (vector2.y * f);
        return this;
    }

    /* JADX INFO: renamed from: limit, reason: merged with bridge method [inline-methods] */
    public Vector2 m4501limit(float f) {
        return m4502limit2(f * f);
    }

    /* JADX INFO: renamed from: limit2, reason: merged with bridge method [inline-methods] */
    public Vector2 m4502limit2(float f) {
        float fLen2 = len2();
        return fLen2 > f ? m4504scl((float) Math.sqrt(f / fLen2)) : this;
    }

    /* JADX INFO: renamed from: nor, reason: merged with bridge method [inline-methods] */
    public Vector2 m4503nor() {
        float fLen = len();
        if (fLen != 0.0f) {
            this.x /= fLen;
            this.y /= fLen;
        }
        return this;
    }

    public Vector2 set(Vector2 vector2) {
        this.x = vector2.x;
        this.y = vector2.y;
        return this;
    }

    /* JADX INFO: renamed from: setLength, reason: merged with bridge method [inline-methods] */
    public Vector2 m4505setLength(float f) {
        return m4506setLength2(f * f);
    }

    /* JADX INFO: renamed from: setLength2, reason: merged with bridge method [inline-methods] */
    public Vector2 m4506setLength2(float f) {
        float fLen2 = len2();
        return (fLen2 == 0.0f || fLen2 == f) ? this : m4504scl((float) Math.sqrt(f / fLen2));
    }

    /* JADX INFO: renamed from: setToRandomDirection, reason: merged with bridge method [inline-methods] */
    public Vector2 m4507setToRandomDirection() {
        float fN = onb.n(0.0f, 6.2831855f);
        return set(onb.e(fN), onb.p(fN));
    }

    /* JADX INFO: renamed from: setZero, reason: merged with bridge method [inline-methods] */
    public Vector2 m4508setZero() {
        this.x = 0.0f;
        this.y = 0.0f;
        return this;
    }

    public Vector2 sub(Vector2 vector2) {
        this.x -= vector2.x;
        this.y -= vector2.y;
        return this;
    }

    public static float angleDeg(float f, float f2) {
        float fAtan2 = ((float) Math.atan2(f2, f)) * 57.295776f;
        return fAtan2 < 0.0f ? fAtan2 + 360.0f : fAtan2;
    }

    public static float angleRad(float f, float f2) {
        return (float) Math.atan2(f2, f);
    }

    public float dot(Vector2 vector2) {
        return (this.x * vector2.x) + (this.y * vector2.y);
    }

    public float dst(Vector2 vector2) {
        float f = vector2.x - this.x;
        float f2 = vector2.y - this.y;
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public float dst2(Vector2 vector2) {
        float f = vector2.x - this.x;
        float f2 = vector2.y - this.y;
        return (f * f) + (f2 * f2);
    }

    public boolean isCollinear(Vector2 vector2, float f) {
        return isOnLine(vector2, f) && dot(vector2) > 0.0f;
    }

    public boolean isCollinearOpposite(Vector2 vector2, float f) {
        return isOnLine(vector2, f) && dot(vector2) < 0.0f;
    }

    public boolean isOnLine(Vector2 vector2) {
        return onb.j((this.x * vector2.y) - (this.y * vector2.x));
    }

    public boolean isPerpendicular(Vector2 vector2) {
        return onb.j(dot(vector2));
    }

    public Vector2 mulAdd(Vector2 vector2, float f) {
        this.x += vector2.x * f;
        this.y += vector2.y * f;
        return this;
    }

    /* JADX INFO: renamed from: scl, reason: merged with bridge method [inline-methods] */
    public Vector2 m4504scl(float f) {
        this.x *= f;
        this.y *= f;
        return this;
    }

    public Vector2 add(float f, float f2) {
        this.x += f;
        this.y += f2;
        return this;
    }

    public float dot(float f, float f2) {
        return (this.x * f) + (this.y * f2);
    }

    public boolean epsilonEquals(float f, float f2, float f3) {
        return Math.abs(f - this.x) <= f3 && Math.abs(f2 - this.y) <= f3;
    }

    public boolean isCollinear(Vector2 vector2) {
        return isOnLine(vector2) && dot(vector2) > 0.0f;
    }

    public boolean isCollinearOpposite(Vector2 vector2) {
        return isOnLine(vector2) && dot(vector2) < 0.0f;
    }

    public boolean isOnLine(Vector2 vector2, float f) {
        return onb.k((this.x * vector2.y) - (this.y * vector2.x), f);
    }

    public boolean isPerpendicular(Vector2 vector2, float f) {
        return onb.k(dot(vector2), f);
    }

    public Vector2 set(float f, float f2) {
        this.x = f;
        this.y = f2;
        return this;
    }

    public Vector2 sub(float f, float f2) {
        this.x -= f;
        this.y -= f2;
        return this;
    }

    public Vector2(Vector2 vector2) {
        set(vector2);
    }

    public float dst2(float f, float f2) {
        float f3 = f - this.x;
        float f4 = f2 - this.y;
        return (f3 * f3) + (f4 * f4);
    }

    public Vector2 mulAdd(Vector2 vector2, Vector2 vector3) {
        this.x += vector2.x * vector3.x;
        this.y += vector2.y * vector3.y;
        return this;
    }

    public Vector2 scl(float f, float f2) {
        this.x *= f;
        this.y *= f2;
        return this;
    }

    public float dst(float f, float f2) {
        float f3 = f - this.x;
        float f4 = f2 - this.y;
        return (float) Math.sqrt((f3 * f3) + (f4 * f4));
    }

    public boolean epsilonEquals(Vector2 vector2) {
        return epsilonEquals(vector2, 1.0E-6f);
    }

    public boolean epsilonEquals(float f, float f2) {
        return epsilonEquals(f, f2, 1.0E-6f);
    }

    public Vector2 scl(Vector2 vector2) {
        this.x *= vector2.x;
        this.y *= vector2.y;
        return this;
    }
}
