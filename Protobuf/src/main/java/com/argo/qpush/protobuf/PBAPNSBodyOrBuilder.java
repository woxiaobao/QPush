// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pb_message.proto

package com.argo.qpush.protobuf;

public interface PBAPNSBodyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:message.PBAPNSBody)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string alert = 1;</code>
   */
  boolean hasAlert();
  /**
   * <code>optional string alert = 1;</code>
   */
  java.lang.String getAlert();
  /**
   * <code>optional string alert = 1;</code>
   */
  com.google.protobuf.ByteString
      getAlertBytes();

  /**
   * <code>optional string sound = 2;</code>
   */
  boolean hasSound();
  /**
   * <code>optional string sound = 2;</code>
   */
  java.lang.String getSound();
  /**
   * <code>optional string sound = 2;</code>
   */
  com.google.protobuf.ByteString
      getSoundBytes();

  /**
   * <code>optional int32 badge = 3;</code>
   */
  boolean hasBadge();
  /**
   * <code>optional int32 badge = 3;</code>
   */
  int getBadge();
}