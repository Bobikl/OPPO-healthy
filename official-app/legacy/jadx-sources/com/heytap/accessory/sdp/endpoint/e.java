package com.heytap.accessory.sdp.endpoint;

import com.heytap.accessory.utils.buffer.Buffer;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class e {
    public static final String a = e.class.getSimpleName() + " - epitrack";

    public static com.heytap.accessory.message.a a(d dVar, int i) {
        return b(dVar, i, 3);
    }

    public static com.heytap.accessory.message.a b(d dVar, int i, int i2) {
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "Composing Probe Message:" + dVar);
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(i);
        try {
            eVarA.a((byte) i2);
            eVarA.a(dVar.l(), 2);
            if (dVar.j() != null) {
                eVarA.a(dVar.j(), 36);
                return eVarA.a();
            }
            com.heytap.accessory.base.logging.a.b(str, "Peer Id is null ! Returning..");
            eVarA.b();
            return null;
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, "composeProbeMessageInternal error," + e2);
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(d dVar, int i, boolean z, int i2) {
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "composeOfferMessage length: " + i2);
        com.heytap.accessory.message.e eVarA = com.heytap.accessory.message.e.a(i2);
        try {
            eVarA.a((byte) i);
            eVarA.a(dVar.l(), 2);
            if (dVar.j() == null) {
                com.heytap.accessory.base.logging.a.b(str, "Peer Id is null ! Returning..");
                eVarA.b();
                return null;
            }
            eVarA.a(dVar.j(), 36);
            eVarA.a(a(dVar));
            a(dVar, eVarA, z);
            return eVarA.a();
        } catch (com.heytap.accessory.message.c e2) {
            com.heytap.accessory.base.logging.a.e(a, "composeOfferMessage error," + e2);
            return null;
        }
    }

    public static d b(Buffer buffer, int i) {
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "parseProbeMessage minPayloadLen: " + i);
        if (buffer.getLength() < i) {
            com.heytap.accessory.base.logging.a.b(str, "parseProbeMessage: improper payload with length: " + buffer.getLength());
            return null;
        }
        d dVar = new d();
        com.heytap.accessory.message.d dVarA = com.heytap.accessory.message.d.a(-1, buffer, 0);
        try {
            dVar.c(dVarA.a("MessageType"));
            dVar.d(dVarA.b(2, "ProtocolVersion"));
            dVar.c(dVarA.d(36, "PeerId"));
            com.heytap.accessory.base.logging.a.a(str, "parse ProbeMessage: " + dVar);
            return dVar;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.a(a, e2);
            return null;
        }
    }

    public static com.heytap.accessory.message.a a(d dVar, int i, int i2) {
        com.heytap.accessory.base.logging.a.a(a, "compose probe answer:, statusCode: " + i + ", selfParams: " + dVar);
        return a(dVar, i, i2, 4);
    }

    public static com.heytap.accessory.message.a a(d dVar, int i, int i2, int i3) {
        com.heytap.accessory.message.a aVarB = com.heytap.accessory.message.a.b(i2);
        try {
            com.heytap.accessory.message.e eVar = new com.heytap.accessory.message.e(aVarB);
            eVar.a((byte) i3);
            eVar.a(dVar.l(), 2);
            eVar.a((byte) i);
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.e(a, "composeConfirmMessageInternal error," + e2);
        }
        return aVarB;
    }

    public static void b(d dVar) {
        if (dVar.a() == 0) {
            dVar.a(131072);
        }
        if (dVar.n() == 0) {
            dVar.f(65525);
        }
        if (dVar.g() == 0) {
            dVar.c(1022);
        }
        if (dVar.m() == 0) {
            dVar.e(10000);
        }
        if (dVar.r() == 0) {
            dVar.h(10);
        }
        if (dVar.k() == null || dVar.k().isEmpty()) {
            dVar.d("OPLUS");
        }
        if (dVar.s() == null || dVar.s().isEmpty()) {
            dVar.e("OPLUS");
        }
        if (dVar.c() == -1) {
            dVar.b(1);
        }
    }

    public static d a(Buffer buffer, boolean z, int i) {
        int length = buffer.getLength();
        if (length < i) {
            com.heytap.accessory.base.logging.a.b(a, "parseOfferMessage: improper payload with length: " + length);
            return null;
        }
        d dVar = new d();
        com.heytap.accessory.message.d dVarA = com.heytap.accessory.message.d.a(-1, buffer, 0);
        try {
            dVar.c(dVarA.a("MessageType"));
            dVar.d(dVarA.b(2, "ProtocolVersion"));
            dVar.c(dVarA.d(36, "PeerId"));
            a(dVar, dVarA.a("SapLayerModes"));
            a(dVar, dVarA, z);
            b(dVar);
            com.heytap.accessory.base.logging.a.a(a, "[epiparamtrack]parse Offer(answer) Message , minPayloadLen: " + i + ", EndpointInfoParams: " + dVar);
            return dVar;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.a(a, e2);
            return null;
        }
    }

    public static d a(Buffer buffer, int i) {
        String str = a;
        com.heytap.accessory.base.logging.a.a(str, "parseConfirmMessage minPayloadLen: " + i);
        com.heytap.accessory.message.d dVarA = com.heytap.accessory.message.d.a(-1, buffer, 0);
        if (buffer.getLength() < i) {
            com.heytap.accessory.base.logging.a.b(str, "parseConfirmMessage: improper payload with length: " + buffer.getLength());
            return null;
        }
        d dVar = new d();
        try {
            dVar.c(dVarA.a("MessageType"));
            dVar.d(dVarA.b(2, "ProtocolVersion"));
            dVar.e(dVarA.a("Status"));
            com.heytap.accessory.base.logging.a.a(str, "[epiparamtrack]parse probe answer peerParams: " + dVar + ", minPayloadLen: " + i);
            return dVar;
        } catch (Exception e2) {
            com.heytap.accessory.base.logging.a.a(a, e2);
            return null;
        }
    }

    public static void a(d dVar, com.heytap.accessory.message.e eVar, boolean z) throws com.heytap.accessory.message.c {
        int i;
        String str = a;
        com.heytap.accessory.base.logging.a.d(str, "Composing Feature Parameters ... " + dVar.toString());
        List<Integer> listI = dVar.i();
        if (listI != null && !listI.isEmpty()) {
            int size = listI.size();
            eVar.a((byte) size);
            com.heytap.accessory.base.logging.a.d(str, "No. of Negotiated Parameters: " + size + ", keys: " + listI);
            Iterator<Integer> it = listI.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                eVar.a((byte) iIntValue);
                switch (iIntValue) {
                    case 1:
                        eVar.a(dVar.a(), 4);
                        break;
                    case 2:
                        eVar.a(dVar.n(), 2);
                        break;
                    case 3:
                        eVar.a(dVar.g(), 2);
                        break;
                    case 4:
                        eVar.a(dVar.m(), 2);
                        break;
                    case 5:
                        eVar.a(dVar.r(), 2);
                        break;
                    case 6:
                        String strK = dVar.k();
                        int length = strK.length();
                        i = length <= 32 ? length : 32;
                        eVar.a((byte) i);
                        eVar.a(strK, i);
                        break;
                    case 7:
                        String strS = dVar.s();
                        int length2 = strS.length();
                        i = length2 <= 32 ? length2 : 32;
                        eVar.a((byte) i);
                        eVar.a(strS, i);
                        break;
                    case 8:
                        String strE = dVar.e();
                        int length3 = strE.length();
                        i = length3 <= 32 ? length3 : 32;
                        eVar.a((byte) i);
                        eVar.a(strE, i);
                        break;
                    case 10:
                        eVar.a(dVar.d());
                        break;
                    case 11:
                        eVar.a((byte) (dVar.c() & 255));
                        break;
                    case 12:
                        eVar.a((byte) (dVar.o() & 255));
                        break;
                    case 13:
                        eVar.a(dVar.h());
                        break;
                    case 14:
                        if (!z) {
                            continue;
                        } else {
                            String strF = dVar.f();
                            com.heytap.accessory.base.logging.a.d(a, "Composing wifi address ... " + strF);
                            String[] strArrSplit = strF.split(":");
                            if (strArrSplit.length != 6) {
                                throw new com.heytap.accessory.message.c("not proper wifi address");
                            }
                            for (String str2 : strArrSplit) {
                                eVar.a((byte) Integer.parseInt(str2, 16));
                            }
                        }
                        break;
                }
            }
            return;
        }
        eVar.a((byte) 0);
    }

    public static void a(d dVar, com.heytap.accessory.message.d dVar2, boolean z) throws com.heytap.accessory.message.c {
        ArrayList arrayList = new ArrayList();
        for (byte bA = dVar2.a("featureParamsCount"); bA > 0; bA = (byte) (bA - 1)) {
            byte bA2 = dVar2.a("parametersKey");
            arrayList.add(Byte.valueOf(bA2));
            boolean z2 = false;
            switch (bA2) {
                case 1:
                    dVar.a(dVar2.b(4, "APDUSize"));
                    break;
                case 2:
                    dVar.f(dVar2.b(2, "SSDUSize"));
                    break;
                case 3:
                    dVar.c(dVar2.b(2, "MaxSessions"));
                    break;
                case 4:
                    dVar.e(dVar2.b(2, "SLTimeout"));
                    break;
                case 5:
                    dVar.h(dVar2.b(2, "TLWindowSize"));
                    break;
                case 6:
                    byte bA3 = dVar2.a("productIdLength");
                    if (bA3 > 0) {
                        dVar.d(dVar2.d(bA3, Fields.PRODUCT_ID_FIELD));
                    }
                    break;
                case 7:
                    byte bA4 = dVar2.a("manufacturerIdLength");
                    if (bA4 > 0) {
                        dVar.e(dVar2.d(bA4, "ManufacturerId"));
                    }
                    break;
                case 8:
                    byte bA5 = dVar2.a("friendlyNameLength");
                    if (bA5 > 0) {
                        dVar.a(dVar2.d(bA5, "FriendlyName"));
                    }
                    break;
                case 9:
                default:
                    com.heytap.accessory.base.logging.a.b(a, "Error: Unknown parameter " + ((int) bA2));
                    z2 = true;
                    break;
                case 10:
                    dVar.b(dVar2.a("DevCategory"));
                    break;
                case 11:
                    dVar.b((int) dVar2.a("CompressionBit"));
                    break;
                case 12:
                    dVar.g(dVar2.a("ServiceProfileCount") & 255);
                    break;
                case 13:
                    dVar.d(dVar2.a("DynamicConnection"));
                    break;
                case 14:
                    com.heytap.accessory.base.logging.a.d(a, "Parsing wifi address ... ");
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 6; i++) {
                        sb.append(String.format("%02x", Integer.valueOf(dVar2.a("part of address" + i) & 255)));
                        if (i != 5) {
                            sb.append(":");
                        }
                    }
                    String string = sb.toString();
                    dVar.b(string);
                    com.heytap.accessory.base.logging.a.d(a, "Parsing wifi address result:" + string);
                    break;
            }
            if (z2) {
                com.heytap.accessory.base.logging.a.a(a, "Parsing Feature Parameters, featureParamsCount: " + ((int) bA) + ", parsedKey:" + arrayList + ", parse AFPD=" + dVar.toString());
            }
        }
        com.heytap.accessory.base.logging.a.a(a, "Parsing Feature Parameters, featureParamsCount: " + ((int) bA) + ", parsedKey:" + arrayList + ", parse AFPD=" + dVar.toString());
    }

    public static byte a(d dVar) {
        byte b = (byte) (dVar.b() | (dVar.q() << 4));
        com.heytap.accessory.base.logging.a.d(a, "Combined CL/TL Modes : " + ((int) b));
        return b;
    }

    public static void a(d dVar, byte b) {
        byte b2 = (byte) (b & 3);
        byte b3 = (byte) ((b >> 4) & 7);
        com.heytap.accessory.base.logging.a.d(a, "CLMode: " + ((int) b2) + " TLMode: " + ((int) b3));
        dVar.a(b2);
        dVar.f(b3);
    }
}
