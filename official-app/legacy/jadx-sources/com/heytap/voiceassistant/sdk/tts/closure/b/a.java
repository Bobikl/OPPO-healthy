package com.heytap.voiceassistant.sdk.tts.closure.b;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static AudioAttributes a(int i) {
        return (i == 11 ? new AudioAttributes.Builder().setLegacyStreamType(i).setUsage(16).setContentType(1) : new AudioAttributes.Builder().setLegacyStreamType(i)).build();
    }
}
