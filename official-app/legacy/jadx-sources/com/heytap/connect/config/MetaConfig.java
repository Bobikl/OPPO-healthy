package com.heytap.connect.config;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.wka;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/heytap/connect/config/MetaConfig;", "", "Lcom/heytap/connect/config/MetaDevice;", "device", "Lcom/heytap/connect/config/MetaDevice;", "getDevice", "()Lcom/heytap/connect/config/MetaDevice;", "setDevice", "(Lcom/heytap/connect/config/MetaDevice;)V", "Lcom/heytap/connect/config/MetaApplication;", "application", "Lcom/heytap/connect/config/MetaApplication;", "getApplication", "()Lcom/heytap/connect/config/MetaApplication;", "setApplication", "(Lcom/heytap/connect/config/MetaApplication;)V", "Lcom/heytap/connect/config/MetaRegister;", "register", "Lcom/heytap/connect/config/MetaRegister;", "getRegister", "()Lcom/heytap/connect/config/MetaRegister;", "setRegister", "(Lcom/heytap/connect/config/MetaRegister;)V", "Lcom/heytap/connect/config/MetaUser;", "user", "Lcom/heytap/connect/config/MetaUser;", "getUser", "()Lcom/heytap/connect/config/MetaUser;", "setUser", "(Lcom/heytap/connect/config/MetaUser;)V", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class MetaConfig {

    @Nullable
    private MetaApplication application;

    @Nullable
    private MetaDevice device;

    @wka
    @Nullable
    private MetaRegister register;

    @Nullable
    private MetaUser user;

    @Nullable
    public final MetaApplication getApplication() {
        return this.application;
    }

    @Nullable
    public final MetaDevice getDevice() {
        return this.device;
    }

    @Nullable
    public final MetaRegister getRegister() {
        return this.register;
    }

    @Nullable
    public final MetaUser getUser() {
        return this.user;
    }

    public final void setApplication(@Nullable MetaApplication metaApplication) {
        this.application = metaApplication;
    }

    public final void setDevice(@Nullable MetaDevice metaDevice) {
        this.device = metaDevice;
    }

    public final void setRegister(@Nullable MetaRegister metaRegister) {
        this.register = metaRegister;
    }

    public final void setUser(@Nullable MetaUser metaUser) {
        this.user = metaUser;
    }
}
