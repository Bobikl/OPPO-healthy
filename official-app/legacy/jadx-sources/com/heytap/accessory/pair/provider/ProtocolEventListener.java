package com.heytap.accessory.pair.provider;

/* JADX INFO: loaded from: classes14.dex */
public interface ProtocolEventListener {
    public static final int TYPE_PAIRED_INFO = 3;
    public static final int TYPE_RECEIVED = 1;
    public static final int TYPE_SENT_RESULT = 2;

    void onNotifyEvent(int i, ProtocolEventManager.Device device, ProtocolEventManager.Event event);

    void onReceived(ProtocolEventManager.Device device, ProtocolEventManager.Event event);

    void onSentResult(ProtocolEventManager.Device device, ProtocolEventManager.Event event);
}
