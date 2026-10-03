package com.heytap.wearable.support.watchface.gl.animation;

import android.renderscript.Float3;
import com.heytap.wearable.support.watchface.gl.ObjectAttribute;
import com.heytap.wearable.support.watchface.gl.TransformNode;

/* JADX INFO: loaded from: classes2.dex */
public class RegionTranslate {
    private ObjectAttribute mAttribute;
    private Float3 mMaxPos;
    private Float3 mMinPos;
    private TransformNode mTransformNode;
    private long mLastTime = 0;
    private Float3 mPos = new Float3();
    private float mMaxVel = 0.3f;

    public RegionTranslate(TransformNode transformNode, ObjectAttribute objectAttribute) {
        this.mTransformNode = transformNode;
        this.mAttribute = objectAttribute;
        ObjectAttribute objectAttribute2 = this.mAttribute;
        this.mMinPos = new Float3(objectAttribute2.mCenterX - objectAttribute2.mRadiusX, objectAttribute2.mCenterY - objectAttribute2.mRadiusY, objectAttribute2.mCenterZ - objectAttribute2.mRadiusZ);
        ObjectAttribute objectAttribute3 = this.mAttribute;
        this.mMaxPos = new Float3(objectAttribute3.mCenterX + objectAttribute3.mRadiusX, objectAttribute3.mCenterY + objectAttribute3.mRadiusY, objectAttribute3.mCenterZ + objectAttribute3.mRadiusZ);
    }

    public boolean collisionWithExtent(float f, float f2) {
        Float3 float3 = this.mMinPos;
        if (f < float3.x) {
            return true;
        }
        Float3 float4 = this.mMaxPos;
        return f > float4.x || f2 < float3.y || f2 > float4.y;
    }

    public void start() {
        this.mLastTime = System.currentTimeMillis();
    }

    public void update() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float f = (jCurrentTimeMillis - this.mLastTime) / 1000.0f;
        this.mLastTime = jCurrentTimeMillis;
        if (Math.abs(f) > 1.0f) {
            return;
        }
        float f2 = this.mAttribute.mVelocity * f;
        this.mTransformNode.getPos(this.mPos);
        Float3 float3 = this.mPos;
        float f3 = float3.x;
        Float3 float4 = this.mAttribute.mDirection;
        float f4 = f3 + (float4.x * f2);
        float f5 = float3.y + (f2 * float4.y);
        if (collisionWithExtent(f4, f5)) {
            this.mAttribute.mDirection.x = ((float) Math.random()) * (0.5f - ((float) Math.random()));
            this.mAttribute.mDirection.y = ((float) Math.random()) * (0.5f - ((float) Math.random()));
            ObjectAttribute objectAttribute = this.mAttribute;
            objectAttribute.mDirection.z = 0.0f;
            objectAttribute.mVelocity = 0.0f;
        } else {
            this.mTransformNode.translate(f4, f5, this.mPos.z);
        }
        ObjectAttribute objectAttribute2 = this.mAttribute;
        float f6 = objectAttribute2.mVelocity;
        if (f6 < this.mMaxVel) {
            objectAttribute2.mVelocity = f6 + f;
        }
    }
}
