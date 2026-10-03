package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.reflect.ReflectionException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes13.dex */
public final class c14 {
    public final Constructor a;

    public c14(Constructor constructor) {
        this.a = constructor;
    }

    public Class a() {
        return this.a.getDeclaringClass();
    }

    public Object b(Object... objArr) throws ReflectionException {
        try {
            return this.a.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            throw new ReflectionException("Could not instantiate instance of class: " + a().getName(), e2);
        } catch (IllegalArgumentException e3) {
            throw new ReflectionException("Illegal argument(s) supplied to constructor for class: " + a().getName(), e3);
        } catch (InstantiationException e4) {
            throw new ReflectionException("Could not instantiate instance of class: " + a().getName(), e4);
        } catch (InvocationTargetException e5) {
            throw new ReflectionException("Exception occurred in constructor for class: " + a().getName(), e5);
        }
    }

    public void c(boolean z) {
        this.a.setAccessible(z);
    }
}
