package com.heytap.health.community.router;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.community.data.MessageCount;
import com.heytap.health.network.core.a;
import com.heytap.health.operations.router.providers.ICommunityService;
import com.heytap.health.operations.router.providers.INotifyService;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.state.Constants;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.pvc;
import com.oplus.aiunit.vision.qzc;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.u61;
import com.oplus.aiunit.vision.upk;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x0;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Route(path = "/community/CommunityService")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/heytap/health/community/router/CommunityService;", "Lcom/heytap/health/operations/router/providers/ICommunityService;", "Landroid/content/Context;", "context", "", "init", "", "count", "", "S6", "", "isAlwaysShow", "Landroidx/lifecycle/MutableLiveData;", "Q1", "R7", "i", "Landroidx/lifecycle/MutableLiveData;", "unreadCountLiveData", "j", "alwaysShowUnreadCount", MapSchema.FIELD_NAME_KEY, "Ljava/lang/String;", "KEY_UNREAD_COUNT", LogFieldKey.LEVEL_KEY, "NAME_COMMUNITY", LogFieldKey.MESSAGE_KEY, "Z", Constants.LOADING, "<init>", "()V", "Companion", "a", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CommunityService implements ICommunityService {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Long> unreadCountLiveData = new MutableLiveData<>(0L);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Long> alwaysShowUnreadCount = new MutableLiveData<>(0L);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final String KEY_UNREAD_COUNT = "key_unread_count";

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String NAME_COMMUNITY = "name_community";

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean loading;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/community/router/CommunityService$b", "Lcom/oplus/aiunit/vision/u61;", "Lcom/heytap/health/community/data/MessageCount;", "result", "", MapSchema.FIELD_NAME_ENTRY, "", "", "errMsg", "b", "community_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends u61<MessageCount> {
        public final /* synthetic */ boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f3659j;
        public final /* synthetic */ CommunityService k;

        public b(boolean z, boolean z2, CommunityService communityService) {
            this.i = z;
            this.f3659j = z2;
            this.k = communityService;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(@Nullable Throwable e2, @Nullable String errMsg) {
            a7b.n("CommunityService", "fetchUnreadCount: " + e2, e2);
            if (!this.i || this.f3659j) {
                this.k.unreadCountLiveData.setValue(0L);
            }
            this.k.alwaysShowUnreadCount.setValue(0L);
            v9g.x(this.k.NAME_COMMUNITY).T(this.k.KEY_UNREAD_COUNT, 0L);
            this.k.loading = false;
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(@Nullable MessageCount result) {
            a7b.f("CommunityService", "fetchUnreadCount onSuccess " + (result != null ? Long.valueOf(result.getTotalCount()) : null));
            long totalCount = result != null ? result.getTotalCount() : 0L;
            if (!this.i || this.f3659j) {
                this.k.unreadCountLiveData.setValue(Long.valueOf(totalCount));
            }
            this.k.alwaysShowUnreadCount.setValue(Long.valueOf(totalCount));
            v9g.x(this.k.NAME_COMMUNITY).T(this.k.KEY_UNREAD_COUNT, totalCount);
            this.k.loading = false;
        }
    }

    @Override // com.heytap.health.operations.router.providers.ICommunityService
    @NotNull
    public MutableLiveData<Long> Q1(boolean isAlwaysShow) {
        Object objNavigation = x0.d().b("/operation/NotifyService").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.operations.router.providers.INotifyService");
        boolean z = pvc.c(b78.b()) && ((INotifyService) objNavigation).x9();
        if (!z) {
            this.unreadCountLiveData.postValue(0L);
            if (!isAlwaysShow) {
                return this.unreadCountLiveData;
            }
        }
        long jA = v9g.x(this.NAME_COMMUNITY).A(this.KEY_UNREAD_COUNT);
        if (!isAlwaysShow && jA > 0) {
            this.unreadCountLiveData.postValue(Long.valueOf(jA));
        }
        if (this.loading) {
            return isAlwaysShow ? this.alwaysShowUnreadCount : this.unreadCountLiveData;
        }
        this.loading = true;
        ((upk) a.j(upk.class)).d().L0(su8.c()).n0(f30.c()).subscribe(new b(isAlwaysShow, z, this));
        return isAlwaysShow ? this.alwaysShowUnreadCount : this.unreadCountLiveData;
    }

    @Override // com.heytap.health.operations.router.providers.ICommunityService
    @NotNull
    public MutableLiveData<Long> R7() {
        return this.alwaysShowUnreadCount;
    }

    @Override // com.heytap.health.operations.router.providers.ICommunityService
    @NotNull
    public String S6(long count) {
        return qzc.INSTANCE.a(count);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
    }
}
