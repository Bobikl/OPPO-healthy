package com.heytap.omas.omkms.data;

import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class l {
    Omkms3.ServiceSessionInfo a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f7629c;

    public static final class b {
        private String a;
        private d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Omkms3.ServiceSessionInfo f7630c;

        private b() {
        }

        public b a(d dVar) {
            this.b = dVar;
            return this;
        }

        public b a(Omkms3.ServiceSessionInfo serviceSessionInfo) {
            this.f7630c = serviceSessionInfo;
            return this;
        }

        public b a(String str) {
            this.a = str;
            return this;
        }

        public l a() {
            return new l(this);
        }
    }

    private l(b bVar) {
        this.b = com.heytap.omas.a.b.c.h;
        this.b = bVar.a;
        this.f7629c = bVar.b;
        this.a = bVar.f7630c;
    }

    public static b e() {
        return new b();
    }

    public d a() {
        return this.f7629c;
    }

    public Omkms3.ServiceSessionInfo b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        StringBuilder sb;
        String authMode = this.f7629c.b().getAuthMode();
        authMode.hashCode();
        if (authMode.equals(com.heytap.omas.a.b.c.b)) {
            sb = new StringBuilder();
            sb.append("authType-OTK-");
            sb.append(new String(this.f7629c.b().getAppName()));
        } else {
            if (!authMode.equals("WB")) {
                throw new IllegalStateException("Always should not take place here, Unexpected value: " + this.f7629c.b().getAuthMode());
            }
            sb = new StringBuilder();
            sb.append("authType-WB-");
            sb.append(new String(this.f7629c.b().getAppName()));
            sb.append("-");
            sb.append(new String(this.f7629c.b().getWbId()));
            sb.append("-");
            sb.append(new String(this.f7629c.b().getWbKeyId()));
            sb.append("-");
            sb.append(this.f7629c.b().getWbVersion());
        }
        return sb.toString();
    }

    public String toString() {
        return "UserInitInfo{serviceSessionInfo=" + this.a + ", type='" + this.b + "', initParamData=" + this.f7629c + '}';
    }
}
