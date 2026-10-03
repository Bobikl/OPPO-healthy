package com.platform.sdk.center.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.accountcenter.i;
import com.platform.sdk.center.R;
import com.platform.sdk.center.dispatcher.IAcMBADispatcher;
import com.platform.usercenter.account.mba.IResultCallback;
import com.platform.usercenter.account.mba.OutsideApk;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.algorithm.RandomFactory;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.thread.BackgroundExecutor;
import java.util.Random;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcAppUtils {
    private static final int SDK_VERSION_INT = Build.VERSION.SDK_INT;
    private static final String TAG = "AppForceEnableChecker";

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: com.platform.sdk.center.utils.AcAppUtils$a$a, reason: collision with other inner class name */
        public class C0991a implements IResultCallback {
            @Override // com.platform.usercenter.account.mba.IResultCallback
            public final void err(int i, String str) {
                UCLogUtil.e(AcAppUtils.TAG, str);
            }

            @Override // com.platform.usercenter.account.mba.IResultCallback
            public final void onOpenView() {
            }
        }

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IAcMBADispatcher iAcMBADispatcher = i.f483c.b;
            if (iAcMBADispatcher != null) {
                iAcMBADispatcher.startMBADialog(this.a, this.b);
                return;
            }
            try {
                PackageManager packageManager = this.a.getPackageManager();
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.b, 0);
                ApplicationInfo applicationInfo2 = packageManager.getApplicationInfo(this.a.getPackageName(), 0);
                CharSequence charSequenceLoadLabel = applicationInfo.loadLabel(packageManager);
                new OutsideApk.Builder(this.a).setTitle(this.a.getString(R.string.dialog_app_forbidden_title, charSequenceLoadLabel)).setMessage(this.a.getString(R.string.dialog_app_forbidden_detail, charSequenceLoadLabel, applicationInfo2.loadLabel(packageManager))).forceEnabled(this.b).resultCallback(new C0991a()).build().launch();
            } catch (Exception e2) {
                UCLogUtil.e(AcAppUtils.TAG, e2);
            }
        }
    }

    public static boolean checkEnable(Context context, String str) {
        if (SDK_VERSION_INT >= 30 && !TextUtils.isEmpty(str) && !context.getPackageName().equals(str)) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 512);
                if (applicationInfo != null && !applicationInfo.enabled) {
                    UCLogUtil.e(TAG, str + " has disabled");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                UCLogUtil.e(TAG, e2);
            }
        }
        return true;
    }

    public static String encrypt(String str, int i) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i2 = 0; i2 < length; i2++) {
            bytes[i2] = (byte) (bytes[i2] ^ i);
        }
        return new String(bytes);
    }

    public static String getNumLargeSmallLetter(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        Random randomGenerateRandom = RandomFactory.generateRandom();
        for (int i2 = 0; i2 < i; i2++) {
            if (randomGenerateRandom.nextInt(2) % 2 != 0) {
                stringBuffer.append(randomGenerateRandom.nextInt(10));
            } else if (randomGenerateRandom.nextInt(2) % 2 == 0) {
                stringBuffer.append((char) (randomGenerateRandom.nextInt(27) + 65));
            } else {
                stringBuffer.append((char) (randomGenerateRandom.nextInt(27) + 97));
            }
        }
        return stringBuffer.toString();
    }

    public static void showMBADialog(Context context, String str) {
        BackgroundExecutor.runOnUiThread(new a(context, str));
    }
}
