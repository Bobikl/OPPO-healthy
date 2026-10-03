package com.heytap.health.wallet.web;

import android.content.Intent;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.wallet.BaseActivityEx;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.x81;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/main/web")
public class ProWebActivity extends BaseActivityEx {
    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009f A[Catch: Exception -> 0x00ca, TryCatch #1 {Exception -> 0x00ca, blocks: (B:23:0x008b, B:25:0x009f, B:26:0x00b2), top: B:35:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b2 A[Catch: Exception -> 0x00ca, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ca, blocks: (B:23:0x008b, B:25:0x009f, B:26:0x00b2), top: B:35:0x008b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        boolean z;
        String stringExtra2;
        super.onCreate(bundle);
        String strDecode = "";
        boolean booleanExtra = false;
        if (getIntent() != null) {
            try {
                stringExtra = getIntent().getStringExtra("url");
                try {
                    boolean booleanExtra2 = getIntent().getBooleanExtra(x81.KEY_ENCODE, false);
                    try {
                        booleanExtra = getIntent().getBooleanExtra(x81.KEY_IS_MODAL, false);
                        strDecode = stringExtra;
                        stringExtra2 = getIntent().getStringExtra(x81.KEY_USER_AUTH_CODE);
                        z = booleanExtra;
                        booleanExtra = booleanExtra2;
                    } catch (Exception e2) {
                        e = e2;
                        z = booleanExtra;
                        booleanExtra = booleanExtra2;
                        t6b.d(getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName() + e.getMessage());
                        strDecode = stringExtra;
                        stringExtra2 = "";
                    }
                } catch (Exception e3) {
                    e = e3;
                    z = false;
                    t6b.d(getClass().getSimpleName(), Thread.currentThread().getStackTrace()[1].getMethodName() + e.getMessage());
                    strDecode = stringExtra;
                    stringExtra2 = "";
                    if (booleanExtra) {
                        strDecode = URLDecoder.decode(strDecode);
                    }
                    if (!TextUtils.isEmpty(strDecode)) {
                        try {
                            if (SpeechConstant.TRUE_STR.equalsIgnoreCase(new UrlQuerySanitizer(strDecode).getValue("isTranslucentBg"))) {
                                Intent intent = new Intent(this, (Class<?>) TranslucentLoadingWebActivity.class);
                                intent.putExtra("url", strDecode);
                                intent.putExtra(x81.KEY_IS_MODAL, z);
                                startActivity(intent);
                            } else {
                                Intent intent2 = new Intent(this, (Class<?>) LoadingWebActivity.class);
                                intent2.putExtra("url", strDecode);
                                intent2.putExtra(x81.KEY_IS_MODAL, z);
                                intent2.putExtra(x81.KEY_USER_AUTH_CODE, stringExtra2);
                                startActivity(intent2);
                            }
                        } catch (Exception e4) {
                            t6b.d("ProWebActivity", Thread.currentThread().getStackTrace()[1].getMethodName() + e4.getMessage());
                        }
                    }
                    finish();
                }
            } catch (Exception e5) {
                e = e5;
                stringExtra = "";
            }
        } else {
            stringExtra2 = "";
            z = false;
        }
        if (booleanExtra && !TextUtils.isEmpty(strDecode)) {
            strDecode = URLDecoder.decode(strDecode);
        }
        if (!TextUtils.isEmpty(strDecode)) {
            if (SpeechConstant.TRUE_STR.equalsIgnoreCase(new UrlQuerySanitizer(strDecode).getValue("isTranslucentBg"))) {
                Intent intent3 = new Intent(this, (Class<?>) TranslucentLoadingWebActivity.class);
                intent3.putExtra("url", strDecode);
                intent3.putExtra(x81.KEY_IS_MODAL, z);
                startActivity(intent3);
            } else {
                Intent intent4 = new Intent(this, (Class<?>) LoadingWebActivity.class);
                intent4.putExtra("url", strDecode);
                intent4.putExtra(x81.KEY_IS_MODAL, z);
                intent4.putExtra(x81.KEY_USER_AUTH_CODE, stringExtra2);
                startActivity(intent4);
            }
        }
        finish();
    }
}
