package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes13.dex */
public class Manifold {
    public long a;
    public final a[] b = {new a(), new a()};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Vector2 f1271c = new Vector2();
    public final Vector2 d = new Vector2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f1272e = new int[2];
    public final float[] f = new float[4];

    public enum ManifoldType {
        Circle,
        FaceA,
        FaceB
    }

    public class a {
        public float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1273c;
        public final Vector2 a = new Vector2();
        public int d = 0;

        public a() {
        }

        public String toString() {
            return "id: " + this.d + ", " + this.a + ", " + this.b + ", " + this.f1273c;
        }
    }

    public Manifold(long j2) {
        this.a = j2;
    }
}
