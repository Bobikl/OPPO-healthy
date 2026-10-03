package com.oplus.aiunit.vision;

import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class iu6 {
    public static RuntimeException a(Throwable th) {
        throw ExceptionHelper.d(th);
    }

    public static void b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
