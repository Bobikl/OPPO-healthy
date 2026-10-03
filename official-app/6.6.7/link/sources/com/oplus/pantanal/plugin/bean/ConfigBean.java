package com.oplus.pantanal.plugin.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/oplus/pantanal/plugin/bean/ConfigBean;", "", "()V", "restartVersion", "", "getRestartVersion", "()Ljava/lang/Long;", "Ljava/lang/Long;", "version", "", "getVersion", "()I", "setVersion", "(I)V", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ConfigBean {

    @Nullable
    private final Long restartVersion;
    private int version;

    @Nullable
    public final Long getRestartVersion() {
        return this.restartVersion;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setVersion(int i) {
        this.version = i;
    }
}
