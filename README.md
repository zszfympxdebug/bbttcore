# BBTTCORE

## 一个无政府服务器插件
## 包含功能
### 鞘翅限速
___此功能可能出现bug 谨慎使用___       
通过每一刻玩家移动的距离来达到限速的目的
### 鸡刷
当玩家右键鸡时会掉落玩家手中的物品
#### 权限
bbttcore.superchicken.use       
可以使用luckperms等插件来管理
#### 注意事项
玩家一直使用此功能可能会导致tps骤降，请适当更改cd
### 指令刷
当玩家输入/dupe时会生成玩家手中的物品到背包内
#### 权限
bbttcore.commandDupe.dupe.use		
可以使用luckperms等插件来管理
#### 注意事项
请注意物资泛滥问题(spammer可以一直刷)
### 发射器刷
将物品放入发射器，激活后有概率会刷新物资
#### 注意事项
注意红石高频问题
### 其他功能
入服op检测
/help 覆写(未完成)
/kill 自杀(未完成)

## 关于作者
dev: zszf(扣扣：2792668017 开学可能不会回复)

## 构建
```shell
.\gradlew.bat clean shadowJar
```
第一次构建会下载依赖      
构建后文件在根目录\build\libs\bbttcore.jar       
如果不会构建可从release里获取（不是最新版）

可以对源码进行二次修改、分发，可以用作盈利形行为        
（要是用在谁服务器告诉下，我去玩玩 doge）

