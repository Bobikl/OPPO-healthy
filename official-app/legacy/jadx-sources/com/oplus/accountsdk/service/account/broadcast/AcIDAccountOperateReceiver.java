package com.oplus.accountsdk.service.account.broadcast;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.oplus.accountsdk.base.account.ILogoutCallback;
import com.oplus.accountsdk.base.common.util.AcBase64Helper;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.service.old.heytap.utils.AcOldConstants;
import com.oplus.aiunit.vision.aa;
import com.oplus.aiunit.vision.l7;
import com.oplus.aiunit.vision.ls9;
import com.oplus.aiunit.vision.zj;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public class AcIDAccountOperateReceiver extends AcBaseReceiver {
    public static final String PERMISSION_SENDER = "com.usercenter.permission.COMPONENT_SAFE";
    public static ArrayList<ILogoutCallback> mLogoutCallbacks = new ArrayList<>();
    public static ArrayList<ls9> mLoginCallbacks = new ArrayList<>();

    public class a implements Runnable {
        public final /* synthetic */ Context i;

        public a(Context context) {
            this.i = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            aa.B().b(this.i);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ ILogoutCallback i;

        public b(ILogoutCallback iLogoutCallback) {
            this.i = iLogoutCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            AcLogUtil.i("AcIDReceiver", "logout callback invoke start " + this.i, AcLogUtil.enableDebug());
            this.i.onLogout();
            AcLogUtil.i("AcIDReceiver", "logout callback invoke end " + this.i, AcLogUtil.enableDebug());
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ ls9 i;

        public c(ls9 ls9Var) {
            this.i = ls9Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            AcLogUtil.i("AcIDReceiver", "login callback invoke start " + this.i, AcLogUtil.enableDebug());
            this.i.onLogin();
            AcLogUtil.i("AcIDReceiver", "login callback invoke end " + this.i, AcLogUtil.enableDebug());
        }
    }

    @Override // com.oplus.accountsdk.service.account.broadcast.AcBaseReceiver
    public String a() {
        return "AcIDReceiver";
    }

    @Override // com.oplus.accountsdk.service.account.broadcast.AcBaseReceiver
    public void b(Context context, Intent intent, String str) {
        if (AcOldConstants.a.PROVIDER_USERCENTER_ACCOUNT_LOGOUT_XOR8.equals(str) || AcOldConstants.a.ACTION_USERCENTER_ACCOUNT_LOGOUT.equals(str)) {
            d(context, intent);
        } else if (AcOldConstants.a.PROVIDER_USERCENTER_ACCOUNT_LOGIN_COMPONENT_SAFE_XOR8.equals(str)) {
            c();
        }
    }

    public final void c() {
        AcLogUtil.i("AcIDReceiver", "login callback to biz. size: " + mLoginCallbacks.size());
        Iterator<ls9> it = mLoginCallbacks.iterator();
        while (it.hasNext()) {
            zj.a().g(new c(it.next()));
        }
    }

    public final void d(Context context, Intent intent) {
        if (intent == null) {
            AcLogUtil.e("AcIDReceiver", "onLogout intent is null");
            return;
        }
        String strBase64Decode = AcBase64Helper.base64Decode(intent.getStringExtra(AcOldConstants.a.EXTRA_BROADCAST_USERCENTER_AESCODER_NAME));
        String strA = l7.a(context);
        if (TextUtils.isEmpty(strA) || !strA.equals(strBase64Decode)) {
            AcLogUtil.e("AcIDReceiver", "verify fail, verify: " + strBase64Decode + ", accountPkg: " + strA);
            return;
        }
        AcLogUtil.i("AcIDReceiver", "receive logout and verify clear data");
        zj.a().g(new a(context));
        AcLogUtil.i("AcIDReceiver", "logout callback to biz. size: " + mLogoutCallbacks.size());
        Iterator<ILogoutCallback> it = mLogoutCallbacks.iterator();
        while (it.hasNext()) {
            zj.a().g(new b(it.next()));
        }
    }
}
