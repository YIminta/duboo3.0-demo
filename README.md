# Dubbo3.0-demo

转自 https://www.yuque.com/renyong-jmovm/dadudu/pl9i3u#yE806

### Dubbo3.0新特性介绍&&配置dubbo和rest协议

#### 注册模型的改变
在服务注册领域，市面上有两种模型，一种是应用级注册，一种是接口级注册，在Spring Cloud中，一个应用是一个微服务，而在Dubbo2.7中，一个接口是一个微服务。

所以，Spring Cloud在进行服务注册时，是把应用名以及应用所在服务器的IP地址和应用所绑定的端口注册到注册中心，相当于key是应用名，value是ip+port，而在Dubbo2.7中，是把接口名以及对应应用的IP地址和所绑定的端口注册到注册中心，相当于key是接口名，value是ip+port。

所以在Dubbo2.7中，一个应用如果提供了10个Dubbo服务，那么注册中心中就会存储10对keyvalue，而Spring Cloud就只会存一对keyvalue，所以以Spring Cloud为首的应用级注册是更加适合的。

所以Dubbo3.0中将注册模型也改为了应用级注册，提升效率节省资源的同时，通过统一注册模型，也为各个微服务框架的互通打下了基础。

#### 新一代RPC协议
定义了全新的 RPC 通信协议 – Triple，一句话概括 Triple：它是基于 HTTP/2 上构建的 RPC 协议，完全兼容 gRPC，并在此基础上扩展出了更丰富的语义。 使用 Triple 协议，用户将获得以下能力

1. 更容易到适配网关、Mesh架构，Triple 协议让 Dubbo 更方便的与各种网关、Sidecar 组件配合工作。
2. 多语言友好，推荐配合 Protobuf 使用 Triple 协议，使用 IDL 定义服务，使用 Protobuf 编码业务数据。
3. 流式通信支持。Triple 协议支持 Request Stream、Response Stream、Bi-direction Stream
