## Maven依赖管理
* Maven 项目中依赖包的载入，是按照父工程---》子工程排序的
* 有两种方式（个人总结）
* 1、父模块统一声明引用依赖包，子模块则无需在手动声明引用
> 缺点：依赖包在项目中全部统一到父工程，不利于聚合工程中各子模块中依赖包的管理（减少冗余）
> 优点（相对）：在简单的demo项目中无需对包进行过多管理
* 2、父模块使用依赖管理器来声明管理所有依赖包版本，在交由子模块声明引用
> 优点：统一管理所有依赖包版本，利于之后的维护、利于开发者优化审查与代码
> 阅读。缓解了maven继承的压力
> 缺点：目前未知

**参考来源**：https://blog.csdn.net/zhongxi7860/article/details/82318913


## Maven聚合（分模块项目、多模块项目）
>  Maven聚合项目核心 maven指令的使用、Maven依赖关系的理解

maven聚合来源：https://blog.csdn.net/zhongxi7860/article/details/82318913
* ####关于application.yml/properties文件
> 在一个maven项目中，不论是聚合项目，还是普通项目，
> 都有且只能有一个application.yml/properties配置文件会生效
> 如在项目中创建多个该文件，则按照优先级的首个配置文件生效

* #### 多个application.yml/properties文件的配置
> 若想要在聚合项目中的每一个单独的子模块都要一个配置文件
> 则需要在application.yml/properties文件中使用 
> spring.profile.active = xxx(xxx其他文件的application-xxx后缀)
> 来指定其他配置文件生效
> 参考来源：https://blog.csdn.net/u012988901/article/details/83024406

* #### 模块之间关系
> 1、父子：继承   
> 关系作用：父模块与子模块之间的依赖包的继承等
> 该关系中，父模块占主动，子模块被动继承。
> 2、兄弟（同级）：包含
> 同级模块（子模块--子模块）之间的相互声明引用
> 该关系中由于双方是平级关系，相互为包含关系。


