package com.google.android.material.textfield;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
class CustomEndIconDelegate extends EndIconDelegate {
    public CustomEndIconDelegate(@NonNull EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        this.endLayout.setEndIconOnLongClickListener(null);
    }
}
