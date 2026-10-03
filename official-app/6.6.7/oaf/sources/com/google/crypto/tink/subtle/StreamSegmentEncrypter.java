package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface StreamSegmentEncrypter {
    void encryptSegment(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z, ByteBuffer byteBuffer3) throws GeneralSecurityException;

    void encryptSegment(ByteBuffer byteBuffer, boolean z, ByteBuffer byteBuffer2) throws GeneralSecurityException;

    ByteBuffer getHeader();
}
