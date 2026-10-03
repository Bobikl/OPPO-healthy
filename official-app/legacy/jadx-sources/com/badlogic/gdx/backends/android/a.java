package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.Graphics;
import com.oplus.aiunit.vision.af0;
import com.oplus.aiunit.vision.bf0;
import com.oplus.aiunit.vision.cwa;
import com.oplus.aiunit.vision.k20;
import com.oplus.aiunit.vision.mk3;
import com.oplus.aiunit.vision.q20;
import com.oplus.aiunit.vision.t10;
import com.oplus.aiunit.vision.w10;
import com.oplus.aiunit.vision.wg0;
import com.oplus.aiunit.vision.x20;
import com.oplus.aiunit.vision.x38;
import com.oplus.aiunit.vision.zsh;

/* JADX INFO: loaded from: classes13.dex */
public class a implements t10 {
    public AndroidLiveWallpaperService i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q20 f1202j;
    public w10 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k20 f1203l;
    public x20 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public af0 f1204n;
    public bf0 t;
    public boolean o = true;
    public final wg0<Runnable> p = new wg0<>();
    public final wg0<Runnable> q = new wg0<>();
    public final zsh<cwa> r = new zsh<>(cwa.class);
    public int s = 2;
    public volatile mk3[] u = null;

    public a(AndroidLiveWallpaperService androidLiveWallpaperService) {
        this.i = androidLiveWallpaperService;
    }

    @Override // com.oplus.aiunit.vision.t10
    public zsh<cwa> A() {
        return this.r;
    }

    @Override // com.oplus.aiunit.vision.t10
    public Window C() {
        throw new UnsupportedOperationException();
    }

    @Override // com.oplus.aiunit.vision.t10
    public wg0<Runnable> G() {
        return this.p;
    }

    @Override // com.badlogic.gdx.Application
    public void H(Runnable runnable) {
        synchronized (this.p) {
            this.p.a(runnable);
        }
    }

    @Override // com.badlogic.gdx.Application
    public Graphics P() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.t10
    public void R(boolean z) {
        throw new UnsupportedOperationException();
    }

    public bf0 a() {
        return this.t;
    }

    @Override // com.badlogic.gdx.Application
    public void b(String str, String str2, Throwable th) {
        if (this.s >= 2) {
            a().b(str, str2, th);
        }
    }

    @Override // com.badlogic.gdx.Application
    public void c(String str, String str2) {
        if (this.s >= 2) {
            a().c(str, str2);
        }
    }

    public void d() {
        w10 w10Var = this.k;
        if (w10Var != null) {
            w10Var.dispose();
        }
    }

    @Override // com.badlogic.gdx.Application
    public void debug(String str, String str2) {
        if (this.s >= 3) {
            a().debug(str, str2);
        }
    }

    public void e() {
        if (AndroidLiveWallpaperService.t) {
            Log.d("WallpaperService", " > AndroidLiveWallpaper - onPause()");
        }
        this.k.pause();
        this.f1202j.onPause();
        if (AndroidLiveWallpaperService.t) {
            Log.d("WallpaperService", " > AndroidLiveWallpaper - onPause() done!");
        }
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2) {
        if (this.s >= 1) {
            a().error(str, str2);
        }
    }

    public void f() {
        x38.app = this;
        q20 q20Var = this.f1202j;
        x38.input = q20Var;
        x38.audio = this.k;
        x38.files = this.f1203l;
        x38.graphics = null;
        x38.f18487net = this.m;
        q20Var.onResume();
        if (this.o) {
            this.o = false;
        } else {
            this.k.resume();
            throw null;
        }
    }

    @Override // com.oplus.aiunit.vision.t10
    public wg0<Runnable> g() {
        return this.q;
    }

    @Override // com.oplus.aiunit.vision.t10
    public Context getContext() {
        return this.i;
    }

    @Override // com.oplus.aiunit.vision.t10
    public Handler getHandler() {
        throw new UnsupportedOperationException();
    }

    @Override // com.oplus.aiunit.vision.t10
    public q20 getInput() {
        return this.f1202j;
    }

    @Override // com.badlogic.gdx.Application
    public Application.ApplicationType getType() {
        return Application.ApplicationType.Android;
    }

    @Override // com.oplus.aiunit.vision.t10
    public WindowManager getWindowManager() {
        return this.i.a();
    }

    @Override // com.badlogic.gdx.Application
    public af0 o() {
        return this.f1204n;
    }

    @Override // com.badlogic.gdx.Application
    public void error(String str, String str2, Throwable th) {
        if (this.s >= 1) {
            a().error(str, str2, th);
        }
    }
}
