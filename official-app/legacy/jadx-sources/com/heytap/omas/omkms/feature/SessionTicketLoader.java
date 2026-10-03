package com.heytap.omas.omkms.feature;

import android.annotation.TargetApi;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@TargetApi(19)
public class SessionTicketLoader {
    public static final String TAG = "SessionTicketLoader";
    private a mISessionTicketCache = null;

    public SessionTicketLoader() {
        setSessionTicketCache(c.a());
    }

    @TargetApi(19)
    public Omkms3.KmsSessionInfo loadKmsSessionTicketInfo(Context context, com.heytap.omas.omkms.data.h hVar) {
        return this.mISessionTicketCache.a(context, hVar);
    }

    @TargetApi(19)
    public Omkms3.ServiceSessionInfo loadServiceSessionTicketInfo(Context context, com.heytap.omas.omkms.data.h hVar) {
        return this.mISessionTicketCache.b(context, hVar);
    }

    @TargetApi(19)
    public Omkms3.EnKmsSessionInfo saveKmsSessionTicketInfo(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.KmsSessionInfo kmsSessionInfo) {
        return this.mISessionTicketCache.a(context, hVar, kmsSessionInfo);
    }

    @TargetApi(19)
    public Omkms3.EnServiceSessionInfo saveServiceSessionTicketInfo(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.ServiceSessionInfo serviceSessionInfo) {
        return this.mISessionTicketCache.a(context, hVar, serviceSessionInfo);
    }

    @TargetApi(19)
    public void setSessionTicketCache(@NonNull a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Parameters cannot be null.");
        }
        this.mISessionTicketCache = aVar;
    }
}
