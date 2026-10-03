package com.heytap.wearable.emergency.api.emergency;

import com.alibaba.android.arouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/heytap/wearable/emergency/api/emergency/IEmergency;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "a6", "r7", "Companion", "a", "emergency_release"}, k = 1, mv = {1, 8, 0})
public interface IEmergency extends IProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @NotNull
    public static final String ROUTER_PATH = "/emergency_impl/emergency";

    /* JADX INFO: renamed from: com.heytap.wearable.emergency.api.emergency.IEmergency$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/heytap/wearable/emergency/api/emergency/IEmergency$a;", "", "", "ROUTER_PATH", "Ljava/lang/String;", "<init>", "()V", "emergency_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @NotNull
        public static final String ROUTER_PATH = "/emergency_impl/emergency";
        public static final /* synthetic */ Companion a = new Companion();
    }

    void a6();

    void r7();
}
