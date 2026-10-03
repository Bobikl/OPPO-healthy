package com.heytap.nearx.uikit.widget.panel;

/* JADX INFO: loaded from: classes18.dex */
public interface NearPanelPullUpListener {
    void onCancel();

    int onDragging(int i, int i2);

    void onDraggingPanel();

    void onOffsetChanged(float f);

    void onReleased(int i);

    void onReleasedDrag();
}
