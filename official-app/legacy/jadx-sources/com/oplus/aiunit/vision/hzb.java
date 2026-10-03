package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/hzb;", "", "", SpeechConstant.KEY_RECORD_ID, "a", "", "b", "c", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class hzb {

    @NotNull
    public static final hzb INSTANCE = new hzb();

    @NotNull
    public final String a(@NotNull String recordId) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        return Intrinsics.stringPlus("re-", recordId);
    }

    public final boolean b(@NotNull String recordId) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        return !TextUtils.isEmpty(recordId) && StringsKt__StringsJVMKt.startsWith$default(recordId, "re-", false, 2, null);
    }

    public final boolean c(@NotNull String recordId) {
        Intrinsics.checkNotNullParameter(recordId, "recordId");
        return !TextUtils.isEmpty(recordId) && StringsKt__StringsJVMKt.startsWith$default(recordId, "re-re-re-re-re-", false, 2, null);
    }
}
