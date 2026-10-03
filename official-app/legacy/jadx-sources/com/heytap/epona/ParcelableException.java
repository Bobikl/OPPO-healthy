package com.heytap.epona;

import com.oplus.aiunit.vision.s7b;

/* JADX INFO: loaded from: classes15.dex */
final class ParcelableException extends RuntimeException {
    private static final String TAG = "ParcelableException";

    private ParcelableException(Throwable th) {
        super(th);
    }

    public static ParcelableException create(ExceptionInfo exceptionInfo) {
        String name = exceptionInfo.getName();
        String message = exceptionInfo.getMessage();
        try {
            Class<?> cls = Class.forName(name);
            if (Throwable.class.isAssignableFrom(cls)) {
                return new ParcelableException((Throwable) cls.getConstructor(String.class).newInstance(message));
            }
        } catch (ReflectiveOperationException e2) {
            s7b.c(TAG, e2.toString(), new Object[0]);
        }
        return new ParcelableException(new RuntimeException(name + ": " + message));
    }

    public <T extends Throwable> void maybeRethrow(Class<T> cls) throws Throwable {
        if (cls.isAssignableFrom(getCause().getClass())) {
            throw getCause();
        }
    }
}
