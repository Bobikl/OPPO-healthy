package com.xingin.xhssharesdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.b7n;
import com.oplus.aiunit.vision.bdm;
import com.oplus.aiunit.vision.idm;
import com.oplus.aiunit.vision.ksm;
import com.oplus.aiunit.vision.l7n;
import com.oplus.aiunit.vision.n2n;
import com.oplus.aiunit.vision.pim;
import com.oplus.aiunit.vision.qmm;
import com.oplus.aiunit.vision.qzm;
import com.oplus.aiunit.vision.rzm;
import com.oplus.aiunit.vision.v6n;
import com.oplus.aiunit.vision.wym;
import com.oplus.aiunit.vision.xim;
import com.oplus.aiunit.vision.xum;
import com.oplus.aiunit.vision.xym;
import com.oplus.aiunit.vision.yim;
import com.oplus.aiunit.vision.zim;
import com.xingin.xhssharesdk.XhsShareConstants$XhsShareNoteErrorCode;
import com.xingin.xhssharesdk.XhsShareConstants$XhsShareNoteNewErrorCode;
import com.xingin.xhssharesdk.XhsShareSdkTools;
import com.xingin.xhssharesdk.callback.XhsShareCallback;
import com.xingin.xhssharesdk.callback.XhsShareRegisterCallback;
import com.xingin.xhssharesdk.core.XhsShareSdk;
import com.xingin.xhssharesdk.model.config.XhsShareGlobalConfig;
import com.xingin.xhssharesdk.model.sharedata.XhsNote;
import java.lang.ref.WeakReference;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class XhsShareSdk {
    public static volatile qmm a;
    public static String b;

    public static void a(XhsShareCallback xhsShareCallback, bdm bdmVar, int i, String str) {
        if (xhsShareCallback != null) {
            xhsShareCallback.onError2(bdmVar.a, i, XhsShareConstants$XhsShareNoteErrorCode.REPEAT_SHARE, str, null);
        }
    }

    public static void b(String str, String str2) {
        if (a != null) {
            a.f15857n.d(str, str2);
        }
    }

    public static void c(String str, String str2, @Nullable Throwable th) {
        if (a != null) {
            a.f15857n.e(str, str2, th);
        }
    }

    public static void d(String str, String str2, @Nullable Throwable th) {
        if (a != null) {
            a.f15857n.w(str, str2, th);
        }
    }

    @Keep
    private static String getCachePath() {
        if (a == null) {
            return "";
        }
        qmm qmmVar = a;
        return TextUtils.isEmpty(qmmVar.f15853c.getCacheDirPath()) ? XhsShareSdkTools.getDefaultCacheDirPath(qmmVar.a) : qmmVar.f15853c.getCacheDirPath();
    }

    @Keep
    public static void openUrlInXhs(Context context, String str) {
        Uri uri;
        String str2;
        try {
            uri = Uri.parse(str);
        } catch (Throwable th) {
            c("XhsShare_Sdk", "Parse url error", th);
            uri = null;
        }
        if (uri == null) {
            return;
        }
        if (XhsShareSdkTools.isXhsInstalled(context)) {
            String scheme = uri.getScheme();
            if (!TextUtils.equals("http", scheme) && !TextUtils.equals(Const.Scheme.SCHEME_HTTPS, scheme)) {
                c("XhsShare_Sdk", "Scheme must be http pr https url!", null);
                return;
            }
            try {
                Uri uri2 = Uri.parse(str.replace("https://", "xhsdiscover://webview/"));
                Intent intent = new Intent();
                intent.setData(uri2);
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    throw new Exception("resolveActivity get null!");
                }
                context.startActivity(intent);
                return;
            } catch (Throwable th2) {
                th = th2;
                str2 = "Open url in Xhs error!";
            }
        } else {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.xiaohongshu.com/activity/sem/walle?groupid=64a3b9a0656df000019fdfd3&template=A050001&nocache=nocache&source=openplatform_default")));
                return;
            } catch (Throwable th3) {
                th = th3;
                str2 = "Open download url error!";
            }
        }
        c("XhsShare_Sdk", str2, th);
    }

    @Keep
    public static void registerApp(Context context, String str, XhsShareGlobalConfig xhsShareGlobalConfig, XhsShareRegisterCallback xhsShareRegisterCallback) {
        int currentAppVersionCode;
        if (a != null) {
            d("XhsShare_Sdk", "The XhsShare has registered, can not register again!!", null);
        }
        b("XhsShare_Sdk", "Start register!");
        Context applicationContext = context.getApplicationContext();
        a = new qmm(applicationContext, str, xhsShareGlobalConfig);
        qmm qmmVar = a;
        qmmVar.f15854e = xhsShareRegisterCallback;
        if (TextUtils.isEmpty(qmmVar.b)) {
            qmmVar.f15857n.e("XhsShare_Sdk", "Token can not be Empty!", null);
            XhsShareRegisterCallback xhsShareRegisterCallback2 = qmmVar.f15854e;
            if (xhsShareRegisterCallback2 != null) {
                xhsShareRegisterCallback2.onError(0, "Token can not be Empty!", null);
            }
        } else {
            xim.a = qmmVar.f15857n;
            XhsShareRegisterCallback xhsShareRegisterCallback3 = qmmVar.f15854e;
            if (xhsShareRegisterCallback3 != null) {
                xhsShareRegisterCallback3.onSuccess();
            }
        }
        v6n.a = new xym();
        String currentAppVersionName = "";
        try {
            currentAppVersionCode = XhsShareSdkTools.getCurrentAppVersionCode(applicationContext);
            try {
                currentAppVersionName = XhsShareSdkTools.getCurrentAppVersionName(applicationContext);
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                d("XhsShare_Sdk", "GetVersion error", e);
            }
        } catch (PackageManager.NameNotFoundException e3) {
            e = e3;
            currentAppVersionCode = -1;
        }
        ksm ksmVarH = ksm.h();
        String str2 = Build.MODEL;
        String did = XhsShareSdkTools.getDid(applicationContext);
        int i = Build.VERSION.SDK_INT;
        String str3 = Build.VERSION.RELEASE;
        rzm rzmVar = new rzm();
        synchronized (ksmVarH) {
            if (ksmVarH.a.compareAndSet(false, true)) {
                pim.a = 1663676756;
                xum xumVar = new xum();
                xumVar.a = did;
                xumVar.f18772c = i;
                xumVar.b = str3;
                xumVar.d = str2;
                xumVar.h = rzmVar;
                xumVar.g = currentAppVersionCode;
                xumVar.f18773e = 26;
                xumVar.f = currentAppVersionName;
                xum.i = xumVar;
                v6n.a("init() TrackerConfig=%s", xumVar);
                n2n n2nVar = n2n.f;
                n2nVar.i = xumVar.a;
                n2nVar.f14320j = xumVar.b;
                n2nVar.k = xumVar.f18772c;
                n2nVar.f14321l = null;
                n2nVar.m = xumVar.d;
                wym wymVar = wym.f18446e;
                wymVar.f18447j = xumVar.f18773e;
                wymVar.k = xumVar.f;
                wymVar.f18448l = xumVar.g;
                ksmVarH.f19508e = new b7n(applicationContext, ksmVarH.d);
                ksmVarH.f = new l7n(ksmVarH.d, ksmVarH.f19508e);
                ksmVarH.c();
            } else {
                v6n.a(" %s tracker lite has been initialized", ksmVarH.d.a);
            }
        }
    }

    @Keep
    public static void setShareCallback(@Nullable XhsShareCallback xhsShareCallback) {
        if (a != null) {
            a.f = xhsShareCallback;
        } else {
            c("XhsShare_Sdk", "setShareCallback invoke can not before registerApp invoke!", null);
        }
    }

    @NonNull
    @Keep
    public static String shareNote(Context context, XhsNote xhsNote) {
        boolean z;
        String string = "";
        if (a == null) {
            c("XhsShare_Sdk", "shareNote invoke can not before registerApp invoke!", null);
            return "";
        }
        final bdm bdmVar = new bdm(xhsNote);
        try {
            string = xhsNote.toJsonForDeeplink().toString();
        } catch (JSONException e2) {
            d("XhsShare_Sdk", "note.toJsonForDeeplink() error!", e2);
        }
        String str = bdmVar.a;
        String noteType = xhsNote.getNoteType();
        ksm ksmVarH = ksm.h();
        qzm.a aVarA = idm.a(context);
        aVarA.f16005c = 3;
        aVarA.b = 30756;
        aVarA.d.put("session_id", str);
        aVarA.d.put(SensorsBean.SHARE_TYPE, "NOTE");
        aVarA.d.put("note_type", noteType);
        aVarA.d.put("note_data_json", string);
        ksmVarH.d(aVarA);
        qmm qmmVar = a;
        bdm bdmVar2 = qmmVar.i;
        boolean z2 = false;
        if (bdmVar2 == null ? false : bdmVar2.f9692c) {
            z = false;
        } else {
            qmmVar.i = bdmVar;
            bdmVar.f9692c = true;
            zim zimVar = bdmVar.b;
            if (!TextUtils.isEmpty(zimVar.a) && TextUtils.equals(bdmVar.a, zimVar.a)) {
                if (zimVar.b != 0) {
                    d("ShareTimelineTracker", "startShareTimestamp has be assigned!", null);
                } else {
                    zimVar.b = System.currentTimeMillis();
                }
            }
            z = true;
        }
        if (!z) {
            d("XhsShare_Sdk", "Last share flow has not end!, isNeedRegisterReceiverWithOutsideActivity = " + a.f15853c.isNeedRegisterReceiverWithOutsideActivity(), null);
            if (!a.f15853c.isNeedRegisterReceiverWithOutsideActivity()) {
                final String str2 = "Last share not over yet!!";
                d("XhsShare_Sdk", "Last share not over yet!!", null);
                idm.b(context, bdmVar.a, false, XhsShareConstants$XhsShareNoteNewErrorCode.REPEAT_SHARE, "Last share not over yet!!", 0L);
                final XhsShareCallback xhsShareCallback = a.f;
                final int i = XhsShareConstants$XhsShareNoteNewErrorCode.REPEAT_SHARE;
                yim.a(new Runnable() { // from class: com.oplus.aiunit.vision.i7m
                    @Override // java.lang.Runnable
                    public final void run() {
                        XhsShareSdk.a(xhsShareCallback, bdmVar, i, str2);
                    }
                });
                return bdmVar.a;
            }
            a.g(a.c(), XhsShareConstants$XhsShareNoteNewErrorCode.SHARE_NOT_GET_RESULT_FROM_XHS, XhsShareConstants$XhsShareNoteErrorCode.UNKNOWN, "Replace by new share.", null, false);
            qmm qmmVar2 = a;
            bdm bdmVar3 = qmmVar2.i;
            if (!(bdmVar3 == null ? false : bdmVar3.f9692c)) {
                qmmVar2.i = bdmVar;
                bdmVar.f9692c = true;
                zim zimVar2 = bdmVar.b;
                String str3 = bdmVar.a;
                if (!TextUtils.isEmpty(zimVar2.a) && TextUtils.equals(str3, zimVar2.a)) {
                    z2 = true;
                }
                if (z2) {
                    if (zimVar2.b != 0) {
                        d("ShareTimelineTracker", "startShareTimestamp has be assigned!", null);
                    } else {
                        zimVar2.b = System.currentTimeMillis();
                    }
                }
                z2 = true;
            }
            b("XhsShare_Sdk", "setupShareContext Result is " + z2);
        }
        b("XhsShare_Sdk", "Start Share, sessionId is " + bdmVar.a);
        Intent intent = new Intent(context, (Class<?>) XhsShareActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("XHS_SHARE_NOTE_KEY", xhsNote);
        intent.putExtra("XHS_SHARE_SESSION_ID", bdmVar.a);
        intent.putExtra("XHS_SHARE_START_TIMESTAMP", bdmVar.b.b);
        intent.putExtra("XHS_SHARE_FLAG", "SHARE");
        try {
            context.startActivity(intent);
            qmm qmmVar3 = a;
            if (qmmVar3.f15853c.isNeedRegisterReceiverWithOutsideActivity() && (context instanceof Activity)) {
                qmmVar3.f15857n.d("XhsShare_Sdk", "setup OutsideActivity!");
                qmmVar3.m = new WeakReference<>((Activity) context);
            }
        } catch (Throwable th) {
            XhsShareCallback xhsShareCallback2 = a.f;
            if (xhsShareCallback2 != null) {
                xhsShareCallback2.onError2(bdmVar.a, XhsShareConstants$XhsShareNoteNewErrorCode.OPEN_XHS_SHARE_ACTIVITY_ERROR, XhsShareConstants$XhsShareNoteErrorCode.START_ACTIVITY_ERROR, "startActivity error", th);
            }
            a.f15857n.e("XhsShare_Sdk", "startActivity error", th);
        }
        return bdmVar.a;
    }
}
