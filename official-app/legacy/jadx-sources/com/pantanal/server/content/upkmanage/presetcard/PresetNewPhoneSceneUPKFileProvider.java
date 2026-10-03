package com.pantanal.server.content.upkmanage.presetcard;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.core.content.FileProvider;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/pantanal/server/content/upkmanage/presetcard/PresetNewPhoneSceneUPKFileProvider;", "Landroidx/core/content/FileProvider;", "()V", "onCreate", "", "openFile", "Landroid/os/ParcelFileDescriptor;", ParserTag.TAG_URI, "Landroid/net/Uri;", "mode", "", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PresetNewPhoneSceneUPKFileProvider extends FileProvider {
    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public boolean onCreate() {
        return super.onCreate();
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    @Nullable
    public ParcelFileDescriptor openFile(@NotNull Uri uri, @NotNull String mode) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return super.openFile(uri, mode);
    }
}
