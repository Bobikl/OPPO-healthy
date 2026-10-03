package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class rg7 {
    public static Boolean b;

    @SuppressLint({"StaticFieldLeak"})
    public static Context a = b78.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Handler f16197c = new a(Looper.getMainLooper());

    public class a extends Handler {
        public Toast a;

        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (rg7.a == null) {
                return;
            }
            CharSequence charSequence = (CharSequence) message.obj;
            Toast toast = this.a;
            if (toast != null) {
                toast.cancel();
            }
            Toast toastMakeText = Toast.makeText(rg7.a, charSequence, 0);
            this.a = toastMakeText;
            toastMakeText.setText(charSequence);
            this.a.show();
        }
    }

    public static int b(int i) {
        Context contextI = i();
        if (contextI == null) {
            contextI = a;
        }
        return ContextCompat.getColor(contextI, i);
    }

    public static float c(int i) {
        return a.getResources().getDimension(i);
    }

    public static String d(int i, int i2, Object... objArr) {
        return a.getResources().getQuantityString(i, i2, objArr);
    }

    public static String e(int i) {
        try {
            return a.getString(i);
        } catch (Exception e2) {
            yha.j(e2);
            return "error:" + i;
        }
    }

    public static String f(int i, Object... objArr) {
        try {
            return a.getString(i, objArr);
        } catch (Exception e2) {
            yha.j(e2);
            return "error:" + i;
        }
    }

    public static Activity g(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static Context h() {
        return a;
    }

    public static Activity i() {
        return op.n().p();
    }

    public static boolean j() {
        Boolean boolValueOf = b;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(qe0.s());
            b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static Map<String, Object> k(String str, Object obj) {
        HashMap map = new HashMap();
        map.put(str, obj);
        return map;
    }

    public static void l(@StringRes int i) {
        String strE = e(i);
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = strE;
        f16197c.sendMessage(messageObtain);
    }

    public static void m(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = charSequence;
        f16197c.sendMessage(messageObtain);
    }
}
