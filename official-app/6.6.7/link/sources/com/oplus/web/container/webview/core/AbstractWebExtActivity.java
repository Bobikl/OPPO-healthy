package com.oplus.web.container.webview.core;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.oplus.aiunit.vision.h20;
import com.oplus.aiunit.vision.sri;
import com.oplus.webcontainer.lib_biz_web.R$id;
import com.oplus.webcontainer.lib_biz_web.R$layout;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class AbstractWebExtActivity extends AppCompatActivity {
    public a i;
    public boolean j = true;

    public static class a {
        public final FragmentActivity a;
        public final FragmentManager b;

        public a(FragmentActivity fragmentActivity) {
            this.a = fragmentActivity;
            this.b = fragmentActivity.getSupportFragmentManager();
        }

        public boolean a() {
            WebContainerFragment webContainerFragmentC = c();
            if (webContainerFragmentC != null) {
                return webContainerFragmentC.goBack();
            }
            return false;
        }

        public void b(@Nullable Bundle bundle, boolean z) {
            Class cls = (Class) this.a.getIntent().getSerializableExtra("$web_container_fragment");
            if (bundle != null || cls == null) {
                return;
            }
            Uri uri = (Uri) this.a.getIntent().getParcelableExtra("$web_container_uri");
            int intExtra = this.a.getIntent().getIntExtra("$web_container_request_code", 0);
            int intExtra2 = this.a.getIntent().getIntExtra("$web_container_interceptor_request_code", 0);
            if (uri != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("$web_container_request_code", intExtra);
                bundle2.putInt("$web_container_interceptor_request_code", intExtra2);
                WebContainerFragment webContainerFragmentB = new WebContainerFragment.b().c(uri).a(this.a.getIntent().getBundleExtra("$web_container_ext_bundle")).a(bundle2).b(this.a, cls);
                if (!z) {
                    webContainerFragmentB.setWebViewSaveInstanceState(false);
                }
                this.b.beginTransaction().add(R$id.web_container_activity_decor, webContainerFragmentB, "@web_container_root_tag").commitAllowingStateLoss();
            }
        }

        public WebContainerFragment c() {
            int backStackEntryCount = this.b.getBackStackEntryCount();
            if (backStackEntryCount <= 0) {
                return (WebContainerFragment) this.b.findFragmentByTag("@web_container_root_tag");
            }
            return (WebContainerFragment) this.b.findFragmentByTag(this.b.getBackStackEntryAt(backStackEntryCount - 1).getName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f7() {
        sri.b(this, !sri.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initWindowAndDecor() {
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
    }

    public void onBackPressed() {
        if (this.i.a()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(@Nullable Bundle bundle) {
        initWindowAndDecor();
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        setContentView(R$layout.activity_web_container_layout);
        h20.c(this);
        a aVar = new a(this);
        this.i = aVar;
        aVar.b(bundle, this.j);
    }

    public void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        f7();
    }
}
