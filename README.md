# tomcat-no-session
针对tomcat的nosession方案

为什么需要这个方案呢？因为tomcat在启动时就会创建一个session，当会话越多的时候，session也就越多。而session在tomcat中属于重量级
对象。一个没有任何对象的空的session就需要消耗1.5K的内存空间。即使在JSP中使用了session=false禁用了session，也仅仅是针对当前
JSP页面而言。
另外，在集群中，session共享也会增加系统的复杂性。即使用了redis存储共享session，依然会产生复杂性和其他问题。

##没有了session怎么办
用cookie啊！天然分布式。
