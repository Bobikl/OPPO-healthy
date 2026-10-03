package com.heytap.health.watch.contactsync;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.interconnection.contactsync.internal.IInternal;
import com.oplus.aiunit.vision.e9g;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.z44;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = IInternal.ROUTER_PATH)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/watch/contactsync/InternalImpl;", "Lcom/heytap/health/interconnection/contactsync/internal/IInternal;", "Landroid/content/Context;", "context", "", "init", "V2", "", "m9", CardAction.LIFE_CIRCLE_VALUE_SHOW, "M9", "P3", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class InternalImpl implements IInternal {
    @Override // com.heytap.health.interconnection.contactsync.internal.IInternal
    public void M9(boolean show) {
        e9g.q(show);
    }

    @Override // com.heytap.health.interconnection.contactsync.internal.IInternal
    public void P3(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        x0.d().b("/operation/report/OperationWebViewActivity").withString("jumpUrl", z44.H5_PATH_PRIVACY_SETTING).navigation();
        e9g.q(false);
    }

    @Override // com.heytap.health.interconnection.contactsync.internal.IInternal
    public void V2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ContactSyncOnceApi.INSTANCE.g(10, "", 2);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.health.interconnection.contactsync.internal.IInternal
    public boolean m9() {
        return e9g.g();
    }
}
