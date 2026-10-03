package com.google.crypto.tink;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface KeyWrap {
    byte[] unwrap(byte[] bArr) throws GeneralSecurityException;

    byte[] wrap(byte[] bArr) throws GeneralSecurityException;
}
