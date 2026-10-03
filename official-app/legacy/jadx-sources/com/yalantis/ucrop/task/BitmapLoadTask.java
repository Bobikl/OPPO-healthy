package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.yq8;
import com.oplus.aiunit.vision.ytf;
import com.yalantis.ucrop.callback.BitmapLoadCallback;
import com.yalantis.ucrop.model.ExifInfo;
import com.yalantis.ucrop.util.BitmapLoadUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import okhttp3.Request;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;

/* JADX INFO: loaded from: classes10.dex */
public class BitmapLoadTask {
    private static final Executor FALLBACK_BG_EXECUTOR = yq8.a();
    private static final String TAG = "BitmapWorkerTask";
    private final BitmapLoadCallback mBitmapLoadCallback;
    private final Context mContext;
    private Uri mInputUri;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private Uri mOutputUri;
    private final int mRequiredHeight;
    private final int mRequiredWidth;

    public BitmapLoadTask(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i, int i2, BitmapLoadCallback bitmapLoadCallback) {
        this.mContext = context;
        this.mInputUri = uri;
        this.mOutputUri = uri2;
        this.mRequiredWidth = i;
        this.mRequiredHeight = i2;
        this.mBitmapLoadCallback = bitmapLoadCallback;
    }

    private void copyFile(@NonNull Uri uri, @Nullable Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
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
    private BitmapWorkerResult doInBackground() {
        if (this.mInputUri == null) {
            return new BitmapWorkerResult(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            processInputUri();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.mContext.getContentResolver().openFileDescriptor(this.mInputUri, "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
            } catch (IOException e2) {
                a7b.g(TAG, "doInBackground ", e2);
            }
            options.inSampleSize = BitmapLoadUtils.calculateInSampleSize(options, this.mRequiredWidth, this.mRequiredHeight);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmapDecodeStream = null;
            while (!z) {
                try {
                    InputStream inputStreamOpenInputStream = this.mContext.getContentResolver().openInputStream(this.mInputUri);
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        if (options.outWidth == -1 || options.outHeight == -1) {
                            BitmapWorkerResult bitmapWorkerResult = new BitmapWorkerResult(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.mInputUri + "]"));
                            BitmapLoadUtils.close(inputStreamOpenInputStream);
                            return bitmapWorkerResult;
                        }
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        z = true;
                    } catch (Throwable th) {
                        BitmapLoadUtils.close(inputStreamOpenInputStream);
                        throw th;
                    }
                } catch (IOException e3) {
                    a7b.c(TAG, "doInBackground: ImageDecoder.createSource: ", e3);
                    return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]", e3));
                } catch (OutOfMemoryError e4) {
                    a7b.c(TAG, "doInBackground: BitmapFactory.decodeFileDescriptor: ", e4);
                    options.inSampleSize *= 2;
                }
            }
            if (bitmapDecodeStream == null) {
                return new BitmapWorkerResult(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.mInputUri + "]"));
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
            return !matrix.isIdentity() ? new BitmapWorkerResult(BitmapLoadUtils.transformBitmap(bitmapDecodeStream, matrix), exifInfo) : new BitmapWorkerResult(bitmapDecodeStream, exifInfo);
        } catch (IOException | NullPointerException e5) {
            return new BitmapWorkerResult(e5);
        }
    }

    private void downloadFile(@NonNull Uri uri, @Nullable Uri uri2) throws Throwable {
        Closeable closeable;
        ytf ytfVar;
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
                    BitmapLoadUtils.close(ytfVarExecute.getBody());
                    efdVar.getDispatcher().a();
                    this.mInputUri = this.mOutputUri;
                } catch (Throwable th) {
                    th = th;
                    ytfVar = ytfVarExecute;
                    closeable = null;
                    bufferedSource = f10248j;
                    BitmapLoadUtils.close(bufferedSource);
                    BitmapLoadUtils.close(closeable);
                    if (ytfVar != null) {
                        BitmapLoadUtils.close(ytfVar);
                        BitmapLoadUtils.close(ytfVar.getBody());
                    }
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
    public void lambda$runWorker$1(@NonNull BitmapWorkerResult bitmapWorkerResult) {
        Exception exc = bitmapWorkerResult.mBitmapWorkerException;
        if (exc != null) {
            this.mBitmapLoadCallback.onFailure(exc);
            return;
        }
        BitmapLoadCallback bitmapLoadCallback = this.mBitmapLoadCallback;
        Bitmap bitmap = bitmapWorkerResult.mBitmapResult;
        ExifInfo exifInfo = bitmapWorkerResult.mExifInfo;
        String path = this.mInputUri.getPath();
        Uri uri = this.mOutputUri;
        bitmapLoadCallback.onBitmapLoaded(bitmap, exifInfo, path, uri == null ? null : uri.getPath());
    }

    private void processInputUri() throws IOException, NullPointerException {
        String scheme = this.mInputUri.getScheme();
        StringBuilder sb = new StringBuilder();
        sb.append("Uri scheme: ");
        sb.append(scheme);
        if ("http".equals(scheme) || Const.Scheme.SCHEME_HTTPS.equals(scheme)) {
            try {
                downloadFile(this.mInputUri, this.mOutputUri);
                return;
            } catch (IOException | NullPointerException e2) {
                a7b.c(TAG, "Downloading failed", e2);
                throw e2;
            }
        }
        if ("content".equals(scheme)) {
            try {
                copyFile(this.mInputUri, this.mOutputUri);
                return;
            } catch (IOException | NullPointerException e3) {
                a7b.c(TAG, "Copying failed", e3);
                throw e3;
            }
        }
        if (Const.Scheme.SCHEME_FILE.equals(scheme)) {
            return;
        }
        a7b.b(TAG, "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: runInBackgroundSafely, reason: merged with bridge method [inline-methods] */
    public void lambda$executeOnExecutor$0() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            FALLBACK_BG_EXECUTOR.execute(new Runnable() { // from class: com.oplus.aiunit.vision.hf1
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
        final BitmapWorkerResult bitmapWorkerResultDoInBackground = doInBackground();
        this.mMainHandler.post(new Runnable() { // from class: com.oplus.aiunit.vision.jf1
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$runWorker$1(bitmapWorkerResultDoInBackground);
            }
        });
    }

    public BitmapLoadTask executeOnExecutor(@NonNull Executor executor) {
        executor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.if1
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$executeOnExecutor$0();
            }
        });
        return this;
    }

    public static class BitmapWorkerResult {
        Bitmap mBitmapResult;
        Exception mBitmapWorkerException;
        ExifInfo mExifInfo;

        public BitmapWorkerResult(@NonNull Bitmap bitmap, @NonNull ExifInfo exifInfo) {
            this.mBitmapResult = bitmap;
            this.mExifInfo = exifInfo;
        }

        public BitmapWorkerResult(@NonNull Exception exc) {
            this.mBitmapWorkerException = exc;
        }
    }
}
