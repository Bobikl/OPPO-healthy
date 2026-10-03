package com.heytap.accessory.pair.common.ksc;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.common.CoreConstants;
import com.heytap.accessory.pair.common.db.EncryptedKscInfo;
import com.heytap.accessory.pair.common.db.KscDao;
import com.heytap.accessory.pair.common.db.KscDatabase;
import com.heytap.accessory.pair.connectivity.ConnectionManager;
import com.heytap.accessory.pair.connectivity.param.FPParamFactory;
import com.heytap.accessory.pair.logging.PairLog;
import com.heytap.accessory.pair.logging.SensitiveLogUtils;
import com.heytap.accessory.pair.provider.ProtocolEventManager;
import com.heytap.accessory.pair.utils.CipherUtils;
import com.heytap.accessory.pair.utils.ContextUtils;
import com.heytap.accessory.pair.utils.HexUtils;
import com.heytap.accessory.pair.utils.KeyStoreHelper;
import com.heytap.accessory.pair.utils.SaltCheckUtils;
import com.heytap.accessory.pair.utils.SecurityUtils;
import com.heytap.accessory.pair.utils.SystemUtils;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class KscManager {
    private static final byte FLAG_KSC_BLE = -128;
    private static final byte FLAG_KSC_BR_EDR = 64;
    private static final byte FLAG_KSC_P2P_FOR_PC = 16;
    private static final byte FLAG_KSC_WIFI = 32;
    private static final int LENGTH_FLAG = 1;
    private static final int LENGTH_KSC = 16;
    public static final int LENGTH_KSC_ALIAS = 6;
    private static final int LENGTH_MAC = 6;
    private static final int LENGTH_MSG_TYPE = 1;
    private static final int LENGTH_REPLY_RESULT = 2;
    private static final int LENGTH_REPLY_SALT = 13;
    private static final String TAG = "KscManager - kscTrack";

    public static boolean checkAllKscExist() {
        List<EncryptedKscInfo> allKscInfos = KscDatabase.getInstance(ContextUtils.createDeviceProtectedStorageContextCompat()).getKscDao().getAllKscInfos();
        return (allKscInfos == null || allKscInfos.isEmpty()) ? false : true;
    }

    private static byte[] checkAndSaveKsc(byte[] bArr, int i, String str) throws KscException {
        int i2 = i + 16;
        int i3 = i2 + 6;
        if (i3 > bArr.length) {
            PairLog.e(TAG, "check ksc length error: " + bArr.length + "offset: " + i);
            throw new KscException("ksc length error");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        PairLog.d(TAG, "checkAndSaveKsc, ksc = " + SensitiveLogUtils.toHiddenIfNeed(bArrCopyOfRange));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, i3);
        PairLog.d(TAG, "save ksc, deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; ksc(md5) = " + SensitiveLogUtils.toMd5IfNeed(bArrCopyOfRange) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(HexUtils.byteArrayToHexStr(bArrCopyOfRange2)));
        if (saveKsc(str, HexUtils.byteArrayToHexStr(bArrCopyOfRange2), bArrCopyOfRange)) {
            return bArrCopyOfRange2;
        }
        return null;
    }

    public static byte checkAndSaveKscResp(String str, byte[] bArr, String str2, Map<String, byte[]> map) throws KscException {
        PairLog.d(TAG, "checkKscResp");
        byte bCheckKscResp = checkKscResp(str, bArr, str2, map);
        if (bCheckKscResp != 0) {
            return bCheckKscResp;
        }
        for (String str3 : map.keySet()) {
            byte[] bArr2 = map.get(str3);
            PairLog.d(TAG, "save ksc, alias = " + SensitiveLogUtils.toHiddenIfNeed(str3) + "; ksc = " + SensitiveLogUtils.toMd5IfNeed(bArr2) + "; deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str2));
            if (!saveKsc(str2, str3, bArr2)) {
                throw new KscException("ksc duplicate. It should never happen.");
            }
        }
        return (byte) 0;
    }

    public static boolean checkKscExist(String str) {
        List<EncryptedKscInfo> kscInfo = KscDatabase.getInstance(ContextUtils.createDeviceProtectedStorageContextCompat()).getKscDao().getKscInfo(str);
        return (kscInfo == null || kscInfo.isEmpty()) ? false : true;
    }

    public static byte checkKscResp(String str, byte[] bArr, String str2, Map<String, byte[]> map) throws KscException {
        PairLog.d(TAG, "checkAndSaveKscResp");
        if (bArr == null) {
            throw new KscException("checkAndSaveKscResp, msg is empty.");
        }
        if (bArr.length != 16) {
            throw new KscException("checkAndSaveKscResp, msg data length error. Now is " + bArr.length + ". And 16 is required.");
        }
        if (bArr[0] != 13) {
            throw new KscException("checkAndSaveKscResp, msg type error. Now is " + ((int) bArr[0]) + ". And 13 is required.");
        }
        if (map == null) {
            throw new KscException("Ksc map cannot be empty!");
        }
        if (SaltCheckUtils.checkSalt(str, SaltCheckUtils.SALT_TYPE_KSC_GENERATING, Arrays.copyOfRange(bArr, 3, bArr.length))) {
            throw new KscException("salt not changed");
        }
        byte b = bArr[1];
        if (b == 0) {
            return (byte) 0;
        }
        PairLog.w(TAG, "check alias duplicate:" + ((int) b));
        return b;
    }

    public static byte[] generateKscPack(int i, Map<String, byte[]> map, Map<Integer, String> map2) {
        byte b;
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[90];
        int i2 = 2;
        if ((i & 32768) != 0) {
            byte[] bArrGenerateSeed = secureRandom.generateSeed(16);
            byte[] bArrGenerateSeed2 = secureRandom.generateSeed(6);
            SystemUtils.arraycopy(bArrGenerateSeed, 0, bArr, 2, 16);
            SystemUtils.arraycopy(bArrGenerateSeed2, 0, bArr, 18, 6);
            map.put(HexUtils.byteArrayToHexStr(bArrGenerateSeed2), bArrGenerateSeed);
            map2.put(32768, HexUtils.byteArrayToHexStr(bArrGenerateSeed2));
            PairLog.d(TAG, "generateKscPack, ble, alias = " + SensitiveLogUtils.toHiddenIfNeed(bArrGenerateSeed2) + ";ksc(md5) = " + SensitiveLogUtils.toMd5IfNeed(bArrGenerateSeed));
            i2 = 24;
            b = (byte) (-128);
        } else {
            b = 0;
        }
        if ((i & 16384) != 0) {
            byte[] bArrGenerateSeed3 = secureRandom.generateSeed(16);
            byte[] bArrGenerateSeed4 = secureRandom.generateSeed(6);
            SystemUtils.arraycopy(bArrGenerateSeed3, 0, bArr, i2, 16);
            int i3 = i2 + 16;
            SystemUtils.arraycopy(bArrGenerateSeed4, 0, bArr, i3, 6);
            i2 = i3 + 6;
            b = (byte) (b + FLAG_KSC_BR_EDR);
            map.put(HexUtils.byteArrayToHexStr(bArrGenerateSeed4), bArrGenerateSeed3);
            map2.put(16384, HexUtils.byteArrayToHexStr(bArrGenerateSeed4));
            PairLog.d(TAG, "generateKscPack, bt, alias = " + SensitiveLogUtils.toHiddenIfNeed(bArrGenerateSeed4) + ";ksc(md5) = " + SensitiveLogUtils.toMd5IfNeed(bArrGenerateSeed3));
        }
        if ((i & 8192) != 0) {
            byte[] bArrGenerateSeed5 = secureRandom.generateSeed(16);
            byte[] bArrGenerateSeed6 = secureRandom.generateSeed(6);
            SystemUtils.arraycopy(bArrGenerateSeed5, 0, bArr, i2, 16);
            int i4 = i2 + 16;
            SystemUtils.arraycopy(bArrGenerateSeed6, 0, bArr, i4, 6);
            i2 = i4 + 6;
            b = (byte) (b + 32);
            map.put(HexUtils.byteArrayToHexStr(bArrGenerateSeed6), bArrGenerateSeed5);
            map2.put(8192, HexUtils.byteArrayToHexStr(bArrGenerateSeed6));
            PairLog.d(TAG, "generateKscPack, wifi, alias = " + SensitiveLogUtils.toHiddenIfNeed(bArrGenerateSeed6) + ";ksc(md5) = " + SensitiveLogUtils.toMd5IfNeed(bArrGenerateSeed5));
        }
        if ((i & 4096) != 0) {
            byte[] bArrGenerateSeed7 = secureRandom.generateSeed(16);
            byte[] bArrGenerateSeed8 = secureRandom.generateSeed(6);
            SystemUtils.arraycopy(bArrGenerateSeed7, 0, bArr, i2, 16);
            int i5 = i2 + 16;
            SystemUtils.arraycopy(bArrGenerateSeed8, 0, bArr, i5, 6);
            i2 = i5 + 6;
            b = (byte) (b + 16);
            map.put(HexUtils.byteArrayToHexStr(bArrGenerateSeed8), bArrGenerateSeed7);
            map2.put(4096, HexUtils.byteArrayToHexStr(bArrGenerateSeed8));
            PairLog.d(TAG, "generateKscPack, p2p for pc, alias = " + SensitiveLogUtils.toHiddenIfNeed(bArrGenerateSeed8) + ";ksc(md5) = " + SensitiveLogUtils.toMd5IfNeed(bArrGenerateSeed7));
        }
        bArr[0] = 12;
        bArr[1] = b;
        PairLog.d(TAG, "generateKscPack, flag = " + ((int) b));
        return Arrays.copyOfRange(bArr, 0, i2);
    }

    public static byte handleKscPackRequest(ProtocolEventManager.Device device, byte[] bArr, Map<Integer, String> map) throws KscException {
        String strByteArrayToHexStr = HexUtils.byteArrayToHexStr(device.getRemoteDeviceId());
        PairLog.d(TAG, "provider handleKscPackRequest: rawData = " + SensitiveLogUtils.toHiddenIfNeed(bArr));
        if (bArr == null || bArr.length == 0) {
            throw new KscException("provider receive ksc pack empty");
        }
        byte b = 0;
        byte b2 = bArr[0];
        if (b2 != 12) {
            throw new KscException("provider ksc msgType error: " + ((int) b2));
        }
        byte b3 = bArr[1];
        PairLog.d(TAG, "ksc flags = " + ((int) b3));
        if ((b3 & (-16)) == 0) {
            throw new KscException("ksc flags error: " + ((int) b3));
        }
        int i = 2;
        if ((b3 & FLAG_KSC_BLE) != 0) {
            byte[] bArrCheckAndSaveKsc = checkAndSaveKsc(bArr, 2, strByteArrayToHexStr);
            if (bArrCheckAndSaveKsc == null) {
                PairLog.w(TAG, "save ble ksc failed");
                b = (byte) (-128);
            } else {
                map.put(32768, HexUtils.byteArrayToHexStr(bArrCheckAndSaveKsc));
            }
            i = 24;
        }
        if ((b3 & FLAG_KSC_BR_EDR) != 0) {
            byte[] bArrCheckAndSaveKsc2 = checkAndSaveKsc(bArr, i, strByteArrayToHexStr);
            if (bArrCheckAndSaveKsc2 == null) {
                PairLog.w(TAG, "save bt ksc failed");
                b = (byte) (b + FLAG_KSC_BR_EDR);
            } else {
                map.put(16384, HexUtils.byteArrayToHexStr(bArrCheckAndSaveKsc2));
            }
            i += 22;
        }
        if ((b3 & 32) != 0) {
            byte[] bArrCheckAndSaveKsc3 = checkAndSaveKsc(bArr, i, strByteArrayToHexStr);
            if (bArrCheckAndSaveKsc3 == null) {
                PairLog.w(TAG, "save wifi ksc failed");
                b = (byte) (b + 32);
            } else {
                map.put(8192, HexUtils.byteArrayToHexStr(bArrCheckAndSaveKsc3));
            }
            i += 22;
        }
        if ((b3 & 16) == 0) {
            return b;
        }
        byte[] bArrCheckAndSaveKsc4 = checkAndSaveKsc(bArr, i, strByteArrayToHexStr);
        if (bArrCheckAndSaveKsc4 == null) {
            PairLog.w(TAG, "save p2p ksc failed");
            return (byte) (b + 16);
        }
        map.put(4096, HexUtils.byteArrayToHexStr(bArrCheckAndSaveKsc4));
        return b;
    }

    public static void handleKscReply(byte b, int i, ProtocolEventManager.Device device, SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec) {
        byte[] bArr = new byte[16];
        bArr[0] = 13;
        bArr[1] = b;
        SystemUtils.arraycopy(new SecureRandom().generateSeed(13), 0, bArr, 3, 13);
        PairLog.d(TAG, "handle ksc reply");
        ConnectionManager.getInstance().sendMessage(SecurityUtils.encryptAES(secretKeySpec, ivParameterSpec, bArr), FPParamFactory.obtain(device.getBluetoothDevice().getAddress(), i, CoreConstants.UUID_CHARACTERISTIC_KSC_GENERATING));
    }

    @Nullable
    public static SecretKey loadKsc(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            PairLog.w(TAG, "alias is empty, so return empty ksc");
            return null;
        }
        KscDao kscDao = KscDatabase.getInstance(ContextUtils.createDeviceProtectedStorageContextCompat()).getKscDao();
        List<EncryptedKscInfo> kscInfo = kscDao.getKscInfo(str, str2);
        if (kscInfo == null || kscInfo.size() == 0) {
            PairLog.d(TAG, "loadKsc empty, try custom ksc,deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
            List<EncryptedKscInfo> kscInfo2 = kscDao.getKscInfo("", str2);
            if (kscInfo2 == null || kscInfo2.size() == 0) {
                PairLog.w(TAG, "custom loadKsc empty, deviceId = " + SensitiveLogUtils.toHiddenIfNeed("") + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
                return null;
            }
            kscInfo = kscInfo2;
        }
        PairLog.d(TAG, "loadKsc from db = " + kscInfo);
        EncryptedKscInfo encryptedKscInfo = kscInfo.get(0);
        if (encryptedKscInfo == null) {
            PairLog.e(TAG, "ksc unknown error");
            return null;
        }
        try {
            Cipher decryptCipher = CipherUtils.getDecryptCipher(encryptedKscInfo.iv);
            if (decryptCipher == null) {
                throw new SecurityException("loadKsc cipher init failed");
            }
            byte[] bArrDoFinal = decryptCipher.doFinal(HexUtils.hexStrToByteArray(encryptedKscInfo.encryptedKsc));
            PairLog.d(TAG, "loadKsc decryptKsc = " + SensitiveLogUtils.toHiddenIfNeed(bArrDoFinal));
            return new KeyStoreHelper.MasterSecretKey(bArrDoFinal, "HmacSHA512");
        } catch (Exception e) {
            PairLog.e(TAG, e.toString());
            return null;
        }
    }

    public static void removeKsc(String str, String str2) {
        KscDatabase.getInstance(ContextUtils.createDeviceProtectedStorageContextCompat()).getKscDao().delete(str, str2);
    }

    private static boolean saveKsc(String str, String str2, byte[] bArr) throws KscException {
        KscDao kscDao = KscDatabase.getInstance(ContextUtils.createDeviceProtectedStorageContextCompat()).getKscDao();
        List<EncryptedKscInfo> kscInfo = kscDao.getKscInfo(str, str2);
        if (kscInfo != null && !kscInfo.isEmpty()) {
            PairLog.w(TAG, "Alias is duplicate. param is deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
            StringBuilder sb = new StringBuilder();
            sb.append("db is kscList = ");
            sb.append(kscInfo);
            PairLog.w(TAG, sb.toString());
            return false;
        }
        List<EncryptedKscInfo> kscInfo2 = kscDao.getKscInfo("", str2);
        if (kscInfo2 != null && !kscInfo2.isEmpty()) {
            PairLog.w(TAG, "Custom alias is duplicate. deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; alias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
            return false;
        }
        if (bArr == null || bArr.length != 16) {
            throw new KscException("Ksc length error, now is " + (bArr != null ? bArr.length : 0) + "; 16 is required.");
        }
        try {
            Pair<String, Cipher> encryptCipher = CipherUtils.getEncryptCipher();
            if (encryptCipher == null || encryptCipher.second == null || TextUtils.isEmpty((CharSequence) encryptCipher.first)) {
                throw new KscException("Iv is null while save ksc");
            }
            String str3 = (String) encryptCipher.first;
            PairLog.d(TAG, "saveKsc-KscEncrypt, before encrypt, deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; ksc(md5) = " + SensitiveLogUtils.toMd5IfNeed(bArr) + "; kscAlias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
            byte[] bArrDoFinal = ((Cipher) encryptCipher.second).doFinal(bArr);
            PairLog.d(TAG, "saveKsc-KscEncrypt, after encrypt, deviceId = " + SensitiveLogUtils.toHiddenIfNeed(str) + "; encryptedKsc = " + SensitiveLogUtils.toHiddenIfNeed(bArrDoFinal) + "; kscAlias = " + SensitiveLogUtils.toHiddenIfNeed(str2));
            String strByteArrayToHexStr = HexUtils.byteArrayToHexStr(bArrDoFinal);
            EncryptedKscInfo encryptedKscInfo = new EncryptedKscInfo();
            encryptedKscInfo.encryptedKsc = strByteArrayToHexStr;
            if (str == null) {
                str = "";
            }
            encryptedKscInfo.deviceId = str;
            encryptedKscInfo.alias = str2;
            encryptedKscInfo.iv = str3;
            encryptedKscInfo.date = System.currentTimeMillis();
            kscDao.insert(encryptedKscInfo);
            return true;
        } catch (Exception e) {
            PairLog.w(TAG, "saveKsc failed.", e);
            return false;
        }
    }
}
