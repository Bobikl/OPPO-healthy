package com.heytap.store.sdk.user;

import android.app.Application;
import android.content.Context;
import com.heytap.store.base.core.sdk.IOStoreSdkInitService;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.sdk.OStore;
import com.heytap.store.sdk.SDKConfig;
import com.heytap.store.sdk.user.OStoreSdkInitServiceImpl;
import com.oplus.aiunit.vision.cdd;
import com.oplus.aiunit.vision.dcd;
import com.oplus.aiunit.vision.e30;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.p14;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Route(path = "/ostoresdk/service")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J.\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¨\u0006\r"}, d2 = {"Lcom/heytap/store/sdk/user/OStoreSdkInitServiceImpl;", "Lcom/heytap/store/base/core/sdk/IOStoreSdkInitService;", "()V", "init", "", "context", "Landroid/content/Context;", "selfRecovery", "appId", "", "channel", "initFinishCallBacl", "Lkotlin/Function0;", "heytapstoresdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OStoreSdkInitServiceImpl implements IOStoreSdkInitService {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: selfRecovery$lambda-1, reason: not valid java name */
    public static final void m5101selfRecovery$lambda1(dcd it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.onNext("init");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: selfRecovery$lambda-2, reason: not valid java name */
    public static final void m5102selfRecovery$lambda2(Function0 initFinishCallBacl, String str) {
        Intrinsics.checkNotNullParameter(initFinishCallBacl, "$initFinishCallBacl");
        initFinishCallBacl.invoke();
    }

    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }

    @Override // com.heytap.store.base.core.sdk.IOStoreSdkInitService
    public void selfRecovery(@NotNull Context context, @NotNull String appId, @NotNull String channel, @NotNull final Function0<Unit> initFinishCallBacl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(initFinishCallBacl, "initFinishCallBacl");
        if (appId.length() > 0) {
            if (channel.length() > 0) {
                OStore instance = OStore.INSTANCE.getINSTANCE();
                SDKConfig.Builder builder = new SDKConfig.Builder();
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                builder.setContext((Application) applicationContext);
                builder.setsAppId(appId);
                builder.setCtaCheckPass(true);
                builder.setImei("");
                builder.setsAppChannel(channel);
                SDKConfig sDKConfigBuilder = builder.builder();
                Intrinsics.checkNotNullExpressionValue(sDKConfigBuilder, "Builder().apply {\n      …)\n            }.builder()");
                instance.initSdk(sDKConfigBuilder);
                kbd.c(new cdd() { // from class: com.oplus.aiunit.vision.f5d
                    @Override // com.oplus.aiunit.vision.cdd
                    public final void subscribe(dcd dcdVar) {
                        OStoreSdkInitServiceImpl.m5101selfRecovery$lambda1(dcdVar);
                    }
                }).d(1000L, TimeUnit.MILLISECONDS).r(e30.a()).x(new p14() { // from class: com.oplus.aiunit.vision.g5d
                    @Override // com.oplus.aiunit.vision.p14
                    public final void accept(Object obj) {
                        OStoreSdkInitServiceImpl.m5102selfRecovery$lambda2(initFinishCallBacl, (String) obj);
                    }
                });
            }
        }
    }
}
