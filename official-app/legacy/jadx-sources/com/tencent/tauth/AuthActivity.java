package com.tencent.tauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.efk;
import com.oplus.aiunit.vision.iz9;
import com.oplus.aiunit.vision.q8g;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.yzm;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import com.tencent.connect.common.AssistActivity;
import com.tencent.open.utils.b;

/* JADX INFO: loaded from: classes10.dex */
public class AuthActivity extends Activity {
    public static final String ACTION_KEY = "action";
    public static final String ACTION_SHARE_PRIZE = "sharePrize";
    public static int i;

    public final void a(Uri uri) {
        q8g.i("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
        if (uri != null && uri.toString() != null) {
            String string = "";
            if (!uri.toString().equals("")) {
                String string2 = uri.toString();
                Bundle bundleC = b.c(string2.substring(string2.indexOf("#") + 1));
                if (bundleC == null) {
                    q8g.k("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
                    finish();
                    return;
                }
                String string3 = bundleC.getString("action");
                q8g.i("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + string3);
                if (string3 == null) {
                    finish();
                    return;
                }
                if (string3.equals("shareToQQ") || string3.equals("shareToQzone") || string3.equals("sendToMyComputer") || string3.equals("shareToTroopBar")) {
                    if (string3.equals("shareToQzone") && yzm.e(this, "com.tencent.mobileqq") != null && yzm.j(this, "5.2.0") < 0) {
                        int i2 = i + 1;
                        i = i2;
                        if (i2 == 2) {
                            i = 0;
                            finish();
                            return;
                        }
                    }
                    q8g.i("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
                    Intent intent = new Intent(this, (Class<?>) AssistActivity.class);
                    intent.putExtras(bundleC);
                    intent.setFlags(603979776);
                    startActivity(intent);
                    finish();
                    return;
                }
                if (string3.equals("addToQQFavorites")) {
                    Intent intent2 = getIntent();
                    intent2.putExtras(bundleC);
                    intent2.putExtra(s04.KEY_ACTION, "action_share");
                    iz9 iz9VarB = efk.a().b(string3);
                    if (iz9VarB != null) {
                        efk.a().c(intent2, iz9VarB);
                    }
                    finish();
                    return;
                }
                if (string3.equals(ACTION_SHARE_PRIZE)) {
                    Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                    try {
                        string = b.C(bundleC.getString(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE)).getString("activityid");
                    } catch (Exception e2) {
                        q8g.g("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", e2);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        launchIntentForPackage.putExtra(ACTION_SHARE_PRIZE, true);
                        Bundle bundle = new Bundle();
                        bundle.putString("activityid", string);
                        launchIntentForPackage.putExtras(bundle);
                    }
                    startActivity(launchIntentForPackage);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetAvatar")) {
                    boolean booleanExtra = getIntent().getBooleanExtra(s04.KEY_STAY, false);
                    Intent intent3 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent3.putExtra(s04.KEY_REQUEST_CODE, 10108);
                    intent3.putExtra(s04.KEY_STAY, booleanExtra);
                    intent3.putExtras(bundleC);
                    intent3.setFlags(603979776);
                    startActivity(intent3);
                    finish();
                    return;
                }
                if ("sdkSetDynamicAvatar".equals(string3)) {
                    boolean booleanExtra2 = getIntent().getBooleanExtra(s04.KEY_STAY, false);
                    Intent intent4 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent4.putExtra(s04.KEY_REQUEST_CODE, 10110);
                    intent4.putExtra(s04.KEY_STAY, booleanExtra2);
                    intent4.putExtras(bundleC);
                    intent4.setFlags(603979776);
                    startActivity(intent4);
                    finish();
                    return;
                }
                if (string3.equals("sdkSetEmotion")) {
                    boolean booleanExtra3 = getIntent().getBooleanExtra(s04.KEY_STAY, false);
                    Intent intent5 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent5.putExtra(s04.KEY_REQUEST_CODE, 10109);
                    intent5.putExtra(s04.KEY_STAY, booleanExtra3);
                    intent5.putExtras(bundleC);
                    intent5.setFlags(603979776);
                    startActivity(intent5);
                    finish();
                    return;
                }
                if (string3.equals("bindGroup")) {
                    q8g.i("openSDK_LOG.AuthActivity", "-->handleActionUri--bind group callback.");
                    boolean booleanExtra4 = getIntent().getBooleanExtra(s04.KEY_STAY, false);
                    Intent intent6 = new Intent(this, (Class<?>) AssistActivity.class);
                    intent6.putExtra(s04.KEY_REQUEST_CODE, 10112);
                    intent6.putExtra(s04.KEY_STAY, booleanExtra4);
                    intent6.putExtras(bundleC);
                    intent6.setFlags(603979776);
                    startActivity(intent6);
                    finish();
                    return;
                }
                if (!string3.equals("joinGroup")) {
                    finish();
                    return;
                }
                q8g.i("openSDK_LOG.AuthActivity", "-->handleActionUri--join group callback. ");
                boolean booleanExtra5 = getIntent().getBooleanExtra(s04.KEY_STAY, false);
                Intent intent7 = new Intent(this, (Class<?>) AssistActivity.class);
                intent7.putExtra(s04.KEY_REQUEST_CODE, 10111);
                intent7.putExtra(s04.KEY_STAY, booleanExtra5);
                intent7.putExtras(bundleC);
                intent7.setFlags(603979776);
                startActivity(intent7);
                finish();
                return;
            }
        }
        q8g.k("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        if (getIntent() == null) {
            q8g.k("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
            finish();
            return;
        }
        try {
            data = getIntent().getData();
        } catch (Exception e2) {
            e2.printStackTrace();
            data = null;
        }
        q8g.j("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + data);
        try {
            a(data);
        } catch (Exception e3) {
            e3.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    @SensorsDataInstrumented
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        PushAutoTrackHelper.onNewIntent(this, intent);
    }
}
