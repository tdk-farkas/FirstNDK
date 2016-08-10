//
// Created by 唐地坤 on 16/8/10.
//

#include "farkas_tdk_firstndk_Load.h"


JNIEXPORT jint JNICALL Java_farkas_tdk_firstndk_Load_addInt
  (JNIEnv *, jobject, jint a, jint b){
    return a + b;
}

JNIEXPORT jint JNICALL Java_farkas_tdk_firstndk_Load_reduceInt
        (JNIEnv *, jobject, jint a, jint b){
    return a - b;
}