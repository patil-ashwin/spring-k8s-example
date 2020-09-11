FROM openjdk:8-jre
VOLUME /tmp
WORKDIR /data
COPY target/spring-k8s-example  /data
EXPOSE 8090
ENTRYPOINT ["java" ,"-jar", "spring-k8s-example"]