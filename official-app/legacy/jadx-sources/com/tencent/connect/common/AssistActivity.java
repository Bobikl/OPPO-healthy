package com.tencent.connect.common;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.efk;
import com.oplus.aiunit.vision.iz9;
import com.oplus.aiunit.vision.q8g;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.spm;
import com.oplus.aiunit.vision.yfk;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class AssistActivity extends Activity {
    public static final String EXTRA_INTENT = "openSDK_LOG.AssistActivity.ExtraIntent";
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f20287l;
    public boolean m;
    public boolean i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20286j = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f20288n = new a();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 0 && !AssistActivity.this.isFinishing()) {
                q8g.k("openSDK_LOG.AssistActivity", "-->finish by timeout");
                AssistActivity.this.finish();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q8g.i("openSDK_LOG.AssistActivity", "onActivityResult finish delay");
            AssistActivity.this.finish();
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str = "#";
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            Uri uri = (Uri) intent.getParcelableExtra("uriData");
            Intent intent2 = new Intent();
            try {
                String string = uri.toString();
                if (!string.contains("#")) {
                    str = "?";
                }
                for (String str2 : string.substring(string.indexOf(str) + 1).split("&")) {
                    String[] strArrSplit = str2.split(HttpUtils.EQUAL_SIGN);
                    intent2.putExtra(strArrSplit[0], strArrSplit[1]);
                }
            } catch (Exception e2) {
                q8g.i("openSDK_LOG.AssistActivity", "QQStayReceiver parse uri error : " + e2.getMessage());
            }
            intent2.putExtra(s04.KEY_ACTION, "action_share");
            intent2.setData(uri);
            AssistActivity.this.setResult(-1, intent2);
        }

        public /* synthetic */ c(AssistActivity assistActivity, a aVar) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:16:0x006f  */
    public final void a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        iz9 iz9VarB;
        String string = bundle.getString("viaShareType");
        String string2 = bundle.getString("callbackAction");
        String string3 = bundle.getString("url");
        String string4 = bundle.getString("openId");
        String string5 = bundle.getString("appId");
        if (!"shareToQQ".equals(string2)) {
            if ("shareToQzone".equals(string2)) {
                str3 = s04.VIA_SHARE_TO_QZONE;
                str4 = "11";
            } else {
                str = "";
                str2 = str;
            }
            if (com.tencent.open.utils.b.n(this, string3)) {
                spm.a().d(string4, string5, str, str2, "3", "0", string, "0", "2", "0");
            } else {
                iz9VarB = efk.a().b(string2);
                if (iz9VarB != null) {
                    iz9VarB.onError(new yfk(-6, s04.MSG_OPEN_BROWSER_ERROR, null));
                }
                spm.a().d(string4, string5, str, str2, "3", "1", string, "0", "2", "0");
                finish();
            }
            getIntent().removeExtra("shareH5");
        }
        str3 = s04.VIA_SHARE_TO_QQ;
        str4 = "10";
        str2 = str4;
        str = str3;
        if (com.tencent.open.utils.b.n(this, string3)) {
            iz9VarB = efk.a().b(string2);
            if (iz9VarB != null) {
                iz9VarB.onError(new yfk(-6, s04.MSG_OPEN_BROWSER_ERROR, null));
            }
            spm.a().d(string4, string5, str, str2, "3", "1", string, "0", "2", "0");
            finish();
        } else {
            spm.a().d(string4, string5, str, str2, "3", "0", string, "0", "2", "0");
        }
        getIntent().removeExtra("shareH5");
    }

    public void b(int i, Intent intent) {
        if (intent == null) {
            q8g.k("openSDK_LOG.AssistActivity", "--setResultData--intent is null, setResult ACTIVITY_CANCEL");
            setResult(0);
            if (i == 11101) {
                spm.a().c("", this.k, "2", "1", "7", "2");
                return;
            }
            return;
        }
        try {
            String stringExtra = intent.getStringExtra(s04.KEY_RESPONSE);
            q8g.d("openSDK_LOG.AssistActivity", "--setResultDataForLogin-- ");
            if (TextUtils.isEmpty(stringExtra)) {
                q8g.k("openSDK_LOG.AssistActivity", "--setResultData--response is empty, setResult ACTIVITY_OK");
                setResult(-1, intent);
            } else {
                JSONObject jSONObject = new JSONObject(stringExtra);
                String strOptString = jSONObject.optString("openid");
                String strOptString2 = jSONObject.optString(s04.PARAM_ACCESS_TOKEN);
                String strOptString3 = jSONObject.optString("proxy_code");
                long jOptLong = jSONObject.optLong("proxy_expires_in");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    q8g.i("openSDK_LOG.AssistActivity", "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
                    setResult(-1, intent);
                    spm.a().c(strOptString, this.k, "2", "1", "7", "0");
                } else if (TextUtils.isEmpty(strOptString3) || jOptLong == 0) {
                    q8g.k("openSDK_LOG.AssistActivity", "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
                    setResult(0, intent);
                    spm.a().c("", this.k, "2", "1", "7", "1");
                } else {
                    q8g.i("openSDK_LOG.AssistActivity", "--setResultData--proxy_code and proxy_expires_in are valid");
                    setResult(-1, intent);
                }
            }
        } catch (Exception e2) {
            q8g.f("openSDK_LOG.AssistActivity", "--setResultData--parse response failed");
            e2.printStackTrace();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("--onActivityResult--requestCode: ");
        sb.append(i);
        sb.append(" | resultCode: ");
        sb.append(i2);
        sb.append("data = null ? ");
        sb.append(intent == null);
        q8g.i("openSDK_LOG.AssistActivity", sb.toString());
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            return;
        }
        if (intent != null) {
            intent.putExtra(s04.KEY_ACTION, "action_login");
        }
        b(i, intent);
        if (this.m) {
            new Handler(Looper.getMainLooper()).postDelayed(new b(), 200L);
        } else {
            q8g.i("openSDK_LOG.AssistActivity", "onActivityResult finish immediate");
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        getWindow().addFlags(67108864);
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.m = getIntent().getBooleanExtra(s04.KEY_RESTORE_LANDSCAPE, false);
        q8g.i("openSDK_LOG.AssistActivity", "--onCreate-- mRestoreLandscape=" + this.m);
        if (getIntent() == null) {
            q8g.f("openSDK_LOG.AssistActivity", "-->onCreate--getIntent() returns null");
            finish();
        }
        Intent intent = (Intent) getIntent().getParcelableExtra(EXTRA_INTENT);
        int intExtra = intent == null ? 0 : intent.getIntExtra(s04.KEY_REQUEST_CODE, 0);
        this.k = intent == null ? "" : intent.getStringExtra("appid");
        Bundle bundleExtra = getIntent().getBundleExtra("h5_share_data");
        if (bundle != null) {
            this.i = bundle.getBoolean("RESTART_FLAG");
            this.f20286j = bundle.getBoolean("RESUME_FLAG", false);
        }
        if (this.i) {
            q8g.d("openSDK_LOG.AssistActivity", "is restart");
            return;
        }
        if (bundleExtra != null) {
            q8g.k("openSDK_LOG.AssistActivity", "--onCreate--h5 bundle not null, will open browser");
            a(bundleExtra);
            return;
        }
        if (intent == null) {
            q8g.f("openSDK_LOG.AssistActivity", "--onCreate--activityIntent is null");
            finish();
            return;
        }
        q8g.i("openSDK_LOG.AssistActivity", "--onCreate--activityIntent not null, will start activity, reqcode = " + intExtra);
        try {
            IntentFilter intentFilter = new IntentFilter(s04.SHARE_QQ_AND_STAY + intent.getData().getQueryParameter("share_id"));
            if (this.f20287l == null) {
                this.f20287l = new c(this, null);
            }
            registerReceiver(this.f20287l, intentFilter);
        } catch (Exception e2) {
            q8g.i("openSDK_LOG.AssistActivity", "registerReceiver exception : " + e2.getMessage());
        }
        startActivityForResult(intent, intExtra);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        q8g.i("openSDK_LOG.AssistActivity", "-->onDestroy");
        super.onDestroy();
        c cVar = this.f20287l;
        if (cVar != null) {
            unregisterReceiver(cVar);
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        PushAutoTrackHelper.onNewIntent(this, intent);
        q8g.i("openSDK_LOG.AssistActivity", "--onNewIntent");
        super.onNewIntent(intent);
        int intExtra = intent.getIntExtra(s04.KEY_REQUEST_CODE, -1);
        if (intExtra == 10108) {
            intent.putExtra(s04.KEY_ACTION, "action_request_avatar");
            if (intent.getBooleanExtra(s04.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10109) {
            intent.putExtra(s04.KEY_ACTION, "action_request_set_emotion");
            if (intent.getBooleanExtra(s04.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10110) {
            intent.putExtra(s04.KEY_ACTION, "action_request_dynamic_avatar");
            if (intent.getBooleanExtra(s04.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra == 10111) {
            intent.putExtra(s04.KEY_ACTION, "joinGroup");
            if (intent.getBooleanExtra(s04.KEY_STAY, false)) {
                moveTaskToBack(true);
            }
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            finish();
            return;
        }
        if (intExtra != 10112) {
            intent.putExtra(s04.KEY_ACTION, "action_share");
            setResult(-1, intent);
            if (isFinishing()) {
                return;
            }
            q8g.i("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
            finish();
            return;
        }
        intent.putExtra(s04.KEY_ACTION, "bindGroup");
        if (intent.getBooleanExtra(s04.KEY_STAY, false)) {
            moveTaskToBack(true);
        }
        setResult(-1, intent);
        if (isFinishing()) {
            return;
        }
        finish();
    }

    @Override // android.app.Activity
    public void onPause() {
        q8g.i("openSDK_LOG.AssistActivity", "-->onPause");
        this.f20288n.removeMessages(0);
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        q8g.i("openSDK_LOG.AssistActivity", "-->onResume");
        super.onResume();
        Intent intent = getIntent();
        if (intent.getBooleanExtra("is_login", false)) {
            return;
        }
        if (!intent.getBooleanExtra("is_qq_mobile_share", false) && this.i && !isFinishing()) {
            finish();
        }
        if (!this.f20286j) {
            this.f20286j = true;
        } else {
            this.f20288n.sendMessage(this.f20288n.obtainMessage(0));
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        q8g.i("openSDK_LOG.AssistActivity", "--onSaveInstanceState--");
        bundle.putBoolean("RESTART_FLAG", true);
        bundle.putBoolean("RESUME_FLAG", this.f20286j);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        q8g.i("openSDK_LOG.AssistActivity", "-->onStart");
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        q8g.i("openSDK_LOG.AssistActivity", "-->onStop");
        super.onStop();
    }
}
