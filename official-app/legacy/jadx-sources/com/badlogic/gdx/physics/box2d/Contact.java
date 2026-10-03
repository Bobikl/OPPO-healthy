package com.badlogic.gdx.physics.box2d;

import com.oplus.aiunit.vision.h2m;

/* JADX INFO: loaded from: classes13.dex */
public class Contact {
    public long a;
    public World b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h2m f1266c = new h2m();
    public final float[] d = new float[8];

    public Contact(World world, long j2) {
        this.a = j2;
        this.b = world;
    }

    private native long jniGetFixtureA(long j2);

    private native long jniGetFixtureB(long j2);

    public Fixture a() {
        return this.b.m.b(jniGetFixtureA(this.a));
    }

    public Fixture b() {
        return this.b.m.b(jniGetFixtureB(this.a));
    }
}
