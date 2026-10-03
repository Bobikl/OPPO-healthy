package com.example.opponotificationrelay;



/** 当前独立版的默认实现：保留协议负载并记录日志，不伪装成已经连接手表。 */
public final class UnavailableWearTransport implements WearTransport {
    private static final String TAG = "OppoRelay";

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void send(RelayPayloadEncoder.EventEnvelope event) {
        FileLogger.i(TAG, "transport-unavailable sid=" + event.serviceId
                + " cid=" + event.commandId + " bytes=" + event.payload.length);
    }
}
