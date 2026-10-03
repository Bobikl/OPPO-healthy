package com.heytap.health.core.operation.space;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.core.operation.datacenter.ISpaceServer;
import com.heytap.health.operations.R$styleable;
import com.oplus.aiunit.vision.d8i;
import com.oplus.aiunit.vision.e1;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.nz9;
import com.oplus.aiunit.vision.w0b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes16.dex */
public class SpaceView extends FrameLayout {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4758j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4759l;
    public d8i m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public nz9 f4760n;
    public ConcurrentHashMap<String, Boolean> o;
    public Consumer<List<SpaceInfo>> p;

    public static class a implements Observer<Map<String, List<SpaceInfo>>> {
        public WeakReference<SpaceView> i;

        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(Map<String, List<SpaceInfo>> map) {
            SpaceView spaceView = this.i.get();
            if (spaceView != null) {
                spaceView.setData(map);
            }
        }

        public a(SpaceView spaceView) {
            this.i = new WeakReference<>(spaceView);
        }
    }

    public SpaceView(@NonNull Context context) {
        this(context, null);
    }

    public void a() {
        m8b.f("SpaceView", "clear");
        nz9 nz9Var = this.f4760n;
        if (nz9Var == null) {
            m8b.f("SpaceView", "render is null");
        } else {
            nz9Var.a();
        }
    }

    public void b() {
        m8b.f("SpaceView", "initData pageCode = " + this.k + ",cardCode = " + this.f4758j + ",isQueryCardData = " + this.f4759l);
        ISpaceServer iSpaceServer = (ISpaceServer) e1.d().b("/operations/SpaceServer").navigation();
        if (this.f4759l) {
            iSpaceServer.U6((LifecycleOwner) this.i, this.k, this.f4758j).observe((LifecycleOwner) this.i, new a());
        } else {
            iSpaceServer.t3((LifecycleOwner) this.i, this.k).observe((LifecycleOwner) this.i, new a());
        }
    }

    public nz9 c(List<SpaceInfo> list) {
        nz9 nz9VarA = this.m.a(this.i, this, list);
        this.f4760n = nz9VarA;
        return nz9VarA;
    }

    public String getCardCode() {
        return this.f4758j;
    }

    public ConcurrentHashMap<String, Boolean> getIsExposed() {
        return this.o;
    }

    public String getPageCode() {
        return this.k;
    }

    public nz9 getSpaceViewRender() {
        return this.f4760n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m8b.f("SpaceView", "[onWindowVisibilityChanged] visibility = " + i);
        if (i != 0) {
            a();
        }
    }

    public void setCardCode(String str) {
        this.f4758j = str;
        postInvalidate();
    }

    public void setData(Map<String, List<SpaceInfo>> map) {
        synchronized (this) {
            if (map != null) {
                if (!map.isEmpty()) {
                    List<SpaceInfo> list = map.get(this.f4758j);
                    if (!w0b.a(list)) {
                        a();
                        c(list);
                        Consumer<List<SpaceInfo>> consumer = this.p;
                        if (consumer != null) {
                            consumer.accept(list);
                        }
                        return;
                    }
                    Consumer<List<SpaceInfo>> consumer2 = this.p;
                    if (consumer2 != null) {
                        consumer2.accept(null);
                    }
                    m8b.f("SpaceView", "not found cardCode matched");
                    nz9 nz9Var = this.f4760n;
                    if (nz9Var != null) {
                        nz9Var.b(new ArrayList());
                    }
                    return;
                }
            }
            Consumer<List<SpaceInfo>> consumer3 = this.p;
            if (consumer3 != null) {
                consumer3.accept(null);
            }
            m8b.f("SpaceView", "space list is empty or null");
            nz9 nz9Var2 = this.f4760n;
            if (nz9Var2 != null) {
                nz9Var2.b(new ArrayList());
            }
        }
    }

    public void setOnRenderDataListener(Consumer<List<SpaceInfo>> consumer) {
        this.p = consumer;
    }

    public void setPageCode(String str) {
        this.k = str;
        postInvalidate();
    }

    public void setQueryCardData(boolean z) {
        this.f4759l = z;
    }

    public SpaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SpaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_core_space);
        this.f4758j = typedArrayObtainStyledAttributes.getString(R$styleable.lib_core_space_lib_core_space_cardCode);
        this.k = typedArrayObtainStyledAttributes.getString(R$styleable.lib_core_space_lib_core_space_pageCode);
        this.f4759l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.lib_core_space_lib_core_space_cardData, false);
        typedArrayObtainStyledAttributes.recycle();
        this.m = new d8i();
        this.o = new ConcurrentHashMap<>();
        if (TextUtils.isEmpty(this.f4758j) || TextUtils.isEmpty(this.k)) {
            return;
        }
        b();
    }
}