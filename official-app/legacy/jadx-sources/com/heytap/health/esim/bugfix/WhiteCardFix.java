package com.heytap.health.esim.bugfix;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.esim.mgr.EsimSubManager;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.iq9;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.vp6;
import com.oplus.aiunit.vision.xp6;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.Observer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/esim/bugfix/WhiteCardFix;", "", "Lcom/oplus/aiunit/vision/iq9;", "a", "Lcom/oplus/aiunit/vision/iq9;", "eSIMFix", "Ljava/util/Observer;", "b", "Lkotlin/Lazy;", "d", "()Ljava/util/Observer;", "observer", "<init>", "()V", "Companion", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WhiteCardFix {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public iq9 eSIMFix;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy observer;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/esim/bugfix/WhiteCardFix$a", "Lcom/oplus/aiunit/vision/ul4$a;", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "onPeerConnected", "onPeerDisconnected", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ul4.a {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ul4.a
        public void onPeerConnected(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            vp6 vp6VarA = xp6.a(node.getNodeId());
            boolean zH4 = vp6VarA.H4();
            boolean zN5 = vp6VarA.n5();
            a7b.f("EsimHealth.WhiteCardFix", "onPeerConnected check delete white card " + zH4 + " " + zN5);
            if (zH4) {
                WhiteCardFix.this.eSIMFix = new DirectlyFix();
            } else if (zN5) {
                WhiteCardFix.this.eSIMFix = new GeneralFix();
            }
            iq9 iq9Var = WhiteCardFix.this.eSIMFix;
            if (iq9Var != null) {
                EsimSubManager.INSTANCE.a(WhiteCardFix.this.d());
                iq9Var.a();
            }
        }

        @Override // com.oplus.aiunit.vision.ul4.a
        public void onPeerDisconnected(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            EsimSubManager.INSTANCE.b(WhiteCardFix.this.d());
            WhiteCardFix.this.eSIMFix = null;
        }
    }

    public WhiteCardFix() {
        gl4.devicePrimary.nodeApi.g(new a());
        this.observer = LazyKt__LazyJVMKt.lazy(new WhiteCardFix$observer$2(this));
    }

    public final Observer d() {
        return (Observer) this.observer.getValue();
    }
}
