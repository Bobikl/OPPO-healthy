package com.health.health_seedlingcard.utlis;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ilj;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Route(path = "/seeding/seeding_init")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/health/health_seedlingcard/utlis/SeedingCardInitImpl;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "()V", "init", "", "context", "Landroid/content/Context;", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SeedingCardInitImpl implements IProvider {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
        if (ilj.x()) {
            a7b.f("SeedingCardInitImpl", "init");
            SeedlingTool seedlingTool = SeedlingTool.INSTANCE;
            Context contextA = b78.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            seedlingTool.startInit(contextA, "com.heytap.health.SeedlingCardWidgetProvider");
        }
    }
}
