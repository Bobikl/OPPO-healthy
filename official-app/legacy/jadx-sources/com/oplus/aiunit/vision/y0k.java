package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class y0k {
    public static final String TAG = "ToastUtil";
    public static List<Toast> a = new ArrayList();

    public class a implements InvocationHandler {
        public final /* synthetic */ Object i;

        public a(Object obj) {
            this.i = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getName().equals("enqueueToast")) {
                y0k.f(objArr[1]);
            }
            return method.invoke(this.i, objArr);
        }
    }

    public class b implements l6h<Boolean> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f18819j;

        public b(String str, boolean z) {
            this.i = str;
            this.f18819j = z;
        }

        @Override // com.oplus.aiunit.vision.l6h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Boolean bool) {
            Toast toastMakeText = Toast.makeText(b78.a(), this.i, !this.f18819j ? 1 : 0);
            y0k.a.add(toastMakeText);
            if (y0k.a.size() > 1) {
                Toast toast = (Toast) y0k.a.get(0);
                y0k.a.remove(0);
                toast.cancel();
            }
            toastMakeText.show();
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            a7b.b(y0k.TAG, "[show onError] --> " + th.getMessage());
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        }
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void d() {
        a7b.f(TAG, "== ToastUtil init ==");
        String str = Build.MANUFACTURER;
        if (!str.equalsIgnoreCase(xni.a.ROM_MIUI)) {
            a7b.f(TAG, "is not xiaomi brand,do nothing:" + str);
            return;
        }
        try {
            Field declaredField = Toast.class.getDeclaredField("sService");
            declaredField.setAccessible(true);
            Method declaredMethod = Toast.class.getDeclaredMethod("getService", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            Class<?> cls = Class.forName("android.app.INotificationManager");
            declaredField.set(null, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(objInvoke)));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
            a7b.b(TAG, "Toast reflection exception:" + e2.getMessage());
        }
    }

    public static /* synthetic */ void e(x5h x5hVar) throws Throwable {
        x5hVar.onSuccess(Boolean.TRUE);
    }

    public static void f(Object obj) {
        try {
            Field declaredField = Class.forName(Toast.class.getName() + "$TN").getDeclaredField("mNextView");
            declaredField.setAccessible(true);
            TextView textView = (TextView) ((LinearLayout) declaredField.get(obj)).getChildAt(0);
            textView.setText(textView.getText().toString().replace(qe0.d(b78.a().getPackageName()) + "：", ""));
            a7b.f(TAG, "content: " + ((Object) textView.getText()));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            a7b.b(TAG, "");
        }
    }

    public static void g(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.x0k
            @Override // com.oplus.aiunit.vision.o6h
            public final void a(x5h x5hVar) throws Throwable {
                y0k.e(x5hVar);
            }
        }).y(su8.c()).s(f30.c()).b(new b(str, z));
    }

    public static void h(String str) {
        g(str, false);
    }

    public static void i(String str) {
        g(str, true);
    }
}
