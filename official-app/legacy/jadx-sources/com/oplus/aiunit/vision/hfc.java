package com.oplus.aiunit.vision;

import com.google.android.gms.actions.SearchIntents;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0006J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/hfc;", "", "", SearchIntents.EXTRA_QUERY, "data", "", "a", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public interface hfc {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String NATIVE_API_SCHEME = "native://";

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.hfc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/hfc$a;", "", "", "NATIVE_API_SCHEME", "Ljava/lang/String;", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @NotNull
        public static final String NATIVE_API_SCHEME = "native://";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void a(@Nullable String query, @Nullable String data);
}
