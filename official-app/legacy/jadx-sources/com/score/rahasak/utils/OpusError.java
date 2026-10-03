package com.score.rahasak.utils;

/* JADX INFO: loaded from: classes9.dex */
public class OpusError extends RuntimeException {
    public OpusError() {
    }

    public OpusError(String str) {
        super(str);
    }

    public static int throwIfError(int i) {
        if (i >= 0) {
            return i;
        }
        throw new OpusError("Error from codec: " + i);
    }
}
