package com.oplusos.vfxmodelviewer.utils;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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
        return (str == null || str.endsWith(".json")) ? false : true;
    }

    public static boolean isJson(@Nullable String str) {
        return str != null && str.endsWith(".json");
    }

    private static native void nAcquireReceivedMessage(long j, ByteBuffer byteBuffer, int i);

    private static native long nCreate(int i);

    private static native void nDestroy(long j);

    private static native String nPeekIncomingLabel(long j);

    private static native int nPeekReceivedBufferLength(long j);

    private static native String nPeekReceivedLabel(long j);

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
