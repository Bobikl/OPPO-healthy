package com.oplus.vfxsdk.common;

import com.oplus.wearable.linkservice.sdk.Node;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J.\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/oplus/vfxsdk/common/a;", "", "", "stateKey", "", "isSeekMode", "Lkotlin/Function0;", "", "endCb", "a", "Lcom/oplus/vfxsdk/common/AbsAnimator;", "getAnimator", "()Lcom/oplus/vfxsdk/common/AbsAnimator;", "animator", "coecommon.1.1.0_release"}, k = 1, mv = {1, 9, 0})
public interface a {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Nullable
        public static HashMap<String, PassParams[]> a(@NotNull a aVar) {
            AbsAnimator animator = aVar.getAnimator();
            if (animator != null) {
                return animator.b();
            }
            return null;
        }

        @Nullable
        public static HashMap<String, Animator> b(@NotNull a aVar) {
            AbsAnimator animator = aVar.getAnimator();
            if (animator != null) {
                return animator.d();
            }
            return null;
        }

        public static void c(@NotNull a aVar, @NotNull String str, boolean z, @Nullable Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "stateKey");
            AbsAnimator animator = aVar.getAnimator();
            if (animator != null) {
                animator.a(str, z, function0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void d(a aVar, String str, boolean z, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onTriger");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            aVar.a(str, z, function0);
        }

        public static void e(@NotNull a aVar, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, Node.I_KEY);
            AbsAnimator animator = aVar.getAnimator();
            if (animator != null) {
                animator.l(str);
            }
        }
    }

    void a(@NotNull String stateKey, boolean isSeekMode, @Nullable Function0<Unit> endCb);

    @Nullable
    AbsAnimator getAnimator();
}
