package com.heytap.wearable.watch.emergency;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.wearable.emergency.api.emergency.IEmergency;
import com.heytap.wearable.watch.emergency.safeguard.GuardRelation;
import com.heytap.wearable.watch.emergency.safeguard.MyProtect;
import com.heytap.wearable.watch.emergency.safeguard.SafeGuardMyProtectActivity;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.hfg;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.mag;
import com.oplus.aiunit.vision.mmd;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.pag;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/emergency_impl/emergency")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0017J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/heytap/wearable/watch/emergency/IEmergencyImpl;", "Lcom/heytap/wearable/emergency/api/emergency/IEmergency;", "Landroid/content/Context;", "context", "", "init", "a6", "r7", "", "have", "Q2", "", "i", "Ljava/lang/String;", "TAG", "<init>", "()V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIEmergencyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IEmergencyImpl.kt\ncom/heytap/wearable/watch/emergency/IEmergencyImpl\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,124:1\n29#2:125\n*S KotlinDebug\n*F\n+ 1 IEmergencyImpl.kt\ncom/heytap/wearable/watch/emergency/IEmergencyImpl\n*L\n80#1:125\n*E\n"})
public final class IEmergencyImpl implements IEmergency {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "IEmergencyImpl";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/heytap/health/network/core/BaseResponse;", "Ljava/util/ArrayList;", "Lcom/heytap/wearable/watch/emergency/safeguard/GuardRelation;", "Lkotlin/collections/ArrayList;", "it", "", "a", "(Lcom/heytap/health/network/core/BaseResponse;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements o14 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull BaseResponse<ArrayList<GuardRelation>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getErrorCode() == 0) {
                ArrayList<GuardRelation> body = it.getBody();
                if (!(body == null || body.isEmpty())) {
                    IEmergencyImpl.this.Q2(true);
                    return;
                }
            }
            IEmergencyImpl.this.Q2(false);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements o14 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.o14
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            a7b.b(IEmergencyImpl.this.TAG, "jumpToSafeGuard error: " + it.getMessage());
            IEmergencyImpl.this.Q2(false);
        }
    }

    public final void Q2(boolean have) {
        Activity activityS = op.n().s();
        if (activityS != null) {
            if (have) {
                activityS.startActivity(new Intent(activityS, (Class<?>) SafeGuardMyProtectActivity.class));
            } else {
                mmd.c().a(Uri.parse("healthap://app/path=113?extra_launch_type=7&jumpUrl=security-protection-open-app/index.html?page=guide"), null);
            }
        }
    }

    @Override // com.heytap.wearable.emergency.api.emergency.IEmergency
    @SuppressLint({"CheckResult"})
    public void a6() {
        ((mag) com.heytap.health.network.core.a.j(mag.class)).j(new MyProtect(null)).L0(hfg.d()).b(new a(), new b());
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.wearable.emergency.api.emergency.IEmergency
    public void r7() {
        if (ilj.x()) {
            a7b.f(pag.TAG_ROOT, "initAfterPrivacyAgreed init sgp");
            SeedlingTool seedlingTool = SeedlingTool.INSTANCE;
            Context contextA = b78.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            seedlingTool.startInit(contextA, "com.heytap.health.SeedlingCard_Safe_Guard");
        }
    }
}
