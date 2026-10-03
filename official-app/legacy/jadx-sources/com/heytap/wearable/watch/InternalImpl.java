package com.heytap.wearable.watch;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.interconnection.internal.IInternal;
import com.heytap.wearable.watch.finddevice.third.ThirdFindDeviceManager;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = IInternal.ROUTER_PATH)
public class InternalImpl implements IInternal {
    @Override // com.heytap.health.interconnection.internal.IInternal
    public void c8(@NonNull AppCompatActivity appCompatActivity, @NonNull Bundle bundle) {
        ThirdFindDeviceManager.r().B(appCompatActivity, bundle);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }
}
