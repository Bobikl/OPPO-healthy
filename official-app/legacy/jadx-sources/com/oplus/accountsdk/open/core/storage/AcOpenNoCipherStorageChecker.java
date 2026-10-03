package com.oplus.accountsdk.open.core.storage;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.security.DataSafeUtil;
import com.oplus.aiunit.vision.C1712if;
import com.oplus.aiunit.vision.gd;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenNoCipherStorageChecker {
    private static final String TAG = "DataSafe_Checker";

    public static String getDBKeyAndUpdateEncryptVersion(Context context) {
        String strDecryptStr;
        String strD = C1712if.b(context).d(gd.DATABASE_CIPHER_KEY, "");
        if (TextUtils.isEmpty(strD)) {
            strDecryptStr = "";
        } else {
            int iC = C1712if.b(context).c(gd.ENCRYPT_VERSION, 0);
            AcLogUtil.i(TAG, "oldEncryptVersion = " + iC);
            int iC2 = C1712if.b(context).c(gd.ENCRYPT_VERSION_TYPE, 0);
            AcLogUtil.i(TAG, "oldEncryptVersionType = " + iC2);
            int i = gd.CURRENT_ENCRYPT_VERSION;
            if (iC != i || iC2 != DataSafeUtil.getInstance().getCurrentVersionType()) {
                AcLogUtil.i(TAG, "changeTypeStrategy =" + DataSafeUtil.getInstance().getCurrentVersionType());
                strD = DataSafeUtil.getInstance().changeEncryptStr(iC, iC2, strD);
                if (TextUtils.isEmpty(strD)) {
                    C1712if.b(context).a(gd.DATABASE_CIPHER_KEY);
                    C1712if.b(context).a(gd.ENCRYPT_VERSION);
                    C1712if.b(context).a(gd.ENCRYPT_VERSION_TYPE);
                } else {
                    C1712if.b(context).f(gd.DATABASE_CIPHER_KEY, strD);
                    C1712if.b(context).f(gd.ENCRYPT_VERSION, i + "");
                    C1712if.b(context).f(gd.ENCRYPT_VERSION_TYPE, DataSafeUtil.getInstance().getCurrentVersionType() + "");
                    AcLogUtil.i(TAG, "insert end");
                }
            }
            strDecryptStr = DataSafeUtil.getInstance().decryptStr(strD);
        }
        if (!TextUtils.isEmpty(strDecryptStr)) {
            return strDecryptStr;
        }
        AcLogUtil.i(TAG, "cipherKey create");
        String str = UUID.randomUUID().toString().replace("-", "") + "open_database";
        C1712if.b(context).f(gd.DATABASE_CIPHER_KEY, DataSafeUtil.getInstance().encryptStr(str));
        C1712if.b(context).f(gd.ENCRYPT_VERSION, gd.CURRENT_ENCRYPT_VERSION + "");
        C1712if.b(context).f(gd.ENCRYPT_VERSION_TYPE, DataSafeUtil.getInstance().getCurrentVersionType() + "");
        AcLogUtil.i(TAG, "insert create");
        return str;
    }
}
