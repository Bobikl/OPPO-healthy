package com.google.zxing;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class FormatException extends ReaderException {
    private static final FormatException INSTANCE;

    static {
        FormatException formatException = new FormatException();
        INSTANCE = formatException;
        formatException.setStackTrace(ReaderException.NO_TRACE);
    }

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        return ReaderException.isStackTrace ? new FormatException() : INSTANCE;
    }

    private FormatException(Throwable th) {
        super(th);
    }

    public static FormatException getFormatInstance(Throwable th) {
        return ReaderException.isStackTrace ? new FormatException(th) : INSTANCE;
    }
}
