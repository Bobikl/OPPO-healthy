package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes15.dex */
public class k1h {
    public View a;
    public mo9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AppCompatActivity f13120c;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f13121e;

    public static final class a {
        public View a;
        public mo9 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AppCompatActivity f13122c;
        public boolean d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b f13123e;

        public a(AppCompatActivity appCompatActivity, View view) {
            this.f13122c = appCompatActivity;
            this.a = view;
        }

        public k1h a() {
            k1h k1hVar = new k1h();
            k1hVar.b = this.b;
            k1hVar.f13120c = this.f13122c;
            k1hVar.a = this.a;
            k1hVar.d = this.d;
            k1hVar.f13121e = this.f13123e;
            return k1hVar;
        }

        public a b(b bVar) {
            this.f13123e = bVar;
            return this;
        }

        public a c(mo9 mo9Var) {
            this.b = mo9Var;
            return this;
        }

        public a d(boolean z) {
            this.d = z;
            return this;
        }
    }

    public interface b {
        Bitmap a(Bitmap bitmap);
    }

    public static mo9 h(Context context, int i, int i2) {
        if (context == null) {
            context = op.n().p() != null ? op.n().p() : b78.a();
        }
        return qe0.y(context) ? new nvl(i2) : new nvl(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Bitmap bitmap) {
        b bVar = this.f13121e;
        if (bVar != null) {
            bitmap = bVar.a(bitmap);
        }
        if (this.d) {
            new i1h().a(this.f13120c, bitmap);
        } else {
            new i1h().b(this.f13120c, bitmap);
        }
    }

    public void g() {
        View view = this.a;
        if (view == null || this.f13120c == null) {
            return;
        }
        new wzk.c(view).g(this.b).h(new wzk.d() { // from class: com.oplus.aiunit.vision.j1h
            @Override // com.oplus.aiunit.vision.wzk.d
            public final void a(Bitmap bitmap) {
                this.a.i(bitmap);
            }
        }).f().e();
    }

    public k1h() {
    }
}
