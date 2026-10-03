package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class prj {
    public static final int REQUEST_LOGIN = 10001;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static prj f15456c;
    public final dmm a;
    public String b;

    public prj(String str, Context context) {
        this.a = dmm.a(str, context);
    }

    public static boolean a(Context context, String str) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 128);
            try {
                context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                q8g.f("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n" + ("没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>"));
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            q8g.f("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity" + (("没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent" + str + "\" />,详细信息请查看官网文档.") + "\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent" + str + "\" />\n</intent-filter>\n</activity>"));
            return false;
        }
    }

    public static synchronized prj b(String str, Context context) {
        uum.c(context.getApplicationContext());
        q8g.i("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str);
        if (TextUtils.isEmpty(str)) {
            q8g.f("openSDK_LOG.Tencent", "appId should not be empty!");
            return null;
        }
        prj prjVar = f15456c;
        if (prjVar == null) {
            f15456c = new prj(str, context);
        } else if (!str.equals(prjVar.d())) {
            f15456c.h(context);
            f15456c = new prj(str, context);
        }
        if (!a(context, str)) {
            return null;
        }
        com.tencent.open.utils.a.d(context, str);
        q8g.i("openSDK_LOG.Tencent", "createInstance()  -- end");
        return f15456c;
    }

    public static synchronized prj c(String str, Context context, String str2) {
        prj prjVarB;
        prjVarB = b(str, context);
        q8g.i("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str + ", authorities=" + str2);
        if (prjVarB != null) {
            prjVarB.b = str2;
        } else {
            q8g.i("openSDK_LOG.Tencent", "null == tencent set mAuthorities fail");
        }
        return prjVarB;
    }

    public static synchronized String e(String str) {
        if (TextUtils.isEmpty(str)) {
            q8g.i("openSDK_LOG.Tencent", "TextUtils.isEmpty(appId)");
            return null;
        }
        prj prjVar = f15456c;
        if (prjVar != null) {
            return str.equals(prjVar.d()) ? f15456c.b : "";
        }
        q8g.i("openSDK_LOG.Tencent", "sInstance == null");
        return null;
    }

    public static boolean g(Context context) {
        q8g.i("openSDK_LOG.Tencent", "isSupportShareToQQ()");
        boolean z = true;
        if (com.tencent.open.utils.b.A(context) && yzm.e(context, s04.PACKAGE_QQ_PAD) != null) {
            return true;
        }
        if (yzm.j(context, "4.1") < 0 && yzm.e(context, s04.PACKAGE_TIM) == null && yzm.e(context, s04.PACKAGE_QQ_SPEED) == null) {
            z = false;
        }
        q8g.i("openSDK_LOG.Tencent", "isSupportShareToQQ() support=" + z);
        return z;
    }

    public String d() {
        String strH = this.a.c().h();
        q8g.i("openSDK_LOG.Tencent", "getAppId() appid =" + strH);
        return strH;
    }

    public boolean f(Context context) {
        boolean zI = yzm.i(context);
        q8g.i("openSDK_LOG.Tencent", "isQQInstalled() installed=" + zI);
        return zI;
    }

    public void h(Context context) {
        q8g.i("openSDK_LOG.Tencent", "logout()");
        this.a.c().n(null, "0");
        this.a.c().o(null);
        this.a.c().m(this.a.c().h());
    }

    public void i(Activity activity, Bundle bundle, iz9 iz9Var) {
        q8g.i("openSDK_LOG.Tencent", "shareToQQ()");
        if (TextUtils.isEmpty(this.b)) {
            iz9Var.onWarning(-19);
        }
        new o4f(activity, this.a.c()).o(activity, bundle, iz9Var);
    }
}
