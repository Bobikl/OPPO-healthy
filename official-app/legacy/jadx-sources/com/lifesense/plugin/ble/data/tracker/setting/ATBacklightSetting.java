package com.lifesense.plugin.ble.data.tracker.setting;

import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.ATBacklightData;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATBacklightSetting extends LSDeviceSyncSetting {
    ATBacklightData backlight;

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (this.backlight == null) {
            return null;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) getCmd());
            byteBufferOrder.put((byte) this.backlight.getDaytimeBrightness());
            byteBufferOrder.put((byte) this.backlight.getNightBrightness());
            byteBufferOrder.put((byte) (this.backlight.isEnable() ? 1 : 0));
            byteBufferOrder.put((byte) f.a(this.backlight.getStartTime()));
            byteBufferOrder.put((byte) f.b(this.backlight.getStartTime()));
            byteBufferOrder.put((byte) f.a(this.backlight.getEndTime()));
            byteBufferOrder.put((byte) f.b(this.backlight.getEndTime()));
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public ATBacklightData getBacklight() {
        return this.backlight;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE;
        return UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE;
    }

    public void setBacklight(ATBacklightData aTBacklightData) {
        this.backlight = aTBacklightData;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATBacklightSetting{backlight=" + this.backlight + '}';
    }
}
