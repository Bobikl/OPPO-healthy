package com.oplus.aiunit.vision;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.heytap.health.watch.commonsync.R$raw;
import com.heytap.log.formatter.LogFieldKey;
import com.op.proto.FindPhoneProto;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0000J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0010\u001a\u00020\u0007H\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010&R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u001a\u0010/\u001a\b\u0018\u00010,R\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010.R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00102R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R\u0016\u00106\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010(R\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, d2 = {"Lcom/oplus/aiunit/vision/lf7;", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "", "d", b2n.f, "", "focusChange", "", "onAudioFocusChange", "s", "r", "hasNext", "n", "", "messageId", LogFieldKey.MESSAGE_KEY, MapSchema.FIELD_NAME_KEY, "o", LogFieldKey.PROCESS_NAME_KEY, "errorCode", LogFieldKey.LEVEL_KEY, "q", "f", "CALLBACK_STATUS_SUCCESS", "I", "VIBRATE_TIME", "SCREEN_ON_TIME", "i", "curAlarmVolume", "j", "maxAlarmVolume", "Landroid/media/MediaPlayer;", "Landroid/media/MediaPlayer;", "mMediaPlayer", "Landroid/media/AudioManager;", "Landroid/media/AudioManager;", "mAudioManager", "Landroid/media/AudioAttributes;", "Landroid/media/AudioAttributes;", "mAudioAttributes", "Z", "Landroid/os/Vibrator;", "Landroid/os/Vibrator;", "vibrator", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "Landroid/os/PowerManager$WakeLock;", "mWakeLock", "isMusicPlaying", "", "J", "ringSessionStartElapsedMs", "lastSignalElapsedMs", "t", "hasLoggedRingFuse", MapSchema.FIELD_NAME_ENTRY, "()Z", "isPlayingRing", "<init>", "()V", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFindPhoneUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindPhoneUtil.kt\ncom/heytap/health/watch/commonsync/util/FindPhoneUtil\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,246:1\n29#2:247\n*S KotlinDebug\n*F\n+ 1 FindPhoneUtil.kt\ncom/heytap/health/watch/commonsync/util/FindPhoneUtil\n*L\n155#1:247\n*E\n"})
public final class lf7 implements AudioManager.OnAudioFocusChangeListener {
    public static final int CALLBACK_STATUS_SUCCESS = 1;
    public static final int SCREEN_ON_TIME = 2000;
    public static final int VIBRATE_TIME = 2000;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static int curAlarmVolume;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static int maxAlarmVolume;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final AudioManager mAudioManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public static final AudioAttributes mAudioAttributes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static boolean hasNext;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public static final Vibrator vibrator;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public static final PowerManager.WakeLock mWakeLock;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public static boolean isMusicPlaying;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static long ringSessionStartElapsedMs;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public static long lastSignalElapsedMs;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public static boolean hasLoggedRingFuse;

    @NotNull
    public static final lf7 INSTANCE = new lf7();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static final MediaPlayer mMediaPlayer = new MediaPlayer();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/lf7$a", "Lcom/oplus/aiunit/vision/rl4$c;", "", "success", "", "code", "", "a", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements rl4.c {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.oplus.aiunit.vision.rl4.c
        public void a(boolean success, int code) {
            int i = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("replyDevice, errorCode: ");
            sb.append(i);
            sb.append("; code: ");
            sb.append(code);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/oplus/aiunit/vision/lf7$b", "Lcom/oplus/aiunit/vision/u61;", "Ljava/lang/Void;", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "", "errMsg", "b", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends u61<Void> {
        public final /* synthetic */ String i;

        public b(String str) {
            this.i = str;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(@NotNull Throwable e2, @NotNull String errMsg) {
            Intrinsics.checkNotNullParameter(e2, "e");
            Intrinsics.checkNotNullParameter(errMsg, "errMsg");
            a7b.c("FindPhoneUtil", "reportCloudState fail, msgId=" + this.i + ", err=" + errMsg, e2);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@Nullable Void result) {
            a7b.f("FindPhoneUtil", "reportCloudState success, msgId=" + this.i);
        }
    }

    static {
        Object systemService = b78.a().getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        mAudioManager = (AudioManager) systemService;
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setLegacyStreamType(4).build();
        Intrinsics.checkNotNullExpressionValue(audioAttributesBuild, "Builder().setLegacyStrea…ger.STREAM_ALARM).build()");
        mAudioAttributes = audioAttributesBuild;
        Object systemService2 = b78.a().getSystemService("vibrator");
        vibrator = systemService2 instanceof Vibrator ? (Vibrator) systemService2 : null;
        Object systemService3 = b78.a().getSystemService("power");
        PowerManager powerManager = systemService3 instanceof PowerManager ? (PowerManager) systemService3 : null;
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager != null ? powerManager.newWakeLock(268435466, "watch_interconnection:find_phone_wakelock") : null;
        mWakeLock = wakeLockNewWakeLock;
        if (wakeLockNewWakeLock != null) {
            wakeLockNewWakeLock.setReferenceCounted(false);
        }
    }

    public static final void h(MediaPlayer mediaPlayer) {
        AudioManager audioManager = mAudioManager;
        curAlarmVolume = audioManager.getStreamVolume(4);
        int streamMaxVolume = audioManager.getStreamMaxVolume(4);
        maxAlarmVolume = streamMaxVolume;
        l25.a("FindPhoneUtil", "curAlarmVolume = " + curAlarmVolume + "; maxAlarmVolume = " + streamMaxVolume);
        lf7 lf7Var = INSTANCE;
        lf7Var.l(0);
        lf7Var.o();
        mMediaPlayer.start();
    }

    public static final void i(MediaPlayer mediaPlayer) {
        l25.a("FindPhoneUtil", "playRing onCompletion");
        lf7 lf7Var = INSTANCE;
        lf7Var.p();
        if (hasNext && !lf7Var.f()) {
            hasNext = false;
            lf7Var.g();
        } else {
            hasNext = false;
            lf7Var.q();
            lf7Var.l(1);
        }
    }

    public static final boolean j(MediaPlayer mediaPlayer, int i, int i2) {
        l25.a("FindPhoneUtil", "onError");
        lf7 lf7Var = INSTANCE;
        lf7Var.p();
        lf7Var.q();
        lf7Var.l(2);
        return false;
    }

    public final synchronized boolean d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = lastSignalElapsedMs;
        if (j2 == 0 || jElapsedRealtime - j2 > 5000) {
            ringSessionStartElapsedMs = jElapsedRealtime;
            hasLoggedRingFuse = false;
            l25.a("FindPhoneUtil", "start new ring session");
        } else if (ringSessionStartElapsedMs == 0) {
            ringSessionStartElapsedMs = jElapsedRealtime;
        }
        lastSignalElapsedMs = jElapsedRealtime;
        if (!f()) {
            return true;
        }
        hasNext = false;
        if (!hasLoggedRingFuse) {
            hasLoggedRingFuse = true;
            l25.c("FindPhoneUtil", "ring session timeout, ignore signal");
        }
        return false;
    }

    public final boolean e() {
        return mMediaPlayer.isPlaying();
    }

    public final boolean f() {
        return ringSessionStartElapsedMs > 0 && SystemClock.elapsedRealtime() - ringSessionStartElapsedMs > 60000;
    }

    @NotNull
    public final lf7 g() {
        try {
            l25.a("FindPhoneUtil", "call playRing");
            AudioManager audioManager = mAudioManager;
            boolean z = audioManager.isMusicActive() && audioManager.isWiredHeadsetOn();
            isMusicPlaying = z;
            l25.a("FindPhoneUtil", "onPrepared, isMusicPlaying " + z);
            if (!isMusicPlaying || audioManager.requestAudioFocus(this, 3, 1) == 1) {
                k();
            } else {
                l25.c("FindPhoneUtil", "no audio focus");
            }
        } catch (IOException e2) {
            l25.b("FindPhoneUtil", "playRing exception: " + e2.getMessage());
        } catch (IllegalStateException e3) {
            l25.b("FindPhoneUtil", "playRing exception: " + e3.getMessage());
        }
        MediaPlayer mediaPlayer = mMediaPlayer;
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.oplus.aiunit.vision.if7
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer2) {
                lf7.h(mediaPlayer2);
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.oplus.aiunit.vision.jf7
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                lf7.i(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.oplus.aiunit.vision.kf7
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                return lf7.j(mediaPlayer2, i, i2);
            }
        });
        return this;
    }

    public final void k() throws IOException {
        Context contextA = b78.a();
        String str = "android.resource://" + contextA.getPackageName() + "/" + R$raw.find_phone_audio;
        MediaPlayer mediaPlayer = mMediaPlayer;
        mediaPlayer.reset();
        mediaPlayer.setDataSource(contextA, Uri.parse(str));
        mediaPlayer.setAudioAttributes(mAudioAttributes);
        mediaPlayer.setVolume(1.0f, 1.0f);
        mediaPlayer.prepareAsync();
    }

    public final void l(int errorCode) {
        gl4.devicePrimary.messageApi.e(new MessageEvent(1, 52, FindPhoneProto.FindPhone.newBuilder().setErrorCode(errorCode).build().toByteArray()), new a(errorCode));
    }

    public final void m(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        ((ff7) com.heytap.health.network.core.a.j(ff7.class)).a(MapsKt__MapsKt.hashMapOf(TuplesKt.to("msgId", messageId), TuplesKt.to("status", 1))).L0(su8.d("FindPhoneUtil")).subscribe(new b(messageId));
    }

    public final void n(boolean hasNext2) {
        hasNext = hasNext2;
    }

    public final void o() {
        mAudioManager.setStreamVolume(4, maxAlarmVolume, 0);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
    }

    public final void p() {
        mAudioManager.setStreamVolume(4, curAlarmVolume, 0);
    }

    public final void q() {
        MediaPlayer mediaPlayer = mMediaPlayer;
        if (mediaPlayer.isPlaying()) {
            try {
                mediaPlayer.stop();
            } catch (IllegalStateException e2) {
                l25.a("FindPhoneUtil", "play media state exception: " + e2.getMessage());
            }
        }
        mAudioManager.abandonAudioFocus(this);
    }

    @NotNull
    public final lf7 r() {
        PowerManager.WakeLock wakeLock = mWakeLock;
        if (wakeLock != null) {
            wakeLock.acquire(2000L);
        }
        return this;
    }

    @NotNull
    public final lf7 s() {
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null && vibrator2.hasVibrator()) {
            vibrator2.vibrate(VibrationEffect.createOneShot(2000L, -1));
        }
        return this;
    }
}
