# AJLog

## 测试模块开发模式



## 如何添加到AndroidStudio

**Step 1. 添加JitPack仓库**

在当前项目等根目录下的 `build.gradle` 文件中添加如下内容:

``` gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

**Step 2. 添加项目依赖**

``` gradle
dependencies {
        compile 'com.github.aijun198600:AJLog:1.0.0'
}
```