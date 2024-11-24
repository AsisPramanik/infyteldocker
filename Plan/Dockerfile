FROM openjdk:17.0.1-jdk-slim
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 8400
ENTRYPOINT ["java","-cp","app:app/lib/*","com.infosys.infytel.plan.InfytelPlanApplication"] 