package com.heytap.omas.a.c;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.omas.omkms.data.l;
import com.heytap.omas.omkms.exception.AuthenticationException;
import com.heytap.omas.omkms.exception.NoSuchAlgorithmException;
import com.heytap.omas.omkms.exception.NoSuchPaddingException;
import com.heytap.omas.proto.Omkms3;

/* JADX INFO: loaded from: classes19.dex */
public interface d {
    Omkms3.CMSEncryptedData a(Context context, byte[] bArr, com.heytap.omas.omkms.data.d dVar);

    Omkms3.CMSEncryptedData a(byte[] bArr, byte[] bArr2);

    String a(Context context, byte[] bArr, String str, String str2, l lVar, @NonNull com.heytap.omas.omkms.feature.b bVar) throws NoSuchPaddingException, NoSuchAlgorithmException;

    @Nullable
    byte[] a(Context context, com.heytap.omas.omkms.data.d dVar, Omkms3.CMSEncryptedData cMSEncryptedData);

    byte[] a(Context context, String str, l lVar, com.heytap.omas.omkms.feature.b bVar) throws NoSuchPaddingException, NoSuchAlgorithmException, AuthenticationException;

    @Nullable
    byte[] a(Omkms3.CMSEncryptedData cMSEncryptedData, byte[] bArr);
}
