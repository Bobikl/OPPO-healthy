package com.oplus.accountsdk.open.core.storage;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.storage.db.AcOpenCipherDataBase;
import com.oplus.accountsdk.open.core.storage.table.AcOldAccountInfo;
import com.oplus.accountsdk.open.core.storage.table.AcOldSecondaryTokenInfo;
import com.oplus.accountsdk.open.core.storage.table.AcOpenAccountInfo;
import com.oplus.accountsdk.open.core.storage.table.AcOpenAccountToken;
import com.oplus.accountsdk.open.core.storage.table.AcOpenDeviceInfo;
import com.oplus.aiunit.vision.ae;
import com.oplus.aiunit.vision.be;
import com.oplus.aiunit.vision.cc;
import com.oplus.aiunit.vision.m7;
import com.oplus.aiunit.vision.rb;
import com.oplus.aiunit.vision.ub;
import com.oplus.aiunit.vision.xb;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenStorageHelper {
    private static final String TAG = "AcOpenStorageHelper";
    private static volatile AcOpenStorageHelper mInstance;
    private final rb acOldAccountDao;
    private final ub acOldSecondaryTokenDao;
    private final xb mAcOpenAccountInfoDao;
    private final cc mAcOpenAccountTokenDao;
    private final be mAcOpenDeviceInfoDao;
    private Context mContext;
    private AcOldAccountInfo mOldAccountInfo;
    private String openId = "";

    private AcOpenStorageHelper(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        if (applicationContext == null) {
            this.mContext = context;
        }
        AcOpenCipherDataBase acOpenCipherDataBaseL = AcOpenCipherDataBase.l(this.mContext, AcOpenNoCipherStorageChecker.getDBKeyAndUpdateEncryptVersion(context));
        rb rbVarN = acOpenCipherDataBaseL.n();
        this.acOldAccountDao = rbVarN;
        this.acOldSecondaryTokenDao = acOpenCipherDataBaseL.o();
        this.mAcOpenAccountTokenDao = acOpenCipherDataBaseL.e();
        this.mAcOpenAccountInfoDao = acOpenCipherDataBaseL.d();
        this.mAcOpenDeviceInfoDao = acOpenCipherDataBaseL.f();
        try {
            this.mOldAccountInfo = rbVarN.a("1");
        } catch (Exception e2) {
            ae.a(this.mContext, e2);
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("initDataBase accountInfo result = ");
        sb.append(this.mOldAccountInfo != null);
        AcLogUtil.i(str, sb.toString());
    }

    private AcOldAccountInfo getAcOldAccountInfo() {
        return this.mOldAccountInfo;
    }

    public static AcOpenStorageHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (AcOpenStorageHelper.class) {
                if (mInstance == null) {
                    mInstance = new AcOpenStorageHelper(context);
                }
            }
        }
        return mInstance;
    }

    public void cleanAllDB() {
        xb xbVar = this.mAcOpenAccountInfoDao;
        if (xbVar != null) {
            xbVar.a();
        }
        cc ccVar = this.mAcOpenAccountTokenDao;
        if (ccVar != null) {
            ccVar.a();
        }
    }

    public void deleteOldAccountTokenAndInfo(String str) {
        rb rbVar;
        if (TextUtils.isEmpty(str) || (rbVar = this.acOldAccountDao) == null) {
            return;
        }
        rbVar.b(str);
        this.mOldAccountInfo = null;
    }

    public AcOpenAccountInfo getAcOpenAccountInfo() {
        xb xbVar = this.mAcOpenAccountInfoDao;
        if (xbVar == null) {
            return null;
        }
        List<AcOpenAccountInfo> listD = xbVar.d();
        if (listD.isEmpty()) {
            return null;
        }
        return listD.get(0);
    }

    public AcOpenAccountToken getAcOpenAccountToken() {
        cc ccVar = this.mAcOpenAccountTokenDao;
        if (ccVar == null) {
            return null;
        }
        List<AcOpenAccountToken> listB = ccVar.b();
        if (listB.isEmpty()) {
            return null;
        }
        return listB.get(0);
    }

    public String getDeviceId() {
        if (getAcOpenAccountToken() != null) {
            return getAcOpenAccountToken().getDeviceId();
        }
        return getAcOldAccountInfo() != null ? getAcOldAccountInfo().getDeviceId() : "";
    }

    public String getOpenId(String str) {
        be beVar;
        AcOpenDeviceInfo acOpenDeviceInfoB;
        if (!TextUtils.isEmpty(this.openId)) {
            return this.openId;
        }
        if (!TextUtils.isEmpty(str) && (beVar = this.mAcOpenDeviceInfoDao) != null && (acOpenDeviceInfoB = beVar.b(str)) != null) {
            this.openId = acOpenDeviceInfoB.getOpenId();
        }
        if (TextUtils.isEmpty(this.openId)) {
            this.openId = str + m7.b();
            AcOpenDeviceInfo acOpenDeviceInfo = new AcOpenDeviceInfo();
            acOpenDeviceInfo.setPackageName(str);
            acOpenDeviceInfo.setOpenId(this.openId);
            be beVar2 = this.mAcOpenDeviceInfoDao;
            if (beVar2 != null) {
                beVar2.a(acOpenDeviceInfo);
            }
        }
        return this.openId;
    }

    public String getPrimaryToken() {
        if (getAcOpenAccountToken() != null) {
            return getAcOpenAccountToken().getPrimaryToken();
        }
        return getAcOldAccountInfo() != null ? getAcOldAccountInfo().getPrimaryToken() : "";
    }

    public String getRefreshTicket() {
        String refreshTicket;
        AcOpenAccountToken acOpenAccountToken = getAcOpenAccountToken();
        if (acOpenAccountToken != null) {
            String refreshTicket2 = acOpenAccountToken.getRefreshTicket();
            return refreshTicket2 != null ? refreshTicket2 : "";
        }
        AcOldAccountInfo acOldAccountInfo = getAcOldAccountInfo();
        return (acOldAccountInfo == null || (refreshTicket = acOldAccountInfo.getRefreshTicket()) == null) ? "" : refreshTicket;
    }

    public AcOldSecondaryTokenInfo getSecondaryTokenBeforeH5() {
        ub ubVar = this.acOldSecondaryTokenDao;
        if (ubVar == null) {
            return null;
        }
        List<AcOldSecondaryTokenInfo> listA = ubVar.a();
        if (listA.isEmpty()) {
            return null;
        }
        return listA.get(0);
    }

    public String getSsoid() {
        if (getAcOpenAccountToken() != null) {
            return getAcOpenAccountToken().getSsoid();
        }
        return getAcOldAccountInfo() != null ? getAcOldAccountInfo().getSsoid() : "";
    }

    public boolean hasLoginState() {
        return (getAcOpenAccountToken() == null && getAcOldAccountInfo() == null) ? false : true;
    }

    public boolean needConvert() {
        return this.mOldAccountInfo != null && getAcOpenAccountToken() == null;
    }

    public void saveAcOpenAccountInfo(AcOpenAccountInfo acOpenAccountInfo) {
        xb xbVar = this.mAcOpenAccountInfoDao;
        if (xbVar == null || acOpenAccountInfo == null) {
            return;
        }
        xbVar.b(acOpenAccountInfo);
    }

    public void saveAccountToken(AcOpenAccountToken acOpenAccountToken) {
        cc ccVar = this.mAcOpenAccountTokenDao;
        if (ccVar == null || acOpenAccountToken == null) {
            return;
        }
        ccVar.c(acOpenAccountToken);
    }
}
