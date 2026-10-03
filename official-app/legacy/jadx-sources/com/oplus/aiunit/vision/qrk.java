package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.oplus.smartenginehelper.ParserTag;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/qrk;", "", "Landroid/content/Context;", "context", "Landroid/net/Uri;", ParserTag.TAG_URI, "Landroid/graphics/Bitmap;", "a", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class qrk {

    @NotNull
    public static final qrk INSTANCE = new qrk();

    @RequiresApi(26)
    @Nullable
    public final Bitmap a(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.d("Utils", "getBitmapByFP client is null by uri:" + uri);
                return null;
            }
            ParcelFileDescriptor parcelFileDescriptorOpenFile = contentProviderClientAcquireUnstableContentProviderClient.openFile(uri, "r");
            Intrinsics.checkNotNull(parcelFileDescriptorOpenFile);
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFile.getFileDescriptor());
            BitmapFactory.Options options = new BitmapFactory.Options();
            Bitmap.Config config = Bitmap.Config.RGB_565;
            options.outConfig = config;
            options.inPreferredConfig = config;
            return BitmapFactory.decodeStream(fileInputStream, null, options);
        } catch (Exception e2) {
            Log.e("Utils", "getBitmapByFP error:" + e2.getMessage());
            return null;
        }
    }
}
