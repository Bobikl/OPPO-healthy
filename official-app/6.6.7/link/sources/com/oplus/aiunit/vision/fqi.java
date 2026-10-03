package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/fqi;", "", "Companion", "a", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public class fqi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static upi a = new upi();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.fqi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/fqi$a;", "", "", Node.I_KEY, "Lcom/oplus/aiunit/vision/ld7;", "a", "Lcom/oplus/aiunit/vision/upi;", "stats", "Lcom/oplus/aiunit/vision/upi;", "b", "()Lcom/oplus/aiunit/vision/upi;", "setStats", "(Lcom/oplus/aiunit/vision/upi;)V", "<init>", "()V", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ld7 a(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, Node.I_KEY);
            if (b().a().get(key) != null) {
                ld7 ld7Var = b().a().get(key);
                Intrinsics.checkNotNull(ld7Var);
                return ld7Var;
            }
            ld7 ld7Var2 = new ld7();
            b().a().put(key, ld7Var2);
            return ld7Var2;
        }

        @NotNull
        public final upi b() {
            return fqi.a;
        }
    }
}
