package com.heytap.store.base.core.vm;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.oplus.smartenginehelper.ParserTag;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0013\u001a\u0002H\u0014\"\n\b\u0000\u0010\u0014*\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0007¢\u0006\u0002\u0010\u0017J+\u0010\u0018\u001a\u00020\u00002\u001e\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006\"\b\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\u0019J#\u0010\u001a\u001a\u00020\u00002\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0006\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u001bR(\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/heytap/store/base/core/vm/ViewModelParameterizedProvider;", "", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "argClasses", "", "Ljava/lang/Class;", "getArgClasses", "()[Ljava/lang/Class;", "setArgClasses", "([Ljava/lang/Class;)V", "[Ljava/lang/Class;", "argObjects", "getArgObjects", "()[Ljava/lang/Object;", "setArgObjects", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", ParserTag.TAG_GET, ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "types", "([Ljava/lang/Class;)Lcom/heytap/store/base/core/vm/ViewModelParameterizedProvider;", "withs", "([Ljava/lang/Object;)Lcom/heytap/store/base/core/vm/ViewModelParameterizedProvider;", "ViewModelFactory", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ViewModelParameterizedProvider {

    @NotNull
    private Class<?>[] argClasses;

    @NotNull
    private Object[] argObjects;

    @NotNull
    private final ViewModelStoreOwner owner;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\u0010\u0007J'\u0010\n\u001a\u0002H\u000b\"\n\b\u0000\u0010\u000b*\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0004H\u0016¢\u0006\u0002\u0010\u000eR\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/base/core/vm/ViewModelParameterizedProvider$ViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "argClasses", "", "Ljava/lang/Class;", "argObjects", "", "([Ljava/lang/Class;[Ljava/lang/Object;)V", "[Ljava/lang/Class;", "[Ljava/lang/Object;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ViewModelFactory implements ViewModelProvider.Factory {

        @NotNull
        private final Class<?>[] argClasses;

        @NotNull
        private final Object[] argObjects;

        public ViewModelFactory(@NotNull Class<?>[] argClasses, @NotNull Object[] argObjects) {
            Intrinsics.checkNotNullParameter(argClasses, "argClasses");
            Intrinsics.checkNotNullParameter(argObjects, "argObjects");
            this.argClasses = argClasses;
            this.argObjects = argObjects;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws NoSuchMethodException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Class<?>[] clsArr = this.argClasses;
            Constructor<T> declaredConstructor = modelClass.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            Object[] objArr = this.argObjects;
            return declaredConstructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    public ViewModelParameterizedProvider(@NotNull ViewModelStoreOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.owner = owner;
        this.argClasses = new Class[0];
        this.argObjects = new Object[0];
    }

    public final <T extends ViewModel> T get(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) new ViewModelProvider(this.owner, new ViewModelFactory(this.argClasses, this.argObjects)).get(modelClass);
    }

    @NotNull
    public final Class<?>[] getArgClasses() {
        return this.argClasses;
    }

    @NotNull
    public final Object[] getArgObjects() {
        return this.argObjects;
    }

    public final void setArgClasses(@NotNull Class<?>[] clsArr) {
        Intrinsics.checkNotNullParameter(clsArr, "<set-?>");
        this.argClasses = clsArr;
    }

    public final void setArgObjects(@NotNull Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.argObjects = objArr;
    }

    @NotNull
    public final ViewModelParameterizedProvider types(@NotNull Class<?>... argClasses) {
        Intrinsics.checkNotNullParameter(argClasses, "argClasses");
        this.argClasses = new Class[argClasses.length];
        int length = argClasses.length;
        for (int i = 0; i < length; i++) {
            this.argClasses[i] = argClasses[i];
        }
        return this;
    }

    @NotNull
    public final ViewModelParameterizedProvider withs(@NotNull Object... argObjects) {
        Intrinsics.checkNotNullParameter(argObjects, "argObjects");
        this.argObjects = new Object[argObjects.length];
        int length = argObjects.length;
        for (int i = 0; i < length; i++) {
            this.argObjects[i] = argObjects[i];
        }
        return this;
    }
}
