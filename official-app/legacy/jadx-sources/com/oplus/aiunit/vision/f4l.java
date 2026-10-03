package com.oplus.aiunit.vision;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0002\t\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0007\u001a\u00020\u0005H\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u0011\u001a\u00060\u000fR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/f4l;", "", "", "b", "c", "", MapSchema.FIELD_NAME_ENTRY, "d", "Lcom/oplus/aiunit/vision/gcc;", "a", "Lcom/oplus/aiunit/vision/gcc;", "mService", "Landroid/media/AudioManager;", "Landroid/media/AudioManager;", "mAudioManager", "Lcom/oplus/aiunit/vision/f4l$b;", "Lcom/oplus/aiunit/vision/f4l$b;", "mVolumeBroadcastReceiver", "<init>", "(Lcom/oplus/aiunit/vision/gcc;)V", "Companion", "music_impl_release"}, k = 1, mv = {1, 8, 0})
public final class f4l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final gcc mService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public AudioManager mAudioManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public b mVolumeBroadcastReceiver;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/f4l$b;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "(Lcom/oplus/aiunit/vision/f4l;)V", "music_impl_release"}, k = 1, mv = {1, 8, 0})
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (intent == null || intent.getAction() == null || !Intrinsics.areEqual(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION") || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3) {
                return;
            }
            f4l.this.mService.K();
        }
    }

    public f4l(@NotNull gcc mService) {
        Intrinsics.checkNotNullParameter(mService, "mService");
        this.mService = mService;
        Object systemService = b78.a().getSystemService("audio");
        this.mAudioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        this.mVolumeBroadcastReceiver = new b();
        d();
    }

    public final int b() {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return -1;
    }

    public final int c() {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            return audioManager.getStreamMaxVolume(3);
        }
        return 15;
    }

    public final void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
        rdf.a(b78.b(), this.mVolumeBroadcastReceiver, intentFilter, 2);
    }

    public final void e() {
        b78.b().unregisterReceiver(this.mVolumeBroadcastReceiver);
    }
}
