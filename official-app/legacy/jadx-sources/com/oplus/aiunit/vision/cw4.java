package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.security.DataSafe;
import com.oplus.accountsdk.open.core.utils.AcOpenSubVersionUtils;
import java.util.Objects;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes6.dex */
public class cw4 implements DataSafe {
    public final String a = "AcOpenAccount";

    @Override // com.oplus.accountsdk.open.core.security.DataSafe
    @RequiresApi(api = 23)
    public String decrypt(String str) {
        AcLogUtil.i("DataSafe_v1", "decrypt start");
        return decrypt(str, getSubVersion());
    }

    @Override // com.oplus.accountsdk.open.core.security.DataSafe
    @RequiresApi(api = 23)
    public String encrypt(String str) {
        return encrypt(str, getSubVersion());
    }

    @Override // com.oplus.accountsdk.open.core.security.DataSafe
    public int getSubVersion() {
        return AcOpenSubVersionUtils.SUB_VERSION;
    }

    @Override // com.oplus.accountsdk.open.core.security.DataSafe
    @RequiresApi(api = 23)
    public String encrypt(String str, int i) {
        AcLogUtil.i("DataSafe_v1", "encrypt start =" + i);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strE = "";
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (i == AcOpenSubVersionUtils.TYPE_BUILD_VERSION_ABOVE_M) {
                byte[] bytes = str.getBytes();
                SecretKey secretKeyA = poa.a("AcOpenAccount");
                Objects.requireNonNull(secretKeyA);
                strE = Base64.encodeToString(s.b(bytes, secretKeyA), 2);
            } else if (i == AcOpenSubVersionUtils.TYPE_BUILD_VERSION_BELOW_M) {
                strE = c7.e(str);
            }
            AcLogUtil.d("DataSafe_v1", "encrypt consume" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return strE;
        } catch (Exception e2) {
            AcLogUtil.e("DataSafe_v1", "encrypt is error =" + e2.getMessage());
            return strE;
        }
    }

    @Override // com.oplus.accountsdk.open.core.security.DataSafe
    @RequiresApi(api = 23)
    public String decrypt(String str, int i) {
        AcLogUtil.i("DataSafe_v1", "decrypt start =" + i);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strC = "";
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            if (i == AcOpenSubVersionUtils.TYPE_BUILD_VERSION_ABOVE_M) {
                byte[] bArrDecode = Base64.decode(str, 2);
                SecretKey secretKeyA = poa.a("AcOpenAccount");
                Objects.requireNonNull(secretKeyA);
                strC = new String(s.a(bArrDecode, secretKeyA));
            } else if (i == AcOpenSubVersionUtils.TYPE_BUILD_VERSION_BELOW_M) {
                strC = c7.c(str);
            }
            AcLogUtil.d("DataSafe_v1", "decrypt consume" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return strC;
        } catch (Exception e2) {
            AcLogUtil.e("DataSafe_v1", "decrypt is error =" + e2.getMessage());
            return strC;
        }
    }
}
