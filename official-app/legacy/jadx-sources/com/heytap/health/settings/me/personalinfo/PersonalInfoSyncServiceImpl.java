package com.heytap.health.settings.me.personalinfo;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.operations.settings.IPersonalInfoSyncService;
import com.oplus.aiunit.vision.oea;
import com.oplus.aiunit.vision.zge;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Route(path = "/settings/IPersonalInfoSyncService")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/heytap/health/settings/me/personalinfo/PersonalInfoSyncServiceImpl;", "Lcom/heytap/health/operations/settings/IPersonalInfoSyncService;", "", oea.CALLBACK, "Landroid/content/Context;", "context", "init", "<init>", "()V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class PersonalInfoSyncServiceImpl implements IPersonalInfoSyncService {
    public static final int $stable = 0;

    @Override // com.heytap.health.operations.settings.IPersonalInfoSyncService
    public void cb() {
        zge.q();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
