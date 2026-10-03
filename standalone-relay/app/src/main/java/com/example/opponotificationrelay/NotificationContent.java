package com.example.opponotificationrelay;
import android.app.Notification;import android.os.*;import java.nio.charset.StandardCharsets;import java.util.*;
/** Rich notification text, bounded before retention; removals never inherit post-only filters. */
final class NotificationContent {
    static boolean skip(boolean removed,int flags){return !removed&&(flags&(Notification.FLAG_ONGOING_EVENT|Notification.FLAG_GROUP_SUMMARY))!=0;}
    private static CharSequence text(Bundle extras,String key){try{return extras==null?null:extras.getCharSequence(key);}catch(RuntimeException malformed){return null;}}
    private static String bounded(Bundle extras,String key,int limit){return MessageBudget.text(text(extras,key),limit);}
    private static String recent(List<String> lines){
        Deque<String> kept=new ArrayDeque<>();int used=0;
        for(int i=lines.size()-1;i>=0&&kept.size()<32;i--){String line=lines.get(i);if(line.isEmpty())continue;int available=MessageBudget.MAX_BODY_BYTES-used-(kept.isEmpty()?0:1);if(available<3)break;
            String next=MessageBudget.text(line,available);kept.addFirst(next);used+=next.getBytes(StandardCharsets.UTF_8).length+(kept.size()==1?0:1);
        }return String.join("\n",kept);
    }
    static String[] read(Bundle extras){
        String title=bounded(extras,Notification.EXTRA_TITLE,MessageBudget.MAX_TITLE_BYTES),body="";boolean conversation=false;
        List<Notification.MessagingStyle.Message> messages=Collections.emptyList();
        try{Parcelable[] array=extras==null?null:extras.getParcelableArray(Notification.EXTRA_MESSAGES);if(array!=null&&array.length>0)messages=Notification.MessagingStyle.Message.getMessagesFromBundleArray(Arrays.copyOfRange(array,Math.max(0,array.length-32),array.length));}catch(RuntimeException malformed){}
        if(!messages.isEmpty()){
            List<String> lines=new ArrayList<>();for(Notification.MessagingStyle.Message message:messages){String content=MessageBudget.text(message.getText(),MessageBudget.MAX_BODY_BYTES);if(content.isEmpty())continue;
                CharSequence sender=message.getSenderPerson()!=null?message.getSenderPerson().getName():message.getSender();String name=MessageBudget.text(sender,MessageBudget.MAX_LABEL_BYTES);lines.add(name.isEmpty()?content:name+"："+content);
            }body=recent(lines);conversation=!body.isEmpty();
        }
        if(body.isEmpty())body=bounded(extras,Notification.EXTRA_BIG_TEXT,MessageBudget.MAX_BODY_BYTES);
        if(body.isEmpty()){
            CharSequence[] values=null;try{values=extras==null?null:extras.getCharSequenceArray(Notification.EXTRA_TEXT_LINES);}catch(RuntimeException malformed){}
            if(values!=null){List<String> lines=new ArrayList<>();for(int i=Math.max(0,values.length-32);i<values.length;i++)lines.add(MessageBudget.text(values[i],MessageBudget.MAX_BODY_BYTES));body=recent(lines);}
        }
        if(body.isEmpty())body=bounded(extras,Notification.EXTRA_TEXT,MessageBudget.MAX_BODY_BYTES);
        String expanded=bounded(extras,conversation?Notification.EXTRA_CONVERSATION_TITLE:Notification.EXTRA_TITLE_BIG,MessageBudget.MAX_TITLE_BYTES);if(!expanded.isEmpty())title=expanded;
        return new String[]{title,body,bounded(extras,Notification.EXTRA_SUB_TEXT,MessageBudget.MAX_SUB_BYTES)};
    }
}
