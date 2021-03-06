package cn.wandersnail.commons.observer;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * date: 2019/8/9 16:19
 * author: zengfansheng
 */
class ObserverInfo {
    final WeakReference<Observer> weakObserver;
    final Map<String, Method> methodMap;

    ObserverInfo(Observer observer, Map<String, Method> methodMap) {
        weakObserver = new WeakReference<>(observer);
        this.methodMap = methodMap;
    }
}
