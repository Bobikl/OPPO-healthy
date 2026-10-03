package com.heytap.store.base.core;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.core.databinding.LoadingViewBindingImpl;
import com.heytap.store.base.core.databinding.PfCoreBaseToolBarLayoutBindingImpl;
import com.heytap.store.base.core.databinding.PfCoreBaseToolbarTitleViewBindingImpl;
import com.heytap.store.base.core.databinding.PfCoreLoadingView2BindingImpl;
import com.heytap.store.base.core.databinding.PfCoreLoadingViewLayoutBindingImpl;
import com.heytap.store.base.core.databinding.PfCoreSmartLoadingLayoutBindingImpl;
import com.heytap.store.base.core.databinding.PfCoreViewCartCountBindingImpl;
import com.heytap.store.base.core.databinding.PfCoreViewStubErrorLayoutBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_LOADINGVIEW = 1;
    private static final int LAYOUT_PFCOREBASETOOLBARLAYOUT = 2;
    private static final int LAYOUT_PFCOREBASETOOLBARTITLEVIEW = 3;
    private static final int LAYOUT_PFCORELOADINGVIEW2 = 4;
    private static final int LAYOUT_PFCORELOADINGVIEWLAYOUT = 5;
    private static final int LAYOUT_PFCORESMARTLOADINGLAYOUT = 6;
    private static final int LAYOUT_PFCOREVIEWCARTCOUNT = 7;
    private static final int LAYOUT_PFCOREVIEWSTUBERRORLAYOUT = 8;

    public static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "data");
        }

        private InnerBrLookup() {
        }
    }

    public static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        static {
            HashMap<String, Integer> map = new HashMap<>(8);
            sKeys = map;
            map.put("layout/loading_view_0", Integer.valueOf(R.layout.loading_view));
            map.put("layout/pf_core_base_tool_bar_layout_0", Integer.valueOf(R.layout.pf_core_base_tool_bar_layout));
            map.put("layout/pf_core_base_toolbar_title_view_0", Integer.valueOf(R.layout.pf_core_base_toolbar_title_view));
            map.put("layout/pf_core_loading_view2_0", Integer.valueOf(R.layout.pf_core_loading_view2));
            map.put("layout/pf_core_loading_view_layout_0", Integer.valueOf(R.layout.pf_core_loading_view_layout));
            map.put("layout/pf_core_smart_loading_layout_0", Integer.valueOf(R.layout.pf_core_smart_loading_layout));
            map.put("layout/pf_core_view_cart_count_0", Integer.valueOf(R.layout.pf_core_view_cart_count));
            map.put("layout/pf_core_view_stub_error_layout_0", Integer.valueOf(R.layout.pf_core_view_stub_error_layout));
        }

        private InnerLayoutIdLookup() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.loading_view, 1);
        sparseIntArray.put(R.layout.pf_core_base_tool_bar_layout, 2);
        sparseIntArray.put(R.layout.pf_core_base_toolbar_title_view, 3);
        sparseIntArray.put(R.layout.pf_core_loading_view2, 4);
        sparseIntArray.put(R.layout.pf_core_loading_view_layout, 5);
        sparseIntArray.put(R.layout.pf_core_smart_loading_layout, 6);
        sparseIntArray.put(R.layout.pf_core_view_cart_count, 7);
        sparseIntArray.put(R.layout.pf_core_view_stub_error_layout, 8);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.heytap.store.base.widget.DataBinderMapperImpl());
        arrayList.add(new com.heytap.store.platform.barcode.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
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
        switch (i2) {
            case 1:
                if ("layout/loading_view_0".equals(tag)) {
                    return new LoadingViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for loading_view is invalid. Received: " + tag);
            case 2:
                if ("layout/pf_core_base_tool_bar_layout_0".equals(tag)) {
                    return new PfCoreBaseToolBarLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pf_core_base_tool_bar_layout is invalid. Received: " + tag);
            case 3:
                if ("layout/pf_core_base_toolbar_title_view_0".equals(tag)) {
                    return new PfCoreBaseToolbarTitleViewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pf_core_base_toolbar_title_view is invalid. Received: " + tag);
            case 4:
                if ("layout/pf_core_loading_view2_0".equals(tag)) {
                    return new PfCoreLoadingView2BindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pf_core_loading_view2 is invalid. Received: " + tag);
            case 5:
                if ("layout/pf_core_loading_view_layout_0".equals(tag)) {
                    return new PfCoreLoadingViewLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pf_core_loading_view_layout is invalid. Received: " + tag);
            case 6:
                if ("layout/pf_core_smart_loading_layout_0".equals(tag)) {
                    return new PfCoreSmartLoadingLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pf_core_smart_loading_layout is invalid. Received: " + tag);
            case 7:
                if ("layout/pf_core_view_cart_count_0".equals(tag)) {
                    return new PfCoreViewCartCountBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pf_core_view_cart_count is invalid. Received: " + tag);
            case 8:
                if ("layout/pf_core_view_stub_error_layout_0".equals(tag)) {
                    return new PfCoreViewStubErrorLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for pf_core_view_stub_error_layout is invalid. Received: " + tag);
            default:
                return null;
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
