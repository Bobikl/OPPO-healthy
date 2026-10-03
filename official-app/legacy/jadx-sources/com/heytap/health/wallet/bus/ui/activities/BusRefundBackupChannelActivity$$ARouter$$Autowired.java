package com.heytap.health.wallet.bus.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.oplus.aiunit.vision.x0;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/heytap/health/wallet/bus/ui/activities/BusRefundBackupChannelActivity$$ARouter$$Autowired", "Lcom/alibaba/android/arouter/facade/template/ISyringe;", "()V", "serializationService", "Lcom/alibaba/android/arouter/facade/service/SerializationService;", Consts.METHOD_INJECT, "", "target", "", "bus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BusRefundBackupChannelActivity$$ARouter$$Autowired implements ISyringe {

    @Nullable
    private SerializationService serializationService;

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(@Nullable Object target) {
        Bundle extras;
        Bundle extras2;
        String string;
        Bundle extras3;
        String string2;
        this.serializationService = (SerializationService) x0.d().h(SerializationService.class);
        BusRefundBackupChannelActivity busRefundBackupChannelActivity = target instanceof BusRefundBackupChannelActivity ? (BusRefundBackupChannelActivity) target : null;
        if (busRefundBackupChannelActivity == null) {
            throw new IllegalStateException("The target that needs to be injected must be BusRefundBackupChannelActivity, please check your code!");
        }
        Intent intent = busRefundBackupChannelActivity.getIntent();
        if (intent != null && (extras3 = intent.getExtras()) != null && extras3.containsKey("channel") && (string2 = extras3.getString("channel")) != null) {
            busRefundBackupChannelActivity.w = string2;
        }
        Intent intent2 = busRefundBackupChannelActivity.getIntent();
        if (intent2 != null && (extras2 = intent2.getExtras()) != null && extras2.containsKey("webUrl") && (string = extras2.getString("webUrl")) != null) {
            busRefundBackupChannelActivity.x = string;
        }
        Intent intent3 = busRefundBackupChannelActivity.getIntent();
        if (intent3 == null || (extras = intent3.getExtras()) == null) {
            return;
        }
        busRefundBackupChannelActivity.y = extras.getBoolean("booleanKey", busRefundBackupChannelActivity.y);
    }
}
