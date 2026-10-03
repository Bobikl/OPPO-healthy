package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public final class jxm extends ContextThemeWrapper {
    public static final String[] f = {"android.widget", "android.webkit", "android.app"};
    public Resources a;
    public LayoutInflater b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ClassLoader f13066c;
    public b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater.Factory f13067e;

    public class a implements LayoutInflater.Factory {
        public a() {
        }

        @Override // android.view.LayoutInflater.Factory
        public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return jxm.this.b(str, context, attributeSet);
        }
    }

    public class b {
        public HashSet<String> a = new HashSet<>();
        public HashMap<String, Constructor<?>> b = new HashMap<>();

        public b() {
        }
    }

    public jxm(Context context, int i, ClassLoader classLoader) {
        super(context, i);
        this.d = new b();
        this.f13067e = new a();
        this.a = kxm.b();
        this.f13066c = classLoader;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[PHI: r4
  0x0063: PHI (r4v1 java.lang.Class<?>) = 
  (r4v0 java.lang.Class<?>)
  (r4v10 java.lang.Class<?>)
  (r4v10 java.lang.Class<?>)
  (r4v10 java.lang.Class<?>)
  (r4v10 java.lang.Class<?>)
 binds: [B:26:0x0062, B:18:0x0050, B:21:0x0055, B:37:0x0063, B:23:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    public final View b(String str, Context context, AttributeSet attributeSet) {
        Class<?> clsLoadClass;
        boolean z;
        if (this.d.a.contains(str)) {
            return null;
        }
        Constructor<?> constructor = this.d.b.get(str);
        if (constructor == null) {
            try {
                if (!str.contains("api.navi")) {
                    String[] strArr = f;
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            clsLoadClass = null;
                            break;
                        }
                        String str2 = strArr[i];
                        try {
                            clsLoadClass = this.f13066c.loadClass(str2 + "." + str);
                            break;
                        } catch (Throwable unused) {
                            i++;
                        }
                    }
                } else {
                    clsLoadClass = this.f13066c.loadClass(str);
                }
                if (clsLoadClass == null || clsLoadClass == ViewStub.class) {
                    z = false;
                } else {
                    try {
                        if (clsLoadClass.getClassLoader() != this.f13066c) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable unused3) {
                clsLoadClass = null;
            }
            if (!z) {
                this.d.a.add(str);
                return null;
            }
            try {
                constructor = clsLoadClass.getConstructor(Context.class, AttributeSet.class);
                this.d.b.put(str, constructor);
            } catch (Throwable unused4) {
            }
        }
        if (constructor == null) {
            return null;
        }
        try {
            return (View) constructor.newInstance(context, attributeSet);
        } catch (Throwable unused5) {
            return null;
        }
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Resources resources = this.a;
        return resources != null ? resources : super.getResources();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        if (this.b == null) {
            LayoutInflater layoutInflater = (LayoutInflater) super.getSystemService(str);
            if (layoutInflater != null) {
                this.b = layoutInflater.cloneInContext(this);
            }
            this.b.setFactory(this.f13067e);
            this.b = this.b.cloneInContext(this);
        }
        return this.b;
    }
}
