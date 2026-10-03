package com.oplus.aiunit.vision;

import android.media.AudioManager;
import android.media.SoundPool;

/* JADX INFO: loaded from: classes13.dex */
public final class g30 implements a3i {
    public final SoundPool i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AudioManager f11606j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final aca f11607l = new aca(8);

    public g30(SoundPool soundPool, AudioManager audioManager, int i) {
        this.i = soundPool;
        this.f11606j = audioManager;
        this.k = i;
    }

    @Override // com.oplus.aiunit.vision.bv5
    public void dispose() {
        this.i.unload(this.k);
    }
}
