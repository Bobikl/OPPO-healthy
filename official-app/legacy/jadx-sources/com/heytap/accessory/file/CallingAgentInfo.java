package com.heytap.accessory.file;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class CallingAgentInfo {
    private FileTransfer.EventListener mEventListener;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private FileTransfer.IFileTransferCallback mLocalCallback;
    private ConcurrentHashMap<Long, ConcurrentHashMap<Integer, TransactionDetails>> mTransactionsMap;

    public static class TransactionDetails {
        long mConnectionId;
        String mFilePath;
        String mSource;
        int mTransactionId;
    }

    public CallingAgentInfo(FileTransfer.EventListener eventListener, HandlerThread handlerThread, Handler handler, FileTransfer.IFileTransferCallback iFileTransferCallback, ConcurrentHashMap<Long, ConcurrentHashMap<Integer, TransactionDetails>> concurrentHashMap) {
        this.mEventListener = eventListener;
        this.mHandlerThread = handlerThread;
        this.mHandler = handler;
        this.mTransactionsMap = concurrentHashMap;
        this.mLocalCallback = iFileTransferCallback;
    }

    public FileTransfer.EventListener getEventListener() {
        return this.mEventListener;
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public HandlerThread getHandlerThread() {
        return this.mHandlerThread;
    }

    public FileTransfer.IFileTransferCallback getLocalCallback() {
        return this.mLocalCallback;
    }

    public ConcurrentHashMap<Long, ConcurrentHashMap<Integer, TransactionDetails>> getTransactionsMap() {
        return this.mTransactionsMap;
    }

    public void setEventListener(FileTransfer.EventListener eventListener) {
        this.mEventListener = eventListener;
    }

    public void setLocalCallback(FileTransfer.IFileTransferCallback iFileTransferCallback) {
        this.mLocalCallback = iFileTransferCallback;
    }
}
