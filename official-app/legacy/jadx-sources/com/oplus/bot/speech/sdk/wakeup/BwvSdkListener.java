package com.oplus.bot.speech.sdk.wakeup;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public interface BwvSdkListener {
    void onError(String str);

    void onInit(String str);

    void onResult(String str);
}
