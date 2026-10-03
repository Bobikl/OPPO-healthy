package com.heytap.health.watch.notification.impl.flashback;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.core.os.BundleCompat;
import com.heytap.health.interconnection.game.IGameAssistantRepository;
import com.heytap.health.watch.notification.flashback.FlashbackMsg;
import com.heytap.health.watch.notification.impl.module.NotificationHolder;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.cr7;
import com.oplus.aiunit.vision.cvc;
import com.oplus.aiunit.vision.evc;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.rl4;
import com.oplus.aiunit.vision.x0;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001c\u0010\u0015\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0002R\u0014\u0010\u0016\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/heytap/health/watch/notification/impl/flashback/a;", "", "", b2n.g, "n", "Landroid/os/Bundle;", "bundle", "f", "j", "", LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_KEY, MapSchema.FIELD_NAME_ENTRY, "i", LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/cr7;", "cache", "d", "", "packageName", "flashBackCache", "c", "TAG", "Ljava/lang/String;", "EXTRA_TITLE", "EXTRA_CONTENT", "EXTRA_APP_ICON", "EXTRA_APP_PACKAGE_NAME", "EXTRA_BUBBLE_STATUS", "EXTRA_BUTTON", "", "BUBBLE_STATUS_ACTIVE", "I", "Landroid/util/LruCache;", "a", "Landroid/util/LruCache;", "mLastCache", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class a {
    public static final int BUBBLE_STATUS_ACTIVE = 0;

    @NotNull
    public static final String EXTRA_APP_ICON = "extra_app_icon";

    @NotNull
    public static final String EXTRA_APP_PACKAGE_NAME = "extra_app_package_name";

    @NotNull
    public static final String EXTRA_BUBBLE_STATUS = "extra_bubble_status";

    @NotNull
    public static final String EXTRA_BUTTON = "extra_button";

    @NotNull
    public static final String EXTRA_CONTENT = "extra_content";

    @NotNull
    public static final String EXTRA_TITLE = "extra_title";

    @NotNull
    public static final String TAG = "NTF_FlashbackMsgManager";

    @NotNull
    public static final a INSTANCE = new a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final LruCache<String, cr7> mLastCache = new LruCache<>(8);

    /* JADX INFO: renamed from: com.heytap.health.watch.notification.impl.flashback.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/watch/notification/impl/flashback/a$a", "Lcom/oplus/aiunit/vision/rl4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0696a implements rl4.c {
        @Override // com.oplus.aiunit.vision.rl4.c
        public void a(boolean success, int code) {
            a7b.f(a.TAG, "onSendResult: close flashback");
            a.mLastCache.evictAll();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/watch/notification/impl/flashback/a$b", "Lcom/oplus/aiunit/vision/rl4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements rl4.c {
        @Override // com.oplus.aiunit.vision.rl4.c
        public void a(boolean success, int code) {
            if (success) {
                a7b.f(a.TAG, "onSendResult: sendCommonCmd success ");
            }
        }
    }

    public static final void g(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        a aVar = INSTANCE;
        if (aVar.e() || aVar.l(bundle) || !FlashbackProvider.INSTANCE.a()) {
            return;
        }
        int i = bundle.getInt(EXTRA_BUBBLE_STATUS, 0);
        boolean zIsIgnoringBatteryOptimizations = true;
        if (i == 1 || i == 2) {
            aVar.j();
            return;
        }
        if (!aVar.i(bundle) && aVar.m()) {
            cr7 cr7Var = new cr7(bundle);
            if (aVar.d(cr7Var)) {
                return;
            }
            String string = bundle.getString(EXTRA_APP_PACKAGE_NAME, "");
            aVar.c(string, cr7Var);
            if (!Intrinsics.areEqual("com.baidu.BaiduMap", string)) {
                Object systemService = b78.a().getSystemService("power");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                zIsIgnoringBatteryOptimizations = ((PowerManager) systemService).isIgnoringBatteryOptimizations(string);
            }
            bundle.putBoolean("extra_background", zIsIgnoringBatteryOptimizations);
            aVar.k(bundle);
        }
    }

    public final void c(String packageName, cr7 flashBackCache) {
        mLastCache.put(packageName, flashBackCache);
    }

    public final boolean d(cr7 cache) {
        String packageName = cache.getPackageName();
        if (packageName == null) {
            return false;
        }
        boolean zAreEqual = Intrinsics.areEqual(cache, mLastCache.get(packageName));
        a7b.f(TAG, "[contentIntercept] --> equals=" + zAreEqual);
        if (zAreEqual || !TextUtils.isEmpty(cache.getTitle()) || !TextUtils.isEmpty(cache.getContent()) || cache.getStatus() == 1) {
            return zAreEqual;
        }
        a7b.m(TAG, "[contentIntercept] --> title&content null,status!=1");
        return true;
    }

    public final boolean e() {
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        if (currentConnectId == null) {
            return true;
        }
        if (!NotificationHolder.INSTANCE.e(currentConnectId)) {
            return false;
        }
        a7b.f(TAG, "familyIntercept: true");
        return true;
    }

    public final void f(@NotNull final Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        NotificationModule.INSTANCE.q(new Runnable() { // from class: com.oplus.aiunit.vision.fr7
            @Override // java.lang.Runnable
            public final void run() {
                com.heytap.health.watch.notification.impl.flashback.a.g(bundle);
            }
        });
    }

    public final void h() {
        FlashbackProvider.INSTANCE.b(true);
    }

    public final boolean i(Bundle bundle) {
        String string = bundle.getString(EXTRA_APP_PACKAGE_NAME, "");
        Intrinsics.checkNotNullExpressionValue(string, "bundle.getString(EXTRA_APP_PACKAGE_NAME, \"\")");
        boolean z = !cvc.INSTANCE.a(string);
        a7b.f(TAG, "packageIntercept: " + z);
        return z;
    }

    public final void j() {
        gl4.deviceMultiple.messageApi.j(gl4.managerApi.n(), new MessageEvent(2, 112, FlashbackMsg.newBuilder().setStatus(2).build().toByteArray()), new C0696a());
    }

    public final void k(Bundle bundle) {
        String string = bundle.getString(EXTRA_APP_PACKAGE_NAME, "");
        int i = bundle.getInt(EXTRA_BUBBLE_STATUS, 0);
        boolean z = bundle.getBoolean("extra_background");
        String string2 = bundle.getString("extra_title", "");
        String string3 = bundle.getString(EXTRA_CONTENT, "");
        FlashbackMsg.Builder status = FlashbackMsg.newBuilder().setStrTitle(string2).setStrContent(string3).setBackground(z).setPackageName(string).setStatus(i);
        Bitmap bitmap = (Bitmap) BundleCompat.getParcelable(bundle, EXTRA_APP_ICON, Bitmap.class);
        if (bitmap != null) {
            cvc.b bVarA = evc.a(gl4.managerApi.getCurrentConnectId());
            if (!bVarA.j5()) {
                status.setByteIcon(bVarA.Z0(null, bitmap).getByteString());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[sendCommonMsg] --> title=");
        sb.append(string2);
        sb.append(", status=");
        sb.append(i);
        sb.append(", content=");
        sb.append(string3);
        gl4.deviceMultiple.messageApi.j(gl4.managerApi.n(), new MessageEvent(2, 112, status.build().toByteArray()), new b());
    }

    public final boolean l(Bundle bundle) {
        String string = bundle.getString(EXTRA_APP_PACKAGE_NAME, "");
        Intrinsics.checkNotNullExpressionValue(string, "bundle.getString(EXTRA_APP_PACKAGE_NAME, \"\")");
        if (!cvc.INSTANCE.b(string)) {
            return false;
        }
        a7b.f(TAG, "sendGameCmd: gameMsgEnable");
        Object objNavigation = x0.d().b("/ic/GameMessageSender").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.interconnection.game.IGameAssistantRepository");
        ((IGameAssistantRepository) objNavigation).T8(bundle);
        return true;
    }

    public final boolean m() {
        return com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE.k("flashback");
    }

    public final void n() {
        FlashbackProvider.INSTANCE.b(false);
    }
}
