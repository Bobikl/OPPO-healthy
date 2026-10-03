package com.google.mlkit.common.sdkinternal.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.mlkit.common.MlKitException;
import java.io.File;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@KeepForSdk
public interface RemoteModelFileMover {
    @NonNull
    @KeepForSdk
    File getModelFileDestination() throws MlKitException;

    @Nullable
    @KeepForSdk
    File moveAllFilesFromPrivateTempToPrivateDestination(@NonNull File file) throws MlKitException;
}
