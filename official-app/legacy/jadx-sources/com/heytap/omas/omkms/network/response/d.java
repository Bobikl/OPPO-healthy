package com.heytap.omas.omkms.network.response;

import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public class d implements BaseOmkmsResponse {
    private final String a;
    private Omkms3.Pack b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Omkms3.ResGetServiceTicket f7663c;
    private int d;

    public static final class b {
        private Omkms3.Pack a;
        private Omkms3.ResGetServiceTicket b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7664c;

        private b() {
        }

        public b a(int i) {
            this.f7664c = i;
            return this;
        }

        public b a(Omkms3.Pack pack) {
            this.a = pack;
            return this;
        }

        public b a(Omkms3.ResGetServiceTicket resGetServiceTicket) {
            this.b = resGetServiceTicket;
            return this;
        }

        public d a() {
            return new d(this);
        }
    }

    private d(b bVar) {
        this.a = "ResGetServiceTicket";
        this.d = 0;
        this.b = bVar.a;
        this.f7663c = bVar.b;
        this.d = bVar.f7664c;
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
        i.b("ResGetServiceTicket", "getCmsEncryptData: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.CMSSignedData getCmsSignedData() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack.getSignature();
        }
        i.b("ResGetServiceTicket", "getCmsSignedData: pack is null.");
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
        i.b("ResGetServiceTicket", "getHeader: pack is null.");
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public String getMetaResponse() {
        Omkms3.ResGetServiceTicket resGetServiceTicket = this.f7663c;
        if (resGetServiceTicket != null) {
            return h.a(resGetServiceTicket, (Class<Omkms3.ResGetServiceTicket>) Omkms3.ResGetServiceTicket.class);
        }
        i.b("ResGetServiceTicket", "getMetaResponse: resGetServiceTicket:" + this.f7663c);
        return null;
    }

    @Override // com.heytap.omas.omkms.network.response.BaseOmkmsResponse
    public Omkms3.Pack getPack() {
        Omkms3.Pack pack = this.b;
        if (pack != null) {
            return pack;
        }
        i.b("ResGetServiceTicket", "getPack,pack is null.");
        return null;
    }

    public String toString() {
        return "ResGetServiceTicket{TAG='ResGetServiceTicket', pack=" + this.b + ", resGetServiceTicket=" + this.f7663c + ", statusCode=" + this.d + '}';
    }
}
