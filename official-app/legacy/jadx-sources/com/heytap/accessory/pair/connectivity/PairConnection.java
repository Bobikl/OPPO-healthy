package com.heytap.accessory.pair.connectivity;

import com.heytap.accessory.pair.connectivity.interfaces.IConnectionEventListener;
import com.heytap.accessory.pair.connectivity.param.connect.FPConParam;
import com.heytap.accessory.pair.connectivity.param.message.FPMessageParam;
import com.heytap.accessory.pair.logging.PairLog;
import io.netty.util.internal.StringUtil;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PairConnection {
    public static final int BLE_PAYLOAD_LENGTH_FIELD_SIZE_IN_BYTES = 1;
    public static final int BT_MAX_UNCORRUPTED_DATA_SIZE = 12275;
    public static final int CONNECTION_ERROR_FAIL = -1106;
    public static final int CONNECTION_ERROR_NONE = 0;
    public static final int CONNECTION_ERROR_PACKET = 2;
    public static final int CONNECTION_STATUS_CLOSED = 2;
    public static final int CONNECTION_STATUS_CONNECTED = 5;
    public static final int CONNECTION_STATUS_DORMANT = 4;
    public static final int CONNECTION_STATUS_INVALID = 3;
    public static final int CONNECTION_STATUS_OPEN = 1;
    public static final int CONNECTION_STATUS_UNKNOWN = 0;
    public static final int PAYLOAD_LENGTH_FIELD_SIZE_IN_BYTES = 2;
    public static final int SEND_ERROR_DORMANT = 2;
    public static final int SEND_ERROR_FAIL = 1;
    public static final int SEND_ERROR_NONE = 0;
    private static final String TAG = "PairConnection";
    protected int mChannelType;
    protected FPConParam mConnectionParam;
    protected int mError;
    protected boolean mIsCrcEnabled = false;
    protected int mStatus;

    public PairConnection(FPConParam fPConParam) {
        this.mConnectionParam = fPConParam;
    }

    public abstract int activateConnection();

    public abstract void clearConnection();

    public abstract void close();

    public abstract void connect(IConnectionEventListener iConnectionEventListener);

    public abstract void forceClose();

    public abstract void initializeReader();

    public abstract void initializeWriter();

    public abstract int openConnection(IConnectionEventListener iConnectionEventListener);

    public void printByteArray(byte[] bArr, String str) {
        if (bArr != null) {
            PairLog.v(TAG, "**** " + str + " ****");
            StringBuilder sb = new StringBuilder();
            for (byte b : bArr) {
                sb.append(Integer.toHexString(b & 255));
                sb.append(StringUtil.SPACE);
            }
            PairLog.v(TAG, " " + sb.toString());
        }
    }

    public abstract int write(byte[] bArr, FPMessageParam fPMessageParam);
}
