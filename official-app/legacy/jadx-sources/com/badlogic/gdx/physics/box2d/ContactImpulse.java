package com.badlogic.gdx.physics.box2d;

/* JADX INFO: loaded from: classes13.dex */
public class ContactImpulse {
    public final World a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f1267c = new float[2];
    public final float[] d = new float[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f1268e = new float[2];

    public ContactImpulse(World world, long j2) {
        this.a = world;
        this.b = j2;
    }
}
