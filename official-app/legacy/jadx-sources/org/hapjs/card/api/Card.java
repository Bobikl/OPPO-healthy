package org.hapjs.card.api;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.nearme.instant.xcard.IRenderListenerV1;
import com.nearme.instant.xcard.InstantCard;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface Card extends InstantCard {
    void changeVisibilityManually(boolean z);

    void destroy();

    void fold(boolean z);

    int getCardState();

    Object getCustomConfig(String str);

    String getUri();

    View getView();

    boolean isDestroyed();

    boolean isRefreshable();

    void load();

    void load(String str);

    void load(String str, String str2);

    void notifyEngine(Bundle bundle, @Nullable NotifyCallbackListener notifyCallbackListener);

    void onHide();

    void onLoadData();

    void onShow();

    void onSubscribe();

    void onUnsubscribe();

    void sendMessage(int i, String str);

    void setAutoDestroy(boolean z);

    void setErrorPlaceHolder(int i);

    void setErrorPlaceHolder(View view);

    void setExtras(Map<String, Object> map);

    void setLifecycleCallback(CardLifecycleCallback cardLifecycleCallback);

    void setLoadingPlaceHolder(int i);

    void setLoadingPlaceHolder(View view);

    void setMessageCallback(CardMessageCallback cardMessageCallback);

    void setPackageListener(PackageListener packageListener);

    void setRefreshable(boolean z);

    void setRenderListener(com.nearme.instant.xcard.IRenderListener iRenderListener);

    void setRenderListenerV1(IRenderListenerV1 iRenderListenerV1);

    void setVisible(boolean z);

    boolean supportLoadData();

    void updateViewAlpha(float f);
}
