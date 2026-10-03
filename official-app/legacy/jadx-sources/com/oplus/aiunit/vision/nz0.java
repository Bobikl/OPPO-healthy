package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import com.tencent.open.utils.HttpUtils;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nz0 {
    public static String businessId = null;
    public static String installChannel = null;
    public static boolean isOEM = false;
    public static String registerChannel;
    public dmm a;
    public p4f b;

    public class a implements iw9 {
        public final iz9 a;
        public final Handler b;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.nz0$a$a, reason: collision with other inner class name */
        public class HandlerC0906a extends Handler {
            public final /* synthetic */ nz0 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public HandlerC0906a(Looper looper, nz0 nz0Var) {
                super(looper);
                this.a = nz0Var;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 0) {
                    a.this.a.onComplete(message.obj);
                } else {
                    a.this.a.onError(new yfk(message.what, (String) message.obj, null));
                }
            }
        }

        public a(iz9 iz9Var) {
            this.a = iz9Var;
            this.b = new HandlerC0906a(uum.a().getMainLooper(), nz0.this);
        }

        @Override // com.oplus.aiunit.vision.iw9
        public void a(IOException iOException) {
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.obj = iOException.getMessage();
            messageObtainMessage.what = -2;
            this.b.sendMessage(messageObtainMessage);
        }

        @Override // com.oplus.aiunit.vision.iw9
        public void b(SocketTimeoutException socketTimeoutException) {
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.obj = socketTimeoutException.getMessage();
            messageObtainMessage.what = -8;
            this.b.sendMessage(messageObtainMessage);
        }

        @Override // com.oplus.aiunit.vision.iw9
        public void c(Exception exc) {
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.obj = exc.getMessage();
            messageObtainMessage.what = -6;
            this.b.sendMessage(messageObtainMessage);
        }

        @Override // com.oplus.aiunit.vision.iw9
        public void d(JSONException jSONException) {
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.obj = jSONException.getMessage();
            messageObtainMessage.what = -4;
            this.b.sendMessage(messageObtainMessage);
        }

        @Override // com.oplus.aiunit.vision.iw9
        public void e(JSONObject jSONObject) {
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.obj = jSONObject;
            messageObtainMessage.what = 0;
            this.b.sendMessage(messageObtainMessage);
        }

        @Override // com.oplus.aiunit.vision.iw9
        public void f(MalformedURLException malformedURLException) {
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.obj = malformedURLException.getMessage();
            messageObtainMessage.what = -3;
            this.b.sendMessage(messageObtainMessage);
        }

        @Override // com.oplus.aiunit.vision.iw9
        public void g(HttpUtils.HttpStatusException httpStatusException) {
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.obj = httpStatusException.getMessage();
            messageObtainMessage.what = -9;
            this.b.sendMessage(messageObtainMessage);
        }

        @Override // com.oplus.aiunit.vision.iw9
        public void h(ConnectTimeoutException connectTimeoutException) {
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.obj = connectTimeoutException.getMessage();
            messageObtainMessage.what = -7;
            this.b.sendMessage(messageObtainMessage);
        }

        @Override // com.oplus.aiunit.vision.iw9
        public void i(HttpUtils.NetworkUnavailableException networkUnavailableException) {
            Message messageObtainMessage = this.b.obtainMessage();
            messageObtainMessage.obj = networkUnavailableException.getMessage();
            messageObtainMessage.what = -10;
            this.b.sendMessage(messageObtainMessage);
        }
    }

    public nz0(dmm dmmVar, p4f p4fVar) {
        this.a = dmmVar;
        this.b = p4fVar;
    }

    public final Intent a(Activity activity, Intent intent, Map<String, Object> map) {
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        intent2.putExtra("is_login", true);
        intent2.putExtra(AssistActivity.EXTRA_INTENT, intent);
        if (map == null) {
            return intent2;
        }
        try {
            if (map.containsKey(s04.KEY_RESTORE_LANDSCAPE)) {
                intent2.putExtra(s04.KEY_RESTORE_LANDSCAPE, ((Boolean) map.get(s04.KEY_RESTORE_LANDSCAPE)).booleanValue());
            }
        } catch (Exception e2) {
            q8g.g("openSDK_LOG.BaseApi", "Exception", e2);
        }
        return intent2;
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString("format", "json");
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", Build.MODEL);
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", s04.SDK_VERSION);
        bundle.putString("sdkp", "a");
        p4f p4fVar = this.b;
        if (p4fVar != null && p4fVar.k()) {
            bundle.putString(s04.PARAM_ACCESS_TOKEN, this.b.g());
            bundle.putString(s04.PARAM_CONSUMER_KEY, this.b.h());
            bundle.putString("openid", this.b.i());
            bundle.putString("appid_for_getting_config", this.b.h());
        }
        SharedPreferences sharedPreferences = uum.a().getSharedPreferences(s04.PREFERENCE_PF, 0);
        if (isOEM) {
            bundle.putString(s04.PARAM_PLATFORM_ID, "desktop_m_qq-" + installChannel + "-android-" + registerChannel + "-" + businessId);
        } else {
            bundle.putString(s04.PARAM_PLATFORM_ID, sharedPreferences.getString(s04.PARAM_PLATFORM_ID, s04.DEFAULT_PF));
        }
        return bundle;
    }

    public String c(String str) {
        Bundle bundleB = b();
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            bundleB.putString("need_version", str);
        }
        sb.append("https://openmobile.qq.com/oauth2.0/m_jump_by_version?");
        sb.append(HttpUtils.f(bundleB));
        return sb.toString();
    }

    public void d(Activity activity, int i, Intent intent, boolean z) {
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        if (z) {
            intent2.putExtra("is_qq_mobile_share", true);
        }
        intent2.putExtra(AssistActivity.EXTRA_INTENT, intent);
        activity.startActivityForResult(intent2, i);
    }

    public void e(Activity activity, Intent intent, int i) {
        f(activity, intent, i, null);
    }

    public void f(Activity activity, Intent intent, int i, Map<String, Object> map) {
        intent.putExtra(s04.KEY_REQUEST_CODE, i);
        activity.startActivityForResult(a(activity, intent, map), i);
    }

    public boolean g(Intent intent) {
        if (intent != null) {
            return yzm.g(uum.a(), intent);
        }
        return false;
    }

    public nz0(p4f p4fVar) {
        this(null, p4fVar);
    }
}
