package com.heytap.usercenter.accountsdk.utils;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.heytap.usercenter.accountsdk.utils.app.UserCenterOperateReceiver;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.thread.BackgroundExecutor;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UCAccountSDKInitProvider extends ContentProvider {
    private static final String TAG = "UCAccountSDKInitProvider";
    private final UserCenterOperateReceiver mOperateReceiver = new UserCenterOperateReceiver();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerAccountReceiver, reason: merged with bridge method [inline-methods] */
    public void lambda$initialization$0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(UCAccountXor8Provider.getProviderUsercenterAccountLogoutXor8());
        intentFilter.addAction(UCAccountXor8Provider.getProviderUsercenterAccountModifyNameXor8());
        intentFilter.addAction(UCAccountXor8Provider.getProviderUsercenterAccountLoginXor8());
        intentFilter.addAction(UCAccountXor8Provider.getProviderUsercenterAccountLogoutComponentSafeXor8());
        intentFilter.addAction(UCAccountXor8Provider.getProviderUsercenterAccountModifyNameComponentSafeXor8());
        intentFilter.addAction(UCAccountXor8Provider.getProviderUsercenterAccountLoginComponentSafeXor8());
        intentFilter.addAction(UCAccountXor8Provider.ACTION_USERCENTER_ACCOUNT_LOGOUT);
        intentFilter.addAction(UCAccountXor8Provider.ACTION_USERCENTER_ACCOUNT_LOGIN);
        intentFilter.addAction("com.usercenter.action.broadcast.USERINFO_CHANGED");
        if (Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(this.mOperateReceiver, intentFilter);
        } else {
            context.registerReceiver(this.mOperateReceiver, intentFilter, 2);
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    public void initialization(final Context context) {
        if (context == null) {
            UCLogUtil.w(TAG, "initialization context is null ");
            return;
        }
        BaseApp.init(context);
        StringBuilder sb = new StringBuilder();
        sb.append("initialization accountBaseSDKVersion=2.6.4 pkg name = ");
        sb.append(context.getPackageName());
        sb.append(", isSDKBuildVersionBelowTiramisu = ");
        sb.append(Build.VERSION.SDK_INT < 33);
        UCLogUtil.i(TAG, sb.toString());
        BackgroundExecutor.getWorkExecutor().execute(new Runnable() { // from class: com.oplus.aiunit.vision.hek
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$initialization$0(context);
            }
        });
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            initialization(getContext());
            return true;
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2.toString());
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
