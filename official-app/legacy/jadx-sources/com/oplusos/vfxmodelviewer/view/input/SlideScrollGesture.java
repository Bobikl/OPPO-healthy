package com.oplusos.vfxmodelviewer.view.input;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\fH&J\b\u0010\u000e\u001a\u00020\fH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\fH&J\b\u0010\u0012\u001a\u00020\fH&J\b\u0010\u0013\u001a\u00020\u0014H&J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/input/SlideScrollGesture;", "", "()V", "mUser", "Lcom/oplusos/vfxmodelviewer/view/input/ISlideScroll;", "getMUser", "()Lcom/oplusos/vfxmodelviewer/view/input/ISlideScroll;", "setMUser", "(Lcom/oplusos/vfxmodelviewer/view/input/ISlideScroll;)V", "endGesture", "", "getScroll", "", "getSlideDeltaX", "getSlideDeltaY", "getSlideIndex", "", "getSlideX", "getSlideY", "isSliding", "", "setUser", "user", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class SlideScrollGesture {

    @Nullable
    private ISlideScroll mUser;

    public abstract void endGesture();

    @Nullable
    public final ISlideScroll getMUser() {
        return this.mUser;
    }

    public abstract float getScroll();

    public abstract float getSlideDeltaX();

    public abstract float getSlideDeltaY();

    public abstract int getSlideIndex();

    public abstract float getSlideX();

    public abstract float getSlideY();

    public abstract boolean isSliding();

    public final void setMUser(@Nullable ISlideScroll iSlideScroll) {
        this.mUser = iSlideScroll;
    }

    public final void setUser(@NotNull ISlideScroll user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (Intrinsics.areEqual(this.mUser, user)) {
            return;
        }
        if (this.mUser != null) {
            endGesture();
        }
        this.mUser = user;
        if (user != null && isSliding()) {
            user.onSlideStart(getSlideIndex(), getSlideX(), getSlideY());
        }
    }
}
