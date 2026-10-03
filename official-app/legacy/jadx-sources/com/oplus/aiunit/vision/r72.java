package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B'\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\t\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/r72;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "c", "()Ljava/util/concurrent/Executor;", "mainThreadExecutor", "b", "backgroundThreadExecutor", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "diffCallback", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public final class r72<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Executor mainThreadExecutor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Executor backgroundThreadExecutor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DiffUtil.ItemCallback<T> diffCallback;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0010*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0001\u0004B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/r72$a;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/oplus/aiunit/vision/r72;", "a", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "mDiffCallback", "Ljava/util/concurrent/Executor;", "b", "Ljava/util/concurrent/Executor;", "mMainThreadExecutor", "c", "mBackgroundThreadExecutor", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "Companion", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> {

        @NotNull
        public static final Object d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public static Executor f16103e;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final DiffUtil.ItemCallback<T> mDiffCallback;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Executor mMainThreadExecutor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Executor mBackgroundThreadExecutor;

        public a(@NotNull DiffUtil.ItemCallback<T> mDiffCallback) {
            Intrinsics.checkNotNullParameter(mDiffCallback, "mDiffCallback");
            this.mDiffCallback = mDiffCallback;
        }

        @NotNull
        public final r72<T> a() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (d) {
                    if (f16103e == null) {
                        f16103e = Executors.newFixedThreadPool(2);
                    }
                    Unit unit = Unit.INSTANCE;
                }
                this.mBackgroundThreadExecutor = f16103e;
            }
            Executor executor = this.mMainThreadExecutor;
            Executor executor2 = this.mBackgroundThreadExecutor;
            Intrinsics.checkNotNull(executor2);
            return new r72<>(executor, executor2, this.mDiffCallback);
        }
    }

    public r72(@Nullable Executor executor, @NotNull Executor backgroundThreadExecutor, @NotNull DiffUtil.ItemCallback<T> diffCallback) {
        Intrinsics.checkNotNullParameter(backgroundThreadExecutor, "backgroundThreadExecutor");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        this.mainThreadExecutor = executor;
        this.backgroundThreadExecutor = backgroundThreadExecutor;
        this.diffCallback = diffCallback;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Executor getBackgroundThreadExecutor() {
        return this.backgroundThreadExecutor;
    }

    @NotNull
    public final DiffUtil.ItemCallback<T> b() {
        return this.diffCallback;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Executor getMainThreadExecutor() {
        return this.mainThreadExecutor;
    }
}
