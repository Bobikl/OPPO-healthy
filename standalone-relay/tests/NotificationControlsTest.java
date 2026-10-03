package com.example.opponotificationrelay;
/** Functional notification controls: bit preservation, lock-screen semantics and queued-event epochs. */
public final class NotificationControlsTest {
    private static int checks;
    private static void check(boolean ok,String reason){checks++;if(!ok)throw new AssertionError(reason);}
    public static void main(String[] args){
        for(int baseline:new int[]{0,0x3a000001,0x80000000,0xffffffff})
            for(int flags=0;flags<16;flags++)for(Boolean wrist:new Boolean[]{null,false,true}){
                boolean enabled=(flags&1)!=0,authorized=(flags&2)!=0,wechat=(flags&4)!=0,screen=(flags&8)!=0;
                int value=NotificationSwitchPolicy.apply(baseline,enabled,authorized,wechat,screen,wrist);
                check(((value&NotificationSwitchPolicy.MAIN)!=0)==(enabled && authorized),"master follows permission and local choice");
                check(((value&NotificationSwitchPolicy.WECHAT)!=0)==wechat,"WeChat follows selection");
                check(((value&NotificationSwitchPolicy.SCREEN_ON)!=0)==screen,"screen choice maps to official bit");
                check(((value&NotificationSwitchPolicy.WRIST_OFF)!=0)==(wrist==null?(baseline&NotificationSwitchPolicy.WRIST_OFF)!=0:wrist),"unconfigured wrist preserves baseline");
                int protectedMask=~(NotificationSwitchPolicy.MAIN|NotificationSwitchPolicy.WECHAT|NotificationSwitchPolicy.SCREEN_ON|NotificationSwitchPolicy.WRIST_OFF|1);
                check((value&protectedMask)==(baseline&protectedMask),"unowned watch features remain intact");
            }
        for(int flags=0;flags<32;flags++){
            boolean suppress=(flags&1)!=0,interactive=(flags&2)!=0,locked=(flags&4)!=0,removed=(flags&8)!=0,own=(flags&16)!=0;
            check(ScreenForwardPolicy.block(suppress,interactive,locked,removed,own)==(suppress&&interactive&&!locked&&!removed&&!own),"screen/lock truth table");
        }
        check(!ScreenForwardPolicy.block(true,true,true,false,false),"lit lock screen delivers");
        check(!ScreenForwardPolicy.block(true,false,false,false,false),"screen off/AOD delivers");
        check(ScreenForwardPolicy.block(true,true,false,false,false),"unlocked interactive phone skips");
        for(int flags=0;flags<8;flags++)for(long captured:new long[]{1,2}){
            boolean enabled=(flags&1)!=0,selected=(flags&2)!=0,own=(flags&4)!=0;
            check(NotificationForwardPolicy.allows(enabled,selected,own,captured,2)==(own||(enabled&&selected&&captured==2)),"master/selection/revision truth table");
        }
        check(!NotificationForwardPolicy.allows(true,true,false,1,3),"queued before an off/on cycle stays discarded");
        check(NotificationForwardPolicy.allows(false,false,true,1,3),"settings and deliberate tests remain available");
        for(boolean usingPhone:new boolean[]{false,true}) {
            RelayPayloadEncoder.EventEnvelope event=RelayPayloadEncoder.encodePhoneScreen(usingPhone,"relay");
            check(event.serviceId==2 && event.commandId==146 && event.picture==null,"official phone screen command");
            check(java.util.Arrays.equals(event.payload,usingPhone?new byte[]{8,1}:new byte[0]),"proto3 status field and zero omission");
            MessageBudget.validate(event);check(event.payload.length<=2,"bounded screen control frame");
        }
        try{RelayPayloadEncoder.encodePhoneScreen(true,"");throw new AssertionError("missing screen source");}
        catch(IllegalArgumentException expected){checks++;}
        System.out.println("Notification controls checks passed: "+checks);
    }
}
