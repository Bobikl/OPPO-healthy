package com.lifesense.plugin.ble.data.tracker.setting;

import android.text.TextUtils;
import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSAppCategory;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.ATTextMessage;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATCustomMessageSetting extends LSDeviceSyncSetting {
    private ATTextMessage appMessage;

    private ATCustomMessageSetting() {
    }

    public ATCustomMessageSetting(ATTextMessage aTTextMessage) {
        this.appMessage = aTTextMessage;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ATTextMessage aTTextMessage = this.appMessage;
        if (aTTextMessage == null || TextUtils.isEmpty(aTTextMessage.getPackageName())) {
            return null;
        }
        byte[] bArrA = a.a(this.appMessage.getPackageName() + String.valueOf((char) 0));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArrA.length + 1 + 1 + 1 + 1).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) getCmd());
        byteBufferOrder.put(LSAppCategory.All == this.appMessage.getMsgCategory() ? (byte) -1 : this.appMessage.isEnable() ? (byte) 1 : (byte) 0);
        byteBufferOrder.put((byte) f.a(this.appMessage.getMsgCategory()).getValue());
        byteBufferOrder.put((byte) bArrA.length);
        byteBufferOrder.put(bArrA);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    public ATTextMessage getAppMessage() {
        return this.appMessage;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 182;
    }

    public void setAppMessage(ATTextMessage aTTextMessage) {
        this.appMessage = aTTextMessage;
    }
}
