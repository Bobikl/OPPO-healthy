package com.oplus.smartsdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class InflaterFactory implements LayoutInflater.Factory2 {
    private LayoutInflater.Factory mBaseFactory;
    private ClassLoader mClassLoader;

    public InflaterFactory(LayoutInflater.Factory2 factory2, ClassLoader classLoader) {
        if (classLoader == null) {
            throw new IllegalArgumentException("classLoader is null");
        }
        this.mBaseFactory = factory2;
        this.mClassLoader = classLoader;
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View view2;
        try {
            view2 = (View) this.mClassLoader.loadClass(str).getConstructor(Context.class, AttributeSet.class).newInstance(context, attributeSet);
        } catch (Exception unused) {
            view2 = null;
        }
        if (view2 != null) {
            return view2;
        }
        LayoutInflater.Factory factory = this.mBaseFactory;
        if (factory != null) {
            return factory.onCreateView(str, context, attributeSet);
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View view;
        try {
            view = (View) this.mClassLoader.loadClass(str).getConstructor(Context.class, AttributeSet.class).newInstance(context, attributeSet);
        } catch (Exception unused) {
            view = null;
        }
        if (view != null) {
            return view;
        }
        LayoutInflater.Factory factory = this.mBaseFactory;
        if (factory != null) {
            return factory.onCreateView(str, context, attributeSet);
        }
        return null;
    }
}
