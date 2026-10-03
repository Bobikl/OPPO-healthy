package com.heytap.omas.omkms.feature;

import android.content.Context;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public interface a {
    Omkms3.EnKmsSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.KmsSessionInfo kmsSessionInfo);

    Omkms3.EnServiceSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar, Omkms3.ServiceSessionInfo serviceSessionInfo);

    Omkms3.KmsSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar);

    Omkms3.ServiceSessionInfo b(Context context, com.heytap.omas.omkms.data.h hVar);
}
