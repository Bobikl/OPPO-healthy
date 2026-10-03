package com.heytap.store.apm.Net.stetho;

import androidx.annotation.Nullable;
import com.heytap.accessory.pair.connectivity.ble.constant.BleConstants;
import com.heytap.store.apm.Net.utils.NetLogUtils;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class NetworkReporterImpl implements NetworkEventReporter {
    private static final String TAG = "NetworkReporterImpl";
    private static AtomicInteger mNextRequestId = new AtomicInteger(0);
    private static NetworkReporterImpl sInstance;
    private DataTranslator mDataTranslator = new DataTranslator();

    private NetworkReporterImpl() {
    }

    public static NetworkReporterImpl getInstance() {
        if (sInstance == null) {
            sInstance = new NetworkReporterImpl();
        }
        return sInstance;
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void dataReceived(String str, int i, int i2) throws Throwable {
        NetLogUtils.d(TAG, BleConstants.DATA_RECEIVED);
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void dataSent(String str, int i, int i2) throws Throwable {
        NetLogUtils.d(TAG, "dataSent");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void httpExchangeFailed(String str, String str2) throws Throwable {
        NetLogUtils.d(TAG, "httpExchangeFailed");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    @Nullable
    public InputStream interpretResponseStream(String str, @Nullable String str2, @Nullable String str3, @Nullable InputStream inputStream, ResponseHandler responseHandler) throws Throwable {
        NetLogUtils.d(TAG, "interpretResponseStream");
        return this.mDataTranslator.saveInterpretResponseStream(str, str2, str3, inputStream);
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public boolean isEnabled() {
        return true;
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public String nextRequestId() throws Throwable {
        NetLogUtils.d(TAG, "nextRequestId");
        return String.valueOf(mNextRequestId.getAndIncrement());
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void requestWillBeSent(NetworkEventReporter.InspectorRequest inspectorRequest) throws Throwable {
        NetLogUtils.d(TAG, "requestWillBeSent");
        this.mDataTranslator.saveInspectorRequest(inspectorRequest);
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void responseHeadersReceived(NetworkEventReporter.InspectorResponse inspectorResponse) throws Throwable {
        NetLogUtils.d(TAG, "responseHeadersReceived");
        this.mDataTranslator.saveInspectorResponse(inspectorResponse);
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void responseReadFailed(String str, String str2) throws Throwable {
        NetLogUtils.d(TAG, "responseReadFailed");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void responseReadFinished(String str) throws Throwable {
        NetLogUtils.d(TAG, "responseReadFinished");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void webSocketClosed(String str) throws Throwable {
        NetLogUtils.d(TAG, "webSocketClosed");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void webSocketCreated(String str, String str2) throws Throwable {
        NetLogUtils.d(TAG, "webSocketCreated");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void webSocketFrameError(String str, String str2) throws Throwable {
        NetLogUtils.d(TAG, "webSocketFrameError");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void webSocketFrameReceived(NetworkEventReporter.InspectorWebSocketFrame inspectorWebSocketFrame) throws Throwable {
        NetLogUtils.d(TAG, "webSocketFrameReceived");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void webSocketFrameSent(NetworkEventReporter.InspectorWebSocketFrame inspectorWebSocketFrame) throws Throwable {
        NetLogUtils.d(TAG, "webSocketFrameSent");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void webSocketHandshakeResponseReceived(NetworkEventReporter.InspectorWebSocketResponse inspectorWebSocketResponse) throws Throwable {
        NetLogUtils.d(TAG, "webSocketHandshakeResponseReceived");
    }

    @Override // com.heytap.store.apm.Net.stetho.NetworkEventReporter
    public void webSocketWillSendHandshakeRequest(NetworkEventReporter.InspectorWebSocketRequest inspectorWebSocketRequest) throws Throwable {
        NetLogUtils.d(TAG, "webSocketWillSendHandshakeRequest");
    }
}
