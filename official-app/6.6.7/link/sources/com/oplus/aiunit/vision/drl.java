package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.oplus.web.container.webview.core.WebContainerActivity;
import com.oplus.web.container.webview.core.WebContainerFragment;
import com.oplus.webcontainer.lib_biz_webview_engine.R$string;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class drl {
    public Uri a;
    public Class<? extends WebContainerFragment> b;
    public int d;
    public Class<? extends FragmentActivity> e;
    public n2a f;
    public String h;
    public final Bundle c = new Bundle();
    public final List<ws9> g = new ArrayList();
    public boolean i = true;
    public String j = "";
    public boolean k = false;

    static {
        try {
            u58.a();
            v58.a();
        } catch (Throwable th) {
            y8b.g("throwable:" + th, new Throwable[0]);
        }
    }

    public drl a(String str, HashMap<String, String> map) {
        this.c.putSerializable(str, map);
        return this;
    }

    public drl b(String str, boolean z) {
        this.c.putBoolean(str, z);
        return this;
    }

    public drl c(ws9 ws9Var) {
        if (ws9Var != null) {
            this.g.add(ws9Var);
        }
        return this;
    }

    public drl d(HashMap<String, String> map) {
        return a("$web_container_fragment_headers", map);
    }

    public final void e(Context context, Class<? extends FragmentActivity> cls) {
        int iC = fsl.c(this.f);
        context.startActivity(new Intent(context, cls).putExtra("$web_container_uri", this.a).putExtra("$web_container_fragment", this.b).putExtra("$web_container_ext_bundle", this.c).putExtra("$web_container_request_code", iC).putExtra("$web_container_interceptor_request_code", fsl.d(this.g)).addFlags(this.d));
    }

    public final void f() {
        String str = this.h;
        if (str == null || str.isEmpty()) {
            throw new RuntimeException("countryCode must not be null!");
        }
        y8b.k(this.k);
        if (this.i) {
            dri.c(q94.b(), this.h, this.j, this.k);
        }
        tfg.b(this.h);
    }

    public drl g(String str) {
        this.h = str;
        return this;
    }

    public drl h(boolean z) {
        this.k = z;
        return this;
    }

    public drl i(Class<? extends WebContainerFragment> cls, Class<? extends FragmentActivity> cls2) {
        this.e = cls2;
        this.b = cls;
        return this;
    }

    public drl j(Uri uri) {
        this.a = uri;
        return this;
    }

    public drl k(n2a n2aVar) {
        this.f = n2aVar;
        return this;
    }

    public void l(Context context, wn9 wn9Var) {
        boolean zE;
        q94.c(context);
        f();
        Uri uri = this.a;
        if (uri != null) {
            String string = uri.toString();
            if (hrc.a(string) && !(zE = tfg.e(string))) {
                dri.h(yg1.c(this.h, this.j, String.valueOf(zE)));
                Toast.makeText(context, R$string.web_container_sdk_engine_link_warn_v2, 1).show();
                return;
            }
        }
        dri.h(yg1.d(this.h, this.j, "true"));
        int iC = fsl.c(this.f);
        int iD = fsl.d(this.g);
        Bundle bundle = new Bundle();
        bundle.putParcelable("$web_container_fragment_uri", this.a);
        bundle.putInt("$web_container_request_code", iC);
        bundle.putInt("$web_container_interceptor_request_code", iD);
        bundle.putAll(this.c);
        wn9Var.onCallback(bundle);
    }

    public boolean m(Context context) {
        q94.c(context);
        f();
        if (this.a != null) {
            dri.h(yg1.d(this.h, this.j, "false"));
            return !hrc.a(this.a.toString()) ? n(context) : o(context);
        }
        dri.h(yg1.g(this.h, this.j));
        return false;
    }

    public boolean n(Context context) {
        q94.c(context);
        if (this.a != null) {
            Intent intent = new Intent("android.intent.action.VIEW", this.a);
            try {
                dri.h(yg1.e(this.h, this.j, this.a.toString()));
                String strA = z35.a(context, intent);
                intent.addFlags(SauAarConstants.L);
                boolean zC = tfg.c(strA);
                y8b.i("WebContainerRouter", "hitBlackPkg:" + zC);
                dri.h(yg1.b(this.h, this.j, strA, String.valueOf(zC)));
                if (!zC) {
                    context.startActivity(intent);
                    return true;
                }
                Toast.makeText(context, R$string.web_container_sdk_engine_link_warn_v2, 1).show();
            } catch (Throwable th) {
                y8b.f("WebContainerRouter", "startDeepLink failed!", th);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean o(Context context) {
        q94.c(context);
        Uri uri = this.a;
        if (uri == null) {
            return false;
        }
        String string = uri.toString();
        dri.h(yg1.f(this.h, this.j, string));
        if (hrc.a(string)) {
            boolean zE = tfg.e(string);
            dri.h(yg1.c(this.h, this.j, String.valueOf(zE)));
            if (!zE) {
                Toast.makeText(context, R$string.web_container_sdk_engine_link_warn_v2, 1).show();
                return false;
            }
        }
        if (this.b == null) {
            this.b = WebContainerFragment.class;
        }
        Class cls = this.e;
        if (cls == null) {
            cls = WebContainerActivity.class;
        }
        dri.h(yg1.a(this.h, this.j, this.b.getSimpleName(), cls.getSimpleName()));
        e(context, cls);
        return true;
    }
}
