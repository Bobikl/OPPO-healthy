package com.oplus.aiunit.vision;

import com.support.appcompat.R$anim;

/* JADX INFO: loaded from: classes18.dex */
public class q50 {
    public static final int ENTER_BOTTOM_TO_TOP = R$anim.coui_push_up_enter_activitydialog;
    public static final int ENTER_FADE_ENTER;
    public static final int ENTER_SLIDE_ENTER;
    public static final int EXIT_FADE_EXIT;
    public static final int EXIT_TOP_TO_BOTTOM;
    public int a;
    public int b;

    static {
        int i = R$anim.coui_zoom_fade_enter;
        EXIT_FADE_EXIT = i;
        ENTER_FADE_ENTER = i;
        EXIT_TOP_TO_BOTTOM = R$anim.coui_push_down_exit_activitydialog;
        ENTER_SLIDE_ENTER = R$anim.coui_open_slide_enter;
    }

    public q50(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }
}
