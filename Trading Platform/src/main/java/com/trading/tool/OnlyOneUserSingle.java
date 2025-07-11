package com.trading.tool;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created  on 2025/10/18.
 */
public class OnlyOneUserSingle<K,V> {
    private volatile Map<K,V> map = new ConcurrentHashMap<>();
    private static class Single{
        private static final OnlyOneUserSingle onlyOneUserSingle = new OnlyOneUserSingle();
    }
    private OnlyOneUserSingle(){}
    public static OnlyOneUserSingle getSingle(){
        return Single.onlyOneUserSingle;
    }
    public void setMap(K k,V v){
        map.put(k, v);
    }
    public Map<K,V> getMap(){
        return map;
    }
}
