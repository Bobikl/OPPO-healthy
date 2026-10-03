package com.lifesense.weidong.lzsimplenetlibs.net.exception;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class BaseException extends Exception {
    public static final long serialVersionUID = -1842124024296535960L;

    public BaseException(String str) {
        super(str);
    }

    public BaseException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002a  */
    /* JADX WARN: Illegal instructions before constructor call */
    public BaseException(String str, Throwable th, Object... objArr) {
        String string;
        if (th == null) {
            string = null;
        } else {
            if ((th.getMessage() + ":" + str + "@" + objArr) != null) {
                string = Arrays.toString(objArr);
            } else {
                string = null;
            }
        }
        super(string, th);
    }

    public BaseException(String str, Object... objArr) {
        super(str + "@" + Arrays.toString(objArr));
    }
}
