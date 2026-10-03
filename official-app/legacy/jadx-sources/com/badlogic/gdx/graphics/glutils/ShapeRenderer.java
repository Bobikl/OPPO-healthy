package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector2;
import com.oplus.aiunit.vision.bv5;
import com.oplus.aiunit.vision.l5a;
import com.oplus.aiunit.vision.m5a;
import com.oplus.aiunit.vision.mk3;
import com.oplus.aiunit.vision.wxg;
import com.oplus.aiunit.vision.x38;

/* JADX INFO: loaded from: classes13.dex */
public class ShapeRenderer implements bv5 {
    public final m5a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1238j;
    public final Matrix4 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix4 f1239l;
    public final Matrix4 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Vector2 f1240n;
    public final mk3 o;
    public float p;

    public enum ShapeType {
        Point(0),
        Line(1),
        Filled(4);

        private final int glType;

        ShapeType(int i) {
            this.glType = i;
        }

        public int getGlType() {
            return this.glType;
        }
    }

    public ShapeRenderer() {
        this(5000);
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        this.i.dispose();
    }

    public ShapeRenderer(int i) {
        this(i, null);
    }

    public ShapeRenderer(int i, wxg wxgVar) {
        this.f1238j = false;
        Matrix4 matrix4 = new Matrix4();
        this.k = matrix4;
        this.f1239l = new Matrix4();
        this.m = new Matrix4();
        this.f1240n = new Vector2();
        this.o = new mk3(1.0f, 1.0f, 1.0f, 1.0f);
        this.p = 0.75f;
        if (wxgVar == null) {
            this.i = new l5a(i, false, true, 0);
        } else {
            this.i = new l5a(i, false, true, 0, wxgVar);
        }
        matrix4.setToOrtho2D(0.0f, 0.0f, x38.graphics.getWidth(), x38.graphics.getHeight());
        this.f1238j = true;
    }
}
