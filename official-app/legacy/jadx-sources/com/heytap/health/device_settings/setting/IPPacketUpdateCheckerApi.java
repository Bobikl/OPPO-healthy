package com.heytap.health.device_settings.setting;

import com.alibaba.android.arouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ,\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¨\u0006\f"}, d2 = {"Lcom/heytap/health/device_settings/setting/IPPacketUpdateCheckerApi;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "mac", "model", "Lkotlin/Function1;", "", "", "block", "q1", "Companion", "a", "device_settings_release"}, k = 1, mv = {1, 8, 0})
public interface IPPacketUpdateCheckerApi extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String SERVICE_IP_PACKET = "/device_settings/IPPacketUpdateCheckerImpl";

    /* JADX INFO: renamed from: com.heytap.health.device_settings.setting.IPPacketUpdateCheckerApi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/device_settings/setting/IPPacketUpdateCheckerApi$a;", "", "", "SERVICE_IP_PACKET", "Ljava/lang/String;", "<init>", "()V", "device_settings_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String SERVICE_IP_PACKET = "/device_settings/IPPacketUpdateCheckerImpl";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void q1(@NotNull String mac, @NotNull String model, @NotNull Function1<? super Boolean, Unit> block);
}
