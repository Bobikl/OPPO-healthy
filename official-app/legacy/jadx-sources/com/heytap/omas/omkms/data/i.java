package com.heytap.omas.omkms.data;

import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private h a;
    private int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Omkms3.ServiceSessionInfo f7619c;
    private Omkms3.KmsSessionInfo d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Exception f7620e;

    public static class b {
        private int a;
        private Omkms3.ServiceSessionInfo b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Omkms3.KmsSessionInfo f7621c;
        private Exception d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private h f7622e;

        private b() {
        }

        public b a(int i) {
            this.a = i;
            return this;
        }

        public b a(h hVar) {
            this.f7622e = hVar;
            return this;
        }

        public b a(Omkms3.KmsSessionInfo kmsSessionInfo) {
            this.f7621c = kmsSessionInfo;
            return this;
        }

        public b a(Omkms3.ServiceSessionInfo serviceSessionInfo) {
            this.b = serviceSessionInfo;
            return this;
        }

        public b a(Exception exc) {
            this.d = exc;
            return this;
        }

        public i a() {
            return new i(this);
        }
    }

    private i(b bVar) {
        this.a = bVar.f7622e;
        this.b = bVar.a;
        this.f7619c = bVar.b;
        this.d = bVar.f7621c;
        this.f7620e = bVar.d;
    }

    public static b f() {
        return new b();
    }

    public Exception a() {
        return this.f7620e;
    }

    public Omkms3.KmsSessionInfo b() {
        return this.d;
    }

    public h c() {
        return this.a;
    }

    public Omkms3.ServiceSessionInfo d() {
        return this.f7619c;
    }

    public int e() {
        return this.b;
    }
}
