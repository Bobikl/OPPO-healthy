package com.heytap.health.operations.router.providers;

import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/heytap/health/operations/router/providers/ICommunityService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "", "count", "", "S6", "", "isAlwaysShow", "Landroidx/lifecycle/MutableLiveData;", "Q1", "R7", "operations_release"}, k = 1, mv = {1, 8, 0})
public interface ICommunityService extends IProvider {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ MutableLiveData a(ICommunityService iCommunityService, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchUnreadCount");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return iCommunityService.Q1(z);
        }
    }

    @NotNull
    MutableLiveData<Long> Q1(boolean isAlwaysShow);

    @NotNull
    MutableLiveData<Long> R7();

    @NotNull
    String S6(long count);
}
