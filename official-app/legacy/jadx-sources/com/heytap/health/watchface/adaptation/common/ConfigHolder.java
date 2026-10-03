package com.heytap.health.watchface.adaptation.common;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.oplus.aiunit.vision.i11;
import com.oplus.aiunit.vision.nrl;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class ConfigHolder {
    public static final String CUSTOM_ALBUM = "Album/";
    public static final String DEFAULT_ALBUM_WF_CLASS_NAME = "com.heytap.wearable.watchface.impl.album.WatchFaceServiceImpl";
    public static final String DEFAULT_AOD_WF_CLASS_NAME = "com.heytap.wearable.watchface.aod";
    public static final String DEFAULT_CLASSIC_WF_CLASS_NAME = "com.heytap.wearable.watchface.classic";
    public static final String DEFAULT_OMOJI_WF_CLASS_NAME = "com.heytap.wearable.watchface.omoji";
    public static final String DEFAULT_OUTFIT_WF_CLASS_NAME = "com.heytap.wearable.watchface.impl.outfit.WatchFaceServiceImpl";
    public static final String DEFAULT_PACKAGE = "com.heytap.wearable.watchface";
    public static final float DEFAULT_RS_WATCH_EDIT_SCALE = 0.6696035f;
    public static final float DEFAULT_RS_WATCH_STYLE_SCALE = 0.8259912f;
    public static final String DEFAULT_VIDEO_WF_CLASS_NAME = "com.heytap.wearable.watchface.smallvideo";
    public static final float DEFAULT_WATCH_DENSITY = 2.0f;
    public static final int DEFAULT_WATCH_HEIGHT = 476;
    public static final int DEFAULT_WATCH_RADIUS = 74;
    public static final float DEFAULT_WATCH_SCALE_DENSITY = 2.0f;
    public static final int DEFAULT_WATCH_WIDTH = 402;
    public static final String HANDPAINTED_PACKAGE_NAME = "com.heytap.wearable.watchface.handpainted";
    public static final String MEMORY_ALBUM = "AlbumMemory/";
    public static final String WALLPAPER_UNIQUE_ID = "bf5a54a7510f8340cabcc03627747cb1";
    private String mAlbumWfVersion;
    private String mAodWfVersion;
    private final i11 mBaseDataManager;
    private String mClassicWfVersion;
    private String mHandPaintWfVersion;
    private boolean mIsAutoPlay;
    private String mOmojiWfVersion;
    private String mOutfitWfVersion;
    private String mVideoWfVersion;
    private String mWallpaperWfVersion;
    private String mAlbumWfUnique = "com.heytap.wearable.watchface/com.heytap.wearable.watchface.impl.album.WatchFaceServiceImpl";
    private String mOutfitWfUnique = "com.heytap.wearable.watchface/com.heytap.wearable.watchface.impl.outfit.WatchFaceServiceImpl";
    private String mHandPaintWfUnique = HANDPAINTED_PACKAGE_NAME;
    private String mWallpaperWfUnique = WALLPAPER_UNIQUE_ID;
    private String mAodWfUnique = DEFAULT_AOD_WF_CLASS_NAME;
    private String mClassicWfUnique = DEFAULT_CLASSIC_WF_CLASS_NAME;
    private String mOmojiWfUnique = DEFAULT_OMOJI_WF_CLASS_NAME;
    private String mVideoWfUnique = DEFAULT_VIDEO_WF_CLASS_NAME;
    private int mMaxCount = 6;
    private int mMaxHistoryCount = 20;
    private String mCurrentAlbum = "Album/";
    private int mTimeStyleColor = -1;
    private boolean mIsUninstalledGallery = false;
    private boolean mIsNewCreationInteractive = false;

    public ConfigHolder(i11 i11Var) {
        this.mBaseDataManager = i11Var;
    }

    public static boolean isCustomAlbum(String str) {
        return "Album/".equals(str);
    }

    public static boolean isMemoryAlbum(String str) {
        return MEMORY_ALBUM.equals(str);
    }

    public boolean checkSelectCount(String str) {
        List<BaseWatchFaceBean> listK = this.mBaseDataManager.k();
        if (listK.size() < this.mMaxCount) {
            return true;
        }
        Iterator<BaseWatchFaceBean> it = listK.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(str, it.next().getWfUnique())) {
                return true;
            }
        }
        return false;
    }

    public String getAlbumWfUnique() {
        return this.mAlbumWfUnique;
    }

    public String getAlbumWfVersion() {
        return this.mAlbumWfVersion;
    }

    public String getAodWfUnique() {
        return this.mAodWfUnique;
    }

    public String getAodWfVersion() {
        return this.mAodWfVersion;
    }

    public String getClassicWfUnique() {
        return this.mClassicWfUnique;
    }

    public String getClassicWfVersion() {
        return this.mClassicWfVersion;
    }

    public String getCurrentAlbum() {
        return this.mCurrentAlbum;
    }

    public String getHandPaintWfUnique() {
        return this.mHandPaintWfUnique;
    }

    public String getHandPaintWfVersion() {
        return this.mHandPaintWfVersion;
    }

    public int getMaxCount() {
        return this.mMaxCount;
    }

    public int getMaxHistoryCount() {
        return this.mMaxHistoryCount;
    }

    public String getOmojiWfUnique() {
        return this.mOmojiWfUnique;
    }

    public String getOmojiWfVersion() {
        return this.mOmojiWfVersion;
    }

    public String getOutfitWfUnique() {
        return this.mOutfitWfUnique;
    }

    public String getOutfitWfVersion() {
        return this.mOutfitWfVersion;
    }

    public int getTimeStyleColor() {
        if (this.mTimeStyleColor == 0) {
            this.mTimeStyleColor = -1;
        }
        return this.mTimeStyleColor;
    }

    public String getVideoWfUnique() {
        return this.mVideoWfUnique;
    }

    public String getVideoWfVersion() {
        return this.mVideoWfVersion;
    }

    public String getWallpaperWfUnique() {
        return this.mWallpaperWfUnique;
    }

    public String getWallpaperWfVersion() {
        return this.mWallpaperWfVersion;
    }

    public boolean isAutoPlay() {
        return this.mIsAutoPlay;
    }

    public boolean isNewCreationInteractive() {
        return this.mIsNewCreationInteractive;
    }

    public boolean isOverMaxWfLimit(String str) {
        if (this.mBaseDataManager.p()) {
            return !nrl.c(this.mBaseDataManager, str);
        }
        return false;
    }

    public boolean isUninstalledGallery() {
        return this.mIsUninstalledGallery;
    }

    public void setAlbumWfUnique(String str) {
        this.mAlbumWfUnique = str;
    }

    public void setAlbumWfVersion(String str) {
        this.mAlbumWfVersion = str;
    }

    public void setAodWfUnique(String str) {
        this.mAodWfUnique = str;
    }

    public void setAodWfVersion(String str) {
        this.mAodWfVersion = str;
    }

    public void setAutoPlay(boolean z) {
        this.mIsAutoPlay = z;
    }

    public void setClassicWfUnique(String str) {
        this.mClassicWfUnique = str;
    }

    public void setClassicWfVersion(String str) {
        this.mClassicWfVersion = str;
    }

    public void setCurrentAlbum(String str) {
        this.mCurrentAlbum = str;
    }

    public void setHandPaintWfUnique(String str) {
        this.mHandPaintWfUnique = str;
    }

    public void setHandPaintWfVersion(String str) {
        this.mHandPaintWfVersion = str;
    }

    public void setMaxCount(int i) {
        this.mMaxCount = i;
    }

    public void setMaxHistoryCount(int i) {
        this.mMaxHistoryCount = i;
    }

    public void setNewCreationInteractive(boolean z) {
        this.mIsNewCreationInteractive = z;
    }

    public void setOmojiWfUnique(String str) {
        this.mOmojiWfUnique = str;
    }

    public void setOmojiWfVersion(String str) {
        this.mOmojiWfVersion = str;
    }

    public void setOutfitWfUnique(String str) {
        this.mOutfitWfUnique = str;
    }

    public void setOutfitWfVersion(String str) {
        this.mOutfitWfVersion = str;
    }

    public void setTimeStyleColor(int i) {
        this.mTimeStyleColor = i;
    }

    public void setUninstalledGallery(boolean z) {
        this.mIsUninstalledGallery = z;
    }

    public void setVideoWfUnique(String str) {
        this.mVideoWfUnique = str;
    }

    public void setVideoWfVersion(String str) {
        this.mVideoWfVersion = str;
    }

    public void setWallpaperWfUnique(String str) {
        this.mWallpaperWfUnique = str;
    }

    public void setWallpaperWfVersion(String str) {
        this.mWallpaperWfVersion = str;
    }
}
