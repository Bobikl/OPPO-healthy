package com.heytap.speechassist.conversation.sdk;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.WorkerThread;
import com.oplus.aiunit.vision.dva;
import com.oplus.aiunit.vision.y5i;
import io.protostuff.MapSchema;
import java.lang.ref.SoftReference;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0007\u001a\b\u0018\u00010\u0005R\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0003J\u001b\u0010\t\u001a\u0004\u0018\u00010\b*\b\u0018\u00010\u0005R\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0018\u00010\u0005R\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentWakeLock;", "", "Landroid/content/Context;", "c", "context", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "d", "", MapSchema.FIELD_NAME_ENTRY, "(Landroid/os/PowerManager$WakeLock;)Ljava/lang/Boolean;", "Ljava/lang/ref/SoftReference;", "a", "Ljava/lang/ref/SoftReference;", "mContextReference", "Ljava/util/concurrent/atomic/AtomicInteger;", "b", "Ljava/util/concurrent/atomic/AtomicInteger;", "INDEX", "Lcom/oplus/aiunit/vision/dva;", "Lcom/oplus/aiunit/vision/dva;", "mWakeLockReference", "<init>", "()V", "SpeechConversationSDK_release"}, k = 1, mv = {1, 8, 0})
public final class SpeechAssistAgentWakeLock {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static SoftReference<Context> mContextReference;

    @NotNull
    public static final SpeechAssistAgentWakeLock INSTANCE = new SpeechAssistAgentWakeLock();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger INDEX = new AtomicInteger(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final dva<PowerManager.WakeLock> mWakeLockReference = new dva<>(new Function0<PowerManager.WakeLock>() { // from class: com.heytap.speechassist.conversation.sdk.SpeechAssistAgentWakeLock$mWakeLockReference$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final PowerManager.WakeLock invoke() {
            SpeechAssistAgentWakeLock speechAssistAgentWakeLock = SpeechAssistAgentWakeLock.INSTANCE;
            return speechAssistAgentWakeLock.d(speechAssistAgentWakeLock.c());
        }
    }, new Function1<PowerManager.WakeLock, Boolean>() { // from class: com.heytap.speechassist.conversation.sdk.SpeechAssistAgentWakeLock$mWakeLockReference$2
        @Override // p010kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@Nullable PowerManager.WakeLock wakeLock) {
            Boolean boolE = SpeechAssistAgentWakeLock.INSTANCE.e(wakeLock);
            return Boolean.valueOf(boolE != null ? boolE.booleanValue() : true);
        }
    });

    @Nullable
    public final Context c() {
        SoftReference<Context> softReference = mContextReference;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    @WorkerThread
    public final PowerManager.WakeLock d(Context context) {
        PowerManager.WakeLock wakeLockNewWakeLock = null;
        if (context != null) {
            try {
                int andIncrement = INDEX.getAndIncrement();
                Object systemService = context.getSystemService("power");
                PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
                if (powerManager != null) {
                    wakeLockNewWakeLock = powerManager.newWakeLock(1, "SpeechAssistAgentWakeLock:WakeLock_" + andIncrement);
                }
            } catch (Exception unused) {
            }
        }
        y5i.e(y5i.INSTANCE, "SpeechAssistAgentWakeLock", "getWakeLock.WakeLock.acquire , info = " + wakeLockNewWakeLock, null, 4, null);
        return wakeLockNewWakeLock;
    }

    public final Boolean e(PowerManager.WakeLock wakeLock) {
        if (wakeLock == null) {
            return Boolean.TRUE;
        }
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
                y5i.e(y5i.INSTANCE, "SpeechAssistAgentWakeLock", "PowerManager.WakeLock.release , info = " + wakeLock, null, 4, null);
            }
            return Boolean.TRUE;
        } catch (Exception e2) {
            y5i.INSTANCE.c("SpeechAssistAgentWakeLock", "releaseSafely , failed!!!", e2);
            return Boolean.FALSE;
        }
    }
}
