package com.heytap.store.business.personal.service;

import com.heytap.store.platform.htrouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH&J\f\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lcom/heytap/store/business/personal/service/IPersonalService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "addPrivacyPolicyEvent", "", "type", "", "version", "happenAt", "", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "getOwnFragment", "Ljava/lang/Class;", "isRecommendSwitchOpen", "", "preloadOwnData", "uploadPrivacyPolicyEvent", "personal-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IPersonalService extends IProvider {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void addPrivacyPolicyEvent$default(IPersonalService iPersonalService, String str, String str2, long j2, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPrivacyPolicyEvent");
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            iPersonalService.addPrivacyPolicyEvent(str, str2, j2, function1);
        }
    }

    void addPrivacyPolicyEvent(@NotNull String type, @NotNull String version, long happenAt, @Nullable Function1<? super String, Unit> callback);

    @NotNull
    Class<?> getOwnFragment();

    int isRecommendSwitchOpen();

    void preloadOwnData();

    void uploadPrivacyPolicyEvent();
}
