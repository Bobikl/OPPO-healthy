package com.heytap.nearx.uikit.widget;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

/* JADX INFO: loaded from: classes18.dex */
public abstract class NearFragmentStatePagerAdapter extends FragmentStatePagerAdapter {
    public NearFragmentStatePagerAdapter(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public int getPageIcon(int i) {
        return 0;
    }
}
