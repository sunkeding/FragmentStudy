# Activity与Fragment生命周期
## 条件
1、MainActivity的onCreate动态加载一个ExampleFragment

2、测试机型：华为P20
## 一、打开新的Activity生命周期
- MainActivity onCreate
- ExampleFragment onAttach
- ExampleFragment onCreate
- ExampleFragment onCreateView
- ExampleFragment onActivityCreated
- ExampleFragment onStart
- MainActivity onStart
- MainActivity onResume
- ExampleFragment onResume

## 二、MainActivity打开新页面SecondActivity
- ExampleFragment onPause
- MainActivity onPause
- SecondActivity onCreate
- SecondActivity onStart
- SecondActivity onResume
- ExampleFragment onStop
- MainActivity onStop

## 三、关闭SecondActivity,回到MainActivity
- SecondActivity onPause
- MainActivity onRestart
- ExampleFragment onStart
- MainActivity onStart
- MainActivity onResume
- ExampleFragment onResume
- SecondActivity onStop
- SecondActivity onDestroy

## 四、关闭MainActivity生命周期
- ExampleFragment onPause
- MainActivity onPause
- ExampleFragment onStop
- MainActivity onStop
- ExampleFragment onDestroyView
- ExampleFragment onDestroy
- ExampleFragment onDetach
- MainActivity onDestroy

## 五、MainActivity弹出、关闭弹窗
都是不影响MainActivity和Fragment的生命周期

## 六、MainActivity按下Home键回到桌面
- ExampleFragment onPause
- MainActivity onPause
- ExampleFragment onStop
- MainActivity onStop

## 七、从后台切回MainActivity
- MainActivity onRestart
- ExampleFragment onStart
- MainActivity onStart
- MainActivity onResume
- ExampleFragment onResume

## 生命周期相关总结
### 1、Fragment所在Activity的生命周期会直接影响Fragment的生命周期，其表现为，Activity的每次生命周期回调都会引发每个Fragment的类似回调。
例如，当 Activity 收到 onPause() 时，Activity 中的每个片段也会收到 onPause()。不过从实验来看Activity和Fragment的onPause()到底哪个先执行是没有定论的。
### 2、片段还有几个额外的生命周期回调，用于处理与 Activity 的唯一交互，从而执行构建和销毁片段界面等操作。这些额外的回调方法是：
- onAttach()
在片段已与 Activity 关联时进行调用（Activity 传递到此方法内）。
- onCreateView()
调用它可创建与片段关联的视图层次结构。
- onActivityCreated()
当 Activity 的 onCreate() 方法已返回时进行调用。
- onDestroyView()
在移除与片段关联的视图层次结构时进行调用。
- onDetach()
在取消片段与 Activity 的关联时进行调用。

## 文章Demo
https://github.com/sunkeding/FragmentStudy
## 参考资料
- [官方文档](https://developer.android.com/guide/components/fragments?hl=zh-cn#top_of_page)
- [Complete Android Fragment & Activity Lifecycle](https://github.com/xxv/android-lifecycle/)







