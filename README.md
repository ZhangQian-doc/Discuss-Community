仿照牛客网实现的论坛社区，实现了基本的注册发帖，登录，发帖，评论，点赞，回复功能，同时使用前缀树实现敏感词过滤，并实现网站数据统计。
技术细节： 使用Spring Security 做权限控制，替代拦截器的拦截控制。 使用Redis的set实现点赞，zset实现关注，并使用Redis存储登录ticket和验证码。 使用Redis高级数据类型HyperLogLog统计UV,使用Bitmap统计DAU。 使用Kafka处理发送评论、点赞和关注等系统通知，构建了异步消息系统。 使用Elasticsearch实现全局搜索，并通过事件封装，增加关键词高亮显示等功能。 实现热帖排行模块，使用分布式缓存Redis和本地缓存Caffeine作为多级缓存，将QPS提升了20倍，大大提升了网站访问速度，并使用Quartz定时更新热贴排行。

技术架构：Spring Boot、SSM(Spring、Spring MVC、MyBatis)、Redis、Kafka、 Elasticsearch。
