# open_nsfw_android
[![](https://jitpack.io/v/devzwy/open_nsfw_android.svg)](https://jitpack.io/#devzwy/open_nsfw_android) [![](https://img.shields.io/badge/Base-TensorFlow-brightgreen.svg)](https://github.com/devzwy/open_nsfw_android) [![](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![](https://img.shields.io/badge/%E4%BD%9C%E8%80%85-赵文贇-orange.svg)](https://github.com/devzwy/open_nsfw_android) [![](https://img.shields.io/badge/QQ-3648415-brightgreen.svg)](https://github.com/devzwy/KUtils) [![](https://img.shields.io/badge/微信-admin_zwy-brightgreen.svg)](https://github.com/devzwy/open_nsfw_android) [![](https://img.shields.io/badge/Mail-dev_zwy@aliyun.com-green.svg)](https://github.com/devzwy/open_nsfw_android) ![Mozilla Add-on](https://img.shields.io/amo/stars/dustman.svg?label=stars&logo=1&logoColor=1&style=popout)

### 色情图片离线识别，基于TensorFlow实现。识别只需200ms,可断网测试，成功率99%，调用只要一行代码，从雅虎的开源项目open_nsfw_python移植，tflite（6M）为训练好的模型，该模型文件可用于iOS、java、C++等平台

### 使用
- Add it in your root build.gradle at the end of repositories:
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

- Add the dependency [![](https://jitpack.io/v/devzwy/open_nsfw_android.svg)](https://jitpack.io/#devzwy/open_nsfw_android)

```
	dependencies {
	         //versionCode：上面小icon中最新版本号
	        implementation 'com.github.devzwy:open_nsfw_android:[versionCode]'
	}

```

- Code like this

```
   val nsfwBean = NsfwHelper.getInstance(this, true, 1).scanBitmapSyn(bitmap)
   nsfwBean?.sfw ...
   nsfwBean?.nsfw ...
```

- 项目打包时请使用如下代码确定你使用的ndk，否则会打包全部类型的库文件，导致项目异常庞大
```
    ndk {
                abiFilters 'armeabi-v7a'
            }
```
### [点我下载apk(arm+x86)](https://fir.im/nsfw)

### 扫码下载

![图片](https://github.com/devzwy/open_nsfw_android/blob/master/img/2.png)

## 提示：下面的图片不要在公共场所打开！！！
## 提示：下面的图片不要在公共场所打开！！！
## 提示：下面的图片不要在公共场所打开！！！

### Demo运行结果(后期手动打码防止屏蔽)：

![图片](https://github.com/devzwy/open_nsfw_android/blob/master/img/1.png)