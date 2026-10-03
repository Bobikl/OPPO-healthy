package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATLogData extends ATDeviceData {
    private int flag;
    private List logs;

    public ATLogData(byte[] bArr) {
        super(bArr);
        this.logs = new ArrayList();
    }

    public void addLog(ATLogItem aTLogItem) {
        this.logs.add(aTLogItem);
    }

    public int getFlag() {
        return this.flag;
    }

    public List getLogs() {
        return this.logs;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        String strTrim;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 1, bArr2, 0, 4);
        int iF = a.f(bArr2);
        int i = 5;
        while (i < bArr.length) {
            byte[] bArr3 = new byte[4];
            System.arraycopy(bArr, i, bArr3, 0, 4);
            int iF2 = a.f(bArr3);
            int i2 = i + 4;
            byte b = bArr[i2];
            int iA = a.a(b);
            int i3 = i2 + 1;
            byte b2 = bArr[i3];
            int iA2 = a.a(b2);
            int i4 = i3 + 1;
            byte[] bArr4 = new byte[2];
            System.arraycopy(bArr, i4, bArr4, 0, 2);
            int iG = a.g(bArr4);
            int i5 = i4 + 2;
            if ((b ^ (b2 & 255)) == 255) {
                int i6 = i5 + iA;
                if (i6 >= bArr.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("device log size Less than content len:");
                    sb.append(iA);
                    break;
                }
                byte[] bArr5 = new byte[iA];
                System.arraycopy(bArr, i5, bArr5, 0, iA);
                try {
                    strTrim = new String(bArr5, "UTF-8").trim();
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                    strTrim = "";
                }
                ATLogItem aTLogItem = new ATLogItem();
                aTLogItem.setUtc(iF2);
                aTLogItem.setLen(iA);
                aTLogItem.setInvertLen(iA2);
                aTLogItem.setErrorCode(iG);
                aTLogItem.setErrorContent(strTrim);
                addLog(aTLogItem);
                i = i6;
            } else {
                break;
            }
        }
        setFlag(iF);
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public String toString() {
        return "ATLogData{flag=" + this.flag + ", logs=" + this.logs + '}';
    }
}
