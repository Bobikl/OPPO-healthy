package com.heytap.accessory.transport;

import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import com.oplus.aiunit.vision.oei;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class c {
    public static final String a = "c";

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.heytap.accessory.misc.constants.a.values().length];
            a = iArr;
            try {
                iArr[com.heytap.accessory.misc.constants.a.AFP_CONTROL_FRAME_IMMEDIATE_ACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.heytap.accessory.misc.constants.a.AFP_CONTROL_FRAME_BLOCK_ACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.heytap.accessory.misc.constants.a.AFP_CONTROL_FRAME_NAK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static com.heytap.accessory.misc.utils.d.b a(Buffer buffer) {
        byte[] buffer2 = buffer.getBuffer();
        if (buffer2 == null) {
            throw new AssertionError();
        }
        byte b = buffer2[0];
        byte b2 = (byte) ((b & 224) >> 5);
        if (b2 != 0) {
            com.heytap.accessory.base.logging.a.b(a, "Unsupported protocol version (" + ((int) b2) + ")");
            return null;
        }
        byte b3 = (byte) ((b & 16) >> 4);
        byte b4 = buffer2[1];
        long j2 = (((long) (b & 15)) << 6) | (((long) (b4 & 252)) >> 2);
        byte b5 = (byte) (b4 & 3);
        com.heytap.accessory.base.logging.a.a(a, "parseProtocolHeader frameType:  " + ((int) b3) + " sessionId:  " + j2 + " fragmentation:  " + ((int) b5));
        com.heytap.accessory.misc.utils.d.b bVar = new com.heytap.accessory.misc.utils.d.b();
        bVar.d = b3;
        bVar.g = j2;
        bVar.f2613c = b5;
        if (buffer.getPayloadLength() != -1) {
            bVar.f2614e = com.heytap.accessory.message.a.b(j2, buffer, 2);
        }
        return bVar;
    }

    public static void a(com.heytap.accessory.misc.utils.d.b bVar, int i) {
        if (i == 0) {
            bVar.f = -1L;
            return;
        }
        com.heytap.accessory.message.a aVar = bVar.f2614e;
        int offset = aVar.f().getOffset() - 2;
        long jD = (aVar.d(offset + 1) & 255) | ((aVar.d(offset) & 255) << 8);
        aVar.e(2);
        bVar.f = jD;
        bVar.f2614e = aVar;
    }

    public static boolean a(com.heytap.accessory.misc.utils.d.b bVar) {
        com.heytap.accessory.message.a aVar = bVar.f2614e;
        int i = 0;
        com.heytap.accessory.misc.constants.a aVarA = com.heytap.accessory.misc.constants.a.a(aVar.d(0));
        ArrayList arrayList = new ArrayList();
        int i2 = a.a[aVarA.ordinal()];
        int i3 = 2;
        if (i2 == 1 || i2 == 2) {
            arrayList.add(new com.heytap.accessory.misc.utils.d.a((aVar.d(2) & 255) | ((aVar.d(1) & 255) << 8)));
        } else {
            if (i2 != 3) {
                com.heytap.accessory.base.logging.a.b(a, "Control Type not supported !");
                return false;
            }
            int iD = aVar.d(1) & 255;
            if ((((long) iD) * 2 * 2) + 2 != aVar.g()) {
                String str = a;
                com.heytap.accessory.base.logging.a.a(str, "parseControlPayload: scrIndex2 = 2 noOfHoles = " + iD + " msgPayloadLength = " + aVar.g());
                com.heytap.accessory.base.logging.a.b(str, "Control Frame is not proper, Rejecting ..");
                return false;
            }
            while (i < iD) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                long jD = ((aVar.d(i3) & 255) << 8) | (aVar.d(i4) & 255);
                int i6 = i5 + 1;
                arrayList.add(new com.heytap.accessory.misc.utils.d.a(jD, (aVar.d(i6) & 255) | ((aVar.d(i5) & 255) << 8)));
                i++;
                i3 = i6 + 1;
            }
        }
        bVar.b = aVarA;
        bVar.a = arrayList;
        return true;
    }

    public static boolean a(com.heytap.accessory.message.a aVar, byte b, boolean z) {
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "composeDataFrame: fragmentMode = " + ((int) b) + " isSeqNumSupported = " + z);
        if (aVar != null) {
            if (a((byte) 0, (byte) 0, b, z, aVar)) {
                return true;
            }
            com.heytap.accessory.base.logging.a.b(str, "Error in forming the Protocol Header. Returning..");
            return false;
        }
        throw new AssertionError();
    }

    public static com.heytap.accessory.message.a a(long j2, long j3, com.heytap.accessory.misc.constants.a aVar, List<com.heytap.accessory.misc.utils.d.a> list) {
        com.heytap.accessory.message.a aVarB;
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "composeControlFrame: accessoryId = " + j2 + " sessionId = " + j3 + " controlType = " + aVar);
        int size = list.size();
        if (aVar == com.heytap.accessory.misc.constants.a.AFP_CONTROL_FRAME_NAK) {
            aVarB = com.heytap.accessory.message.a.b(j2, j3, (size * 2 * 2) + 2);
            if (aVarB == null) {
                com.heytap.accessory.base.logging.a.b(str, "Failed creating BaseMessage by Invalid PayloadLength! - 1");
                return null;
            }
            com.heytap.accessory.message.e eVar = new com.heytap.accessory.message.e(aVarB);
            try {
                eVar.a(aVar.a());
                eVar.a((byte) size);
                int i = 0;
                do {
                    com.heytap.accessory.misc.utils.d.a aVar2 = list.get(i);
                    eVar.a((int) aVar2.b(), 2);
                    eVar.a((int) aVar2.a(), 2);
                    i++;
                } while (i < size);
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.e(a, "composeControlFrame Exception1:" + e2);
            }
        } else {
            if (size != 1) {
                com.heytap.accessory.base.logging.a.b(str, "Control Payload is not proper!! seqNumCount is " + size);
                return null;
            }
            long jB = list.get(0).b();
            aVarB = com.heytap.accessory.message.a.b(j2, j3, (size * 2) + 1);
            if (aVarB == null) {
                com.heytap.accessory.base.logging.a.b(str, "Failed creating BaseMessage by Invalid PayloadLength! - 1");
                return null;
            }
            try {
                com.heytap.accessory.message.e eVar2 = new com.heytap.accessory.message.e(aVarB);
                aVarB.a(0, aVar.a());
                eVar2.a(aVar.a());
                eVar2.a((int) jB, 2);
            } catch (Exception e3) {
                com.heytap.accessory.base.logging.a.e(a, "composeControlFrame Exception2:" + e3);
            }
        }
        if (a((byte) 0, (byte) 1, (byte) 0, false, aVarB)) {
            return aVarB;
        }
        com.heytap.accessory.base.logging.a.b(a, "Error in forming the Protocol Header. Returning..");
        return null;
    }

    public static boolean a(byte b, byte b2, byte b3, boolean z, com.heytap.accessory.message.a aVar) {
        if (aVar != null && aVar.f() != null && aVar.g() > 0) {
            long j2 = aVar.j();
            if (j2 == -1) {
                com.heytap.accessory.base.logging.a.b(a, "Invalid message parameters!");
                return false;
            }
            if (aVar.c(z ? 4 : 2) < 0) {
                com.heytap.accessory.base.logging.a.b(a, "Invalid message parameters! TL header offset!");
                return false;
            }
            byte b4 = (byte) (((long) ((byte) (((b2 << 4) & 16) | ((byte) ((b << 5) & oei.TAI_CHI))))) | (((960 & j2) >> 6) & 15));
            aVar.a(0, b4);
            byte b5 = (byte) ((b3 & 3) | ((byte) (((63 & j2) << 2) & 252)));
            aVar.a(1, b5);
            String str = "formProtocolHeader, version:" + ((int) b) + ", frameType:" + ((int) b2) + ", fragmentation:" + ((int) b3) + ", isSeqNumSupported:" + z + ", sessionId:" + j2 + ", headFirst:" + HexUtils.byteToHexStr(b4) + ", headSecond:" + HexUtils.byteToHexStr(b5) + ", seq:" + aVar.i();
            if (z) {
                long jI = aVar.i();
                byte b6 = (byte) ((jI >> 8) & 255);
                aVar.a(2, b6);
                byte b7 = (byte) (jI & 255);
                aVar.a(3, b7);
                str = str + ", head3rd:" + HexUtils.byteToHexStr(b6) + "head4th" + HexUtils.byteToHexStr(b7);
            }
            com.heytap.accessory.base.logging.a.a(a, str);
            return true;
        }
        com.heytap.accessory.base.logging.a.b(a, "Error while forming the protocol hearder!");
        return false;
    }
}
