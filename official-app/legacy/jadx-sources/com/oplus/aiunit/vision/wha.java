package com.oplus.aiunit.vision;

import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;

/* JADX INFO: loaded from: classes10.dex */
public abstract class wha {

    public interface a {
    }

    public static class b {
        public final float a;
        public final float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f18261c;
        public boolean d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18262e = 1;
        public int f;
        public int g;
        public int h;

        public b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.f18261c = f3;
        }

        public static /* synthetic */ d c(b bVar) {
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ a h(b bVar) {
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ a i(b bVar) {
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ a j(b bVar) {
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ d m(b bVar) {
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ d n(b bVar) {
            bVar.getClass();
            return null;
        }

        @NonNull
        public wha o() {
            return new c(this);
        }
    }

    public static class c extends wha {
        public final float a;
        public final float b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f18263c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18264e;
        public final int f;
        public final int g;
        public final int h;

        public c(@NonNull b bVar) {
            this.a = bVar.a;
            this.b = bVar.b;
            this.f18263c = bVar.f18261c;
            b.h(bVar);
            b.i(bVar);
            b.j(bVar);
            this.d = bVar.d;
            this.f18264e = bVar.f18262e;
            b.m(bVar);
            b.n(bVar);
            b.c(bVar);
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
        }

        @Override // com.oplus.aiunit.vision.wha
        @Nullable
        public a a() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.wha
        public boolean b() {
            return this.d;
        }

        @Override // com.oplus.aiunit.vision.wha
        public int c() {
            return this.f18264e;
        }

        @Override // com.oplus.aiunit.vision.wha
        @Nullable
        public d d() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.wha
        public int e() {
            int i = this.h;
            return i != 0 ? i : this.f;
        }

        @Override // com.oplus.aiunit.vision.wha
        public float f() {
            float f = this.f18263c;
            return f > 0.0f ? f : this.a;
        }

        @Override // com.oplus.aiunit.vision.wha
        @Nullable
        public a h() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.wha
        @Nullable
        public d i() {
            return null;
        }

        @Override // com.oplus.aiunit.vision.wha
        public int j() {
            int i = this.g;
            return i != 0 ? i : this.f;
        }

        @Override // com.oplus.aiunit.vision.wha
        public float k() {
            float f = this.b;
            return f > 0.0f ? f : this.a;
        }
    }

    public static class d {
    }

    @NonNull
    public static b g(@Px float f) {
        return new b(f, 0.0f, 0.0f);
    }

    @Nullable
    public abstract a a();

    public abstract boolean b();

    public abstract int c();

    @Nullable
    public abstract d d();

    @ColorInt
    public abstract int e();

    @Px
    public abstract float f();

    @Nullable
    public abstract a h();

    @Nullable
    public abstract d i();

    @ColorInt
    public abstract int j();

    @Px
    public abstract float k();
}
