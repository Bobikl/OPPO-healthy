package com.heytap.health.wallet.iccoa;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.heytap.health.base.base.BaseService;
import com.heytap.health.wallet.iccoa.ICCOADigitalKeyService.ICCOADigitalKeyFrameworkClient;
import com.oplus.aiunit.vision.um9;
import org.iccoa.android.digitalkey.IDigitalKeyCallback;
import org.iccoa.android.digitalkey.IDigitalKeyFrameworkClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001f\u0010\u000b\u001a\u00060\u0006R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/wallet/iccoa/ICCOADigitalKeyService;", "Lcom/heytap/health/base/base/BaseService;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "Lcom/heytap/health/wallet/iccoa/ICCOADigitalKeyService$ICCOADigitalKeyFrameworkClient;", "i", "Lkotlin/Lazy;", "b", "()Lcom/heytap/health/wallet/iccoa/ICCOADigitalKeyService$ICCOADigitalKeyFrameworkClient;", "digitalKeyFrameworkClient", "<init>", "()V", "ICCOADigitalKeyFrameworkClient", "entrance_release"}, k = 1, mv = {1, 8, 0})
public final class ICCOADigitalKeyService extends BaseService {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy digitalKeyFrameworkClient = LazyKt__LazyJVMKt.lazy(new Function0<ICCOADigitalKeyFrameworkClient>() { // from class: com.heytap.health.wallet.iccoa.ICCOADigitalKeyService$digitalKeyFrameworkClient$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ICCOADigitalKeyService.ICCOADigitalKeyFrameworkClient invoke() {
            return this.this$0.new ICCOADigitalKeyFrameworkClient();
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/wallet/iccoa/ICCOADigitalKeyService$ICCOADigitalKeyFrameworkClient;", "Lorg/iccoa/android/digitalkey/IDigitalKeyFrameworkClient$Stub;", "(Lcom/heytap/health/wallet/iccoa/ICCOADigitalKeyService;)V", "request", "", "method", "", "params", "Landroid/os/Bundle;", "callback", "Lorg/iccoa/android/digitalkey/IDigitalKeyCallback;", "entrance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ICCOADigitalKeyFrameworkClient extends IDigitalKeyFrameworkClient.Stub {
        public ICCOADigitalKeyFrameworkClient() {
        }

        @Override // org.iccoa.android.digitalkey.IDigitalKeyFrameworkClient
        public void request(@NotNull String method, @NotNull Bundle params, @NotNull IDigitalKeyCallback callback) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(callback, "callback");
            um9.INSTANCE.b(method, params, callback);
        }
    }

    public final ICCOADigitalKeyFrameworkClient b() {
        return (ICCOADigitalKeyFrameworkClient) this.digitalKeyFrameworkClient.getValue();
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return b();
    }
}
