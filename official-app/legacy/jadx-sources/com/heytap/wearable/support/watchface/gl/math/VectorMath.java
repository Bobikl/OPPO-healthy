package com.heytap.wearable.support.watchface.gl.math;

import android.opengl.Matrix;
import android.renderscript.Float3;

/* JADX INFO: loaded from: classes2.dex */
public class VectorMath {
    public static float angle(Float3 float3, Float3 float4) {
        return (((float) Math.acos((dot(float3, float4) / length(float3)) / length(float4))) * 180.0f) / 3.1415927f;
    }

    public static void cross(Float3 float3, Float3 float4, Float3 float5) {
        float f = float4.y;
        float f2 = float5.z;
        float f3 = float4.z;
        float3.x = (f * f2) - (float5.y * f3);
        float f4 = float5.x;
        float f5 = float4.x;
        float3.y = (f3 * f4) - (f2 * f5);
        float3.z = (f5 * float5.y) - (float4.y * f4);
    }

    public static float dot(Float3 float3, Float3 float4) {
        return (float3.x * float4.x) + (float3.y * float4.y) + (float3.z * float4.z);
    }

    public static float length(Float3 float3) {
        return Matrix.length(float3.x, float3.y, float3.z);
    }

    public static void normalize(Float3 float3) {
        float length = Matrix.length(float3.x, float3.y, float3.z);
        if (Math.abs(length) > 1.0E-4f) {
            float3.x /= length;
            float3.y /= length;
            float3.z /= length;
        }
    }

    public static void rotate(Float3 float3, float f, float f2, float f3, float f4) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.setRotateM(fArr, 0, f, f2, f3, f4);
        Float3 float4 = new Float3(fArr[0], fArr[4], fArr[8]);
        Float3 float5 = new Float3(fArr[1], fArr[5], fArr[9]);
        Float3 float6 = new Float3(fArr[2], fArr[6], fArr[10]);
        Float3 float7 = new Float3(float3.x, float3.y, float3.z);
        float3.x = dot(float7, float4);
        float3.y = dot(float7, float5);
        float3.z = dot(float7, float6);
    }

    public static void rotate(Float3 float3, Float3 float4, float f, float f2, float f3, float f4) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.setRotateM(fArr, 0, f, f2, f3, f4);
        Float3 float5 = new Float3(fArr[0], fArr[4], fArr[8]);
        Float3 float6 = new Float3(fArr[1], fArr[5], fArr[9]);
        Float3 float7 = new Float3(fArr[2], fArr[6], fArr[10]);
        Float3 float8 = new Float3(float4.x, float4.y, float4.z);
        float3.x = dot(float8, float5);
        float3.y = dot(float8, float6);
        float3.z = dot(float8, float7);
    }
}
