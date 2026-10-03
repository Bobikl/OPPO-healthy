package com.heytap.health.wallet.web;

import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentTransaction;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.wallet.BaseActivityEx;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.p1l;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.x81;
import com.oppo.lib.common.R$id;
import com.oppo.lib.common.R$layout;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes18.dex */
public class WebviewLoadingActivity extends BaseActivityEx {
    public static final String EXTRA_BACK_TO_KEYWORD = "back_to_keyword";
    public static final String EXTRA_URL = "url";
    public static final int REQUEST_CODE_START_ACTIVITY_BACK_REFRESH = 1103;
    public static final int REQUEST_CODE_START_ACTIVITY_DEFAULT = 1101;
    public FragmentWebLoadingBase t;
    public FrameLayout u;
    public COUIToolbar v;
    public String w;
    public boolean x = false;

    private void initView() {
        this.u = (FrameLayout) p1l.a(this, R$id.activity_fragment_frame_layout);
        COUIToolbar cOUIToolbar = (COUIToolbar) p1l.a(this, R$id.tbWebLoading);
        this.v = cOUIToolbar;
        if (this.o) {
            cOUIToolbar.setVisibility(8);
            return;
        }
        cOUIToolbar.setVisibility(0);
        setSupportActionBar(this.v);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void A7(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.x = SpeechConstant.TRUE_STR.equalsIgnoreCase(new UrlQuerySanitizer(str).getValue("isTranslucentBg"));
        } catch (Exception unused) {
        }
    }

    public void B7() {
        finish();
    }

    public void C7() {
        if (TextUtils.isEmpty(this.w) && !x7()) {
            t6b.c("url is empty.");
            finish();
            return;
        }
        Bundle arguments = this.t.getArguments();
        t6b.a("WebviewLoadingActivity, showWebViewFragment, arguments: " + arguments);
        if (arguments == null) {
            arguments = new Bundle();
        }
        t6b.a("WebviewLoadingActivity, showWebViewFragment, bundle: " + arguments);
        arguments.putString(FragmentWebLoadingBase.WEB_VIEW_INIT_URL, this.w);
        this.t.setArguments(arguments);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R$id.activity_fragment_frame_layout, this.t).addToBackStack(null);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        B7();
    }

    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String strY7 = y7();
        this.w = strY7;
        A7(strY7);
        super.onCreate(bundle);
        setContentView(R$layout.activity_client_fragment_webview_container);
        initView();
        z7();
        C7();
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        FragmentWebLoadingBase fragmentWebLoadingBase = this.t;
        if (fragmentWebLoadingBase != null && fragmentWebLoadingBase.isAdded()) {
            this.t.onDestroy();
            this.t = null;
        }
        super.onDestroy();
    }

    public boolean x7() {
        return false;
    }

    public String y7() {
        boolean booleanExtra = getIntent().getBooleanExtra(x81.KEY_ENCODE, false);
        try {
            String stringExtra = getIntent().getStringExtra("url");
            return (!booleanExtra || TextUtils.isEmpty(stringExtra)) ? stringExtra : URLDecoder.decode(stringExtra);
        } catch (Exception e2) {
            t6b.d(this.s, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            t6b.i(this.s, "get url from intent fail");
            return this.w;
        }
    }

    public void z7() {
        this.t = FragmentWebLoadingBase.e0();
    }
}
