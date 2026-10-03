package com.platform.usercenter.network.trace;

import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface ITraceController {
    LogScope logControl();

    boolean traceControl(@NonNull Map<String, String> map);
}
