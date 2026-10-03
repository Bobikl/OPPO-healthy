package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.tracker.setting.ATWatchPage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATHotkeyPage extends ATConfigItem {
    private ATWatchPage page;

    public ATHotkeyPage(ATWatchPage aTWatchPage) {
        this.page = aTWatchPage;
        this.type = 4;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return new byte[]{(byte) this.type, 1, (byte) this.page.getCommand()};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public ATWatchPage getPage() {
        return this.page;
    }

    public void setPage(ATWatchPage aTWatchPage) {
        this.page = aTWatchPage;
    }

    public String toString() {
        return "ATHotkeyPage{page=" + this.page + ", type=" + this.type + '}';
    }

    public ATHotkeyPage(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.type = 4;
        try {
            this.page = ATWatchPage.getPage(a.a(ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).get()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
