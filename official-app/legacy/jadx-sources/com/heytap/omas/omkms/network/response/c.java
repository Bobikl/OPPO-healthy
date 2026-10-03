package com.heytap.omas.omkms.network.response;

import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class c implements BaseOmkmsResponse {
    public final String a;
    private Omkms3.Pack b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Omkms3.ResGetKMSTicket f7661c;
    private int d;

    public static final class b {
        private Omkms3.Pack a;
        private Omkms3.ResGetKMSTicket b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7662c;

        private b() {
        }

        public b a(int i) {
            this.f7662c = i;
            return this;
        }

        public b a(Omkms3.Pack pack) {
            this.a = pack;
            return this;
        }

        public b a(Omkms3.ResGetKMSTicket resGetKMSTicket) {
            this.b = resGetKMSTicket;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    private c(b bVar) {
        this.a = "ResGetKmsTicket";
        this.d = 0;
        this.b = bVar.a;
        this.f7661c = bVar.b;
        this.d = bVar.f7662c;
    }

    public static b a() {
        return new b();
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.CMSEncryptedData getCmsEncryptData() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack.getPayload();
        }
        i.b("ResGetKmsTicket", "getCmsEncryptData: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.CMSSignedData getCmsSignedData() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack.getSignature();
        }
        i.b("ResGetKmsTicket", "getCmsSignedData: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public int getCode() {
        return this.d;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.Header getHeader() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack.getHeader();
        }
        i.b("ResGetKmsTicket", "getHeader: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public String getMetaResponse() {
        Omkms3.ResGetKMSTicket resGetKMSTicket = this.f7661c;
        if (resGetKMSTicket != null) {
            return h.a(resGetKMSTicket, (Class<Omkms3.ResGetKMSTicket>) Omkms3.ResGetKMSTicket.class);
        }
        i.b("ResGetKmsTicket", "getMetaResponse: resGetKMSTicket:" + this.f7661c);
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.Pack getPack() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack;
        }
        i.b("ResGetKmsTicket", "getPack,pack is null.");
        return null;
    }

    public String toString() {
        return "ResGetKmsTicket{TAG='ResGetKmsTicket', pack=" + this.b + ", resGetKMSTicket=" + this.f7661c + ", statusCode=" + this.d + '}';
    }
}
