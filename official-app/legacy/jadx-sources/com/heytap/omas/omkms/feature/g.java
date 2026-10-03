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
import com.heytap.omas.proto.Omkms3;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes19.dex */
public class g implements com.heytap.omas.omkms.feature.b {
    private static final String b = "SessionTicketManagerWbAuthModeImp";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f7644c = new byte[32];
    private final SessionTicketLoader a;

    public static class b {
        private static final g a = new g();

        private b() {
        }
    }

    private g() {
        this.a = new SessionTicketLoader();
        new SecureRandom().nextBytes(f7644c);
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

    private com.heytap.omas.omkms.network.response.c c(Context context, com.heytap.omas.omkms.data.d dVar) throws AuthenticationException {
        try {
            com.heytap.omas.omkms.network.response.c cVarC = e.c(context, dVar);
            int code = cVarC.getCode();
            if (code == 0) {
                return cVarC;
            }
            if (code != 7) {
                i.b(b, "applyKmsSessionTicket: fail,code:" + cVarC.getCode());
                return com.heytap.omas.omkms.network.response.c.a().a(cVarC.getCode()).a();
            }
            j jVarE = e(context, dVar);
            if (jVarE.a() != 0) {
                i.b(b, "applyKmsSessionTicket: request time expired,and then sync device local time with kms3.0 server system time fail.");
                return com.heytap.omas.omkms.network.response.c.a().a(jVarE.a()).a();
            }
            i.c(b, "applyKmsSessionTicket: request time expired,and then sync device local time with kms3.0 server system time success.");
            return e.c(context, dVar);
        } catch (NetIOException e2) {
            i.b(b, "applyKmsSessionTicket: " + e2);
            return com.heytap.omas.omkms.network.response.c.a().a(1008).a();
        }
    }

    @NonNull
    private j d(Context context, com.heytap.omas.omkms.data.d dVar) throws AuthenticationException {
        try {
            j jVarE = e(context, dVar);
            jVarE.toString();
            if (jVarE.a() != 0) {
                i.b(b, "applySessionTicket: synKmsServerSystemTime fail,code:" + jVarE.a());
                return j.d().a(dVar.b()).a(jVarE.a()).a(jVarE.b()).a();
            }
            l.a().a(context);
            com.heytap.omas.omkms.network.response.c cVarC = c(context, dVar);
            if (cVarC.getCode() != 0) {
                return j.d().a(dVar.b()).a(cVarC.getCode()).a();
            }
            Omkms3.ResGetKMSTicket resGetKMSTicket = (Omkms3.ResGetKMSTicket) com.heytap.omas.a.e.h.a(cVarC.getMetaResponse(), Omkms3.ResGetKMSTicket.class);
            Omkms3.KmsSessionInfo kmsSessionInfoBuild = Omkms3.KmsSessionInfo.newBuilder().setMk(resGetKMSTicket.getMk()).setDek(resGetKMSTicket.getDek()).setBeginTime(resGetKMSTicket.getBeginTime()).setEndTime(resGetKMSTicket.getEndTime()).setHeader(cVarC.getHeader()).setTicket(resGetKMSTicket.getTicket()).setUserInitInfo(com.heytap.omas.a.e.g.a(dVar.b())).build();
            if (this.a.saveKmsSessionTicketInfo(context, dVar.b(), kmsSessionInfoBuild) == null) {
                return j.d().a(dVar.b()).a(1002).a();
            }
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

    private j e(Context context, com.heytap.omas.omkms.data.d dVar) throws AuthenticationException {
        j.b bVarA;
        try {
            long jB = m.b();
            com.heytap.omas.omkms.network.response.b bVarB = e.b(context, dVar);
            if (bVarB.getCode() != 0) {
                i.b(b, "synKmsServerSystemTime: fail,code:" + bVarB.getCode());
                return j.d().a(dVar.b()).a(bVarB.getCode()).a();
            }
            Omkms3.ResGetKMSSystemTime resGetKMSSystemTime = (Omkms3.ResGetKMSSystemTime) com.heytap.omas.a.e.h.a(bVarB.getMetaResponse(), Omkms3.ResGetKMSSystemTime.class);
            if (l.a().a(context, resGetKMSSystemTime.getTimestamp(), jB, m.b()) != l.f7597e) {
                return j.d().a(dVar.b()).a(0).a();
            }
            i.b(b, "synKmsServerSystemTime: data invalid,server should not return such response.");
            return j.d().a(dVar.b()).a(1007).a();
        } catch (JsonSyntaxException e2) {
            e2.toString();
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

    public static g b() {
        return b.a;
    }

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
            com.heytap.omas.omkms.network.response.d dVarA = e.a(context, kmsSessionInfo.getTicket(), dVar, Base64.decode(kmsSessionInfo.getDek(), 2), Base64.decode(kmsSessionInfo.getMk(), 2));
            if (7 == dVarA.getCode()) {
                i.b(b, "applyServiceSessionTicket: request time expired,try sync kms3.0 server time now.");
                j jVarE = e(context, dVar);
                if (jVarE.a() != 0) {
                    i.b(b, "applyServiceSessionTicket: request expired,synServiceTime fail,code:" + jVarE.a());
                    return com.heytap.omas.omkms.network.response.d.a().a(jVarE.a()).a();
                }
                i.c(b, "applyServiceSessionTicket: request expired,synServiceTime ok, try apply service session ticket again now.");
                dVarA = e.a(context, kmsSessionInfo.getTicket(), dVar, Base64.decode(kmsSessionInfo.getDek(), 2), Base64.decode(kmsSessionInfo.getMk(), 2));
            }
            if (6 != dVarA.getCode()) {
                return dVarA;
            }
            com.heytap.omas.omkms.network.response.c cVarC = c(context, dVar);
            if (cVarC.getCode() != 0) {
                i.b(b, "applyServiceSessionTicket: kms ticket time expired,then update it,fail,need downGrade to WB mode.");
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
        return f7644c;
    }
}
