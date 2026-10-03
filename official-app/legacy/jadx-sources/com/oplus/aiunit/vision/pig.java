package com.oplus.aiunit.vision;

import autodispose2.OutsideScopeException;

/* JADX INFO: loaded from: classes12.dex */
public final class pig {
    public static pr3 b(final nig nigVar) {
        return pr3.e(new f4j() { // from class: com.oplus.aiunit.vision.oig
            @Override // com.oplus.aiunit.vision.f4j
            public final Object get() {
                return pig.c(nigVar);
            }
        });
    }

    public static /* synthetic */ ds3 c(nig nigVar) throws Throwable {
        try {
            return nigVar.c();
        } catch (OutsideScopeException e2) {
            o14<? super OutsideScopeException> o14VarA = bo0.a();
            if (o14VarA == null) {
                return pr3.f(e2);
            }
            o14VarA.accept(e2);
            return pr3.b();
        }
    }
}
