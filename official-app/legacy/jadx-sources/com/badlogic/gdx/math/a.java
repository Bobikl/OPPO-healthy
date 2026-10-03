package com.badlogic.gdx.math;

/* JADX INFO: loaded from: classes13.dex */
public class a {
    public static final Vector3[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float[] f1248e;
    public static final Vector3 f;
    public final Plane[] a = new Plane[6];
    public final Vector3[] b = {new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3(), new Vector3()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f1249c = new float[24];

    static {
        int i = 0;
        Vector3[] vector3Arr = {new Vector3(-1.0f, -1.0f, -1.0f), new Vector3(1.0f, -1.0f, -1.0f), new Vector3(1.0f, 1.0f, -1.0f), new Vector3(-1.0f, 1.0f, -1.0f), new Vector3(-1.0f, -1.0f, 1.0f), new Vector3(1.0f, -1.0f, 1.0f), new Vector3(1.0f, 1.0f, 1.0f), new Vector3(-1.0f, 1.0f, 1.0f)};
        d = vector3Arr;
        f1248e = new float[24];
        int length = vector3Arr.length;
        int i2 = 0;
        while (i < length) {
            Vector3 vector3 = vector3Arr[i];
            float[] fArr = f1248e;
            int i3 = i2 + 1;
            fArr[i2] = vector3.x;
            int i4 = i3 + 1;
            fArr[i3] = vector3.y;
            fArr[i4] = vector3.z;
            i++;
            i2 = i4 + 1;
        }
        f = new Vector3();
    }

    public a() {
        for (int i = 0; i < 6; i++) {
            this.a[i] = new Plane(new Vector3(), 0.0f);
        }
    }

    public void a(Matrix4 matrix4) {
        float[] fArr = f1248e;
        System.arraycopy(fArr, 0, this.f1249c, 0, fArr.length);
        Matrix4.prj(matrix4.val, this.f1249c, 0, 8, 3);
        int i = 0;
        int i2 = 0;
        while (i < 8) {
            Vector3 vector3 = this.b[i];
            float[] fArr2 = this.f1249c;
            int i3 = i2 + 1;
            vector3.x = fArr2[i2];
            int i4 = i3 + 1;
            vector3.y = fArr2[i3];
            vector3.z = fArr2[i4];
            i++;
            i2 = i4 + 1;
        }
        Plane plane = this.a[0];
        Vector3[] vector3Arr = this.b;
        plane.set(vector3Arr[1], vector3Arr[0], vector3Arr[2]);
        Plane plane2 = this.a[1];
        Vector3[] vector3Arr2 = this.b;
        plane2.set(vector3Arr2[4], vector3Arr2[5], vector3Arr2[7]);
        Plane plane3 = this.a[2];
        Vector3[] vector3Arr3 = this.b;
        plane3.set(vector3Arr3[0], vector3Arr3[4], vector3Arr3[3]);
        Plane plane4 = this.a[3];
        Vector3[] vector3Arr4 = this.b;
        plane4.set(vector3Arr4[5], vector3Arr4[1], vector3Arr4[6]);
        Plane plane5 = this.a[4];
        Vector3[] vector3Arr5 = this.b;
        plane5.set(vector3Arr5[2], vector3Arr5[3], vector3Arr5[6]);
        Plane plane6 = this.a[5];
        Vector3[] vector3Arr6 = this.b;
        plane6.set(vector3Arr6[4], vector3Arr6[0], vector3Arr6[1]);
    }
}
