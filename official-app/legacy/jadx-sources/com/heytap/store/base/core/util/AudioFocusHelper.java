package com.heytap.store.base.core.util;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.heytap.store.base.core.util.AudioFocusHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/base/core/util/AudioFocusHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attr", "Landroid/media/AudioAttributes;", "kotlin.jvm.PlatformType", "audioManager", "Landroid/media/AudioManager;", "getAudioManager", "()Landroid/media/AudioManager;", "audioManager$delegate", "Lkotlin/Lazy;", "focusRequest", "Landroid/media/AudioFocusRequest;", "abandonAudioFocus", "", "requestAudioFocus", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AudioFocusHelper {
    private final AudioAttributes attr;

    /* JADX INFO: renamed from: audioManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy audioManager;

    @NotNull
    private final Context context;

    @Nullable
    private AudioFocusRequest focusRequest;

    public AudioFocusHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.audioManager = LazyKt__LazyJVMKt.lazy(new Function0<AudioManager>() { // from class: com.heytap.store.base.core.util.AudioFocusHelper$audioManager$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final AudioManager invoke() {
                Object systemService = this.this$0.context.getSystemService("audio");
                if (systemService != null) {
                    return (AudioManager) systemService;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
            }
        });
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        this.attr = audioAttributesBuild;
        this.focusRequest = new AudioFocusRequest.Builder(1).setWillPauseWhenDucked(true).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: com.oplus.aiunit.vision.bk0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                AudioFocusHelper.m4772_init_$lambda0(i);
            }
        }).setAudioAttributes(audioAttributesBuild).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m4772_init_$lambda0(int i) {
    }

    private final AudioManager getAudioManager() {
        return (AudioManager) this.audioManager.getValue();
    }

    public final void abandonAudioFocus() {
        AudioManager audioManager = getAudioManager();
        AudioFocusRequest audioFocusRequest = this.focusRequest;
        Intrinsics.checkNotNull(audioFocusRequest);
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void requestAudioFocus() {
        AudioManager audioManager = getAudioManager();
        AudioFocusRequest audioFocusRequest = this.focusRequest;
        Intrinsics.checkNotNull(audioFocusRequest);
        audioManager.requestAudioFocus(audioFocusRequest);
    }
}
