package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class sgm {
    public static final String A = "SSLDenied";
    public static final String A0 = "out_trade_no";
    public static final String B = "H5PayDataAnalysisError";
    public static final String B0 = "trade_no";
    public static final String C = "H5AuthDataAnalysisError";
    public static final String C0 = "biz_content";
    public static final String D = "PublicKeyUnmatch";
    public static final String D0 = "app_id";
    public static final String E = "ClientBindFailed";
    public static final String F = "TriDesEncryptError";
    public static final String G = "TriDesDecryptError";
    public static final String H = "ClientBindException";
    public static final String I = "SaveTradeTokenError";
    public static final String J = "ClientBindServiceFailed";
    public static final String K = "TryStartServiceEx";
    public static final String L = "BindWaitTimeoutEx";
    public static final String M = "CheckClientExistEx";
    public static final String N = "CheckClientSignEx";
    public static final String O = "GetInstalledAppEx";
    public static final String P = "ParserTidClientKeyEx";
    public static final String Q = "PgApiInvoke";
    public static final String R = "PgBindStarting";
    public static final String S = "PgBinded";
    public static final String T = "PgBindEnd";
    public static final String U = "PgBindPay";
    public static final String V = "PgReturn";
    public static final String W = "PgReturnV";
    public static final String X = "PgWltVer";
    public static final String Y = "PgOpenStarting";
    public static final String Z = "ErrIntentEx";
    public static final String a0 = "ErrActNull";
    public static final String b0 = "ErrActEx";
    public static final String c0 = "ErrActNull2";
    public static final String d0 = "ErrActEx2";
    public static final String e0 = "ErrActNotCreated";
    public static final String f0 = "GetInstalledAppEx";
    public static final String g0 = "StartLaunchAppTransEx";
    public static final String h0 = "CheckLaunchAppExistEx";
    public static final String i0 = "LogBindCalledH5";
    public static final String j0 = "LogCalledH5";
    public static final String k = "net";
    public static final String k0 = "LogHkLoginByIntent";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f16581l = "biz";
    public static final String l0 = "SchemePayWrongHashEx";
    public static final String m = "cp";
    public static final String m0 = "LogAppFetchConfigTimeout";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f16582n = "auth";
    public static final String n0 = "H5CbUrlEmpty";
    public static final String o = "third";
    public static final String o0 = "H5CbEx";
    public static final String p = "wlt";
    public static final String p0 = "StartActivityEx";
    public static final String q = "FormatResultEx";
    public static final String q0 = "JSONEx";
    public static final String r = "GetApdidEx";
    public static final String r0 = "ParseBundleSerializableError";
    public static final String s = "GetApdidNull";
    public static final String s0 = "ParseSchemeQueryError";
    public static final String t = "GetApdidTimeout";
    public static final String t0 = "TbChk";
    public static final String u = "GetUtdidEx";
    public static final String u0 = "TbStart";
    public static final String v = "GetPackageInfoEx";
    public static final String v0 = "TbCancel";
    public static final String w = "NotIncludeSignatures";
    public static final String w0 = "TbUnknown";
    public static final String x = "GetPublicKeyFromSignEx";
    public static final String x0 = "TbOk";
    public static final String y = "webError";
    public static final String y0 = "TbActFail";
    public static final String z = "SSLError";
    public static final String z0 = "partner";
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16583c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16584e;
    public String f;
    public String g;
    public String h = "";
    public String i = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f16585j;

    public sgm(Context context, boolean z2) {
        context = context != null ? context.getApplicationContext() : context;
        this.a = k();
        this.f16583c = c(context);
        this.d = b(z2 ? 0L : l9m.e.a(context));
        this.f16584e = a();
        this.f = l(context);
        this.g = "-";
        this.f16585j = "-";
    }

    public static String a() {
        return String.format("%s,%s,-,-,-", p(ram.a(chm.e().c()).g()), p(chm.e().d()));
    }

    public static String b(long j2) {
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", p(ham.f12086j), p(ham.i), "~" + j2);
    }

    public static String c(Context context) {
        String packageName;
        String str = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str = packageInfo.versionName + "|" + d(packageInfo);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                packageName = "-";
            }
        } else {
            packageName = "-";
        }
        return String.format("%s,%s,-,-,-", p(packageName), p(str));
    }

    public static String d(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String strSubstring;
        if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length == 0) {
            return "0";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                try {
                    String strM = com.alipay.sdk.m.u.a.m(null, signature.toByteArray());
                    strSubstring = TextUtils.isEmpty(strM) ? "?" : com.alipay.sdk.m.u.a.W(strM).substring(0, 8);
                } catch (Throwable unused) {
                }
                sb.append("-");
                sb.append(strSubstring);
            }
            return sb.toString();
        } catch (Throwable unused2) {
            return "?";
        }
    }

    public static String f(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int i = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i++;
                    if (i > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String k() {
        return String.format("%s,%s", t(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    public static String l(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", p(ykm.d(context)), "android", p(Build.VERSION.RELEASE), p(Build.MODEL), "-", "0", p(ykm.e(context).b()), "gw", p(fgm.c(null, context)));
    }

    public static String m(String str) {
        String string;
        String strReplace;
        if (str == null) {
            str = "";
        }
        String[] strArrSplit = str.split("&");
        String strReplace2 = null;
        if (strArrSplit != null) {
            string = null;
            strReplace = null;
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(HttpUtils.EQUAL_SIGN);
                if (strArrSplit2 != null && strArrSplit2.length == 2) {
                    if (strArrSplit2[0].equalsIgnoreCase("partner")) {
                        strReplace2 = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("out_trade_no")) {
                        string = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase("trade_no")) {
                        strReplace = strArrSplit2[1].replace("\"", "");
                    } else if (strArrSplit2[0].equalsIgnoreCase(C0)) {
                        try {
                            JSONObject jSONObject = new JSONObject(com.alipay.sdk.m.u.a.Q(qam.w(), strArrSplit2[1]));
                            if (TextUtils.isEmpty(string)) {
                                string = jSONObject.getString("out_trade_no");
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (strArrSplit2[0].equalsIgnoreCase("app_id") && TextUtils.isEmpty(strReplace2)) {
                        strReplace2 = strArrSplit2[1];
                    }
                }
            }
        } else {
            string = null;
            strReplace = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", p(strReplace), p(string), p(strReplace2));
    }

    public static String o() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    public static String p(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(",", "，").replace("^", "~").replace("#", "＃");
    }

    public static String r(String str) {
        return TextUtils.isEmpty(str) ? "-" : str;
    }

    public static String t() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    public String e(String str) {
        String strM = m(str);
        this.b = strM;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.a, strM, this.f16583c, this.d, this.f16584e, this.f, this.g, r(this.h), r(this.i), this.f16585j);
    }

    public void g(String str, String str2) {
        q("", str, str2);
    }

    public void h(String str, String str2, String str3) {
        q("", str, str2 + "|" + str3);
    }

    public void i(String str, String str2, Throwable th) {
        s(str, str2, f(th));
    }

    public void j(String str, String str2, Throwable th, String str3) {
        s(str, str2, str3 + ": " + f(th));
    }

    public void n(String str, String str2, String str3) {
        s(str, str2, str3);
    }

    public final synchronized void q(String str, String str2, String str3) {
        qrm.h(ham.A, String.format("event %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.h)) {
            str4 = "^";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = TextUtils.isEmpty(str) ? "-" : p(str);
        objArr[1] = p(str2);
        objArr[2] = p(str3);
        objArr[3] = p(o());
        sb.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", objArr));
        this.h += sb.toString();
    }

    public final synchronized void s(String str, String str2, String str3) {
        qrm.g(ham.A, String.format("err %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.i)) {
            str4 = "^";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = TextUtils.isEmpty(str3) ? "-" : p(str3);
        objArr[3] = p(o());
        sb.append(String.format("%s,%s,%s,%s", objArr));
        this.i += sb.toString();
    }
}
