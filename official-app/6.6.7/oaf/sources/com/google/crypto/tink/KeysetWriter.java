package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.Keyset;
import java.io.IOException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface KeysetWriter {
    void write(EncryptedKeyset encryptedKeyset) throws IOException;

    void write(Keyset keyset) throws IOException;
}
