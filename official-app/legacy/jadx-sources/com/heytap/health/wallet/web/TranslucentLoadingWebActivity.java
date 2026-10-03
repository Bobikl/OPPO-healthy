package com.heytap.health.wallet.web;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentTransaction;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.x81;
import com.oppo.lib.common.R$id;
import com.oppo.lib.common.R$menu;
import com.platform.sdk.center.webview.js.JsHelp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes18.dex */
public class TranslucentLoadingWebActivity extends WebviewLoadingActivity {
    public static final int FILE_CHOOSER_RESULT_CODE = 10000;
    public static Stack<TranslucentLoadingWebActivity> L = new Stack<>();
    public static ValueCallback<Uri> M;
    public static ValueCallback<Uri[]> N;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F = true;
    public String G;
    public boolean H;
    public boolean I;
    public MenuItem J;
    public MenuItem K;
    public boolean y;
    public String z;

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity
    public void C7() {
        if (TextUtils.isEmpty(this.G) && !x7()) {
            t6b.c("url is empty.");
            finish();
        } else {
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.replace(R$id.activity_fragment_frame_layout, this.t).addToBackStack(null);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
    }

    public final boolean D7(String str) {
        try {
            return true ^ SpeechConstant.FALSE_STR.equalsIgnoreCase(Uri.parse(str).getQueryParameter("canGoBack"));
        } catch (Exception e2) {
            t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return true;
        }
    }

    public final void E7() {
        finish();
    }

    public final boolean F7(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(JsHelp.KEY_IS_TRANSPARENT_BAR)) {
            return false;
        }
        try {
            return SpeechConstant.TRUE_STR.equalsIgnoreCase(Uri.parse(str).getQueryParameter(JsHelp.KEY_IS_TRANSPARENT_BAR));
        } catch (Exception e2) {
            t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return false;
        }
    }

    public void G7() {
        if (TextUtils.isEmpty(this.G)) {
            this.B = true;
            return;
        }
        this.o = F7(this.G);
        this.y = J7(this.G);
        this.C = H7(this.G);
        this.B = D7(this.G);
        this.D = I7(this.G);
        this.F = M7(this.G);
        this.E = N7(this.G);
    }

    public boolean H7(String str) {
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("intercept_back");
            return TextUtils.isEmpty(queryParameter) || SpeechConstant.TRUE_STR.equals(queryParameter);
        } catch (Exception e2) {
            t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return true;
        }
    }

    public final boolean I7(String str) {
        if (str != null) {
            try {
                if ("goback".equals(Uri.parse(str).getQueryParameter("mnhm"))) {
                    return false;
                }
            } catch (Exception e2) {
                t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        }
        return true;
    }

    public final boolean J7(String str) {
        try {
            return SpeechConstant.TRUE_STR.equalsIgnoreCase(Uri.parse(str).getQueryParameter("onBackRefresh"));
        } catch (Exception unused) {
            return false;
        }
    }

    public final void K7(int i, int i2, Intent intent) {
        Uri[] uriArr;
        if (i != 10000 || N == null) {
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
        N.onReceiveValue(uriArr);
        N = null;
    }

    public final void L7(String str, String str2) {
        t6b.e("returnToSpecificPage keyword:" + str + " url=" + str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            FragmentWebLoadingBase fragmentWebLoadingBase = this.t;
            if (fragmentWebLoadingBase instanceof TranslucentWalletWebFragment) {
                ((TranslucentWalletWebFragment) fragmentWebLoadingBase).loadUrl(str2);
                return;
            }
            return;
        }
        TranslucentLoadingWebActivity translucentLoadingWebActivityPop = null;
        while (true) {
            Stack<TranslucentLoadingWebActivity> stack = L;
            if (stack == null || stack.empty() || L.peek().y7().contains(str)) {
                break;
            } else if (translucentLoadingWebActivityPop == null) {
                translucentLoadingWebActivityPop = L.pop();
            } else {
                arrayList.add(L.pop());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((TranslucentLoadingWebActivity) it.next()).E7();
        }
        if (translucentLoadingWebActivityPop != null) {
            translucentLoadingWebActivityPop.finish();
        }
    }

    public final boolean M7(String str) {
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("right_button_enable");
            if (!TextUtils.isEmpty(queryParameter) && !SpeechConstant.TRUE_STR.equalsIgnoreCase(queryParameter)) {
                SpeechConstant.FALSE_STR.equalsIgnoreCase(queryParameter);
            }
            return true;
        } catch (Exception e2) {
            t6b.b("LoadingWebActivity", e2.toString());
            return true;
        }
    }

    public final boolean N7(String str) {
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("use_center_title");
            return (TextUtils.isEmpty(queryParameter) || SpeechConstant.FALSE_STR.equalsIgnoreCase(queryParameter) || !SpeechConstant.TRUE_STR.equalsIgnoreCase(queryParameter)) ? false : true;
        } catch (Exception e2) {
            t6b.b("LoadingWebActivity", e2.toString());
            return false;
        }
    }

    @Override // android.app.Activity
    public void finish() {
        t6b.e("finish: backKeyWord:" + this.z);
        if (TextUtils.isEmpty(this.z)) {
            super.finish();
            if (L.contains(this)) {
                L.remove(this);
            }
            getIntent().getBooleanExtra(x81.KEY_IS_MODAL, false);
            return;
        }
        this.A = true;
        String str = this.z;
        this.z = "";
        L7(str, "");
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10000) {
            if (i == 1103) {
                t6b.b("LoadingWebActivity", "REQUEST_CODE_START_ACTIVITY_BACK_REFRESH");
            }
        } else {
            if (M == null && N == null) {
                return;
            }
            Uri data = (intent == null || i2 != -1) ? null : intent.getData();
            if (N != null) {
                K7(i, i2, intent);
                return;
            }
            ValueCallback<Uri> valueCallback = M;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(data);
                M = null;
            }
        }
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.t == null) {
            finish();
            return;
        }
        t6b.i("LoadingWebActivity", "webview can goback = " + this.t.Y().canGoBack());
        if (this.C && this.t.Y().canGoBack()) {
            this.t.Y().goBack();
        } else {
            if (this.t.f0()) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            String stringExtra = getIntent().getStringExtra(x81.KEY_TITLE);
            this.H = getIntent().getBooleanExtra(x81.KEY_TITLE_LINE, true);
            boolean booleanExtra = getIntent().getBooleanExtra(x81.KEY_TITLE_SHOW, true);
            this.I = booleanExtra;
            if (booleanExtra && !TextUtils.isEmpty(stringExtra)) {
                setTitle(stringExtra);
            }
        } catch (Exception e2) {
            t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
        if (TextUtils.isEmpty(this.G)) {
            this.G = y7();
        }
        G7();
        super.onCreate(bundle);
        if (this.o && getSupportActionBar() != null) {
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0));
        }
        L.add(this);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(this.B);
        }
        if (this.o) {
            return;
        }
        this.v.setIsTitleCenterStyle(this.E);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        ActionBar supportActionBar;
        getMenuInflater().inflate(R$menu.menu_title_view, menu);
        this.J = menu.findItem(R$id.action_cancel);
        this.K = menu.findItem(R$id.action_next);
        this.J.setVisible(false);
        if (this.D && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        this.K.setEnabled(this.F);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (sr6.c().j(this)) {
            sr6.c().r(this);
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != i || this.B) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.D && menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        if (menuItem.getItemId() != 16908332 && menuItem.getItemId() != R$id.action_cancel) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (sr6.c().j(this)) {
            return;
        }
        sr6.c().p(this);
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity
    public void z7() {
        try {
            if (TextUtils.isEmpty(getIntent().getStringExtra(x81.KEY_USER_AUTH_CODE))) {
                this.t = TranslucentWalletWebFragment.p0(this.G);
            } else {
                this.C = false;
            }
        } catch (Exception e2) {
            t6b.d("LoadingWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
        }
    }
}
