package com.example.opponotificationrelay;
import android.content.Context;
import org.json.*;
import java.io.IOException;
import java.util.*;

/** One immutable record per request, reconciled with a fresh server read before its ACK. */
final class CloudUpload {
    interface Remote {
        void check()throws Exception;
        void refresh()throws Exception;
        JSONObject send(JSONObject payload)throws Exception;
        void receipt(long version)throws Exception;
    }
    static final class Result {int confirmed,partial,sent,waiting,conflicts,ready;boolean pending(){return waiting>0||conflicts>0||partial>0;}}
    static Result synchronize(CloudStore store,CloudStream stream,Remote remote,int limit)throws Exception {
        return synchronize(store,stream,remote,limit,null);
    }
    static Result synchronize(CloudStore store,CloudStream stream,Remote remote,int limit,String mutationId)throws Exception {
        Result result=new Result();if(stream.push.isEmpty())return result;
        remote.refresh();
        for(JSONObject mutation:store.partials(stream,mutationId,limit)){
            remote.check();JSONObject sent=mutation.getJSONObject("payload"),current=store.remote(stream,sent);
            if(current!=null&&stream.modified(current)>0&&!(current.has("display")&&current.optInt("display",1)==0&&sent.optInt("display",1)!=0)&&stream.sameBusiness(sent,current)){
                store.acknowledge(stream,mutation,stream.modified(current));result.confirmed++;
            }
        }
        for(JSONObject mutation:store.pending(stream,mutationId)){
            remote.check();if(result.confirmed+result.partial+result.waiting+result.conflicts>=limit)break;
            JSONObject sent=mutation.getJSONObject("payload"),current=store.remote(stream,sent);
            String id=mutation.getString("id"),state=mutation.getString("state");
            if(state.equals("READY")&&store.newerAcknowledged(stream,mutation)){store.mutationState(id,"SUPERSEDED",0);continue;}
            if(store.earlierUncertain(stream,mutation)){result.waiting++;continue;}
            if((state.equals("ACK_UNKNOWN")||state.equals("SENDING"))&&mutation.optLong("remoteVersion")>0){
                remote.receipt(mutation.getLong("remoteVersion"));current=store.remote(stream,sent);
            }
            boolean deleted=current!=null&&current.has("display")&&current.optInt("display",1)==0&&sent.optInt("display",1)!=0;
            if(current!=null&&!deleted&&stream.sameBusiness(sent,current)){
                long version=stream.modified(current);
                if(version<=0)throw new IOException("CLOUD_RECEIPT_VERSION_MISSING");
                store.acknowledge(stream,mutation,version);result.confirmed++;continue;
            }
            if(current!=null&&!deleted&&stream.partiallyMatches(sent,current)){
                store.acknowledgePartial(stream,mutation,stream.modified(current));result.partial++;continue;
            }
            // A crashed send can already have reached the server. Absence is not a negative receipt.
            if(state.equals("ACK_UNKNOWN")||state.equals("SENDING")){result.waiting++;continue;}
            long baseVersion=mutation.optLong("baseVersion");String baseHash=mutation.optString("baseHash");
            boolean legacyChanged=mutation.optString("sourceKind","legacy").equals("legacy")&&current!=null&&stream.modified(sent)!=baseVersion;
            boolean ownContinuation=store.followsAcknowledged(stream,mutation,current);
            boolean baselineChanged=current==null?!baseHash.isEmpty():baseHash.isEmpty()||!baseHash.equals(CloudStore.fingerprint(current));
            if(deleted||legacyChanged||baselineChanged&&!ownContinuation){
                store.mutationState(id,"CONFLICT",current==null?baseVersion:stream.modified(current));result.conflicts++;continue;
            }
            // Persist the attempt before I/O. Its immutable payload and source ID survive restart.
            store.mutationState(id,"SENDING",0);result.sent++;
            JSONObject response;
            try{response=remote.send(requestPayload(stream,mutation));}
            catch(CloudHttp.HttpFailure failure){if(failure.status>=400&&failure.status<500&&failure.status!=408)store.mutationState(id,"READY",0);else store.mutationState(id,"ACK_UNKNOWN",0);throw failure;}
            catch(CloudHttp.NotSent unsent){store.mutationState(id,"READY",0);throw unsent;}
            catch(CloudHttp.Failure rejected){store.mutationState(id,"READY",0);throw rejected;}
            catch(Exception uncertain){try{store.mutationState(id,"ACK_UNKNOWN",0);}catch(Exception ignored){}throw uncertain;}
            long version=receiptVersion(response);
            store.mutationState(id,"ACK_UNKNOWN",version);
            if(version>0)remote.receipt(version);else remote.refresh();
            current=store.remote(stream,sent);
            boolean receiptDeleted=current!=null&&current.has("display")&&current.optInt("display",1)==0&&sent.optInt("display",1)!=0;
            if(current!=null&&!receiptDeleted&&stream.sameBusiness(sent,current)&&stream.modified(current)>0){
                store.acknowledge(stream,mutation,stream.modified(current));result.confirmed++;
            }else if(current!=null&&!receiptDeleted&&stream.partiallyMatches(sent,current)){
                store.acknowledgePartial(stream,mutation,stream.modified(current));result.partial++;
            }else {result.waiting++;break;}
        }
        result.ready=store.readyCount(stream);if(result.confirmed==0&&result.sent==0&&result.waiting>0)result.ready=0;
        result.waiting=store.pendingCount(stream);
        result.conflicts=store.conflictCount(stream);
        result.partial=store.partialCount(stream);
        return result;
    }
    static JSONObject requestPayload(CloudStream stream,JSONObject mutation)throws Exception {
        JSONObject row=new JSONObject(mutation.getJSONObject("payload").toString());
        // Pinned StoreUtil.mzi.o() creates a UUID without separators. Derive ours from the durable mutation.
        if(stream.mapping.has("clientDataId")&&row.optString("clientDataId").isEmpty())row.put("clientDataId",mutation.getString("id").replace("-",""));
        return row;
    }
    static long receiptVersion(JSONObject response)throws Exception {
        Object body=response.opt("body");if(!(body instanceof JSONObject))return 0;
        JSONObject value=(JSONObject)body;
        for(String field:new String[]{"modifiedTimestamp","modifiedTime"})if(value.has(field)&&!value.isNull(field)){
            long version=value.getLong(field);if(version<=0||version==Long.MAX_VALUE)throw new IOException("CLOUD_RECEIPT_VERSION_INVALID");return version;
        }
        return 0;
    }
    static Result synchronize(Context c,String scope,CloudStore store,CloudHttp http,CloudCrypto crypto,CloudStream stream,long deadline)throws Exception {
        if(stream.push.isEmpty())return new Result();
        CloudNativeProducer.capture(c,store,stream);
        store.captureDirty(stream);
        return synchronize(store,stream,new Remote(){
            public void check()throws Exception{http.check();store.check();}
            public void refresh()throws Exception{CloudSyncEngine.pull(c,scope,store,http,crypto,stream,deadline);}
            public JSONObject send(JSONObject payload)throws Exception{
                check();CloudSyncEngine.message(c,scope,"正在上传"+stream.title+"，等待云端确认…");
                return http.post(stream.push,stream.uploadRequest(payload,crypto));
            }
            public void receipt(long version)throws Exception{
                check();Object body=http.post(stream.pull,stream.pullRequest(version)).get("body");
                store.saveReceipt(stream,stream.records(body),version,crypto);
            }
        },24);
    }
}
