package com.heytap.wearable.support.watchface.gl.physics;

import com.heytap.wearable.support.watchface.gl.shape.Mesh;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Physics {
    protected Mesh mMesh;

    public Physics(Mesh mesh) {
        this.mMesh = mesh;
    }

    public void createPhysicsVBO() {
    }

    public abstract boolean doAction();

    public abstract boolean getIsActionDone();

    public Mesh getMesh() {
        return this.mMesh;
    }

    public abstract void setIsActionDone(boolean z);

    public abstract void updatePhy();
}
