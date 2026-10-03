package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpConst;
import io.protostuff.MapSchema;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/zo6;", "", "", "b", "c", "", HttpConst.SERVER_ENV, "", "d", "a", "region", MapSchema.FIELD_NAME_ENTRY, "I", "Ljava/lang/String;", "cdpMode", "<init>", "()V", "Feedback_domesticRelease"}, k = 1, mv = {1, 8, 0})
public final class zo6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static int env;
    public static final zo6 INSTANCE = new zo6();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static int region = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static String cdpMode = "prod";

    @JvmStatic
    public static final int a() {
        return env;
    }

    @JvmStatic
    public static final String b() {
        return ap6.INSTANCE.a(env, region);
    }

    @JvmStatic
    public static final String c() {
        return ap6.INSTANCE.b(env, region);
    }

    @JvmStatic
    public static final void d(int env2) {
        env = env2;
    }

    @JvmStatic
    public static final void e(int region2) {
        region = region2;
    }
}
