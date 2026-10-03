package com.heytap.okhttp.extension.retry;

import com.heytap.nearx.cloudconfig.CloudConfigCtrl;
import com.oplus.aiunit.vision.awf;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/heytap/okhttp/extension/retry/RetryLogic;", "", "Lcom/heytap/nearx/cloudconfig/CloudConfigCtrl;", "cloudConfigCtrl", "", "c", "", "host", "", "b", "", "Lcom/heytap/okhttp/extension/retry/RetryEntity;", "a", "Ljava/util/List;", "list", "", "Z", "hasInit", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class RetryLogic {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public List<RetryEntity> list;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile boolean hasInit;

    public final int b(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        List<RetryEntity> list = this.list;
        if (list != null) {
            for (RetryEntity retryEntity : list) {
                if (Intrinsics.areEqual(retryEntity.getRetryUrl(), host)) {
                    try {
                        int i = Integer.parseInt(retryEntity.getRetryCount());
                        if (i < 0) {
                            return 0;
                        }
                        if (i > 2) {
                            return 2;
                        }
                        return i;
                    } catch (Exception unused) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public final void c(@NotNull CloudConfigCtrl cloudConfigCtrl) {
        Intrinsics.checkNotNullParameter(cloudConfigCtrl, "cloudConfigCtrl");
        if (this.hasInit) {
            return;
        }
        synchronized (this) {
            if (this.hasInit) {
                return;
            }
            this.hasInit = true;
            Unit unit = Unit.INSTANCE;
            ((awf) cloudConfigCtrl.create(awf.class)).a().subscribe(new Function1<List<? extends RetryEntity>, Unit>() { // from class: com.heytap.okhttp.extension.retry.RetryLogic$setCloudConfigCtrl$2
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends RetryEntity> list) {
                    invoke2((List<RetryEntity>) list);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull List<RetryEntity> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.list = it;
                }
            });
        }
    }
}
