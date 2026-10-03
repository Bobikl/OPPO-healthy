package com.heytap.msp.sdk.common.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes19.dex */
public class Reflector {
    private static final String OOPS = "Oops!";
    protected Object mCaller;
    protected Constructor mConstructor;
    protected Field mField;
    protected Method mMethod;
    protected Class<?> mType;

    public static class QuietReflector extends Reflector {
        protected Throwable mIgnored;

        public static QuietReflector on(@Nullable Class<?> cls) {
            return on(cls, cls == null ? new ReflectedException("Type was null!") : null);
        }

        public static QuietReflector with(@Nullable Object obj) {
            return obj == null ? on((Class<?>) null) : on(obj.getClass()).bind(obj);
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public QuietReflector bind(@Nullable Object obj) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.bind(obj);
            } catch (Exception e2) {
                this.mIgnored = e2;
            }
            return this;
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public <R> R call(@Nullable Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.call(objArr);
            } catch (Exception e2) {
                this.mIgnored = e2;
                return null;
            }
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public <R> R callByCaller(@Nullable Object obj, @Nullable Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.callByCaller(obj, objArr);
            } catch (Exception e2) {
                this.mIgnored = e2;
                return null;
            }
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public QuietReflector constructor(@Nullable Class<?>... clsArr) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.constructor(clsArr);
            } catch (Exception e2) {
                this.mIgnored = e2;
            }
            return this;
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public QuietReflector field(@NonNull String str) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.field(str);
            } catch (Exception e2) {
                this.mIgnored = e2;
            }
            return this;
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public <R> R get() {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get();
            } catch (Exception e2) {
                this.mIgnored = e2;
                return null;
            }
        }

        public Throwable getIgnored() {
            return this.mIgnored;
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public QuietReflector method(@NonNull String str, @Nullable Class<?>... clsArr) {
            if (skipAlways()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.method(str, clsArr);
            } catch (Exception e2) {
                this.mIgnored = e2;
            }
            return this;
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public <R> R newInstance(@Nullable Object... objArr) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.newInstance(objArr);
            } catch (Exception e2) {
                this.mIgnored = e2;
                return null;
            }
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public QuietReflector set(@Nullable Object obj) {
            if (skip()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.set(obj);
            } catch (Exception e2) {
                this.mIgnored = e2;
            }
            return this;
        }

        public boolean skip() {
            return skipAlways() || this.mIgnored != null;
        }

        public boolean skipAlways() {
            return this.mType == null;
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public QuietReflector unbind() {
            super.unbind();
            return this;
        }

        private static QuietReflector on(@Nullable Class<?> cls, @Nullable Throwable th) {
            QuietReflector quietReflector = new QuietReflector();
            quietReflector.mType = cls;
            quietReflector.mIgnored = th;
            return quietReflector;
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public /* bridge */ /* synthetic */ Reflector constructor(@Nullable Class[] clsArr) {
            return constructor((Class<?>[]) clsArr);
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public <R> R get(@Nullable Object obj) {
            if (skip()) {
                return null;
            }
            try {
                this.mIgnored = null;
                return (R) super.get(obj);
            } catch (Exception e2) {
                this.mIgnored = e2;
                return null;
            }
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public /* bridge */ /* synthetic */ Reflector method(@NonNull String str, @Nullable Class[] clsArr) {
            return method(str, (Class<?>[]) clsArr);
        }

        @Override // com.heytap.msp.sdk.common.utils.Reflector
        public QuietReflector set(@Nullable Object obj, @Nullable Object obj2) {
            if (skip()) {
                return this;
            }
            try {
                this.mIgnored = null;
                super.set(obj, obj2);
            } catch (Exception e2) {
                this.mIgnored = e2;
            }
            return this;
        }

        public static QuietReflector on(@NonNull String str) {
            return on(str, true, QuietReflector.class.getClassLoader());
        }

        public static QuietReflector on(@NonNull String str, boolean z) {
            return on(str, z, QuietReflector.class.getClassLoader());
        }

        public static QuietReflector on(@NonNull String str, boolean z, @Nullable ClassLoader classLoader) {
            Class<?> cls = null;
            try {
                Class<?> cls2 = Class.forName(str, z, classLoader);
                try {
                    return on(cls2, (Throwable) null);
                } catch (Exception e2) {
                    e = e2;
                    cls = cls2;
                    return on(cls, e);
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    public static class ReflectedException extends Exception {
        public ReflectedException(String str) {
            super(str);
        }

        public ReflectedException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static Reflector on(@NonNull Class<?> cls) {
        Reflector reflector = new Reflector();
        reflector.mType = cls;
        return reflector;
    }

    public static Reflector with(@NonNull Object obj) {
        return on(obj.getClass()).bind(obj);
    }

    public Reflector bind(@Nullable Object obj) {
        this.mCaller = checked(obj);
        return this;
    }

    public <R> R call(@Nullable Object... objArr) {
        return (R) callByCaller(this.mCaller, objArr);
    }

    public <R> R callByCaller(@Nullable Object obj, @Nullable Object... objArr) throws ReflectedException {
        check(obj, this.mMethod, "Method");
        try {
            return (R) this.mMethod.invoke(obj, objArr);
        } catch (InvocationTargetException e2) {
            throw new ReflectedException(OOPS, e2.getTargetException());
        } catch (Exception e3) {
            throw new ReflectedException(OOPS, e3);
        }
    }

    public void check(@Nullable Object obj, @Nullable Member member, @NonNull String str) throws ReflectedException {
        if (member == null) {
            throw new ReflectedException(str + " was null!");
        }
        if (obj == null && !Modifier.isStatic(member.getModifiers())) {
            throw new ReflectedException("Need a caller!");
        }
        checked(obj);
    }

    public Object checked(@Nullable Object obj) throws ReflectedException {
        if (obj == null || this.mType.isInstance(obj)) {
            return obj;
        }
        throw new ReflectedException("Caller [" + obj + "] is not a instance of type [" + this.mType + "]!");
    }

    public Reflector constructor(@Nullable Class<?>... clsArr) throws ReflectedException {
        try {
            Constructor<?> declaredConstructor = this.mType.getDeclaredConstructor(clsArr);
            this.mConstructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            this.mField = null;
            this.mMethod = null;
            return this;
        } catch (Exception e2) {
            throw new ReflectedException(OOPS, e2);
        }
    }

    public Reflector field(@NonNull String str) throws ReflectedException {
        try {
            Field fieldFindField = findField(str);
            this.mField = fieldFindField;
            fieldFindField.setAccessible(true);
            this.mConstructor = null;
            this.mMethod = null;
            return this;
        } catch (Exception e2) {
            throw new ReflectedException(OOPS, e2);
        }
    }

    public Field findField(@NonNull String str) throws NoSuchFieldException {
        try {
            return this.mType.getField(str);
        } catch (NoSuchFieldException e2) {
            for (Class<?> superclass = this.mType; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    return superclass.getDeclaredField(str);
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e2;
        }
    }

    public Method findMethod(@NonNull String str, @Nullable Class<?>... clsArr) throws NoSuchMethodException {
        try {
            return this.mType.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            for (Class<?> superclass = this.mType; superclass != null; superclass = superclass.getSuperclass()) {
                try {
                    return superclass.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused) {
                }
            }
            throw e2;
        }
    }

    public <R> R get() {
        return (R) get(this.mCaller);
    }

    public Reflector method(@NonNull String str, @Nullable Class<?>... clsArr) throws ReflectedException {
        try {
            Method methodFindMethod = findMethod(str, clsArr);
            this.mMethod = methodFindMethod;
            methodFindMethod.setAccessible(true);
            this.mConstructor = null;
            this.mField = null;
            return this;
        } catch (NoSuchMethodException e2) {
            throw new ReflectedException(OOPS, e2);
        }
    }

    public <R> R newInstance(@Nullable Object... objArr) throws ReflectedException {
        Constructor constructor = this.mConstructor;
        if (constructor == null) {
            throw new ReflectedException("Constructor was null!");
        }
        try {
            return (R) constructor.newInstance(objArr);
        } catch (InvocationTargetException e2) {
            throw new ReflectedException(OOPS, e2.getTargetException());
        } catch (Exception e3) {
            throw new ReflectedException(OOPS, e3);
        }
    }

    public Reflector set(@Nullable Object obj) {
        return set(this.mCaller, obj);
    }

    public Reflector unbind() {
        this.mCaller = null;
        return this;
    }

    public static Reflector on(@NonNull String str) {
        return on(str, true, Reflector.class.getClassLoader());
    }

    public <R> R get(@Nullable Object obj) throws ReflectedException {
        check(obj, this.mField, "Field");
        try {
            return (R) this.mField.get(obj);
        } catch (Exception e2) {
            throw new ReflectedException(OOPS, e2);
        }
    }

    public Reflector set(@Nullable Object obj, @Nullable Object obj2) throws ReflectedException {
        check(obj, this.mField, "Field");
        try {
            this.mField.set(obj, obj2);
            return this;
        } catch (Exception e2) {
            throw new ReflectedException(OOPS, e2);
        }
    }

    public static Reflector on(@NonNull String str, boolean z) {
        return on(str, z, Reflector.class.getClassLoader());
    }

    public static Reflector on(@NonNull String str, boolean z, @Nullable ClassLoader classLoader) throws ReflectedException {
        try {
            return on(Class.forName(str, z, classLoader));
        } catch (Exception e2) {
            throw new ReflectedException(OOPS, e2);
        }
    }
}
