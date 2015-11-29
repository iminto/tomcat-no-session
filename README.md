# tomcat-no-session
针对tomcat的no session方案。This project is to fully disable session in tomcat.

为什么需要这个方案呢？因为tomcat在启动时就会创建一个session，当会话越多的时候，session也就越多。而session在tomcat中属于重量级对象。一个没有任何内容的空session就需要消耗1.5K的内存存储空间。即使在JSP中使用了session=false禁用了session，也仅仅是针对当前JSP页面而言。
另外，在集群中，session共享也会增加系统的复杂性。即使用了redis存储共享session，依然会产生复杂性和其他问题。

##没有了session怎么办
用cookie啊！并且天然分布式。

##使用方法
配置context.xml
```XML
<Manager className="org.apache.catalina.DefaultManager.DefaultSessionManager" />
```
别问我为什么要取DefaultSessionManager这个名字...
当然，也可以配置在server.xml的context节点里，全局和局部的区别。
