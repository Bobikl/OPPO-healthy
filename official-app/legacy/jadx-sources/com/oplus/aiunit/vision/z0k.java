package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.Toast;
import com.oppo.lib.common.R$string;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes18.dex */
public class z0k {
    public static g7h<z0k, Context> mInstance = new b();
    public Context a;
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Toast f19216c;
    public Toast d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f19217e;

    public class a implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f19218j;

        public a(String str, int i) {
            this.i = str;
            this.f19218j = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (z0k.this.f19217e) {
                z0k.this.h(qz0.mContext);
                z0k.this.f19216c.setText(this.i);
                z0k.this.f19216c.setDuration(this.f19218j);
                z0k z0kVar = z0k.this;
                z0kVar.e(z0kVar.f19216c);
            }
            z0k.this.f19216c.show();
        }
    }

    public class b extends g7h<z0k, Context> {
        @Override // com.oplus.aiunit.vision.g7h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public z0k a(Context context) {
            return new z0k(context);
        }
    }

    public static z0k f(Context context) {
        return mInstance.b(context);
    }

    public static WindowManager.LayoutParams g(Toast toast) {
        try {
            Method declaredMethod = toast.getClass().getDeclaredMethod("getWindowParams", new Class[0]);
            declaredMethod.setAccessible(true);
            return (WindowManager.LayoutParams) declaredMethod.invoke(toast, new Object[0]);
        } catch (IllegalAccessException e2) {
            t6b.d(y0k.TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return null;
        } catch (NoSuchMethodException e3) {
            t6b.d(y0k.TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e3.getMessage());
            return null;
        } catch (InvocationTargetException e4) {
            t6b.d(y0k.TAG, Thread.currentThread().getStackTrace()[1].getMethodName() + e4.getMessage());
            return null;
        }
    }

    public final void e(Toast toast) {
        WindowManager.LayoutParams layoutParamsG;
        if (!i(qz0.mContext) || (layoutParamsG = g(toast)) == null) {
            return;
        }
        layoutParamsG.flags = 6946832;
    }

    public final void h(Context context) {
        if (this.f19216c == null) {
            this.f19216c = Toast.makeText(context, "", 0);
        }
        if (this.d == null) {
            this.d = new Toast(context);
        }
    }

    public final boolean i(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
    }

    public void j(String str, int i) {
        this.b.post(new a(str, i));
    }

    public void k(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            m(context.getString(R$string.error_tips_usual, str));
        } else {
            q(context.getString(R$string.error_tips_from_server, str2, str));
        }
    }

    public void l(int i) {
        p(i, 1);
    }

    public void m(String str) {
        r(str, 1);
    }

    public void n(Context context, String str, int i) {
        j(str, i);
    }

    public void o(int i) {
        Context context = this.a;
        n(context, context.getString(i), 0);
    }

    public void p(int i, int i2) {
        Context context = this.a;
        n(context, context.getString(i), i2);
    }

    public void q(String str) {
        r(str, 0);
    }

    public void r(String str, int i) {
        n(this.a, str, i);
    }

    public void s(Context context, int i) {
        t(context, context.getString(i));
    }

    public void t(Context context, String str) {
        f(context).q(str);
    }

    @SuppressLint({"ShowToast"})
    public z0k(Context context) {
        this.b = null;
        this.f19216c = null;
        this.d = null;
        this.f19217e = new byte[0];
        if (context == null) {
            this.a = qz0.mContext;
        } else {
            this.a = context.getApplicationContext();
        }
        this.b = new Handler(Looper.getMainLooper());
    }
}
