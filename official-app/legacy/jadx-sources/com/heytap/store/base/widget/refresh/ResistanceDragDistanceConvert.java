package com.heytap.store.base.widget.refresh;

/* JADX INFO: loaded from: classes3.dex */
public class ResistanceDragDistanceConvert implements IDragDistanceConverter {
    private final float mMaxScrollDistance = 1920.0f;

    @Override // com.heytap.store.base.widget.refresh.IDragDistanceConverter
    public float convert(float f, float f2) {
        return 1920.0f - (7372800.0f / (f + 3840.0f));
    }
}
