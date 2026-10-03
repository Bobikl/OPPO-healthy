package com.oplus.smartsdk;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface ISmartViewApi {
    default void endAnim(View view) {
    }

    default void getSmartView(Context context, SmartApiInfo smartApiInfo, InflaterCallback inflaterCallback) {
    }

    default List<Integer> getSupportedMorphSize(String str) {
        return Collections.emptyList();
    }

    default void getView(@NonNull Context context, @Nullable View view, @NonNull SmartApiInfo smartApiInfo, @Nullable GetViewCallback getViewCallback) {
    }

    default void interceptStartActivity(@NonNull InterceptStartActivityCallback interceptStartActivityCallback) {
    }

    default void interceptStartActivityCallback(@NonNull InterceptClickCallback interceptClickCallback) {
    }

    default void onInVisible(View view) {
    }

    default void onRelease(View view) {
    }

    default void onSizeChange(@NonNull View view, Bundle bundle) {
    }

    default void onVisible(View view) {
    }

    default void pauseAllVideo(View view) {
    }

    default void pauseVideo(View view, String str) {
    }

    default void pauseVideoInList(View view, String str, String str2, int i) {
    }

    default void playAllVideo(View view) {
    }

    default void playVideo(View view, String str) {
    }

    default void playVideoInList(View view, String str, String str2, int i) {
    }

    default void refreshUI(View view, byte[] bArr) {
    }

    default void registerEngineView(Context context, String str, String str2) {
    }

    default void registerErrorCallback(ErrorCallback errorCallback) {
    }

    default void registerUiCallback(@NonNull String str, @NonNull CardUICallback cardUICallback) {
    }

    default void releaseOldViewSource(View view) {
    }

    default void runAnim(View view) {
    }

    default void runAnimDelay(View view, long j2) {
    }

    default void seekVideoToTime(View view, String str, int i) {
    }

    default void sendCardData(@NonNull Context context, @NonNull String str, @Nullable View view, @NonNull SmartApiInfo smartApiInfo) {
    }

    default void setAllowCardRefreshable(boolean z, View view) {
    }

    default void setAlpha(View view, String str, float f) {
    }

    default void setBackground(View view, String str, String str2) {
    }

    default void setBindServiceToCPData(String str, String str2, String str3) {
    }

    default void setCanLog(boolean z) {
    }

    default void setEnabled(View view, String str, boolean z) {
    }

    default void setEngineCacheSize(int i) {
    }

    default void setImageSrc(View view, String str, String str2) {
    }

    default void setListIsPaginationLoad(View view, String str, boolean z) {
    }

    default void setListNextPageData(View view, String str, String str2) {
    }

    default void setText(View view, String str, String str2) {
    }

    default void setTextColor(View view, String str, int i) {
    }

    default void setTextColorString(View view, String str, String str2) {
    }

    default void setTextCompoundDrawable(View view, String str, String str2, String str3, String str4, String str5) {
    }

    default void setTextListItem(View view, String str, String str2, int i, String str3) {
    }

    default void setTextSize(View view, String str, int i) {
    }

    default void setUseCache(boolean z) {
    }

    default void setUseImageThread(boolean z) {
    }

    default void setVideoSpeed(View view, String str, float f) {
    }

    default void setVideoSrc(View view, String str, String str2) {
    }

    default void setVideoVolume(View view, String str, float f) {
    }

    default void setVisibility(View view, String str, int i) {
    }

    default void setVisibilityStr(View view, String str, String str2) {
    }

    default void unRegisterUiCallback(@NonNull String str) {
    }

    default void unsubscribe(String str) {
    }

    default void endAnim(View view, String str) {
    }

    default void refreshUI(View view, byte[] bArr, boolean z) {
    }

    default void runAnim(View view, String str) {
    }

    default void runAnim(View view, String str, long j2) {
    }
}
