package com.heytap.health.bandface.widget.ucrop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.kw0;
import com.oplus.aiunit.vision.yq8;
import com.oplus.aiunit.vision.ytf;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import okhttp3.Request;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class MinBitmapLoadTask {
    private static final Executor FALLBACK_BG_EXECUTOR = yq8.a();
    private static final String TAG = "BitmapWorkerTask";
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final Context mContext;
    private Uri mInputUri;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    public MinBitmapLoadTask(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i, int i2, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = context;
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i;
        this.mRequiredHeight = i2;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    private void copyFile(@NonNull Uri uri, @Nullable Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        kw0.a(TAG, "copyFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
        FileOutputStream fileOutputStream = null;
        try {
            inputStreamOpenInputStream = this.mContext.getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new NullPointerException("InputStream for given input Uri is null");
                    }
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i <= 0) {
                            BitmapLoadUtils.close(fileOutputStream2);
                            BitmapLoadUtils.close(inputStreamOpenInputStream);
                            this.mInputUri = this.mOutputUri;
                            return;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    BitmapLoadUtils.close(fileOutputStream);
                    BitmapLoadUtils.close(inputStreamOpenInputStream);
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    @NonNull
    private a doInBackground() {
        if (this.mInputUri == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            processInputUri();
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.mContext.getContentResolver().openFileDescriptor(this.mInputUri, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    return new a(new NullPointerException("ParcelFileDescriptor was null for given Uri: [" + this.mInputUri + "]"));
                }
                FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                Rect rect = null;
                BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.mInputUri + "]"));
                }
                options.inSampleSize = BitmapLoadUtils.calculateInSampleSize(options, this.mRequiredWidth, this.mRequiredHeight);
                options.inJustDecodeBounds = false;
                boolean z = false;
                Bitmap bitmapDecodeFileDescriptor = null;
                while (!z) {
                    try {
                        bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, rect, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            a aVar = new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.mInputUri + "]"));
                            BitmapLoadUtils.close(parcelFileDescriptorOpenFileDescriptor);
                            return aVar;
                        }
                        try {
                            BitmapLoadUtils.close(parcelFileDescriptorOpenFileDescriptor);
                            z = true;
                        } catch (Exception e2) {
                            kw0.b(TAG, "doInBackground: ImageDecoder.createSource: " + e2);
                            return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]", e2));
                        } catch (OutOfMemoryError e3) {
                            kw0.b(TAG, "doInBackground: BitmapFactory.decodeFileDescriptor: " + e3);
                            options.inSampleSize = options.inSampleSize * 2;
                            rect = null;
                        }
                    } catch (Throwable th) {
                        BitmapLoadUtils.close(parcelFileDescriptorOpenFileDescriptor);
                        throw th;
                    }
                }
                if (bitmapDecodeFileDescriptor == null) {
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]"));
                }
                int exifOrientation = BitmapLoadUtils.getExifOrientation(this.mContext, this.mInputUri);
                int iExifToDegrees = BitmapLoadUtils.exifToDegrees(exifOrientation);
                int iExifToTranslation = BitmapLoadUtils.exifToTranslation(exifOrientation);
                ExifInfo exifInfo = new ExifInfo(exifOrientation, iExifToDegrees, iExifToTranslation);
                Matrix matrix = new Matrix();
                if (iExifToDegrees != 0) {
                    matrix.preRotate(iExifToDegrees);
                }
                if (iExifToTranslation != 1) {
                    matrix.postScale(iExifToTranslation, 1.0f);
                }
                return !matrix.isIdentity() ? new a(BitmapLoadUtils.transformBitmap(bitmapDecodeFileDescriptor, matrix), exifInfo) : new a(bitmapDecodeFileDescriptor, exifInfo);
            } catch (FileNotFoundException e4) {
                return new a(e4);
            }
        } catch (IOException | NullPointerException e5) {
            return new a(e5);
        }
    }

    private void downloadFile(@NonNull Uri uri, @Nullable Uri uri2) throws Throwable {
        Closeable closeable;
        ytf ytfVar;
        kw0.a(TAG, "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        efd efdVar = new efd();
        BufferedSource bufferedSource = null;
        try {
            ytf ytfVarExecute = efdVar.a(new Request.Builder().url(uri.toString()).build()).execute();
            try {
                BufferedSource f10248j = ytfVarExecute.getBody().getF10248j();
                try {
                    OutputStream outputStreamOpenOutputStream = this.mContext.getContentResolver().openOutputStream(uri2);
                    if (outputStreamOpenOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    Sink sink = Okio.sink(outputStreamOpenOutputStream);
                    f10248j.readAll(sink);
                    BitmapLoadUtils.close(f10248j);
                    BitmapLoadUtils.close(sink);
                    BitmapLoadUtils.close(ytfVarExecute);
                    efdVar.getDispatcher().a();
                    this.mInputUri = this.mOutputUri;
                } catch (Throwable th) {
                    th = th;
                    ytfVar = ytfVarExecute;
                    closeable = null;
                    bufferedSource = f10248j;
                    BitmapLoadUtils.close(bufferedSource);
                    BitmapLoadUtils.close(closeable);
                    BitmapLoadUtils.close(ytfVar);
                    efdVar.getDispatcher().a();
                    this.mInputUri = this.mOutputUri;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                ytfVar = ytfVarExecute;
                closeable = null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            ytfVar = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPostExecute, reason: merged with bridge method [inline-methods] */
    public void lambda$runWorker$1(@NonNull a aVar) {
        Exception exc = aVar.f3154c;
        if (exc != null) {
            this.mBitmapLoadCallback.onFailure(exc);
            return;
        }
        BitmapLoadCallback bitmapLoadCallback = this.mBitmapLoadCallback;
        Bitmap bitmap = aVar.a;
        ExifInfo exifInfo = aVar.b;
        String path = this.mInputUri.getPath();
        Uri uri = this.mOutputUri;
        bitmapLoadCallback.onBitmapLoaded(bitmap, exifInfo, path, uri == null ? null : uri.getPath());
    }

    private void processInputUri() throws IOException, NullPointerException {
        String scheme = this.mInputUri.getScheme();
        kw0.a(TAG, "Uri scheme: " + scheme);
        if ("http".equals(scheme) || Const.Scheme.SCHEME_HTTPS.equals(scheme)) {
            try {
                downloadFile(this.mInputUri, this.mOutputUri);
                return;
            } catch (IOException | NullPointerException e2) {
                kw0.b(TAG, "Downloading failed" + e2);
                throw e2;
            }
        }
        if ("content".equals(scheme)) {
            try {
                copyFile(this.mInputUri, this.mOutputUri);
                return;
            } catch (IOException | NullPointerException e3) {
                kw0.b(TAG, "Copying failed" + e3);
                throw e3;
            }
        }
        if (Const.Scheme.SCHEME_FILE.equals(scheme)) {
            return;
        }
        kw0.b(TAG, "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runInBackgroundSafely, reason: merged with bridge method [inline-methods] */
    public void lambda$executeOnExecutor$0() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            FALLBACK_BG_EXECUTOR.execute(new Runnable() { // from class: com.oplus.aiunit.vision.d0c
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.runWorker();
                }
            });
        } else {
            runWorker();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runWorker() {
        final a aVarDoInBackground = doInBackground();
        this.mMainHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.e0c
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$runWorker$1(aVarDoInBackground);
            }
        });
    }

    public MinBitmapLoadTask executeOnExecutor(@NonNull Executor executor) {
        executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.c0c
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$executeOnExecutor$0();
            }
        });
        return this;
    }

    public static class a {
        public Bitmap a;
        public ExifInfo b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Exception f3154c;

        public a(@NonNull Bitmap bitmap, @NonNull ExifInfo exifInfo) {
            this.a = bitmap;
            this.b = exifInfo;
        }

        public a(@NonNull Exception exc) {
            this.f3154c = exc;
        }
    }
}
