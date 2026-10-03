package com.oplus.aiunit.vision;

import android.nfc.Tag;
import android.nfc.tech.MifareClassic;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.heytap.health.wallet.bean.NfcMifareCardBean;
import com.heytap.health.wallet.bean.SectorInfo;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes18.dex */
public class szb {
    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e2) {
            t6b.i("Exception", "printStackTrace()--->" + e2.getMessage());
        }
    }

    public static int b(int i) {
        return (1 << i) | 0;
    }

    public static String c(NfcMifareCardBean nfcMifareCardBean) {
        SparseArray<String> sparseArray;
        if (nfcMifareCardBean == null || nfcMifareCardBean.getSectorCount() == 0 || nfcMifareCardBean.isCpuCard()) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int iB = 0;
        for (int i = 0; i < nfcMifareCardBean.getSectorCount(); i++) {
            String hexString = Integer.toHexString(i);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            stringBuffer.append(hexString);
            SectorInfo sectorInfo = nfcMifareCardBean.getSectorInfos().get(i);
            StringBuffer stringBuffer2 = new StringBuffer();
            if (sectorInfo != null && (sparseArray = sectorInfo.blockInfos) != null && sparseArray.size() != 0) {
                for (int i2 = 0; i2 < sectorInfo.blockInfos.size() - 1; i2++) {
                    if (i != 0 || i2 != 0) {
                        iB |= b(i2);
                        String str = sectorInfo.blockInfos.get(i2);
                        t6b.a("dataStr  " + i + "    " + i2 + "     " + str);
                        stringBuffer2.append(str);
                    }
                }
                stringBuffer.append(dj8.PRODUCT_ID + Integer.toHexString(iB));
                stringBuffer.append(stringBuffer2.toString());
            }
        }
        t6b.a("blockTotalData:" + stringBuffer.toString());
        return stringBuffer.toString();
    }

    public static SectorInfo d(MifareClassic mifareClassic, int i) throws IOException {
        String str;
        SectorInfo sectorInfo = new SectorInfo();
        sectorInfo.index = i;
        if (mifareClassic.authenticateSectorWithKeyA(i, MifareClassic.KEY_DEFAULT)) {
            SparseArray<String> sparseArrayF = f(mifareClassic, i);
            str = "sector " + i + "default hexData:" + (sparseArrayF.size() > 0 ? sparseArrayF.get(0) : "") + Weather.SEPARATOR;
            sectorInfo.isEncrypt = false;
            sectorInfo.blockInfos = sparseArrayF;
        } else if (mifareClassic.authenticateSectorWithKeyA(i, MifareClassic.KEY_NFC_FORUM)) {
            SparseArray<String> sparseArrayF2 = f(mifareClassic, i);
            str = "sector " + i + " forum hexData : " + (sparseArrayF2.size() > 0 ? sparseArrayF2.get(0) : "") + Weather.SEPARATOR;
            sectorInfo.isEncrypt = false;
            sectorInfo.blockInfos = sparseArrayF2;
        } else if (mifareClassic.authenticateSectorWithKeyA(i, MifareClassic.KEY_MIFARE_APPLICATION_DIRECTORY)) {
            SparseArray<String> sparseArrayF3 = f(mifareClassic, i);
            str = "sector " + i + " mad hexData : " + (sparseArrayF3.size() > 0 ? sparseArrayF3.get(0) : "") + Weather.SEPARATOR;
            sectorInfo.isEncrypt = false;
            sectorInfo.blockInfos = sparseArrayF3;
        } else {
            sectorInfo.isEncrypt = true;
            str = "Sector " + i + ":auth fail\n";
        }
        t6b.e("metaInfo:" + str);
        return sectorInfo;
    }

    public static NfcMifareCardBean e(SectorInfo sectorInfo, NfcMifareCardBean nfcMifareCardBean) {
        SparseArray<String> sparseArray;
        String str;
        if (sectorInfo != null && nfcMifareCardBean != null && (sparseArray = sectorInfo.blockInfos) != null && sparseArray.size() != 0 && (str = sectorInfo.blockInfos.get(0)) != null && str.length() > 16) {
            String strSubstring = str.substring(10, 12);
            String strSubstring2 = str.substring(12, 16);
            nfcMifareCardBean.setSak(strSubstring);
            nfcMifareCardBean.setAtqa(strSubstring2);
            t6b.h("sak=" + strSubstring + " ATQA=" + strSubstring2);
        }
        return nfcMifareCardBean;
    }

    public static SparseArray<String> f(MifareClassic mifareClassic, int i) throws IOException {
        int blockCountInSector = mifareClassic.getBlockCountInSector(i);
        SparseArray<String> sparseArray = new SparseArray<>();
        int iSectorToBlock = mifareClassic.sectorToBlock(i);
        for (int i2 = 0; i2 < blockCountInSector; i2++) {
            byte[] block = new byte[0];
            try {
                block = mifareClassic.readBlock(iSectorToBlock + i2);
            } catch (IOException e2) {
                t6b.d("MifareCardUtils", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
            byte[] bArr = new byte[16];
            if (drk.f(block)) {
                block = bArr;
            }
            if (block.length < 16) {
                System.arraycopy(block, 0, bArr, 0, block.length);
            } else {
                bArr = block;
            }
            String strH = e1j.h(bArr);
            sparseArray.put(i2, strH);
            t6b.e("sectorIndex=" + i + " block=" + i2 + " hexData=" + strH);
        }
        return sparseArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    public static NfcMifareCardBean g(Tag tag) throws Throwable {
        MifareClassic mifareClassic;
        NfcMifareCardBean nfcMifareCardBean = new NfcMifareCardBean();
        ?? r1 = 0;
        if (tag == null || tag.getTechList() == null) {
            t6b.i("501", "end1");
            return null;
        }
        nfcMifareCardBean.setAtqa("0400");
        nfcMifareCardBean.setSak("08");
        String[] techList = tag.getTechList();
        for (String str : techList) {
            try {
                t6b.i("501", "end2,tech=" + str);
                if (str.indexOf("IsoDep") >= 0 || str.indexOf("MifareUltralight") >= 0) {
                    nfcMifareCardBean.setCpuCard(true);
                    nfcMifareCardBean.setSectorCount(16);
                }
                if (str.indexOf("MifareClassic") >= 0) {
                    nfcMifareCardBean.setMifareClassic(true);
                }
            } catch (Throwable th) {
                th = th;
                r1 = techList;
            }
        }
        try {
            mifareClassic = MifareClassic.get(tag);
            try {
                boolean zContains = new Gson().toJson(tag.getTechList()).contains("IsoDep");
                boolean zContains2 = new Gson().toJson(tag.getTechList()).contains("MifareUltralight");
                t6b.i("501", "process1,isCpuCard=" + zContains + ",isMifareUltralightCard=" + zContains2);
                if (mifareClassic != null && !zContains && !zContains2) {
                    mifareClassic.connect();
                    int type = mifareClassic.getType();
                    int sectorCount = mifareClassic.getSectorCount();
                    nfcMifareCardBean.setType(type);
                    nfcMifareCardBean.setSectorCount(sectorCount);
                    SparseArray<SectorInfo> sparseArray = new SparseArray<>();
                    for (int i = 0; i < sectorCount; i++) {
                        SectorInfo sectorInfoD = null;
                        for (int i2 = 0; i2 < 2; i2++) {
                            sectorInfoD = d(mifareClassic, i);
                            if (!sectorInfoD.isEncrypt) {
                                break;
                            }
                            t6b.i("501", "process2,times=" + i2);
                        }
                        sparseArray.put(i, sectorInfoD);
                        nfcMifareCardBean.setEncrypt(nfcMifareCardBean.isEncrypt() || sparseArray.get(i).isEncrypt);
                    }
                    nfcMifareCardBean.setSectorInfos(sparseArray);
                    if (sparseArray.size() > 0) {
                        e(sparseArray.get(0), nfcMifareCardBean);
                    }
                    t6b.f("NfcMifareCardBean", "NfcMifareCardBean =" + nfcMifareCardBean.toString());
                    a(mifareClassic);
                    return nfcMifareCardBean;
                }
                t6b.i("501", "end3");
                a(mifareClassic);
                return nfcMifareCardBean;
            } catch (Exception e2) {
                e = e2;
                t6b.d("MifareCardUtils", Thread.currentThread().getStackTrace()[1].getMethodName() + e.getMessage());
                a(mifareClassic);
                return null;
            }
        } catch (Exception e3) {
            e = e3;
            mifareClassic = null;
        } catch (Throwable th2) {
            th = th2;
            a(r1);
            throw th;
        }
    }
}
