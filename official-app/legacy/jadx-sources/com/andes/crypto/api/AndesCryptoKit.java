package com.andes.crypto.api;

import androidx.annotation.Keep;
import com.andes.crypto.engine.EngineAesGCMCipher;
import com.andes.crypto.engine.EngineFileCipher;
import com.andes.crypto.engine.EngineTransCipher;
import com.andes.crypto.exception.SeException;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
@Keep
public interface AndesCryptoKit {
    EngineAesGCMCipher newEngineAesGCMCipher(byte[] bArr) throws InvalidProtocolBufferException;

    EngineFileCipher newEngineFileCipher(int i, byte[] bArr, InputStream inputStream, int i2) throws IOException, SeException;

    EngineTransCipher newEngineTransCipher(int i, byte[] bArr, InputStream inputStream, boolean z) throws IOException, SeException;
}
