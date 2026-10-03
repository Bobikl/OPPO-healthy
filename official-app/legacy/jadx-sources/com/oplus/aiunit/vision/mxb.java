package com.oplus.aiunit.vision;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;

/* JADX INFO: loaded from: classes13.dex */
public class mxb {
    public static final BoundingBox i = new BoundingBox();
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14259c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Mesh f14260e;
    public final Vector3 f = new Vector3();
    public final Vector3 g = new Vector3();
    public float h = -1.0f;

    public boolean a(mxb mxbVar) {
        return mxbVar == this || (mxbVar != null && mxbVar.f14260e == this.f14260e && mxbVar.b == this.b && mxbVar.f14259c == this.f14259c && mxbVar.d == this.d);
    }

    public void b() {
        Mesh mesh = this.f14260e;
        BoundingBox boundingBox = i;
        mesh.o(boundingBox, this.f14259c, this.d);
        boundingBox.getCenter(this.f);
        boundingBox.getDimensions(this.g).m4514scl(0.5f);
        this.h = this.g.len();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxb) {
            return a((mxb) obj);
        }
        return false;
    }
}
