package com.heytap.health.wallet.web;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.fragment.app.FragmentTransaction;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.tak;
import com.oplus.aiunit.vision.x81;
import com.oplus.aiunit.vision.z0k;
import com.oppo.lib.common.R$anim;
import com.oppo.lib.common.R$id;
import com.oppo.lib.common.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes18.dex */
public class LoadingWebActivity extends WebviewLoadingActivity {
    public static final int FILE_CHOOSER_RESULT_CODE = 10000;
    public static Stack<LoadingWebActivity> G = new Stack<>();
    public static ValueCallback<Uri> H;
    public static ValueCallback<Uri[]> I;
    public boolean A;
    public boolean B;
    public boolean C = false;
    public String D;
    public boolean E;
    public boolean F;
    public boolean y;
    public String z;

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity
    public void C7() {
        if (TextUtils.isEmpty(this.D) && !x7()) {
            t6b.c("url is empty.");
            finish();
        } else {
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.replace(R$id.activity_fragment_frame_layout, this.t).addToBackStack(null);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public final void D7() {
        finish();
        int i = R$anim.no_anim;
        overridePendingTransition(i, i);
    }

    public boolean E7(String str) {
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("intercept_back");
            return TextUtils.isEmpty(queryParameter) || SpeechConstant.TRUE_STR.equals(queryParameter);
        } catch (Exception e2) {
            t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return true;
        }
    }

    public final void F7(int i, int i2, Intent intent) {
        Uri[] uriArr;
        if (i != 10000 || I == null) {
            return;
        }
        if (i2 != -1 || intent == null) {
            uriArr = null;
        } else {
            String dataString = intent.getDataString();
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                uriArr = new Uri[clipData.getItemCount()];
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    uriArr[i3] = clipData.getItemAt(i3).getUri();
                }
            } else {
                uriArr = null;
            }
            if (dataString != null) {
                uriArr = new Uri[]{Uri.parse(dataString)};
            }
        }
        I.onReceiveValue(uriArr);
        I = null;
    }

    public final void G7(String str, String str2) {
        t6b.e("returnToSpecificPage keyword:" + str + " url=" + str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            FragmentWebLoadingBase fragmentWebLoadingBase = this.t;
            if (fragmentWebLoadingBase instanceof WalletWebFragment) {
                ((WalletWebFragment) fragmentWebLoadingBase).loadUrl(str2);
                return;
            }
            return;
        }
        LoadingWebActivity loadingWebActivityPop = null;
        while (true) {
            Stack<LoadingWebActivity> stack = G;
            if (stack == null || stack.empty() || G.peek().y7().contains(str)) {
                break;
            } else if (loadingWebActivityPop == null) {
                loadingWebActivityPop = G.pop();
            } else {
                arrayList.add(G.pop());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((LoadingWebActivity) it.next()).D7();
        }
        if (loadingWebActivityPop != null) {
            loadingWebActivityPop.finish();
        }
    }

    public final void H7() {
        this.v.setIsTitleCenterStyle(false);
        R1(this, this.v, true);
    }

    @Override // android.app.Activity
    public void finish() {
        t6b.f("LoadingWebActivity", "finish: backKeyWord:" + this.z);
        if (TextUtils.isEmpty(this.z)) {
            super.finish();
            if (G.contains(this)) {
                G.remove(this);
                return;
            }
            return;
        }
        this.A = true;
        String str = this.z;
        this.z = "";
        G7(str, "");
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10000) {
            if (H == null && I == null) {
                return;
            }
            Uri data = (intent == null || i2 != -1) ? null : intent.getData();
            if (I != null) {
                F7(i, i2, intent);
                return;
            }
            ValueCallback<Uri> valueCallback = H;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(data);
                H = null;
                return;
            }
            return;
        }
        if (i == 1103) {
            t6b.b("LoadingWebActivity", "REQUEST_CODE_START_ACTIVITY_BACK_REFRESH");
            return;
        }
        if (intent != null) {
            try {
                if (intent.getExtras() != null) {
                    String string = intent.getExtras().getString("pay_result");
                    if ("success".equalsIgnoreCase(string)) {
                        z0k.f(this).t(this, getResources().getString(R$string.alipay_result_code_9000));
                        finish();
                    } else if ("cancel".equalsIgnoreCase(string)) {
                        finish();
                    } else {
                        AcBaseTraceHelper.VAL_FAIL.equalsIgnoreCase(string);
                    }
                }
            } catch (Exception e2) {
                t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        }
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        t6b.b("LoadingWebActivity", "onBackPressed called");
        if (this.t == null) {
            finish();
            return;
        }
        t6b.i("LoadingWebActivity", "webview can goback = " + this.t.Y().canGoBack());
        if (this.t.f0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            String stringExtra = getIntent().getStringExtra(x81.KEY_TITLE);
            this.E = getIntent().getBooleanExtra(x81.KEY_TITLE_LINE, true);
            boolean booleanExtra = getIntent().getBooleanExtra(x81.KEY_TITLE_SHOW, true);
            this.F = booleanExtra;
            if (booleanExtra && !TextUtils.isEmpty(stringExtra)) {
                setTitle(stringExtra);
            }
        } catch (Exception e2) {
            t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
        if (TextUtils.isEmpty(this.D)) {
            this.D = y7();
        }
        super.onCreate(bundle);
        if (this.o && getSupportActionBar() != null) {
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0));
        }
        G.add(this);
        H7();
        if (this.o && this.C) {
            tak.b(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity
    public void z7() {
        try {
            if (TextUtils.isEmpty(getIntent().getStringExtra(x81.KEY_USER_AUTH_CODE))) {
                this.t = WalletWebFragment.p0(this.D);
            } else {
                this.B = false;
            }
        } catch (Exception e2) {
            t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }
}
