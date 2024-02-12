# Используем официальный образ OpenJDK
FROM openjdk:17-jdk-alpine

# Установка переменных окружения
ENV TOMCAT_MAJOR_VERSION=9
ENV TOMCAT_VERSION=9.0.83

# Установка Tomcat
RUN wget -q https://archive.apache.org/dist/tomcat/tomcat-${TOMCAT_MAJOR_VERSION}/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz && \
    tar -xzf apache-tomcat-${TOMCAT_VERSION}.tar.gz -C /opt && \
    rm apache-tomcat-${TOMCAT_VERSION}.tar.gz && \
    ln -s /opt/apache-tomcat-${TOMCAT_VERSION} /opt/tomcat && \
    rm -rf /opt/tomcat/webapps/*

# Копирование war-файла приложения в Tomcat
COPY target/topjava.war /opt/tomcat/webapps/topjava.war

# Экспозиция порта
EXPOSE 8080

# Запуск Tomcat
CMD ["/opt/tomcat/bin/catalina.sh", "run"]