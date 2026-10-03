package com.heytap.nearx.uikit.internal.widget.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import com.oplus.aiunit.vision.oea;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u0004\u0018\u00010\fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenu;", "Landroidx/appcompat/view/menu/MenuBuilder;", "", "group", "id", "categoryOrder", "", "title", "Landroid/view/SubMenu;", "addSubMenu", "Landroid/view/MenuItem;", "addInternal", "Landroidx/appcompat/view/menu/MenuBuilder$Callback;", oea.CALLBACK, "", "setCallback", "b", "a", "Landroidx/appcompat/view/menu/MenuBuilder$Callback;", "mCallBack", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BottomNavigationMenu extends MenuBuilder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int b = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public MenuBuilder.Callback mCallBack;

    /* JADX INFO: renamed from: com.heytap.nearx.uikit.internal.widget.navigation.BottomNavigationMenu$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/navigation/BottomNavigationMenu$a;", "", "", "MAX_ITEM_COUNT", "I", "a", "()I", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return BottomNavigationMenu.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationMenu(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    @NotNull
    public MenuItem addInternal(int group, int id, int categoryOrder, @NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        stopDispatchingItemsChanged();
        MenuItem item = super.addInternal(group, id, categoryOrder, title);
        if (item instanceof MenuItemImpl) {
            ((MenuItemImpl) item).setExclusiveCheckable(true);
        }
        startDispatchingItemsChanged();
        Intrinsics.checkNotNullExpressionValue(item, "item");
        return item;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    @NotNull
    public SubMenu addSubMenu(int group, int id, int categoryOrder, @NotNull CharSequence title) {
        Intrinsics.checkNotNullParameter(title, "title");
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final MenuBuilder.Callback getMCallBack() {
        return this.mCallBack;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public void setCallback(@Nullable MenuBuilder.Callback cb) {
        super.setCallback(cb);
        this.mCallBack = cb;
    }
}
