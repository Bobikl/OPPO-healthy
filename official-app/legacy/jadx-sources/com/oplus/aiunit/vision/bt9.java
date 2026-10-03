package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/bt9;", "", "", "isNetworkAvailable", "Companion", "a", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public interface bt9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.b;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.bt9$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/bt9$a;", "", "Lcom/oplus/aiunit/vision/bt9;", "a", "Lcom/oplus/aiunit/vision/bt9;", "()Lcom/oplus/aiunit/vision/bt9;", "DEFAULT", "<init>", "()V", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion b = new Companion();

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public static final bt9 DEFAULT = new C0867a();

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.bt9$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/oplus/aiunit/vision/bt9$a$a", "Lcom/oplus/aiunit/vision/bt9;", "", "isNetworkAvailable", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
        public static final class C0867a implements bt9 {
            @Override // com.oplus.aiunit.vision.bt9
            public boolean isNetworkAvailable() {
                return true;
            }
        }

        @NotNull
        public final bt9 a() {
            return DEFAULT;
        }
    }

    boolean isNetworkAvailable();
}
