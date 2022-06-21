package com.zww.sample

import android.app.Application
import android.widget.Toast
import io.github.devzwy.nsfw.NSFWHelper

class KtApp : Application() {
    override fun onCreate() {
        super.onCreate()

        //开启日志输出，可选
        NSFWHelper.openDebugLog()

        //扫描前必须初始化
        NSFWHelper.initHelper(
            context = this)

        //初始化api原型
        /* NSFW初始化函数 内部日志默认关闭，调试环境可使用openDebugLog()开启日志*/
//        fun initHelper(
//            context: Context, //建议传入application,传入activity可能会有内存泄漏
//            modelPath: String? = null,//模型文件路径，为空时将默认从Assets下读取
//            isOpenGPU: Boolean = true, //是否开启GPU扫描加速，部分机型兼容不友好的可关闭。默认开启
//            numThreads: Int = 4 //扫描数据时内部分配的线程 默认4
//        )
    }
}
//2022-06-15 14:02:04 add ~
//2022-06-15 14:03:04 add ~
//2022-06-15 14:04:04 add ~
//2022-06-15 14:05:05 add ~
//2022-06-15 14:06:04 add ~
//2022-06-15 14:07:04 add ~
//2022-06-15 14:08:32 add ~
//2022-06-15 14:09:04 add ~
//2022-06-15 16:00:04 add ~
//2022-06-16 00:00:04 add ~
//2022-06-16 08:00:04 add ~
//2022-06-16 16:00:04 add ~
//2022-06-17 00:00:04 add ~
//2022-06-17 08:00:04 add ~
//2022-06-17 16:00:04 add ~
//2022-06-18 00:00:05 add ~
//2022-06-18 08:00:05 add ~
//2022-06-18 16:00:04 add ~
//2022-06-19 00:00:04 add ~
//2022-06-19 08:00:04 add ~
//2022-06-19 16:00:04 add ~
//2022-06-20 00:00:04 add ~
//2022-06-20 08:00:05 add ~
//2022-06-20 16:00:04 add ~
//2022-06-21 00:00:04 add ~
//2022-06-21 08:00:04 add ~
//2022-06-21 16:00:05 add ~
//2022-06-22 00:00:04 add ~
