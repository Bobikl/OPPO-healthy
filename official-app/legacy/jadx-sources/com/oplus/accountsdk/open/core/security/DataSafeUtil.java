package com.oplus.accountsdk.open.core.security;

import android.util.SparseArray;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.bw4;
import com.oplus.aiunit.vision.cw4;
import com.oplus.aiunit.vision.gd;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class DataSafeUtil {
    private static final String TAG = "DataSafeUtil";
    private final DataSafe mDataSafe;
    private final SparseArray<DataSafe> mDataSafeSparseArray;

    public static class b {
        public static final DataSafeUtil a = new DataSafeUtil();
    }

    public static DataSafeUtil getInstance() {
        return b.a;
    }

    public String changeEncryptStr(int i, int i2, String str) {
        try {
            return this.mDataSafe.encrypt(this.mDataSafeSparseArray.get(i).decrypt(str, i2));
        } catch (Exception e2) {
            AcLogUtil.e(TAG, "changeEncryptStr error " + e2.getMessage());
            return "";
        }
    }

    public String decryptStr(String str) {
        return this.mDataSafe.decrypt(str);
    }

    public String encryptStr(String str) {
        return this.mDataSafe.encrypt(str);
    }

    public int getCurrentVersionType() {
        return this.mDataSafe.getSubVersion();
    }

    public DataSafe getDataSafe(int i) {
        return this.mDataSafeSparseArray.get(i, new bw4());
    }

    private DataSafeUtil() {
        SparseArray<DataSafe> sparseArray = new SparseArray<>();
        this.mDataSafeSparseArray = sparseArray;
        bw4 bw4Var = new bw4();
        cw4 cw4Var = new cw4();
        sparseArray.put(DataSafeEnum.DATA_SAFE_V0.version, bw4Var);
        sparseArray.put(DataSafeEnum.DATA_SAFE_V1.version, cw4Var);
        this.mDataSafe = getDataSafe(gd.CURRENT_ENCRYPT_VERSION);
    }
}
