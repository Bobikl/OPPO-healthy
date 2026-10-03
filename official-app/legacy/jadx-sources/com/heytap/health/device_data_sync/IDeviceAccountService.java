package com.heytap.health.device_data_sync;

import android.content.Context;
import com.alibaba.android.arouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/heytap/health/device_data_sync/IDeviceAccountService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroid/content/Context;", "context", "", "A", "n", "oa", "Companion", "a", "device_data_sync_release"}, k = 1, mv = {1, 8, 0})
public interface IDeviceAccountService extends IProvider {

    @NotNull
    public static final String ACTION_GENERATE_TICKET = "action_device_account_generate_ticket";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String FLAG_WATCH_LOGIN_TICKET = "flag_watch_login_ticket";

    /* JADX INFO: renamed from: com.heytap.health.device_data_sync.IDeviceAccountService$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/heytap/health/device_data_sync/IDeviceAccountService$a;", "", "", "ACTION_GENERATE_TICKET", "Ljava/lang/String;", "FLAG_WATCH_LOGIN_TICKET", "<init>", "()V", "device_data_sync_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String ACTION_GENERATE_TICKET = "action_device_account_generate_ticket";

        @NotNull
        public static final String FLAG_WATCH_LOGIN_TICKET = "flag_watch_login_ticket";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void A(@NotNull Context context);

    void n(@NotNull Context context);

    void oa();
}
