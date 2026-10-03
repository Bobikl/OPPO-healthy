package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RemoteForegroundUpdater implements ForegroundUpdater {
    @Override // androidx.work.ForegroundUpdater
    @NonNull
    public ListenableFuture<Void> setForegroundAsync(@NonNull Context context, @NonNull UUID uuid, @NonNull ForegroundInfo foregroundInfo) {
        return RemoteWorkManager.getInstance(context).setForegroundAsync(uuid.toString(), foregroundInfo);
    }
}
