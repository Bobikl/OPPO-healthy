package com.heytap.health.watchface.business.creation.category.video;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.heytap.health.watchface.business.creation.category.video.bean.VideoItem;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\b\u0010\f\u001a\u00020\bH\u0014R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/VideoSelectViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LiveData;", "", "Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoItem;", "w", "v", "u", "", "x", "videoItem", "y", "onCleared", "Lcom/heytap/health/watchface/business/creation/category/video/VideoRepository;", "i", "Lcom/heytap/health/watchface/business/creation/category/video/VideoRepository;", "mViewRepository", "j", "Lcom/heytap/health/watchface/business/creation/category/video/bean/VideoItem;", "mSelectedVideoItem", "Landroidx/lifecycle/MutableLiveData;", MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/MutableLiveData;", "mSelectedVideoItemLiveData", "<init>", "()V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class VideoSelectViewModel extends ViewModel {

    @NotNull
    public static final String TAG = "VideoSelectViewModel";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public VideoItem mSelectedVideoItem;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final VideoRepository mViewRepository = new VideoRepository();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<VideoItem> mSelectedVideoItemLiveData = new MutableLiveData<>();

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.mViewRepository.m();
        super.onCleared();
    }

    @Nullable
    /* JADX INFO: renamed from: u, reason: from getter */
    public final VideoItem getMSelectedVideoItem() {
        return this.mSelectedVideoItem;
    }

    @NotNull
    public final LiveData<VideoItem> v() {
        return this.mSelectedVideoItemLiveData;
    }

    @NotNull
    public final LiveData<List<VideoItem>> w() {
        return this.mViewRepository.l();
    }

    public final void x() {
        this.mViewRepository.n();
    }

    public final void y(@Nullable VideoItem videoItem) {
        this.mSelectedVideoItem = videoItem;
        this.mSelectedVideoItemLiveData.postValue(videoItem);
    }
}
