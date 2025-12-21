# 使用官方OpenJDK 8作为基础镜像
FROM openjdk:8u141

# 设置工作目录
WORKDIR /app

# 设置时区为东八区
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone

# 复制JAR文件到容器中
COPY target/OnlineStore_Backend-V1.0.jar app.jar

# 创建应用运行所需的目录
RUN mkdir -p /app/logs

# 暴露端口
EXPOSE 8888

# 设置JVM参数
ENV JAVA_OPTS="-Xmx512m -Xms256m -XX:+UseG1GC -Dfile.encoding=UTF-8"

# 启动应用
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]