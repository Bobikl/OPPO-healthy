package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.storage.sp.SharePreferenceHelper;
import com.oplus.nearx.track.internal.utils.Logger;
import io.netty.util.internal.StringUtil;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/oa0;", "", "", "b", "", "c", "", "a", "TAG", "Ljava/lang/String;", "BACKGROUND_SESSION_ID", "lastSPSessionID", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class oa0 {

    @NotNull
    public static final String BACKGROUND_SESSION_ID = "$backgroundSessionId";

    @NotNull
    public static final String TAG = "AppExitReasonHelper";

    @NotNull
    public static final oa0 INSTANCE = new oa0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static String lastSPSessionID = "";

    @Nullable
    public final String a() {
        Logger.j(k6k.e(), "AppExitReasonHelper", "getExitSessionID spRecord " + lastSPSessionID + StringUtil.SPACE, null, null, 12, null);
        return lastSPSessionID;
    }

    public final boolean b() {
        String string = SharePreferenceHelper.h().getString("$backgroundSessionId", "");
        lastSPSessionID = string;
        return !(string == null || string.length() == 0);
    }

    public final void c() {
        tx9 tx9VarH = SharePreferenceHelper.h();
        wvg wvgVar = wvg.INSTANCE;
        tx9VarH.d("$backgroundSessionId", wvgVar.a());
        Logger loggerE = k6k.e();
        StringBuilder sb = new StringBuilder();
        sb.append("recordSessionIDAndTime ");
        String strA = wvgVar.a();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strA.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        sb.append(new String(bytes, charset));
        Logger.j(loggerE, "AppExitReasonHelper", sb.toString(), null, null, 12, null);
    }
}
