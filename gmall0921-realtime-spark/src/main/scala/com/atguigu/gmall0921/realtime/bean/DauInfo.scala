package com.atguigu.gmall0921.realtime.bean

/**
 *这里的结构就是针对当前的业务场景
 */
case class DauInfo(
                      mid: String,
                      uid: String,
                      ar: String,
                      ch: String,
                      vc: String,
                      var dt: String,
                      var hr: String,
                      ts: Long) {
}