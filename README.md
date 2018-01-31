# MyLibrary

这是我个人封装维护的快速开发 lib。

为什么要建立自己的 lib？

现在网上有很多此种类型的 lib，但是别人的终究是别人的，只有自己认真总结，自己熟悉的 lib 用起来才更加顺手，效率高。

所以我就封装了这样一个 lib，供自己快速开发使用。

我会认真的维护，关于一些具体类的使用，我一般会在 [AndroidCode](https://github.com/smartsean/AndroidCode) 这个实战项目中使用，有兴趣的可以去看下。

我不建议直接拿别人的工具类去用，也包括我的这个，我认为每个人都应该属于自己的一个快速开发包。但是如果你现在没时间去整理，那么你也可以先用下我的这个工具类。

我已经部署到 JCenter，可以很方便的通过 Gradle 快速集成：

``` java
implementation 'cn.smartsean:lib:0.0.4'
```

主要内容：

## 一、工具类

#### [正则判断工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/RegexUtils.java)
主要提供了各种正则匹配，有常用的正则，也可自定义正则验证

#### [快速数学计算工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/AndroidMath.java)

#### [相机工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/CameraUtils.java)

#### [数据验证、取值工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/DataUtils.java)

#### [日期工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/DateUtils.java)

#### [Java小数操作](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/DecimalUtils.java)

#### [单位转换工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/DensityUtils.java)

#### [设备信息工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/DeviceUtils.java)

#### [退出app工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/ExitUtil.java)

#### [Android 7.0适配工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/FileProviderNAdapter.java)

#### [键盘操作工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/KeyBoardUtil.java)

#### [简单日志打印工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/Logger.java)

#### [网络相关工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/NetWorkUtils.java)

#### [获取资源信息工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/ResourceUtils.java)

#### [给布局增加涟漪效果的工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/RippleLayoutUtil.java)

#### [SharedPreferences工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/SPUtils.java)

#### [Toast工具类](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/utils/ToastUtil.java)


## 二、自定义

#### [RecyclerView的分割线](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/widget/recyclerview/RecyclerItemDivider.java)

#### [带下划线的EditText](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/widget/LineEditText.java)

#### [比ToolBar更好用的TitleBar](https://github.com/smartsean/MyLibrary/blob/master/SeanLib/src/main/java/cn/smartsean/lib/widget/common/TitleBar.java)

#### [BaseDialogFragment](https://juejin.im/post/5a6f032ef265da3e377c4a49)
我自己封装的 BaseDialogFragment，可以快速的使用 Builder 构建你的 Dialog，具体见 [一步一步使用 DialogFragment 封装链式调用 Dialog](https://juejin.im/post/5a6f032ef265da3e377c4a49)

#### []()


