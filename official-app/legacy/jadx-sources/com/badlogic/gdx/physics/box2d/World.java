package com.badlogic.gdx.physics.box2d;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.f;
import com.badlogic.gdx.utils.m;
import com.oplus.aiunit.vision.bv5;
import com.oplus.aiunit.vision.de7;
import com.oplus.aiunit.vision.e34;
import com.oplus.aiunit.vision.mne;
import com.oplus.aiunit.vision.via;
import com.oplus.aiunit.vision.wg0;

/* JADX INFO: loaded from: classes13.dex */
public final class World implements bv5 {
    public final long k;
    public final wg0<Contact> s;
    public final wg0<Contact> t;
    public final Contact u;
    public final Manifold v;
    public final ContactImpulse w;
    public Vector2 x;
    public Vector2 y;
    public final mne<Body> i = new a(100, 200);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mne<Fixture> f1276j = new b(100, 200);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f<Body> f1277l = new f<>(100);
    public final f<Fixture> m = new f<>(100);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f<Joint> f1278n = new f<>(100);
    public e34 o = null;
    public final float[] p = new float[2];
    public final Vector2 q = new Vector2();
    public long[] r = new long[200];

    public class a extends mne<Body> {
        public a(int i, int i2) {
            super(i, i2);
        }

        @Override // com.oplus.aiunit.vision.mne
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Body c() {
            return new Body(World.this, 0L);
        }
    }

    public class b extends mne<Fixture> {
        public b(int i, int i2) {
            super(i, i2);
        }

        @Override // com.oplus.aiunit.vision.mne
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Fixture c() {
            return new Fixture(null, 0L);
        }
    }

    static {
        new m().e("gdx-box2d");
    }

    public World(Vector2 vector2, boolean z) {
        wg0<Contact> wg0Var = new wg0<>();
        this.s = wg0Var;
        wg0<Contact> wg0Var2 = new wg0<>();
        this.t = wg0Var2;
        this.u = new Contact(this, 0L);
        this.v = new Manifold(0L);
        this.w = new ContactImpulse(this, 0L);
        this.x = new Vector2();
        this.y = new Vector2();
        this.k = newWorld(vector2.x, vector2.y, z);
        wg0Var.e(this.r.length);
        wg0Var2.e(this.r.length);
        for (int i = 0; i < this.r.length; i++) {
            this.t.a(new Contact(this, 0L));
        }
    }

    private void beginContact(long j2) {
        e34 e34Var = this.o;
        if (e34Var != null) {
            Contact contact = this.u;
            contact.a = j2;
            e34Var.d(contact);
        }
    }

    private boolean contactFilter(long j2, long j3) {
        de7 de7VarB = this.m.b(j2).b();
        de7 de7VarB2 = this.m.b(j3).b();
        short s = de7VarB.f10524c;
        if (s == de7VarB2.f10524c && s != 0) {
            return s > 0;
        }
        if ((de7VarB.b & de7VarB2.a) != 0) {
            if ((de7VarB2.b & de7VarB.a) != 0) {
                return true;
            }
        }
        return false;
    }

    private void endContact(long j2) {
        e34 e34Var = this.o;
        if (e34Var != null) {
            Contact contact = this.u;
            contact.a = j2;
            e34Var.b(contact);
        }
    }

    private native long jniCreateBody(long j2, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f9);

    private native void jniDestroyBody(long j2, long j3);

    private native void jniDispose(long j2);

    private native void jniGetGravity(long j2, float[] fArr);

    private native void jniSetGravity(long j2, float f, float f2);

    private native void jniStep(long j2, float f, int i, int i2);

    private native long newWorld(float f, float f2, boolean z);

    private void postSolve(long j2, long j3) {
        e34 e34Var = this.o;
        if (e34Var != null) {
            Contact contact = this.u;
            contact.a = j2;
            ContactImpulse contactImpulse = this.w;
            contactImpulse.b = j3;
            e34Var.c(contact, contactImpulse);
        }
    }

    private void preSolve(long j2, long j3) {
        e34 e34Var = this.o;
        if (e34Var != null) {
            Contact contact = this.u;
            contact.a = j2;
            Manifold manifold = this.v;
            manifold.a = j3;
            e34Var.a(contact, manifold);
        }
    }

    private boolean reportFixture(long j2) {
        return false;
    }

    private float reportRayFixture(long j2, float f, float f2, float f3, float f4, float f5) {
        return 0.0f;
    }

    public Body b(BodyDef bodyDef) {
        long j2 = this.k;
        int value = bodyDef.a.getValue();
        Vector2 vector2 = bodyDef.b;
        float f = vector2.x;
        float f2 = vector2.y;
        float f3 = bodyDef.f1260c;
        Vector2 vector3 = bodyDef.d;
        long jJniCreateBody = jniCreateBody(j2, value, f, f2, f3, vector3.x, vector3.y, bodyDef.f1261e, bodyDef.f, bodyDef.g, bodyDef.h, bodyDef.i, bodyDef.f1262j, bodyDef.k, bodyDef.f1263l, bodyDef.m);
        Body bodyD = this.i.d();
        bodyD.j(jJniCreateBody);
        this.f1277l.f(bodyD.a, bodyD);
        return bodyD;
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        jniDispose(this.k);
    }

    public void i(Body body) {
        wg0<via> wg0VarE = body.e();
        while (wg0VarE.f18241j > 0) {
            body.e().get(0).getClass();
            n(null);
        }
        jniDestroyBody(this.k, body.a);
        body.m(null);
        this.f1277l.h(body.a);
        wg0<Fixture> wg0VarD = body.d();
        while (wg0VarD.f18241j > 0) {
            Fixture fixtureH = wg0VarD.h(0);
            fixtureH.g(null);
            this.m.h(fixtureH.b);
            this.f1276j.b(fixtureH);
        }
        this.i.b(body);
    }

    public void n(Joint joint) {
        throw null;
    }

    public Vector2 o() {
        jniGetGravity(this.k, this.p);
        Vector2 vector2 = this.q;
        float[] fArr = this.p;
        vector2.x = fArr[0];
        vector2.y = fArr[1];
        return vector2;
    }

    public void p(e34 e34Var) {
        this.o = e34Var;
    }

    public void q(Vector2 vector2) {
        jniSetGravity(this.k, vector2.x, vector2.y);
    }

    public void r(float f, int i, int i2) {
        jniStep(this.k, f, i, i2);
    }
}
