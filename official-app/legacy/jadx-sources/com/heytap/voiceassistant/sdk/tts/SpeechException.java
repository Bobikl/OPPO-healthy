package com.heytap.voiceassistant.sdk.tts;

import com.heytap.voiceassistant.sdk.tts.closure.a.a;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;

/* JADX INFO: loaded from: classes19.dex */
public final class SpeechException extends Exception {
    private static final long serialVersionUID = 9038636085242820382L;
    private String mDescription;
    private int mErrorCode;

    public SpeechException(int i) {
        this.mErrorCode = i;
        this.mDescription = "";
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorDescription() {
        return this.mDescription;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbA = a.a("SpeechException {mErrorCode = ");
        sbA.append(this.mErrorCode);
        sbA.append(", mDescription = ");
        sbA.append(this.mDescription);
        sbA.append("}");
        return sbA.toString();
    }

    public SpeechException(int i, String str) {
        this.mErrorCode = i;
        this.mDescription = str;
    }

    public SpeechException(Throwable th) {
        this.mErrorCode = SpeechErrorCode.ERROR_UNKNOWN;
        this.mDescription = th.toString();
    }
}
