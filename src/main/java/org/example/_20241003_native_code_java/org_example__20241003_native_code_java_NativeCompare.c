#include "org_example__20241003_native_code_java_NativeCompare.h"
#include <jni.h>

JNIEXPORT jint JNICALL Java_org_example__120241003_1native_1code_1java_NativeCompare_addRangeNative(JNIEnv *env, jobject obj, jint start, jint end){
  int sum = 0;
  for(int i = start; i <= end; i++){
    sum += i;
  }
  return sum;
}
