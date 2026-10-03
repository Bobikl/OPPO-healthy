package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.service.dreams.DreamService;
import android.view.Window;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Net;
import com.oplus.aiunit.vision.af0;
import com.oplus.aiunit.vision.bf0;
import com.oplus.aiunit.vision.cwa;
import com.oplus.aiunit.vision.k20;
import com.oplus.aiunit.vision.n20;
import com.oplus.aiunit.vision.q20;
import com.oplus.aiunit.vision.t10;
import com.oplus.aiunit.vision.w10;
import com.oplus.aiunit.vision.wg0;
import com.oplus.aiunit.vision.x20;
import com.oplus.aiunit.vision.x38;
import com.oplus.aiunit.vision.yj0;
import com.oplus.aiunit.vision.zsh;

/* JADX INFO: loaded from: classes13.dex */
public class AndroidDaydream extends DreamService implements t10 {
    public n20 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q20 f1186j;
    public w10 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k20 f1187l;
    public x20 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public af0 f1188n;
    public Handler o;
    public boolean p = true;
    public final wg0<Runnable> q = new wg0<>();
    public final wg0<Runnable> r = new wg0<>();
    public final zsh<cwa> s = new zsh<>(cwa.class);
    public int t = 2;
    public bf0 u;

    @Override // com.oplus.aiunit.vision.t10
    public zsh<cwa> A() {
        return this.s;
    }

    @Override // com.oplus.aiunit.vision.t10
    public Window C() {
        return getWindow();
    }

    @Override // com.oplus.aiunit.vision.t10
    public wg0<Runnable> G() {
        return this.q;
    }

    @Override // com.badlogic.gdx.Application
    public void H(Runnable runnable) {
        synchronized (this.q) {
            this.q.a(runnable);
            x38.graphics.b();
        }
    }

    @Override // com.badlogic.gdx.Application
    public Graphics P() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.t10
    public void R(boolean z) {
        throw new UnsupportedOperationException();
    }

    public bf0 a() {
        return this.u;
    }

    @Override // com.badlogic.gdx.Application
    public void b(String str, String str2, Throwable th) {
        if (this.t >= 2) {
            a().b(str, str2, th);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void c(String str, String str2) {
        if (this.t >= 2) {
            a().c(str, str2);
        }
    }

    public yj0 d() {
        return this.k;
    }

    @Override // com.badlogic.gdx.Application
    public void debug(String str, String str2) {
        if (this.t >= 3) {
            a().debug(str, str2);
        }
    }

    public Files e() {
        return this.f1187l;
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2) {
        if (this.t >= 1) {
            a().error(str, str2);
        }
    }

    public Net f() {
        return this.m;
    }

    @Override // com.oplus.aiunit.vision.t10
    public wg0<Runnable> g() {
        return this.r;
    }

    @Override // com.oplus.aiunit.vision.t10
    public Context getContext() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.t10
    public Handler getHandler() {
        return this.o;
    }

    @Override // com.oplus.aiunit.vision.t10
    public q20 getInput() {
        return this.f1186j;
    }

    @Override // com.badlogic.gdx.Application
    public Application.ApplicationType getType() {
        return Application.ApplicationType.Android;
    }

    @Override // com.badlogic.gdx.Application
    public af0 o() {
        return this.f1188n;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1186j.m0(configuration.hardKeyboardHidden == 1);
    }

    @Override // android.service.dreams.DreamService, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.service.dreams.DreamService
    public void onDreamingStarted() {
        x38.app = this;
        x38.input = getInput();
        x38.audio = d();
        x38.files = e();
        x38.graphics = P();
        x38.f18487net = f();
        this.f1186j.w4();
        n20 n20Var = this.i;
        if (n20Var != null) {
            n20Var.t();
        }
        if (this.p) {
            this.p = false;
        } else {
            this.i.w();
        }
        super.onDreamingStarted();
    }

    @Override // android.service.dreams.DreamService
    public void onDreamingStopped() {
        boolean zC = this.i.c();
        this.i.x(true);
        this.i.u();
        this.f1186j.S1();
        this.i.k();
        this.i.m();
        this.i.x(zC);
        this.i.s();
        super.onDreamingStopped();
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2, Throwable th) {
        if (this.t >= 1) {
            a().error(str, str2, th);
        }
    }
}
