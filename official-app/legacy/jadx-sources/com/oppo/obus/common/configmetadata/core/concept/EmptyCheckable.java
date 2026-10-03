package com.oppo.obus.common.configmetadata.core.concept;

import com.oppo.obus.common.configmetadata.core.util.ObjectUtils;

/* JADX INFO: loaded from: classes9.dex */
public interface EmptyCheckable {
    static boolean ifEmpty(Object obj) {
        if (ObjectUtils.isEmpty(obj)) {
            return true;
        }
        if (obj instanceof EmptyCheckable) {
            return ((EmptyCheckable) obj).ifEmpty();
        }
        return false;
    }

    boolean ifEmpty();
}
