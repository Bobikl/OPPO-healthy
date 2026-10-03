package com.heytap.health.watchface.business.creation.category.video;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.provider.MediaStore;
import androidx.lifecycle.MutableLiveData;
import com.heytap.databaseengine.model.UserGoalInfo;
import com.heytap.health.base.permission.wxbpermission.PermissionRequestDialog;
import com.heytap.health.watchface.business.creation.category.video.bean.VideoItem;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.rb8;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.EmptyCoroutineContext;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007*\u0003\u0007\u0016\u001a\u0018\u0000 52\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b3\u00104J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000eR\u0014\u0010$\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u000eR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R#\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0/0.8\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b,\u00101¨\u00066"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/VideoRepository;", "", "", "n", LogFieldKey.MESSAGE_KEY, LogFieldKey.PROCESS_NAME_KEY, "o", "com/heytap/health/watchface/business/creation/category/video/VideoRepository$b", "a", "Lcom/heytap/health/watchface/business/creation/category/video/VideoRepository$b;", "ioScope", "", "", "b", "[Ljava/lang/String;", "mVideoProjection", "c", "mGifProjection", "Landroid/content/ContentResolver;", "d", "Landroid/content/ContentResolver;", "mResolver", "com/heytap/health/watchface/business/creation/category/video/VideoRepository$d", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/watchface/business/creation/category/video/VideoRepository$d;", "mVideoContentObserver", "com/heytap/health/watchface/business/creation/category/video/VideoRepository$c", "f", "Lcom/heytap/health/watchface/business/creation/category/video/VideoRepository$c;", "mGifContentObserver", b2n.f, "Ljava/lang/String;", "mVideoSelection", b2n.g, "mVideoSelectionArgs", "i", "mGifSelection", "j", "mGifSelectionArgs", "", "Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoItem;", MapSchema.FIELD_NAME_KEY, "Ljava/util/List;", "mVideoList", LogFieldKey.LEVEL_KEY, "mGifList", "Landroidx/lifecycle/MutableLiveData;", "", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "mVideoListLiveData", "<init>", "()V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class VideoRepository {

    @NotNull
    public static final String MIME_TYPE_GIF = "image/gif";

    @NotNull
    public static final String TAG = "VideoRepository";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final b ioScope = new b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String[] mVideoProjection = {"_id", Fields.HEIGHT_FIELD, Fields.WIDTH_FIELD, "mime_type", "_size", "date_added"};

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] mGifProjection = {"_id", Fields.HEIGHT_FIELD, Fields.WIDTH_FIELD, "mime_type", "_size", "date_added"};

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ContentResolver mResolver;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final d mVideoContentObserver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final c mGifContentObserver;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final String mVideoSelection;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final String[] mVideoSelectionArgs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String mGifSelection;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] mGifSelectionArgs;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<VideoItem> mVideoList;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<VideoItem> mGifList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<VideoItem>> mVideoListLiveData;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/heytap/health/watchface/business/creation/category/video/VideoRepository$b", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements CoroutineScope {
        @Override // kotlinx.coroutines.CoroutineScope
        @NotNull
        public CoroutineContext getCoroutineContext() {
            return EmptyCoroutineContext.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watchface/business/creation/category/video/VideoRepository$c", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends ContentObserver {
        public c() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            VideoRepository.this.o();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/watchface/business/creation/category/video/VideoRepository$d", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends ContentObserver {
        public d() {
            super(null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            VideoRepository.this.p();
        }
    }

    public VideoRepository() {
        ContentResolver contentResolver = b78.a().getContentResolver();
        Intrinsics.checkNotNullExpressionValue(contentResolver, "getAppContext().contentResolver");
        this.mResolver = contentResolver;
        d dVar = new d();
        this.mVideoContentObserver = dVar;
        c cVar = new c();
        this.mGifContentObserver = cVar;
        this.mVideoSelection = "duration <= ? and _data like ?";
        this.mVideoSelectionArgs = new String[]{UserGoalInfo.CONSUMPTION_GOAL_DEFAULT, "%.mp4"};
        this.mGifSelection = "mime_type = ?";
        this.mGifSelectionArgs = new String[]{MIME_TYPE_GIF};
        this.mVideoList = new ArrayList();
        this.mGifList = new ArrayList();
        this.mVideoListLiveData = new MutableLiveData<>();
        contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, dVar);
        contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, cVar);
    }

    @NotNull
    public final MutableLiveData<List<VideoItem>> l() {
        return this.mVideoListLiveData;
    }

    public final void m() {
        this.mResolver.unregisterContentObserver(this.mVideoContentObserver);
        this.mResolver.unregisterContentObserver(this.mGifContentObserver);
    }

    public final void n() {
        p();
        o();
    }

    public final void o() {
        if (PermissionRequestDialog.D(6, rb8.COMPAT_READ_MEDIA_IMAGES[0])) {
            BuildersKt__Builders_commonKt.launch$default(this.ioScope, wq8.INSTANCE.e(), null, new VideoRepository$scanGifList$1(this, null), 2, null);
        } else {
            ltl.i(TAG, "[scanGifList]--> no storage permission, return");
        }
    }

    public final void p() {
        if (PermissionRequestDialog.D(6, rb8.COMPAT_READ_MEDIA_VIDEO[0])) {
            BuildersKt__Builders_commonKt.launch$default(this.ioScope, wq8.INSTANCE.e(), null, new VideoRepository$scanVideoList$1(this, null), 2, null);
        } else {
            ltl.i(TAG, "[scanVideoList]--> no storage permission, return");
        }
    }
}
