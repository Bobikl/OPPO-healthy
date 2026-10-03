package com.oplus.aiunit.vision;

import android.content.Context;
import com.health.database.depend.IUploadWork;
import com.health.database.depend.work.UploadWorkImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/wpk;", "Lcom/oplus/aiunit/vision/in9;", "Lcom/health/database/depend/IUploadWork;", "d", "Landroid/content/Context;", "context", "", "c", "b", "Lcom/health/database/depend/work/UploadWorkImpl;", "i", "Lcom/health/database/depend/work/UploadWorkImpl;", "mWorker", "<init>", "()V", "depend_release"}, k = 1, mv = {1, 8, 0})
public final class wpk implements in9<IUploadWork> {
    public UploadWorkImpl i;

    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = new UploadWorkImpl();
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public IUploadWork getService() {
        UploadWorkImpl uploadWorkImpl = this.i;
        if (uploadWorkImpl != null) {
            return uploadWorkImpl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mWorker");
        return null;
    }
}
