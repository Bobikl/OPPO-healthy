package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Immutable
public interface Prf {
    byte[] compute(byte[] bArr, int i) throws GeneralSecurityException;
}
