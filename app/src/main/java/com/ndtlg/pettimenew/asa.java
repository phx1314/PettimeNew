//package com.ndtlg.pettime;
//
//--------- beginning of system
//        04-10 12:52:39.312 W/HwAlarmManagerService(16247): isContainsAppUidInWorksource-->happend NameNotFoundException
//        --------- beginning of main
//        04-10 17:01:29.871 D/ZrHung.AppEyeTransparentWindow(16247): handleMessage CHECK_TRANS_WINDOW_ERROR_MSG
//        04-10 17:01:30.128 E/WifiHAL (  647): enter wifi_get_link_stats
//        04-10 17:01:30.150 E/WificondControl(16247): Noise: -92, Snr: 35, Chload: -1
//        04-10 17:01:30.151 D/HwInnerWifiManagerImpl(16247): SupplicantState = COMPLETED
//        04-10 17:01:30.152 D/HwInnerWifiManagerImpl(16247): isPhoneAP = false
//        04-10 17:01:30.155 D/WifiScoreReport(16247): Score = 60, wifiConnectivityManagerEnabled = false, lowScoreCount = 0
//        04-10 17:01:30.280 V/coap_jni(26451): cancelMessage contextId:511443269312
//        04-10 17:01:30.280 V/coap_jni(26451): cancelMessage msgid:10
//        04-10 17:01:30.290 W/AlcsCoAPMessage(26451): update your code to supply an RFC 7252 compliant URI including a scheme
//        04-10 17:01:30.295 V/coap_jni(26451): initRequest contextId:511443269312
//        04-10 17:01:30.295 V/coap_jni(26451): initCPPCoapMessage cxtId id:511443269312
//        04-10 17:01:30.295 V/coap_jni(26451): msgid:-1
//        04-10 17:01:30.295 V/coap_jni(26451): code:1
//        04-10 17:01:30.295 V/coap_jni(26451): type:1
//        04-10 17:01:30.295 V/coap_jni(26451): payload:{"id":"10","version":"1.0","method":"device.info.notify","params":{"awssVer":{"smartconfig":"2.0","zconfig":"2.0","router":"2.0","ap":"2.0"},"productKey":"a1rKG9FRoKY","deviceName":"a02eb789fc4947908081e366d6e2ad55","mac":"A057E3D0443E","ip":"192.168.4.67","cipherType":4,"token":"MDF1JF4Y57YG2B552263HHMD024VUR8H","remainTime":40250,"type":0}}
//        04-10 17:01:30.296 V/coap_jni(26451): payloadlen:344
//        04-10 17:01:30.296 V/coap_jni(26451): getToken value null
//        04-10 17:01:30.296 V/coap_jni(26451): midIsMulCast:1
//        04-10 17:01:30.296 V/coap_jni(26451): alcs_msg_init start
//        04-10 17:01:30.296 V/coap_jni(26451): alcs_msg_init msgdid:11
//        04-10 17:01:30.296 V/coap_jni(26451): alcs_msg_init code:1
//        04-10 17:01:30.296 V/coap_jni(26451): alcs_msg_init type:1
//        04-10 17:01:30.296 V/coap_jni(26451): alcs_msg_init userdata:11
//        04-10 17:01:30.296 V/coap_jni(26451): alcs_msg_init payloadlen:344
//        04-10 17:01:30.296 V/coap_jni(26451): alcs_msg_init keep:1
//        04-10 17:01:30.296 V/coap_jni(26451): alcs_msg_init token:賿縊
//        04-10 17:01:30.296 V/coap_jni(26451): alcs_msg_init tokenlen:4
//        04-10 17:01:30.297 V/coap_jni(26451): addstringoption msgid:11
//        04-10 17:01:30.297 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:30.297 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:30.297 V/coap_jni(26451): addstringoption msgid:11
//        04-10 17:01:30.297 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:30.297 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:30.297 V/coap_jni(26451): addstringoption msgid:11
//        04-10 17:01:30.298 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:30.298 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:30.298 V/coap_jni(26451): addstringoption msgid:11
//        04-10 17:01:30.298 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:30.298 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:30.298 V/coap_jni(26451): sendrequest contextId:511443269312
//        04-10 17:01:30.298 V/coap_jni(26451): sendrequest msgid:11
//        04-10 17:01:30.298 V/coap_jni(26451): sendrequest port:5683
//        04-10 17:01:30.298 V/jni_log (26451): initAlcsNetWorkAddr pdata: 192.168.4.255,len:13,port:5683
//        04-10 17:01:30.298 V/coap_jni(26451): alcs_sendmsg start
//        04-10 17:01:30.298 D/Coap    (26451): Request path is /sys/device/info/notify
//        04-10 17:01:30.298 D/Coap    (26451): The message id 11 is CON msg, add to the list first, cur list num 1
//        04-10 17:01:30.298 D/Coap    (26451): The message 11 need keep
//        04-10 17:01:30.299 D/Coap    (26451): --------Dump Received Message------
//        04-10 17:01:30.299 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:30.299 D/Coap    (26451): Version     : 1
//        04-10 17:01:30.299 D/Coap    (26451): Code        : 0.01(0x1)
//        04-10 17:01:30.299 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:30.299 D/Coap    (26451): Msgid       : 11
//        04-10 17:01:30.299 D/Coap    (26451): Option      : 4
//        04-10 17:01:30.299 D/Coap    (26451): Payload Len : 344
//        04-10 17:01:30.300 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:30.300 D/Coap    (26451): Token       : D992BF4F
//        04-10 17:01:30.300 D/Coap    (26451): Remote      : 192.168.4.67:5683
//        04-10 17:01:30.300 D/Coap    (26451): ********************************
//        04-10 17:01:30.300 D/Coap    (26451): Request path is /sys/device/info/notify
//        04-10 17:01:30.300 I/Coap    (26451): The resource /sys/device/info/notify isn't found
//        04-10 17:01:30.300 D/Coap    (26451): Send Error Response Message
//        04-10 17:01:30.300 D/Coap    (26451): Request path is
//        04-10 17:01:30.300 D/Coap    (26451): The message 11 isn't CON msg, needless to be retransmitted
//        04-10 17:01:30.300 D/Coap    (26451): CoAP transport write seccess
//        04-10 17:01:30.300 D/Coap    (26451): ---------Send a Message--------
//        04-10 17:01:30.300 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:30.300 D/Coap    (26451): Version     : 1
//        04-10 17:01:30.300 D/Coap    (26451): Code        : 4.04(0x84)
//        04-10 17:01:30.300 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:30.300 D/Coap    (26451): Msgid       : 11
//        04-10 17:01:30.300 D/Coap    (26451): Option      : 0
//        04-10 17:01:30.300 D/Coap    (26451): Payload Len : 0
//        04-10 17:01:30.300 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:30.300 D/Coap    (26451): Token       : D992BF4F
//        04-10 17:01:30.300 D/Coap    (26451): Remote      : 192.168.4.67:5683
//        04-10 17:01:30.300 D/Coap    (26451): ********************************
//        04-10 17:01:30.300 I/Coap    (26451): gc cancel message 10 from list, cur count 1
//        04-10 17:01:30.300 D/Coap    (26451): --------Dump Received Message------
//        04-10 17:01:30.301 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:30.301 D/Coap    (26451): Version     : 1
//        04-10 17:01:30.301 D/Coap    (26451): Code        : 4.04(0x84)
//        04-10 17:01:30.301 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:30.301 D/Coap    (26451): Msgid       : 11
//        04-10 17:01:30.301 D/Coap    (26451): Option      : 0
//        04-10 17:01:30.301 D/Coap    (26451): Payload Len : 0
//        04-10 17:01:30.301 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:30.301 D/Coap    (26451): Token       : D992BF4F
//        04-10 17:01:30.301 D/Coap    (26451): Remote      : 192.168.4.67:5683
//        04-10 17:01:30.301 D/Coap    (26451): ********************************
//        04-10 17:01:30.301 D/Coap    (26451): Find the message id 11, It need keep
//        04-10 17:01:30.301 D/Coap    (26451):
//        04-10 17:01:30.301 D/Coap    (26451): CoAP Observe Client Max Number 255, Cur Number 0
//        04-10 17:01:30.301 D/Coap    (26451): Call the response message callback 0x770fc34e10
//        04-10 17:01:30.301 V/coap_jni(26451): sendMsgHandler start responseResult 0:
//        04-10 17:01:30.303 D/Coap    (26451): CoAP transport write seccess
//        04-10 17:01:30.303 D/Coap    (26451): ---------Send a Message--------
//        04-10 17:01:30.303 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:30.303 D/Coap    (26451): Version     : 1
//        04-10 17:01:30.303 D/Coap    (26451): Code        : 0.01(0x1)
//        04-10 17:01:30.303 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:30.303 D/Coap    (26451): Msgid       : 11
//        04-10 17:01:30.303 D/Coap    (26451): Option      : 4
//        04-10 17:01:30.303 D/Coap    (26451): Payload Len : 344
//        04-10 17:01:30.303 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:30.303 D/Coap    (26451): Token       : D992BF4F
//        04-10 17:01:30.303 D/Coap    (26451): Remote      : 192.168.4.255:5683
//        04-10 17:01:30.303 D/Coap    (26451): ********************************
//        04-10 17:01:30.303 V/coap_jni(26451): alcs_sendmsg end ret:0
//        04-10 17:01:30.303 V/coap_jni(26451): uninitmsg msgid:11
//        04-10 17:01:30.303 V/coap_jni(26451): alcs_msg_deinit start
//        04-10 17:01:30.303 V/coap_jni(26451): alcs_msg_deinit end
//        04-10 17:01:30.304 V/coap_jni_VmToEnv(26451): AttachCurrentThread success
//        04-10 17:01:30.304 V/coap_jni_VmToEnv(26451): get
//        04-10 17:01:30.304 V/coap_jni(26451): clazzCoAP NewGlobalRef start
//        04-10 17:01:30.304 V/coap_jni(26451): getmethod onSendRequestComplete start
//        04-10 17:01:30.304 V/coap_jni(26451): call midOnSendReqHandler addr:192.168.4.67
//        04-10 17:01:30.304 V/coap_jni(26451): call midOnSendReqHandler userdata to msgId:11
//        04-10 17:01:30.304 V/coap_jni(26451): call midOnSendReqHandler userdata to msgId:11
//        04-10 17:01:30.304 V/coap_jni(26451): clazzCoAPResponse start
//        04-10 17:01:30.304 V/coap_jni(26451): GetMethodID clazzCoAPResponse init start
//        04-10 17:01:30.304 V/coap_jni(26451): message code:132
//        04-10 17:01:30.304 V/coap_jni(26451): initJavaCoAPMessage message id:11
//        04-10 17:01:30.304 V/coap_jni(26451): message type:1
//        04-10 17:01:30.304 V/coap_jni(26451): SetByteArrayRegion tokenlen:4
//        04-10 17:01:30.304 V/coap_jni(26451): SetByteArrayRegion setPayload:0
//        04-10 17:01:30.305 V/coap_jni(26451): options count:0
//        04-10 17:01:30.305 V/coap_jni(26451): CallObjectMethod setoptions
//        04-10 17:01:30.305 V/coap_jni(26451): call midOnSendReqHandler context:511443269312
//        04-10 17:01:30.312 V/coap_jni(26451): call midOnSendReqHandler end
//        04-10 17:01:30.312 V/coap_jni(26451): call midOnSendReqHandler DeleteGlobalRef
//        04-10 17:01:30.402 I/TrafficMonitor(16247): update:rxPkts:12,txPkts:14,rxBytes:1965,txBytes:6902
//        04-10 17:01:30.402 I/TrafficMonitor(16247): start expired. level:-1
//        04-10 17:01:30.402 I/TrafficMonitor(16247): gettimer:interval=2000
//        04-10 17:01:31.059 W/dumpsys (27975): type=1400 audit(0.0:92072): avc: denied { read } for name="pipe-max-size" dev="proc" ino=3518953 scontext=u:r:shell:s0 tcontext=u:object_r:proc_pipe_conf:s0 tclass=file permissive=0
//        04-10 17:01:31.223 W/sh      (27977): type=1400 audit(0.0:92073): avc: denied { search } for name="USB" dev="sysfs" ino=52082 scontext=u:r:shell:s0 tcontext=u:object_r:sysfs_power:s0 tclass=dir permissive=0
//        04-10 17:01:31.223 W/sh      (27977): type=1400 audit(0.0:92074): avc: denied { search } for name="hisi_bk_battery" dev="sysfs" ino=52140 scontext=u:r:shell:s0 tcontext=u:object_r:sysfs_power:s0 tclass=dir permissive=0
//        04-10 17:01:31.223 W/sh      (27977): type=1400 audit(0.0:92075): avc: denied { search } for name="Mains" dev="sysfs" ino=52112 scontext=u:r:shell:s0 tcontext=u:object_r:sysfs_power:s0 tclass=dir permissive=0
//        04-10 17:01:31.223 W/sh      (27977): type=1400 audit(0.0:92076): avc: denied { search } for name="Battery" dev="sysfs" ino=51978 scontext=u:r:shell:s0 tcontext=u:object_r:sysfs_power:s0 tclass=dir permissive=0
//        04-10 17:01:31.267 W/dumpsys (27980): type=1400 audit(0.0:92077): avc: denied { read } for name="pipe-max-size" dev="proc" ino=3518953 scontext=u:r:shell:s0 tcontext=u:object_r:proc_pipe_conf:s0 tclass=file permissive=0
//        04-10 17:01:31.316 V/coap_jni(26451): cancelMessage contextId:511443269312
//        04-10 17:01:31.316 V/coap_jni(26451): cancelMessage msgid:11
//        04-10 17:01:31.326 W/AlcsCoAPMessage(26451): update your code to supply an RFC 7252 compliant URI including a scheme
//        04-10 17:01:31.329 V/coap_jni(26451): initRequest contextId:511443269312
//        04-10 17:01:31.329 V/coap_jni(26451): initCPPCoapMessage cxtId id:511443269312
//        04-10 17:01:31.329 V/coap_jni(26451): msgid:-1
//        04-10 17:01:31.329 V/coap_jni(26451): code:1
//        04-10 17:01:31.329 V/coap_jni(26451): type:1
//        04-10 17:01:31.329 V/coap_jni(26451): payload:{"id":"11","version":"1.0","method":"device.info.notify","params":{"awssVer":{"smartconfig":"2.0","zconfig":"2.0","router":"2.0","ap":"2.0"},"productKey":"a1rKG9FRoKY","deviceName":"a02eb789fc4947908081e366d6e2ad55","mac":"A057E3D0443E","ip":"192.168.4.67","cipherType":4,"token":"MDF1JF4Y57YG2B552263HHMD024VUR8H","remainTime":39215,"type":0}}
//        04-10 17:01:31.329 V/coap_jni(26451): payloadlen:344
//        04-10 17:01:31.329 V/coap_jni(26451): getToken value null
//        04-10 17:01:31.329 V/coap_jni(26451): midIsMulCast:1
//        04-10 17:01:31.329 V/coap_jni(26451): alcs_msg_init start
//        04-10 17:01:31.329 V/coap_jni(26451): alcs_msg_init msgdid:12
//        04-10 17:01:31.330 V/coap_jni(26451): alcs_msg_init code:1
//        04-10 17:01:31.330 V/coap_jni(26451): alcs_msg_init type:1
//        04-10 17:01:31.330 V/coap_jni(26451): alcs_msg_init userdata:12
//        04-10 17:01:31.330 V/coap_jni(26451): alcs_msg_init payloadlen:344
//        04-10 17:01:31.330 V/coap_jni(26451): alcs_msg_init keep:1
//        04-10 17:01:31.330 V/coap_jni(26451): alcs_msg_init token:趻縊
//        04-10 17:01:31.330 V/coap_jni(26451): alcs_msg_init tokenlen:4
//        04-10 17:01:31.330 V/coap_jni(26451): addstringoption msgid:12
//        04-10 17:01:31.330 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:31.330 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:31.330 V/coap_jni(26451): addstringoption msgid:12
//        04-10 17:01:31.330 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:31.330 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:31.330 V/coap_jni(26451): addstringoption msgid:12
//        04-10 17:01:31.330 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:31.330 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:31.330 V/coap_jni(26451): addstringoption msgid:12
//        04-10 17:01:31.330 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:31.330 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:31.330 V/coap_jni(26451): sendrequest contextId:511443269312
//        04-10 17:01:31.330 V/coap_jni(26451): sendrequest msgid:12
//        04-10 17:01:31.330 V/coap_jni(26451): sendrequest port:5683
//        04-10 17:01:31.330 V/jni_log (26451): initAlcsNetWorkAddr pdata: 192.168.4.255,len:13,port:5683
//        04-10 17:01:31.330 V/coap_jni(26451): alcs_sendmsg start
//        04-10 17:01:31.330 D/Coap    (26451): Request path is /sys/device/info/notify
//        04-10 17:01:31.330 D/Coap    (26451): The message id 12 is CON msg, add to the list first, cur list num 1
//        04-10 17:01:31.330 D/Coap    (26451): The message 12 need keep
//        04-10 17:01:31.332 D/Coap    (26451): --------Dump Received Message------
//        04-10 17:01:31.332 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:31.332 D/Coap    (26451): Version     : 1
//        04-10 17:01:31.332 D/Coap    (26451): Code        : 0.01(0x1)
//        04-10 17:01:31.332 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:31.332 D/Coap    (26451): Msgid       : 12
//        04-10 17:01:31.332 D/Coap    (26451): Option      : 4
//        04-10 17:01:31.332 D/Coap    (26451): Payload Len : 344
//        04-10 17:01:31.332 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:31.332 D/Coap    (26451): Token       : DA92BF4F
//        04-10 17:01:31.332 D/Coap    (26451): Remote      : 192.168.4.67:5683
//        04-10 17:01:31.332 D/Coap    (26451): ********************************
//        04-10 17:01:31.332 D/Coap    (26451): Request path is /sys/device/info/notify
//        04-10 17:01:31.332 I/Coap    (26451): The resource /sys/device/info/notify isn't found
//        04-10 17:01:31.332 D/Coap    (26451): Send Error Response Message
//        04-10 17:01:31.332 D/Coap    (26451): Request path is
//        04-10 17:01:31.332 D/Coap    (26451): The message 12 isn't CON msg, needless to be retransmitted
//        04-10 17:01:31.332 D/Coap    (26451): CoAP transport write seccess
//        04-10 17:01:31.332 D/Coap    (26451): ---------Send a Message--------
//        04-10 17:01:31.333 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:31.333 D/Coap    (26451): Version     : 1
//        04-10 17:01:31.333 D/Coap    (26451): Code        : 4.04(0x84)
//        04-10 17:01:31.333 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:31.333 D/Coap    (26451): Msgid       : 12
//        04-10 17:01:31.333 D/Coap    (26451): Option      : 0
//        04-10 17:01:31.333 D/Coap    (26451): Payload Len : 0
//        04-10 17:01:31.333 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:31.333 D/Coap    (26451): Token       : DA92BF4F
//        04-10 17:01:31.333 D/Coap    (26451): Remote      : 192.168.4.67:5683
//        04-10 17:01:31.333 D/Coap    (26451): ********************************
//        04-10 17:01:31.333 I/Coap    (26451): gc cancel message 11 from list, cur count 1
//        04-10 17:01:31.333 D/Coap    (26451): --------Dump Received Message------
//        04-10 17:01:31.333 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:31.333 D/Coap    (26451): Version     : 1
//        04-10 17:01:31.333 D/Coap    (26451): Code        : 4.04(0x84)
//        04-10 17:01:31.333 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:31.333 D/Coap    (26451): Msgid       : 12
//        04-10 17:01:31.333 D/Coap    (26451): Option      : 0
//        04-10 17:01:31.333 D/Coap    (26451): Payload Len : 0
//        04-10 17:01:31.333 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:31.333 D/Coap    (26451): Token       : DA92BF4F
//        04-10 17:01:31.333 D/Coap    (26451): Remote      : 192.168.4.67:5683
//        04-10 17:01:31.333 D/Coap    (26451): ********************************
//        04-10 17:01:31.333 D/Coap    (26451): Find the message id 12, It need keep
//        04-10 17:01:31.333 D/Coap    (26451):
//        04-10 17:01:31.333 D/Coap    (26451): CoAP Observe Client Max Number 255, Cur Number 0
//        04-10 17:01:31.333 D/Coap    (26451): Call the response message callback 0x770fc34e10
//        04-10 17:01:31.333 V/coap_jni(26451): sendMsgHandler start responseResult 0:
//        04-10 17:01:31.335 D/Coap    (26451): CoAP transport write seccess
//        04-10 17:01:31.335 D/Coap    (26451): ---------Send a Message--------
//        04-10 17:01:31.335 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:31.335 D/Coap    (26451): Version     : 1
//        04-10 17:01:31.335 D/Coap    (26451): Code        : 0.01(0x1)
//        04-10 17:01:31.335 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:31.335 D/Coap    (26451): Msgid       : 12
//        04-10 17:01:31.335 D/Coap    (26451): Option      : 4
//        04-10 17:01:31.335 D/Coap    (26451): Payload Len : 344
//        04-10 17:01:31.335 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:31.335 D/Coap    (26451): Token       : DA92BF4F
//        04-10 17:01:31.335 D/Coap    (26451): Remote      : 192.168.4.255:5683
//        04-10 17:01:31.335 D/Coap    (26451): ********************************
//        04-10 17:01:31.335 V/coap_jni(26451): alcs_sendmsg end ret:0
//        04-10 17:01:31.335 V/coap_jni(26451): uninitmsg msgid:12
//        04-10 17:01:31.335 V/coap_jni(26451): alcs_msg_deinit start
//        04-10 17:01:31.335 V/coap_jni(26451): alcs_msg_deinit end
//        04-10 17:01:31.335 V/coap_jni_VmToEnv(26451): AttachCurrentThread success
//        04-10 17:01:31.335 V/coap_jni_VmToEnv(26451): get
//        04-10 17:01:31.335 V/coap_jni(26451): clazzCoAP NewGlobalRef start
//        04-10 17:01:31.335 V/coap_jni(26451): getmethod onSendRequestComplete start
//        04-10 17:01:31.335 V/coap_jni(26451): call midOnSendReqHandler addr:192.168.4.67
//        04-10 17:01:31.335 V/coap_jni(26451): call midOnSendReqHandler userdata to msgId:12
//        04-10 17:01:31.335 V/coap_jni(26451): call midOnSendReqHandler userdata to msgId:12
//        04-10 17:01:31.335 V/coap_jni(26451): clazzCoAPResponse start
//        04-10 17:01:31.335 V/coap_jni(26451): GetMethodID clazzCoAPResponse init start
//        04-10 17:01:31.335 V/coap_jni(26451): message code:132
//        04-10 17:01:31.335 V/coap_jni(26451): initJavaCoAPMessage message id:12
//        04-10 17:01:31.336 V/coap_jni(26451): message type:1
//        04-10 17:01:31.336 V/coap_jni(26451): SetByteArrayRegion tokenlen:4
//        04-10 17:01:31.336 V/coap_jni(26451): SetByteArrayRegion setPayload:0
//        04-10 17:01:31.336 V/coap_jni(26451): options count:0
//        04-10 17:01:31.336 V/coap_jni(26451): CallObjectMethod setoptions
//        04-10 17:01:31.336 V/coap_jni(26451): call midOnSendReqHandler context:511443269312
//        04-10 17:01:31.341 V/coap_jni(26451): call midOnSendReqHandler end
//        04-10 17:01:31.341 V/coap_jni(26451): call midOnSendReqHandler DeleteGlobalRef
//        04-10 17:01:31.939 D/HwWifiStatStore(16816): handleMessage : 200
//        04-10 17:01:32.405 I/TrafficMonitor(16247): update:rxPkts:10,txPkts:13,rxBytes:4998,txBytes:1861
//        04-10 17:01:32.406 I/TrafficMonitor(16247): start expired. level:-1
//        04-10 17:01:32.406 I/TrafficMonitor(16247): gettimer:interval=2000
//        04-10 17:01:32.435 I/Net.5084NetworkSpeedMan(16608): mIsStop = false
//        04-10 17:01:32.436 I/Net.5085NetworkSpeedMan(16608):  runInThread getTetherStats
//        04-10 17:01:32.440 I/Net.5085NetworkSpeedMan(16608):  runInUI refreshSpeed
//        04-10 17:01:32.441 I/Net.5085NetworkSpeedMan(16608): value=4436.0speed = 4.3
//        04-10 17:01:32.441 I/Net.5085NetworkSpeedMan(16608): K/smIsShowLastSpeedValuefalse
//        04-10 17:01:32.441 I/NetworkSpeedView(16608): /update(), speed=4.3
//        04-10 17:01:32.441 I/NetworkSpeedView(16608): K/s
//        04-10 17:01:32.442 I/chatty  (16608): uid=10030(com.huawei.desktop.systemui) com.android.systemui identical 1 line
//        04-10 17:01:32.443 I/NetworkSpeedView(16608): /update(), speed=4.3
//        04-10 17:01:32.443 I/NetworkSpeedView(16608): K/s
//        04-10 17:01:32.445 V/coap_jni(26451): cancelMessage contextId:511443269312
//        04-10 17:01:32.445 V/coap_jni(26451): cancelMessage msgid:12
//        04-10 17:01:32.455 W/AlcsCoAPMessage(26451): update your code to supply an RFC 7252 compliant URI including a scheme
//        04-10 17:01:32.459 V/coap_jni(26451): initRequest contextId:511443269312
//        04-10 17:01:32.460 V/coap_jni(26451): initCPPCoapMessage cxtId id:511443269312
//        04-10 17:01:32.460 V/coap_jni(26451): msgid:-1
//        04-10 17:01:32.460 V/coap_jni(26451): code:1
//        04-10 17:01:32.460 V/coap_jni(26451): type:1
//        04-10 17:01:32.460 V/coap_jni(26451): payload:{"id":"12","version":"1.0","method":"device.info.notify","params":{"awssVer":{"smartconfig":"2.0","zconfig":"2.0","router":"2.0","ap":"2.0"},"productKey":"a1rKG9FRoKY","deviceName":"a02eb789fc4947908081e366d6e2ad55","mac":"A057E3D0443E","ip":"192.168.4.67","cipherType":4,"token":"MDF1JF4Y57YG2B552263HHMD024VUR8H","remainTime":38084,"type":0}}
//        04-10 17:01:32.460 V/coap_jni(26451): payloadlen:344
//        04-10 17:01:32.460 V/coap_jni(26451): getToken value null
//        04-10 17:01:32.460 V/coap_jni(26451): midIsMulCast:1
//        04-10 17:01:32.460 V/coap_jni(26451): alcs_msg_init start
//        04-10 17:01:32.460 V/coap_jni(26451): alcs_msg_init msgdid:13
//        04-10 17:01:32.460 V/coap_jni(26451): alcs_msg_init code:1
//        04-10 17:01:32.460 W/HwKeyguardDragHelper(16608): AnimationBlocked
//        04-10 17:01:32.460 V/coap_jni(26451): alcs_msg_init type:1
//        04-10 17:01:32.460 V/coap_jni(26451): alcs_msg_init userdata:13
//        04-10 17:01:32.460 V/coap_jni(26451): alcs_msg_init payloadlen:344
//        04-10 17:01:32.460 V/coap_jni(26451): alcs_msg_init keep:1
//        04-10 17:01:32.460 V/coap_jni(26451): alcs_msg_init token:蹝縊
//        04-10 17:01:32.460 V/coap_jni(26451): alcs_msg_init tokenlen:4
//        04-10 17:01:32.462 V/coap_jni(26451): addstringoption msgid:13
//        04-10 17:01:32.462 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:32.462 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:32.462 V/coap_jni(26451): addstringoption msgid:13
//        04-10 17:01:32.462 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:32.462 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:32.462 V/coap_jni(26451): addstringoption msgid:13
//        04-10 17:01:32.462 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:32.462 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:32.462 V/coap_jni(26451): addstringoption msgid:13
//        04-10 17:01:32.462 V/coap_jni(26451): CoAPStrOption_add start
//        04-10 17:01:32.462 V/coap_jni(26451): CoAPStrOption_add end ret:0
//        04-10 17:01:32.462 V/coap_jni(26451): sendrequest contextId:511443269312
//        04-10 17:01:32.462 V/coap_jni(26451): sendrequest msgid:13
//        04-10 17:01:32.462 V/coap_jni(26451): sendrequest port:5683
//        04-10 17:01:32.463 V/jni_log (26451): initAlcsNetWorkAddr pdata: 192.168.4.255,len:13,port:5683
//        04-10 17:01:32.463 V/coap_jni(26451): alcs_sendmsg start
//        04-10 17:01:32.463 D/Coap    (26451): Request path is /sys/device/info/notify
//        04-10 17:01:32.463 D/Coap    (26451): The message id 13 is CON msg, add to the list first, cur list num 1
//        04-10 17:01:32.463 D/Coap    (26451): The message 13 need keep
//        04-10 17:01:32.463 D/Coap    (26451): --------Dump Received Message------
//        04-10 17:01:32.463 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:32.464 D/Coap    (26451): Version     : 1
//        04-10 17:01:32.464 D/Coap    (26451): Code        : 0.01(0x1)
//        04-10 17:01:32.464 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:32.464 D/Coap    (26451): Msgid       : 13
//        04-10 17:01:32.464 D/Coap    (26451): Option      : 4
//        04-10 17:01:32.464 D/Coap    (26451): Payload Len : 344
//        04-10 17:01:32.464 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:32.464 D/Coap    (26451): Token       : DB92BF4F
//        04-10 17:01:32.464 D/Coap    (26451): Remote      : 192.168.4.67:5683
//        04-10 17:01:32.464 D/Coap    (26451): ********************************
//        04-10 17:01:32.464 D/Coap    (26451): Request path is /sys/device/info/notify
//        04-10 17:01:32.464 I/Coap    (26451): The resource /sys/device/info/notify isn't found
//        04-10 17:01:32.464 D/Coap    (26451): Send Error Response Message
//        04-10 17:01:32.464 D/Coap    (26451): Request path is
//        04-10 17:01:32.464 D/Coap    (26451): The message 13 isn't CON msg, needless to be retransmitted
//        04-10 17:01:32.467 D/Coap    (26451): CoAP transport write seccess
//        04-10 17:01:32.467 D/Coap    (26451): ---------Send a Message--------
//        04-10 17:01:32.467 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:32.467 D/Coap    (26451): Version     : 1
//        04-10 17:01:32.467 D/Coap    (26451): Code        : 0.01(0x1)
//        04-10 17:01:32.467 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:32.467 D/Coap    (26451): Msgid       : 13
//        04-10 17:01:32.467 D/Coap    (26451): Option      : 4
//        04-10 17:01:32.468 D/Coap    (26451): Payload Len : 344
//        04-10 17:01:32.468 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:32.468 D/Coap    (26451): Token       : DB92BF4F
//        04-10 17:01:32.468 D/Coap    (26451): Remote      : 192.168.4.255:5683
//        04-10 17:01:32.468 D/Coap    (26451): ********************************
//        04-10 17:01:32.468 V/coap_jni(26451): alcs_sendmsg end ret:0
//        04-10 17:01:32.468 V/coap_jni(26451): uninitmsg msgid:13
//        04-10 17:01:32.468 V/coap_jni(26451): alcs_msg_deinit start
//        04-10 17:01:32.468 V/coap_jni(26451): alcs_msg_deinit end
//        04-10 17:01:32.470 D/Coap    (26451): CoAP transport write seccess
//        04-10 17:01:32.470 D/Coap    (26451): ---------Send a Message--------
//        04-10 17:01:32.470 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:32.470 D/Coap    (26451): Version     : 1
//        04-10 17:01:32.470 D/Coap    (26451): Code        : 4.04(0x84)
//        04-10 17:01:32.470 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:32.470 D/Coap    (26451): Msgid       : 13
//        04-10 17:01:32.470 D/Coap    (26451): Option      : 0
//        04-10 17:01:32.470 D/Coap    (26451): Payload Len : 0
//        04-10 17:01:32.470 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:32.470 D/Coap    (26451): Token       : DB92BF4F
//        04-10 17:01:32.470 D/Coap    (26451): Remote      : 192.168.4.67:5683
//        04-10 17:01:32.470 D/Coap    (26451): ********************************
//        04-10 17:01:32.470 I/Coap    (26451): gc cancel message 12 from list, cur count 1
//        04-10 17:01:32.470 D/Coap    (26451): --------Dump Received Message------
//        04-10 17:01:32.470 D/Coap    (26451): *********Message Info**********
//        04-10 17:01:32.470 D/Coap    (26451): Version     : 1
//        04-10 17:01:32.470 D/Coap    (26451): Code        : 4.04(0x84)
//        04-10 17:01:32.470 D/Coap    (26451): Type        : 0x1
//        04-10 17:01:32.470 D/Coap    (26451): Msgid       : 13
//        04-10 17:01:32.470 D/Coap    (26451): Option      : 0
//        04-10 17:01:32.470 D/Coap    (26451): Payload Len : 0
//        04-10 17:01:32.470 D/Coap    (26451): Token Len   : 4
//        04-10 17:01:32.470 D/Coap    (26451): Token       : DB92BF4F
//        04-10 17:01:32.470 D/Coap    (26451): Remote      : 192.168.4.67:5683
//        04-10 17:01:32.470 D/Coap    (26451): ********************************
//        04-10 17:01:32.470 D/Coap    (26451): Find the message id 13, It need keep
//        04-10 17:01:32.470 D/Coap    (26451):
//        04-10 17:01:32.470 D/Coap    (26451): CoAP Observe Client Max Number 255, Cur Number 0
//        04-10 17:01:32.470 D/Coap    (26451): Call the response message callback 0x770fc34e10
//        04-10 17:01:32.470 V/coap_jni(26451): sendMsgHandler start responseResult 0:
//        04-10 17:01:32.471 V/coap_jni_VmToEnv(26451): AttachCurrentThread success
//        04-10 17:01:32.471 V/coap_jni_VmToEnv(26451): get
//        04-10 17:01:32.471 V/coap_jni(26451): clazzCoAP NewGlobalRef start
//        04-10 17:01:32.471 V/coap_jni(26451): getmethod onSendRequestComplete start
//        04-10 17:01:32.471 V/coap_jni(26451): call midOnSendReqHandler addr:192.168.4.67
//        04-10 17:01:32.471 V/coap_jni(26451): call midOnSendReqHandler userdata to msgId:13
//        04-10 17:01:32.471 V/coap_jni(26451): call midOnSendReqHandler userdata to msgId:13
//        04-10 17:01:32.471 V/coap_jni(26451): clazzCoAPResponse start
//        04-10 17:01:32.471 V/coap_jni(26451): GetMethodID clazzCoAPResponse init start
//        04-10 17:01:32.472 V/coap_jni(26451): message code:132
//        04-10 17:01:32.472 V/coap_jni(26451): initJavaCoAPMessage message id:13
//        04-10 17:01:32.472 V/coap_jni(26451): message type:1
//        04-10 17:01:32.472 V/coap_jni(26451): SetByteArrayRegion tokenlen:4
//        04-10 17:01:32.472 V/coap_jni(26451): SetByteArrayRegion setPayload:0
//        04-10 17:01:32.472 V/coap_jni(26451): options count:0
//        04-10 17:01:32.472 V/coap_jni(26451): CallObjectMethod setoptions
//        04-10 17:01:32.472 V/coap_jni(26451): call midOnSendReqHandler context:511443269312
//        04-10 17:01:32.480 V/coap_jni(26451): call midOnSendReqHandler end
//        04-10 17:01:32.480 V/coap_jni(26451): call midOnSendReqHandler DeleteGlobalRef
//        04-10 17:01:32.493 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.495 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 5 lines
//        04-10 17:01:32.495 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.595 W/System.err(26451): 宸叉柇寮€杩炴帴 (32109) - java.io.EOFException
//        04-10 17:01:32.595 W/System.err(26451): 	at org.eclipse.paho.client.mqttv3.internal.CommsReceiver.run(CommsReceiver.java:198)
//        04-10 17:01:32.595 W/System.err(26451): 	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:458)
//        04-10 17:01:32.595 W/System.err(26451): 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
//        04-10 17:01:32.595 W/System.err(26451): 	at java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:301)
//        04-10 17:01:32.595 W/System.err(26451): 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
//        04-10 17:01:32.595 W/System.err(26451): 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
//        04-10 17:01:32.595 W/System.err(26451): 	at java.lang.Thread.run(Thread.java:784)
//        04-10 17:01:32.595 W/System.err(26451): Caused by: java.io.EOFException
//        04-10 17:01:32.595 W/System.err(26451): 	at java.io.DataInputStream.readByte(DataInputStream.java:270)
//        04-10 17:01:32.595 W/System.err(26451): 	at org.eclipse.paho.client.mqttv3.internal.wire.MqttInputStream.readMqttWireMessage(MqttInputStream.java:92)
//        04-10 17:01:32.595 W/System.err(26451): 	at org.eclipse.paho.client.mqttv3.internal.CommsReceiver.run(CommsReceiver.java:150)
//        04-10 17:01:32.595 W/System.err(26451): 	... 6 more
//        04-10 17:01:32.591 W/dumpsys (27985): type=1400 audit(0.0:92078): avc: denied { read } for name="pipe-max-size" dev="proc" ino=3518953 scontext=u:r:shell:s0 tcontext=u:object_r:proc_pipe_conf:s0 tclass=file permissive=0
//        04-10 17:01:32.604 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.606 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 5 lines
//        04-10 17:01:32.606 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.641 D/FingerprintActionsListener(16247): touchDownIsValid MotionEvent.ACTION_DOWN
//        04-10 17:01:32.642 D/FingerprintActionsListener(16247): touchDownIsValidLazyMode = false  touchDownIsValidHiBoard = false
//        04-10 17:01:32.708 V/AudioManager(26451): playSoundEffect   effectType: 0
//        04-10 17:01:32.708 V/AudioManager(26451): querySoundEffectsEnabled...
//        04-10 17:01:32.713 W/VRSystemServiceManager(16247): vr service is not alive
//        04-10 17:01:32.714 I/ActivityManager(16247): START u0 {cmp=com.ndtlg.pettime/com.mdx.framework.activity.TitleAct (has extras)} from uid 10157
//        04-10 17:01:32.714 I/ActivityManager(16247): ActivityRecord info: ActivityInfo{83b1115 com.mdx.framework.activity.TitleAct}
//        04-10 17:01:32.721 V/WindowManager(16247): addAppToken: AppWindowToken{5c090f6 token=Token{c48a991 ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}}} controller={TaskWindowContainerController taskId=311} at 2147483647
//        04-10 17:01:32.721 I/PGServer(16855): android calls fast hibernateApps
//        04-10 17:01:32.721 I/AppFastHibernation(16855): fast hibernate duration: 1500 reason: start activity
//        04-10 17:01:32.722 I/Pged-IPgedBinderService(  731): ****action is 1, pid num is 5***
//        04-10 17:01:32.722 I/Pged-Freezer(  731): freezePids
//        04-10 17:01:32.722 I/Pged-Freezer(  731): Freeze process: 18851
//        04-10 17:01:32.723 I/Pged-Freezer(  731): Freeze process: 24991
//        04-10 17:01:32.723 I/Pged-Freezer(  731): Freeze process: 24589
//        04-10 17:01:32.723 D/        (  651): doWinFrameOptStatusRecog begin to recog Layer result=2
//        04-10 17:01:32.723 I/Pged-Freezer(  731): Freeze process: 24609
//        04-10 17:01:32.723 D/PgedBinderAdapter(16855): frz ok, pid: [18851, 24991, 24589, 24609]
//        04-10 17:01:32.728 D/ZrHung.AppEyeUiProbe(26451): stop checker.
//        04-10 17:01:32.729 V/ActivityManager(16247): Making visible and scheduling visibility: ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}
//        04-10 17:01:32.729 D/HwPhoneWindowManager(16247): sensorRotation = -1 lastRotation:0
//        04-10 17:01:32.732 D/ZrHung.AppEyeFocusWindow(16247): FocusWindowErrorScene CheckFreezeScreen
//        04-10 17:01:32.734 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.734 V/WindowManager(16247): Checking 1 opening apps (frozen=false timeout=false), Track: activitypause performsurface
//        04-10 17:01:32.735 V/WindowManager(16247): Check opening app=AppWindowToken{5c090f6 token=Token{c48a991 ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}}}: allDrawn=false startingDisplayed=false startingMoved=false isRelaunching()=false startingWindow=null
//        04-10 17:01:32.735 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 10 lines
//        04-10 17:01:32.735 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.736 W/ActivityThread(26451): handleWindowVisibility: no activity for token android.os.BinderProxy@a547960
//04-10 17:01:32.736 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@ae5a2e6 for activityLifeState under user 0 cost 1
//        04-10 17:01:32.736 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.736 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 10 lines
//        04-10 17:01:32.736 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.736 D/ZrHung.AppEyeUiProbe(26451): notify runnable to start.
//        04-10 17:01:32.737 V/ActivityThread(26451): Skipping new config:{1.0 ?mcc?mnc [zh_CN_#Hans] ldltr sw360dp w360dp h719dp 480dpi nrml long hdr port finger -keyb/v/h -nav/h winConfig={ mBounds=Rect(0, 0 - 0, 0) mAppBounds=Rect(0, 85 - 1080, 2244) mWindowingMode=fullscreen mActivityType=undefined} nonFullScreen=0 suim:1 s.7}, config:{1.0 ?mcc?mnc [zh_CN_#Hans] ldltr sw360dp w360dp h719dp 480dpi nrml long hdr port finger -keyb/v/h -nav/h winConfig={ mBounds=Rect(0, 0 - 0, 0) mAppBounds=Rect(0, 85 - 1080, 2244) mWindowingMode=fullscreen mActivityType=undefined} nonFullScreen=0 suim:1 s.7} for app:com.ndtlg.pettime
//        04-10 17:01:32.738 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.744 V/ActivityThread(26451): callActivityOnCreate
//        04-10 17:01:32.739 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 5 lines
//        04-10 17:01:32.739 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.746 D/HiTouch_PressGestureDetector(26451): HiTouch on notch display, height corret:85
//        04-10 17:01:32.750 I/FLTAG_FM(26451): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.750 I/FLTAG_SFM(26451): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.750 D/FeatureFactory(26451): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.750 D/FeatureFactory(26451): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:32.751 D/HwSplineOverScrollerExImpl(26451): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@320abb6,com.mdx.framework.activity.TitleAct@dfec0b7
//04-10 17:01:32.751 D/HwSplineOverScrollerExImpl(26451): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:32.751 I/FLTAG_FM(26451): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.751 I/FLTAG_SFM(26451): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.751 D/FeatureFactory(26451): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.751 D/FeatureFactory(26451): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:32.751 D/HwSplineOverScrollerExImpl(26451): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@c34b153,com.mdx.framework.activity.TitleAct@dfec0b7
//04-10 17:01:32.751 D/HwSplineOverScrollerExImpl(26451): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:32.761 D/frame   (26451): com.ndtlg.pettime.frg.FrgAddDevice
//        04-10 17:01:32.761 D/frame   (26451): showfragment
//        04-10 17:01:32.762 D/ActivityThread(26451): add activity client record, r= ActivityRecord{4aabf89 token=android.os.BinderProxy@a547960 {com.ndtlg.pettime/com.mdx.framework.activity.TitleAct}} token= android.os.BinderProxy@a547960
//04-10 17:01:32.768 I/frame   (26451): class:
//
//class com.ndtlg.pettime.frg.FrgAddDevice
//        04-10 17:01:32.772 W/VRSystemServiceManager(16247): vr service is not alive
//        04-10 17:01:32.772 I/ActivityManager(16247): START u0 {act=android.content.pm.action.REQUEST_PERMISSIONS pkg=com.android.packageinstaller cmp=com.android.packageinstaller/.permission.ui.GrantPermissionsActivity (has extras)} from uid 10157
//        04-10 17:01:32.773 I/ActivityManager(16247): ActivityRecord info: ActivityInfo{36cdcf7 com.android.packageinstaller.permission.ui.GrantPermissionsActivity}
//        04-10 17:01:32.774 I/hibernation(16855): front pkg : com.android.packageinstaller launcher: false
//        04-10 17:01:32.774 I/hibernation(16855): above launcher front pkgs: [com.ndtlg.pettime, com.android.packageinstaller]
//        04-10 17:01:32.775 V/WindowManager(16247): addAppToken: AppWindowToken{9dcc682 token=Token{abd4dcd ActivityRecord{eb78764 u0 com.android.packageinstaller/.permission.ui.GrantPermissionsActivity t311}}} controller={TaskWindowContainerController taskId=311} at 2147483647
//        04-10 17:01:32.776 D/        (  651): doWinFrameOptStatusRecog begin to recog Layer result=2
//        04-10 17:01:32.784 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.788 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 29 lines
//        04-10 17:01:32.788 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.796 D/skia    (26451): external skia thread pool create.
//        04-10 17:01:32.833 D/HwRecentsTaskUtils(16885): refreshToCache
//        04-10 17:01:32.833 D/HwRecentsTaskUtils(16885): searchFromDate
//        04-10 17:01:32.837 E/HsmCoreServiceImpl(16772): onTransact in code is: 103
//        04-10 17:01:32.837 I/MediaProcessHandler(16772): playingUids:
//        04-10 17:01:32.839 I/RecentsTaskLoadPlan(16885): to show tasks size is 4
//        04-10 17:01:32.842 D/ZrHung.AppEyeUiProbe(26451): notify runnable to start.
//        04-10 17:01:32.846 D/OpenGLRenderer(26451):   HWUI Binary is  enabled
//        04-10 17:01:32.846 D/OpenGLRenderer(26451): disableOutlineDraw is true
//        04-10 17:01:32.846 D/HwAppInnerBoostImpl(26451): asyncReportData com.ndtlg.pettime,2,1,1,0 interval=204
//        04-10 17:01:32.848 E/uniperf server(  633): uniPerfEvent doParse failed, cmdId=4400
//        04-10 17:01:32.848 D/uniperf hal(  633): do uniPerfEvent failed, cmdId=4400, ret=2
//        04-10 17:01:32.849 V/WindowManager(16247): addWindow: Window{cdc73ef u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct}
//        04-10 17:01:32.849 D/HwGameAssistantController(16247): pid=26451, uid=10157, component=ComponentInfo{com.ndtlg.pettime/com.mdx.framework.activity.TitleAct}
//        04-10 17:01:32.850 D/        (  651): doWinFrameOptStatusRecog begin to recog Layer result=2
//        04-10 17:01:32.850 D/HISTREAM_WECHAT(16247): activityResumed:pid=26451, uid=10157, component=ComponentInfo{com.ndtlg.pettime/com.mdx.framework.activity.TitleAct}
//        04-10 17:01:32.850 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorVideoScence input :com.ndtlg.pettime,com.mdx.framework.activity.TitleAct
//        04-10 17:01:32.850 D/HISTREAM_WECHAT(16247): mHwAPPQoEAPKConfig is null
//        04-10 17:01:32.850 D/HwGameAssistantController(16247): UPDATE: mCurFgPkg=com.ndtlg.pettime, mCurFgPid=26451, mCurIsGame=false
//        04-10 17:01:32.850 D/HiData_HwAPPQoEActivityMonitor(16247): handleActivityChange,  curPackage:com.ndtlg.pettime, curClass:com.mdx.framework.activity.TitleAct
//        04-10 17:01:32.850 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorAPKScence input :com.ndtlg.pettime,com.mdx.framework.activity.TitleAct
//        04-10 17:01:32.850 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorAPKScence input :com.ndtlg.pettime,null
//        04-10 17:01:32.850 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorGameScence input :com.ndtlg.pettime
//        04-10 17:01:32.850 D/HiData_HwAPPQoEActivityMonitor(16247): handleActivityChange, it is not a care app or scence
//        04-10 17:01:32.850 D/HiData_HwAPPQoEActivityMonitor(16247): handleActivityChange,  curr mAppType:-1, lastType:-1
//        04-10 17:01:32.850 I/OPCollectLog(16816): AppChangeImpl:pid: 26451 uid: 10157 pkg: com.ndtlg.pettime class: com.mdx.framework.activity.TitleAct
//        04-10 17:01:32.850 E/OPCollectLog(16816): HwForegroundAppAction:duplicate pkgName.
//        04-10 17:01:32.850 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@ae5a2e6 for activityLifeState under user 0 cost 0
//        04-10 17:01:32.852 D/ZrHung.AppEyeUiProbe(26451): stop checker.
//        04-10 17:01:32.853 V/ActivityManager(16247): Making visible and scheduling visibility: ActivityRecord{eb78764 u0 com.android.packageinstaller/.permission.ui.GrantPermissionsActivity t311}
//        04-10 17:01:32.853 D/HwPhoneWindowManager(16247): sensorRotation = -1 lastRotation:0
//        04-10 17:01:32.854 I/AppFastHibernation(16855): rev freeze exception for visible pkg: com.android.packageinstaller
//        04-10 17:01:32.854 W/ActivityThread(25572): handleWindowVisibility: no activity for token android.os.BinderProxy@5f32129
//        04-10 17:01:32.856 E/AwareLog(16855): SPKSchedFeature: Uid has been sent, ignore.
//        04-10 17:01:32.859 W/HwActivityManagerServiceEx(16247): appSwitch from: com.ndtlg.pettime to: com.android.packageinstaller
//        04-10 17:01:32.860 D/ZrHung.AppEyeUiProbe(25572): notify runnable to start.
//        04-10 17:01:32.860 D/ZrHung.AppEyeUiProbe(25572): restart watching
//        04-10 17:01:32.860 V/ActivityThread(25572): Skipping new config:{1.0 ?mcc?mnc [zh_CN_#Hans] ldltr sw360dp w360dp h719dp 480dpi nrml long hdr port finger -keyb/v/h -nav/h winConfig={ mBounds=Rect(0, 0 - 0, 0) mAppBounds=Rect(0, 85 - 1080, 2244) mWindowingMode=fullscreen mActivityType=undefined} nonFullScreen=0 suim:1 s.7}, config:{1.0 ?mcc?mnc [zh_CN_#Hans] ldltr sw360dp w360dp h719dp 480dpi nrml long hdr port finger -keyb/v/h -nav/h winConfig={ mBounds=Rect(0, 0 - 0, 0) mAppBounds=Rect(0, 85 - 1080, 2244) mWindowingMode=fullscreen mActivityType=undefined} nonFullScreen=0 suim:1 s.7} for app:com.android.packageinstaller
//        04-10 17:01:32.860 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@f13f060 for appSwitch under user 0 cost 0
//        04-10 17:01:32.860 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@8fac919 for appSwitch under user 0 cost 0
//        04-10 17:01:32.860 D/AssistantService-901302(16772): registerHwActivityNotifier call fromPackage:com.ndtlg.pettime, toPackage:com.android.packageinstaller
//        04-10 17:01:32.860 D/AssistantService-901302(16772): getAppSDKType packageName:com.ndtlg.pettime, type:0
//        04-10 17:01:32.860 D/AssistantService-901302(16772): appInJoint:0
//        04-10 17:01:32.860 D/AssistantService-901302(16772): issystemapp:com.android.packageinstaller
//        04-10 17:01:32.861 D/ScenarioService(16855): front pkg : com.android.packageinstaller launcher: false
//        04-10 17:01:32.861 D/ScenarioService(16855): new above launcher front pkgs: [com.ndtlg.pettime, com.android.packageinstaller]
//        04-10 17:01:32.861 I/AppManager(16855): handleAppFrontEvent: com.android.packageinstaller
//        04-10 17:01:32.862 I/GpsController(16855): com.ndtlg.pettime is above launcher app, just return...
//        04-10 17:01:32.862 V/WindowManager(16247): Checking 2 opening apps (frozen=false timeout=false), Track: activitypause performsurface
//        04-10 17:01:32.862 V/WindowManager(16247): Check opening app=AppWindowToken{5c090f6 token=Token{c48a991 ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}}}: allDrawn=false startingDisplayed=false startingMoved=false isRelaunching()=false startingWindow=null
//        04-10 17:01:32.863 I/AppsUsage(16855): scnOff:false FgAPP:com.android.packageinstaller BgAPP:com.ndtlg.pettime
//        04-10 17:01:32.863 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@ae5a2e6 for activityLifeState under user 0 cost 0
//        04-10 17:01:32.864 D/EmcomManagerService(16772): forePackage name is com.android.packageinstaller
//        04-10 17:01:32.864 D/HicomMonitor(16772): notifyForegroundAppChanged: begin
//        04-10 17:01:32.864 D/XEngineProcessor(16772): onForegroundAppChanged, pkgName:com.android.packageinstaller
//        04-10 17:01:32.864 D/XEngineProcessor(16772): handlerAppForeground pkgName = com.android.packageinstallermDaemonVersion = 2
//        04-10 17:01:32.864 I/PGServer(16855): report state:10000 event type:2 pid:0 uid:0 pkg:com.ndtlg.pettime to pid: 16855
//        04-10 17:01:32.864 I/SceneReceiver(16855): state type: 10000 eventType:2 pid:0 uid:0 pkg:com.ndtlg.pettime
//        04-10 17:01:32.864 I/PGServer(16855): report state:10000 event type:2 pid:0 uid:0 pkg:com.ndtlg.pettime to pid: 16247
//        04-10 17:01:32.864 I/PGServer(16855): report state:10000 event type:1 pid:0 uid:0 pkg:com.android.packageinstaller to pid: 16855
//        04-10 17:01:32.864 I/SceneReceiver(16855): state type: 10000 eventType:1 pid:0 uid:0 pkg:com.android.packageinstaller
//        04-10 17:01:32.864 I/PGServer(16855): report state:10000 event type:1 pid:0 uid:0 pkg:com.android.packageinstaller to pid: 16247
//        04-10 17:01:32.864 D/HwThermalStateManager(16855): current foreapp pkg : com.android.packageinstaller
//        04-10 17:01:32.864 D/HicomdMessageAdapter(16772): getHicomAppInfoByName. current mHicomAppInfos : [packageName=com.ss.android.article.video, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.sina.weibo, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.tencent.mm, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.sdu.didi.gui, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.sdu.didi.gsui, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.tencent.tmgp.sgame, grade=1, isForeground=true, mainCardPsStatus=1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[]]
//        04-10 17:01:32.864 D/XEngineProcessor(16772): configInfo = null
//        04-10 17:01:32.864 D/XEngineProcessor(16772): gameInfo = null inGameSpace false
//        04-10 17:01:32.864 D/HicomMonitor(16772): onForegroundAppChanged is called
//        04-10 17:01:32.864 D/SmartcareProc(16772): onForegroundAppChanged, pkgName:com.android.packageinstaller
//        04-10 17:01:32.864 D/HicomMonitor(16772): onForegroundAppChanged is called
//        04-10 17:01:32.865 D/AndroidRuntime(26451): Shutting down VM
//        04-10 17:01:32.865 V/ActivityThread(25572): callActivityOnCreate
//        04-10 17:01:32.866 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.866 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:32.866 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.866 D/HiDATA_ContentAware(16247): mForegroundAppPackageName: com.android.packageinstaller ,score: 0
//        04-10 17:01:32.866 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.867 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.867 D/HiDATA  (16247): onForegroundAppWifiSleepChange: config:false, sleeptime:-1,type: 255, appname:com.android.packageinstaller
//        04-10 17:01:32.867 W/VRSystemServiceManager(25572): vr service is not alive
//        04-10 17:01:32.867 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.867 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:32.867 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.867 D/MSSArbitrager(16247): setGameForeground:false
//        04-10 17:01:32.867 I/PGServer(16855): checkPkgType. calling pkg: android
//        04-10 17:01:32.867 D/HiDATA  (16247): APP type: 255 appName= com.android.packageinstaller
//        04-10 17:01:32.867 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.867 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.867 I/PGServer(16855): checkPkgType. calling pkg: android
//        04-10 17:01:32.868 D/HiDATA  (16247): no game, APP_TYPE_GAME, appName =com.android.packageinstaller
//        04-10 17:01:32.868 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.868 E/AwareLog(16855): GameSdkConfigReader: GameSdkLog: idNameMap: null
//        04-10 17:01:32.868 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.870 I/BoosterSwitchP(16772): notifyUidState do nothing
//        04-10 17:01:32.870 I/DeepNoDisturbP(16772): notifyUidState
//        04-10 17:01:32.870 I/HidataAppQoeP(16772): notifyUidState
//        04-10 17:01:32.870 I/BrowserChrP(16772): notifyUidState
//        04-10 17:01:32.873 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 16 lines
//        04-10 17:01:32.873 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.874 D/HwMultiWindowEx(16855): isInMultiWindowMode ret: 0
//        --------- beginning of crash
//        04-10 17:01:32.876 E/AndroidRuntime(26451): FATAL EXCEPTION: main
//        04-10 17:01:32.876 E/AndroidRuntime(26451): Process: com.ndtlg.pettime, PID: 26451
//        04-10 17:01:32.876 E/AndroidRuntime(26451): java.lang.RuntimeException: Error receiving broadcast Intent { act=android.net.wifi.STATE_CHANGE flg=0x4000010 (has extras) } in com.ndtlg.pettime.frg.FrgAddDevice$NetworkConnectChangedReceiver@cafba54
//04-10 17:01:32.876 E/AndroidRuntime(26451): 	at android.app.LoadedApk$ReceiverDispatcher$Args.lambda$getRunnable$0(LoadedApk.java:1558)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at android.app.-$$Lambda$LoadedApk$ReceiverDispatcher$Args$_BumDX2UKsnxLVrE6UJsJZkotuA.run(Unknown Source:2)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at android.os.Handler.handleCallback(Handler.java:891)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at android.os.Handler.dispatchMessage(Handler.java:102)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at android.os.Looper.loop(Looper.java:207)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at android.app.ActivityThread.main(ActivityThread.java:7470)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at java.lang.reflect.Method.invoke(Native Method)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:524)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:958)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'java.lang.String java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence)' on a null object reference
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at com.ndtlg.pettime.frg.FrgAddDevice$NetworkConnectChangedReceiver.onReceive(FrgAddDevice.java:253)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	at android.app.LoadedApk$ReceiverDispatcher$Args.lambda$getRunnable$0(LoadedApk.java:1545)
//        04-10 17:01:32.876 E/AndroidRuntime(26451): 	... 8 more
//        04-10 17:01:32.877 I/HwNetworkPolicy(16247): onTransact, code = 203
//        04-10 17:01:32.871 W/m.ndtlg.pettime(26451): type=1400 audit(0.0:92079): avc: granted { create } for name="1554886892877.log" scontext=u:r:untrusted_app_25:s0:c512,c768 tcontext=u:object_r:sdcardfs:s0:c512,c768 tclass=file
//        04-10 17:01:32.877 I/HwNetworkPolicyManager(17018): getHwUidPolicy uid = 10042 policy = 0
//        04-10 17:01:32.879 I/HwAudioService(16247): now type = 255,reportForegroundAppType = 255,pkg = null,systemload = 255mVoipOptimizeInGameModetrue
//        04-10 17:01:32.879 I/AudioFlinger(16163): setParameters(): io 0, keyvalue game_mode=off, calling pid 16247 calling uid 1000
//        04-10 17:01:32.880 I/audio_hw_primary(16169): soundtrigger_set_enforce voice_wake value
//        04-10 17:01:32.880 I/spk_dev_interface(16169): spk_set_parameters: use new smartpakit version
//        04-10 17:01:32.880 I/audio_hw_primary(16169): update stream types 0
//        04-10 17:01:32.880 I/audio_custom(16169): game mode exit.
//        04-10 17:01:32.880 I/dsp_soc (16169): set primary algo bypass 0 succ
//        04-10 17:01:32.881 I/m.ndtlg.pettim(26451): System.exit called, status: 2
//        04-10 17:01:32.881 I/AndroidRuntime(26451): VM exiting with result code 2, cleanup skipped.
//        04-10 17:01:32.883 E/iMonitor(  749): FaultDetect: DUMPTOOL_PRINTF return.
//        04-10 17:01:32.883 I/chatty  (  749): uid=0(root) engine identical 1 line
//        04-10 17:01:32.883 E/iMonitor(  749): FaultDetect: DUMPTOOL_PRINTF return.
//        04-10 17:01:32.883 D/HwArpVerifier(16247): check_wifi_state_mode = 0 mCheckStateToken=3 token3
//        04-10 17:01:32.883 I/iMonitor(  749): mF1name= android.app.LoadedApk$ReceiverDispatcher$Args.lambda$getRunnable$0,mF2name = android.app.-$$Lambda$LoadedApk$ReceiverDispatcher$Args$_BumDX2UKsnxLVrE6UJsJZkotuA.run
//        04-10 17:01:32.884 E/iMonitor(  749): FaultDetect: DUMPTOOL_PRINTF return.
//        04-10 17:01:32.885 I/chatty  (  749): uid=0(root) engine identical 1 line
//        04-10 17:01:32.885 E/iMonitor(  749): FaultDetect: DUMPTOOL_PRINTF return.
//        04-10 17:01:32.885 I/iMonitor(  749): create: 901001004
//        04-10 17:01:32.885 E/iMonitor(  749): FaultDetect: DUMPTOOL_PRINTF return.
//        04-10 17:01:32.886 I/iMonitor(  749): send: 901001004
//        04-10 17:01:32.886 E/iMonitor(  749): FaultDetect: DUMPTOOL_PRINTF return.
//        04-10 17:01:32.886 E/iMonitor(  749): FaultDetect: DUMPTOOL_PRINTF return.
//        04-10 17:01:32.887 D/wifiserviceimpl(16247): netmask =16777215
//        04-10 17:01:32.888 I/        (  749): DPTEST  EventId is not need Hash
//        04-10 17:01:32.889 I/FLTAG_FM(25572): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.889 I/FLTAG_SFM(25572): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.889 D/FeatureFactory(25572): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.889 D/FeatureFactory(25572): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:32.889 D/HwSplineOverScrollerExImpl(25572): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@da04447,com.android.packageinstaller.permission.ui.GrantPermissionsActivity@4795a4f
//        04-10 17:01:32.889 D/HwSplineOverScrollerExImpl(25572): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:32.889 I/FLTAG_FM(25572): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.889 I/FLTAG_SFM(25572): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.889 D/FeatureFactory(25572): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:32.889 D/FeatureFactory(25572): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:32.889 D/HwSplineOverScrollerExImpl(25572): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@b92dde3,com.android.packageinstaller.permission.ui.GrantPermissionsActivity@4795a4f
//        04-10 17:01:32.889 D/HwSplineOverScrollerExImpl(25572): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:32.897 D/HiTouch_PressGestureDetector(25572): HiTouch on notch display, height corret:85
//        04-10 17:01:32.898 D/WorkSource(18374): Insert in WorkSource{} @ 0 uid 10021 name com.google.android.gms
//        04-10 17:01:32.900 D/WorkSource(17848): Insert in WorkSource{} @ 0 uid 10021 name com.google.android.gms
//        04-10 17:01:32.900 D/PGGoogleServicePolicy(16247): prevent gms/gsf hold partial wakelock
//        04-10 17:01:32.908 D/ActivityThread(25572): add activity client record, r= ActivityRecord{9f2e035 token=android.os.BinderProxy@5f32129 {com.android.packageinstaller/com.android.packageinstaller.permission.ui.GrantPermissionsActivity}} token= android.os.BinderProxy@5f32129
//        04-10 17:01:32.901 D/PGGoogleServicePolicy(16247): prevent gms/gsf hold partial wakelock
//        04-10 17:01:32.908 D/ZrHung.AppEyeUiProbe(25572): notify runnable to start.
//        04-10 17:01:32.911 D/HwGameAssistantController(16247): pid=25572, uid=10042, component=ComponentInfo{com.android.packageinstaller/com.android.packageinstaller.permission.ui.GrantPermissionsActivity}
//        04-10 17:01:32.911 D/HISTREAM_WECHAT(16247): activityResumed:pid=25572, uid=10042, component=ComponentInfo{com.android.packageinstaller/com.android.packageinstaller.permission.ui.GrantPermissionsActivity}
//        04-10 17:01:32.911 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorVideoScence input :com.android.packageinstaller,com.android.packageinstaller.permission.ui.GrantPermissionsActivity
//        04-10 17:01:32.911 D/HISTREAM_WECHAT(16247): mHwAPPQoEAPKConfig is null
//        04-10 17:01:32.911 D/ZrHung.AppEyeUiProbe(25572): notify runnable to start.
//        04-10 17:01:32.911 D/HiData_HwAPPQoEActivityMonitor(16247): handleActivityChange,  curPackage:com.android.packageinstaller, curClass:com.android.packageinstaller.permission.ui.GrantPermissionsActivity
//        04-10 17:01:32.912 D/HwGameAssistantController(16247): UPDATE: mCurFgPkg=com.android.packageinstaller, mCurFgPid=25572, mCurIsGame=false
//        04-10 17:01:32.912 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorAPKScence input :com.android.packageinstaller,com.android.packageinstaller.permission.ui.GrantPermissionsActivity
//        04-10 17:01:32.912 D/ZrHung.AppEyeUiProbe(25572): stop checker.
//        04-10 17:01:32.912 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorAPKScence input :com.android.packageinstaller,null
//        04-10 17:01:32.912 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorGameScence input :com.android.packageinstaller
//        04-10 17:01:32.912 D/HiData_HwAPPQoEActivityMonitor(16247): handleActivityChange, it is not a care app or scence
//        04-10 17:01:32.912 D/HiData_HwAPPQoEActivityMonitor(16247): handleActivityChange,  curr mAppType:-1, lastType:-1
//        04-10 17:01:32.912 D/HWMultiGW(16247): setGateWay 192.168.4.1
//        04-10 17:01:32.912 I/OPCollectLog(16816): AppChangeImpl:pid: 25572 uid: 10042 pkg: com.android.packageinstaller class: com.android.packageinstaller.permission.ui.GrantPermissionsActivity
//        04-10 17:01:32.912 I/OPCollectLog(16816): HwForegroundAppAction:handleMessage
//        04-10 17:01:32.912 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@ae5a2e6 for activityLifeState under user 0 cost 0
//        04-10 17:01:32.912 I/OPCollectLog(16816): Action:HwForegroundAppAction executed successfully
//        04-10 17:01:32.913 W/HwActivityManagerServiceEx(16247): appSwitch from: com.android.packageinstaller to: com.ndtlg.pettime
//        04-10 17:01:32.915 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@f13f060 for appSwitch under user 0 cost 0
//        04-10 17:01:32.915 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@8fac919 for appSwitch under user 0 cost 0
//        04-10 17:01:32.915 D/AssistantService-901302(16772): registerHwActivityNotifier call fromPackage:com.android.packageinstaller, toPackage:com.ndtlg.pettime
//        04-10 17:01:32.915 E/AwareLog(  731): iawared: change_property_content open /proc/26451/task/26487/static_vip fail errno(2)!
//        04-10 17:01:32.915 D/AssistantService-901302(16772): issystemapp:com.android.packageinstaller
//        04-10 17:01:32.915 D/AssistantService-901302(16772): getAppSDKType packageName:com.ndtlg.pettime, type:0
//        04-10 17:01:32.915 D/AssistantService-901302(16772): appInJoint:0
//        04-10 17:01:32.915 E/AwareLog(  731): iawared: getProcCpuset open /proc/26451/task/26487/cpuset fail errno(2)!
//        04-10 17:01:32.915 D/HwPhoneWindowManager(16247): sensorRotation = -1 lastRotation:0
//        04-10 17:01:32.916 D/ScenarioService(16855): front pkg : com.ndtlg.pettime launcher: false
//        04-10 17:01:32.916 I/ScenarioService(16855): old above launcher pkgs: [com.ndtlg.pettime, com.android.packageinstaller] new front:com.ndtlg.pettime
//        04-10 17:01:32.916 D/ScenarioService(16855): new above launcher front pkgs: [com.ndtlg.pettime]
//        04-10 17:01:32.916 I/AppManager(16855): handleAppFrontEvent: com.ndtlg.pettime
//        04-10 17:01:32.916 I/AppsUsage(16855): scnOff:false FgAPP:com.ndtlg.pettime BgAPP:com.android.packageinstaller
//        04-10 17:01:32.916 V/WindowManager(16247): notifyAppResumed: wasStopped=false AppWindowToken{5c090f6 token=Token{c48a991 ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}}}
//        04-10 17:01:32.917 I/OPCollectLog(16816): OdmfHelper:insert dsCollectEncrypt success
//        04-10 17:01:32.917 I/ActivityManager(16247): Restarting because process died: ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}
//        04-10 17:01:32.918 W/ActivityManager(16247): Exception when starting activity com.ndtlg.pettime/com.mdx.framework.activity.TitleAct
//        04-10 17:01:32.918 W/ActivityManager(16247): android.os.DeadObjectException
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at android.os.BinderProxy.transactNative(Native Method)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at android.os.BinderProxy.transact(Binder.java:1147)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at android.app.IApplicationThread$Stub$Proxy.scheduleTransaction(IApplicationThread.java:1882)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at android.app.servertransaction.ClientTransaction.schedule(ClientTransaction.java:129)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ClientLifecycleManager.scheduleTransaction(ClientLifecycleManager.java:47)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ActivityStackSupervisor.realStartActivityLocked(ActivityStackSupervisor.java:1725)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ActivityStackSupervisor.startSpecificActivityLocked(ActivityStackSupervisor.java:1890)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ActivityStack.resumeTopActivityInnerLocked(ActivityStack.java:2994)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ActivityStack.resumeTopActivityUncheckedLocked(ActivityStack.java:2524)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ActivityStackSupervisor.resumeFocusedStackTopActivityLocked(ActivityStackSupervisor.java:2483)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ActivityStack.completePauseLocked(ActivityStack.java:1769)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ActivityStack.activityPausedLocked(ActivityStack.java:1670)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ActivityManagerService.activityPaused(ActivityManagerService.java:9195)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:224)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3628)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at com.android.server.am.HwActivityManagerService.onTransact(HwActivityManagerService.java:754)
//        04-10 17:01:32.918 W/ActivityManager(16247): 	at android.os.Binder.execTransact(Binder.java:739)
//        04-10 17:01:32.918 V/ActivityManager(16247): startProcess: name=com.ndtlg.pettime app=ProcessRecord{3d520a2 26451:com.ndtlg.pettime/u0a157} knownToBeDead=true thread=android.app.IApplicationThread$Stub$Proxy@9217f2c pid=26451
//        04-10 17:01:32.919 D/ActivityManager(16247): cleanUpApplicationRecord app: ProcessRecord{3d520a2 26451:com.ndtlg.pettime/u0a157}, app.bad: false, restarting: true, allowRestart: true
//        04-10 17:01:32.919 W/ActivityManager(16247): Force removing ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}: app died, no saved state
//        04-10 17:01:32.919 W/libprocessgroup(16247): kill(-26451, 9) failed: No such process
//        04-10 17:01:32.919 V/WindowManager(16247): removeAppToken: AppWindowToken{5c090f6 token=Token{c48a991 ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}}} delayed=true Callers=com.android.server.wm.DisplayContent.removeAppToken:1059 com.android.server.wm.AppWindowContainerController.removeContainer:301 com.android.server.am.ActivityRecord.removeWindowContainer:1152 com.android.server.am.ActivityStack.removeActivityFromHistoryLocked:4507
//        04-10 17:01:32.919 V/WindowManager(16247): removeAppToken make exiting: AppWindowToken{5c090f6 token=Token{c48a991 ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}}}
//        04-10 17:01:32.919 I/hibernation(16855): front pkg : com.ndtlg.pettime launcher: false
//        04-10 17:01:32.919 I/hibernation(16855): above launcher front pkgs: [com.ndtlg.pettime]
//        04-10 17:01:32.920 D/ZrHung.AppEyeFocusWindow(16247): FocusWindowErrorScene cancelCheckFreezeScreen
//        04-10 17:01:32.920 D/ZrHung.AppEyeTransparentWindow(16247): TransparentWindow mHungConfigStatus = 0,mHungConfigEnable = 1
//        04-10 17:01:32.920 E/AwareLog(16855): SPKSchedFeature: Uid has been sent, ignore.
//        04-10 17:01:32.920 W/ActivityManager(16247): Force removing ActivityRecord{a13802f u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}: app died, no saved state
//        04-10 17:01:32.920 D/ZrHung.AppEyeFocusWindow(16247): FocusWindowErrorScene CheckFreezeScreen
//        04-10 17:01:32.920 D/ZrHung.AppEyeTransparentWindow(16247): TransparentWindow cancelCheckFreezeScreen
//        04-10 17:01:32.921 V/WindowManager(16247): removeAppToken: AppWindowToken{cb5efc5 token=Token{eb6163c ActivityRecord{a13802f u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}} delayed=true Callers=com.android.server.wm.DisplayContent.removeAppToken:1059 com.android.server.wm.AppWindowContainerController.removeContainer:301 com.android.server.am.ActivityRecord.removeWindowContainer:1152 com.android.server.am.ActivityStack.removeActivityFromHistoryLocked:4507
//        04-10 17:01:32.921 V/WindowManager(16247): removeAppToken make exiting: AppWindowToken{cb5efc5 token=Token{eb6163c ActivityRecord{a13802f u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}}
//        04-10 17:01:32.921 I/ActivityManager(16247): startProcess: reset pid for ProcessRecord{3d520a2 0:com.ndtlg.pettime/u0a157}
//        04-10 17:01:32.922 D/AwareLog(  731): iawared: workingset_process_command subCmd = 354, uid=10157, pid=0, com.ndtlg.pettime
//        04-10 17:01:32.922 D/AwareLog(  731): iawared: workingset_send_preread_msg com.ndtlg.pettime
//        04-10 17:01:32.922 D/AwareLog(  731): iawared: workingsetStart com.ndtlg.pettime in monitor0
//        04-10 17:01:32.923 I/[HwRecSys]OdmfCollectScheduler(18197): handleMessage msg: 6
//        04-10 17:01:32.923 I/[HwRecSys]HwRecSysService(18197):  cur pkg: com.android.packageinstaller
//        04-10 17:01:32.924 V/ActivityManager(16247): startProcess: name=com.ndtlg.pettime app=ProcessRecord{3d520a2 0:com.ndtlg.pettime/u0a157} knownToBeDead=true thread=null pid=0
//        04-10 17:01:32.925 D/EmcomManagerService(16772): forePackage name is com.ndtlg.pettime
//        04-10 17:01:32.925 D/HicomMonitor(16772): notifyForegroundAppChanged: begin
//        04-10 17:01:32.925 D/XEngineProcessor(16772): onForegroundAppChanged, pkgName:com.ndtlg.pettime
//        04-10 17:01:32.925 D/XEngineProcessor(16772): handlerAppForeground pkgName = com.ndtlg.pettimemDaemonVersion = 2
//        04-10 17:01:32.926 D/HicomdMessageAdapter(16772): getHicomAppInfoByName. current mHicomAppInfos : [packageName=com.ss.android.article.video, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.sina.weibo, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.tencent.mm, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.sdu.didi.gui, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.sdu.didi.gsui, grade=1, isForeground=true, mainCardPsStatus=-1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[], packageName=com.tencent.tmgp.sgame, grade=1, isForeground=true, mainCardPsStatus=1, autoGrabParams={}, viewInfos=[], hicomFeaturesInfos=multiPath=0, multiPathType=0, multiPathTcp=0, wifiMode=0, speedCtrl=1, maxGrade=5, minGrade=1, proxy=null, smartmpConfig=null}, timeInfos=[]]
//        04-10 17:01:32.926 D/XEngineProcessor(16772): configInfo = null
//        04-10 17:01:32.926 D/XEngineProcessor(16772): gameInfo = null inGameSpace false
//        04-10 17:01:32.926 D/HicomMonitor(16772): onForegroundAppChanged is called
//        04-10 17:01:32.926 D/SmartcareProc(16772): onForegroundAppChanged, pkgName:com.ndtlg.pettime
//        04-10 17:01:32.926 D/HicomMonitor(16772): onForegroundAppChanged is called
//        04-10 17:01:32.926 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@ae5a2e6 for activityLifeState under user 0 cost 0
//        04-10 17:01:32.927 D/HwMultiWindowEx(16855): isInMultiWindowMode ret: 0
//        04-10 17:01:32.927 I/PGServer(16855): report state:10000 event type:2 pid:0 uid:0 pkg:com.android.packageinstaller to pid: 16855
//        04-10 17:01:32.927 I/SceneReceiver(16855): state type: 10000 eventType:2 pid:0 uid:0 pkg:com.android.packageinstaller
//        04-10 17:01:32.927 I/PGServer(16855): report state:10000 event type:2 pid:0 uid:0 pkg:com.android.packageinstaller to pid: 16247
//        04-10 17:01:32.927 I/PGServer(16855): report state:10000 event type:1 pid:0 uid:0 pkg:com.ndtlg.pettime to pid: 16855
//        04-10 17:01:32.927 I/SceneReceiver(16855): state type: 10000 eventType:1 pid:0 uid:0 pkg:com.ndtlg.pettime
//        04-10 17:01:32.927 I/PGServer(16855): report state:10000 event type:1 pid:0 uid:0 pkg:com.ndtlg.pettime to pid: 16247
//        04-10 17:01:32.928 I/PGServer(16855): checkPkgType. calling pkg: android
//        04-10 17:01:32.928 I/PGServer(16855): checkPkgType. calling pkg: android
//        04-10 17:01:32.929 D/HwThermalStateManager(16855): current foreapp pkg : com.ndtlg.pettime
//        04-10 17:01:32.929 E/HwActivityManagerServiceEx(16247): getProcessRecordFromMTM process info is null ,mUid :26451
//        04-10 17:01:32.932 E/HsmCoreServiceImpl(16772): onTransact in code is: 102
//        04-10 17:01:32.932 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.932 I/MediaProcessHandler(16772): processOp opType: 1, uid: 10157, pid: 26451
//        04-10 17:01:32.932 W/MediaProcessHandler(16772): remove target not exist, maybe the UI process: uid: 10157, pid: 26451
//        04-10 17:01:32.932 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.932 I/MediaProcessHandler(16772): executedCallBack opType: 1 mMediaStatusObservers.size=0
//        04-10 17:01:32.932 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.933 V/BroadcastQueue(16247): Finished with ordered broadcast BroadcastRecord{e561901 u0 android.intent.action.DROPBOX_ENTRY_ADDED}
//        04-10 17:01:32.934 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 11 lines
//        04-10 17:01:32.934 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.934 W/AwareLog(16855): SmartIO2DMEPlugin: unknown process state: 2
//        04-10 17:01:32.934 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.936 I/BoosterSwitchP(16772): notifyUidState do nothing
//        04-10 17:01:32.936 I/DeepNoDisturbP(16772): notifyUidState
//        04-10 17:01:32.936 I/HidataAppQoeP(16772): notifyUidState
//        04-10 17:01:32.936 I/BrowserChrP(16772): notifyUidState
//        04-10 17:01:32.944 I/ActivityManager(16247): Start proc 28012:com.ndtlg.pettime/u0a157 for activity com.ndtlg.pettime/com.mdx.framework.activity.TitleAct
//        04-10 17:01:32.944 E/ProcessInfoCollector(16247): getProcessInfo: failed to find this proc
//        04-10 17:01:32.936 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 3 lines
//        04-10 17:01:32.936 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.945 W/InputDispatcher(16247): channel '47f527d com.ndtlg.pettime/com.mdx.framework.activity.IndexAct (server)' ~ Consumer closed input channel or an error occurred.  events=0x9
//        04-10 17:01:32.946 E/InputDispatcher(16247): channel '47f527d com.ndtlg.pettime/com.mdx.framework.activity.IndexAct (server)' ~ Channel is unrecoverably broken and will be disposed!
//        04-10 17:01:32.939 W/iaware  (  731): type=1400 audit(0.0:92080): avc: denied { dac_override } for capability=1 scontext=u:r:hwpged:s0 tcontext=u:r:hwpged:s0 tclass=capability permissive=0
//        04-10 17:01:32.939 W/iaware  (  731): type=1400 audit(0.0:92081): avc: denied { dac_read_search } for capability=2 scontext=u:r:hwpged:s0 tcontext=u:r:hwpged:s0 tclass=capability permissive=0
//        04-10 17:01:32.946 W/InputDispatcher(16247): channel 'cdc73ef com.ndtlg.pettime/com.mdx.framework.activity.TitleAct (server)' ~ Consumer closed input channel or an error occurred.  events=0x9
//        04-10 17:01:32.946 E/InputDispatcher(16247): channel 'cdc73ef com.ndtlg.pettime/com.mdx.framework.activity.TitleAct (server)' ~ Channel is unrecoverably broken and will be disposed!
//        04-10 17:01:32.946 D/AwareLog(  731): iawared: workingset_process_command subCmd = 350, uid=10157, pid=28012, com.ndtlg.pettime
//        04-10 17:01:32.946 W/InputDispatcher(16247): channel '289dfe4 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct (server)' ~ Consumer closed input channel or an error occurred.  events=0x9
//        04-10 17:01:32.947 E/InputDispatcher(16247): channel '289dfe4 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct (server)' ~ Channel is unrecoverably broken and will be disposed!
//        04-10 17:01:32.947 E/AwareLog(  731): iawared: workingset_path_check Failed to lstat(/data/system/iaware/workingset/): Permission denied
//        04-10 17:01:32.947 E/AwareLog(  731): iawared: workingset_path_check Failed to create directory(/data/system/iaware/workingset/): Permission denied
//        04-10 17:01:32.947 D/AwareLog(  731): iawared: workingsetStart com.ndtlg.pettime in monitor0
//        04-10 17:01:32.947 I/        (28012): power log dlsym ok
//        04-10 17:01:32.948 W/libprocessgroup(16247): kill(-26451, 9) failed: No such process
//        04-10 17:01:32.950 I/m.ndtlg.pettim(28012): Late-enabling -Xcheck:jni
//        04-10 17:01:32.959 I/WindowManager(16247): WIN DEATH: Window{cdc73ef u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct}
//        04-10 17:01:32.959 V/WindowManager(16247): removeIfPossible: Window{cdc73ef u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct}
//        04-10 17:01:32.959 W/InputDispatcher(16247): Attempted to unregister already unregistered input channel 'cdc73ef com.ndtlg.pettime/com.mdx.framework.activity.TitleAct (server)'
//        04-10 17:01:32.960 I/Zygote  (16160): Process 26451 exited cleanly (2)
//        04-10 17:01:32.960 V/WindowManager(16247): postWindowRemoveCleanupLocked: Window{cdc73ef u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct}
//        04-10 17:01:32.960 V/WindowManager(16247): Removing Window{cdc73ef u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct} from AppWindowToken{5c090f6 token=Token{c48a991 ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}}} mIsExiting=
//        04-10 17:01:32.963 I/WindowManager(16247): WIN DEATH: Window{47f527d u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}
//        04-10 17:01:32.963 V/WindowManager(16247): removeIfPossible: Window{47f527d u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}
//        04-10 17:01:32.963 W/InputDispatcher(16247): Attempted to unregister already unregistered input channel '47f527d com.ndtlg.pettime/com.mdx.framework.activity.IndexAct (server)'
//        04-10 17:01:32.963 V/WindowManager(16247): Not removing Window{47f527d u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct EXITING} due to exit animation
//        04-10 17:01:32.965 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.966 I/WindowManager(16247): WIN DEATH: Window{289dfe4 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}
//        04-10 17:01:32.966 V/WindowManager(16247): removeIfPossible: Window{289dfe4 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}
//        04-10 17:01:32.966 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 7 lines
//        04-10 17:01:32.966 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.966 W/InputDispatcher(16247): Attempted to unregister already unregistered input channel '289dfe4 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct (server)'
//        04-10 17:01:32.966 V/WindowManager(16247): postWindowRemoveCleanupLocked: Window{289dfe4 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}
//        04-10 17:01:32.966 V/WindowManager(16247): Removing Window{289dfe4 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct} from AppWindowToken{7f057f4 token=Token{65b55c7 ActivityRecord{50d2b06 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}}
//        04-10 17:01:32.966 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.969 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 10 lines
//        04-10 17:01:32.969 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.973 I/m.ndtlg.pettim(28012): Reinit property: dalvik.vm.checkjni= false
//        04-10 17:01:32.981 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.985 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 19 lines
//        04-10 17:01:32.985 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:32.988 D/ZrHung.AppEyeUiProbe(28012): AppEyeUIP created.
//        04-10 17:01:32.989 W/libprocessgroup(16247): kill(-26451, 9) failed: No such process
//        04-10 17:01:32.989 I/libprocessgroup(16247): Successfully killed process cgroup uid 10157 pid 26451 in 70ms
//        04-10 17:01:32.990 D/ActivityThread(28012): Attach thread to application
//        04-10 17:01:32.992 D/HwPhoneWindowManager(16247): sensorRotation = -1 lastRotation:0
//        04-10 17:01:32.996 E/AwareLog(16855): SPKSchedFeature: Uid has been sent, ignore.
//        04-10 17:01:32.998 V/WindowManager(16247): Checking 1 opening apps (frozen=false timeout=false), Track: updateconfig performsurface
//        04-10 17:01:32.998 V/WindowManager(16247): Check opening app=AppWindowToken{7f057f4 token=Token{65b55c7 ActivityRecord{50d2b06 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}}: allDrawn=false startingDisplayed=false startingMoved=false isRelaunching()=false startingWindow=null
//        04-10 17:01:33.016 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.016 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.016 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.017 I/HwApiCacheMangerEx(28012): apicache path=/storage/emulated/0 state=mounted key=com.ndtlg.pettime#10157#256
//        04-10 17:01:33.017 I/HwApiCacheMangerEx(28012): apicache path=/storage/emulated/0 state=mounted key=com.ndtlg.pettime#10157#0
//        04-10 17:01:33.019 I/m.ndtlg.pettim(28012): The ClassLoaderContext is a special shared library.
//        04-10 17:01:33.021 I/chatty  (28012): uid=10157(com.ndtlg.pettime) identical 2 lines
//        04-10 17:01:33.021 I/m.ndtlg.pettim(28012): The ClassLoaderContext is a special shared library.
//        04-10 17:01:33.021 D/HwRecentsTaskUtils(16885): refreshToCache
//        04-10 17:01:33.021 D/HwRecentsTaskUtils(16885): searchFromDate
//        04-10 17:01:33.024 E/HsmCoreServiceImpl(16772): onTransact in code is: 103
//        04-10 17:01:33.024 I/MediaProcessHandler(16772): playingUids:
//        04-10 17:01:33.026 I/RecentsTaskLoadPlan(16885): to show tasks size is 4
//        04-10 17:01:33.033 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.148 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 30 lines
//        04-10 17:01:33.148 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.159 E/WifiHAL (  647): enter wifi_get_link_stats
//        04-10 17:01:33.165 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.165 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.165 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.171 E/WificondControl(16247): Noise: -92, Snr: 35, Chload: -1
//        04-10 17:01:33.171 D/HwInnerWifiManagerImpl(16247): SupplicantState = COMPLETED
//        04-10 17:01:33.171 D/HwInnerWifiManagerImpl(16247): isPhoneAP = false
//        04-10 17:01:33.173 D/WifiScoreReport(16247): Score = 60, wifiConnectivityManagerEnabled = false, lowScoreCount = 0
//        04-10 17:01:33.181 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.181 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.181 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.182 E/Thermal-daemon(  727): [shell_frame] temp_new :29  temp_old :28
//        04-10 17:01:33.183 I/ThermalService(16855): Receive temperature change, type: 22, temp: 29 from thermald
//        04-10 17:01:33.184 I/ThermalTrace_ThermalRaise(16855): Shell:-100,28,29,currentBatteryTemp:29
//        04-10 17:01:33.184 E/Thermal-daemon(  727): Report temperature: [shell_frame] temp :29  report_threshold:1
//        04-10 17:01:33.197 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.357 W/SocketListener(16167): sending broadcast to Pid = 16247, Uid = 1000
//        04-10 17:01:33.358 D/NetdConnector(16247): RCV <- {601 limit alert globalAlert lo}
//        04-10 17:01:33.359 D/NetdConnector(16247): RCV <- {601 limit alert globalAlert lo}
//        04-10 17:01:33.359 D/NetdConnector(16247): RCV unsolicited event from native daemon, event = 601
//        04-10 17:01:33.359 I/NetworkStats(16247): limitReached
//        04-10 17:01:33.360 I/NetworkStats(16247): performPollLocked, pid = 16247
//        04-10 17:01:33.368 W/NetworkStatsFactory(16247): mStatsXtProcUid: /proc/net/comm/stats does not exist!
//        04-10 17:01:33.368 D/HwNetworkStatsService(16247): hwRecordUidAndProcSnapshotLocked currentTime = 1554886799848
//        04-10 17:01:33.371 I/NetworkStatsFactory(16247): javaReadNetworkStatsUidAndProcDetail. cost time = 2
//        04-10 17:01:33.376 D/NetdConnector(16247): SND -> {211 bandwidth setglobalalert 2097152}
//        04-10 17:01:33.377 D/NetdConnector(16247): RCV <- {200 211 Bandwidth command succeeeded}
//        04-10 17:01:33.379 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 38 lines
//        04-10 17:01:33.379 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.380 E/HSM_Install_BG(17018): NatTrafficNotifyService:imsi is null, so return
//        04-10 17:01:33.396 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.396 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.396 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.401 I/TrafficMonitor(16247): expired arrive. level:-1
//        04-10 17:01:33.401 I/TrafficMonitor(16247): during_ms:2004,period_ms:2000
//        04-10 17:01:33.401 I/TrafficMonitor(16247): count:289,rx_sum:10,tx_sum:13,rxBytes:4998,during_ms:2004,rx_speed:2494.011976047904,tx_speed:928.6427145708583,rto:0.7692307692307693
//        04-10 17:01:33.412 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.412 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.412 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.420 I/audio_hw_primary(16169): usb_ext_get_parameters: check show hires (false)
//        04-10 17:01:33.420 I/hash_map_utils(16163): key: 'typec_need_show_hires' value: ''
//        04-10 17:01:33.377 D/NetdConnector(16247): RCV <- {200 211 Bandwidth command succeeeded}
//        04-10 17:01:33.420 I/HwAudioServiceEx(16247): check HiRes Icon false
//        04-10 17:01:33.421 W/ActivityManager(16247): Sending non-protected broadcast huawei.intent.action.hideHiResIcon from system 16247:system/1000 pkg android
//        04-10 17:01:33.421 W/ActivityManager(16247): Sending non-protected broadcast huawei.intent.action.hideHiResIcon from system 16247:system/1000 pkg android
//        04-10 17:01:33.422 D/StatusBarIconController(16608): setIconVisibility icon is null or visibility not change visibility=false
//        04-10 17:01:33.427 I/HwNormalizedSpline(16247): DayMode:getBrightnessLevel lux =3.0, mDefaultBrightnessFromLux =8.655051
//        04-10 17:01:33.428 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.495 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 18 lines
//        04-10 17:01:33.495 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.504 I/MultiDex(28012): VM with version 2.1.0 has multidex support
//        04-10 17:01:33.505 I/MultiDex(28012): install
//        04-10 17:01:33.505 I/MultiDex(28012): VM has multidex support, MultiDex support library is disabled.
//        04-10 17:01:33.507 I/AwareBitmapCacher(28012): init processName:com.ndtlg.pettime pid=28012 uid=10157
//        04-10 17:01:33.511 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.511 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.511 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.511 W/m.ndtlg.pettim(28012): Class com.mdx.framework.cache.Cache failed lock verification and will run slower.
//        04-10 17:01:33.511 W/m.ndtlg.pettim(28012): Common causes for lock verification issues are non-optimized dex code
//        04-10 17:01:33.511 W/m.ndtlg.pettim(28012): and incorrect proguard optimizations.
//        04-10 17:01:33.511 W/m.ndtlg.pettim(28012): Class com.mdx.framework.cache.ImageCache failed lock verification and will run slower.
//        04-10 17:01:33.516 W/m.ndtlg.pettim(28012): Class com.mdx.framework.utility.Util failed lock verification and will run slower.
//        04-10 17:01:33.519 V/HwPolicyFactory(28012): : success to get AllImpl object and return....
//        04-10 17:01:33.523 V/HwWidgetFactory(28012): : successes to get AllImpl object and return....
//        04-10 17:01:33.524 D/skia    (28012): external skia thread pool create.
//        04-10 17:01:33.527 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.544 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 6 lines
//        04-10 17:01:33.544 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.547 E/MemoryLeakMonitorManager(28012): MemoryLeakMonitor.jar is not exist!
//        04-10 17:01:33.553 D/ZrHung.AppEyeUiProbe(28012): notify runnable to start.
//        04-10 17:01:33.553 D/ZrHung.AppEyeUiProbe(28012): Runnable thread started.
//        04-10 17:01:33.553 D/IMonitor(28012): Load library imonitor_jni
//        04-10 17:01:33.557 V/ActivityThread(28012): Skipping new config:{1.0 ?mcc?mnc [zh_CN_#Hans] ldltr sw360dp w360dp h719dp 480dpi nrml long hdr port finger -keyb/v/h -nav/h winConfig={ mBounds=Rect(0, 0 - 0, 0) mAppBounds=Rect(0, 85 - 1080, 2244) mWindowingMode=fullscreen mActivityType=undefined} nonFullScreen=0 suim:1 s.7}, config:{1.0 ?mcc?mnc [zh_CN_#Hans] ldltr sw360dp w360dp h719dp 480dpi nrml long hdr port finger -keyb/v/h -nav/h winConfig={ mBounds=Rect(0, 0 - 0, 0) mAppBounds=Rect(0, 85 - 1080, 2244) mWindowingMode=fullscreen mActivityType=undefined} nonFullScreen=0 suim:1 s.7} for app:com.ndtlg.pettime
//        04-10 17:01:33.560 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.560 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.560 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.571 D/frame   (28012): read Builder to:/data/user/0/com.ndtlg.pettime/app_frame/save
//        04-10 17:01:33.572 W/m.ndtlg.pettim(28012): Class com.mdx.framework.broadcast.BroadList failed lock verification and will run slower.
//        04-10 17:01:33.573 W/System.err(28012): java.io.FileNotFoundException: /data/user/0/com.ndtlg.pettime/app_frame/save/TEMP_FILES_DATA (No such file or directory)
//        04-10 17:01:33.573 W/System.err(28012): 	at java.io.FileInputStream.open0(Native Method)
//        04-10 17:01:33.573 W/m.ndtlg.pettim(28012): Class android.support.v4.util.SimpleArrayMap failed lock verification and will run slower.
//        04-10 17:01:33.573 W/System.err(28012): 	at java.io.FileInputStream.open(FileInputStream.java:231)
//        04-10 17:01:33.573 W/System.err(28012): 	at java.io.FileInputStream.<init>(FileInputStream.java:165)
//        04-10 17:01:33.573 W/System.err(28012): 	at java.io.FileInputStream.<init>(FileInputStream.java:112)
//        04-10 17:01:33.573 W/System.err(28012): 	at com.mdx.framework.utility.Helper.readBuilder(Helper.java:233)
//        04-10 17:01:33.573 W/System.err(28012): 	at com.mdx.framework.Frame$1.run(Frame.java:144)
//        04-10 17:01:33.573 W/System.err(28012): 	at java.lang.Thread.run(Thread.java:784)
//        04-10 17:01:33.574 W/m.ndtlg.pettim(28012): Class com.mdx.framework.cache.FileStoreCacheManage failed lock verification and will run slower.
//        04-10 17:01:33.574 D/frame   (28012): read Builder to:/data/user/0/com.ndtlg.pettime/app_frame/save
//        04-10 17:01:33.574 W/System.err(28012): java.io.FileNotFoundException: /data/user/0/com.ndtlg.pettime/app_frame/save/TEMP_FILES_FILE (No such file or directory)
//        04-10 17:01:33.575 W/System.err(28012): 	at java.io.FileInputStream.open0(Native Method)
//        04-10 17:01:33.575 W/System.err(28012): 	at java.io.FileInputStream.open(FileInputStream.java:231)
//        04-10 17:01:33.575 W/System.err(28012): 	at java.io.FileInputStream.<init>(FileInputStream.java:165)
//        04-10 17:01:33.575 W/System.err(28012): 	at java.io.FileInputStream.<init>(FileInputStream.java:112)
//        04-10 17:01:33.575 W/System.err(28012): 	at com.mdx.framework.utility.Helper.readBuilder(Helper.java:233)
//        04-10 17:01:33.575 W/System.err(28012): 	at com.mdx.framework.Frame$1.run(Frame.java:145)
//        04-10 17:01:33.575 W/System.err(28012): 	at java.lang.Thread.run(Thread.java:784)
//        04-10 17:01:33.576 W/m.ndtlg.pettim(28012): Class com.mdx.framework.cache.ImageStoreCacheManage failed lock verification and will run slower.
//        04-10 17:01:33.576 D/frame   (28012): read Builder to:/data/user/0/com.ndtlg.pettime/app_frame/save
//        04-10 17:01:33.577 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.577 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.577 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.588 W/m.ndtlg.pettim(28012): Class android.support.v4.app.FragmentManagerImpl failed lock verification and will run slower.
//        04-10 17:01:33.593 V/ActivityThread(28012): callActivityOnCreate
//        04-10 17:01:33.593 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.593 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.593 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.598 W/m.ndtlg.pettim(28012): Class okio.SegmentPool failed lock verification and will run slower.
//        04-10 17:01:33.599 I/HwApsImpl(28012): APS: new HwApsImpl created
//        04-10 17:01:33.600 I/hwaps   (28012): HwAps: JNI_OnLoad
//        04-10 17:01:33.603 D/HiTouch_PressGestureDetector(28012): HiTouch on notch display, height corret:85
//        04-10 17:01:33.607 W/m.ndtlg.pettim(28012): Class com.mdx.framework.server.api.UpdateOne failed lock verification and will run slower.
//        04-10 17:01:33.609 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.610 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.610 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.615 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.619 W/HSM_SEC_BG(17018): HoldService:toast switch is close!
//        04-10 17:01:33.619 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.619 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.619 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.620 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@97c5b46,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.620 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.621 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.621 W/System.err(16872): java.lang.SecurityException: getDeviceId
//        04-10 17:01:33.621 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.621 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.621 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.621 W/System.err(16872): 	at com.android.internal.telephony.TelephonyPermissions.enforceCarrierPrivilege(TelephonyPermissions.java:274)
//        04-10 17:01:33.621 W/System.err(16872): 	at com.android.internal.telephony.TelephonyPermissions.checkReadPhoneState(TelephonyPermissions.java:123)
//        04-10 17:01:33.621 W/System.err(16872): 	at com.android.internal.telephony.TelephonyPermissions.checkReadPhoneState(TelephonyPermissions.java:101)
//        04-10 17:01:33.621 W/System.err(16872): 	at com.android.internal.telephony.TelephonyPermissions.checkCallingOrSelfReadPhoneState(TelephonyPermissions.java:74)
//        04-10 17:01:33.621 W/System.err(16872): 	at com.android.internal.telephony.HwPhoneService.canReadPhoneState(HwPhoneService.java:2022)
//        04-10 17:01:33.621 W/System.err(16872): 	at com.android.internal.telephony.HwPhoneService.getUniqueDeviceId(HwPhoneService.java:2050)
//        04-10 17:01:33.621 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@2fe06a3,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.621 W/System.err(16872): 	at com.android.internal.telephony.IHwTelephony$Stub.onTransact(IHwTelephony.java:463)
//        04-10 17:01:33.621 W/System.err(16872): 	at android.os.Binder.execTransact(Binder.java:739)
//        04-10 17:01:33.621 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.622 W/m.ndtlg.pettim(28012): Class com.mdx.framework.server.api.ApiUpdate$Receiver failed lock verification and will run slower.
//        04-10 17:01:33.626 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.626 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.626 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.638 I/frame   (28012): class:
//
//class com.ndtlg.pettime.frg.FrgLogin
//        04-10 17:01:33.642 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.642 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.642 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.651 D/frame   (28012): com.ndtlg.pettime.frg.FrgLogin
//        04-10 17:01:33.651 D/frame   (28012): showfragment
//        04-10 17:01:33.655 D/ActivityThread(28012): add activity client record, r= ActivityRecord{a895d2a token=android.os.BinderProxy@4a8701f {com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}} token= android.os.BinderProxy@4a8701f
//        04-10 17:01:33.659 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.659 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.659 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.671 I/HW_DISPLAY_EFFECT(  627): hw_get_display_panel_type: panel info is blmax:8820,blmin:15,blmax_nit_actual:686,blmax_nit_standard:750,lcdtype:LCD,
//        04-10 17:01:33.671 I/HW_DISPLAY_EFFECT(  627):
//        04-10 17:01:33.671 I/HW_DISPLAY_EFFECT(  627): hw_get_display_panel_type: lcd type is LCD
//        04-10 17:01:33.671 D/TextView(28012): get Display Panel Type is : 0
//        04-10 17:01:33.675 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.675 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.675 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.677 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.677 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.677 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.677 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.677 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@c36cec9,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.677 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.678 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.678 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.678 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.678 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.678 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@d548e85,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.678 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.720 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.720 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.720 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.720 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.720 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@759ea1d,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.720 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.721 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.721 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.721 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.721 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.721 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@1300b19,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.721 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.728 W/m.ndtlg.pettim(28012): Class com.mdx.framework.server.api.protobuf.UpdateOne2Protobuf failed lock verification and will run slower.
//        04-10 17:01:33.730 D/frameload(28012): api protobuf:APP_UPDATE_SELF: ?pkgname=com.ndtlg.pettime&version=32&appkey=default&&deviceid=b7344ab9121da4f93cc9f2727870e1cc&platform=android&&debug=1
//        04-10 17:01:33.738 D/frameload.system.run(28012): Intenet Protobuf: ?pkgname=com.ndtlg.pettime&version=32&appkey=default&deviceid=b7344ab9121da4f93cc9f2727870e1cc&platform=android&debug=1
//        04-10 17:01:33.738 W/System.err(28012): java.net.MalformedURLException: no protocol:
//        04-10 17:01:33.738 W/System.err(28012): 	at java.net.URL.<init>(URL.java:601)
//        04-10 17:01:33.738 W/System.err(28012): 	at java.net.URL.<init>(URL.java:498)
//        04-10 17:01:33.738 W/System.err(28012): 	at java.net.URL.<init>(URL.java:447)
//        04-10 17:01:33.738 W/System.err(28012): 	at com.mdx.framework.server.api.protobuf.IntenetRead2Protobuf.post(IntenetRead2Protobuf.java:27)
//        04-10 17:01:33.738 W/System.err(28012): 	at com.mdx.framework.server.api.protobuf.UpdateOne2Protobuf.readSon(UpdateOne2Protobuf.java:266)
//        04-10 17:01:33.738 W/System.err(28012): 	at com.mdx.framework.server.api.UpdateOne.getSon(UpdateOne.java:245)
//        04-10 17:01:33.738 W/System.err(28012): 	at com.mdx.framework.server.api.ApiManager$ApisRun.run(ApiManager.java:195)
//        04-10 17:01:33.738 W/System.err(28012): 	at com.mdx.framework.commons.threadpool.ThreadPool$PThread.runRunAble(ThreadPool.java:70)
//        04-10 17:01:33.739 W/System.err(28012): 	at com.mdx.framework.commons.threadpool.ThreadPool$PThread.run(ThreadPool.java:53)
//        04-10 17:01:33.739 E/frame   (28012): Error: 98 null
//        04-10 17:01:33.757 I/frame   (28012): class:
//
//class com.ndtlg.pettime.frg.FrgLogin
//        04-10 17:01:33.770 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.770 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.770 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.770 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.770 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@efabafd,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.770 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.770 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.770 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.770 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.771 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.771 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@fbd09f9,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.771 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.789 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.790 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.790 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.790 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.790 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@4ea3b97,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.790 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.790 I/FLTAG_FM(28012): loadFeature class:com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.790 I/FLTAG_SFM(28012): getRequireClassLoader() succ ! className: com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.790 D/FeatureFactory(28012): loadFeature() : com.huawei.featurelayer.systemfeature.HwWidget.IHwSplineOverScrollerEx
//        04-10 17:01:33.790 D/FeatureFactory(28012): loadFeature() new IHwSplineOverScrollerEx()
//        04-10 17:01:33.790 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl paras: android.widget.OverScroller$SplineOverScroller@3555d6d,com.mdx.framework.activity.IndexAct@be66107
//04-10 17:01:33.790 D/HwSplineOverScrollerExImpl(28012): initSplineOverScrollerImpl: mScrollerVelocity is 0, value is 0
//        04-10 17:01:33.791 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.791 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.791 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.824 D/ZrHung.AppEyeUiProbe(28012): notify runnable to start.
//        04-10 17:01:33.827 D/OpenGLRenderer(28012): Skia GL Pipeline
//        04-10 17:01:33.830 D/HwAppInnerBoostImpl(28012): set config for com.ndtlg.pettime BOOST_FLAG=true REPORT_DURATION_CLICK=1000 REPORT_TIMES_CLICK=3 REPORT_DURATION_SLIDE=5000 REPORT_TIMES_SLIDE=16
//        04-10 17:01:33.831 D/OpenGLRenderer(28012):   HWUI Binary is  enabled
//        04-10 17:01:33.831 D/OpenGLRenderer(28012): disableOutlineDraw is true
//        04-10 17:01:33.837 V/WindowManager(16247): addWindow: Window{6b25c30 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}
//        04-10 17:01:33.838 D/        (  651): doWinFrameOptStatusRecog begin to recog Layer result=2
//        04-10 17:01:33.839 D/HwGameAssistantController(16247): pid=28012, uid=10157, component=ComponentInfo{com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}
//        04-10 17:01:33.839 D/HISTREAM_WECHAT(16247): activityResumed:pid=28012, uid=10157, component=ComponentInfo{com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}
//        04-10 17:01:33.839 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorVideoScence input :com.ndtlg.pettime,com.mdx.framework.activity.IndexAct
//        04-10 17:01:33.839 D/HISTREAM_WECHAT(16247): mHwAPPQoEAPKConfig is null
//        04-10 17:01:33.839 D/HiData_HwAPPQoEActivityMonitor(16247): handleActivityChange,  curPackage:com.ndtlg.pettime, curClass:com.mdx.framework.activity.IndexAct
//        04-10 17:01:33.839 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorAPKScence input :com.ndtlg.pettime,com.mdx.framework.activity.IndexAct
//        04-10 17:01:33.839 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorAPKScence input :com.ndtlg.pettime,null
//        04-10 17:01:33.839 D/HiData_HwAPPQoEResourceMangerImpl(16247): checkIsMonitorGameScence input :com.ndtlg.pettime
//        04-10 17:01:33.839 D/HiData_HwAPPQoEActivityMonitor(16247): handleActivityChange, it is not a care app or scence
//        04-10 17:01:33.839 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.839 D/HiData_HwAPPQoEActivityMonitor(16247): handleActivityChange,  curr mAppType:-1, lastType:-1
//        04-10 17:01:33.839 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.839 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 1 line
//        04-10 17:01:33.839 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.839 I/OPCollectLog(16816): AppChangeImpl:pid: 28012 uid: 10157 pkg: com.ndtlg.pettime class: com.mdx.framework.activity.IndexAct
//        04-10 17:01:33.840 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.840 W/HwActivityManagerServiceEx(16247): HwActivityNotifier end call android.app.IHwActivityNotifier$Stub$Proxy@ae5a2e6 for activityLifeState under user 0 cost 0
//        04-10 17:01:33.840 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 10 lines
//        04-10 17:01:33.840 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.841 I/OPCollectLog(16816): HwForegroundAppAction:handleMessage
//        04-10 17:01:33.841 I/OPCollectLog(16816): Action:HwForegroundAppAction executed successfully
//        04-10 17:01:33.841 D/HwGameAssistantController(16247): UPDATE: mCurFgPkg=com.ndtlg.pettime, mCurFgPid=28012, mCurIsGame=false
//        04-10 17:01:33.842 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.843 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.843 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.845 I/OPCollectLog(16816): OdmfHelper:insert dsCollectEncrypt success
//        04-10 17:01:33.846 D/PackageManager(16247): resolve intent for uid:10157, matchs:3, res:ResolveInfo{f2810a9 com.huawei.android.launcher/.unihome.UniHomeLauncher m=0x108000}
//        04-10 17:01:33.848 I/[HwRecSys]OdmfCollectScheduler(18197): handleMessage msg: 6
//        04-10 17:01:33.848 I/[HwRecSys]HwRecSysService(18197):  cur pkg: com.ndtlg.pettime
//        04-10 17:01:33.849 I/HiTouch_HiTouchSensor(28012): enabledInPad = false,isPcCastMode = false
//        04-10 17:01:33.855 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.858 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 18 lines
//        04-10 17:01:33.858 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.860 D/ZrHung.AppEyeUiProbe(25572): Current Activity:false
//        04-10 17:01:33.860 D/ZrHung.AppEyeUiProbe(25572): not watching, wait.
//        04-10 17:01:33.872 V/WindowManager(16247): Checking 1 opening apps (frozen=false timeout=false), Track: relayout performsurface
//        04-10 17:01:33.872 V/WindowManager(16247): Check opening app=AppWindowToken{7f057f4 token=Token{65b55c7 ActivityRecord{50d2b06 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}}: allDrawn=false startingDisplayed=false startingMoved=false isRelaunching()=false startingWindow=null
//        04-10 17:01:33.874 D/ZrHung.AppEyeFocusWindow(16247): FocusWindowErrorScene cancelCheckFreezeScreen
//        04-10 17:01:33.874 D/ZrHung.AppEyeTransparentWindow(16247): TransparentWindow mHungConfigStatus = 0,mHungConfigEnable = 1
//        04-10 17:01:33.878 E/BufferQueueProducer(  651): [] mConsumerName == NULL!!!!!!
//        04-10 17:01:33.879 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9265152,pid=606
//        04-10 17:01:33.879 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2089,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:33.879 I/GRALLOC (  606): 	 iova_size=9265152,conUsg=0x900,proUsg=0x900,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:33.880 E/BufferQueueProducer(  651): [] mConsumerName == NULL!!!!!!
//        04-10 17:01:33.880 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9265152,pid=606
//        04-10 17:01:33.880 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2089,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:33.880 I/GRALLOC (  606): 	 iova_size=9265152,conUsg=0x900,proUsg=0x900,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:33.881 E/BufferQueueProducer(  651): [] mConsumerName == NULL!!!!!!
//        04-10 17:01:33.882 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9265152,pid=606
//        04-10 17:01:33.882 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2089,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:33.882 I/GRALLOC (  606): 	 iova_size=9265152,conUsg=0x900,proUsg=0x900,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:33.882 I/ConfigStore(28012): android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
//        04-10 17:01:33.882 I/ConfigStore(28012): android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasHDRDisplay retrieved: 0
//        04-10 17:01:33.886 I/iGraphics(28012): [0020080c] pn: com.ndtlg.pettime, p: 28012
//        04-10 17:01:33.888 I/iGraphics(28012): [0030080c] no spt app: com.ndtlg.pettime
//        04-10 17:01:33.888 I/OpenGLRenderer(28012): Initialized EGL, version 1.4
//        04-10 17:01:33.888 D/OpenGLRenderer(28012): Swap behavior 2
//        04-10 17:01:33.888 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.892 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 18 lines
//        04-10 17:01:33.892 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.896 D/mali_winsys(28012): EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, EGLBoolean) returns 0x3000
//        04-10 17:01:33.900 D/HwAutofillHelper(28012): recordCurrentInfo:0
//        04-10 17:01:33.900 D/HwAutofillHelper(28012): inputType = 1
//        04-10 17:01:33.905 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.906 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 14 lines
//        04-10 17:01:33.906 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.908 D/OpenGLRenderer(28012):   HWUI Binary is  enabled
//        04-10 17:01:33.908 D/OpenGLRenderer(28012): disableOutlineDraw is true
//        04-10 17:01:33.908 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.908 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.908 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.913 D/HwArpVerifier(16247): getGateWayARPResponses: arp rtt = 4
//        04-10 17:01:33.913 D/HiDATA  (16247): updateArpResult, success =true , arprtt:4
//        04-10 17:01:33.913 E/HwNcChrServiceImpl(16247): Run the of call hwNcChrService1101
//        04-10 17:01:33.913 D/NcDft_ServiceImpl(16816): notifyNcDftEvent domain is : 1 ;eventID is: 1101 ;bundle is Bundle[mParcelledData.dataSize=28]
//        04-10 17:01:33.913 D/HwWifiCHRStateManager(16816): handleMessage : 1101
//        04-10 17:01:33.913 E/HwNcChrServiceImpl(16247): Run the of call hwNcChrService1121
//        04-10 17:01:33.914 D/NcDft_ServiceImpl(16816): notifyNcDftEvent domain is : 1 ;eventID is: 1121 ;bundle is Bundle[mParcelledData.dataSize=84]
//        04-10 17:01:33.914 D/HwWifiCHRStateManager(16816): handleMessage : 1121
//        04-10 17:01:33.914 E/HwCHRWifiRSSIGroupSummery(16816): updatArpSummery mRSSI:0  HwCHRWifiRSSIGroup [rssi_index=4, rtt_tcp_packets=0, rtt_tcp_duration=0, rtt_lan_duration=1305, rtt_lan_failures=0, rtt_lan_succ=250, rtt_lan_max=46, rtt_lan_min=1,same_area_frequency=0,adjacent_area_frequency=1]
//        04-10 17:01:33.921 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9265152,pid=606
//        04-10 17:01:33.921 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2089,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:33.921 I/GRALLOC (  606): 	 iova_size=9265152,conUsg=0xb00,proUsg=0xb00,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:33.937 D/HwArpVerifier(16247): There are 1 mac address for gateway
//        04-10 17:01:33.937 D/HwArpVerifier(16247): from HEART_CHECK transmit to state:HEART_CHECK
//        04-10 17:01:33.937 D/HwArpVerifier(16247): msg what=124 arg1(token)=3 arg2(mode)=0 delay=60000
//        04-10 17:01:33.937 D/HwArpVerifier(16247): performPollAndLog:
//        04-10 17:01:33.938 D/hw_netstat(16247): total/7880/8036,com.ndtlg.pettime/7643/7876,unknown:0/237/160
//        04-10 17:01:33.951 I/ViewRootImpl(28012): jank_removeInvalidNode jank list is null
//        04-10 17:01:33.953 V/WindowManager_visibility(16247): updateAllDrawn Add AppWindowToken{7f057f4 token=Token{65b55c7 ActivityRecord{50d2b06 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}}
//        04-10 17:01:33.953 V/WindowManager_visibility(16247): updateAllDrawn allDrawn=false interesting=1 drawn=1 relaunchCount=0 for AppWindowToken{7f057f4 token=Token{65b55c7 ActivityRecord{50d2b06 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}}
//        04-10 17:01:33.953 W/InputMethodManager(28012): startInputReason = 1
//        04-10 17:01:33.953 V/WindowManager(16247): Checking 1 opening apps (frozen=false timeout=false), Track:  performsurface
//        04-10 17:01:33.954 V/WindowManager(16247): Check opening app=AppWindowToken{7f057f4 token=Token{65b55c7 ActivityRecord{50d2b06 u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}}: allDrawn=true startingDisplayed=false startingMoved=false isRelaunching()=false startingWindow=null
//        04-10 17:01:33.954 I/WindowManager(16247): closing apps count = 3
//        04-10 17:01:33.955 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.956 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 14 lines
//        04-10 17:01:33.956 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.956 D/HwSecImmHelper(16247): isPasswordInputType = false, inputType = 1
//        04-10 17:01:33.957 D/        (  651): doWinFrameOptStatusRecog begin to recog Layer result=2
//        04-10 17:01:33.958 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.959 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:33.959 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.968 I/ActivityManager(16247): Displayed com.ndtlg.pettime/com.mdx.framework.activity.IndexAct: +1s40ms (total +1s235ms)
//        04-10 17:01:33.968 D/ActivityManager(16247): EVENT_APP_ACTIVITY_DISPLAYED_FINISH reportData: com.ndtlg.pettime/com.mdx.framework.activity.IndexAct 28012 1040
//        04-10 17:01:33.971 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.973 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 22 lines
//        04-10 17:01:33.973 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.973 I/InputMethodService(19535): default input mode = 0
//        04-10 17:01:33.974 I/TS_Service(  645): hwTsRunCommand
//        04-10 17:01:33.974 E/TS_HAL  (  645): huawei_tp_run_command: call
//        04-10 17:01:33.974 I/aptouch_daemon, [aptouch_interface_client](  645): thp_get_cs, use vndbinder
//        04-10 17:01:33.974 I/aptouch_daemon(  698): get_cmd, TSA_ExecuteCommand
//        04-10 17:01:33.974 I/aptouch_daemon(  698): operator(), TSA_ExecuteCommand(THP_InformTypingStatus com.baidu.input_huawei#1) = THPCommandNotSupported
//        04-10 17:01:33.974 I/aptouch_daemon(  698): excute_cmd_end, cmd: TSA_ExecuteCommand.
//        04-10 17:01:33.975 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.975 D/SecInputMethodManagerService(16247): unbind secime
//        04-10 17:01:33.976 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 5 lines
//        04-10 17:01:33.976 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.977 I/SecureInputMethod_LatinKeyboardView(26870): closing
//        04-10 17:01:33.980 V/WindowManager(16247): removeIfPossible: Window{c0ae4f u0 PopupWindow:36797e8}
//        04-10 17:01:33.981 V/WindowManager(16247): postWindowRemoveCleanupLocked: Window{c0ae4f u0 PopupWindow:36797e8}
//        04-10 17:01:33.981 V/WindowManager(16247): Removing Window{c0ae4f u0 PopupWindow:36797e8} from WindowToken{a315e32 android.os.Binder@18bb63d}
//        04-10 17:01:33.981 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9265152,pid=606
//        04-10 17:01:33.981 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2089,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:33.981 I/GRALLOC (  606): 	 iova_size=9265152,conUsg=0xb00,proUsg=0xb00,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:33.984 I/KeymapLoader(19535): initMapScale: appScale=3.3 selfScale=3.3 tmpScale=3.3
//        04-10 17:01:33.987 I/AssistStructure(28012): Flattened final assist data: 4908 bytes, containing 1 windows, 18 views
//        04-10 17:01:33.987 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.987 I/SecureInputMethod_LatinKeyboardView(26870): closing
//        04-10 17:01:33.988 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.988 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 3 lines
//        04-10 17:01:33.988 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.988 W/InputMethodManager(28012): startInputReason = 5
//        04-10 17:01:33.988 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.990 V/WindowManager(16247): removeIfPossible: Window{79722a9 u0 InputMethod}
//        04-10 17:01:33.990 V/WindowManager(16247): postWindowRemoveCleanupLocked: Window{79722a9 u0 InputMethod}
//        04-10 17:01:33.990 V/WindowManager(16247): Removing Window{79722a9 u0 InputMethod} from WindowToken{a315e32 android.os.Binder@18bb63d}
//        04-10 17:01:33.994 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 35 lines
//        04-10 17:01:33.994 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:33.994 I/Process (26870): Sending signal. PID: 26870 SIG: 9
//        04-10 17:01:33.998 D/HwKeychain(25217): HwAutofillService:hasLockPassword: false
//        04-10 17:01:33.998 D/HwKeychain(25217): UserUtility:userid:0;0
//        04-10 17:01:33.998 D/HwKeychain(25217): HwAutofillService:isMainUser: true
//        04-10 17:01:33.998 D/HwSecurityService(16247): find this Resident Plugin
//        04-10 17:01:34.000 D/STP     (  573): [SOCKETS     ] --------------- socket accpeted -----------------
//        04-10 17:01:34.000 D/STP     (  573): [SOCKETS     ] server << cmd 2003, data_len 4
//        04-10 17:01:34.000 D/STP     (  573): [SOCKETS     ] server << category 8
//        04-10 17:01:34.000 D/STP     (  573): [SOCKETS     ] server >> len 5, ret 0
//        04-10 17:01:34.000 D/STP     (  573): [SOCKETS     ] --------------- socket processed ----------------
//        04-10 17:01:34.000 D/STP     (  631): [SOCKETC     ] client << len 6/6
//        04-10 17:01:34.000 D/HwKeychain(25217): HwAutofillService:isRoot: false
//        04-10 17:01:34.004 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.006 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 31 lines
//        04-10 17:01:34.006 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.007 W/ActivityManager(16247): Sending non-protected broadcast huawei.action.floattasks.IME_WINDOW_STATE_CHANGED from system 16608:com.android.systemui/u0a30 pkg com.android.systemui
//        04-10 17:01:34.009 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.010 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 8 lines
//        04-10 17:01:34.010 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.015 E/BufferQueueProducer(  651): [] mConsumerName == NULL!!!!!!
//        04-10 17:01:34.016 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9547776,pid=606
//        04-10 17:01:34.016 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2159,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:34.016 I/GRALLOC (  606): 	 iova_size=9547776,conUsg=0x900,proUsg=0x900,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:34.017 I/chatty  (  606): uid=1000(system) HwBinder:606_1 identical 1 line
//        04-10 17:01:34.018 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9547776,pid=606
//        04-10 17:01:34.018 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2159,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:34.018 I/GRALLOC (  606): 	 iova_size=9547776,conUsg=0x900,proUsg=0x900,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:34.019 D/mali_winsys(19535): EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, EGLBoolean) returns 0x3000
//        04-10 17:01:34.020 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.021 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 6 lines
//        04-10 17:01:34.021 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.021 I/TS_Service(  645): hwTsRunCommand
//        04-10 17:01:34.021 E/TS_HAL  (  645): huawei_tp_run_command: call
//        04-10 17:01:34.021 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.021 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.021 I/aptouch_daemon, [aptouch_interface_client](  645): thp_get_cs, use vndbinder
//        04-10 17:01:34.021 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.022 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 4 lines
//        04-10 17:01:34.022 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.022 I/aptouch_daemon(  698): get_cmd, TSA_ExecuteCommand
//        04-10 17:01:34.022 I/aptouch_daemon(  698): operator(), TSA_ExecuteCommand(THP_InformTypingStatus com.baidu.input_huawei#0) = THPCommandNotSupported
//        04-10 17:01:34.022 I/aptouch_daemon(  698): excute_cmd_end, cmd: TSA_ExecuteCommand.
//        04-10 17:01:34.022 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.024 I/BoosterSwitchP(16772): notifyUidState do nothing
//        04-10 17:01:34.024 I/DeepNoDisturbP(16772): notifyUidState
//        04-10 17:01:34.024 I/HidataAppQoeP(16772): notifyUidState
//        04-10 17:01:34.024 I/BrowserChrP(16772): notifyUidState
//        04-10 17:01:34.022 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 14 lines
//        04-10 17:01:34.022 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.024 D/ZrHung.AppEyeUiProbe(25572): notify runnable to start.
//        04-10 17:01:34.024 W/AwareLog(16855): SmartIO2DMEPlugin: unknown process state: 1
//        04-10 17:01:34.024 E/AwareLog(16855): GameSdkConfigReader: GameSdkLog: idNameMap: null
//        04-10 17:01:34.024 D/ZrHung.AppEyeUiProbe(25572): stop checker.
//        04-10 17:01:34.024 D/ZrHung.AppEyeUiProbe(25572): restart watching
//        04-10 17:01:34.024 I/HuaweiIME(19535): SysInfo.getSysParam: orientation=1||config d=3.0,w=1080,h=2159||metrics d=3.0,w=1080,h=2159||sdk=28,bar_h=85||appScale=3.3,sysScale=3.0||isMultiWin=false,isPadMode=false, boardw=1080, boardH=705, candH=130
//        04-10 17:01:34.025 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.025 I/InputMethodService(19535): default input mode = 0
//        04-10 17:01:34.025 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.025 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 1 line
//        04-10 17:01:34.025 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.025 I/TS_Service(  645): hwTsRunCommand
//        04-10 17:01:34.025 E/TS_HAL  (  645): huawei_tp_run_command: call
//        04-10 17:01:34.025 I/aptouch_daemon, [aptouch_interface_client](  645): thp_get_cs, use vndbinder
//        04-10 17:01:34.025 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.026 D/ActivityThread(25572): Remove activity client record, r= ActivityRecord{9f2e035 token=android.os.BinderProxy@5f32129 {com.android.packageinstaller/com.android.packageinstaller.permission.ui.GrantPermissionsActivity}} token= android.os.BinderProxy@5f32129
//        04-10 17:01:34.026 V/WindowManager(16247): removeAppToken: AppWindowToken{9dcc682 token=Token{abd4dcd ActivityRecord{eb78764 u0 com.android.packageinstaller/.permission.ui.GrantPermissionsActivity t311}}} delayed=false Callers=com.android.server.wm.DisplayContent.removeAppToken:1059 com.android.server.wm.AppWindowContainerController.removeContainer:301 com.android.server.am.ActivityRecord.removeWindowContainer:1152 com.android.server.am.ActivityStack.removeActivityFromHistoryLocked:4507
//        04-10 17:01:34.026 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 4 lines
//        04-10 17:01:34.026 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.026 I/aptouch_daemon(  698): get_cmd, TSA_ExecuteCommand
//        04-10 17:01:34.026 I/aptouch_daemon(  698): operator(), TSA_ExecuteCommand(THP_InformTypingStatus com.baidu.input_huawei#1) = THPCommandNotSupported
//        04-10 17:01:34.026 I/aptouch_daemon(  698): excute_cmd_end, cmd: TSA_ExecuteCommand.
//        04-10 17:01:34.028 I/KeymapLoader(19535): initMapScale: appScale=3.3 selfScale=3.3 tmpScale=3.3
//        04-10 17:01:34.037 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.053 I/ActivityManager(16247): Process com.huawei.secime (pid 26870) has died: fore SVC
//        04-10 17:01:34.054 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 43 lines
//        04-10 17:01:34.054 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.054 W/libprocessgroup(16247): kill(-26870, 9) failed: No such process
//        04-10 17:01:34.054 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.054 D/ActivityManager(16247): cleanUpApplicationRecord app: ProcessRecord{f58b94 26870:com.huawei.secime/u0a75}, app.bad: false, restarting: false, allowRestart: true
//        04-10 17:01:34.054 I/libprocessgroup(16247): Successfully killed process cgroup uid 10075 pid 26870 in 0ms
//        04-10 17:01:34.054 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.054 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:34.054 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.054 I/Zygote  (16160): Process 26870 exited due to signal (9)
//        04-10 17:01:34.054 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.055 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 7 lines
//        04-10 17:01:34.055 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.055 E/HsmCoreServiceImpl(16772): onTransact in code is: 102
//        04-10 17:01:34.055 I/MediaProcessHandler(16772): processOp opType: 1, uid: 10075, pid: 26870
//        04-10 17:01:34.055 W/MediaProcessHandler(16772): remove target not exist, maybe the UI process: uid: 10075, pid: 26870
//        04-10 17:01:34.055 I/MediaProcessHandler(16772): executedCallBack opType: 1 mMediaStatusObservers.size=0
//        04-10 17:01:34.055 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.056 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 14 lines
//        04-10 17:01:34.056 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.056 W/AwareLog(16855): SmartIO2DMEPlugin: unknown process state: 2
//        04-10 17:01:34.056 I/BoosterSwitchP(16772): notifyUidState do nothing
//        04-10 17:01:34.056 I/DeepNoDisturbP(16772): notifyUidState
//        04-10 17:01:34.056 I/HidataAppQoeP(16772): notifyUidState
//        04-10 17:01:34.056 I/BrowserChrP(16772): notifyUidState
//        04-10 17:01:34.058 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.059 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 8 lines
//        04-10 17:01:34.059 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.062 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9547776,pid=606
//        04-10 17:01:34.062 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2159,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:34.062 I/GRALLOC (  606): 	 iova_size=9547776,conUsg=0xb00,proUsg=0xb00,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:34.066 W/ActivityManager(16247): setHasOverlayUi called on unknown pid: 26870
//        04-10 17:01:34.070 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.071 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 6 lines
//        04-10 17:01:34.071 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.071 I/ViewRootImpl(19535): jank_removeInvalidNode all the node in jank list is out of time
//        04-10 17:01:34.071 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.075 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 32 lines
//        04-10 17:01:34.075 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.079 D/        (  651): doWinFrameOptStatusRecog begin to recog Layer result=2
//        04-10 17:01:34.087 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.091 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 36 lines
//        04-10 17:01:34.091 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.092 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9265152,pid=606
//        04-10 17:01:34.092 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2089,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:34.092 I/GRALLOC (  606): 	 iova_size=9265152,conUsg=0xb00,proUsg=0xb00,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:34.092 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.092 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 2 lines
//        04-10 17:01:34.092 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.096 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9547776,pid=606
//        04-10 17:01:34.096 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2159,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:34.096 I/GRALLOC (  606): 	 iova_size=9547776,conUsg=0xb00,proUsg=0xb00,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:34.103 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.125 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 94 lines
//        04-10 17:01:34.125 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.123 W/dumpsys (28069): type=1400 audit(0.0:92082): avc: denied { read } for name="pipe-max-size" dev="proc" ino=3518953 scontext=u:r:shell:s0 tcontext=u:object_r:proc_pipe_conf:s0 tclass=file permissive=0
//        04-10 17:01:34.136 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.146 V/WindowManager(16247): Exit animation finished in Window{47f527d u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct EXITING}: remove=true
//        04-10 17:01:34.146 E/WindowManager(16247): win=Window{47f527d u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct EXITING} destroySurfaces: appStopped=false win.mWindowRemovalAllowed=true win.mRemoveOnExit=true
//        04-10 17:01:34.147 W/WindowManager(16247): Exception thrown when updateSurfaceStatusSurface(name=com.ndtlg.pettime/com.mdx.framework.activity.IndexAct)/@0xd43d8b7: android.os.DeadObjectException
//        04-10 17:01:34.147 V/WindowManager(16247): postWindowRemoveCleanupLocked: Window{47f527d u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct}
//        04-10 17:01:34.147 W/ActivityManager(16247): setHasOverlayUi called on unknown pid: 26451
//        04-10 17:01:34.147 V/WindowManager(16247): Removing Window{47f527d u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct} from AppWindowToken{cb5efc5 token=Token{eb6163c ActivityRecord{a13802f u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}} mIsExiting=
//        04-10 17:01:34.150 V/WindowManager(16247): removeAppToken: AppWindowToken{5c090f6 token=Token{c48a991 ActivityRecord{b98dc2a u0 com.ndtlg.pettime/com.mdx.framework.activity.TitleAct t311}}} delayed=false Callers=com.android.server.wm.AppWindowToken.removeImmediately:656 com.android.server.wm.AppWindowToken.removeIfPossible:664 com.android.server.wm.AppWindowToken.checkCompleteDeferredRemoval:670 com.android.server.wm.WindowContainer.checkCompleteDeferredRemoval:666
//        04-10 17:01:34.150 V/WindowManager(16247): removeAppToken: AppWindowToken{cb5efc5 token=Token{eb6163c ActivityRecord{a13802f u0 com.ndtlg.pettime/com.mdx.framework.activity.IndexAct t311}}} delayed=false Callers=com.android.server.wm.AppWindowToken.removeImmediately:656 com.android.server.wm.AppWindowToken.removeIfPossible:664 com.android.server.wm.AppWindowToken.checkCompleteDeferredRemoval:670 com.android.server.wm.WindowContainer.checkCompleteDeferredRemoval:666
//        04-10 17:01:34.169 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 92 lines
//        04-10 17:01:34.169 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.169 D/AwareLog(  731): iawared: workingset_process_command subCmd = 351, uid=10157, pid=28012, com.ndtlg.pettime
//        04-10 17:01:34.169 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.169 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 1 line
//        04-10 17:01:34.169 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.169 D/AwareLog(  731): iawared: workingsetPause com.ndtlg.pettime
//        04-10 17:01:34.169 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.223 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 141 lines
//        04-10 17:01:34.223 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.226 I/Pged-IPgedBinderService(  731): ****action is 2, pid num is 5***
//        04-10 17:01:34.226 I/Pged-Freezer(  731): thawPids
//        04-10 17:01:34.227 D/PgedBinderAdapter(16855): unfrz ok, pid: [18851, 24991, 24589, 24609]
//        04-10 17:01:34.321 I/GRALLOC (  606): getCallingPid=651, shrFd=31,fmt=0x1,intFmt=0x200000001,btStrd=4352,size=9547776,pid=606
//        04-10 17:01:34.321 I/GRALLOC (  606): 	 yuv=2,w=1080,h=2159,Stride u=0 v=0,offset u=0 v=0
//        04-10 17:01:34.321 I/GRALLOC (  606): 	 iova_size=9547776,conUsg=0xb00,proUsg=0xb00,	 strd=1088,[afbc]HdrStrd=1088 PyldStrd=69632 Scrmbl=2,ionhnd = 1
//        04-10 17:01:34.336 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.338 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 7 lines
//        04-10 17:01:34.338 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.408 I/TrafficMonitor(16247): update:rxPkts:9,txPkts:12,rxBytes:844,txBytes:1251
//        04-10 17:01:34.408 I/TrafficMonitor(16247): start expired. level:-1
//        04-10 17:01:34.408 I/TrafficMonitor(16247): gettimer:interval=2000
//        04-10 17:01:34.453 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.456 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 7 lines
//        04-10 17:01:34.456 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.484 E/WificondControl(16247): Noise: -92, Snr: 35, Chload: -1
//        04-10 17:01:34.485 D/HwInnerWifiManagerImpl(16247): SupplicantState = COMPLETED
//        04-10 17:01:34.485 D/HwInnerWifiManagerImpl(16247): isPhoneAP = false
//        04-10 17:01:34.506 D/HuaweiWifiWatchdogStateMachine(16247): high data flow: protection_counter = 0,  not_detect_counter = 477
//        04-10 17:01:34.506 D/HuaweiWifiWatchdogStateMachine(16247): high data flow scenario: 0 --> 0 rx bytes =31KB
//        04-10 17:01:34.506 I/HuaweiWifiWatchdogStateMachine(16247): POta txb txg rxg:0, 76, 0. Lr =0% Totpkt=76
//        04-10 17:01:34.507 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.509 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 5 lines
//        04-10 17:01:34.509 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.509 D/HwWifiConnectivityMonitor(16247): ENTER: notifyTopUidTcpInfo, tx = 30, rx = 29, reTx = 0, uid = 10157, tr = 0.0
//        04-10 17:01:34.509 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.509 D/HwWifiConnectivityMonitor(16247): ENTER: notifyTopUidTcpInfo, rtt = 584, rttPkts = 11, aveRtt = 53.090908, app = com.ndtlg.pettime
//        04-10 17:01:34.509 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.509 D/HwUidTcpMonitor(16247): parseWlanUidTcpStatistics lastUidTcpStatInfo = [ mUid = 10157 mPacketName = com.android.packageinstaller mSendSegs = 415 mResendSegs = 0 mRcvSegs = 452 ]
//        04-10 17:01:34.509 D/HwWifiConnectivityMonitor(16247): handleTopUidInternetStatusChanged, uid = 10157, status = 0
//        04-10 17:01:34.509 D/WiFi_PRO(16247): MSG_RETURN_AP_CURRY_RSSI rssi = -50
//        04-10 17:01:34.509 I/QosMonitor(16247): queryRtt: rtt_type = 3
//        04-10 17:01:34.510 I/QosMonitor(16247): postEventFromNative: msg=100,arg1=4,arg2=10
//        04-10 17:01:34.510 I/QosMonitor(16247): postEventFromNative: msg=100,arg1=0,arg2=10
//        04-10 17:01:34.510 I/MQoS    (16247): rtt=188,tcp_tx_pkts=45484,tcp_rx_pkts=87487
//        04-10 17:01:34.510 I/QosMonitor(16247): resetRtt: rtt_type = 3
//        04-10 17:01:34.513 I/HuaweiWifiWatchdogStateMachine(16247): PTcp RTT:188, rtt pkt=29, tcp_rx=34, tcp_tx=39, tcp_reTran=0, rtRate=0
//        04-10 17:01:34.513 I/HuaweiWifiWatchdogStateMachine(16247): judge good link######, goodLinkLevel=3
//        04-10 17:01:34.513 I/HuaweiWifiWatchdogStateMachine(16247): sendResultMsgToQM bssid:08:9b:**:**:0a:34, qoslevel=3
//        04-10 17:01:34.513 I/HuaweiWifiWatchdogStateMachine(16247): link good reported, good base rssi:-50
//        04-10 17:01:34.513 D/WiFi_PRO_WifiProStateMachine(16247): onNetworkQosChange, currentWifiLevel == 3, wifiNoInternet = false, updateUiOnly = true
//        04-10 17:01:34.514 I/MQoS    (16247): QOS_level:0(0),wifi-link;SIM error;use level-0
//        04-10 17:01:34.541 D/StatusBarIconController(16608): setIconVisibility icon is null or visibility not change visibility=false
//        04-10 17:01:34.542 I/chatty  (16608): uid=10030(com.huawei.desktop.systemui) com.android.systemui identical 1 line
//        04-10 17:01:34.543 D/StatusBarIconController(16608): setIconVisibility icon is null or visibility not change visibility=false
//        04-10 17:01:34.543 I/Tile.WifiTile(16608): setWifiIndicators  CallbackInfo = CallbackInfo[enabled=true,connected=true,wifiSignalIconId=2131231764,enabledDesc="tinypace-lab",activityIn=false,activityOut=true,wifiSignalContentDescription=WLAN 淇″彿寮哄害婊℃牸銆俔
//        04-10 17:01:34.555 I/audio_hw_primary(16169): usb_ext_get_parameters: check show hires (false)
//        04-10 17:01:34.556 I/hash_map_utils(16163): key: 'typec_need_show_hires' value: ''
//        04-10 17:01:34.557 I/HwAudioServiceEx(16247): check HiRes Icon false
//        04-10 17:01:34.558 W/ActivityManager(16247): Sending non-protected broadcast huawei.intent.action.hideHiResIcon from system 16247:system/1000 pkg android
//        04-10 17:01:34.558 W/ActivityManager(16247): Sending non-protected broadcast huawei.intent.action.hideHiResIcon from system 16247:system/1000 pkg android
//        04-10 17:01:34.559 D/StatusBarIconController(16608): setIconVisibility icon is null or visibility not change visibility=false
//        04-10 17:01:34.568 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.685 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 16 lines
//        04-10 17:01:34.685 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:34.945 D/HwWifiStatStore(16816): handleMessage : 200
//        04-10 17:01:35.017 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:35.020 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 7 lines
//        04-10 17:01:35.020 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:35.025 D/ZrHung.AppEyeUiProbe(25572): Current Activity:false
//        04-10 17:01:35.025 D/ZrHung.AppEyeUiProbe(25572): not watching, wait.
//        04-10 17:01:35.128 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:35.129 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 7 lines
//        04-10 17:01:35.129 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:35.437 I/Net.5085NetworkSpeedMan(16608): mIsStop = false
//        04-10 17:01:35.437 I/Net.5086NetworkSpeedMan(16608):  runInThread getTetherStats
//        04-10 17:01:35.442 I/Net.5086NetworkSpeedMan(16608):  runInUI refreshSpeed
//        04-10 17:01:35.443 I/Net.5086NetworkSpeedMan(16608): value=698.3333speed = 698
//        04-10 17:01:35.443 I/Net.5086NetworkSpeedMan(16608): B/smIsShowLastSpeedValuefalse
//        04-10 17:01:35.443 I/NetworkSpeedView(16608): /update(), speed=698
//        04-10 17:01:35.443 I/NetworkSpeedView(16608): B/s
//        04-10 17:01:35.445 I/chatty  (16608): uid=10030(com.huawei.desktop.systemui) com.android.systemui identical 1 line
//        04-10 17:01:35.445 I/NetworkSpeedView(16608): /update(), speed=698
//        04-10 17:01:35.445 I/NetworkSpeedView(16608): B/s
//        04-10 17:01:35.462 W/HwKeyguardDragHelper(16608): AnimationBlocked
//        04-10 17:01:35.475 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:35.544 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 43 lines
//        04-10 17:01:35.544 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:35.544 D/StatusBarIconController(16608): setIconVisibility icon is null or visibility not change visibility=false
//        04-10 17:01:35.544 E/ndroid.systemu(16608): Invalid ID 0x00000000.
//        04-10 17:01:35.545 E/HwNotchUtils(16608): setIconForView iconId is not found
//        04-10 17:01:35.545 D/StatusBarIconController(16608): setIconVisibility icon is null or visibility not change visibility=false
//        04-10 17:01:35.545 E/ndroid.systemu(16608): Invalid ID 0x00000000.
//        04-10 17:01:35.545 E/HwNotchUtils(16608): setIconForView iconId is not found
//        04-10 17:01:35.545 D/StatusBarIconController(16608): setIconVisibility icon is null or visibility not change visibility=false
//        04-10 17:01:35.545 E/ndroid.systemu(16608): Invalid ID 0x00000000.
//        04-10 17:01:35.545 E/HwNotchUtils(16608): setIconForView iconId is not found
//        04-10 17:01:35.545 I/Tile.WifiTile(16608): setWifiIndicators  CallbackInfo = CallbackInfo[enabled=true,connected=true,wifiSignalIconId=2131231764,enabledDesc="tinypace-lab",activityIn=false,activityOut=false,wifiSignalContentDescription=WLAN 淇″彿寮哄害婊℃牸銆俔
//        04-10 17:01:35.558 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:35.656 I/chatty  (  651): uid=1000(system) /system/bin/surfaceflinger identical 61 lines
//        04-10 17:01:35.656 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
//        04-10 17:01:35.655 W/dumpsys (28073): type=1400 audit(0.0:92083): avc: denied { read } for name="pipe-max-size" dev="proc" ino=3518953 scontext=u:r:shell:s0 tcontext=u:object_r:proc_pipe_conf:s0 tclass=file permissive=0
//        04-10 17:01:35.672 D/Layer   (  651): Skip in Layer::computeScreenBounds 1
