各模块职责定位：

health_parent：父工程，打包方式为pom，统一锁定依赖的版本，同时聚合其他子模块便于统一执行maven命令

health_common：通用模块，打包方式为jar，存放项目中使用到的一些工具类和常量类

health_pojo：打包方式为jar，存放实体类和返回结果类等

health_dao：持久层模块，打包方式为jar，存放Dao接口和Mapper映射文件等

health_interface：打包方式为jar，存放服务接口

health_service：Dubbo服务模块，打包方式为war，存放服务实现类，作为服务提供方，需要部署到tomcat运行

health_web：打包方式为war，作为Dubbo服务消费方，存放Controller、HTML页面、js、css、spring配置文件等，需要部署到tomcat运行
