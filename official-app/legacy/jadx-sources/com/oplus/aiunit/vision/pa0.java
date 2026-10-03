package com.oplus.aiunit.vision;

import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import io.netty.util.internal.StringUtil;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u001f\u0010\u0011\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/pa0;", "", "", "b", "", "c", "", "a", "TAG", "Ljava/lang/String;", "BACKGROUND_SESSION_ID", "lastSPSessionID", "Lcom/oplus/aiunit/vision/ur9;", "kotlin.jvm.PlatformType", "Lcom/oplus/aiunit/vision/ur9;", "getKv", "()Lcom/oplus/aiunit/vision/ur9;", "kv", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class pa0 {

    @NotNull
    public static final String BACKGROUND_SESSION_ID = "$backgroundSessionId";

    @NotNull
    public static final String TAG = "AppExitReasonHelper";

    @NotNull
    public static final pa0 INSTANCE = new pa0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String lastSPSessionID = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final ur9 kv = svi.a();

    @Nullable
    public final String a() {
        TrackLogger.h("AppExitReasonHelper", "getExitSessionID spRecord " + lastSPSessionID + StringUtil.SPACE, new Object[0]);
        return lastSPSessionID;
    }

    public final boolean b() {
        String string = kv.getString("$backgroundSessionId", "");
        lastSPSessionID = string;
        return !(string == null || string.length() == 0);
    }

    public final void c() {
        ur9 ur9Var = kv;
        tjg tjgVar = tjg.INSTANCE;
        ur9Var.putString("$backgroundSessionId", tjgVar.a());
        StringBuilder sb = new StringBuilder();
        sb.append("recordSessionIDAndTime ");
        String strA = tjgVar.a();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strA.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(new String(bytes, charset));
        TrackLogger.h("AppExitReasonHelper", sb.toString(), new Object[0]);
    }
}
