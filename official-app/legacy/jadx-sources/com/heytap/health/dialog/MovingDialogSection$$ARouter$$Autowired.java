package com.heytap.health.dialog;

import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.heytap.health.home.HomeMovingService;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.oplus.aiunit.vision.x0;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/heytap/health/dialog/MovingDialogSection$$ARouter$$Autowired", "Lcom/alibaba/android/arouter/facade/template/ISyringe;", "()V", "serializationService", "Lcom/alibaba/android/arouter/facade/service/SerializationService;", Consts.METHOD_INJECT, "", "target", "", "Health-6.4.4_03460bd_260624_OPlusRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MovingDialogSection$$ARouter$$Autowired implements ISyringe {

    @Nullable
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(@Nullable Object target) {
        this.serializationService = (SerializationService) x0.d().h(SerializationService.class);
        MovingDialogSection movingDialogSection = target instanceof MovingDialogSection ? (MovingDialogSection) target : null;
        if (movingDialogSection == null) {
            throw new IllegalStateException("The target that needs to be injected must be MovingDialogSection, please check your code!");
        }
        Object objH = x0.d().h(HomeMovingService.class);
        Intrinsics.checkNotNull(objH, "null cannot be cast to non-null type com.heytap.health.home.HomeMovingService");
        movingDialogSection.r = (HomeMovingService) objH;
    }
}
