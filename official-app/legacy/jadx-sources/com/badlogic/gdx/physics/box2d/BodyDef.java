package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes13.dex */
public class BodyDef {
    public BodyType a = BodyType.StaticBody;
    public final Vector2 b = new Vector2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1260c = 0.0f;
    public final Vector2 d = new Vector2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f1261e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public boolean h = true;
    public boolean i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1262j = false;
    public boolean k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1263l = true;
    public float m = 1.0f;

    public enum BodyType {
        StaticBody(0),
        KinematicBody(1),
        DynamicBody(2);

        private int value;

        BodyType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }
}
