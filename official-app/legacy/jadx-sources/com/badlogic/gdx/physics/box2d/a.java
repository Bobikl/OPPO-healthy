package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Vector2;
import com.oplus.aiunit.vision.bv5;
import com.oplus.aiunit.vision.mk3;
import com.oplus.aiunit.vision.wg0;

/* JADX INFO: loaded from: classes13.dex */
public class a implements bv5 {
    public static final Vector2[] A = new Vector2[1000];
    public static final Vector2 B = new Vector2();
    public static final Vector2 C = new Vector2();
    public static final wg0<Body> D = new wg0<>();
    public static final wg0<Joint> E = new wg0<>();
    public static Vector2 F = new Vector2();
    public static Vector2 G = new Vector2();
    public ShapeRenderer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1279j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1280l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1281n;
    public boolean o;
    public final mk3 p;
    public final mk3 q;
    public final mk3 r;
    public final mk3 s;
    public final mk3 t;
    public final mk3 u;
    public final mk3 v;
    public final mk3 w;
    public final Vector2 x;
    public final Vector2 y;
    public final Vector2 z;

    public a() {
        this(true, true, false, true, false, true);
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        this.i.dispose();
    }

    public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.p = new mk3(0.5f, 0.5f, 0.3f, 1.0f);
        this.q = new mk3(0.5f, 0.9f, 0.5f, 1.0f);
        this.r = new mk3(0.5f, 0.5f, 0.9f, 1.0f);
        this.s = new mk3(0.6f, 0.6f, 0.6f, 1.0f);
        this.t = new mk3(0.9f, 0.7f, 0.7f, 1.0f);
        this.u = new mk3(0.5f, 0.8f, 0.8f, 1.0f);
        this.v = new mk3(1.0f, 0.0f, 1.0f, 1.0f);
        this.w = new mk3(1.0f, 0.0f, 0.0f, 1.0f);
        this.x = new Vector2();
        this.y = new Vector2();
        this.z = new Vector2();
        this.i = new ShapeRenderer();
        int i = 0;
        while (true) {
            Vector2[] vector2Arr = A;
            if (i >= vector2Arr.length) {
                this.f1279j = z;
                this.k = z2;
                this.f1280l = z3;
                this.m = z4;
                this.f1281n = z5;
                this.o = z6;
                return;
            }
            vector2Arr[i] = new Vector2();
            i++;
        }
    }
}
