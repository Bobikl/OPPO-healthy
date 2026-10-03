package com.lifesense.plugin.ble.device.proto.A5.parser;

import android.annotation.SuppressLint;
import com.heytap.connect.cipher.AESUtil;
import com.lifesense.plugin.ble.device.proto.h;
import com.lifesense.plugin.ble.device.proto.i;
import com.lifesense.plugin.ble.device.proto.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"UseSparseArrays"})
public class A5ProtoDecoder extends i {
    private static final String HEADER = "FE01";
    private static final String TAG = "A5ProtoDecoder";
    private String currentDevieMacAddress;
    private com.lifesense.plugin.ble.device.proto.g currentFrameDataPackage;
    private h dataPackageHandlerListener;
    private int dataSize;
    private int frameCount;
    private com.lifesense.plugin.ble.device.proto.g headerDataPackage;
    private e currentDataPackageStyle = e.UNKNOWN;
    private Map dataPackageMap = new HashMap();
    private HashMap dataPackagelist = new HashMap();
    private String currentPackageSerialNumber = "";
    private int totalPacketLength = 0;
    private StringBuffer receiveData = new StringBuffer();
    private boolean isFirst = true;

    public A5ProtoDecoder(String str, h hVar) {
        this.currentDevieMacAddress = str;
        this.dataPackageHandlerListener = hVar;
    }

    @SuppressLint({"DefaultLocale"})
    private String byteToHexString(byte[] bArr) {
        StringBuilder sb;
        String string = "";
        if (bArr == null) {
            return "";
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb = new StringBuilder();
                sb.append(string);
                string = "0";
            } else {
                sb = new StringBuilder();
            }
            sb.append(string);
            sb.append(hexString);
            string = sb.toString();
        }
        return string.toUpperCase().trim();
    }

    private void callbackParseResults(com.lifesense.plugin.ble.device.proto.g gVar) {
        if (gVar == null || this.dataPackageHandlerListener == null) {
            return;
        }
        try {
            com.lifesense.plugin.ble.device.proto.g gVar2 = new com.lifesense.plugin.ble.device.proto.g();
            gVar2.c(gVar.f());
            gVar2.d(gVar.g());
            gVar2.c(gVar.e());
            gVar2.b(gVar.d());
            gVar2.a(gVar.a());
            gVar2.b(gVar.b());
            gVar2.a(gVar.c());
            gVar2.d(gVar.i());
            gVar2.e(gVar.j());
            byte[] bArrB = com.lifesense.plugin.ble.c.a.b(gVar2.f());
            if (bArrB != null && bArrB.length > 2) {
                int length = bArrB.length - 2;
                byte[] bArr = new byte[length];
                System.arraycopy(bArrB, 2, bArr, 0, length);
                gVar2.a(bArr);
            }
            gVar2.a(checkCRC32Equality(gVar2.g(), getCRCResult(gVar2.f())));
            if (this.currentDataPackageStyle == e.LOGIN_REQUEST_PACKAGE) {
                this.dataPackageHandlerListener.b(this.currentDevieMacAddress, gVar2);
            } else {
                this.dataPackageHandlerListener.a(this.currentDevieMacAddress, gVar2);
            }
            HashMap map = this.dataPackagelist;
            if (map != null) {
                map.clear();
            }
            Map map2 = this.dataPackageMap;
            if (map2 != null) {
                map2.clear();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            printLogMessage(getGeneralLogInfo(null, "callback parse results has exception >>" + e2.toString() + "; data=" + gVar.toString(), com.lifesense.plugin.ble.b.a.a.Warning_Message, null, true));
        }
    }

    private byte charToByte(char c2) {
        return (byte) AESUtil.HEX.indexOf(c2);
    }

    private boolean checkCRC32Equality(String str, String str2) {
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    private boolean checkDataPackageIntegrity(com.lifesense.plugin.ble.device.proto.g gVar) {
        if (gVar != null) {
            int iD = gVar.d();
            int i = this.frameCount;
            if (iD == i && i == getDataPackageCount(this.dataPackageMap)) {
                return true;
            }
            int i2 = this.frameCount;
            if (iD < i2 && i2 == getDataPackageCount(this.dataPackageMap)) {
                return true;
            }
        }
        return false;
    }

    private long crc32(byte[] bArr) {
        long[] jArr = new long[256];
        init_crc_table(jArr);
        long j2 = 0;
        for (byte b : bArr) {
            j2 = (j2 >> 8) ^ jArr[(int) ((((long) b) ^ j2) & 255)];
        }
        return j2;
    }

    private byte[] decodeHex(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new RuntimeException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int digit = toDigit(cArr[i], i) << 4;
            int i3 = i + 1;
            int digit2 = digit | toDigit(cArr[i3], i3);
            i = i3 + 1;
            bArr[i2] = (byte) (digit2 & 255);
            i2++;
        }
        return bArr;
    }

    public static List formatIncomingCallMessage(String str) {
        try {
            byte[] bArrA = com.lifesense.plugin.ble.c.a.a(str);
            if (bArrA != null && bArrA.length > 0) {
                if (bArrA.length > 249) {
                    byte[] bArr = new byte[249];
                    System.arraycopy(bArrA, 0, bArr, 0, 249);
                    bArrA = bArr;
                }
                int length = bArrA.length + 1 + 1 + 2;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                ByteBuffer byteBufferOrder = byteBufferAllocate.order(byteOrder);
                byteBufferOrder.put((byte) 1);
                byteBufferOrder.put((byte) 0);
                byteBufferOrder.put(bArrA);
                byte[] bArrCopyOf = Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
                int iL = com.lifesense.plugin.ble.c.a.l(bArrCopyOf);
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(length + 1).order(byteOrder);
                byteBufferOrder2.put((byte) length);
                byteBufferOrder2.put(bArrCopyOf);
                byteBufferOrder2.putShort((short) iL);
                ArrayList arrayListA = com.lifesense.plugin.ble.c.a.a(Arrays.copyOf(byteBufferOrder2.array(), byteBufferOrder2.position()), 19);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                while (i < arrayListA.size()) {
                    byte[] bArr2 = (byte[]) arrayListA.get(i);
                    byte[] bArr3 = new byte[bArr2.length + 1];
                    i++;
                    bArr3[0] = (byte) i;
                    System.arraycopy(bArr2, 0, bArr3, 1, bArr2.length);
                    arrayList.add(bArr3);
                }
                return arrayList;
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"DefaultLocale"})
    private static String formatWithZero(String str, int i) {
        String str2 = "";
        for (int i2 = 0; i2 < i - str.length(); i2++) {
            str2 = str2 + "0";
        }
        return str2 + str;
    }

    @SuppressLint({"DefaultLocale"})
    private String getCRCResult(String str) {
        return formatWithZero(Long.toHexString(crc32(hexStringToBinary(str.replace(" ", "").toUpperCase()))), 8);
    }

    private int getDataPackageCount(Map map) {
        int size = 0;
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                HashMap map2 = (HashMap) ((Map.Entry) it.next()).getValue();
                if (map2 != null) {
                    size = map2.size();
                    Iterator it2 = map2.values().iterator();
                    while (it2.hasNext()) {
                        if (((com.lifesense.plugin.ble.device.proto.g) it2.next()) == null) {
                            size--;
                        }
                    }
                }
            }
        }
        return size;
    }

    private String getPacketContent(Map map) {
        if (map == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = map.entrySet().iterator();
        int iC = 0;
        while (it.hasNext()) {
            HashMap map2 = (HashMap) ((Map.Entry) it.next()).getValue();
            if (map2 != null) {
                for (int i = 0; i < map2.size(); i++) {
                    com.lifesense.plugin.ble.device.proto.g gVar = (com.lifesense.plugin.ble.device.proto.g) map2.get(Integer.valueOf(i));
                    if (gVar != null) {
                        if (gVar.b() != null && gVar.b().length() > 0) {
                            iC = gVar.c();
                        }
                        if (gVar.f() != null && gVar.f().length() > 0) {
                            stringBuffer.append(gVar.f());
                        }
                    }
                }
            }
        }
        String strReplace = stringBuffer.toString().replace(" ", "");
        if (iC <= 0) {
            return strReplace;
        }
        int i2 = (iC - 4) * 2;
        String strSubstring = strReplace.substring(0, i2 + 8);
        this.headerDataPackage.d(strReplace.substring(strSubstring.length() - 8, strSubstring.length()));
        return strReplace.substring(0, i2);
    }

    @SuppressLint({"DefaultLocale"})
    private byte[] hexStringToBinary(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (charToByte(charArray[i2 + 1]) | (charToByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    private void init_crc_table(long[] jArr) {
        for (int i = 0; i < 256; i++) {
            long j2 = i;
            for (int i2 = 0; i2 < 8; i2++) {
                j2 = (j2 & 1) == 1 ? (j2 >> 1) ^ 3988292384L : j2 >> 1;
            }
            jArr[i] = j2;
        }
    }

    private String isContainsCommandVersion(byte[] bArr, String str) {
        if (bArr != null && str != null && str.length() > 0) {
            byte[] bArr2 = new byte[2];
            System.arraycopy(bArr, 4, bArr2, 0, 2);
            String strByteToHexString = byteToHexString(bArr2);
            if (strByteToHexString != null && str.equalsIgnoreCase(strByteToHexString)) {
                return strByteToHexString;
            }
        }
        return null;
    }

    private boolean isExistErrorDataPackage(String str) {
        Map map = this.dataPackageMap;
        return (map == null || map.isEmpty() || this.dataPackageMap.containsKey(str)) ? false : true;
    }

    public static int parsePackageCommand(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            return Integer.parseInt(str, 16);
        } catch (Exception e2) {
            e2.printStackTrace();
            return 255;
        }
    }

    @Deprecated
    private com.lifesense.plugin.ble.device.proto.g parseToPedometerDataPackage(byte[] bArr, int i, int i2, String str) {
        byte[] bArr2;
        String strByteToHexString;
        if (bArr == null) {
            return null;
        }
        com.lifesense.plugin.ble.device.proto.g gVar = new com.lifesense.plugin.ble.device.proto.g();
        int i3 = 0;
        if (!com.lifesense.plugin.ble.c.c.f(bArr)) {
            gVar.b(Integer.parseInt(byteToHexString(new byte[]{bArr[0]}), 16));
            int length = bArr.length - 1;
            byte[] bArr3 = new byte[length];
            while (i3 < length) {
                int i4 = i3 + 1;
                bArr3[i3] = bArr[i4];
                i3 = i4;
            }
            gVar.c(byteToHexString(bArr3));
            gVar.c(length);
            return gVar;
        }
        String strByteToHexString2 = byteToHexString(new byte[]{bArr[0], bArr[1]});
        String strByteToHexString3 = byteToHexString(new byte[]{bArr[2]});
        String strByteToHexString4 = byteToHexString(new byte[]{bArr[3]});
        String strByteToHexString5 = byteToHexString(new byte[]{bArr[4]});
        int length2 = ((bArr.length - 2) - 1) - 1;
        if (Integer.parseInt(strByteToHexString3, 16) <= length2) {
            bArr2 = new byte[Integer.parseInt(strByteToHexString3, 16)];
            if (Integer.parseInt(strByteToHexString3, 16) == length2) {
                strByteToHexString = byteToHexString(new byte[]{bArr[bArr.length - 4], bArr[bArr.length - 3], bArr[bArr.length - 2], bArr[bArr.length - 1]});
            } else {
                int i5 = length2 - Integer.parseInt(strByteToHexString3, 16);
                strByteToHexString = byteToHexString(new byte[]{bArr[(bArr.length - 4) - i5], bArr[(bArr.length - 3) - i5], bArr[(bArr.length - 2) - i5], bArr[(bArr.length - 1) - i5]});
            }
            gVar.d(strByteToHexString);
        } else {
            bArr2 = new byte[((bArr.length - 2) - 1) - 1];
        }
        while (i3 < bArr2.length) {
            bArr2[i3] = bArr[i3 + 4];
            i3++;
        }
        String strByteToHexString6 = byteToHexString(bArr2);
        gVar.b(strByteToHexString2);
        gVar.a(Integer.parseInt(strByteToHexString3, 16));
        gVar.d(((int) Math.ceil(((double) (Integer.parseInt(strByteToHexString3, 16) - 16)) / 19.0d)) + 1);
        gVar.b(Integer.parseInt(strByteToHexString4, 16));
        gVar.a(strByteToHexString5);
        gVar.c(bArr2.length);
        gVar.c(strByteToHexString6);
        return gVar;
    }

    private int toDigit(char c2, int i) {
        int iDigit = Character.digit(c2, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new RuntimeException("Illegal hexadecimal character " + c2 + " at index " + i);
    }

    @Override // com.lifesense.plugin.ble.device.proto.i
    public void decodePackage(UUID uuid, byte[] bArr, String str) {
        HashMap map;
        h hVar;
        if (bArr != null) {
            this.currentDataPackageStyle = (uuid != null && j.PEDOMETER_A5_INDICATE_CHARACTERISTIC_UUID.equals(uuid)) ? e.LOGIN_REQUEST_PACKAGE : e.MEASURE_DATA_PACKAGE;
            if (com.lifesense.plugin.ble.c.c.f(bArr)) {
                com.lifesense.plugin.ble.device.proto.g toPedometerDataPackage = parseToPedometerDataPackage(bArr, 0, 0, "", str);
                if (toPedometerDataPackage == null || toPedometerDataPackage.b() == null || toPedometerDataPackage.b().length() <= 0) {
                    return;
                }
                if (isExistErrorDataPackage(toPedometerDataPackage.b()) && (hVar = this.dataPackageHandlerListener) != null) {
                    hVar.a(this.currentDevieMacAddress, ((HashMap) this.dataPackageMap.get(this.currentPackageSerialNumber)).values());
                }
                this.headerDataPackage = toPedometerDataPackage;
                this.currentFrameDataPackage = toPedometerDataPackage;
                this.totalPacketLength = toPedometerDataPackage.c();
                this.currentPackageSerialNumber = toPedometerDataPackage.b();
                this.frameCount = toPedometerDataPackage.i();
                this.dataPackagelist.put(Integer.valueOf(toPedometerDataPackage.d() - 1), toPedometerDataPackage);
                this.dataPackageMap.put(toPedometerDataPackage.b(), this.dataPackagelist);
                if (!checkDataPackageIntegrity(this.headerDataPackage)) {
                    return;
                } else {
                    this.headerDataPackage.c(getPacketContent(this.dataPackageMap));
                }
            } else {
                com.lifesense.plugin.ble.device.proto.g gVar = this.currentFrameDataPackage;
                if (gVar == null) {
                    return;
                }
                com.lifesense.plugin.ble.device.proto.g toPedometerDataPackage2 = parseToPedometerDataPackage(bArr, this.totalPacketLength, gVar.e(), this.currentFrameDataPackage.f(), str);
                Map map2 = this.dataPackageMap;
                if (map2 == null || !map2.containsKey(this.currentPackageSerialNumber) || (map = (HashMap) this.dataPackageMap.get(this.currentPackageSerialNumber)) == null) {
                    return;
                }
                map.put(Integer.valueOf(toPedometerDataPackage2.d() - 1), toPedometerDataPackage2);
                this.dataPackageMap.remove(this.currentPackageSerialNumber);
                this.dataPackageMap.put(this.currentPackageSerialNumber, map);
                this.currentFrameDataPackage = toPedometerDataPackage2;
                if (!checkDataPackageIntegrity(toPedometerDataPackage2)) {
                    return;
                }
                String packetContent = getPacketContent(this.dataPackageMap);
                this.headerDataPackage.c(packetContent);
                this.headerDataPackage.c((packetContent.length() / 2) + 4);
            }
            callbackParseResults(this.headerDataPackage);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0095 A[PHI: r4
  0x0095: PHI (r4v3 int) = (r4v2 int), (r4v4 int) binds: [B:21:0x0093, B:18:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x009b  */
    @Override // com.lifesense.plugin.ble.device.proto.i
    public byte[] encodePackage(String str, byte[] bArr, String str2) {
        int i;
        String strSubstring;
        int length;
        if (str == null || str.length() <= 0 || bArr == null) {
            return null;
        }
        String strByteToHexString = byteToHexString(bArr);
        if (str2 != null && str2.length() > 2) {
            strByteToHexString = str2 + strByteToHexString;
        }
        String cRCResult = getCRCResult(strByteToHexString);
        String withZero = formatWithZero(Integer.toHexString((strByteToHexString.length() / 2) + 4), 2);
        int iCeil = ((int) Math.ceil(((double) (Integer.parseInt(withZero, 16) - 16)) / 19.0d)) + 1;
        StringBuffer stringBuffer = new StringBuffer();
        if (iCeil > 1) {
            String str3 = strByteToHexString + cRCResult;
            stringBuffer.append(str);
            stringBuffer.append(withZero);
            int i2 = 0;
            int i3 = 1;
            while (i3 <= iCeil) {
                stringBuffer.append(String.format("%02X", Byte.valueOf(Byte.parseByte(Integer.toHexString(i3), 16))));
                int length2 = str3.length();
                if (i3 == 1) {
                    i = 32;
                    if (length2 - 32 >= 0) {
                        strSubstring = str3.substring(i2, i);
                        length = i;
                    } else {
                        strSubstring = str3.substring(i2, str3.length());
                        length = str3.length();
                    }
                } else {
                    i = i2 + 38;
                    if (length2 - i >= 0) {
                        strSubstring = str3.substring(i2, i);
                        length = i;
                    } else {
                        strSubstring = str3.substring(i2, str3.length());
                        length = str3.length();
                    }
                }
                stringBuffer.append(strSubstring);
                i3++;
                i2 = length;
            }
        } else {
            stringBuffer.append(str);
            stringBuffer.append(withZero);
            stringBuffer.append("01");
            stringBuffer.append(strByteToHexString);
            stringBuffer.append(cRCResult);
        }
        return com.lifesense.plugin.ble.c.a.b(stringBuffer.toString());
    }

    public byte[] formatResponsePacket(String str, byte[] bArr, String str2) {
        int i;
        String strSubstring;
        int length;
        if (str != null && str.length() > 0 && bArr != null && bArr.length > 0) {
            try {
                String strByteToHexString = byteToHexString(bArr);
                if (str2 != null && str2.length() > 2) {
                    strByteToHexString = str2 + strByteToHexString;
                }
                String cRCResult = getCRCResult(strByteToHexString);
                String withZero = formatWithZero(Integer.toHexString((strByteToHexString.length() / 2) + 4), 2);
                int iCeil = ((int) Math.ceil(((double) (Integer.parseInt(withZero, 16) - 16)) / 19.0d)) + 1;
                StringBuffer stringBuffer = new StringBuffer();
                if (iCeil > 1) {
                    String str3 = strByteToHexString + cRCResult;
                    stringBuffer.append(str);
                    stringBuffer.append(withZero);
                    int i2 = 0;
                    int i3 = 1;
                    while (i3 <= iCeil) {
                        stringBuffer.append(String.format("%02X", Byte.valueOf(Byte.parseByte(Integer.toHexString(i3), 16))));
                        if (i3 == 1) {
                            i = 32;
                            if (str3.length() - 32 >= 0) {
                                strSubstring = str3.substring(i2, i);
                                length = i;
                            } else {
                                strSubstring = str3.substring(i2, str3.length());
                                length = str3.length();
                            }
                        } else {
                            i = i2 + 38;
                            if (str3.length() - i >= 0) {
                                strSubstring = str3.substring(i2, i);
                                length = i;
                            } else {
                                strSubstring = str3.substring(i2, str3.length());
                                length = str3.length();
                            }
                        }
                        stringBuffer.append(strSubstring);
                        i3++;
                        i2 = length;
                    }
                } else {
                    stringBuffer.append(str);
                    stringBuffer.append(withZero);
                    stringBuffer.append("01");
                    stringBuffer.append(strByteToHexString);
                    stringBuffer.append(cRCResult);
                }
                return decodeHex(stringBuffer.toString().toCharArray());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public void parsingDataPackage(UUID uuid, byte[] bArr, String str) {
        HashMap map;
        h hVar;
        if (bArr != null) {
            this.currentDataPackageStyle = (uuid != null && j.PEDOMETER_A5_INDICATE_CHARACTERISTIC_UUID.equals(uuid)) ? e.LOGIN_REQUEST_PACKAGE : e.MEASURE_DATA_PACKAGE;
            if (com.lifesense.plugin.ble.c.c.f(bArr)) {
                com.lifesense.plugin.ble.device.proto.g toPedometerDataPackage = parseToPedometerDataPackage(bArr, 0, 0, "", str);
                if (toPedometerDataPackage == null || toPedometerDataPackage.b() == null || toPedometerDataPackage.b().length() <= 0) {
                    return;
                }
                if (isExistErrorDataPackage(toPedometerDataPackage.b()) && (hVar = this.dataPackageHandlerListener) != null) {
                    hVar.a(this.currentDevieMacAddress, ((HashMap) this.dataPackageMap.get(this.currentPackageSerialNumber)).values());
                }
                this.headerDataPackage = toPedometerDataPackage;
                this.currentFrameDataPackage = toPedometerDataPackage;
                this.totalPacketLength = toPedometerDataPackage.c();
                this.currentPackageSerialNumber = toPedometerDataPackage.b();
                this.frameCount = toPedometerDataPackage.i();
                this.dataPackagelist.put(Integer.valueOf(toPedometerDataPackage.d() - 1), toPedometerDataPackage);
                this.dataPackageMap.put(toPedometerDataPackage.b(), this.dataPackagelist);
                if (!checkDataPackageIntegrity(this.headerDataPackage)) {
                    return;
                } else {
                    this.headerDataPackage.c(getPacketContent(this.dataPackageMap));
                }
            } else {
                com.lifesense.plugin.ble.device.proto.g gVar = this.currentFrameDataPackage;
                if (gVar == null) {
                    return;
                }
                com.lifesense.plugin.ble.device.proto.g toPedometerDataPackage2 = parseToPedometerDataPackage(bArr, this.totalPacketLength, gVar.e(), this.currentFrameDataPackage.f(), str);
                Map map2 = this.dataPackageMap;
                if (map2 == null || !map2.containsKey(this.currentPackageSerialNumber) || (map = (HashMap) this.dataPackageMap.get(this.currentPackageSerialNumber)) == null) {
                    return;
                }
                map.put(Integer.valueOf(toPedometerDataPackage2.d() - 1), toPedometerDataPackage2);
                this.dataPackageMap.remove(this.currentPackageSerialNumber);
                this.dataPackageMap.put(this.currentPackageSerialNumber, map);
                this.currentFrameDataPackage = toPedometerDataPackage2;
                if (!checkDataPackageIntegrity(toPedometerDataPackage2)) {
                    return;
                }
                String packetContent = getPacketContent(this.dataPackageMap);
                this.headerDataPackage.c(packetContent);
                this.headerDataPackage.c((packetContent.length() / 2) + 4);
            }
            callbackParseResults(this.headerDataPackage);
        }
    }

    private com.lifesense.plugin.ble.device.proto.g parseToPedometerDataPackage(byte[] bArr, int i, int i2, String str, String str2) {
        String strByteToHexString;
        byte[] bArr2;
        String strByteToHexString2;
        String strIsContainsCommandVersion = null;
        if (bArr == null) {
            return null;
        }
        com.lifesense.plugin.ble.device.proto.g gVar = new com.lifesense.plugin.ble.device.proto.g();
        int i3 = 0;
        if (com.lifesense.plugin.ble.c.c.f(bArr)) {
            String strByteToHexString3 = byteToHexString(new byte[]{bArr[0], bArr[1]});
            String strByteToHexString4 = byteToHexString(new byte[]{bArr[2]});
            String strByteToHexString5 = byteToHexString(new byte[]{bArr[3]});
            if (isContainsCommandVersion(bArr, str2) != null) {
                strIsContainsCommandVersion = isContainsCommandVersion(bArr, str2);
                strByteToHexString = byteToHexString(new byte[]{bArr[6]});
            } else {
                strByteToHexString = byteToHexString(new byte[]{bArr[4]});
            }
            int length = ((bArr.length - 2) - 1) - 1;
            if (Integer.parseInt(strByteToHexString4, 16) <= length) {
                bArr2 = new byte[Integer.parseInt(strByteToHexString4, 16)];
                if (Integer.parseInt(strByteToHexString4, 16) == length) {
                    strByteToHexString2 = byteToHexString(new byte[]{bArr[bArr.length - 4], bArr[bArr.length - 3], bArr[bArr.length - 2], bArr[bArr.length - 1]});
                } else {
                    int i4 = length - Integer.parseInt(strByteToHexString4, 16);
                    strByteToHexString2 = byteToHexString(new byte[]{bArr[(bArr.length - 4) - i4], bArr[(bArr.length - 3) - i4], bArr[(bArr.length - 2) - i4], bArr[(bArr.length - 1) - i4]});
                }
                gVar.d(strByteToHexString2);
            } else {
                bArr2 = new byte[((bArr.length - 2) - 1) - 1];
            }
            while (i3 < bArr2.length) {
                bArr2[i3] = bArr[i3 + 4];
                i3++;
            }
            String strByteToHexString6 = byteToHexString(bArr2);
            gVar.b(strByteToHexString3);
            gVar.a(Integer.parseInt(strByteToHexString4, 16));
            gVar.d(((int) Math.ceil(((double) (Integer.parseInt(strByteToHexString4, 16) - 16)) / 19.0d)) + 1);
            gVar.b(Integer.parseInt(strByteToHexString5, 16));
            gVar.a(strByteToHexString);
            gVar.c(bArr2.length);
            gVar.c(strByteToHexString6);
            gVar.e(strIsContainsCommandVersion);
        } else {
            gVar.b(Integer.parseInt(byteToHexString(new byte[]{bArr[0]}), 16));
            int length2 = bArr.length - 1;
            byte[] bArr3 = new byte[length2];
            while (i3 < length2) {
                int i5 = i3 + 1;
                bArr3[i3] = bArr[i5];
                i3 = i5;
            }
            gVar.c(byteToHexString(bArr3));
            gVar.c(length2);
        }
        return gVar;
    }
}
