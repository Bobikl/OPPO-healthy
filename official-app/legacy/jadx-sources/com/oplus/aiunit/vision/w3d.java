package com.oplus.aiunit.vision;

import android.app.OplusNotificationManager;
import android.net.Uri;
import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/w3d;", "", "", "mode", "", EngineConstant.REASON, "", "a", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class w3d {

    @NotNull
    public static final w3d INSTANCE = new w3d();

    public final void a(int mode, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        new OplusNotificationManager().setZenMode(mode, (Uri) null, reason);
    }
}
