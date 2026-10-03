package com.google.zxing;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public final class ChecksumException extends ReaderException {
    private static final ChecksumException INSTANCE;

    static {
        ChecksumException checksumException = new ChecksumException();
        INSTANCE = checksumException;
        checksumException.setStackTrace(ReaderException.NO_TRACE);
    }

    private ChecksumException() {
    }

    public static ChecksumException getChecksumInstance() {
        return ReaderException.isStackTrace ? new ChecksumException() : INSTANCE;
    }

    private ChecksumException(Throwable th) {
        super(th);
    }

    public static ChecksumException getChecksumInstance(Throwable th) {
        return ReaderException.isStackTrace ? new ChecksumException(th) : INSTANCE;
    }
}
