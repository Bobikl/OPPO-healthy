package com.oplus.aiunit.vision;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.Ray;

/* JADX INFO: loaded from: classes13.dex */
public abstract class pv2 {
    public final Vector3 a = new Vector3();
    public final Vector3 b = new Vector3(0.0f, 0.0f, -1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Vector3 f15511c = new Vector3(0.0f, 1.0f, 0.0f);
    public final Matrix4 d = new Matrix4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Matrix4 f15512e = new Matrix4();
    public final Matrix4 f = new Matrix4();
    public final Matrix4 g = new Matrix4();
    public float h = 1.0f;
    public float i = 100.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15513j = 0.0f;
    public float k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.badlogic.gdx.math.a f15514l = new com.badlogic.gdx.math.a();
    public final Vector3 m = new Vector3();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Ray f15515n = new Ray(new Vector3(), new Vector3());

    public abstract void a();
}
