package com.heytap.omas.a.a;

import android.util.Log;
import com.google.gson.JsonSyntaxException;
import com.heytap.omas.a.e.h;
import com.heytap.omas.a.e.i;
import com.heytap.omas.omkms.data.d;
import com.heytap.omas.omkms.network.request.BaseOmkmsRequest;
import com.heytap.omas.proto.Omkms3;
import com.heytap.omas.wb.WbkitAndr;

/* JADX INFO: loaded from: classes19.dex */
public class c {
    private static final String a = "ResponseAuthImp";
    private static final String b = "WB";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7569c = "SessionKey";

    public static boolean a(BaseOmkmsRequest baseOmkmsRequest, Omkms3.Pack pack) {
        try {
            Omkms3.Header header = (Omkms3.Header) h.a(pack.getHeaderString(), Omkms3.Header.class);
            if (baseOmkmsRequest.getHeader().getRequestId().equals(header.getRequestId())) {
                return true;
            }
            i.b(a, "handle: resId not equals to reqId.reqId=" + baseOmkmsRequest.getHeader().getRequestId() + ",resId=" + header.getRequestId());
            return false;
        } catch (JsonSyntaxException e2) {
            i.b(a, "resIdAuth: InvalidProtocolBufferException:" + e2.getMessage());
            return false;
        }
    }

    public static boolean a(BaseOmkmsRequest baseOmkmsRequest, Omkms3.Pack pack, d dVar) {
        try {
            Omkms3.Header header = pack.getHeader();
            byte[] bArrA = com.heytap.omas.a.e.c.a(pack.getHeaderString().getBytes(), pack.getPayloadString().getBytes());
            if ("WB".equals(baseOmkmsRequest.getHeader().getKeyType())) {
                if (WbkitAndr.verify(dVar.a(), dVar.c(), pack.getSignature().getSignedContent().getBytes(), bArrA, pack.getHeader().getWbKeyIndex().getWbId().getBytes(), pack.getHeader().getWbKeyIndex().getKeyId().getBytes(), header.getWbKeyIndex().getWbVersion()) == 0) {
                    return true;
                }
                Log.e(a, "signatureVerify: Wbkit.verify fail.");
                return false;
            }
            if ("SessionKey".equals(baseOmkmsRequest.getHeader().getKeyType())) {
                return true;
            }
            i.b(a, "signatureVerify: not support key_type=" + baseOmkmsRequest.getHeader().getKeyType());
            return false;
        } catch (JsonSyntaxException e2) {
            i.b(a, "resIdAuth: InvalidProtocolBufferException:" + e2.getMessage());
            return false;
        }
    }
}
