package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.c;
import com.lifesense.plugin.ble.data.tracker.setting.ATLanguage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATImageInfo extends ATDeviceData {
    private int algorithm;
    private int color;
    private int flag;
    private int horizontalPx;
    private int imageSize;
    private List languages;
    private int verticalPx;

    public ATImageInfo(byte[] bArr) {
        super(bArr);
    }

    private void parseSupportedLanguages(int i) {
        this.languages = new ArrayList();
        if (c.b(i, 0)) {
            this.languages.add(ATLanguage.English);
        }
        if (c.b(i, 1)) {
            this.languages.add(ATLanguage.ChineseCN);
        }
        if (c.b(i, 2)) {
            this.languages.add(ATLanguage.ChineseTW);
        }
        if (c.b(i, 3)) {
            this.languages.add(ATLanguage.Japanese);
        }
        if (c.b(i, 4)) {
            this.languages.add(ATLanguage.Korean);
        }
    }

    public int getAlgorithm() {
        return this.algorithm;
    }

    public int getColor() {
        return this.color;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getHorizontalPx() {
        return this.horizontalPx;
    }

    public int getImageSize() {
        return this.imageSize;
    }

    public List getLanguages() {
        return this.languages;
    }

    public int getVerticalPx() {
        return this.verticalPx;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.flag = toUnsignedInt(byteBufferOrder.get());
            this.horizontalPx = toUnsignedInt(byteBufferOrder.getShort());
            this.verticalPx = toUnsignedInt(byteBufferOrder.getShort());
            this.color = toUnsignedInt(byteBufferOrder.get());
            this.algorithm = toUnsignedInt(byteBufferOrder.get());
            this.imageSize = byteBufferOrder.getInt();
            parseSupportedLanguages(byteBufferOrder.getInt());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setAlgorithm(int i) {
        this.algorithm = i;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setHorizontalPx(int i) {
        this.horizontalPx = i;
    }

    public void setImageSize(int i) {
        this.imageSize = i;
    }

    public void setLanguages(List list) {
        this.languages = list;
    }

    public void setVerticalPx(int i) {
        this.verticalPx = i;
    }

    public String toString() {
        return "ATImageInfo{flag=" + this.flag + ", horizontalPx=" + this.horizontalPx + ", verticalPx=" + this.verticalPx + ", color=" + this.color + ", algorithm=" + this.algorithm + ", imageSize=" + this.imageSize + ", languages=" + this.languages + '}';
    }
}
