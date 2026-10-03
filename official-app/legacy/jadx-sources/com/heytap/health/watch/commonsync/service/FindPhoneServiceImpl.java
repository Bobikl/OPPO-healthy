package com.heytap.health.watch.commonsync.service;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.base.findPhone.api.FindPhoneService;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gf7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = "/commonsync/FindPhoneServiceImpl")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/watch/commonsync/service/FindPhoneServiceImpl;", "Lcom/heytap/health/base/findPhone/api/FindPhoneService;", "Landroid/content/Context;", "context", "", "init", "", "messageId", "B7", "i", "Ljava/lang/String;", "TAG", "Lcom/oplus/aiunit/vision/gf7;", "j", "Lkotlin/Lazy;", "c", "()Lcom/oplus/aiunit/vision/gf7;", "findPhoneHandler", "<init>", "()V", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class FindPhoneServiceImpl implements FindPhoneService {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "FindPhoneServiceImpl";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy findPhoneHandler = LazyKt__LazyJVMKt.lazy(new Function0<gf7>() { // from class: com.heytap.health.watch.commonsync.service.FindPhoneServiceImpl$findPhoneHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final gf7 invoke() {
            return new gf7();
        }
    });

    @Override // com.heytap.health.base.findPhone.api.FindPhoneService
    public void B7(@Nullable String messageId) {
        a7b.f(this.TAG, "playRingFromPush messageId = " + messageId);
        c().b(messageId);
    }

    public final gf7 c() {
        return (gf7) this.findPhoneHandler.getValue();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
