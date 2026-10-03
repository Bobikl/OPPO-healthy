package com.heytap.omas.omkms.feature;

import android.content.Context;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.JsonSyntaxException;
import com.heytap.omas.a.e.i;
import com.heytap.omas.a.e.l;
import com.heytap.omas.a.e.m;
import com.heytap.omas.omkms.data.j;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.omkms.exception.NetIOException;
import com.heytap.omas.omkms.security.CertException;
import com.heytap.omas.proto.Omkms3;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class f implements com.heytap.omas.omkms.feature.b {
    private static final String b = "SessionTicketManagerCertAuthModeImp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f7641c = new byte[32];
    private final SessionTicketLoader a;

    public class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f7642e = "cert_from_local_android_key_store";
        private static final String f = "cert_from_get_from_server";
        private int a;
        private String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f7643c;

        private b(@Nullable int i, @Nullable String str, String str2) {
            this.a = 0;
            this.b = f7642e;
            if (i == 0 && (str == null || str2 == null)) {
                throw new IllegalArgumentException("certFromType or trustLeafCert must not be null while code:0");
            }
            this.a = i;
            this.f7643c = str2;
            this.b = str;
        }
    }

    public static class c {
        private static final f a = new f();

        private c() {
        }
    }

    private f() {
        this.a = new SessionTicketLoader();
        new SecureRandom().nextBytes(f7641c);
    }

    @NonNull
    private j a(Context context, Omkms3.KmsSessionInfo kmsSessionInfo, com.heytap.omas.omkms.data.d dVar) throws AuthenticationException {
        if (context == null || kmsSessionInfo == null || dVar == null) {
            i.b(b, "updateServiceSessionTicket: parameters invalid.");
            throw new IllegalArgumentException("parameters invalid");
        }
        try {
            com.heytap.omas.omkms.network.response.d dVarA = a(context, dVar, kmsSessionInfo);
            if (dVarA.getCode() == 0) {
                Omkms3.ResGetServiceTicket resGetServiceTicket = (Omkms3.ResGetServiceTicket) com.heytap.omas.a.e.h.a(dVarA.getMetaResponse(), Omkms3.ResGetServiceTicket.class);
                if (this.a.saveServiceSessionTicketInfo(context, dVar.b(), Omkms3.ServiceSessionInfo.newBuilder().setMk(resGetServiceTicket.getMk()).setDek(resGetServiceTicket.getDek()).setBeginTime(resGetServiceTicket.getBeginTime()).setEndTime(resGetServiceTicket.getEndTime()).setHeader(dVarA.getHeader()).setUserInitInfo(com.heytap.omas.a.e.g.a(dVar.b())).setTicket(resGetServiceTicket.getTicket()).build()) == null) {
                    return j.d().a(dVar.b()).a(1003).a();
                }
            } else {
                i.b(b, "updateServiceSessionTicket: fail,code:" + dVarA.getCode());
            }
            return j.d().a(dVar.b()).a(dVarA.getCode()).a();
        } catch (JsonSyntaxException e2) {
            i.b(b, "updateServiceSessionTicket: InvalidProtocolBufferException:" + e2);
            return j.d().a(dVar.b()).a(1001).a();
        }
    }

    @NonNull
    private com.heytap.omas.omkms.network.response.c c(@NonNull Context context, @NonNull com.heytap.omas.omkms.data.d dVar) throws AuthenticationException {
        if (context == null || dVar == null) {
            throw new IllegalArgumentException("applyKmsSessionTicket:Parameters invalid.");
        }
        try {
            b bVarE = e(context, dVar);
            if (bVarE.a != 0) {
                i.b(b, "applyKmsSessionTicket: get trust cert fail,code:" + bVarE.a);
                return com.heytap.omas.omkms.network.response.c.a().a(bVarE.a).a();
            }
            com.heytap.omas.omkms.network.response.c cVarC = e.c(context, dVar, bVarE.f7643c);
            if (19 == cVarC.getCode() || (201099 == cVarC.getCode() && "cert_from_local_android_key_store".equals(bVarE.b))) {
                com.heytap.omas.a.d.b.b(context, dVar.b());
                bVarE = e(context, dVar);
                if (bVarE.a != 0) {
                    i.b(b, "applyKmsSessionTicket: server envelop decrypt fail && cert_from_type:" + bVarE.b + ",and get cert from server fail,code:" + bVarE.a);
                    return com.heytap.omas.omkms.network.response.c.a().a(bVarE.a).a();
                }
                cVarC = e.c(context, dVar, bVarE.f7643c);
                i.c(b, "applyKmsSessionTicket: server envelop decrypt fail && cert_from_type:" + bVarE.b + ",and getKmsTicketByCert again,code:" + bVarE.a);
            }
            int code = cVarC.getCode();
            if (code == 0) {
                return cVarC;
            }
            if (code != 7) {
                i.b(b, "applyKmsSessionTicket: fail,code:" + cVarC.getCode());
                return com.heytap.omas.omkms.network.response.c.a().a(cVarC.getCode()).a();
            }
            j jVarF = f(context, dVar);
            if (jVarF.a() != 0) {
                i.b(b, "applyKmsSessionTicket: request time expired,and then sync device local time with kms3.0 server system time fail.");
                return com.heytap.omas.omkms.network.response.c.a().a(jVarF.a()).a();
            }
            i.c(b, "applyKmsSessionTicket: request time expired,and then sync device local time with kms3.0 server system time success.");
            com.heytap.omas.omkms.network.response.c cVarC2 = e.c(context, dVar, bVarE.f7643c);
            if (cVarC2.getCode() != 0) {
                i.b(b, "applyKmsSessionTicket: request time expired,and then sync device local time with kms3.0 server system time ,and then get kms ticket by cert fail.");
            }
            return cVarC2;
        } catch (NetIOException e2) {
            i.b(b, "applyKmsSessionTicket: " + e2);
            return com.heytap.omas.omkms.network.response.c.a().a(1008).a();
        }
    }

    @NonNull
    private j d(Context context, com.heytap.omas.omkms.data.d dVar) throws AuthenticationException {
        try {
            j jVarF = f(context, dVar);
            jVarF.toString();
            if (jVarF.a() != 0) {
                i.b(b, "applySessionTicket: synKmsServerSystemTime fail,code:" + jVarF.a());
                return j.d().a(dVar.b()).a(jVarF.a()).a(jVarF.b()).a();
            }
            com.heytap.omas.omkms.network.response.c cVarC = c(context, dVar);
            if (cVarC.getCode() != 0) {
                i.b(b, "applySessionTicket: applyKmsSessionTicket,fail,code:" + cVarC.getCode());
                return j.d().a(dVar.b()).a(cVarC.getCode()).a();
            }
            Omkms3.ResGetKMSTicket resGetKMSTicket = (Omkms3.ResGetKMSTicket) com.heytap.omas.a.e.h.a(cVarC.getMetaResponse(), Omkms3.ResGetKMSTicket.class);
            Omkms3.KmsSessionInfo kmsSessionInfoBuild = Omkms3.KmsSessionInfo.newBuilder().setMk(resGetKMSTicket.getMk()).setDek(resGetKMSTicket.getDek()).setBeginTime(resGetKMSTicket.getBeginTime()).setEndTime(resGetKMSTicket.getEndTime()).setHeader(cVarC.getHeader()).setTicket(resGetKMSTicket.getTicket()).setUserInitInfo(com.heytap.omas.a.e.g.a(dVar.b())).build();
            if (this.a.saveKmsSessionTicketInfo(context, dVar.b(), kmsSessionInfoBuild) == null) {
                return j.d().a(dVar.b()).a(1002).a();
            }
            i.c(b, "applySessionTicket: kms session ticket has been successfully persisted.");
            com.heytap.omas.omkms.network.response.d dVarA = a(context, dVar, kmsSessionInfoBuild);
            if (dVarA.getCode() == 0) {
                Omkms3.ResGetServiceTicket resGetServiceTicket = (Omkms3.ResGetServiceTicket) com.heytap.omas.a.e.h.a(dVarA.getMetaResponse(), Omkms3.ResGetServiceTicket.class);
                return this.a.saveServiceSessionTicketInfo(context, dVar.b(), Omkms3.ServiceSessionInfo.newBuilder().setMk(resGetServiceTicket.getMk()).setDek(resGetServiceTicket.getDek()).setBeginTime(resGetServiceTicket.getBeginTime()).setEndTime(resGetServiceTicket.getEndTime()).setHeader(dVarA.getHeader()).setUserInitInfo(com.heytap.omas.a.e.g.a(dVar.b())).setTicket(resGetServiceTicket.getTicket()).build()) == null ? j.d().a(dVar.b()).a(1003).a() : j.d().a(dVar.b()).a(0).a();
            }
            i.b(b, "applySessionTicket: fail,code:" + dVarA.getCode());
            return j.d().a(dVar.b()).a(dVarA.getCode()).a();
        } catch (JsonSyntaxException e2) {
            i.b(b, "applySessionTicket: " + e2);
            return j.d().a(dVar.b()).a(1001).a(e2).a();
        }
    }

    @NonNull
    private b e(Context context, com.heytap.omas.omkms.data.d dVar) throws AuthenticationException {
        if (context == null || dVar == null) {
            throw new IllegalArgumentException("Parameters invalid.");
        }
        try {
            try {
                List<X509Certificate> listA = com.heytap.omas.a.d.b.a(context);
                List<String> listA2 = com.heytap.omas.a.d.b.a(context, dVar.b());
                if (listA2 != null && listA2.size() != 0) {
                    i.c(b, "getTrustCert: found the local kms cert.");
                    return new b(0, "cert_from_local_android_key_store", listA2.get(0));
                }
                i.c(b, "getTrustCert: not found the local kms cert chain.");
                com.heytap.omas.omkms.network.response.a aVarA = e.a(context, dVar);
                if (aVarA.getCode() != 0) {
                    i.b(b, "getTrustCert: getKmsCerts,fail,code:" + aVarA.getCode());
                    return new b(aVarA.getCode(), null, null);
                }
                Omkms3.ResGetKmsCerts resGetKmsCerts = (Omkms3.ResGetKmsCerts) com.heytap.omas.a.e.h.a(aVarA.getMetaResponse(), Omkms3.ResGetKmsCerts.class);
                List<String> kmsCertChain = resGetKmsCerts.getKmsCertChain();
                if (kmsCertChain != null && kmsCertChain.size() != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : kmsCertChain) {
                        X509Certificate x509CertificateA = com.heytap.omas.a.d.b.a(str);
                        kmsCertChain.indexOf(str);
                        arrayList.add(x509CertificateA);
                    }
                    com.heytap.omas.a.d.b.a(context, listA, arrayList);
                    if (com.heytap.omas.a.d.b.b(context, dVar.b(), arrayList) == null) {
                        i.b(b, "getTrustCert: save cert chain fail,should not take place always.");
                        return new b(1004, null, null);
                    }
                    return new b(0, "cert_from_get_from_server", resGetKmsCerts.getKmsCertChain().get(0));
                }
                i.b(b, "getTrustCert: Server internal error,certChain list is empty.");
                return new b(1013, null, null);
            } catch (CertException.CertChainException | CertException.CertChainVerifyException | CertificateException e2) {
                i.b(b, "getTrustCert: " + e2);
                return new b(1013, null, null);
            }
        } catch (JsonSyntaxException e3) {
            i.b(b, "getTrustCert: " + e3);
            return new b(1001, null, null);
        } catch (NetIOException e4) {
            i.b(b, "getTrustCert: " + e4);
            return new b(1008, null, null);
        } catch (CertException.LoadEccCertException e5) {
            i.b(b, "getTrustCert: " + e5);
            return new b(1010, null, null);
        }
    }

    private j f(Context context, com.heytap.omas.omkms.data.d dVar) throws AuthenticationException {
        j.b bVarA;
        long j2;
        long j3;
        try {
            b bVarE = e(context, dVar);
            if (bVarE.a != 0) {
                i.b(b, "synKmsServerSystemTme: get trust cert fail,code:" + bVarE.a);
                return j.d().a(bVarE.a).a(dVar.b()).a();
            }
            long jB = m.b();
            com.heytap.omas.omkms.network.response.b bVarB = e.b(context, dVar, bVarE.f7643c);
            long jB2 = m.b();
            if (19 == bVarB.getCode() || (201099 == bVarB.getCode() && "cert_from_local_android_key_store".equals(bVarE.b))) {
                com.heytap.omas.a.d.b.b(context, dVar.b());
                b bVarE2 = e(context, dVar);
                if (bVarE2.a != 0) {
                    i.b(b, "applySessionTicket: server envelop decrypt fail && cert_from_type:" + bVarE2.b + ",and get cert from server fail,code:" + bVarE2.a);
                    return j.d().a(bVarE2.a).a(dVar.b()).a();
                }
                long jB3 = m.b();
                com.heytap.omas.omkms.network.response.b bVarB2 = e.b(context, dVar, bVarE2.f7643c);
                long jB4 = m.b();
                i.c(b, "applySessionTicket: server envelop decrypt fail && cert_from_type:" + bVarE2.b + ",and sync time again,code:" + bVarE2.a);
                j2 = jB4;
                j3 = jB3;
                bVarB = bVarB2;
            } else {
                j2 = jB2;
                j3 = jB;
            }
            if (bVarB.getCode() != 0) {
                return j.d().a(bVarB.getCode()).a(dVar.b()).a();
            }
            if (l.a().a(context, ((Omkms3.ResGetKMSSystemTime) com.heytap.omas.a.e.h.a(bVarB.getMetaResponse(), Omkms3.ResGetKMSSystemTime.class)).getTimestamp(), j3, j2) != l.f7597e) {
                return j.d().a(dVar.b()).a(0).a();
            }
            i.b(b, "synKmsServerSystemTime: data invalid,server should not return such response.");
            return j.d().a(dVar.b()).a(1007).a();
        } catch (JsonSyntaxException e2) {
            e2.getMessage();
            bVarA = j.d().a(dVar.b()).a(1001).a(e2);
            return bVarA.a();
        } catch (NetIOException e3) {
            i.b(b, "synKmsServerSystemTime: " + e3);
            bVarA = j.d().a(1008);
            return bVarA.a();
        }
    }

    @Override // com.heytap.omas.omkms.feature.b
    @NonNull
    public j b(Context context, com.heytap.omas.omkms.data.d dVar) throws AuthenticationException {
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null.");
        }
        if (dVar == null || dVar.b() == null) {
            throw new IllegalArgumentException("Parameter invalid.");
        }
        if (c(context, dVar.b()) != null) {
            return a(dVar.b(), 0, (Exception) null);
        }
        Omkms3.KmsSessionInfo kmsSessionInfoB = b(context, dVar.b());
        return kmsSessionInfoB != null ? a(context, kmsSessionInfoB, dVar) : d(context, dVar);
    }

    @NonNull
    private j a(@NonNull com.heytap.omas.omkms.data.h hVar, @NonNull int i, @Nullable Exception exc) {
        j jVarA = j.d().a(hVar).a(i).a(exc).a();
        jVarA.toString();
        return jVarA;
    }

    public static f b() {
        return c.a;
    }

    @Nullable
    private Omkms3.ServiceSessionInfo c(Context context, com.heytap.omas.omkms.data.h hVar) {
        String str;
        Omkms3.ServiceSessionInfo serviceSessionInfoLoadServiceSessionTicketInfo = this.a.loadServiceSessionTicketInfo(context, hVar);
        if (serviceSessionInfoLoadServiceSessionTicketInfo == null) {
            str = "checkServiceSessionTicket: loadServiceSessionKey return null.";
        } else {
            if (a(context, hVar, serviceSessionInfoLoadServiceSessionTicketInfo)) {
                return serviceSessionInfoLoadServiceSessionTicketInfo;
            }
            str = "checkServiceSessionTicket: checkTimeValidate ,invalid.";
        }
        i.b(b, str);
        return null;
    }

    private com.heytap.omas.omkms.network.response.d a(Context context, com.heytap.omas.omkms.data.d dVar, Omkms3.KmsSessionInfo kmsSessionInfo) throws AuthenticationException {
        com.heytap.omas.omkms.network.response.d.b bVarA;
        int i;
        if (context == null) {
            throw new IllegalArgumentException("applyServiceSessionTicket: context cannot be null.");
        }
        if (dVar == null || dVar.b() == null || kmsSessionInfo == null) {
            throw new IllegalArgumentException("applyServiceSessionTicket: parameters invalid.");
        }
        try {
            com.heytap.omas.omkms.network.response.d dVarB = e.b(context, kmsSessionInfo.getTicket(), dVar, Base64.decode(kmsSessionInfo.getDek(), 2), Base64.decode(kmsSessionInfo.getMk(), 2));
            if (7 == dVarB.getCode()) {
                i.c(b, "applyServiceSessionTicket: request time expired,try sync kms3.0 server time now.");
                j jVarF = f(context, dVar);
                if (jVarF.a() != 0) {
                    i.b(b, "applyServiceSessionTicket: request expired,synServiceTime fail,code:" + jVarF.a());
                    return com.heytap.omas.omkms.network.response.d.a().a(jVarF.a()).a();
                }
                i.c(b, "applyServiceSessionTicket: request expired,synServiceTime ok, try apply service session ticket again now.");
                dVarB = e.b(context, kmsSessionInfo.getTicket(), dVar, Base64.decode(kmsSessionInfo.getDek(), 2), Base64.decode(kmsSessionInfo.getMk(), 2));
            }
            if (6 != dVarB.getCode()) {
                return dVarB;
            }
            com.heytap.omas.omkms.network.response.c cVarC = c(context, dVar);
            if (cVarC.getCode() != 0) {
                i.b(b, "applyServiceSessionTicket: kms ticket time expired,then update it,fail,cannot init client.");
                return com.heytap.omas.omkms.network.response.d.a().a(cVarC.getCode()).a();
            }
            Omkms3.ResGetKMSTicket resGetKMSTicket = (Omkms3.ResGetKMSTicket) com.heytap.omas.a.e.h.a(cVarC.getMetaResponse(), Omkms3.ResGetKMSTicket.class);
            Omkms3.KmsSessionInfo kmsSessionInfoBuild = Omkms3.KmsSessionInfo.newBuilder().setMk(resGetKMSTicket.getMk()).setDek(resGetKMSTicket.getDek()).setBeginTime(resGetKMSTicket.getBeginTime()).setEndTime(resGetKMSTicket.getEndTime()).setHeader(cVarC.getHeader()).setTicket(resGetKMSTicket.getTicket()).setUserInitInfo(com.heytap.omas.a.e.g.a(dVar.b())).build();
            if (this.a.saveKmsSessionTicketInfo(context, dVar.b(), kmsSessionInfoBuild) == null) {
                return com.heytap.omas.omkms.network.response.d.a().a(1002).a();
            }
            i.c(b, "applyServiceSessionTicket: kms session ticket time expired,then update it,success.");
            return e.a(context, kmsSessionInfoBuild.getTicket(), dVar, Base64.decode(kmsSessionInfoBuild.getDek(), 2), Base64.decode(kmsSessionInfoBuild.getMk(), 2));
        } catch (JsonSyntaxException e2) {
            i.b(b, "applyServiceSessionTicket: " + e2);
            bVarA = com.heytap.omas.omkms.network.response.d.a();
            i = 1001;
            return bVarA.a(i).a();
        } catch (NetIOException e3) {
            i.b(b, "applyServiceSessionTicket: " + e3);
            bVarA = com.heytap.omas.omkms.network.response.d.a();
            i = 1008;
            return bVarA.a(i).a();
        }
    }

    @Nullable
    private Omkms3.KmsSessionInfo b(Context context, com.heytap.omas.omkms.data.h hVar) {
        String str;
        Omkms3.KmsSessionInfo kmsSessionInfoLoadKmsSessionTicketInfo = this.a.loadKmsSessionTicketInfo(context, hVar);
        if (kmsSessionInfoLoadKmsSessionTicketInfo == null) {
            str = "checkKmsSessionTicket: loadServiceSessionKey return null.";
        } else {
            if (a(context, hVar, kmsSessionInfoLoadKmsSessionTicketInfo)) {
                return kmsSessionInfoLoadKmsSessionTicketInfo;
            }
            str = "checkKmsSessionTicket: checkTimeValidate ,invalid.";
        }
        i.b(b, str);
        return null;
    }

    @Override // com.heytap.omas.omkms.feature.b
    @Nullable
    public Omkms3.ServiceSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar) {
        Omkms3.ServiceSessionInfo serviceSessionInfoLoadServiceSessionTicketInfo = this.a.loadServiceSessionTicketInfo(context, hVar);
        if (serviceSessionInfoLoadServiceSessionTicketInfo == null) {
            i.b(b, "getServiceSessionTicket: fail,not found serviceSessionInfo.");
        }
        return serviceSessionInfoLoadServiceSessionTicketInfo;
    }

    @Override // com.heytap.omas.omkms.feature.b
    public void a(Context context, com.heytap.omas.omkms.data.d dVar) {
        try {
            b(context, dVar);
        } catch (AuthenticationException unused) {
            i.b(b, "initSessionTicketAsyncTask: should not take place always.");
        }
    }

    private boolean a(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.KmsSessionInfo kmsSessionInfo) {
        l lVarA = l.a();
        long beginTime = kmsSessionInfo.getBeginTime();
        long endTime = kmsSessionInfo.getEndTime();
        long jA = lVarA.a(context);
        long jB = m.b();
        if (beginTime < 0 || endTime < 0 || beginTime >= endTime) {
            i.b(b, "checkTimeValidate: parameter invalid.server bug here.");
            return false;
        }
        long j2 = jB + jA;
        return j2 >= beginTime && j2 + 10 <= endTime;
    }

    private boolean a(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.ServiceSessionInfo serviceSessionInfo) {
        l lVarA = l.a();
        long beginTime = serviceSessionInfo.getBeginTime();
        long endTime = serviceSessionInfo.getEndTime();
        long jA = lVarA.a(context);
        long jB = m.b();
        if (beginTime < 0 || endTime < 0 || beginTime >= endTime) {
            i.b(b, "checkTimeValidate: parameter invalid.server bug here.");
            return false;
        }
        long j2 = jB + jA;
        return j2 >= beginTime && j2 + 10 <= endTime;
    }

    @Override // com.heytap.omas.omkms.feature.b
    public byte[] a() {
        return f7641c;
    }
}
