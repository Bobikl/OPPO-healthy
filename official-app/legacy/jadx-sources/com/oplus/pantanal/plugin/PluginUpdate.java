package com.oplus.pantanal.plugin;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/oplus/pantanal/plugin/PluginUpdate;", "", "()V", "PLUGIN_NEED_RESTART", "", "PLUGIN_NEED_UPDATE", "PLUGIN_NOT_NEED_UPDATE", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PluginUpdate {

    @NotNull
    public static final PluginUpdate INSTANCE = new PluginUpdate();
    public static final int PLUGIN_NEED_RESTART = 2;
    public static final int PLUGIN_NEED_UPDATE = 1;
    public static final int PLUGIN_NOT_NEED_UPDATE = 0;

    private PluginUpdate() {
    }
}
