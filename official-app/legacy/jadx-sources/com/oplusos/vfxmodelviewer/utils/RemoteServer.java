package com.oplusos.vfxmodelviewer.utils;

import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.hc3;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes9.dex */
public class RemoteServer {
    private long mNativeObject;

    public static class ReceivedMessage {
        public ByteBuffer buffer;
        public String label;
    }

    public RemoteServer(int i) {
        long jNCreate = nCreate(i);
        this.mNativeObject = jNCreate;
        if (jNCreate == 0) {
            throw new IllegalStateException("Couldn't create RemoteServer");
        }
    }

    public static boolean isBinary(@Nullable String str) {
        return (str == null || str.endsWith(hc3.CLASSIC_CONFIG_SUFFIX)) ? false : true;
    }

    public static boolean isJson(@Nullable String str) {
        return str != null && str.endsWith(hc3.CLASSIC_CONFIG_SUFFIX);
    }

    private static native void nAcquireReceivedMessage(long j2, ByteBuffer byteBuffer, int i);

    private static native long nCreate(int i);

    private static native void nDestroy(long j2);

    private static native String nPeekIncomingLabel(long j2);

    private static native int nPeekReceivedBufferLength(long j2);

    private static native String nPeekReceivedLabel(long j2);

    @Nullable
    public ReceivedMessage acquireReceivedMessage() {
        int iNPeekReceivedBufferLength = nPeekReceivedBufferLength(this.mNativeObject);
        if (iNPeekReceivedBufferLength == 0) {
            return null;
        }
        ReceivedMessage receivedMessage = new ReceivedMessage();
        receivedMessage.label = nPeekReceivedLabel(this.mNativeObject);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iNPeekReceivedBufferLength);
        receivedMessage.buffer = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        nAcquireReceivedMessage(this.mNativeObject, receivedMessage.buffer, iNPeekReceivedBufferLength);
        return receivedMessage;
    }

    public void close() {
        nDestroy(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    public void finalize() throws Throwable {
        nDestroy(this.mNativeObject);
        super.finalize();
    }

    @Nullable
    public String peekIncomingLabel() {
        return nPeekIncomingLabel(this.mNativeObject);
    }
}
