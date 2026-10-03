package com.heytap.health.operations.settings;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.oplus.aiunit.vision.oea;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/operations/settings/IPersonalInfoSyncService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", oea.CALLBACK, "Companion", "a", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface IPersonalInfoSyncService extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String SERVICE_PATH = "/settings/IPersonalInfoSyncService";

    /* JADX INFO: renamed from: com.heytap.health.operations.settings.IPersonalInfoSyncService$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/operations/settings/IPersonalInfoSyncService$a;", "", "", "SERVICE_PATH", "Ljava/lang/String;", "<init>", "()V", "operations_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String SERVICE_PATH = "/settings/IPersonalInfoSyncService";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void cb();
}
