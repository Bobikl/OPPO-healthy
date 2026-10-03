package com.example.opponotificationrelay;
import android.content.Context;
import com.coui.appcompat.couiswitch.COUISwitch;
/** Original COUI switch; only the independent app's resource context is adapted. */
final class OfficialStyleSwitch extends COUISwitch {
    OfficialStyleSwitch(Context context){super(OfficialUiResources.wrap(context));setShowText(false);setClickable(true);setFocusable(true);setTactileFeedbackEnabled(true);setShouldPlaySound(true);}
}
