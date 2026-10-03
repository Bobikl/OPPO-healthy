package com.google.security.cryptauth.lib.securegcm;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public interface D2DHandshakeContext {
    boolean canSendPayloadInHandshakeMessage();

    byte[] getNextHandshakeMessage() throws HandshakeException;

    byte[] getNextHandshakeMessage(byte[] bArr) throws HandshakeException;

    boolean isHandshakeComplete();

    byte[] parseHandshakeMessage(byte[] bArr) throws HandshakeException;

    D2DConnectionContext toConnectionContext() throws HandshakeException;
}
