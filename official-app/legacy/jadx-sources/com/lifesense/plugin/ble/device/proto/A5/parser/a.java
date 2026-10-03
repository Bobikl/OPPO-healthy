package com.lifesense.plugin.ble.device.proto.A5.parser;

import com.lifesense.plugin.ble.device.proto.h;
import com.lifesense.plugin.ble.device.proto.i;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class a extends i {
    private h a;
    private com.lifesense.plugin.ble.device.proto.g b;

    public static com.lifesense.plugin.ble.device.proto.g a(byte[] bArr, com.lifesense.plugin.ble.device.proto.g gVar) {
        if (bArr != null && bArr.length > 0) {
            try {
                int iA = com.lifesense.plugin.ble.c.a.a(bArr[0]);
                int iA2 = com.lifesense.plugin.ble.c.a.a(bArr[1]);
                if (iA2 == 1) {
                    gVar = new com.lifesense.plugin.ble.device.proto.g();
                    gVar.b(Integer.toHexString(iA));
                    gVar.b(iA2);
                    gVar.d(1);
                    int iA3 = com.lifesense.plugin.ble.c.a.a(bArr[2]);
                    int i = iA3 > bArr.length ? 17 : iA3;
                    gVar.a(iA3);
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 3, bArr2, 0, i);
                    gVar.a(bArr2);
                    gVar.a(Integer.toHexString(com.lifesense.plugin.ble.c.a.a(bArr2[0])));
                } else if (gVar != null && gVar.k() != null) {
                    gVar.d(gVar.i() + 1);
                    int length = bArr.length - 2;
                    int length2 = gVar.k().length + length;
                    if (length2 > gVar.c()) {
                        length = gVar.c() - gVar.k().length;
                        length2 = gVar.c();
                    }
                    byte[] bArr3 = new byte[length2];
                    System.arraycopy(gVar.k(), 0, bArr3, 0, gVar.k().length);
                    System.arraycopy(bArr, 2, bArr3, gVar.k().length, length);
                    gVar.a(bArr3);
                }
                if (a(gVar)) {
                    return gVar;
                }
                return null;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.lifesense.plugin.ble.device.proto.i
    public void decodePackage(UUID uuid, byte[] bArr, String str) {
        String str2;
        if (bArr == null || bArr.length < 3) {
            str2 = "failed to parse device's upgrade packet,is nil..." + com.lifesense.plugin.ble.c.b.a(uuid);
        } else {
            try {
                int iA = com.lifesense.plugin.ble.c.a.a(bArr[0]);
                int iA2 = com.lifesense.plugin.ble.c.a.a(bArr[1]);
                if (iA2 == 1) {
                    com.lifesense.plugin.ble.device.proto.g gVar = new com.lifesense.plugin.ble.device.proto.g();
                    this.b = gVar;
                    gVar.b(Integer.toHexString(iA));
                    this.b.b(iA2);
                    this.b.d(1);
                    int iA3 = com.lifesense.plugin.ble.c.a.a(bArr[2]);
                    int i = iA3 > bArr.length ? 17 : iA3;
                    this.b.a(iA3);
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(bArr, 3, bArr2, 0, i);
                    this.b.a(bArr2);
                    this.b.a(Integer.toHexString(com.lifesense.plugin.ble.c.a.a(bArr2[0])));
                } else {
                    com.lifesense.plugin.ble.device.proto.g gVar2 = this.b;
                    if (gVar2 != null && gVar2.k() != null) {
                        this.b.d(this.b.i() + 1);
                        int length = bArr.length - 2;
                        int length2 = this.b.k().length + length;
                        if (length2 > this.b.c()) {
                            length = this.b.c() - this.b.k().length;
                            length2 = this.b.c();
                        }
                        byte[] bArr3 = new byte[length2];
                        System.arraycopy(this.b.k(), 0, bArr3, 0, this.b.k().length);
                        System.arraycopy(bArr, 2, bArr3, this.b.k().length, length);
                        this.b.a(bArr3);
                    }
                }
                if (a(this.b)) {
                    h hVar = this.a;
                    if (hVar != null) {
                        hVar.a((String) null, (Object) this.b);
                    }
                    this.b = new com.lifesense.plugin.ble.device.proto.g();
                    return;
                }
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                str2 = "failed to parse device's upgrade packet.has exception...";
            }
        }
        printLogMessage(getGeneralLogInfo(null, str2, com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
    }

    private static boolean a(com.lifesense.plugin.ble.device.proto.g gVar) {
        return gVar != null && gVar.k() != null && gVar.k().length > 0 && gVar.k().length == gVar.c();
    }
}
