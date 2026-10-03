package com.example.opponotificationrelay;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.coui.appcompat.panel.COUIBottomSheetDialog;
/** Restore the original full-width panel geometry across the isolated resource context. */
final class OfficialPanelStyle {
    static void apply(Context c,COUIBottomSheetDialog dialog){
        dialog.setIsShowInMaxHeight(false);
        dialog.setWidth(-1);
        float r=c.getResources().getDimension(OfficialUiResources.id(c,"dimen","coui_round_corner_xl"));
        GradientDrawable bg=new GradientDrawable();bg.setColor(0xff202020);bg.setCornerRadii(new float[]{r,r,r,r,0,0,0,0});dialog.setPanelBackground(bg);
        android.view.View frame=dialog.findViewById(OfficialUiResources.id(c,"id","design_bottom_sheet"));if(frame!=null)frame.setPadding(0,0,0,frame.getPaddingBottom());
    }
}
