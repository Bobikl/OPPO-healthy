package com.heytap.speech.engine;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class SpeechEngineException extends RuntimeException {
    private static final long serialVersionUID = 9038636085242820382L;
    private String mDescription;
    private int mErrorCode;

    public SpeechEngineException(Throwable th) {
        this.mErrorCode = -10000;
        this.mDescription = th.toString();
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorDescription() {
        return this.mDescription;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String toString() {
        return "SpeechException {mErrorCode = " + this.mErrorCode + ", mDescription = " + this.mDescription + "}";
    }

    public SpeechEngineException(int i) {
        this.mErrorCode = i;
        this.mDescription = "";
    }

    public SpeechEngineException(int i, String str) {
        this.mErrorCode = i;
        this.mDescription = str;
    }
}
