package com.heytap.omas.omkms.network.request;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.EnvConfig;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class a implements BaseOmkmsRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7645c = "getkmscertificate";
    private static EnvConfig d = EnvConfig.RELEASE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7646e = "GetKmsCertsRequest";
    private Omkms3.CMSEncryptedData a;
    private Omkms3.Header b;

    public static final class b {
        private Omkms3.CMSEncryptedData a;
        private Omkms3.CMSSignedData b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Omkms3.Header f7647c;
        private EnvConfig d;

        private b() {
            this.d = EnvConfig.RELEASE;
        }

        public b a(EnvConfig envConfig) {
            if (envConfig != null) {
                this.d = envConfig;
            }
            return this;
        }

        public b a(Omkms3.CMSEncryptedData cMSEncryptedData) {
            this.a = cMSEncryptedData;
            return this;
        }

        public b a(Omkms3.CMSSignedData cMSSignedData) {
            this.b = cMSSignedData;
            return this;
        }

        public b a(Omkms3.Header header) {
            this.f7647c = header;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    private a(b bVar) {
        this.a = bVar.a;
        this.b = bVar.f7647c;
        d = bVar.d;
    }

    public static b a() {
        return new b();
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    public Omkms3.Header getHeader() {
        return this.b;
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    @Nullable
    public Omkms3.Pack getPack() {
        String str;
        if (this.b == null) {
            str = "getPack,header of request cannot be null.";
        } else {
            if (this.a != null) {
                return Omkms3.Pack.newBuilder().setHeader(h.a(this.b, (Class<Omkms3.Header>) Omkms3.Header.class)).setPayload(this.a.getEncryptedData()).build();
            }
            str = "getPack,payload of request cannot be null.";
        }
        i.b(f7646e, str);
        return null;
    }

    @Override // com.heytap.omas.omkms.network.request.BaseOmkmsRequest
    @NonNull
    public String getUrl() throws AuthenticationException {
        StringBuilder sb;
        String envUrl;
        if (d == null) {
            i.c(f7646e, "getUrl: Not set EnvConfig,would use default release env config.");
            sb = new StringBuilder();
            envUrl = com.heytap.omas.omkms.network.a.a();
        } else {
            sb = new StringBuilder();
            envUrl = d.getEnvUrl();
        }
        sb.append(envUrl);
        sb.append(f7645c);
        return sb.toString();
    }

    public String toString() {
        return "GetKmsCertsRequest{payload=" + this.a + ", header=" + this.b + '}';
    }
}
