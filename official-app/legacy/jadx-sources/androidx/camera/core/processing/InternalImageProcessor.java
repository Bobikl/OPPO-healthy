package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ProcessingException;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class InternalImageProcessor {

    @NonNull
    private final Consumer<Throwable> mErrorListener;

    @NonNull
    private final Executor mExecutor;

    @NonNull
    private final ImageProcessor mImageProcessor;

    public InternalImageProcessor(@NonNull CameraEffect cameraEffect) {
        Preconditions.checkArgument(cameraEffect.getTargets() == 4);
        this.mExecutor = cameraEffect.getExecutor();
        ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        Objects.requireNonNull(imageProcessor);
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$safeProcess$0(ImageProcessor.Request request, CallbackToFutureAdapter.Completer completer) {
        try {
            completer.set(this.mImageProcessor.process(request));
        } catch (ProcessingException e2) {
            this.mErrorListener.accept(e2);
            completer.setException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$safeProcess$1(final ImageProcessor.Request request, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Runnable() { // from class: com.oplus.aiunit.vision.vea
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$safeProcess$0(request, completer);
            }
        });
        return "InternalImageProcessor#process " + request.hashCode();
    }

    @NonNull
    public ImageProcessor.Response safeProcess(@NonNull final ImageProcessor.Request request) throws ImageCaptureException {
        try {
            return (ImageProcessor.Response) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: com.oplus.aiunit.vision.wea
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return this.a.lambda$safeProcess$1(request, completer);
                }
            }).get();
        } catch (Exception e2) {
            e = e2;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
