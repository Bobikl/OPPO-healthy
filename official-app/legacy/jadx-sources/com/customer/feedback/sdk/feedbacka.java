package com.customer.feedback.sdk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import com.customer.feedback.sdk.feedbacka;
import com.customer.feedback.sdk.log.CustomerLogCallback;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.customer.feedback.sdk.util.LogUtil;
import com.oplus.aiunit.vision.awm;
import com.oplus.aiunit.vision.dwm;
import com.oplus.aiunit.vision.ewm;
import com.oplus.aiunit.vision.gxm;
import com.oplus.aiunit.vision.jwm;
import com.oplus.aiunit.vision.swm;
import com.oplus.aiunit.vision.wwm;
import com.oplus.aiunit.vision.xvm;
import com.oplus.aiunit.vision.yvm;
import com.oplus.aiunit.vision.zvm;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.SoftReference;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class feedbacka {
    public static volatile feedbacka feedbackl;
    public static Context feedbacku;
    public static CustomerLogCallback feedbackv;
    public final String feedbacka;
    public SoftReference<feedbackd> feedbackb;
    public SoftReference<feedbackc> feedbackc;
    public int feedbackd = 3;
    public int feedbacke = 2;

    /* JADX INFO: renamed from: feedbackf, reason: collision with root package name */
    public static final CopyOnWriteArrayList f2201feedbackf = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: feedbackg, reason: collision with root package name */
    public static Context f2202feedbackg = null;

    /* JADX INFO: renamed from: feedbackh, reason: collision with root package name */
    public static final String f2203feedbackh = "/Oplus/Feedback/FbLog/";
    public static String feedbacki = "";
    public static String feedbackj = "";
    public static int feedbackk = 2;
    public static String feedbackm = "";
    public static boolean feedbackn = true;
    public static boolean feedbacko = true;
    public static boolean feedbackp = false;
    public static int feedbackq = 0;
    public static String feedbackr = "";
    public static String feedbacks = "";
    public static String feedbackt = "";
    public static final float[] feedbackw = {0.0f, 0.0f, 0.0f};
    public static boolean feedbackx = false;
    public static boolean feedbacky = true;
    public static int feedbackz = -1;
    public static int a = -1;
    public static boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f2199c = false;
    public static String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f2200e = false;
    public static final HashMap f = new HashMap();
    public static boolean g = false;
    public static FeedbackHelper.RequestMadeCallback h = null;

    /* JADX INFO: renamed from: com.customer.feedback.sdk.feedbacka$feedbacka, reason: collision with other inner class name */
    public class RunnableC0211feedbacka implements Runnable {
        public final /* synthetic */ Context feedbacka;

        public RunnableC0211feedbacka(Context context) {
            this.feedbacka = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CopyOnWriteArrayList copyOnWriteArrayList = feedbacka.f2201feedbackf;
            LogUtil.d("FeedbackHelper", "set LogPath");
            File file = new File(this.feedbacka.getFilesDir(), Environment.DIRECTORY_DOCUMENTS);
            if (!file.exists()) {
                file.mkdirs();
            }
            dwm.a(file.getPath() + feedbacka.f2203feedbackh + feedbacka.this.feedbacka);
        }
    }

    public interface feedbackb<T> {
        void onResult(boolean z, String str, T t);
    }

    public interface feedbackc {
        void feedbacka(boolean z);
    }

    public interface feedbackd {
        void returnNetworkStatus(boolean z);
    }

    public interface feedbacke {
        void feedbacka(String str);
    }

    public feedbacka(Context context) {
        this.feedbacka = "";
        Context contextFeedbacka = feedbacka(context);
        f2202feedbackg = contextFeedbacka;
        this.feedbacka = HeaderInfoHelper.getAppCode(contextFeedbacka);
        feedbackc(f2202feedbackg);
    }

    public static Context feedbacka(Context context) {
        return context.getApplicationContext() != null ? context.getApplicationContext() : context;
    }

    public static feedbacka feedbackb(Context context) {
        if (feedbackl == null) {
            synchronized (feedbacka.class) {
                if (feedbackl == null) {
                    feedbackl = new feedbacka(context);
                }
            }
        }
        return feedbackl;
    }

    public final void feedbackc(Context context) {
        gxm.feedbacka.execute(new RunnableC0211feedbacka(context));
    }

    public static void feedbacka(Context context, boolean z, String str, String str2) {
        HeaderInfoHelper.setAppCode(str);
        if (str == null) {
            str = HeaderInfoHelper.getAppCode(context.getApplicationContext());
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getApplicationContext().getPackageName(), "com.customer.feedback.sdk.activity.FeedbackActivity"));
        intent.setAction("com.customer.feedback.START");
        intent.putExtra("AppCode", str);
        intent.putExtra("redirect_to_feedback", z);
        intent.putExtra("target_page", str2);
        intent.putExtra("intent_app_version", HeaderInfoHelper.getAppVersion(context.getApplicationContext()));
        if (context instanceof Activity) {
            intent.setFlags(536870912);
            LogUtil.d("FeedbackHelper", " setFlag ,context instanceof activity");
        } else {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    @ColorInt
    public static int feedbackb() {
        float[] fArr = feedbackw;
        return Color.argb(1.0f, fArr[0], fArr[1], fArr[2]);
    }

    public static void feedbackb(final Context context, final String str, final feedbackb<String> feedbackbVar) {
        gxm.feedbacka.execute(new Runnable() { // from class: com.oplus.aiunit.vision.pvm
            @Override // java.lang.Runnable
            public final void run() {
                feedbacka.feedbacka(context, str, feedbackbVar);
            }
        });
    }

    public static void feedbacka(Context context, String str, feedbackb feedbackbVar) {
        HttpsURLConnection httpsURLConnection;
        String str2;
        String strA;
        JSONObject jSONObjectOptJSONObject;
        String string;
        swm swmVar = new swm(context);
        String str3 = yvm.feedbacka;
        ewm ewmVar = null;
        try {
            httpsURLConnection = (HttpsURLConnection) new URL(yvm.feedbackb + "/feedback-app/api-new/feedback/fms/upload-feedback").openConnection();
            try {
                httpsURLConnection.setConnectTimeout(30000);
                httpsURLConnection.setReadTimeout(30000);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.addRequestProperty("Content-type", "application/json");
                awm awmVar = awm.feedbacka;
                String iv = awm.a();
                String strC = awmVar.c();
                String encryptContent = awm.d(str, iv);
                if (encryptContent == null) {
                    encryptContent = "";
                }
                String key = wwm.a(swmVar.a, strC);
                Intrinsics.checkNotNullParameter(iv, "iv");
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(encryptContent, "encryptContent");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("iv", iv);
                    jSONObject.put("key", key);
                    jSONObject.put("encryptContent", encryptContent);
                    string = jSONObject.toString();
                } catch (Exception e2) {
                    LogUtil.e("JsonParser", "exceptionInfo：", e2);
                    string = "";
                }
                HashMap mapA = jwm.a(String.valueOf(System.currentTimeMillis()), string);
                for (String str4 : mapA.keySet()) {
                    httpsURLConnection.addRequestProperty(str4, (String) mapA.get(str4));
                }
                DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
                dataOutputStream.writeBytes(string);
                dataOutputStream.flush();
                dataOutputStream.close();
                httpsURLConnection.connect();
                strA = zvm.a(httpsURLConnection.getInputStream());
                try {
                    httpsURLConnection.disconnect();
                } catch (FileNotFoundException unused) {
                    if (httpsURLConnection != null) {
                        strA = zvm.a(httpsURLConnection.getErrorStream());
                        httpsURLConnection.disconnect();
                    }
                } catch (Exception e3) {
                    str2 = strA;
                    e = e3;
                    LogUtil.d("feedbackf.feedbacke", "sendHttpsPOSTEncrypt error: " + e);
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    strA = str2;
                }
            } catch (FileNotFoundException unused2) {
                strA = null;
            } catch (Exception e4) {
                e = e4;
                str2 = null;
            }
        } catch (FileNotFoundException unused3) {
            httpsURLConnection = null;
            strA = null;
        } catch (Exception e5) {
            e = e5;
            httpsURLConnection = null;
            str2 = null;
        }
        if (feedbackbVar == null) {
            LogUtil.e("FeedbackHelper", "uploadFeedbackToFms: callback is null");
            return;
        }
        if (strA == null) {
            feedbackbVar.onResult(false, "network failure", "");
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strA);
            String string2 = jSONObject2.getString("status");
            ewmVar = new ewm(string2, jSONObject2.optString("msg"), jSONObject2.optString("traceId"), (!OpenIdUtils.DEFAULT_VALUE.equals(string2) || (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) == null) ? null : new xvm(jSONObjectOptJSONObject.optString("iv"), jSONObjectOptJSONObject.optString("encryptContent")));
        } catch (JSONException e6) {
            LogUtil.e("JsonParser", "exceptionInfo：", e6);
        }
        if (ewmVar == null) {
            feedbackbVar.onResult(false, "response is null", "");
            return;
        }
        LogUtil.e("FeedbackHelper", "uploadFeedbackToFms: traceId=" + ewmVar.f11113c);
        xvm xvmVar = ewmVar.d;
        if (xvmVar != null && !TextUtils.isEmpty(xvmVar.b) && !TextUtils.isEmpty(ewmVar.d.a)) {
            xvm xvmVar2 = ewmVar.d;
            feedbackbVar.onResult(Intrinsics.areEqual(OpenIdUtils.DEFAULT_VALUE, ewmVar.a), ewmVar.b, awm.b(xvmVar2.b, xvmVar2.a));
        } else {
            feedbackbVar.onResult(false, "data parsing failed", "");
        }
    }

    public static String feedbacka() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 33; i++) {
            sb.append((char) ("osswt=((dofs)hwwh)dhj(dofs(o2(q5(".charAt(i) ^ 7));
        }
        return sb.toString();
    }
}
