package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.ActivityOptionsCompat;

/* JADX INFO: loaded from: classes16.dex */
public abstract class ofg implements dx9 {
    public dx9 a;
    public String b;

    @Override // com.oplus.aiunit.vision.dx9
    public void a(Activity activity, Uri uri, String str, ActivityOptionsCompat activityOptionsCompat, String str2) {
        if (uri != null) {
            uri = Uri.parse(uri.toString().replace(" ", ""));
        }
        Uri uri2 = uri;
        if (!j(uri2)) {
            a7b.b("SchemeInterceptor", "url is inValid, try to changed");
            return;
        }
        this.b = uri2.getHost();
        StringBuilder sb = new StringBuilder();
        sb.append("dispatcher scheme = ");
        sb.append(this.b);
        sb.append("; transitionName = ");
        sb.append(str2);
        if (!d(this.b)) {
            dx9 dx9Var = this.a;
            if (dx9Var != null) {
                dx9Var.a(activity, uri2, str, activityOptionsCompat, str2);
                return;
            }
            return;
        }
        try {
            if (activityOptionsCompat != null) {
                h(activity, uri2, str, activityOptionsCompat, str2);
            } else {
                f(uri2, str, null);
            }
        } catch (Exception e2) {
            a7b.b("SchemeInterceptor", "Scheme dispatcherWithTransition err :" + e2.toString());
        }
    }

    @Override // com.oplus.aiunit.vision.dx9
    public void b(dx9 dx9Var) {
        this.a = dx9Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004e A[Catch: Exception -> 0x0052, TRY_LEAVE, TryCatch #0 {Exception -> 0x0052, blocks: (B:11:0x0040, B:13:0x004a, B:14:0x004e), top: B:23:0x0040 }] */
    @Override // com.oplus.aiunit.vision.dx9
    public void c(Activity activity, Uri uri, String str, int i, boolean z) {
        if (uri != null) {
            uri = Uri.parse(uri.toString().replace(" ", ""));
        }
        if (!j(uri)) {
            a7b.b("SchemeInterceptor", "url is inValid, try to changed");
            return;
        }
        this.b = uri.getHost();
        StringBuilder sb = new StringBuilder();
        sb.append("dispatcherWithResultCode  scheme = ");
        sb.append(this.b);
        if (!d(this.b)) {
            dx9 dx9Var = this.a;
            if (dx9Var != null) {
                dx9Var.e(uri, str, null);
                return;
            }
            return;
        }
        if (z) {
            try {
                if (this.b.equalsIgnoreCase("app")) {
                    g(activity, uri, str, i);
                } else {
                    f(uri, str, null);
                }
            } catch (Exception e2) {
                a7b.b("SchemeInterceptor", "Scheme dispatcherWithResultCode err :" + e2.toString());
            }
        } else {
            f(uri, str, null);
        }
    }

    @Override // com.oplus.aiunit.vision.dx9
    public void e(Uri uri, String str, Intent intent) {
        if (uri != null) {
            uri = Uri.parse(uri.toString().replace(" ", ""));
        }
        if (!j(uri)) {
            a7b.b("SchemeInterceptor", "url is inValid, try to changed");
            return;
        }
        this.b = uri.getHost();
        StringBuilder sb = new StringBuilder();
        sb.append("dispatcher scheme = ");
        sb.append(this.b);
        if (!d(this.b)) {
            dx9 dx9Var = this.a;
            if (dx9Var != null) {
                dx9Var.e(uri, str, null);
                return;
            }
            return;
        }
        try {
            f(uri, str, intent);
        } catch (Exception e2) {
            a7b.b("SchemeInterceptor", "Scheme childDispatcher err :" + e2.toString());
        }
    }

    public abstract void f(Uri uri, String str, Intent intent);

    public void g(Activity activity, Uri uri, String str, int i) {
    }

    public void h(Activity activity, Uri uri, String str, ActivityOptionsCompat activityOptionsCompat, String str2) {
    }

    public boolean i(String str) {
        if (mtj.b(str) || !str.startsWith("/")) {
            a7b.b("SchemeInterceptor", "Extract the path failed, the path must be start with '/' and contain more than 2 '/'!");
            return false;
        }
        try {
            if (!mtj.b(str.substring(1, str.indexOf("/", 1)))) {
                return true;
            }
            a7b.b("SchemeInterceptor", "Extract the default group failed! There's nothing between 2 '/'!");
            return false;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to extract path! ");
            sb.append(e2.getMessage());
            a7b.b("SchemeInterceptor", "Failed to extract path!");
            return false;
        }
    }

    public boolean j(Uri uri) {
        return (uri == null || uri.getScheme() == null || !uri.getScheme().startsWith(mmd.OPERATION_PREFIX)) ? false : true;
    }
}
