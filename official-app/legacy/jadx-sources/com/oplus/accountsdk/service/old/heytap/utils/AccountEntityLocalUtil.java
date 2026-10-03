package com.oplus.accountsdk.service.old.heytap.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.accountsdk.service.old.heytap.bean.AcUserEntity;
import com.oplus.aiunit.vision.bb;
import com.oplus.aiunit.vision.nm;
import com.oplus.aiunit.vision.xa;
import com.oplus.aiunit.vision.zj;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public final class AccountEntityLocalUtil {
    public static final String ACCOUNT_USERINFO_FILE_NAME = "account_userentity_filename";
    private static final String TAG = "AccountPrefUtils";
    public static final String USERENTITY_ACCOUNT_KEY = AcOldConstants.SP_NAME_USERCENTER;

    public class a implements Runnable {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ AcUserEntity f9134j;

        public a(Context context, AcUserEntity acUserEntity) {
            this.i = context;
            this.f9134j = acUserEntity;
        }

        @Override // java.lang.Runnable
        public void run() {
            bb.j(this.i, AccountEntityLocalUtil.ACCOUNT_USERINFO_FILE_NAME, AccountEntityLocalUtil.USERENTITY_ACCOUNT_KEY, xa.d(this.f9134j));
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ Context i;

        public b(Context context) {
            this.i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            bb.b(this.i, AccountEntityLocalUtil.ACCOUNT_USERINFO_FILE_NAME);
        }
    }

    public static void clearData(Context context) {
        zj.a().g(new b(context));
        nm.b().clearCache();
    }

    public static String getNameByProvider(Context context) {
        AcUserEntity userEntity = getUserEntity(context, null);
        if (userEntity != null) {
            return userEntity.getUsername();
        }
        return null;
    }

    public static AcUserEntity getUserEntity(Context context, AcUserEntity acUserEntity) {
        String strE = bb.e(context, ACCOUNT_USERINFO_FILE_NAME, USERENTITY_ACCOUNT_KEY);
        if (TextUtils.isEmpty(strE)) {
            return null;
        }
        return (AcUserEntity) xa.c(strE, AcUserEntity.class);
    }

    public static void saveUserEntity(Context context, AcUserEntity acUserEntity) {
        if (acUserEntity == null) {
            return;
        }
        zj.a().g(new a(context, acUserEntity));
    }

    public static void setName(Context context, String str) {
        AcUserEntity userEntity = getUserEntity(context, null);
        if (userEntity != null) {
            userEntity.setUsername(str);
            saveUserEntity(context, userEntity);
        }
    }
}
