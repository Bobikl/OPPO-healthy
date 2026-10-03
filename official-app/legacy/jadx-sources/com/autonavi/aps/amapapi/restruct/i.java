package com.autonavi.aps.amapapi.restruct;

import android.content.Context;
import android.os.Handler;
import com.cloud.sdk.cloudstorage.common.ErrorInfo;
import com.oplus.aiunit.vision.k6n;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends a<k6n> {
    public i(Context context, String str, Handler handler) {
        super(context, str, handler);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* bridge */ /* synthetic */ void a(k6n k6nVar, long j2) {
        a2(k6nVar, j2);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* synthetic */ String b(k6n k6nVar) {
        return a(k6nVar);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* synthetic */ int c(k6n k6nVar) {
        return b2(k6nVar);
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final /* synthetic */ long d(k6n k6nVar) {
        return c2(k6nVar);
    }

    private static String a(k6n k6nVar) {
        return k6nVar == null ? "" : k6nVar.b();
    }

    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method */
    private static int b2(k6n k6nVar) {
        return k6nVar == null ? ErrorInfo.OC_OPTION_ERROR_DIR : k6nVar.f13176c;
    }

    /* JADX INFO: renamed from: c, reason: avoid collision after fix types in other method */
    private static long c2(k6n k6nVar) {
        if (k6nVar == null) {
            return 0L;
        }
        return k6nVar.f;
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private static void a2(k6n k6nVar, long j2) {
        if (k6nVar != null) {
            k6nVar.f = j2;
        }
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final long b() {
        return com.autonavi.aps.amapapi.config.a.f1106e;
    }

    @Override // com.autonavi.aps.amapapi.restruct.a
    public final long c() {
        return com.autonavi.aps.amapapi.config.a.f;
    }
}
