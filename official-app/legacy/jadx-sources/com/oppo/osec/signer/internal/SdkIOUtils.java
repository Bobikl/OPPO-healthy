package com.oppo.osec.signer.internal;

import java.io.Closeable;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes9.dex */
enum SdkIOUtils {
    ;

    private static final Logger defaultLog = LoggerFactory.getLogger(SdkIOUtils.class);

    public static void closeQuietly(Closeable closeable) {
        closeQuietly(closeable, null);
    }

    public static void closeQuietly(Closeable closeable, Logger logger) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                if (logger == null) {
                    logger = defaultLog;
                }
                if (logger.isDebugEnabled()) {
                    logger.debug("Ignore failure in closing the Closeable", e2);
                }
            }
        }
    }
}
