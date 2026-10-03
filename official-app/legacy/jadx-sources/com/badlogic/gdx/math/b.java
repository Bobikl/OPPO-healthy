package com.badlogic.gdx.math;

import com.oplus.aiunit.vision.gt7;

/* JADX INFO: loaded from: classes13.dex */
public final class b {
    public static final Vector3 a = new Vector3();
    public static final Vector3 b = new Vector3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Vector3 f1250c = new Vector3();
    public static final gt7 d = new gt7();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final gt7 f1251e = new gt7();
    public static final Vector2 f = new Vector2();
    public static final Vector2 g = new Vector2();
    public static final Vector2 h = new Vector2();
    public static final Vector2 i = new Vector2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Vector2 f1252j = new Vector2();
    public static Vector2 k = new Vector2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Vector2 f1253l = new Vector2();
    public static Vector2 m = new Vector2();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Vector2 f1254n = new Vector2();
    public static final Plane o = new Plane(new Vector3(), 0.0f);
    public static final Vector3 p = new Vector3();
    public static final Vector3 q = new Vector3();
    public static final Vector3 r = new Vector3();
    public static Vector3 s = new Vector3();
    public static Vector3 t = new Vector3();
    public static Vector3 u = new Vector3();
    public static Vector3 v = new Vector3();
    public static Vector3 w = new Vector3();
    public static Vector3 x = new Vector3();

    public static boolean a(Vector3[] vector3Arr, Vector3[] vector3Arr2, Vector3[] vector3Arr3) {
        for (Vector3 vector3 : vector3Arr) {
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (Vector3 vector4 : vector3Arr2) {
                float fDot = vector4.dot(vector3);
                fMin2 = Math.min(fMin2, fDot);
                fMax2 = Math.max(fMax2, fDot);
            }
            for (Vector3 vector5 : vector3Arr3) {
                float fDot2 = vector5.dot(vector3);
                fMin = Math.min(fMin, fDot2);
                fMax = Math.max(fMax, fDot2);
            }
            if (fMax2 < fMin || fMax < fMin2) {
                return false;
            }
        }
        return true;
    }
}
