
# HanLP-Android

基于HanLP移植至Android平台，实现汉字转拼音功能(支持多音字)，该工程为Java项目，使用时可以导出jar文件，再引用到Android工程中

##使用说明：
###1、将生成的jar文件拷贝到app/libs目录下，将HanLP-Android工程下dictionary目录拷贝至Android项目app module的assets目录下

###2、修改app module的build.gradle文件：
```
android {
    ...
    sourceSets {
        main {
            res.srcDirs = ['src/main/res', 'src/main/res/xml']
            jni.srcDirs = []
            jniLibs.srcDirs = ['libs']
        }
    }
    ...
}

dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    compile files('libs/hanlp1.5.2_android.jar')
}
```

###3、代码中调用：
```
HanLP.convertToPinyinFirstCharString("重庆银行", "", true).toUpperCase();
```

#版权
Apache License Version 2.0

本项目代码基于HanLP项目源码进行修改，地址：https://github.com/hankcs/HanLP
