package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u001b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\"\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/q8a;", "Landroid/view/LayoutInflater$Factory2;", "Landroid/view/View;", "parent", "", "name", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "onCreateView", "Landroid/view/LayoutInflater$Factory;", "i", "Landroid/view/LayoutInflater$Factory;", "mBaseFactory", "Ljava/lang/ClassLoader;", "j", "Ljava/lang/ClassLoader;", "mClassLoader", "base", "classLoader", "<init>", "(Landroid/view/LayoutInflater$Factory2;Ljava/lang/ClassLoader;)V", "Companion", "a", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInflaterFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InflaterFactory.kt\ncom/oplus/pantanal/plugin/InflaterFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class q8a implements LayoutInflater.Factory2 {

    @NotNull
    public static final String TAG = "InflaterFactory";

    @Nullable
    public LayoutInflater.Factory i;

    @Nullable
    public ClassLoader j;

    public q8a(@Nullable LayoutInflater.Factory2 factory2, @Nullable ClassLoader classLoader) {
        if (classLoader == null) {
            throw new IllegalArgumentException("classLoader is null".toString());
        }
        this.i = factory2;
        this.j = classLoader;
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public View onCreateView(@Nullable View parent, @NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
        View view;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        try {
            ClassLoader classLoader = this.j;
            Intrinsics.checkNotNull(classLoader);
            Object objNewInstance = classLoader.loadClass(name).getConstructor(Context.class, AttributeSet.class).newInstance(context, attrs);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type android.view.View");
            view = (View) objNewInstance;
        } catch (Exception e) {
            ht9.a.d(s8e.INSTANCE, TAG, "onCreateView Exception " + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            view = null;
        }
        if (view != null) {
            return view;
        }
        LayoutInflater.Factory factory = this.i;
        if (factory != null) {
            return factory.onCreateView(name, context, attrs);
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public View onCreateView(@NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
        View view;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        try {
            ClassLoader classLoader = this.j;
            Intrinsics.checkNotNull(classLoader);
            Object objNewInstance = classLoader.loadClass(name).getConstructor(Context.class, AttributeSet.class).newInstance(context, attrs);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type android.view.View");
            view = (View) objNewInstance;
        } catch (Exception e) {
            ht9.a.d(s8e.INSTANCE, TAG, "onCreateView Exception " + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            view = null;
        }
        if (view != null) {
            return view;
        }
        LayoutInflater.Factory factory = this.i;
        if (factory != null) {
            return factory.onCreateView(name, context, attrs);
        }
        return null;
    }
}
