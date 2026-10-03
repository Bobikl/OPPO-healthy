package com.heytap.omas.omkms.feature;

import android.annotation.TargetApi;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.omas.omkms.data.j;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public interface b {
    @Nullable
    @TargetApi(19)
    Omkms3.ServiceSessionInfo a(Context context, com.heytap.omas.omkms.data.h hVar);

    void a(Context context, com.heytap.omas.omkms.data.d dVar);

    byte[] a();

    @NonNull
    @TargetApi(19)
    j b(Context context, com.heytap.omas.omkms.data.d dVar) throws AuthenticationException;
}
