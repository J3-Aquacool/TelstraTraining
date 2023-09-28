FROM openjdk:8
EXPOSE 8080
ADD target/springbootgit.jar springbootgit.jar
ENTRYPOINT [ "java","-jar","/springbootgit.jar" ]