package com.nearme.instant.xcard;

import android.content.Intent;
import android.graphics.Bitmap;
import com.nearme.instant.xcard.statitics.StatFieldConfig;
import org.hapjs.card.api.CardCallback;

/* JADX INFO: loaded from: classes5.dex */
public interface InstantCard {
    public static final int CARD_PAGE_STATE_CREATED = 1;
    public static final int CARD_PAGE_STATE_HIDE = 2;
    public static final int CARD_PAGE_STATE_NONE = 0;
    public static final int CARD_PAGE_STATE_SHOW = 3;
    public static final int SCROLL_STATE_FLING = 2;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_TOUCH_SCROLL = 1;

    Bitmap getCardViewSnapshot();

    void load(String str, boolean z);

    void onActivityResult(int i, int i2, Intent intent);

    @Deprecated
    void onDestroy();

    void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);

    void registerMessageCallback(CardCallback cardCallback);

    void replyMessage(int i, String str);

    void setCardBlurHandler(BlurInterface blurInterface);

    void setScrollState(int i);

    void setStatFieldConfig(StatFieldConfig statFieldConfig);

    void unregisterMessageCallback();
}
