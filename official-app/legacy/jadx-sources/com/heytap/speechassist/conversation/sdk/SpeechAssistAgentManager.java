package com.heytap.speechassist.conversation.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import com.amap.api.maps.model.MyLocationStyle;
import com.heytap.log.config.StdDtoConst;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speechassist.conversation.sdk.SpeechAssistAgentManager;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.dva;
import com.oplus.aiunit.vision.gm9;
import com.oplus.aiunit.vision.pm9;
import com.oplus.aiunit.vision.t5i;
import com.oplus.aiunit.vision.y5i;
import io.protostuff.MapSchema;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0097\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u0001<\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004H $'B\t\b\u0002¢\u0006\u0004\bF\u0010GJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0003J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J(\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0016\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J&\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0006H\u0007J)\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010!R!\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00104\u001a\u0010\u0012\f\u0012\n 2*\u0004\u0018\u000101010,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\u001a\u00107\u001a\b\u0012\u0004\u0012\u0002050,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010/R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020@0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010!R\u0014\u0010E\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", LogFieldKey.LEVEL_KEY, "", "y", LogFieldKey.MESSAGE_KEY, "", "waitTime", "A", "", EngineConstant.REASON, "u", "t", "Lcom/oplus/aiunit/vision/pm9;", "callback", "q", MapSchema.FIELD_NAME_KEY, "z", StdDtoConst.FORCE_KEY, "w", "", "statusKeys", "Landroid/os/Bundle;", LogFieldKey.PROCESS_NAME_KEY, "(Landroid/content/Context;[Ljava/lang/String;)Landroid/os/Bundle;", "Lcom/oplus/aiunit/vision/dva;", "Landroid/os/HandlerThread;", "a", "Lcom/oplus/aiunit/vision/dva;", "mHandlerThread", "Landroid/os/Handler;", "b", "mHandler", "Ljava/util/concurrent/CopyOnWriteArraySet;", "c", "Lkotlin/Lazy;", "o", "()Ljava/util/concurrent/CopyOnWriteArraySet;", "mBinderConnectStatusCallbacks", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$a;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "mDeathRecipientImpl", "Ljava/util/concurrent/CountDownLatch;", "kotlin.jvm.PlatformType", MapSchema.FIELD_NAME_ENTRY, "mLockReference", "Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$c;", "f", "mSpeechAssistAgentReference", "Ljava/util/concurrent/atomic/AtomicInteger;", b2n.f, "Ljava/util/concurrent/atomic/AtomicInteger;", "mCurrentState", "com/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$d", b2n.g, "Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$d;", "mServiceConnectionCallback", "Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$b;", "i", "mServiceConnectionReference", "n", "()J", "elapsedRealtime", "<init>", "()V", "AudioRecordProxyStub", "SpeechConversationSDK_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpeechAssistAgentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeechAssistAgentManager.kt\ncom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,667:1\n1#2:668\n1855#3,2:669\n*S KotlinDebug\n*F\n+ 1 SpeechAssistAgentManager.kt\ncom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager\n*L\n324#1:669,2\n*E\n"})
public final class SpeechAssistAgentManager {

    @NotNull
    public static final SpeechAssistAgentManager INSTANCE = new SpeechAssistAgentManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final dva<HandlerThread> mHandlerThread = new dva<>(new Function0<HandlerThread>() { // from class: com.heytap.speechassist.conversation.sdk.SpeechAssistAgentManager$mHandlerThread$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("speechassist-audioRecord-thread");
            handlerThread.start();
            return handlerThread;
        }
    }, new Function1<HandlerThread, Boolean>() { // from class: com.heytap.speechassist.conversation.sdk.SpeechAssistAgentManager$mHandlerThread$2
        @Override // p010kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull HandlerThread it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                it.quitSafely();
                z = true;
            } catch (Exception e2) {
                y5i.INSTANCE.d("SpeechAssistAgentManager", "release  HandlerThread failed!!!", e2);
                z = false;
            }
            return Boolean.valueOf(z);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final dva<Handler> mHandler = new dva<>(new Function0<Handler>() { // from class: com.heytap.speechassist.conversation.sdk.SpeechAssistAgentManager$mHandler$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Handler invoke() {
            return new Handler(((HandlerThread) SpeechAssistAgentManager.mHandlerThread.b()).getLooper());
        }
    }, new Function1<Handler, Boolean>() { // from class: com.heytap.speechassist.conversation.sdk.SpeechAssistAgentManager$mHandler$2
        @Override // p010kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull Handler it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(SpeechAssistAgentManager.mHandlerThread.d());
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy mBinderConnectStatusCallbacks = LazyKt__LazyJVMKt.lazy(new Function0<CopyOnWriteArraySet<pm9>>() { // from class: com.heytap.speechassist.conversation.sdk.SpeechAssistAgentManager$mBinderConnectStatusCallbacks$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final CopyOnWriteArraySet<pm9> invoke() {
            return new CopyOnWriteArraySet<>();
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static AtomicReference<a> mDeathRecipientImpl = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AtomicReference<CountDownLatch> mLockReference = new AtomicReference<>(new CountDownLatch(1));

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final AtomicReference<c> mSpeechAssistAgentReference = new AtomicReference<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public static final AtomicInteger mCurrentState = new AtomicInteger(0);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final d mServiceConnectionCallback = new d();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final dva<b> mServiceConnectionReference = new dva<>(new Function0<b>() { // from class: com.heytap.speechassist.conversation.sdk.SpeechAssistAgentManager$mServiceConnectionReference$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final SpeechAssistAgentManager.b invoke() {
            return new SpeechAssistAgentManager.b(SpeechAssistAgentManager.mServiceConnectionCallback);
        }
    }, new Function1<b, Boolean>() { // from class: com.heytap.speechassist.conversation.sdk.SpeechAssistAgentManager$mServiceConnectionReference$2
        @Override // p010kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull SpeechAssistAgentManager.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.a());
        }
    });

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$AudioRecordProxyStub;", "Lcom/heytap/speechassist/conversation/sdk/IAudioRecordProxy$Stub;", "Landroid/os/Bundle;", "bundle", "startAudioRecord", "", "p0", "", "p1", "p2", "read", "stopAudioRecord", "releaseAudioRecord", "Lcom/oplus/aiunit/vision/gm9;", "mAudioRecordingImpl", "Lcom/oplus/aiunit/vision/gm9;", "getMAudioRecordingImpl", "()Lcom/oplus/aiunit/vision/gm9;", "setMAudioRecordingImpl", "(Lcom/oplus/aiunit/vision/gm9;)V", "<init>", "()V", "SpeechConversationSDK_release"}, k = 1, mv = {1, 8, 0})
    public static final class AudioRecordProxyStub extends IAudioRecordProxy.Stub {

        @Nullable
        private gm9 mAudioRecordingImpl;

        @Nullable
        public final gm9 getMAudioRecordingImpl() {
            return null;
        }

        @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
        public int read(@Nullable byte[] p0, int p1, int p2) {
            return (p0 == null || p2 <= 0) ? -1000 : -1001;
        }

        @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
        public int releaseAudioRecord(@Nullable Bundle bundle) {
            y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "releaseAudioRecord result = -1001", null, 4, null);
            return -1001;
        }

        public final void setMAudioRecordingImpl(@Nullable gm9 gm9Var) {
        }

        @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
        @NotNull
        public Bundle startAudioRecord(@Nullable Bundle bundle) {
            Bundle bundle2;
            if (bundle == null) {
                bundle2 = new Bundle();
                bundle2.putString(MyLocationStyle.ERROR_INFO, "params can't be null!!!");
                bundle2.putInt("errorCode", -1000);
            } else {
                bundle2 = new Bundle();
                bundle2.putString(MyLocationStyle.ERROR_INFO, "audioRecordingImpl is null!!!");
                bundle2.putInt("errorCode", -1001);
            }
            String string = bundle2.getString(MyLocationStyle.ERROR_INFO, "");
            int i = bundle2.getInt("errorCode", 0);
            y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "startAudioRecord errorCode = " + i + " , errorInfo = " + string, null, 4, null);
            return bundle2;
        }

        @Override // com.heytap.speechassist.conversation.sdk.IAudioRecordProxy
        public int stopAudioRecord(@Nullable Bundle bundle) {
            y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "stopAudioRecord result = -1001", null, 4, null);
            return -1001;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0004\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$a;", "Landroid/os/IBinder$DeathRecipient;", "", "binderDied", "a", "Landroid/os/IBinder;", "Landroid/os/IBinder;", "getBinder", "()Landroid/os/IBinder;", "binder", "<init>", "(Landroid/os/IBinder;)V", "SpeechConversationSDK_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final IBinder binder;

        public a(@NotNull IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.binder = binder;
            try {
                binder.linkToDeath(this, 0);
            } catch (Throwable th) {
                y5i.INSTANCE.c("SpeechAssistAgentManager", "DeathRecipient.linkToDeath error", th);
            }
        }

        public final void a() {
            try {
                this.binder.unlinkToDeath(this, 0);
            } catch (Throwable th) {
                y5i.INSTANCE.c("SpeechAssistAgentManager", "DeathRecipient.unlinkToDeath error", th);
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            SpeechAssistAgentManager.INSTANCE.u("binderDied");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\n\u001a\u00020\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$b;", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "onServiceDisconnected", "", "a", "i", "Landroid/content/ServiceConnection;", "mServiceConnectionCallback", "<init>", "(Landroid/content/ServiceConnection;)V", "SpeechConversationSDK_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements ServiceConnection {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public ServiceConnection mServiceConnectionCallback;

        public b(@Nullable ServiceConnection serviceConnection) {
            this.mServiceConnectionCallback = serviceConnection;
        }

        public final boolean a() {
            this.mServiceConnectionCallback = null;
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            ServiceConnection serviceConnection = this.mServiceConnectionCallback;
            if (serviceConnection != null) {
                serviceConnection.onServiceConnected(name, service);
            } else {
                y5i.e(y5i.INSTANCE, "SpeechAssistAgentManager", "onServiceConnected , but callback is null", null, 4, null);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
            ServiceConnection serviceConnection = this.mServiceConnectionCallback;
            if (serviceConnection != null) {
                serviceConnection.onServiceDisconnected(name);
            } else {
                y5i.e(y5i.INSTANCE, "SpeechAssistAgentManager", "onServiceConnected , but callback is null", null, 4, null);
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$c;", "", "Landroid/content/Context;", "context", "", "", "statusKeys", "Landroid/os/Bundle;", "a", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/os/Bundle;", "Lcom/heytap/speechassist/conversation/sdk/ISpeechAssistProxy;", "Lcom/heytap/speechassist/conversation/sdk/ISpeechAssistProxy;", "getBinder", "()Lcom/heytap/speechassist/conversation/sdk/ISpeechAssistProxy;", "binder", "Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$AudioRecordProxyStub;", "b", "Lcom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$AudioRecordProxyStub;", "mAudioRecordProxyStub", "<init>", "(Lcom/heytap/speechassist/conversation/sdk/ISpeechAssistProxy;)V", "SpeechConversationSDK_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ISpeechAssistProxy binder;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final AudioRecordProxyStub mAudioRecordProxyStub;

        public c(@NotNull ISpeechAssistProxy binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.binder = binder;
            this.mAudioRecordProxyStub = new AudioRecordProxyStub();
        }

        @Nullable
        public Bundle a(@NotNull Context context, @Nullable String[] statusKeys) {
            Intrinsics.checkNotNullParameter(context, "context");
            boolean z = true;
            if (statusKeys != null) {
                if (!(statusKeys.length == 0)) {
                    z = false;
                }
            }
            if (z) {
                return new Bundle();
            }
            try {
                ISpeechAssistProxy iSpeechAssistProxy = this.binder;
                Bundle bundle = new Bundle();
                bundle.putStringArray(t5i.ASSISTANT_STATUS_KEY, statusKeys);
                return iSpeechAssistProxy.getSpeechAssistStatus(bundle);
            } catch (Exception e2) {
                y5i.INSTANCE.d("SpeechAssistAgentManager", "getSpeechAssistStatus failed!!!", e2);
                return null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$d", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "service", "", "onServiceConnected", "onServiceDisconnected", "SpeechConversationSDK_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSpeechAssistAgentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpeechAssistAgentManager.kt\ncom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$mServiceConnectionCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,667:1\n1855#2,2:668\n*S KotlinDebug\n*F\n+ 1 SpeechAssistAgentManager.kt\ncom/heytap/speechassist/conversation/sdk/SpeechAssistAgentManager$mServiceConnectionCallback$1\n*L\n93#1:668,2\n*E\n"})
    public static final class d implements ServiceConnection {
        @Override // android.content.ServiceConnection
        public void onServiceConnected(@Nullable ComponentName name, @Nullable IBinder service) {
            y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "onServiceConnected , name = " + name + " , service = " + service, null, 4, null);
            ISpeechAssistProxy iSpeechAssistProxyAsInterface = null;
            if (service != null) {
                try {
                    iSpeechAssistProxyAsInterface = ISpeechAssistProxy.Stub.asInterface(service);
                } catch (Exception e2) {
                    y5i.INSTANCE.c("SpeechAssistAgentManager", "onServiceConnected , speechAssistProxy cast failed!!!", e2);
                }
            }
            if (service == null || iSpeechAssistProxyAsInterface == null) {
                SpeechAssistAgentManager.INSTANCE.u("onServiceConnectFailed");
            } else {
                SpeechAssistAgentManager.mCurrentState.set(2);
                SpeechAssistAgentManager.mDeathRecipientImpl.set(new a(service));
                SpeechAssistAgentManager.mSpeechAssistAgentReference.set(new c(iSpeechAssistProxyAsInterface));
                for (pm9 pm9Var : SpeechAssistAgentManager.INSTANCE.o()) {
                    if (pm9Var != null) {
                        pm9Var.a();
                    }
                }
            }
            CountDownLatch countDownLatch = (CountDownLatch) SpeechAssistAgentManager.mLockReference.get();
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@Nullable ComponentName name) {
            y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "onServiceDisconnected , name = " + name, null, 4, null);
            SpeechAssistAgentManager.INSTANCE.u("onServiceDisconnected");
        }
    }

    public static /* synthetic */ void B(SpeechAssistAgentManager speechAssistAgentManager, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = 10000;
        }
        speechAssistAgentManager.A(j2);
    }

    public static /* synthetic */ boolean r(SpeechAssistAgentManager speechAssistAgentManager, Context context, Intent intent, pm9 pm9Var, int i, Object obj) {
        if ((i & 2) != 0) {
            intent = null;
        }
        if ((i & 4) != 0) {
            pm9Var = null;
        }
        return speechAssistAgentManager.q(context, intent, pm9Var);
    }

    public static final void s(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "$context");
        INSTANCE.l(context, intent);
    }

    public static final void v(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "$bundle");
        for (pm9 pm9Var : INSTANCE.o()) {
            if (pm9Var != null) {
                pm9Var.b(bundle);
            }
        }
    }

    public static /* synthetic */ void x(SpeechAssistAgentManager speechAssistAgentManager, Context context, pm9 pm9Var, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            pm9Var = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        speechAssistAgentManager.w(context, pm9Var, z);
    }

    public final void A(long waitTime) {
        try {
            CountDownLatch countDownLatch = mLockReference.get();
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                countDownLatch.await(waitTime, TimeUnit.MILLISECONDS);
            }
        } catch (Exception e2) {
            y5i.INSTANCE.c("SpeechAssistAgentManager", "waitBindService  error!!!", e2);
        }
    }

    public final void k(@Nullable pm9 callback) {
        if (callback == null || o().contains(callback)) {
            return;
        }
        o().add(callback);
    }

    @WorkerThread
    public final boolean l(Context context, Intent intent) {
        boolean zBindService;
        Intent intent2 = intent != null ? new Intent(intent) : new Intent();
        intent2.setComponent(new ComponentName(t5i.PKG_SPEECH_ASSIST, "com.heytap.speechassist.agent.SpeechAssistAgentService"));
        intent2.setAction("heytap.speech.intent.action.BIND_SPEECH_ASSIST");
        intent2.putExtra("caller_package", context.getPackageName());
        intent2.putExtra("startTime", SystemClock.elapsedRealtime());
        try {
            zBindService = context.bindService(intent2, mServiceConnectionReference.a(true), 1);
            if (zBindService) {
                mCurrentState.set(1);
            } else {
                INSTANCE.m();
                CountDownLatch countDownLatch = mLockReference.get();
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        } catch (Exception e2) {
            y5i.INSTANCE.c("SpeechAssistAgentManager", "bindService failed!!!", e2);
            m();
            CountDownLatch countDownLatch2 = mLockReference.get();
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
            zBindService = false;
        }
        y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "bindSpeechAssistReal , result = " + zBindService, null, 4, null);
        return zBindService;
    }

    public final void m() {
        y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "cleanStatus", null, 4, null);
        mCurrentState.set(0);
        mServiceConnectionReference.d();
        mSpeechAssistAgentReference.set(null);
        a aVar = mDeathRecipientImpl.get();
        if (aVar != null) {
            aVar.a();
        }
        mDeathRecipientImpl.set(null);
    }

    public final long n() {
        return SystemClock.elapsedRealtime();
    }

    public final CopyOnWriteArraySet<pm9> o() {
        return (CopyOnWriteArraySet) mBinderConnectStatusCallbacks.getValue();
    }

    @WorkerThread
    @Nullable
    public Bundle p(@NotNull Context context, @Nullable String[] statusKeys) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = true;
        if (statusKeys != null) {
            if (!(statusKeys.length == 0)) {
                z = false;
            }
        }
        if (z) {
            return new Bundle();
        }
        c cVar = mSpeechAssistAgentReference.get();
        if (cVar != null) {
            return cVar.a(context, statusKeys);
        }
        return null;
    }

    @WorkerThread
    public final boolean q(@NotNull final Context context, @Nullable final Intent intent, @Nullable pm9 callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this) {
            SpeechAssistAgentManager speechAssistAgentManager = INSTANCE;
            int i = 0;
            if (!speechAssistAgentManager.t(context)) {
                y5i.e(y5i.INSTANCE, "SpeechAssistAgentManager", "init failed , SpeechAssistant App don't support init!!!", null, 4, null);
                if (callback != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(EngineConstant.REASON, "SpeechAssistant App don't support init!!!");
                    callback.b(bundle);
                }
                return false;
            }
            long jN = speechAssistAgentManager.n();
            AtomicInteger atomicInteger = mCurrentState;
            int i2 = atomicInteger.get();
            boolean z = true;
            boolean z2 = callback != null && speechAssistAgentManager.o().contains(callback);
            speechAssistAgentManager.k(callback);
            if (i2 == 1) {
                B(speechAssistAgentManager, 0L, 1, null);
            } else if (i2 != 2) {
                mLockReference.set(new CountDownLatch(1));
                mHandler.b().post(new Runnable() { // from class: com.oplus.aiunit.vision.v5i
                    @Override // java.lang.Runnable
                    public final void run() {
                        SpeechAssistAgentManager.s(context, intent);
                    }
                });
                B(speechAssistAgentManager, 0L, 1, null);
            } else if (!z2 && callback != null) {
                callback.a();
            }
            if (mSpeechAssistAgentReference.get() == null) {
                z = false;
            }
            if (z) {
                i = 2;
            }
            atomicInteger.set(i);
            y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "init, cost = " + (speechAssistAgentManager.n() - jN) + " , result = " + z, null, 4, null);
            return z;
        }
    }

    public final boolean t(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = t5i.a(context, t5i.PKG_SPEECH_ASSIST) >= 10000;
        y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "isSupportHeadsetOneShot result = " + z, null, 4, null);
        return z;
    }

    public final void u(String reason) {
        synchronized (this) {
            int i = mCurrentState.get();
            y5i y5iVar = y5i.INSTANCE;
            y5i.e(y5iVar, "SpeechAssistAgentManager", "onBinderDisconnected , currentState = " + i + " , reason = " + reason, null, 4, null);
            SpeechAssistAgentManager speechAssistAgentManager = INSTANCE;
            speechAssistAgentManager.m();
            if (i != 0) {
                try {
                    if (speechAssistAgentManager.o().isEmpty()) {
                        y5i.e(y5iVar, "SpeechAssistAgentManager", "onBinderDisconnected callbacks isEmpty", null, 4, null);
                    } else {
                        final Bundle bundle = new Bundle();
                        bundle.putString(EngineConstant.REASON, reason);
                        mHandler.b().post(new Runnable() { // from class: com.oplus.aiunit.vision.u5i
                            @Override // java.lang.Runnable
                            public final void run() {
                                SpeechAssistAgentManager.v(bundle);
                            }
                        });
                    }
                } catch (Exception unused) {
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @WorkerThread
    public final void w(@NotNull Context context, @Nullable pm9 callback, boolean force) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this) {
            try {
                if (force) {
                    INSTANCE.o().clear();
                } else {
                    INSTANCE.z(callback);
                }
                int size = INSTANCE.o().size();
                y5i y5iVar = y5i.INSTANCE;
                y5i.b(y5iVar, "SpeechAssistAgentManager", "release , callback = " + callback + " , callbackSize = " + size + " , force = " + force, null, 4, null);
                if (size == 0) {
                    synchronized (this) {
                        b bVarC = mServiceConnectionReference.c();
                        if (bVarC != null) {
                            try {
                                context.unbindService(bVarC);
                                y5i.e(y5iVar, "SpeechAssistAgentManager", "release , unbindService", null, 4, null);
                            } catch (Exception unused) {
                            }
                        }
                        INSTANCE.y();
                        mCurrentState.set(0);
                        mLockReference.set(new CountDownLatch(1));
                        Unit unit = Unit.INSTANCE;
                    }
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y() {
        y5i.b(y5i.INSTANCE, "SpeechAssistAgentManager", "releaseInner", null, 4, null);
        m();
        try {
            mHandler.d();
            mHandlerThread.d();
        } catch (Exception e2) {
            y5i.INSTANCE.c("SpeechAssistAgentManager", "releaseInner  error!!!", e2);
        }
    }

    public final void z(@Nullable pm9 callback) {
        if (callback == null || !o().contains(callback)) {
            return;
        }
        o().remove(callback);
    }
}
