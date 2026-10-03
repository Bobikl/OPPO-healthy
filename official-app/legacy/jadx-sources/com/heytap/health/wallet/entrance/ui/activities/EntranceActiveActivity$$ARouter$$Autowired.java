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
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/heytap/health/wallet/entrance/ui/activities/EntranceActiveActivity$$ARouter$$Autowired", "Lcom/alibaba/android/arouter/facade/template/ISyringe;", "()V", "serializationService", "Lcom/alibaba/android/arouter/facade/service/SerializationService;", Consts.METHOD_INJECT, "", "target", "", "entrance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EntranceActiveActivity$$ARouter$$Autowired implements ISyringe {

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
        this.serializationService = (SerializationService) x0.d().h(SerializationService.class);
        EntranceActiveActivity entranceActiveActivity = target instanceof EntranceActiveActivity ? (EntranceActiveActivity) target : null;
        if (entranceActiveActivity == null) {
            throw new IllegalStateException("The target that needs to be injected must be EntranceActiveActivity, please check your code!");
        }
        Intent intent = entranceActiveActivity.getIntent();
        if (intent != null && (extras4 = intent.getExtras()) != null && extras4.containsKey("KEY_APP_CODE") && (string4 = extras4.getString("KEY_APP_CODE")) != null) {
            entranceActiveActivity.u = string4;
        }
        Intent intent2 = entranceActiveActivity.getIntent();
        if (intent2 != null && (extras3 = intent2.getExtras()) != null && extras3.containsKey("KEY_CARD_AID") && (string3 = extras3.getString("KEY_CARD_AID")) != null) {
            entranceActiveActivity.v = string3;
        }
        Intent intent3 = entranceActiveActivity.getIntent();
        if (intent3 != null && (extras2 = intent3.getExtras()) != null && extras2.containsKey("KEY_ACTION") && (string2 = extras2.getString("KEY_ACTION")) != null) {
            entranceActiveActivity.w = string2;
        }
        Intent intent4 = entranceActiveActivity.getIntent();
        if (intent4 == null || (extras = intent4.getExtras()) == null || !extras.containsKey("CARD_TYPE") || (string = extras.getString("CARD_TYPE")) == null) {
            return;
        }
        entranceActiveActivity.x = string;
    }
}
