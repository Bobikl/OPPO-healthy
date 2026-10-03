package com.heytap.health.insight.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cm9;
import insight.IInsightQueryService;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/insight/service/InsightQueryApiProvider;", "Lcom/oplus/aiunit/vision/cm9;", "Linsight/IInsightQueryService;", "f", "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/health/insight/service/InsightQueryService;", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/insight/service/InsightQueryService;", "queryServiceImpl", "<init>", "()V", "Companion", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class InsightQueryApiProvider implements cm9<IInsightQueryService> {

    @NotNull
    public static final String QUERY_PROVIDER_NAME = "insight_query_provider";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy queryServiceImpl = LazyKt__LazyJVMKt.lazy(new Function0<InsightQueryService>() { // from class: com.heytap.health.insight.service.InsightQueryApiProvider$queryServiceImpl$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final InsightQueryService invoke() {
            return new InsightQueryService();
        }
    });
    public static final int $stable = 8;

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("InsightQueryApiProvider", "onDestroy");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("InsightQueryApiProvider", "onCreate");
    }

    public final InsightQueryService e() {
        return (InsightQueryService) this.queryServiceImpl.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IInsightQueryService d() {
        return e();
    }
}
