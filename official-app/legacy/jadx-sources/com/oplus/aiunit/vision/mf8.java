package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.recommend.IRecommendAidl;
import com.heytap.sports.recommend.impl.HRecommendImpl;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/mf8;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/sports/recommend/IRecommendAidl;", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/sports/recommend/impl/HRecommendImpl;", "i", "Lcom/heytap/sports/recommend/impl/HRecommendImpl;", "binder", "<init>", "()V", "recommend_release"}, k = 1, mv = {1, 8, 0})
public final class mf8 implements cm9<IRecommendAidl> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public HRecommendImpl binder;

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.binder = new HRecommendImpl();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public IRecommendAidl d() {
        HRecommendImpl hRecommendImpl = this.binder;
        if (hRecommendImpl != null) {
            return hRecommendImpl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binder");
        return null;
    }
}
