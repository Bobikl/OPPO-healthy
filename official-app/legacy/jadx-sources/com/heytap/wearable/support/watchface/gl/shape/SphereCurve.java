package com.heytap.wearable.support.watchface.gl.shape;

import java.nio.FloatBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class SphereCurve extends Mesh {
    private float mAngleSpan = 5.0f;
    private float mDegree;
    private float mRadius;

    public SphereCurve(float f, float f2) {
        this.mRadius = f;
        this.mDegree = f2;
    }

    @Override // com.heytap.wearable.support.watchface.gl.shape.Mesh
    public void create() {
        ArrayList<Float> arrayList = new ArrayList<>();
        ArrayList<Float> arrayList2 = new ArrayList<>();
        ArrayList<Float> arrayList3 = new ArrayList<>();
        ArrayList<Short> arrayList4 = new ArrayList<>();
        float f = this.mAngleSpan;
        int i = (int) (180.0f / f);
        int i2 = (int) (this.mDegree / f);
        double radians = Math.toRadians(f);
        double d = 0.0d;
        for (int i3 = 0; i3 < i + 1; i3++) {
            int i4 = 0;
            double d2 = 0.0d;
            while (i4 < i2 + 1) {
                float fSin = (float) (Math.sin(d) * Math.cos(d2));
                float fSin2 = (float) (Math.sin(d) * Math.sin(d2));
                double d3 = radians;
                float fCos = (float) Math.cos(d);
                arrayList3.add(Float.valueOf(fSin));
                arrayList3.add(Float.valueOf(fSin2));
                arrayList3.add(Float.valueOf(fCos));
                arrayList.add(Float.valueOf(this.mRadius * fSin));
                arrayList.add(Float.valueOf(this.mRadius * fSin2));
                arrayList.add(Float.valueOf(this.mRadius * fCos));
                arrayList2.add(Float.valueOf(i4 / i2));
                arrayList2.add(Float.valueOf(i3 / i));
                d2 += d3;
                i4++;
                radians = d3;
                arrayList4 = arrayList4;
            }
            d += radians;
        }
        ArrayList<Short> arrayList5 = arrayList4;
        short s = (short) (i2 + 1);
        for (short s2 = 0; s2 < i; s2 = (short) (s2 + 1)) {
            for (short s3 = 0; s3 < i2; s3 = (short) (s3 + 1)) {
                int i5 = (s2 * s) + s3;
                short s4 = (short) i5;
                int i6 = ((s2 + 1) * s) + s3;
                short s5 = (short) (i6 + 1);
                arrayList5.add(Short.valueOf((short) (i5 + 1)));
                arrayList5.add(Short.valueOf(s4));
                arrayList5.add(Short.valueOf(s5));
                arrayList5.add(Short.valueOf(s4));
                arrayList5.add(Short.valueOf((short) i6));
                arrayList5.add(Short.valueOf(s5));
            }
        }
        this.mVertexCount = arrayList.size() / 3;
        this.mIndexCount = arrayList5.size();
        FloatBuffer floatBufferConvertToFloatBuffer = convertToFloatBuffer(arrayList);
        FloatBuffer floatBufferConvertToFloatBuffer2 = convertToFloatBuffer(arrayList2);
        FloatBuffer floatBufferConvertToFloatBuffer3 = convertToFloatBuffer(arrayList3);
        beginUpdateData(this.mVertexCount);
        updateData(floatBufferConvertToFloatBuffer, floatBufferConvertToFloatBuffer2, floatBufferConvertToFloatBuffer3);
        endUpdateData();
        updateIndexData(this.mIndexCount, convertToShortBuffer(arrayList5));
    }
}
