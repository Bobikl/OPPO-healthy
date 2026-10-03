package com.platform.usercenter.basic.core.mvvm.calladapter;

import androidx.lifecycle.LiveData;
import com.oplus.aiunit.vision.evf;
import com.oplus.aiunit.vision.zr2;
import com.platform.usercenter.basic.core.mvvm.ApiResponse;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes9.dex */
public class LiveDataCallAdapterFactory extends zr2.a {
    private LiveDataCallAdapterFactory() {
    }

    public static LiveDataCallAdapterFactory create() {
        return new LiveDataCallAdapterFactory();
    }

    @Override // com.oplus.aiunit.vision.zr2.a
    public zr2<?, ?> get(Type type, Annotation[] annotationArr, evf evfVar) {
        if (zr2.a.getRawType(type) != LiveData.class) {
            return null;
        }
        Type parameterUpperBound = zr2.a.getParameterUpperBound(0, (ParameterizedType) type);
        if (zr2.a.getRawType(parameterUpperBound) != ApiResponse.class) {
            throw new IllegalArgumentException("type must be a resource");
        }
        if (parameterUpperBound instanceof ParameterizedType) {
            return new LiveDataCallAdapter(zr2.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound));
        }
        throw new IllegalArgumentException("resource must be parameterized");
    }
}
