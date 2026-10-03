package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class hgb {
    public final pgb a;
    public final ui0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final akj f12151c;
    public final pxa d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s3a f12152e;
    public final u4a f;
    public final ngb g;

    public static class b {
        public pgb a;
        public ui0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public akj f12153c;
        public pxa d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public s3a f12154e;
        public u4a f;
        public ngb g;

        @NonNull
        public hgb h(@NonNull pgb pgbVar, @NonNull ngb ngbVar) {
            this.a = pgbVar;
            this.g = ngbVar;
            if (this.b == null) {
                this.b = ui0.c();
            }
            if (this.f12153c == null) {
                this.f12153c = new bkj();
            }
            if (this.d == null) {
                this.d = new qxa();
            }
            if (this.f12154e == null) {
                this.f12154e = s3a.a();
            }
            if (this.f == null) {
                this.f = new v4a();
            }
            return new hgb(this);
        }
    }

    @NonNull
    public s3a a() {
        return this.f12152e;
    }

    @NonNull
    public pxa b() {
        return this.d;
    }

    @NonNull
    public ngb c() {
        return this.g;
    }

    @NonNull
    public akj d() {
        return this.f12151c;
    }

    @NonNull
    public pgb e() {
        return this.a;
    }

    public hgb(@NonNull b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f12151c = bVar.f12153c;
        this.d = bVar.d;
        this.f12152e = bVar.f12154e;
        this.f = bVar.f;
        this.g = bVar.g;
    }
}
