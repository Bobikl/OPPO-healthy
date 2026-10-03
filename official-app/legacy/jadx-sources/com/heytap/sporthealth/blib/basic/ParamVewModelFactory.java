package com.heytap.sporthealth.blib.basic;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.yha;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public class ParamVewModelFactory extends ViewModelProvider.NewInstanceFactory {
    public Object a;

    public ParamVewModelFactory(Object obj) {
        this.a = obj;
    }

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        if (!AndroidViewModel.class.isAssignableFrom(cls)) {
            try {
                return cls.getConstructor(Application.class, Object.class).newInstance(rg7.h(), this.a);
            } catch (Exception e2) {
                yha.a(" ********** create ViewModel must achieve constructor(Application.class, Object.class) ************ ");
                yha.j(e2);
                return (T) super.create(cls);
            }
        }
        try {
            return cls.getConstructor(Application.class).newInstance(rg7.h());
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        }
    }
}
