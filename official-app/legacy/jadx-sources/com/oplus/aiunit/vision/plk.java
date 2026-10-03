package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.drs.core.net.entity.UploadStateAware;
import com.oppo.obus.common.report.core.entity.v32.Message;

/* JADX INFO: loaded from: classes6.dex */
public interface plk {
    @NonNull
    UploadStateAware a(@NonNull Message message, int i, @NonNull String str, @NonNull String str2);

    @NonNull
    UploadStateAware b(@NonNull Message message, @NonNull zb0 zb0Var, int i, @NonNull String str);

    @NonNull
    UploadStateAware c(@NonNull Message message, int i, int i2, @NonNull String str);

    @NonNull
    UploadStateAware d(@NonNull Message message, int i, @NonNull String str);
}
