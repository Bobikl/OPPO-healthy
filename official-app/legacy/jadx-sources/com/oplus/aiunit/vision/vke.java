package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes11.dex */
public class vke {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vke f17888c = e();
    public final boolean a;

    @Nullable
    public final Constructor<MethodHandles.Lookup> b;

    public static final class a extends vke {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.vke$a$a, reason: collision with other inner class name */
        public static final class ExecutorC0936a implements Executor {
            public final Handler i = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.i.post(runnable);
            }
        }

        public a() {
            super(true);
        }

        @Override // com.oplus.aiunit.vision.vke
        public Executor b() {
            return new ExecutorC0936a();
        }

        @Override // com.oplus.aiunit.vision.vke
        @Nullable
        public Object g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            return super.g(method, cls, obj, objArr);
        }
    }

    public vke(boolean z) {
        this.a = z;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.b = declaredConstructor;
    }

    public static vke e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new vke(true);
    }

    public static vke f() {
        return f17888c;
    }

    public List<? extends zr2.a> a(@Nullable Executor executor) {
        v35 v35Var = new v35(executor);
        return this.a ? Arrays.asList(yr3.a, v35Var) : Collections.singletonList(v35Var);
    }

    @Nullable
    public Executor b() {
        return null;
    }

    public List<? extends ma4.a> c() {
        return this.a ? Collections.singletonList(crd.a) : Collections.emptyList();
    }

    public int d() {
        return this.a ? 1 : 0;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object g(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @IgnoreJRERequirement
    public boolean h(Method method) {
        return this.a && method.isDefault();
    }
}
