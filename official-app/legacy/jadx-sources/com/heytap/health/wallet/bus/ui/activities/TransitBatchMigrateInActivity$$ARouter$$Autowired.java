package com.heytap.health.wallet.bus.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.alibaba.android.arouter.facade.model.TypeWrapper;
import com.alibaba.android.arouter.facade.service.SerializationService;
import com.alibaba.android.arouter.facade.template.ILogger;
import com.alibaba.android.arouter.facade.template.ISyringe;
import com.heytap.health.wallet.network.door.rsp.UserAllDeviceCardDto;
import com.heytap.store.platform.htrouter.compiler.utils.Consts;
import com.oplus.aiunit.vision.x0;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"com/heytap/health/wallet/bus/ui/activities/TransitBatchMigrateInActivity$$ARouter$$Autowired", "Lcom/alibaba/android/arouter/facade/template/ISyringe;", "()V", "serializationService", "Lcom/alibaba/android/arouter/facade/service/SerializationService;", Consts.METHOD_INJECT, "", "target", "", "bus_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TransitBatchMigrateInActivity$$ARouter$$Autowired implements ISyringe {

    @Nullable
    private SerializationService serializationService;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"com/heytap/health/wallet/bus/ui/activities/TransitBatchMigrateInActivity$$ARouter$$Autowired$a", "Lcom/alibaba/android/arouter/facade/model/TypeWrapper;", "", "Lcom/heytap/health/wallet/network/door/rsp/UserAllDeviceCardDto;", "bus_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends TypeWrapper<List<UserAllDeviceCardDto>> {
    }

    @Override // com.alibaba.android.arouter.facade.template.ISyringe
    public void inject(@Nullable Object target) {
        Bundle extras;
        Bundle extras2;
        String string;
        List<UserAllDeviceCardDto> list;
        Bundle extras3;
        Bundle extras4;
        String string2;
        this.serializationService = (SerializationService) x0.d().h(SerializationService.class);
        String string3 = null;
        TransitBatchMigrateInActivity transitBatchMigrateInActivity = target instanceof TransitBatchMigrateInActivity ? (TransitBatchMigrateInActivity) target : null;
        if (transitBatchMigrateInActivity == null) {
            throw new IllegalStateException("The target that needs to be injected must be TransitBatchMigrateInActivity, please check your code!");
        }
        Intent intent = transitBatchMigrateInActivity.getIntent();
        if (intent != null && (extras4 = intent.getExtras()) != null && extras4.containsKey("select_phone") && (string2 = extras4.getString("select_phone")) != null) {
            transitBatchMigrateInActivity.z = string2;
        }
        if (this.serializationService != null) {
            Intent intent2 = transitBatchMigrateInActivity.getIntent();
            if (intent2 != null && (extras3 = intent2.getExtras()) != null) {
                string3 = extras3.getString("select_card_list");
            }
            if (!(string3 == null || string3.length() == 0)) {
                a aVar = new a();
                SerializationService serializationService = this.serializationService;
                if (serializationService != null && (list = (List) serializationService.parseObject(string3, aVar.getType())) != null) {
                    transitBatchMigrateInActivity.A = list;
                }
            }
        } else {
            Log.e(ILogger.defaultTag, "You want automatic inject the field 'mSelectedCardList' in class 'TransitBatchMigrateInActivity', then you should implement 'SerializationService' to support object auto inject!");
        }
        Intent intent3 = transitBatchMigrateInActivity.getIntent();
        if (intent3 != null && (extras2 = intent3.getExtras()) != null && extras2.containsKey("voucherExtra") && (string = extras2.getString("voucherExtra")) != null) {
            transitBatchMigrateInActivity.B = string;
        }
        Intent intent4 = transitBatchMigrateInActivity.getIntent();
        if (intent4 == null || (extras = intent4.getExtras()) == null) {
            return;
        }
        Byte b = transitBatchMigrateInActivity.C;
        Intrinsics.checkNotNullExpressionValue(b, "substitute.mCardType");
        transitBatchMigrateInActivity.C = extras.getByte("cardType", b.byteValue());
    }
}
