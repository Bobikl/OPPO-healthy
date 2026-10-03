package com.heytap.health.connect.rawapi.util;

import android.os.Bundle;
import com.heytap.health.connect.rawapi.IResult;
import com.oplus.aiunit.vision.nxb;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/aiunit/vision/nxb$c;", "Lcom/heytap/health/connect/rawapi/IResult;", "a", "lib_heytapconnect_release"}, k = 2, mv = {1, 8, 0})
public final class IResultExtKt {
    @Nullable
    public static final IResult a(@Nullable nxb.c cVar) {
        if (cVar == null) {
            return null;
        }
        final AtomicReference atomicReference = new AtomicReference(cVar);
        return new IResult.Stub() { // from class: com.heytap.health.connect.rawapi.util.IResultExtKt$toIResult$1
            @Override // com.heytap.health.connect.rawapi.IResult
            public void onResult(boolean success, @Nullable String reason, @Nullable Bundle inExtra) {
                nxb.c andSet = atomicReference.getAndSet(null);
                if (andSet != null) {
                    andSet.a(success, 0);
                }
            }
        };
    }
}
