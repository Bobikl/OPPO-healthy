package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.Toast;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.oppo.lib.common.R$string;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public class x81 {
    public static HashMap<String, String> APP_WHITE_LIST = null;
    public static final int INVALID_REQUST_CODE = -99999999;
    public static String KEY_ENCODE = "ed";
    public static String KEY_INTENT = "intent:";
    public static String KEY_IS_MODAL = "IS_MODAL";
    public static String KEY_LAYOUT_ID = "layoutID";
    public static final String KEY_NEED_OPPO_ACCOUNT = "&k_n_o_a=1";
    public static String KEY_TITLE = "title";
    public static String KEY_TITLE_LINE = "title_line";
    public static String KEY_TITLE_SHOW = "title_show";
    public static final String KEY_URL = "url";
    public static String KEY_USER_AUTH_CODE = "userAuthCode";
    public static final String MARKET_JINJINJIAPP = "market://details?id=cn.com.bmac.nfc";
    public static final String SCHEMA_INNER = "heytaphealth://com.heytap.health";
    public static final int invalidJudgeFlag = 0;
    public static final int invalidRequstCode = -99999999;
    public Context a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f18526c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18527e;
    public q50 f;
    public NavigationCallback g;

    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Intent f18528j;

        public a(Context context, Intent intent) {
            this.i = context;
            this.f18528j = intent;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            this.i.startActivity(this.f18528j);
        }
    }

    public static class b {
        public Context a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bundle f18529c;
        public int d = -99999999;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f18530e = 0;
        public q50 f;
        public NavigationCallback g;

        public b(Context context) {
            this.a = context;
        }

        public b h(q50 q50Var) {
            this.f = q50Var;
            return this;
        }

        public b i(Bundle bundle) {
            this.f18529c = bundle;
            return this;
        }

        public x81 j() {
            return new x81(this);
        }

        public b k(int i) {
            this.f18530e = i;
            return this;
        }

        public b l(NavigationCallback navigationCallback) {
            this.g = navigationCallback;
            return this;
        }

        public b m(int i) {
            this.d = i;
            return this;
        }

        public b n(String str) {
            this.b = str;
            return this;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        APP_WHITE_LIST = map;
        map.put("com.tencent.mm", "");
        APP_WHITE_LIST.put(com.alipay.sdk.m.u.a.b, "");
        APP_WHITE_LIST.put("com.heytap.health", "");
        APP_WHITE_LIST.put(sae.SECURITY_PAY_PACKAGENAME, "");
        APP_WHITE_LIST.put("com.redteamobile.roaming", "");
        APP_WHITE_LIST.put("profilesys.bydauto.com.cn", "");
    }

    public static void a(Context context, Intent intent) {
        i(context, intent);
    }

    public static boolean b(Context context, String str) {
        try {
            Intent uri = Intent.parseUri(str, 1);
            uri.addCategory("android.intent.category.BROWSABLE");
            uri.setComponent(null);
            uri.setSelector(null);
            uri.setClipData(ClipData.newPlainText(null, null));
            ActivityInfo activityInfoResolveActivityInfo = uri.resolveActivityInfo(qz0.mContext.getPackageManager(), 65536);
            if (activityInfoResolveActivityInfo == null) {
                Toast.makeText(context, R$string.service_not_support, 0).show();
                return false;
            }
            ApplicationInfo applicationInfo = activityInfoResolveActivityInfo.applicationInfo;
            if ((applicationInfo.flags & 1) != 1 && !APP_WHITE_LIST.containsKey(applicationInfo.packageName)) {
                a(context, uri);
                return true;
            }
            context.startActivity(uri);
            return true;
        } catch (Exception e2) {
            t6b.d("BaseSchemeUtils", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            ActivityInfo activityInfoResolveActivityInfo2 = intent.resolveActivityInfo(context.getPackageManager(), 65536);
            if (activityInfoResolveActivityInfo2 != null) {
                ApplicationInfo applicationInfo2 = activityInfoResolveActivityInfo2.applicationInfo;
                if ((applicationInfo2.flags & 1) == 1 || APP_WHITE_LIST.containsKey(applicationInfo2.packageName)) {
                    context.startActivity(intent);
                    return true;
                }
                new HealthAlertDialogBuilder(context).setTitle(context.getString(R$string.wallet_dialog_no_title)).setMessage(context.getString(R$string.third_app_open, context.getPackageManager().getApplicationLabel(activityInfoResolveActivityInfo2.applicationInfo))).setPositiveButton(context.getString(R$string.need_perssion_dialog_allow), new a(context, intent)).setNegativeButton(context.getString(R$string.dialog_tips_cancel), null).show();
                return true;
            }
            Toast.makeText(context, R$string.service_not_support, 0).show();
        }
    }

    public static boolean c(Context context, String str) {
        return new b(context).n(str).j().j();
    }

    public static boolean d(Context context, String str, Bundle bundle) {
        return e(context, str, bundle, -99999999);
    }

    public static boolean e(Context context, String str, Bundle bundle, int i) {
        return f(context, str, bundle, i, 0);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a9 A[Catch: Exception -> 0x00b6, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b6, blocks: (B:24:0x0096, B:26:0x009a, B:27:0x00a9), top: B:67:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x010c A[Catch: Exception -> 0x0114, TRY_LEAVE, TryCatch #2 {Exception -> 0x0114, blocks: (B:42:0x00fe, B:44:0x0102, B:45:0x010c), top: B:70:0x00fe }] */
    public static boolean f(Context context, String str, Bundle bundle, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        t6b.b("forwardUrl", "schemeUrl: " + str);
        String strTrim = str.trim();
        if (strTrim.contains(KEY_INTENT)) {
            return false;
        }
        if (strTrim.contains(KEY_NEED_OPPO_ACCOUNT)) {
            strTrim = strTrim.replace(KEY_NEED_OPPO_ACCOUNT, "");
        }
        if (!strTrim.contains("://")) {
            strTrim = SCHEMA_INNER + strTrim;
        }
        if (!strTrim.startsWith(SCHEMA_INNER)) {
            if (URLUtil.isHttpsUrl(strTrim) || URLUtil.isHttpUrl(strTrim)) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("url", strTrim);
                x0.d().b("/main/web").with(bundle).navigation(context);
                return true;
            }
            t6b.b("forwardUrl", "forwardOuter: " + strTrim);
            return b(context, strTrim);
        }
        Uri uri = Uri.parse(strTrim);
        t6b.b("forwardUrl", "uri: " + uri);
        try {
            Postcard postcardA = x0.d().a(uri);
            if (i2 != 0) {
                postcardA = postcardA.withFlags(i2);
            }
            if (strTrim.contains("/main/index")) {
                if (i != -99999999) {
                    try {
                        if (context instanceof Activity) {
                            postcardA.with(bundle).withFlags(335577088).navigation((Activity) context, i);
                        } else {
                            postcardA.with(bundle).withFlags(335577088).navigation(context);
                        }
                    } catch (Exception e2) {
                        t6b.c("INDEX e = " + e2.getMessage());
                    }
                } else {
                    postcardA.with(bundle).withFlags(335577088).navigation(context);
                }
            } else if (strTrim.contains("/main/web")) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("url", uri.getQueryParameter("url"));
                if (i == -99999999 || !(context instanceof Activity)) {
                    postcardA.with(bundle).navigation(context);
                } else {
                    postcardA.with(bundle).navigation((Activity) context, i);
                }
            } else if (i != -99999999) {
                try {
                    if (context instanceof Activity) {
                        postcardA.with(bundle).navigation((Activity) context, i);
                    } else {
                        postcardA.with(bundle).navigation(context);
                    }
                } catch (Exception e3) {
                    t6b.c("uri:" + uri + "WEB e = " + e3.getMessage());
                }
            } else {
                postcardA.with(bundle).navigation(context);
            }
            return true;
        } catch (Exception e4) {
            t6b.c("SCHEMA_INNER e = " + e4.getMessage());
            return false;
        }
    }

    @Deprecated
    public static boolean g(Context context, String str, Bundle bundle, int i, int i2, q50 q50Var) {
        return h(context, str, bundle, i, i2, q50Var, null);
    }

    @Deprecated
    public static boolean h(Context context, String str, Bundle bundle, int i, int i2, q50 q50Var, NavigationCallback navigationCallback) {
        return new b(context).n(str).i(bundle).m(i).k(i2).h(q50Var).l(navigationCallback).j().j();
    }

    public static void i(Context context, Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Exception e2) {
            t6b.h("goToTargetActivity exception" + e2.getMessage());
        }
    }

    public boolean j() {
        mzf.a(this.a);
        t6b.h("schemeUrl:" + this.b);
        if (TextUtils.isEmpty(this.b)) {
            return false;
        }
        String strB = nmk.b(this.b.trim());
        if (strB.contains(KEY_INTENT)) {
            return false;
        }
        if (!strB.contains("://")) {
            strB = SCHEMA_INNER + strB;
        }
        if (!strB.startsWith(SCHEMA_INNER)) {
            if (!URLUtil.isHttpsUrl(strB) && !URLUtil.isHttpUrl(strB)) {
                return b(this.a, strB);
            }
            if (this.f18526c == null) {
                this.f18526c = new Bundle();
            }
            this.f18526c.putString("url", strB);
            Postcard postcardB = x0.d().b("/main/web");
            q50 q50Var = this.f;
            if (q50Var != null) {
                postcardB.withTransition(q50Var.a(), this.f.b());
                this.f18526c.putBoolean(KEY_IS_MODAL, true);
            } else {
                this.f18526c.putBoolean(KEY_IS_MODAL, false);
            }
            postcardB.with(this.f18526c).navigation(this.a, this.g);
            return true;
        }
        Uri uri = Uri.parse(strB);
        try {
            Postcard postcardA = x0.d().a(uri);
            int i = this.f18527e;
            if (i != 0) {
                postcardA = postcardA.withFlags(i);
            }
            q50 q50Var2 = this.f;
            if (q50Var2 != null) {
                postcardA.withTransition(q50Var2.a(), this.f.b());
            }
            if (strB.contains("/main/index")) {
                try {
                    if (this.d == -99999999 || !(this.a instanceof Activity)) {
                        postcardA.with(this.f18526c).withFlags(335577088).navigation(this.a, this.g);
                    } else {
                        postcardA.with(this.f18526c).withFlags(335577088).navigation((Activity) this.a, this.d, this.g);
                    }
                } catch (Exception e2) {
                    t6b.e("Main.INDEX e = " + e2.getMessage());
                }
            } else if (strB.contains("/main/web")) {
                if (this.f18526c == null) {
                    this.f18526c = new Bundle();
                }
                this.f18526c.putString("url", uri.getQueryParameter("url"));
                if (this.d == -99999999 || !(this.a instanceof Activity)) {
                    postcardA.with(this.f18526c).navigation(this.a, this.g);
                } else {
                    postcardA.with(this.f18526c).navigation((Activity) this.a, this.d, this.g);
                }
            } else {
                try {
                    if (this.d == -99999999 || !(this.a instanceof Activity)) {
                        postcardA.with(this.f18526c).navigation(this.a, this.g);
                    } else {
                        postcardA.with(this.f18526c).navigation((Activity) this.a, this.d, this.g);
                    }
                } catch (Exception e3) {
                    t6b.e("uri:" + uri + " " + e3.getMessage());
                }
            }
            return true;
        } catch (Exception e4) {
            t6b.a("SCHEMA_INNER e =" + e4.getMessage());
            return false;
        }
    }

    public x81(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f18526c = bVar.f18529c;
        this.d = bVar.d;
        this.f18527e = bVar.f18530e;
        this.f = bVar.f;
        this.g = bVar.g;
    }
}
