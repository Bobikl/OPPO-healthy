package com.heytap.health.sleep.day.card;

import android.content.Context;
import com.heytap.health.base.resposiveui.config.NearUIConfig;
import com.heytap.health.base.view.ViewPagerTabLayout;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.pqh;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "status", "Lcom/heytap/health/base/resposiveui/config/NearUIConfig$Status;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SleepTabLayoutCard$initView$2 extends Lambda implements Function1<NearUIConfig.Status, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ pqh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepTabLayoutCard$initView$2(pqh pqhVar, Context context) {
        super(1);
        this.$context = context;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NearUIConfig.Status status) {
        invoke2(status);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull NearUIConfig.Status status) {
        Intrinsics.checkNotNullParameter(status, "status");
        float f = status == NearUIConfig.Status.FOLD ? 152.0f : 223.0f;
        ViewPagerTabLayout viewPagerTabLayoutG = pqh.G(null);
        Intrinsics.checkNotNull(viewPagerTabLayoutG);
        viewPagerTabLayoutG.setSliderWidth(ejg.a(this.$context, f));
    }
}
