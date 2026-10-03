package org.hapjs.features.channel;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ChannelMessage {
    public static final String KEY_CODE = "code";
    public static final String KEY_DATA = "data";
    public static final String KEY_STREAMS = "streams";
    public int code;
    private Object data;
    public List<ParcelFileDescriptor> streams;

    public ChannelMessage() {
    }

    public static ChannelMessage parse(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ChannelMessage channelMessage = new ChannelMessage();
        channelMessage.code = bundle.getInt("code");
        channelMessage.data = bundle.get("data");
        channelMessage.streams = bundle.getParcelableArrayList(KEY_STREAMS);
        return channelMessage;
    }

    public int dataSize() {
        Object obj = this.data;
        if (obj instanceof String) {
            return ((String) obj).length() * 2;
        }
        if (obj instanceof byte[]) {
            return ((byte[]) obj).length;
        }
        return 0;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(String str) {
        this.data = str;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("code", this.code);
        Object obj = this.data;
        if (obj instanceof byte[]) {
            bundle.putByteArray("data", (byte[]) obj);
        } else if (obj instanceof String) {
            bundle.putString("data", String.valueOf(obj));
        }
        if (this.streams != null) {
            bundle.putParcelableArrayList(KEY_STREAMS, new ArrayList<>(this.streams));
        }
        return bundle;
    }

    public ChannelMessage(ChannelMessage channelMessage) {
        this.code = channelMessage.code;
        this.data = channelMessage.data;
        this.streams = channelMessage.streams;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }
}
