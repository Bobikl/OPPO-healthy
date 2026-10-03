package com.heytap.health.wallet.web;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.oplus.aiunit.vision.x0;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/heytap/health/wallet/web/FixedToolbarWebActivity$$ARouter$$Autowired", "Lcom/alibaba/android/arouter/facade/template/ISyringe;", "()V", "serializationService", "Lcom/alibaba/android/arouter/facade/service/SerializationService;", Consts.METHOD_INJECT, "", "target", "", "walletmain_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FixedToolbarWebActivity$$ARouter$$Autowired implements ISyringe {
    public static final int $stable = 8;

    @Nullable
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(@Nullable Object target) {
        Bundle extras;
        String string;
        Bundle extras2;
        String string2;
        this.serializationService = (SerializationService) x0.d().h(SerializationService.class);
        FixedToolbarWebActivity fixedToolbarWebActivity = target instanceof FixedToolbarWebActivity ? (FixedToolbarWebActivity) target : null;
        if (fixedToolbarWebActivity == null) {
            throw new IllegalStateException("The target that needs to be injected must be FixedToolbarWebActivity, please check your code!");
        }
        Intent intent = fixedToolbarWebActivity.getIntent();
        if (intent != null && (extras2 = intent.getExtras()) != null && extras2.containsKey("webUrl") && (string2 = extras2.getString("webUrl")) != null) {
            fixedToolbarWebActivity.q = string2;
        }
        Intent intent2 = fixedToolbarWebActivity.getIntent();
        if (intent2 == null || (extras = intent2.getExtras()) == null || !extras.containsKey("webTitle") || (string = extras.getString("webTitle")) == null) {
            return;
        }
        fixedToolbarWebActivity.r = string;
    }
}
