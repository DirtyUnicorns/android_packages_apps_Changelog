#LOCAL_PATH:= $(call my-dir)
#include $(CLEAR_VARS)

#LOCAL_MODULE_TAGS := optional
#LOCAL_PACKAGE_NAME := Changelog
#LOCAL_SDK_VERSION := current
#LOCAL_CERTIFICATE := platform
#LOCAL_PRIVILEGED_MODULE := true

#LOCAL_PROGUARD_FLAG_FILES := proguard.flags

#LOCAL_SRC_FILES := $(call all-java-files-under, java)
#LOCAL_RESOURCE_DIR := $(LOCAL_PATH)/res

#LOCAL_AAPT_FLAGS := \
#    --auto-add-overlay

#LOCAL_STATIC_JAVA_LIBRARIES := \
#    android-common \
#    android-support-v13 \
#    android-support-v4

#include $(BUILD_PACKAGE)

