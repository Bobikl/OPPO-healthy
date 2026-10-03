package com.bytedance.sdk.open.douyin.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.bytedance.sdk.open.aweme.authorize.model.Authorization;
import com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.bm9;
import com.oplus.aiunit.vision.l1l;
import com.oplus.aiunit.vision.m06;
import com.oplus.aiunit.vision.v81;
import com.oplus.aiunit.vision.yam;

/* JADX INFO: loaded from: classes13.dex */
public class DouYinWebAuthorizeActivity extends BaseWebAuthorizeActivity {
    public static final String b = "open.douyin.com";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1442c = "api.snssdk.com";
    public static final String d = "/platform/oauth/connect/";
    public m06 x;

    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public void B() {
        RelativeLayout relativeLayout = this.p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(Color.parseColor("#161823"));
        }
    }

    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public String j() {
        return d;
    }

    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public String k() {
        return f1442c;
    }

    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public String l() {
        return b;
    }

    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public String n() {
        return Const.Scheme.SCHEME_HTTPS;
    }

    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public boolean o(Intent intent, bm9 bm9Var) {
        return this.x.c(intent, bm9Var);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.x = yam.a(this);
        super.onCreate(bundle);
        l1l.a(this, 0);
    }

    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public boolean u() {
        return true;
    }

    @Override // com.bytedance.sdk.open.aweme.authorize.ui.BaseWebAuthorizeActivity
    public void z(Authorization.Request request, v81 v81Var) {
        if (v81Var != null && this.f1437l != null) {
            if (v81Var.extras == null) {
                v81Var.extras = new Bundle();
            }
            v81Var.extras.putString(BaseWebAuthorizeActivity.WAP_AUTHORIZE_URL, this.f1437l.getUrl());
        }
        A("douyinapi.DouYinEntryActivity", request, v81Var);
    }
}
