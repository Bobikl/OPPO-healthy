package com.lifesense.android.bluetooth.scale.parser;

import android.util.Log;
import com.lifesense.android.bluetooth.core.bean.NetstrapPacket;
import com.lifesense.android.bluetooth.core.enums.PackageType;
import com.lifesense.android.bluetooth.core.protocol.c;
import com.lifesense.android.bluetooth.core.protocol.parser.b;
import com.lifesense.android.bluetooth.core.tools.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public class a extends com.lifesense.android.bluetooth.core.protocol.parser.a {
    public b a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f8647c;
    public List<String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PackageType f8648e;
    public com.lifesense.android.bluetooth.core.protocol.frame.a f;
    public int g;

    public a(String str, b bVar) {
        this.b = str;
        this.a = bVar;
    }

    public synchronized void a(UUID uuid, byte[] bArr) {
        String strJoin;
        if (bArr == null) {
            return;
        }
        String strC = e.c(bArr);
        Log.i("onReceiveData", strC);
        if (uuid.equals(c.CHARACTERISTIC_RX_UUID)) {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            if (this.g <= 0) {
                if (CollectionUtils.isNotEmpty(this.d) || bArr.length < 4) {
                    this.d.add(strC);
                    bArr = e.b(StringUtils.join(this.d, ""));
                    if (bArr.length < 4) {
                        return;
                    }
                    List<String> list = this.d;
                    list.remove(list.size() - 1);
                }
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.put(bArr);
                this.g = byteBufferOrder.getShort(2) + 4;
                byteBufferOrder.clear();
                if (this.g > 512) {
                    this.g = 0;
                    this.d.clear();
                    return;
                }
            }
            int i = this.g;
            if (i - bArr.length < 0) {
                String strSubstring = strC.substring(0, i * 2);
                this.d.add(strSubstring);
                String strJoin2 = StringUtils.join(this.d, "");
                strJoin = strC.substring(strSubstring.length());
                byte[] bArrB = e.b(strJoin);
                this.d.clear();
                d(strJoin2);
                if (bArrB.length >= 4) {
                    ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
                    byteBufferOrder2.put(bArrB);
                    int i2 = byteBufferOrder2.getShort(2) + 4;
                    this.g = i2;
                    if (i2 > 512) {
                        this.g = 0;
                        return;
                    }
                    this.g = i2 - bArrB.length;
                    byteBufferOrder2.clear();
                    if (this.g != 0) {
                        this.d.add(strJoin);
                    }
                } else {
                    this.d.add(strJoin);
                    this.g = -1;
                }
            } else {
                this.d.add(strC);
                int length = this.g - bArr.length;
                this.g = length;
                if (length > 0) {
                    return;
                }
                this.g = 0;
                strJoin = StringUtils.join(this.d, "");
                this.d.clear();
            }
            d(strJoin);
        } else {
            com.lifesense.android.bluetooth.core.protocol.frame.a aVarA = com.lifesense.android.bluetooth.core.protocol.frame.a.a(bArr);
            if (aVarA == null) {
                return;
            }
            if (aVarA.q()) {
                if (CollectionUtils.isNotEmpty(this.f8647c)) {
                    this.f8647c.clear();
                }
                this.f8647c = new ArrayList();
                this.f = aVarA;
                this.f8648e = aVarA.k();
            }
            this.f8647c.add(aVarA.i(), aVarA.e());
            if (!aVarA.a(this.f8647c.size())) {
                return;
            }
            String strReplaceAll = StringUtils.join(this.f8647c.toArray(new String[0])).replaceAll(" ", "");
            this.f.b(strReplaceAll);
            this.f8647c.clear();
            if (this.a == null) {
                return;
            }
            this.f.w();
            Log.i("decodePackage", strReplaceAll);
            this.f8648e.handlePackage(this.a, this.b, this.f.a());
        }
    }

    public final void d(String str) {
        for (NetstrapPacket netstrapPacket : NetstrapPacket.decodePacket(e.b(str))) {
            if (netstrapPacket.getCmdId() == 4098) {
                this.a.onReceiveWifiConnectStatePackage(netstrapPacket.getConnectStatus());
            } else if (netstrapPacket.getCmdId() == 4096) {
                this.a.onReceiveWifiScanPackage(netstrapPacket.getSsid(), netstrapPacket.getBssid(), netstrapPacket.getAuthMode(), netstrapPacket.getRssi(), netstrapPacket.getStatus());
            } else if (netstrapPacket.getCmdId() == 4097) {
                this.a.onReceiveWifiScanEndPackage();
            } else if (netstrapPacket.getCmdId() == 4103) {
                this.a.onReceiveWifiConfigInfo(netstrapPacket.getConnectStatus(), netstrapPacket.getSsid());
            }
        }
    }

    public byte[] a(boolean z) {
        byte[] bArr = new byte[3];
        bArr[0] = 0;
        bArr[1] = 1;
        bArr[2] = (byte) (z ? 1 : 2);
        return bArr;
    }

    public byte[] a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(e.c(bArr));
        String strA = e.a(stringBuffer.toString());
        if (stringBuffer.length() > 36) {
            stringBuffer.append(strA);
        }
        int length = (stringBuffer.length() / 36) + (stringBuffer.length() % 36 > 0 ? 1 : 0);
        for (int i = 0; i < length; i++) {
            int i2 = i * 40;
            stringBuffer.insert(i2, e.c(new byte[]{(byte) (((length << 4) & 255) | (i & 255)), (byte) (Math.min(stringBuffer.length() - i2, 36) / 2)}));
        }
        return e.a(stringBuffer.toString().toCharArray());
    }
}
