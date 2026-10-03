package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ay9;", "", "", "cardName", "", "code", "", "onCall", "Companion", "a", "card-smart-engine_release"}, k = 1, mv = {1, 8, 0})
public interface ay9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int RENDER_CODE_NO = 0;
    public static final int RENDER_CODE_URI_SECURITY = 1;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ay9$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/ay9$a;", "", "", "RENDER_CODE_NO", "I", "RENDER_CODE_URI_SECURITY", "<init>", "()V", "card-smart-engine_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final int RENDER_CODE_NO = 0;
        public static final int RENDER_CODE_URI_SECURITY = 1;
        public static final /* synthetic */ Companion a = new Companion();
    }

    void onCall(@NotNull String cardName, int code);
}
