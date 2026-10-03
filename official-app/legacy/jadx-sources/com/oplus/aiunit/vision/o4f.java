package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.content.FileProvider;
import com.heytap.health.bitmap.BitmapProviderService;
import com.heytap.log.config.LogMemoryConfig;
import com.tencent.open.TDialog;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class o4f extends nz0 {
    public static final int QQ_SHARE_SUMMARY_MAX_LENGTH = 512;
    public static final int QQ_SHARE_TITLE_MAX_LENGTH = 128;
    public static final String SHARE_TO_QQ_APP_NAME = "appName";
    public static final String SHARE_TO_QQ_ARK_INFO = "share_to_qq_ark_info";
    public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final int SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN = 1;
    public static final int SHARE_TO_QQ_FLAG_QZONE_ITEM_HIDE = 2;
    public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final String SHARE_TO_QQ_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QQ_MINI_PROGRAM = 7;
    public static final String SHARE_TO_QQ_MINI_PROGRAM_APPID = "mini_program_appid";
    public static final String SHARE_TO_QQ_MINI_PROGRAM_PATH = "mini_program_path";
    public static final String SHARE_TO_QQ_MINI_PROGRAM_TYPE = "mini_program_type";
    public static final String SHARE_TO_QQ_SITE = "site";
    public static final String SHARE_TO_QQ_SUMMARY = "summary";
    public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final String SHARE_TO_QQ_TITLE = "title";
    public static final int SHARE_TO_QQ_TYPE_AUDIO = 2;
    public static final int SHARE_TO_QQ_TYPE_DEFAULT = 1;
    public static final int SHARE_TO_QQ_TYPE_IMAGE = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14770c;

    public class a implements upm {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f14771c;
        public final /* synthetic */ iz9 d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Activity f14772e;

        public a(Bundle bundle, String str, String str2, iz9 iz9Var, Activity activity) {
            this.a = bundle;
            this.b = str;
            this.f14771c = str2;
            this.d = iz9Var;
            this.f14772e = activity;
        }

        @Override // com.oplus.aiunit.vision.upm
        public void a(int i, ArrayList<String> arrayList) {
        }

        @Override // com.oplus.aiunit.vision.upm
        public void a(int i, String str) {
            if (i == 0) {
                this.a.putString(o4f.SHARE_TO_QQ_IMAGE_LOCAL_URL, str);
            } else if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.f14771c)) {
                iz9 iz9Var = this.d;
                if (iz9Var != null) {
                    iz9Var.onError(new yfk(-6, s04.MSG_SHARE_GETIMG_ERROR, null));
                    q8g.f("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                }
                spm.a().b(1, "SHARE_CHECK_SDK", "1000", o4f.this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, s04.MSG_SHARE_GETIMG_ERROR);
                return;
            }
            o4f.this.n(this.f14772e, this.a, this.d);
        }
    }

    public o4f(Context context, p4f p4fVar) {
        super(p4fVar);
        this.f14770c = "";
    }

    public final void k(Activity activity, Bundle bundle, iz9 iz9Var) {
        q8g.i("openSDK_LOG.QQShare", "shareToMobileQQ() -- start.");
        String string = bundle.getString("imageUrl");
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("summary");
        q8g.j("openSDK_LOG.QQShare", "shareToMobileQQ -- imageUrl: " + string);
        if (TextUtils.isEmpty(string)) {
            if (bundle.getInt(SHARE_TO_QQ_KEY_TYPE, 1) == 5) {
                m(activity, bundle, iz9Var);
            } else {
                n(activity, bundle, iz9Var);
            }
        } else if (!com.tencent.open.utils.b.H(string)) {
            bundle.putString("imageUrl", null);
            if (com.tencent.open.utils.b.F(activity, "4.3.0")) {
                q8g.d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is < 4.3.0 ");
                n(activity, bundle, iz9Var);
            } else {
                q8g.d("openSDK_LOG.QQShare", "shareToMobileQQ -- QQ Version is > 4.3.0:isAppSpecificDir=" + com.tencent.open.utils.b.N(string) + ",hasSDPermission:" + com.tencent.open.utils.b.z());
                e9m.e(activity, string, new b(bundle, string2, string3, iz9Var, activity));
            }
        } else if (com.tencent.open.utils.b.F(activity, "4.3.0")) {
            new kkm(activity).d(string, new a(bundle, string2, string3, iz9Var, activity));
        } else {
            n(activity, bundle, iz9Var);
        }
        q8g.i("openSDK_LOG.QQShare", "shareToMobileQQ() -- end");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00d4  */
    public final void m(Activity activity, Bundle bundle, iz9 iz9Var) {
        String str;
        String string = bundle.getString(SHARE_TO_QQ_IMAGE_LOCAL_URL);
        String str2 = null;
        if (new File(string).length() >= BitmapProviderService.BITMAP_MAX_SIZE) {
            if (iz9Var != null) {
                iz9Var.onError(new yfk(-16, s04.MSG_SHARE_IMAGE_TOO_LARGE_ERROR, null));
            }
            q8g.f("openSDK_LOG.QQShare", "doShareImageToQQ -- error: 图片太大，请压缩到5M内再分享!");
            return;
        }
        File fileB = uum.b("Images");
        if (fileB != null) {
            str2 = fileB.getAbsolutePath() + File.separator + s04.QQ_SHARE_TEMP_DIR;
        } else {
            q8g.i("openSDK_LOG.QQShare", "doShareImageToQQ() getExternalFilesDir return null");
        }
        File file = new File(string);
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        boolean zN = com.tencent.open.utils.b.N(absolutePath);
        q8g.i("openSDK_LOG.QQShare", "doShareImageToQQ() check file: isAppSpecificDir=" + zN + ",hasSDPermission=" + com.tencent.open.utils.b.z() + ",fileDir=" + absolutePath);
        ArrayList<String> arrayList = new ArrayList<>(2);
        if (zN || TextUtils.isEmpty(str2)) {
            str = absolutePath;
        } else {
            str = str2 + File.separator + name;
            boolean zO = com.tencent.open.utils.b.o(activity, absolutePath, str);
            q8g.i("openSDK_LOG.QQShare", "doShareImageToQQ() sd permission not denied. copy to app specific:" + str + ",isSuccess=" + zO);
            if (!zO) {
                str = absolutePath;
            }
        }
        arrayList.add(absolutePath);
        arrayList.add(str);
        q8g.i("openSDK_LOG.QQShare", "doShareImageToQQ() destFilePaths=[" + arrayList.get(0) + "," + arrayList.get(1) + "]");
        bundle.putStringArrayList("imageLocalUrlArray", arrayList);
        n(activity, bundle, iz9Var);
    }

    public final void n(Activity activity, Bundle bundle, iz9 iz9Var) {
        int i;
        q8g.i("openSDK_LOG.QQShare", "doShareToQQ() -- start");
        StringBuffer stringBuffer = new StringBuffer("mqqapi://share/to_fri?src_type=app&version=1&file_type=news");
        String string = bundle.getString("imageUrl");
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("summary");
        String string4 = bundle.getString(SHARE_TO_QQ_TARGET_URL);
        String string5 = bundle.getString(SHARE_TO_QQ_AUDIO_URL);
        int i2 = bundle.getInt(SHARE_TO_QQ_KEY_TYPE, 1);
        String string6 = bundle.getString(SHARE_TO_QQ_ARK_INFO);
        String string7 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string8 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_PATH);
        String string9 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_TYPE);
        int i3 = bundle.getInt(SHARE_TO_QQ_EXT_INT, 0);
        String string10 = bundle.getString(SHARE_TO_QQ_EXT_STR);
        String strG = com.tencent.open.utils.b.g(activity);
        if (strG == null) {
            strG = bundle.getString("appName");
        }
        String str = strG;
        String string11 = bundle.getString(SHARE_TO_QQ_IMAGE_LOCAL_URL);
        ArrayList<String> stringArrayList = bundle.getStringArrayList("imageLocalUrlArray");
        String strH = this.b.h();
        String strJ = this.b.j();
        q8g.i("openSDK_LOG.QQShare", "doShareToQQ -- openid: " + strJ + ",appName=" + str);
        if (stringArrayList != null && stringArrayList.size() >= 2) {
            String str2 = stringArrayList.get(0);
            if (str2 == null) {
                str2 = "";
            }
            stringBuffer.append("&file_data=" + Base64.encodeToString(com.tencent.open.utils.b.K(str2), 2));
            String str3 = stringArrayList.get(1);
            if (i2 == 7 && !TextUtils.isEmpty(str3) && yzm.j(activity, "8.3.3") < 0) {
                q8g.f("openSDK_LOG.QQShare", "doShareToQQ() share to mini program set file uri empty");
                str3 = null;
            }
            if (!TextUtils.isEmpty(str3)) {
                try {
                    File file = new File(str3);
                    String strE = prj.e(strH);
                    if (!TextUtils.isEmpty(strE)) {
                        Uri uriForFile = FileProvider.getUriForFile(activity, strE, file);
                        activity.grantUriPermission("com.tencent.mobileqq", uriForFile, 3);
                        stringBuffer.append("&file_uri=");
                        stringBuffer.append(Base64.encodeToString(com.tencent.open.utils.b.K(uriForFile.toString()), 2));
                    }
                } catch (Exception e2) {
                    q8g.g("openSDK_LOG.QQShare", "doShareToQQ() getUriForFile exception:", e2);
                }
            }
        } else if (!TextUtils.isEmpty(string11)) {
            stringBuffer.append("&file_data=" + Base64.encodeToString(com.tencent.open.utils.b.K(string11), 2));
        }
        if (!TextUtils.isEmpty(string)) {
            stringBuffer.append("&image_url=" + Base64.encodeToString(com.tencent.open.utils.b.K(string), 2));
        }
        if (!TextUtils.isEmpty(string2)) {
            stringBuffer.append("&title=" + Base64.encodeToString(com.tencent.open.utils.b.K(string2), 2));
        }
        if (!TextUtils.isEmpty(string3)) {
            stringBuffer.append("&description=" + Base64.encodeToString(com.tencent.open.utils.b.K(string3), 2));
        }
        if (!TextUtils.isEmpty(strH)) {
            stringBuffer.append("&share_id=" + strH);
        }
        if (!TextUtils.isEmpty(string4)) {
            stringBuffer.append("&url=" + Base64.encodeToString(com.tencent.open.utils.b.K(string4), 2));
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > 20) {
                str = str.substring(0, 20) + LogMemoryConfig.LOG_ELLIPSIS;
            }
            stringBuffer.append("&app_name=" + Base64.encodeToString(com.tencent.open.utils.b.K(str), 2));
        }
        if (!TextUtils.isEmpty(strJ)) {
            stringBuffer.append("&open_id=" + Base64.encodeToString(com.tencent.open.utils.b.K(strJ), 2));
        }
        if (!TextUtils.isEmpty(string5)) {
            stringBuffer.append("&audioUrl=" + Base64.encodeToString(com.tencent.open.utils.b.K(string5), 2));
        }
        stringBuffer.append("&req_type=" + Base64.encodeToString(com.tencent.open.utils.b.K(String.valueOf(i2)), 2));
        if (!TextUtils.isEmpty(string7)) {
            stringBuffer.append("&mini_program_appid=" + Base64.encodeToString(com.tencent.open.utils.b.K(String.valueOf(string7)), 2));
        }
        if (!TextUtils.isEmpty(string8)) {
            stringBuffer.append("&mini_program_path=" + Base64.encodeToString(com.tencent.open.utils.b.K(String.valueOf(string8)), 2));
        }
        if (!TextUtils.isEmpty(string9)) {
            stringBuffer.append("&mini_program_type=" + Base64.encodeToString(com.tencent.open.utils.b.K(String.valueOf(string9)), 2));
        }
        if (!TextUtils.isEmpty(string6)) {
            stringBuffer.append("&share_to_qq_ark_info=" + Base64.encodeToString(com.tencent.open.utils.b.K(string6), 2));
        }
        if (!TextUtils.isEmpty(string10)) {
            stringBuffer.append("&share_qq_ext_str=" + Base64.encodeToString(com.tencent.open.utils.b.K(string10), 2));
        }
        stringBuffer.append("&cflag=" + Base64.encodeToString(com.tencent.open.utils.b.K(String.valueOf(i3)), 2));
        stringBuffer.append("&third_sd=" + Base64.encodeToString(com.tencent.open.utils.b.K(String.valueOf(com.tencent.open.utils.b.z())), 2));
        q8g.j("openSDK_LOG.QQShare", "doShareToQQ -- url: " + stringBuffer.toString());
        jcm.a(uum.a(), this.b, "requireApi", "shareToNativeQQ");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.putExtra(iim.a.b, activity.getPackageName());
        if (com.tencent.open.utils.b.F(activity, "4.6.0")) {
            q8g.i("openSDK_LOG.QQShare", "doShareToQQ, qqver below 4.6.");
            if (g(intent)) {
                efk.a().d(s04.REQUEST_OLD_SHARE, iz9Var);
                e(activity, intent, s04.REQUEST_OLD_SHARE);
            }
            i = 1;
        } else {
            q8g.i("openSDK_LOG.QQShare", "doShareToQQ, qqver greater than 4.6.");
            if (efk.a().e("shareToQQ", iz9Var) != null) {
                q8g.i("openSDK_LOG.QQShare", "doShareToQQ, last listener is not null, cancel it.");
            }
            if (g(intent)) {
                i = 1;
                d(activity, 10103, intent, true);
            } else {
                i = 1;
            }
        }
        String str4 = i3 == i ? "11" : "10";
        if (g(intent)) {
            spm.a().d(this.b.i(), this.b.h(), s04.VIA_SHARE_TO_QQ, str4, "3", "0", this.f14770c, "0", "1", "0");
            spm.a().b(0, "SHARE_CHECK_SDK", "1000", this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
        } else {
            spm.a().d(this.b.i(), this.b.h(), s04.VIA_SHARE_TO_QQ, str4, "3", "1", this.f14770c, "0", "1", "0");
            spm.a().b(1, "SHARE_CHECK_SDK", "1000", this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
        }
        q8g.i("openSDK_LOG.QQShare", "doShareToQQ() --end");
    }

    public void o(Activity activity, Bundle bundle, iz9 iz9Var) {
        int i;
        Bundle bundle2;
        String str;
        q8g.i("openSDK_LOG.QQShare", "shareToQQ() -- start.");
        String string = bundle.getString("imageUrl");
        String string2 = bundle.getString("title");
        String string3 = bundle.getString("summary");
        String string4 = bundle.getString(SHARE_TO_QQ_TARGET_URL);
        String string5 = bundle.getString(SHARE_TO_QQ_IMAGE_LOCAL_URL);
        String string6 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_APPID);
        String string7 = bundle.getString(SHARE_TO_QQ_MINI_PROGRAM_PATH);
        int i2 = bundle.getInt(SHARE_TO_QQ_KEY_TYPE, 1);
        q8g.i("openSDK_LOG.QQShare", "shareToQQ -- type: " + i2);
        if (i2 == 1) {
            this.f14770c = "1";
        } else if (i2 == 2) {
            this.f14770c = "3";
        } else if (i2 == 5) {
            this.f14770c = "2";
        } else if (i2 == 7) {
            this.f14770c = "9";
        }
        if (!com.tencent.open.utils.b.m() && com.tencent.open.utils.b.F(activity, "4.5.0")) {
            iz9Var.onError(new yfk(-6, s04.MSG_SHARE_NOSD_ERROR, null));
            q8g.f("openSDK_LOG.QQShare", "shareToQQ sdcard is null--end");
            spm.a().b(1, "SHARE_CHECK_SDK", "1000", this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ sdcard is null");
            return;
        }
        if (i2 == 5) {
            if (com.tencent.open.utils.b.F(activity, "4.3.0")) {
                iz9Var.onError(new yfk(-6, s04.MSG_PARAM_QQ_VERSION_ERROR, null));
                q8g.f("openSDK_LOG.QQShare", "shareToQQ, version below 4.3 is not support.");
                spm.a().b(1, "SHARE_CHECK_SDK", "1000", this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, version below 4.3 is not support.");
                return;
            } else if (!com.tencent.open.utils.b.J(string5)) {
                iz9Var.onError(new yfk(-6, s04.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
                q8g.f("openSDK_LOG.QQShare", "shareToQQ -- error: 非法的图片地址!");
                spm.a().b(1, "SHARE_CHECK_SDK", "1000", this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, s04.MSG_PARAM_IMAGE_URL_FORMAT_ERROR);
                return;
            }
        }
        if (i2 != 5) {
            i = 7;
            if (i2 != 7) {
                if (TextUtils.isEmpty(string4) || !(string4.startsWith("http://") || string4.startsWith("https://"))) {
                    iz9Var.onError(new yfk(-6, s04.MSG_PARAM_ERROR, null));
                    q8g.f("openSDK_LOG.QQShare", "shareToQQ, targetUrl is empty or illegal..");
                    spm.a().b(1, "SHARE_CHECK_SDK", "1000", this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, targetUrl is empty or illegal..");
                    return;
                } else {
                    if (TextUtils.isEmpty(string2)) {
                        iz9Var.onError(new yfk(-6, s04.MSG_PARAM_TITLE_NULL_ERROR, null));
                        q8g.f("openSDK_LOG.QQShare", "shareToQQ, title is empty.");
                        spm.a().b(1, "SHARE_CHECK_SDK", "1000", this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, title is empty.");
                        return;
                    }
                    i = 7;
                }
            }
        } else {
            i = 7;
        }
        if (i2 == i) {
            if (TextUtils.isEmpty(string6) || TextUtils.isEmpty(string7) || TextUtils.isEmpty(string4) || TextUtils.isEmpty(this.b.h())) {
                iz9Var.onError(new yfk(-5, s04.MSG_PARAM_ERROR, "appid || path || url empty."));
                return;
            }
            if (!(yzm.j(activity, "8.0.8") >= 0 || yzm.l(activity, "3.1") >= 0 || yzm.e(activity, s04.PACKAGE_QQ_SPEED) != null)) {
                iz9Var.onError(new yfk(-5, s04.MSG_PARAM_QQ_VERSION_ERROR, "版本过低，不支持分享小程序"));
                return;
            } else if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                iz9Var.onError(new yfk(-5, s04.MSG_PARAM_ERROR, "title || summary empty."));
                return;
            }
        }
        if (!TextUtils.isEmpty(string) && !string.startsWith("http://") && !string.startsWith("https://") && !new File(string).exists()) {
            iz9Var.onError(new yfk(-6, s04.MSG_PARAM_IMAGE_URL_FORMAT_ERROR, null));
            q8g.f("openSDK_LOG.QQShare", "shareToQQ, image url is emprty or illegal.");
            spm.a().b(1, "SHARE_CHECK_SDK", "1000", this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQQ, image url is emprty or illegal.");
            return;
        }
        if (TextUtils.isEmpty(string2) || string2.length() <= 128) {
            bundle2 = bundle;
            str = null;
        } else {
            str = null;
            bundle2 = bundle;
            bundle2.putString("title", com.tencent.open.utils.b.h(string2, 128, null, null));
        }
        if (!TextUtils.isEmpty(string3) && string3.length() > 512) {
            bundle2.putString("summary", com.tencent.open.utils.b.h(string3, 512, str, str));
        }
        if (com.tencent.open.utils.b.p(activity, bundle2.getInt(SHARE_TO_QQ_EXT_INT, 0) == 1)) {
            q8g.i("openSDK_LOG.QQShare", "shareToQQ, support share");
            k(activity, bundle, iz9Var);
        } else {
            try {
                q8g.k("openSDK_LOG.QQShare", "shareToQQ, don't support share, will show download dialog");
                new TDialog(activity, "", c(""), null, this.b).show();
            } catch (RuntimeException e2) {
                q8g.g("openSDK_LOG.QQShare", " shareToQQ, TDialog.show not in main thread", e2);
                e2.printStackTrace();
                iz9Var.onError(new yfk(-6, s04.MSG_NOT_CALL_ON_MAIN_THREAD, null));
            }
        }
        q8g.i("openSDK_LOG.QQShare", "shareToQQ() -- end.");
    }

    public class b implements upm {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f14773c;
        public final /* synthetic */ iz9 d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Activity f14774e;

        public b(Bundle bundle, String str, String str2, iz9 iz9Var, Activity activity) {
            this.a = bundle;
            this.b = str;
            this.f14773c = str2;
            this.d = iz9Var;
            this.f14774e = activity;
        }

        @Override // com.oplus.aiunit.vision.upm
        public void a(int i, String str) {
            if (i == 0) {
                this.a.putString(o4f.SHARE_TO_QQ_IMAGE_LOCAL_URL, str);
            } else if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.f14773c)) {
                iz9 iz9Var = this.d;
                if (iz9Var != null) {
                    iz9Var.onError(new yfk(-6, s04.MSG_SHARE_GETIMG_ERROR, null));
                    q8g.f("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                }
                spm.a().b(1, "SHARE_CHECK_SDK", "1000", o4f.this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, s04.MSG_SHARE_GETIMG_ERROR);
                return;
            }
            o4f.this.n(this.f14774e, this.a, this.d);
        }

        @Override // com.oplus.aiunit.vision.upm
        public void a(int i, ArrayList<String> arrayList) {
            if (i == 0) {
                this.a.putStringArrayList("imageLocalUrlArray", arrayList);
            } else if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.f14773c)) {
                iz9 iz9Var = this.d;
                if (iz9Var != null) {
                    iz9Var.onError(new yfk(-6, s04.MSG_SHARE_GETIMG_ERROR, null));
                    q8g.f("openSDK_LOG.QQShare", "shareToMobileQQ -- error: 获取分享图片失败!");
                }
                spm.a().b(1, "SHARE_CHECK_SDK", "1000", o4f.this.b.h(), String.valueOf(0), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, s04.MSG_SHARE_GETIMG_ERROR);
                return;
            }
            o4f.this.n(this.f14774e, this.a, this.d);
        }
    }
}
