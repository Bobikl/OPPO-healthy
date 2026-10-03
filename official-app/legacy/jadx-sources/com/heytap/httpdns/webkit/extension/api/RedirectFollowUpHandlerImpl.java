package com.heytap.httpdns.webkit.extension.api;

import com.heytap.nearx.taphttp.core.HeyCenter;
import com.oplus.aiunit.vision.ckf;
import com.oplus.aiunit.vision.r7b;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/heytap/httpdns/webkit/extension/api/RedirectFollowUpHandlerImpl;", "Lcom/oplus/aiunit/vision/ckf;", "Lcom/oplus/aiunit/vision/r7b;", "a", "Lkotlin/Lazy;", "getLogger", "()Lcom/oplus/aiunit/vision/r7b;", "logger", "Lcom/heytap/nearx/taphttp/core/HeyCenter;", "b", "Lcom/heytap/nearx/taphttp/core/HeyCenter;", "heyCenter", "<init>", "(Lcom/heytap/nearx/taphttp/core/HeyCenter;)V", "Companion", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class RedirectFollowUpHandlerImpl implements ckf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Lazy logger;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final HeyCenter heyCenter;

    public RedirectFollowUpHandlerImpl(@NotNull HeyCenter heyCenter) {
        Intrinsics.checkNotNullParameter(heyCenter, "heyCenter");
        this.heyCenter = heyCenter;
        this.logger = LazyKt__LazyJVMKt.lazy(new Function0<r7b>() { // from class: com.heytap.httpdns.webkit.extension.api.RedirectFollowUpHandlerImpl$logger$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final r7b invoke() {
                return this.this$0.heyCenter.getLogger();
            }
        });
    }
}
