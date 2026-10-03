package com.heytap.health.wallet.entrance.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.oplus.aiunit.vision.x0;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/heytap/health/wallet/entrance/ui/activities/OpenSucActivity$$ARouter$$Autowired", "Lcom/alibaba/android/arouter/facade/template/ISyringe;", "()V", "serializationService", "Lcom/alibaba/android/arouter/facade/service/SerializationService;", Consts.METHOD_INJECT, "", "target", "", "entrance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OpenSucActivity$$ARouter$$Autowired implements ISyringe {

    @Nullable
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(@Nullable Object target) {
        Bundle extras;
        String string;
        Bundle extras2;
        String string2;
        Bundle extras3;
        String string3;
        Bundle extras4;
        String string4;
        Bundle extras5;
        String string5;
        this.serializationService = (SerializationService) x0.d().h(SerializationService.class);
        OpenSucActivity openSucActivity = target instanceof OpenSucActivity ? (OpenSucActivity) target : null;
        if (openSucActivity == null) {
            throw new IllegalStateException("The target that needs to be injected must be OpenSucActivity, please check your code!");
        }
        Intent intent = openSucActivity.getIntent();
        if (intent != null && (extras5 = intent.getExtras()) != null && extras5.containsKey("appCode") && (string5 = extras5.getString("appCode")) != null) {
            openSucActivity.w = string5;
        }
        Intent intent2 = openSucActivity.getIntent();
        if (intent2 != null && (extras4 = intent2.getExtras()) != null && extras4.containsKey("aid") && (string4 = extras4.getString("aid")) != null) {
            openSucActivity.x = string4;
        }
        Intent intent3 = openSucActivity.getIntent();
        if (intent3 != null && (extras3 = intent3.getExtras()) != null && extras3.containsKey("cardImg") && (string3 = extras3.getString("cardImg")) != null) {
            openSucActivity.y = string3;
        }
        Intent intent4 = openSucActivity.getIntent();
        if (intent4 != null && (extras2 = intent4.getExtras()) != null && extras2.containsKey("CARD_NAME") && (string2 = extras2.getString("CARD_NAME")) != null) {
            openSucActivity.z = string2;
        }
        Intent intent5 = openSucActivity.getIntent();
        if (intent5 == null || (extras = intent5.getExtras()) == null || !extras.containsKey("CARD_TYPE") || (string = extras.getString("CARD_TYPE")) == null) {
            return;
        }
        openSucActivity.A = string;
    }
}
