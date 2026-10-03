package com.heytap.health.wallet.web;

import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.heytap.health.wallet.jsbridge.JsConstant;
import com.heytap.health.wallet.jsbridge.JsFamily;
import com.oplus.aiunit.vision.t6b;

/* JADX INFO: loaded from: classes18.dex */
public abstract class HybridWebActivity extends WebviewLoadingActivity {

    public static class GuidWebFragment extends FragmentWebLoadingBase {
        public int v;
        public HybridWebActivity w;

        public class a extends WebChromeClient {
            public a() {
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                super.onReceivedTitle(webView, str);
                if (!GuidWebFragment.this.isAdded() || !TextUtils.isEmpty(GuidWebFragment.this.o) || TextUtils.isEmpty(str) || str.startsWith("http")) {
                    return;
                }
                GuidWebFragment.this.getActivity().setTitle(str);
            }
        }

        @Override // com.heytap.health.wallet.web.FragmentWebLoadingBase
        public WebChromeClient X() {
            return new a();
        }

        @Override // com.heytap.health.wallet.web.FragmentWebLoadingBase
        public boolean d0() {
            return true;
        }

        @Override // com.heytap.health.wallet.web.FragmentWebLoadingBase
        public int h0() {
            t6b.b("GuidWebFragment", "onLayoutId, arguments: " + getArguments());
            if (getArguments() != null) {
                this.v = getArguments().getInt(FragmentWebLoadingBase.WEB_VIEW_LAYOUT_ID);
            }
            if (this.v == 0) {
                t6b.d("GuidWebFragment", "layoutId = " + this.v);
            }
            return this.v;
        }

        @Override // com.heytap.health.wallet.web.FragmentWebLoadingBase
        public void initView(View view) {
            super.initView(view);
            HybridWebActivity hybridWebActivity = this.w;
            if (hybridWebActivity != null) {
                hybridWebActivity.F7(view);
            } else {
                t6b.d("HybridWebActivity", "GuidWebFragment activity is null");
            }
        }
    }

    public GuidWebFragment D7(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(FragmentWebLoadingBase.WEB_VIEW_INIT_URL, str);
        t6b.b("GuidWebFragment", "createInstance, layoutId: " + i);
        bundle.putInt(FragmentWebLoadingBase.WEB_VIEW_LAYOUT_ID, i);
        t6b.b("GuidWebFragment", "createInstance, bundle: " + bundle);
        GuidWebFragment guidWebFragment = new GuidWebFragment();
        guidWebFragment.w = this;
        guidWebFragment.setArguments(bundle);
        guidWebFragment.k0(E7());
        return guidWebFragment;
    }

    public JsFamily E7() {
        return JsConstant.getJsFamily();
    }

    public abstract void F7(View view);

    public abstract int G7();

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity
    public boolean x7() {
        return true;
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity
    public String y7() {
        String strY7 = super.y7();
        if (TextUtils.isEmpty(strY7)) {
            return strY7;
        }
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(strY7);
        boolean z = urlQuerySanitizer.getParameterList() != null && urlQuerySanitizer.getParameterList().size() > 0;
        StringBuilder sb = new StringBuilder(20);
        if (!urlQuerySanitizer.hasParameter("k2041")) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append("k2041=true");
        }
        if (!urlQuerySanitizer.hasParameter("oknt")) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append("oknt=true");
        }
        if (sb.length() <= 0) {
            return strY7;
        }
        if (z) {
            return strY7 + "&" + sb.toString();
        }
        return strY7 + "?" + sb.toString();
    }

    @Override // com.heytap.health.wallet.web.WebviewLoadingActivity
    public final void z7() {
        int iG7 = G7();
        t6b.b(this.s, "initFragment, layoutId = " + iG7);
        if (iG7 > 0) {
            this.t = D7(iG7, y7());
        } else {
            super.z7();
        }
    }
}
