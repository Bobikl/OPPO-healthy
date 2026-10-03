package com.heytap.store.splash;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.sdk.R;
import com.heytap.store.splash.databinding.HeytapStoreSdkActionbarBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_HEYTAPSTORESDKACTIONBAR = 1;

    public static class a {
        public static final SparseArray<String> a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "data");
        }
    }

    public static class b {
        public static final HashMap<String, Integer> a;

        static {
            HashMap<String, Integer> map = new HashMap<>(1);
            a = map;
            map.put("layout/heytap_store_sdk_actionbar_0", Integer.valueOf(R.layout.heytap_store_sdk_actionbar));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.heytap_store_sdk_actionbar, 1);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.heytap.store.base.core.DataBinderMapperImpl());
        arrayList.add(new com.heytap.store.base.widget.DataBinderMapperImpl());
        arrayList.add(new com.heytap.store.platform.barcode.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return a.a.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 != 1) {
            return null;
        }
        if ("layout/heytap_store_sdk_actionbar_0".equals(tag)) {
            return new HeytapStoreSdkActionbarBindingImpl(dataBindingComponent, new View[]{view});
        }
        throw new IllegalArgumentException("The tag for heytap_store_sdk_actionbar is invalid. Received: " + tag);
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        int i2;
        if (viewArr != null && viewArr.length != 0 && (i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 1) {
                if ("layout/heytap_store_sdk_actionbar_0".equals(tag)) {
                    return new HeytapStoreSdkActionbarBindingImpl(dataBindingComponent, viewArr);
                }
                throw new IllegalArgumentException("The tag for heytap_store_sdk_actionbar is invalid. Received: " + tag);
            }
        }
        return null;
    }
}
