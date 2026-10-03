package com.coui.appcompat.panel;

/* JADX INFO: loaded from: classes13.dex */
public interface COUIPanelPullUpListener {
    void onCancel();

    int onDragging(int i, int i2);

    void onDraggingPanel();

    void onOffsetChanged(float f);

    void onReleased(int i);

    void onReleasedDrag();
}
