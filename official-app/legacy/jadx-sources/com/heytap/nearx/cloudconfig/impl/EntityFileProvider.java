package com.heytap.nearx.cloudconfig.impl;

import com.heytap.nearx.cloudconfig.api.EntityProvider;
import com.heytap.nearx.cloudconfig.bean.ConfigTrace;
import com.heytap.nearx.cloudconfig.bean.ConfigTraceKt;
import com.heytap.nearx.cloudconfig.bean.EntityQueryParams;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J \u0010\u000f\u001a\u00020\u000b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nJ \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/heytap/nearx/cloudconfig/impl/EntityFileProvider;", "Lcom/heytap/nearx/cloudconfig/api/EntityProvider;", "Ljava/io/File;", "configTrace", "Lcom/heytap/nearx/cloudconfig/bean/ConfigTrace;", "(Lcom/heytap/nearx/cloudconfig/bean/ConfigTrace;)V", "configFile", "configId", "", "fileListener", "Lkotlin/Function2;", "", "hasInit", "", "notifyFileChanged", "observeFileChanged", "onConfigChanged", "version", "", "configName", "queryEntities", "", "queryParams", "Lcom/heytap/nearx/cloudconfig/bean/EntityQueryParams;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final class EntityFileProvider implements EntityProvider<File> {
    private File configFile;
    private final String configId;
    private final ConfigTrace configTrace;
    private Function2<? super String, ? super File, Unit> fileListener;

    public EntityFileProvider(@NotNull ConfigTrace configTrace) {
        Intrinsics.checkParameterIsNotNull(configTrace, "configTrace");
        this.configTrace = configTrace;
        this.configId = configTrace.getConfigId();
        this.configFile = new File(configTrace.getConfigPath());
    }

    private final void notifyFileChanged() {
        Function2<? super String, ? super File, Unit> function2 = this.fileListener;
        if (function2 != null) {
            function2.invoke(this.configId, this.configFile);
        }
    }

    @Override // com.heytap.nearx.cloudconfig.api.EntityProvider
    public boolean hasInit() {
        return this.configFile.exists();
    }

    public final void observeFileChanged(@NotNull Function2<? super String, ? super File, Unit> fileListener) {
        Intrinsics.checkParameterIsNotNull(fileListener, "fileListener");
        if (!Intrinsics.areEqual(this.fileListener, fileListener)) {
            this.fileListener = fileListener;
            if (ConfigTraceKt.isExist(this.configTrace.getState()) || ConfigTraceKt.isFailed(this.configTrace.getState())) {
                notifyFileChanged();
            }
        }
    }

    @Override // com.heytap.nearx.cloudconfig.api.EntityProvider
    public void onConfigChanged(@NotNull String configId, int version, @NotNull String configName) {
        Intrinsics.checkParameterIsNotNull(configId, "configId");
        Intrinsics.checkParameterIsNotNull(configName, "configName");
        File file = new File(this.configTrace.getConfigPath());
        if (version < 0 && !file.exists() && Intrinsics.areEqual(this.configTrace.getConfigId(), configId)) {
            this.configFile = new File(this.configTrace.getConfigPath());
            notifyFileChanged();
        } else if (Intrinsics.areEqual(this.configTrace.getConfigId(), configId) && file.exists()) {
            this.configFile = file;
            notifyFileChanged();
        }
    }

    @Override // com.heytap.nearx.cloudconfig.api.EntityProvider
    @NotNull
    public List<File> queryEntities(@NotNull EntityQueryParams queryParams) {
        Intrinsics.checkParameterIsNotNull(queryParams, "queryParams");
        if (!Intrinsics.areEqual(this.configFile.getAbsolutePath(), this.configTrace.getConfigPath())) {
            this.configFile = new File(this.configTrace.getConfigPath());
        }
        return CollectionsKt__CollectionsJVMKt.listOf(this.configFile);
    }
}
