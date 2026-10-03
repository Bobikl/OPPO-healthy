package com.heytap.accessory.stream.model;

import android.os.Handler;
import android.os.HandlerThread;
import com.heytap.accessory.stream.StreamTransfer;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class CallingAgentInfo {
    private StreamTransfer.EventListener mEventListener;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private StreamTransfer.IStreamTransferCallback mLocalCallback;
    private ConcurrentHashMap<Long, ConcurrentHashMap<Integer, TransactionDetails>> mTransactionsMap;

    public static class TransactionDetails {
        public long mConnectionId;
        public int mTransactionId;
    }

    public CallingAgentInfo(StreamTransfer.EventListener eventListener, HandlerThread handlerThread, Handler handler, StreamTransfer.IStreamTransferCallback iStreamTransferCallback, ConcurrentHashMap<Long, ConcurrentHashMap<Integer, TransactionDetails>> concurrentHashMap) {
        this.mEventListener = eventListener;
        this.mHandlerThread = handlerThread;
        this.mHandler = handler;
        this.mTransactionsMap = concurrentHashMap;
        this.mLocalCallback = iStreamTransferCallback;
    }

    public StreamTransfer.EventListener getEventListener() {
        return this.mEventListener;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public HandlerThread getHandlerThread() {
        return this.mHandlerThread;
    }

    public StreamTransfer.IStreamTransferCallback getLocalCallback() {
        return this.mLocalCallback;
    }

    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, TransactionDetails>> getTransactionsMap() {
        return this.mTransactionsMap;
    }

    public void setEventListener(StreamTransfer.EventListener eventListener) {
        this.mEventListener = eventListener;
    }

    public void setLocalCallback(StreamTransfer.IStreamTransferCallback iStreamTransferCallback) {
        this.mLocalCallback = iStreamTransferCallback;
    }
}
